package com.ark.decorator;

public class Decaf extends Beverage{
    public Decaf() {
        description="Decaf Coffee";
    }

    @Override
    public double cost() {
        return .97;
    }
}
