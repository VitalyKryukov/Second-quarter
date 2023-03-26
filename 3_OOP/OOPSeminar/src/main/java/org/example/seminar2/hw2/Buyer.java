package org.example.seminar2.hw2;

public abstract class Buyer implements BuyerBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public abstract String getName();
}

