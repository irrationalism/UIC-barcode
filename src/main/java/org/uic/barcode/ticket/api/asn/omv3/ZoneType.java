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
package org.uic.barcode.ticket.api.asn.omv3;

import org.uic.barcode.asn1.datatypes.Asn1BigInteger;
import org.uic.barcode.asn1.datatypes.Asn1Default;
import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.CharacterRestriction;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.HasExtensionMarker;
import org.uic.barcode.asn1.datatypes.IntRange;
import org.uic.barcode.asn1.datatypes.RestrictedString;
import org.uic.barcode.asn1.datatypes.Sequence;
import org.uic.barcode.asn1.datatypesimpl.OctetString;
import org.uic.barcode.asn1.datatypesimpl.SequenceOfUnrestrictedLong;

@Sequence
@HasExtensionMarker

public class ZoneType extends Object {
	public ZoneType() {
	}

	@FieldOrder(order = 0)
	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long carrierNum;

	@FieldOrder(order = 1)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String carrierIA5;

	@FieldOrder(order = 2)
	@Asn1Default("stationUIC")
	@Asn1Optional public CodeTableType stationCodeTable;

	@FieldOrder(order = 3)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long entryStationNum;

	@FieldOrder(order = 4)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String entryStationIA5;

	@FieldOrder(order = 5)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long terminatingStationNum;

	@FieldOrder(order = 6)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String terminatingStationIA5;

	@FieldOrder(order = 7)
	@Asn1Optional public Asn1BigInteger city;

	@FieldOrder(order = 8)
	@Asn1Optional public SequenceOfUnrestrictedLong zoneId;

	@FieldOrder(order = 9)
	@Asn1Optional public OctetString binaryZoneId;

	@FieldOrder(order = 10)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String nutsCode;
	

	public Long getCarrierNum() {

		return this.carrierNum;
	}

	public String getCarrierIA5() {

		return this.carrierIA5;
	}

	public CodeTableType getStationCodeTable() {

		if (stationCodeTable == null)  {
			return CodeTableType.stationUIC;
		}
		
		return this.stationCodeTable;
	}

	public Long getEntryStationNum() {
		return this.entryStationNum;
	}

	public String getEntryStationIA5() {
		return this.entryStationIA5;
	}

	public Long getTerminatingStationNum() {
		return this.terminatingStationNum;
	}

	public String getTerminatingStationIA5() {
		return this.terminatingStationIA5;
	}

	public Asn1BigInteger getCity() {
		return this.city;
	}

	public SequenceOfUnrestrictedLong getZoneId() {
		return this.zoneId;
	}

	public byte[] getBinaryZoneId() {
		
		if (binaryZoneId == null) {
			return null;
		}
		return binaryZoneId.toByteArray();
		
	}

	public String getNutsCode() {
		return this.nutsCode;
	}

	public void setCarrierNum(Long carrierNum) {
		this.carrierNum = carrierNum;
	}

	public void setCarrierIA5(String carrierIA5) {
		this.carrierIA5 = carrierIA5;
	}

	public void setStationCodeTable(CodeTableType stationCodeTable) {
		this.stationCodeTable = stationCodeTable;
	}

	public void setEntryStationNum(Long entryStationNum) {
		this.entryStationNum = entryStationNum;
	}

	public void setEntryStationIA5(String entryStationIA5) {
		this.entryStationIA5 = entryStationIA5;
	}

	public void setTerminatingStationNum(Long terminatingStationNum) {
		this.terminatingStationNum = terminatingStationNum;
	}

	public void setTerminatingStationIA5(String terminatingStationIA5) {
		this.terminatingStationIA5 = terminatingStationIA5;
	}

	public void setCity(Asn1BigInteger city) {
		this.city = city;
	}

	public void setZoneId(SequenceOfUnrestrictedLong zoneId) {
		this.zoneId = zoneId;
	}

	public void setBinaryZoneId(byte[] binaryZoneId) {
				
		this.binaryZoneId = new OctetString(binaryZoneId);

	}

	public void setNutsCode(String nutsCode) {
		this.nutsCode = nutsCode;
	}


}
