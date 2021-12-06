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

import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.CharacterRestriction;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.RestrictedString;
import org.uic.barcode.asn1.datatypes.Sequence;
import org.uic.barcode.asn1.datatypesimpl.SequenceOfStringIA5;

@Sequence
public class PlacesType extends Object {
	public PlacesType() {
	}

	@FieldOrder(order = 0)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String coach;

	@FieldOrder(order = 1)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String placeString;

	@FieldOrder(order = 2)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String placeDescription;

	@FieldOrder(order = 3)
	@Asn1Optional public SequenceOfStringIA5 placeIA5;

	@FieldOrder(order = 4)
	@Asn1Optional public SequenceOfPlaceNum placeNum;
	
		

	public String getCoach() {

		return this.coach;
	}

	public String getPlaceString() {

		return this.placeString;
	}

	public String getPlaceDescription() {

		return this.placeDescription;
	}

	public SequenceOfStringIA5 getPlaceIA5() {

		return this.placeIA5;
	}

	public SequenceOfPlaceNum getPlaceNum() {

		return this.placeNum;
	}

	public void setCoach(String coach) {

		this.coach = coach;
	}

	public void setPlaceString(String placeString) {

		this.placeString = placeString;
	}

	public void setPlaceDescription(String placeDescription) {

		this.placeDescription = placeDescription;
	}

	public void setPlaceIA5(SequenceOfStringIA5 placeIA5) {

		this.placeIA5 = placeIA5;
	}

	public void setPlaceNum(SequenceOfPlaceNum placeNum) {

		this.placeNum = placeNum;
	}

}
