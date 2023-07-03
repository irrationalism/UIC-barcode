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

import java.util.Calendar;
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
import org.uic.barcode.asn1.datatypesimpl.SequenceOfUnrestrictedLong;

@Sequence
@HasExtensionMarker
public class CustomerCardData extends Object {
	public CustomerCardData() {
	}

	@FieldOrder(order = 0)
	@Asn1Optional public TravelerType customer;

	@FieldOrder(order = 1)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String cardIdIA5;

	@FieldOrder(order = 2)
	@Asn1Optional public Asn1BigInteger cardIdNum;

	@FieldOrder(order = 3)
	@IntRange(minValue=2016,maxValue=2269)
	public Long validFromYear;	
	
	@FieldOrder(order = 4)
	@IntRange(minValue=0,maxValue=370)
	@Asn1Optional public Long validFromDay;
	
	@FieldOrder(order = 5)
	@IntRange(minValue=0,maxValue=250)
	@Asn1Default(value="0")
	@Asn1Optional public Long validUntilYear;		

	@FieldOrder(order = 6)
	@IntRange(minValue=0,maxValue=370)
	@Asn1Optional public Long validUntilDay;

	@FieldOrder(order = 7)
	@Asn1Optional public TravelClassType classCode;

	@FieldOrder(order = 8)
	@IntRange(minValue=0,maxValue=1000)
	@Asn1Optional public Long cardType;

	@FieldOrder(order = 9)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String cardTypeDescr;

	@FieldOrder(order = 10)
	@Asn1Optional public Asn1BigInteger customerStatus;

	@FieldOrder(order = 11)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String customerStatusDescr;

	@FieldOrder(order = 12)
	@Asn1Optional public SequenceOfUnrestrictedLong includedServices;

	@FieldOrder(order = 13)
	@Asn1Optional public ExtensionData extension;
	
	


	public TravelerType getCustomer() {

		return this.customer;
	}

	public String getCardIdIA5() {

		return this.cardIdIA5;
	}

	public Asn1BigInteger getCardIdNum() {

		return this.cardIdNum;
	}

	public Long getValidFromYear() {

		return this.validFromYear;
	}

	public Long getValidFromDay() {

		return this.validFromDay;
	}

	public Long getValidUntilYear() {

		return this.validUntilYear;
	}

	public Long getValidUntilDay() {

		return this.validUntilDay;
	}

	public TravelClassType getClassCode() {

		return this.classCode;
	}

	public Long getCardType() {

		return this.cardType;
	}

	public String getCardTypeDescr() {

		return this.cardTypeDescr;
	}

	public Long getCustomerStatus() {

		return Asn1BigInteger.toLong(this.customerStatus);
	}

	public String getCustomerStatusDescr() {

		return this.customerStatusDescr;
	}

	public SequenceOfUnrestrictedLong getIncludedServices() {

		return this.includedServices;
	}

	public ExtensionData getExtension() {

		return this.extension;
	}

	public void setCustomer(TravelerType customer) {

		this.customer = customer;
	}

	public void setCardIdIA5(String cardIdIA5) {

		this.cardIdIA5 = cardIdIA5;
	}

	public void setCardIdNum(Asn1BigInteger cardIdNum) {

		this.cardIdNum = cardIdNum;
	}

	public void setCardIdNum(Long cardIdNum) {

		this.cardIdNum = new Asn1BigInteger(cardIdNum);
	}
	
	public void setValidFromYear(Long validFromYear) {

		this.validFromYear = validFromYear;
	}

	public void setValidFromDay(Long validFromDay) {

		this.validFromDay = validFromDay;
	}

	public void setValidUntilYear(Long validUntilYear) {

		this.validUntilYear = validUntilYear;
	}

	public void setValidUntilDay(Long validUntilDay) {

		this.validUntilDay = validUntilDay;
	}

	public void setClassCode(TravelClassType classCode) {

		this.classCode = classCode;
	}

	public void setCardType(Long cardType) {

		this.cardType = cardType;
	}

	public void setCardTypeDescr(String cardTypeDescr) {

		this.cardTypeDescr = cardTypeDescr;
	}

	public void setCustomerStatus(Long customerStatus) {

		this.customerStatus = Asn1BigInteger.toAsn1(customerStatus);
	}

	public void setCustomerStatusDescr(String customerStatusDescr) {

		this.customerStatusDescr = customerStatusDescr;
	}

	public void setIncludedServices(SequenceOfUnrestrictedLong includedServices) {

		this.includedServices = includedServices;
	}

	public void setExtension(ExtensionData extension) {

		this.extension = extension;
	}
	
	public void setValidity (Date fromDate , Date untilDate){
		
		Calendar fromCal = Calendar.getInstance();
		fromCal.clear();
		fromCal.setTime(fromDate);
		
		this.validFromYear = new Long( fromCal.get(Calendar.YEAR));
		this.validFromDay = new Long (fromCal.get(Calendar.DAY_OF_YEAR));
		
		if (untilDate == null) return;

		Calendar untilCal = Calendar.getInstance();
		untilCal.clear();
		untilCal.setTime(untilDate);
			
		int untildays = untilCal.get(Calendar.DAY_OF_YEAR);
		int yearDiff = untilCal.get(Calendar.YEAR) - fromCal.get(Calendar.YEAR);
		
		this.validUntilYear = new Long( yearDiff);
		this.validUntilDay = new Long (untildays);
		
	}
	
	public Date getValidFromDate (){
		
		if (this.validFromYear == null || this.validFromDay == null) return null;
			
			Calendar cal = Calendar.getInstance();
			cal.clear();
			//cal.setTimeZone(TimeZone.getTimeZone("UTC"));
			cal.set(Calendar.YEAR, this.validFromYear.intValue());
			cal.set(Calendar.DAY_OF_YEAR, this.validFromDay.intValue());
			cal.set(Calendar.MINUTE,0);
			cal.set(Calendar.HOUR_OF_DAY,0);
			return cal.getTime();
			
	}
	
	
	public Date getValidUntilDate (){
		
		if (this.validUntilYear == null || this.validUntilDay == null) return null;
			
			Calendar cal = Calendar.getInstance();
			cal.clear();
			//cal.setTimeZone(TimeZone.getTimeZone("UTC"));
			cal.set(Calendar.YEAR, this.validFromYear.intValue());
			if (this.validUntilYear != null) {
				cal.add(Calendar.YEAR, this.validUntilYear.intValue());
			}
			cal.set(Calendar.DAY_OF_YEAR, this.validUntilDay.intValue());
			cal.set(Calendar.MINUTE,59);
			cal.set(Calendar.HOUR_OF_DAY,23);
			return cal.getTime();
		
		}


}
