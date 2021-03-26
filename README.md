# UIC-barcode

[![CircleCI](https://circleci.com/gh/irrationalism/UIC-barcode/tree/circleci-project-setup.svg?style=shield )](https://circleci.com/gh/irrationalism/UIC-barcode/tree/circleci-project-setup)

implementation of FCB barcode for arail tickets as specified in the IRS 90918-9

The implementation provides a java API for the ticket an encoding / decoding functions to convert 
the ticket to and from the ASN.1/UPER encoded byte array specified in IRS 90918-9 for the FCB (flexible content barcode).

2020-09: Extended to cover the upcoming dynamical bar code header (DOSIPAS) and version 2 of the FCB asn.1 specification
