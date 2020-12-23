package com.gumball.state;

import com.gumball.GumBallMachine;
import com.gumball.State;

public class HasStateHandler implements StateHandler {
    private GumBallMachine gumBallMachine;
    public HasStateHandler(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter already exist");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter ejected");
        gumBallMachine.setState(gumBallMachine.getStateHandler(State.NoQuarterState));
    }

    @Override
    public void turnCrack() {
        System.out.println("Gumball is in your way");
        gumBallMachine.setState(gumBallMachine.getStateHandler(State.SoldState));
    }

    @Override
    public void dispense() {
        // no implementation
    }

}
