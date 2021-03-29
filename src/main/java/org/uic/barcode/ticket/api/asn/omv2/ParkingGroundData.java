/*
 *   This file was generated by openASN.1 - an open source ASN.1 toolkit for java
 *
 *   openASN.1 is Copyright (C) 2007 Clayton Hoss, Marc Weyland
 *
 *   openASN.1 is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as
 *   published by the Free Software Foundation, either version 3 of
 *   the License, or (at your option) any later version.
 *
 *   openASN.1 is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with openASN.1. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.uic.barcode.ticket.api.asn.omv2;

import java.util.Date;

import org.uic.barcode.asn1.datatypes.Asn1BigInteger;
import org.uic.barcode.asn1.datatypes.Asn1Default;
import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.CharacterRestriction;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.HasExtensionMarker;
import org.uic.barcode.asn1.datatypes.IntRange;
import org.uic.barcode.asn1.datatypes.RestrictedString;
import org.uic.barcode.asn1.datatypes.Sequence;
import org.uic.barcode.ticket.api.utils.DateTimeUtils;

@Sequence
@HasExtensionMarker
public class ParkingGroundData extends Object {
	public ParkingGroundData() {
	}

	@FieldOrder(order = 0)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String referenceIA5;

	@FieldOrder(order = 1)
	@Asn1Optional public Asn1BigInteger referenceNum;

	@FieldOrder(order = 2)
	@RestrictedString(CharacterRestriction.IA5String)
	public String parkingGroundId = "";

	@FieldOrder(order = 3)
	@IntRange(minValue=0,maxValue=370)
	@Asn1Optional public Long fromParkingDate;

	@FieldOrder(order = 4)
	@IntRange(minValue=0,maxValue=370)
	@Asn1Optional public Long toParkingDate;

	@FieldOrder(order = 5)
	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long productOwnerNum;

	@FieldOrder(order = 6)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productOwnerIA5;

	@FieldOrder(order = 7)
	@IntRange(minValue=0,maxValue=65535)
	@Asn1Optional public Long productIdNum;

	@FieldOrder(order = 8)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productIdIA5;

	@FieldOrder(order = 9)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String accessCode;

	@FieldOrder(order = 10)
	@RestrictedString(CharacterRestriction.UTF8String)
	public String location;

	@FieldOrder(order = 11)
	@Asn1Default("stationUIC")
	@Asn1Optional public CodeTableType stationCodeTable;

	@FieldOrder(order = 12)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long stationNum;

	@FieldOrder(order = 13)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String stationIA5;

	@FieldOrder(order = 14)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String specialInformation;

	@FieldOrder(order = 15)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String entryTrack;

	@FieldOrder(order = 16)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String numberPlate;
	
	@FieldOrder(order = 17)
	@Asn1Optional Asn1BigInteger price;
	
	@FieldOrder(order = 18)
	@Asn1Optional SequenceOfVatDetail vatDetails;

	@FieldOrder(order = 19)
	@Asn1Optional public ExtensionData extension;
	

	

	public String getReferenceIA5() {

		return this.referenceIA5;
	}

	public Asn1BigInteger getReferenceNum() {

		return this.referenceNum;
	}

	public String getParkingGroundId() {

		return this.parkingGroundId;
	}

	public Long getFromParkingDate() {

		return this.fromParkingDate;
	}

	public Long getToParkingDate() {

		return this.toParkingDate;
	}

	public Long getProductOwnerNum() {

		return this.productOwnerNum;
	}

	public String getProductOwnerIA5() {

		return this.productOwnerIA5;
	}

	public Long getProductIdNum() {

		return this.productIdNum;
	}

	public String getProductIdIA5() {

		return this.productIdIA5;
	}

	public String getAccessCode() {

		return this.accessCode;
	}

	public String getLocation() {

		return this.location;
	}

	public CodeTableType getStationCodeTable() {

		if (stationCodeTable == null) {
			return CodeTableType.stationUIC;
		}
		
		return this.stationCodeTable;
	}

	public Long getStationNum() {

		return this.stationNum;
	}

	public String getStationIA5() {

		return this.stationIA5;
	}

	public String getSpecialInformation() {

		return this.specialInformation;
	}

	public String getEntryTrack() {

		return this.entryTrack;
	}

	public String getNumberPlate() {

		return this.numberPlate;
	}

	public ExtensionData getExtension() {

		return this.extension;
	}

	public void setReferenceIA5(String referenceIA5) {

		this.referenceIA5 = referenceIA5;
	}

	public void setReferenceNum(Asn1BigInteger referenceNum) {

		this.referenceNum = referenceNum;
	}

	public void setParkingGroundId(String parkingGroundId) {

		this.parkingGroundId = parkingGroundId;
	}

	public void setFromParkingDate(Long fromParkingDate) {

		this.fromParkingDate = fromParkingDate;
	}

	public void setToParkingDate(Long toParkingDate) {

		this.toParkingDate = toParkingDate;
	}

	public void setProductOwnerNum(Long productOwnerNum) {

		this.productOwnerNum = productOwnerNum;
	}

	public void setProductOwnerIA5(String productOwnerIA5) {

		this.productOwnerIA5 = productOwnerIA5;
	}

	public void setProductIdNum(Long productIdNum) {

		this.productIdNum = productIdNum;
	}

	public void setProductIdIA5(String productIdIA5) {

		this.productIdIA5 = productIdIA5;
	}

	public void setAccessCode(String accessCode) {

		this.accessCode = accessCode;
	}

	public void setLocation(String location) {

		this.location = location;
	}

	public void setStationCodeTable(CodeTableType stationCodeTable) {

		this.stationCodeTable = stationCodeTable;
	}

	public void setStationNum(Long stationNum) {

		this.stationNum = stationNum;
	}

	public void setStationIA5(String stationIA5) {

		this.stationIA5 = stationIA5;
	}

	public void setSpecialInformation(String specialInformation) {

		this.specialInformation = specialInformation;
	}

	public void setEntryTrack(String entryTrack) {

		this.entryTrack = entryTrack;
	}

	public void setNumberPlate(String numberPlate) {

		this.numberPlate = numberPlate;
	}

	public void setExtension(ExtensionData extension) {

		this.extension = extension;
	}

	public Long getPrice() {
		return Asn1BigInteger.toLong(price);
	}

	public void setPrice(Long price) {
		this.price = Asn1BigInteger.toAsn1(price);
	}

	public SequenceOfVatDetail getVatDetails() {
		return vatDetails;
	}

	public void setVatDetails(SequenceOfVatDetail vatDetails) {
		this.vatDetails = vatDetails;
	}

	public void addVatDetail(VatDetailType vatDetail) {
		if (this.vatDetails == null) {
			this.vatDetails = new SequenceOfVatDetail();
		}
		this.vatDetails.add(vatDetail);
	}

	
	public void setParkingDate (Date fromDate, Date issuingDate){
		
		if (issuingDate == null || fromDate == null) return;
				
		this.fromParkingDate = DateTimeUtils.getDateDifference(issuingDate,fromDate);

	}
	
	public Date getFromParkingDate(Date issuingDate){
		
		return DateTimeUtils.getDate(issuingDate, this.fromParkingDate, 0L);
		
	}

	public Date getToParkingDate(Date issuingDate) {
		
		if ( this.toParkingDate == null) return null;
		
		return DateTimeUtils.getDate(issuingDate, this.fromParkingDate + this.toParkingDate, 1439L);
		
	}

	public void setParkingDates(Date fromDate, Date toDate,	Date issuingDate) {
		
		if (issuingDate == null || fromDate == null) return;
		
		this.fromParkingDate = DateTimeUtils.getDateDifference(issuingDate,fromDate);

		
		if (toDate != null) {
			this.toParkingDate = DateTimeUtils.getDateDifference(fromDate,toDate);

		}
		
	}
	
}