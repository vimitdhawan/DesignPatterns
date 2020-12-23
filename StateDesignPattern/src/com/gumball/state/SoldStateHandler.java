package com.gumball.state;

import com.gumball.GumBallMachine;
import com.gumball.State;

public class SoldStateHandler implements StateHandler {
    private GumBallMachine gumBallMachine;
    public SoldStateHandler(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Wait for transaction to complete");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Now you can't eject quarter");
    }

    @Override
    public void turnCrack() {
        System.out.println("in progress");
    }

    @Override
    public void dispense() {
        System.out.println("gumball released");
        gumBallMachine.release();
        if(gumBallMachine.getCount()<=0)
            gumBallMachine.setState(gumBallMachine.getStateHandler(State.SoldOutState));
        else
        gumBallMachine.setState(gumBallMachine.getStateHandler(State.NoQuarterState));
    }
}
