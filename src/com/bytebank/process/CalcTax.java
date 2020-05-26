package com.bytebank.process;

public class CalcTax {

    private double totalTax;

    public void register(Taxable t){
        double value = t.getTaxValue();
        this.totalTax += value;
    }

    public double getTotalTax(){
        return totalTax;
    }
}
