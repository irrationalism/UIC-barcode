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

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.uic.barcode.asn1.datatypes.Asn1BigInteger;
import org.uic.barcode.asn1.datatypes.Asn1Default;
import org.uic.barcode.asn1.datatypes.Asn1Optional;
import org.uic.barcode.asn1.datatypes.CharacterRestriction;
import org.uic.barcode.asn1.datatypes.FieldOrder;
import org.uic.barcode.asn1.datatypes.HasExtensionMarker;
import org.uic.barcode.asn1.datatypes.IntRange;
import org.uic.barcode.asn1.datatypes.RestrictedString;
import org.uic.barcode.asn1.datatypes.Sequence;
import org.uic.barcode.asn1.datatypesimpl.SequenceOfStringIA5;
import org.uic.barcode.ticket.api.utils.DateTimeUtils;



@Sequence
@HasExtensionMarker
public class CarCarriageReservationData extends Object {
	public CarCarriageReservationData() {
	}

	@FieldOrder(order = 0)
	@Asn1Optional public Asn1BigInteger trainNum;

	@FieldOrder(order = 1)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String trainIA5;
	
	@FieldOrder(order = 2)
	@IntRange(minValue=-1,maxValue=500)
	@Asn1Default(value="0")
	@Asn1Optional public Long beginLoadingDate;

	@FieldOrder(order = 3)
	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long beginLoadingTime;
	
	@FieldOrder(order = 4)
	@IntRange(minValue=0,maxValue=1439)
	@Asn1Optional public Long endLoadingTime;

	@FieldOrder(order = 5)
	@IntRange(minValue=-60, maxValue=60)
	@Asn1Optional public Long loadingUTCOffset;
	
	@FieldOrder(order = 6)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String referenceIA5;

	@FieldOrder(order = 7)
	@Asn1Optional public Asn1BigInteger referenceNum;

	@FieldOrder(order = 8)
	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long productOwnerNum;

	@FieldOrder(order = 9)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productOwnerIA5;

	@FieldOrder(order = 10)
	@IntRange(minValue=0,maxValue=65535)
	@Asn1Optional public Long productIdNum;

	@FieldOrder(order = 11)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String productIdIA5;

	@FieldOrder(order = 12)
	@IntRange(minValue=1,maxValue=32000)
	@Asn1Optional public Long serviceBrand;

	@FieldOrder(order = 13)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String serviceBrandAbrUTF8;

	@FieldOrder(order = 14)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String serviceBrandNameUTF8;

	@FieldOrder(order = 15)
	@Asn1Default("stationUICReservation")
	@Asn1Optional public CodeTableType stationCodeTable;

	@FieldOrder(order = 16)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long fromStationNum;

	@FieldOrder(order = 17)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String fromStationIA5;

	@FieldOrder(order = 18)
	@IntRange(minValue=1,maxValue=9999999)
	@Asn1Optional public Long toStationNum;

	@FieldOrder(order = 19)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String toStationIA5;

	@FieldOrder(order = 20)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String fromStationNameUTF8;

	@FieldOrder(order = 21)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String toStationNameUTF8;

	@FieldOrder(order = 22)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String coach;

	@FieldOrder(order = 23)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String place;

	@FieldOrder(order = 24)
	@Asn1Optional public CompartmentDetailsType compartmentDetails;

	@FieldOrder(order = 25)
	@RestrictedString(CharacterRestriction.IA5String)
	public String numberPlate;

	@FieldOrder(order = 26)
	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String trailerPlate;

	@FieldOrder(order = 27)
	@IntRange(minValue=0,maxValue=9)
	public Long carCategory;

	@FieldOrder(order = 28)
	@IntRange(minValue=0,maxValue=6)
	@Asn1Optional public Long boatCategory;

	@FieldOrder(order = 29)
	public Boolean textileRoof = false;

	@FieldOrder(order = 30)
	@Asn1Default(value ="norack")
	@Asn1Optional public RoofRackType roofRackType;

	@FieldOrder(order = 31)
	@IntRange(minValue=0,maxValue=99)
	@Asn1Optional public Long roofRackHeight;

	@FieldOrder(order = 32)
	@IntRange(minValue=0,maxValue=2)
	@Asn1Optional public Long attachedBoats;

	@FieldOrder(order = 33)
	@IntRange(minValue=0,maxValue=4)
	@Asn1Optional public Long attachedBicycles;

	@FieldOrder(order = 34)
	@IntRange(minValue=0,maxValue=5)
	@Asn1Optional public Long attachedSurfboards;

	@FieldOrder(order = 35)
	@IntRange(minValue=0,maxValue=999)
	@Asn1Optional public Long loadingListEntry;

