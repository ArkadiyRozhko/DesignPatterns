package com.ark;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWingth();
    }

    @Override
    public void display() {
        System.out.println("I`m real Mallard duck");
    }
}
