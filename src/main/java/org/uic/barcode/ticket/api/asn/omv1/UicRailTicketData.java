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
package org.uic.barcode.ticket.api.asn.omv1;

import java.util.List;

import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.HasExtensionMarker;
import org.uic.barcode.asn1.datatypes.Sequence;
import org.uic.barcode.asn1.uper.UperEncoder;

@Sequence
@HasExtensionMarker
public class UicRailTicketData extends Object {
	public UicRailTicketData() {
	}

	@FieldOrder(order = 0)
	public IssuingData issuingDetail;

	@FieldOrder(order = 1)
	@Asn1Optional public TravelerData travelerDetail;

	@FieldOrder(order = 2)
	@Asn1Optional public SequenceOfDocumentData transportDocument;

	@FieldOrder(order = 3)
	@Asn1Optional public ControlData controlDetail;

	@FieldOrder(order = 4)
	@Asn1Optional public SequenceOfExtensionData extension;

	public IssuingData getIssuingDetail() {

		return this.issuingDetail;
	}

	public TravelerData getTravelerDetail() {

		return this.travelerDetail;
	}

	public List<DocumentData> getTransportDocument() {

		return this.transportDocument;
	}

	public ControlData getControlDetail() {

		return this.controlDetail;
	}

	public List<ExtensionData> getExtension() {

		return this.extension;
	}

	public void setIssuingDetail(IssuingData issuingDetail) {

		this.issuingDetail = issuingDetail;
	}

	public void setTravelerDetail(TravelerData travelerDetail) {

		this.travelerDetail = travelerDetail;
	}

	public void setTransportDocument(SequenceOfDocumentData transportDocument) {

		this.transportDocument = transportDocument;
	}

	public void setControlDetail(ControlData controlDetail) {

		this.controlDetail = controlDetail;
	}

	public void setExtension(SequenceOfExtensionData extension) {

		this.extension = extension;
	}

	
	public byte[] encode(){
		return UperEncoder.encode(this);
	}
	
	public String encodeToHex(){
		return  UperEncoder.hexStringFromBytes(UperEncoder.encode(this));
	}
	
	
	public static UicRailTicketData  decode(byte[] bytes) {
		return UperEncoder.decode(bytes, UicRailTicketData.class);	
	}

}