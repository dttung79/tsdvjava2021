package com.tsdv.dttung;
public class Fraction {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) throws DenominatorIsZeroException {
        if (denominator == 0) throw new DenominatorIsZeroException();
        this.denominator = denominator;
    }

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) throws DenominatorIsZeroException {
        setNumerator(numerator);
        setDenominator(denominator);
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction add(Fraction f) {
        int a = numerator;
        int b = denominator;
        int c = f.numerator;
        int d = f.denominator;
        Fraction res = new Fraction();
        res.numerator = a*d + b*c;
        res.denominator = b*d;
        return res;
    }
}