	@FieldOrder(order = 36)
	@Asn1Default(value="upper")
	@Asn1Optional public LoadingDeckType loadingDeck;

	@FieldOrder(order = 37)
	@Asn1Optional public SequenceOfCarrierNum carrierNum;

	@FieldOrder(order = 38)
	@Asn1Optional public SequenceOfStringIA5 carrierIA5;

	@FieldOrder(order = 39)
	public TariffType tariff;

	@FieldOrder(order = 40)
	@Asn1Default(value="travelPrice")
	@Asn1Optional public PriceTypeType priceType;
	
	@FieldOrder(order = 41)
	@Asn1Optional Asn1BigInteger price;
	
	@FieldOrder(order = 42)
	@Asn1Optional SequenceOfVatDetail vatDetails;
	
	@FieldOrder(order = 43)
	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String infoText;

	@FieldOrder(order = 44)
	@Asn1Optional public ExtensionData extension;
	
	public Long getTrainNum() {
		if (this.trainNum == null) return null;
		return Asn1BigInteger.toLong(this.trainNum);
	}

	public String getTrainIA5() {

		return this.trainIA5;
	}

	public Long getBeginLoadingDate() {
		
		return this.beginLoadingDate;
	}

	public Long getBeginLoadingTime() {

		if (beginLoadingTime == null) return new Long(0);
		return beginLoadingTime;
	}

	public Long getEndLoadingTime() {

		return this.endLoadingTime;
	}

	public String getReferenceIA5() {

		return this.referenceIA5;
	}

