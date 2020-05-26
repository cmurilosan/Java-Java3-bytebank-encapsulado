package com.bytebank.process;

public class LifeInsurance implements Taxable{

    @Override
    public double getTaxValue() {
        return 42;
    }
}
