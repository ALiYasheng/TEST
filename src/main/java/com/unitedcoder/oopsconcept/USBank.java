package com.unitedcoder.oopsconcept;

public interface USBank {
    //Final static
    int min_Balance = 1000000;

    //abstract method no method body
    //all method by default public
    void credit ();
    void debit();
    void transaction();
}
