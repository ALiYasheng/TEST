package com.unitedcoder.oopsconcept;

public class HSBCBank implements USBank, BrazilBank {
    @Override
    public void credit() {
        System.out.println("HSBC----Credit");
    }

    @Override
    public void debit() {
        System.out.println("HSBC----debit");
    }

    @Override
    public void loan() {

    }

    @Override
    public void billUtility() {

    }


    @Override
    public void transaction() {
        System.out.println("HSBC----transaction");
    }
}
