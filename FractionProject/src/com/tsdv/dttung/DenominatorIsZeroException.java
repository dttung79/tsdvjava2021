package com.tsdv.dttung;

public class DenominatorIsZeroException extends Exception {
    public DenominatorIsZeroException() {
        super("Error: Denominator is zer!");
    }
    public DenominatorIsZeroException(String message) {
        super(message);
    }
}