	public Long getReferenceNum() {
		return Asn1BigInteger.toLong(this.referenceNum);
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

	public Long getServiceBrand() {

		return this.serviceBrand;
	}

	public String getServiceBrandAbrUTF8() {

		return this.serviceBrandAbrUTF8;
	}

	public String getServiceBrandNameUTF8() {

		return this.serviceBrandNameUTF8;
	}

	public CodeTableType getStationCodeTable() {

		if (stationCodeTable == null) {
			return CodeTableType.stationUICReservation;
		}
		
		return this.stationCodeTable;
	}

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

	public String getCoach() {

		return this.coach;
	}

	public String getPlace() {

		return this.place;
	}

	public CompartmentDetailsType getCompartmentDetails() {

		return this.compartmentDetails;
	}

	public String getNumberPlate() {

		return this.numberPlate;
	}

	public String getTrailerPlate() {

		return this.trailerPlate;
	}

	public Long getCarCategory() {

		return this.carCategory;
	}

	public Long getBoatCategory() {

		return this.boatCategory;
	}

	public Boolean getTextileRoof() {

		return this.textileRoof;
	}

	public RoofRackType getRoofRackType() {

		if (this.roofRackType == null)  return RoofRackType.norack;
		return this.roofRackType;
	}

	public Long getRoofRackHeight() {

		return this.roofRackHeight;
	}

	public Long getAttachedBoats() {

		return this.attachedBoats;
	}

	public Long getAttachedBicycles() {

		return this.attachedBicycles;
	}

	public Long getAttachedSurfboards() {

		return this.attachedSurfboards;
	}

	public Long getLoadingListEntry() {

		return this.loadingListEntry;
	}

	public LoadingDeckType getLoadingDeck() {

		if (this.loadingDeck == null) return LoadingDeckType.upper;
		return this.loadingDeck;
	}

	public SequenceOfCarrierNum getCarrierNum() {

		return this.carrierNum;
	}

	public SequenceOfStringIA5 getCarrierIA5() {

		return this.carrierIA5;
	}

	public TariffType getTariff() {

		return this.tariff;
	}

	public PriceTypeType getPriceType() {
		if (this.priceType == null) return PriceTypeType.travelPrice;
		return this.priceType;
	}

	public String getInfoText() {

		return this.infoText;
	}

	public ExtensionData getExtension() {

		return this.extension;
	}

	public void setTrainNum(Long trainNum) {
		
		this.trainNum = new Asn1BigInteger(trainNum);
	}

	public void setTrainIA5(String trainIA5) {

		this.trainIA5 = trainIA5;
	}

	public void setBeginLoadingDate(Long beginLoadingDate) {

		this.beginLoadingDate = beginLoadingDate;
	}

	public void setBeginLoadingTime(Long beginLoadingTime) {

		this.beginLoadingTime = beginLoadingTime;
	}

	public void setEndLoadingTime(Long endLoadingTime) {
		this.endLoadingTime = endLoadingTime;
	}

	public void setReferenceIA5(String referenceIA5) {

		this.referenceIA5 = referenceIA5;
	}

	public void setReferenceNum(Long referenceNum) {

		this.referenceNum = Asn1BigInteger.toAsn1(referenceNum);
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

	public void setServiceBrand(Long serviceBrand) {

		this.serviceBrand = serviceBrand;
	}

	public void setServiceBrandAbrUTF8(String serviceBrandAbrUTF8) {

		this.serviceBrandAbrUTF8 = serviceBrandAbrUTF8;
	}

	public void setServiceBrandNameUTF8(String serviceBrandNameUTF8) {

		this.serviceBrandNameUTF8 = serviceBrandNameUTF8;
	}

	public void setStationCodeTable(CodeTableType stationCodeTable) {

		this.stationCodeTable = stationCodeTable;
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

	public void setCoach(String coach) {

		this.coach = coach;
	}

	public void setPlace(String place) {

		this.place = place;
	}

	public void setCompartmentDetails(CompartmentDetailsType compartmentDetails) {

		this.compartmentDetails = compartmentDetails;
	}

	public void setNumberPlate(String numberPlate) {

		this.numberPlate = numberPlate;
	}

	public void setTrailerPlate(String trailerPlate) {

		this.trailerPlate = trailerPlate;
	}

	public void setCarCategory(Long carCategory) {

		this.carCategory = carCategory;
	}

	public void setBoatCategory(Long boatCategory) {

		this.boatCategory = boatCategory;
	}

	public void setTextileRoof(Boolean textileRoof) {

		this.textileRoof = textileRoof;
	}

	public void setRoofRackType(RoofRackType roofRackType) {

		this.roofRackType = roofRackType;
	}

	public void setRoofRackHeight(Long roofRackHeight) {

		this.roofRackHeight = roofRackHeight;
	}

	public void setAttachedBoats(Long attachedBoats) {

		this.attachedBoats = attachedBoats;
	}

	public void setAttachedBicycles(Long attachedBicycles) {

		this.attachedBicycles = attachedBicycles;
	}

	public void setAttachedSurfboards(Long attachedSurfboards) {

		this.attachedSurfboards = attachedSurfboards;
	}

	public void setLoadingListEntry(Long loadingListEntry) {

		this.loadingListEntry = loadingListEntry;
	}

	public void setLoadingDeck(LoadingDeckType loadingDeck) {

		this.loadingDeck = loadingDeck;
	}

	public void setCarrierNum(SequenceOfCarrierNum carrierNum) {

		this.carrierNum = carrierNum;
	}
	
	public void setCarrierNum(List<Long> longs) {
		if (longs == null || longs.isEmpty()) return;
		this.carrierNum = new SequenceOfCarrierNum(longs);
	}
	

	public void setCarrierIA5(SequenceOfStringIA5 carrierIA5) {

		this.carrierIA5 = carrierIA5;
	}

	public void setTariff(TariffType tariff) {

		this.tariff = tariff;
	}

	public void setPriceType(PriceTypeType priceType) {

		this.priceType = priceType;
	}

	public void setInfoText(String infoText) {

		this.infoText = infoText;
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
	
	public void setLoadingDates (Date beginLoading, Date endLoading, Date issuingDate){
		
		if (issuingDate == null || beginLoading == null) return;
		
		this.beginLoadingDate = DateTimeUtils.getDateDifference(issuingDate,beginLoading);
		this.beginLoadingTime =  DateTimeUtils.getTime(beginLoading);
				
		if (endLoading != null) {
			this.endLoadingTime =  DateTimeUtils.getTime(endLoading);
		}
	}
	
	public Date getBeginLoadingDate(Date issuingDate){
		
		if (issuingDate == null) return null;
		
		if (this.beginLoadingDate == null) {
			this.beginLoadingDate = 0L;
		}
		
		return DateTimeUtils.getDate(issuingDate, this.beginLoadingDate, this.beginLoadingTime);

	}
	
	public Date getEndLoadingDate(Date issuingDate){
		
		if (issuingDate == null) return null;
		
		if (this.beginLoadingDate == null) {
			this.beginLoadingDate = 0L;
		}
		
		if (this.endLoadingTime == null) {
			return null;
		}
		
		Date begin = DateTimeUtils.getDate(issuingDate, this.beginLoadingDate, this.beginLoadingTime);
		Date end = DateTimeUtils.getDate(issuingDate, this.beginLoadingDate, this.endLoadingTime);
		
		//max one day difference assumed
		if (end.before(begin)) {
			Calendar cal = Calendar.getInstance();
			cal.clear();
			cal.setTime(end);
			cal.add(Calendar.DAY_OF_YEAR,1);
			return cal.getTime();
		} else {
			return end;
		}

	}

	public Long getLoadingUTCOffset() {
		return loadingUTCOffset;
	}

	public void setLoadingUTCOffset(Long loadingUTCOffset) {
		this.loadingUTCOffset = loadingUTCOffset;
	}
	
	


}
