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
package org.uic.ticket.api.asn.omv2;

import java.util.List;

import net.gcdc.asn1.datatypes.Asn1Optional;
import net.gcdc.asn1.datatypes.CharacterRestriction;
import net.gcdc.asn1.datatypes.HasExtensionMarker;
import net.gcdc.asn1.datatypes.IntRange;
import net.gcdc.asn1.datatypes.RestrictedString;
import net.gcdc.asn1.datatypes.Sequence;

@Sequence
@HasExtensionMarker
public class ReturnRouteDescriptionType extends Object {
	public ReturnRouteDescriptionType() {
	}

	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long fromStationNum;

	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String fromStationIA5;

	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long toStationNum;

	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String toStationIA5;

	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String fromStationNameUTF8;

	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String toStationNameUTF8;

	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String validReturnRegionDesc;

	@Asn1Optional public SequenceOfRegionalValidityType validReturnRegion;

	public Long getFromStationNum() {

		return this.fromStationNum;
	}

	public String getFromStationIA5() {

		return this.fromStationIA5;
	}

	public Long getToStationNum() {

		return this.toStationNum;
	}

	public String getToStationIA5() {

		return this.toStationIA5;
	}

	public String getFromStationNameUTF8() {

		return this.fromStationNameUTF8;
	}

	public String getToStationNameUTF8() {

		return this.toStationNameUTF8;
	}

	public String getValidReturnRegionDesc() {

		return this.validReturnRegionDesc;
	}

	public List<RegionalValidityType> getValidReturnRegion() {

		return this.validReturnRegion;
	}

	public void setFromStationNum(Long fromStationNum) {

		this.fromStationNum = fromStationNum;
	}

	public void setFromStationIA5(String fromStationIA5) {

		this.fromStationIA5 = fromStationIA5;
	}

	public void setToStationNum(Long toStationNum) {

		this.toStationNum = toStationNum;
	}

	public void setToStationIA5(String toStationIA5) {

		this.toStationIA5 = toStationIA5;
	}

	public void setFromStationNameUTF8(String fromStationNameUTF8) {

		this.fromStationNameUTF8 = fromStationNameUTF8;
	}

	public void setToStationNameUTF8(String toStationNameUTF8) {

		this.toStationNameUTF8 = toStationNameUTF8;
	}

	public void setValidReturnRegionDesc(String validReturnRegionDesc) {

		this.validReturnRegionDesc = validReturnRegionDesc;
	}

	public void setValidReturnRegion(SequenceOfRegionalValidityType validReturnRegion) {

		this.validReturnRegion = validReturnRegion;
	}


}