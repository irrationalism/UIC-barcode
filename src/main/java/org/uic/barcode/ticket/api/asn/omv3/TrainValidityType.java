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

import java.util.Date;
import java.util.List;

import org.uic.barcode.asn1.datatypes.Asn1Default;
import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.HasExtensionMarker;
import org.uic.barcode.asn1.datatypes.IntRange;
import org.uic.barcode.asn1.datatypes.Sequence;
import org.uic.barcode.asn1.datatypesimpl.SequenceOfStringIA5;
import org.uic.barcode.ticket.api.utils.DateTimeUtils;

@Sequence
@HasExtensionMarker
public class TrainValidityType extends Object {
	public TrainValidityType() {
	}

	@FieldOrder(order = 0)
	@IntRange(minValue=-1,maxValue=700)
	@Asn1Default(value="0")
	@Asn1Optional public Long validFromDay;

	@FieldOrder(order = 1)
	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long validFromTime;
	
	@FieldOrder(order = 2)
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long validFromUTCOffset;

	@FieldOrder(order = 3)
	@IntRange(minValue=-1,maxValue=500)
	@Asn1Default(value="0")
	@Asn1Optional public Long validUntilDay;

	@FieldOrder(order = 4)
	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long validUntilTime;
	
	@FieldOrder(order = 5)
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long validUntilUTCOffset;
	
	@FieldOrder(order = 6)
	@Asn1Optional public SequenceOfCarrierNum includedCarriersNum;

	@FieldOrder(order = 7)
	@Asn1Optional public SequenceOfStringIA5 includedCarriersIA5;
	
	@FieldOrder(order = 8)
	@Asn1Optional public SequenceOfCarrierNum excludedCarriersNum;

	@FieldOrder(order = 9)
	@Asn1Optional public SequenceOfStringIA5 excludedCarriersIA5;

	@FieldOrder(order = 10)
	@Asn1Optional public SequenceOfServiceBrands includedServiceBrands;

	@FieldOrder(order = 11)
	@Asn1Optional public SequenceOfServiceBrands excludedServiceBrands;

	
	@FieldOrder(order = 12)
	@Asn1Default (value="boarding")
	@Asn1Optional public BoardingOrArrivalType bordingOrArrival;	

	public BoardingOrArrivalType getBordingOrArrival() {
		return bordingOrArrival;
	}

	public void setBordingOrArrival(BoardingOrArrivalType bordingOrArrival) {
		this.bordingOrArrival = bordingOrArrival;
	}

	public Long getValidFromDay() {
		
		if (validFromDay == null) {
			return new Long(0);
		}

		return this.validFromDay;
	}

	public Long getValidFromTime() {

		return this.validFromTime;
	}

	public Long getValidUntilDay() {
		
		if (validUntilDay == null) {
			return new Long(0);
		}

		return this.validUntilDay;
	}

	public Long getValidUntilTime() {

		return this.validUntilTime;
	}

	public void setValidFromDay(Long validFromDay) {

		this.validFromDay = validFromDay;
	}

	public void setValidFromTime(Long validFromTime) {

		this.validFromTime = validFromTime;
	}

	public void setValidUntilDay(Long validUntilDay) {

		this.validUntilDay = validUntilDay;
	}

	public void setValidUntilTime(Long validUntilTime) {

		this.validUntilTime = validUntilTime;
	}
	
	public void setValidityDates (Date fromDate, Date untilDate, Date issuingDate){
		
		if (issuingDate == null || fromDate == null) return;
				
		this.validFromDay = DateTimeUtils.getDateDifference(issuingDate,fromDate);
		this.validFromTime =  DateTimeUtils.getTime(fromDate);

		if (untilDate != null){
			this.validUntilDay = DateTimeUtils.getDateDifference(fromDate, untilDate);
			this.validUntilTime = DateTimeUtils.getTime(untilDate);
		}

	}
	
	public Date getValidFromDate(Date issuingDate){
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay, this.validFromTime);
		
	}
	
	public Date getValidUntilDate(Date issuingDate){
		
		if (issuingDate == null) return null;
		
		if (this.validFromDay == null) {
			this.validFromDay = 0L;
		}
		
		if (this.validUntilDay == null) {
			return null;
		}		
		
		
		return DateTimeUtils.getDate(issuingDate, this.validFromDay + this.validUntilDay, this.validUntilTime);
		
	}

	public Long getValidFromUTCOffset() {
		return validFromUTCOffset;
	}

	public void setValidFromUTCOffset(Long validFromUTCOffset) {
		this.validFromUTCOffset = validFromUTCOffset;
	}

	public Long getValidUntilUTCOffset() {
		return validUntilUTCOffset;
	}

	public void setValidUntilUTCOffset(Long validUntilUTCOffset) {
		this.validUntilUTCOffset = validUntilUTCOffset;
	}
	
	public SequenceOfCarrierNum getIncludedCarriersNum() {

		return this.includedCarriersNum;
	}

	public List<String> getIncludedCarriersIA5() {

		return this.includedCarriersIA5;
	}

	public SequenceOfCarrierNum getExcludedCarriersNum() {

		return this.excludedCarriersNum;
	}

	public SequenceOfStringIA5 getExcludedCarriersIA5() {

		return this.excludedCarriersIA5;
	}

	public SequenceOfServiceBrands getIncludedServiceBrands() {

		return this.includedServiceBrands;
	}

	public SequenceOfServiceBrands getExcludedServiceBrands() {

		return this.excludedServiceBrands;
	}

	public void setIncludedCarriersNum(SequenceOfCarrierNum includedCarriersNum) {
		this.includedCarriersNum = includedCarriersNum;
	}

	public void setIncludedCarriersIA5(SequenceOfStringIA5 includedCarriersIA5) {
		this.includedCarriersIA5 = includedCarriersIA5;
	}

	public void setExcludedCarriersNum(SequenceOfCarrierNum excludedCarriersNum) {
		this.excludedCarriersNum = excludedCarriersNum;
	}

	public void setExcludedCarriersIA5(SequenceOfStringIA5 excludedCarriersIA5) {
		this.excludedCarriersIA5 = excludedCarriersIA5;
	}

	public void setIncludedServiceBrands(SequenceOfServiceBrands includedServiceBrands) {
		this.includedServiceBrands = includedServiceBrands;
	}

	public void setExcludedServiceBrands(SequenceOfServiceBrands excludedServiceBrands) {
		this.excludedServiceBrands = excludedServiceBrands;
	}
	
	
	

}
