package org.uic.barcode.test;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.SignatureException;
import java.util.zip.DataFormatException;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Before;
import org.junit.Test;
import org.uic.barcode.Decoder;
import org.uic.barcode.Encoder;
import org.uic.barcode.dynamicFrame.Constants;
import org.uic.barcode.logger.LoggerFactory;
import org.uic.barcode.ssbFrame.SsbFrame;
import org.uic.barcode.test.utils.SsbTicketFactory;
import org.uic.barcode.ticket.EncodingFormatException;

/**
 * The Class StaticFrameBarcodeTest.
 */
public class SsbFrameBarcodeTestReservation {
	
	/** The algorithm OID. */
	public String algorithmOID = Constants.DSA_SHA224;
	
	public int keySize = 1024;
	
	/** The key pair. */
	public KeyPair keyPair = null;
	
	
	public SsbFrame ssbFrame = null;

	
	/**
	 * Initialize.
	 * 
	 *  set the signature algorithm
	 *  generate a key pair
	 *  set the test content
	 *  for ticket and layout
	 */
	@Before public void initialize() {
		
		LoggerFactory.setActivateConsoleLog(true);

		algorithmOID = Constants.DSA_SHA224;
		keySize = 1024;
		
		Security.addProvider(new BouncyCastleProvider());

		try {
			keyPair  = generateDSAKeys(keySize);
		} catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidAlgorithmParameterException e) {
			e.printStackTrace();
		}

        assert(keyPair != null);
        
	}
	
	



	/**
	 * Test ssb pass encoding.
	 */
	@Test public void testSsbEncoding() {

				
		Encoder enc = null;

		try {
			enc = new Encoder(null, null, Encoder.UIC_BARCODE_TYPE_SSB, 0, 0);
		} catch (IOException | EncodingFormatException e1) {
			assert(false);
		}
		
		enc.setSsbFrame(SsbTicketFactory.getSsbReservation());
		
		assert(enc != null);
		
		try {
			enc.signLevel1("1080", keyPair.getPrivate(), algorithmOID, "1");
		} catch (Exception e) {
			assert(false);
		}
		
        byte[] encoded = null;
		try {
			encoded = enc.encode();
		} catch (Exception e) {
			assert(false);
		}
        
        assert(encoded != null);
        
        assert(encoded.length == 114);

	}
	
	/**
	 * Test dynamic header barcode decoding.
	 */
	@Test public void testSsbDecoding() {
		
		

					
		Encoder enc = null;

		try {
			enc = new Encoder(null, null, Encoder.UIC_BARCODE_TYPE_SSB, 1, 0);
		} catch (IOException | EncodingFormatException e1) {
			assert(false);
		}
		
		enc.setSsbFrame( SsbTicketFactory.getSsbReservation());
		
		assert(enc != null);
		
		try {
			enc.signLevel1("4711", keyPair.getPrivate(), algorithmOID, "1");
		} catch (Exception e) {
			assert(false);
		}
		
			
        byte[] encoded = null;
		try {
			encoded = enc.encode();
		} catch (Exception e) {
			assert(false);
		}
        
        assert(encoded != null);
		
        Decoder dec = null;
		try {
			dec = new Decoder(encoded);
		} catch (IOException e) {
			assert(false);
		} catch (EncodingFormatException e) {
			assert(false);
		} catch (DataFormatException e) {
			assert(false);
		}
		assert(dec != null);
        
        int signatureCheck = 0;
		try {
			signatureCheck = dec.validateLevel1(keyPair.getPublic(),algorithmOID);
		} catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException | IllegalArgumentException
				| UnsupportedOperationException | IOException | EncodingFormatException e) {
			assert(false);
		}
		
        assert(signatureCheck == Constants.LEVEL1_VALIDATION_OK);
        
        assert(dec.getSsbFrame() != null);

        assert(dec.getSsbFrame().getHeader() != null);
        
        SsbFrame ref = SsbTicketFactory.getSsbReservation();
        
        assert(dec.getSsbFrame().getHeader().getKeyId() == 1);
        assert(dec.getSsbFrame().getHeader().getIssuer() == 4711);
        assert(dec.getSsbFrame().getHeader().getTicketType().equals(ref.getHeader().getTicketType()));
        assert(dec.getSsbFrame().getHeader().getVersion() == 1);
                
        assert(dec.getSsbFrame().getReservationData() != null);
        
        assert(dec.getSsbFrame().getReservationData().getClassCode().equals(ref.getReservationData().getClassCode()));
        assert(dec.getSsbFrame().getReservationData().isSpecimen() == ref.getReservationData().isSpecimen());
        assert(dec.getSsbFrame().getReservationData().getCoach() == ref.getReservationData().getCoach());
        assert(dec.getSsbFrame().getReservationData().getDepartureDate() == ref.getReservationData().getDepartureDate());
        assert(dec.getSsbFrame().getReservationData().getDepartureTime() == ref.getReservationData().getDepartureTime());
        
        
        assert(dec.getSsbFrame().getReservationData().getStations() != null);
        
        SsbTicketFactory.compareStations(dec.getSsbFrame().getReservationData().getStations(),  ref.getReservationData().getStations());
        
        SsbTicketFactory.compareCommonTicketPart(dec.getSsbFrame().getReservationData(), ref.getReservationData());
        

        assert(dec.getSsbFrame().getReservationData().getPlace().equals(ref.getReservationData().getPlace()));
        assert(dec.getSsbFrame().getReservationData().getTicketSubType() == ref.getReservationData().getTicketSubType());
        assert(dec.getSsbFrame().getReservationData().getTrain().equals(ref.getReservationData().getTrain()));
        assert(dec.getSsbFrame().getReservationData().isOverbooking() == ref.getReservationData().isOverbooking());
        
        assert(dec.getSsbFrame().getReservationData().getInfoCode() == ref.getReservationData().getInfoCode());
        assert(dec.getSsbFrame().getReservationData().getText().equalsIgnoreCase(ref.getReservationData().getText()));
        


	}	
	
	/**
	 * Generate DSA keys.
	 *
	 * @return the key pair
	 * @throws NoSuchAlgorithmException the no such algorithm exception
	 * @throws NoSuchProviderException the no such provider exception
	 * @throws InvalidAlgorithmParameterException the invalid algorithm parameter exception
	 */
	public KeyPair generateDSAKeys(int keySize)  throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException{
		    KeyPairGenerator g = KeyPairGenerator.getInstance("DSA", "BC");
		    g.initialize(keySize, new SecureRandom());
		    return g.generateKeyPair();	    
	}

}
