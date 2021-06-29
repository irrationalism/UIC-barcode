package org.uic.barcode.ticket.api.asn.omv3;

import java.util.Collection;

import org.uic.barcode.asn1.datatypes.Asn1SequenceOf;

public class SequenceOfTariffType extends Asn1SequenceOf<TariffType> {
    public SequenceOfTariffType() { super(); }
    public SequenceOfTariffType(Collection<TariffType> coll) { super(coll); }
}	
