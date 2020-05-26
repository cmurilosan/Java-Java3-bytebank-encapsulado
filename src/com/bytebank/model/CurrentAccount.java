package com.bytebank.model;

import com.bytebank.process.Taxable;

public class CurrentAccount extends Account implements Taxable {

    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }

    @Override
    public boolean withdraw(double value) {
        double withdrawValue = value + 0.2;
        return super.withdraw(withdrawValue);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }
}
