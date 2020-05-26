package com.bytebank.main;

import com.bytebank.model.CurrentAccount;
import com.bytebank.process.CalcTax;
import com.bytebank.process.LifeInsurance;

public class TaxTest {

    public static void main(String[] args) {

        CurrentAccount cc = new CurrentAccount(222,333);
        cc.deposit(100.0);

        LifeInsurance insurance = new LifeInsurance();

        CalcTax calc = new CalcTax();
        calc.register(cc);
        calc.register(insurance);

        System.out.println(calc.getTotalTax());


    }
}
