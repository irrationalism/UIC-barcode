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
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.Sequence;

@Sequence
public class DeltaCoordinates extends Object {
	public DeltaCoordinates() {
	}

	@FieldOrder(order = 0)
	public Asn1BigInteger longitude;

	@FieldOrder(order = 1)
	public Asn1BigInteger latitude;

	public Asn1BigInteger getLongitude() {

		return this.longitude;
	}

	public Asn1BigInteger getLatitude() {

		return this.latitude;
	}

	public void setLongitude(Asn1BigInteger longitude) {

		this.longitude = longitude;
	}

	public void setLatitude(Asn1BigInteger latitude) {

		this.latitude = latitude;
	}


}
