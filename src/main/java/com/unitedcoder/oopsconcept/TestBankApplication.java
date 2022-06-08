package com.unitedcoder.oopsconcept;

public class TestBankApplication {
    public static void main(String[] args) {
        USBank hsbc = new HSBCBank();
        hsbc.credit();
        hsbc.transaction();
        BrazilBank brazilBank = new HSBCBank();
        brazilBank.billUtility();
        brazilBank.loan();

        HSBCBank hsbcBank= new HSBCBank();
    }
}
