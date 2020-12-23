package com.gumball.state;

import com.gumball.GumBallMachine;

public class SoldOutStateHandler implements StateHandler {
    private GumBallMachine gumBallMachine;
    public SoldOutStateHandler(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sold Out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sold Out");
    }

    @Override
    public void turnCrack() {
        System.out.println("Sold Out");
    }

    @Override
    public void dispense() {
        System.out.println("Sold Out");
    }

}
