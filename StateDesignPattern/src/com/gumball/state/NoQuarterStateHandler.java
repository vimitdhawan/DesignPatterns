package com.gumball.state;

import com.gumball.GumBallMachine;
import com.gumball.State;

public class NoQuarterStateHandler implements StateHandler {
    private GumBallMachine gumBallMachine;
    public NoQuarterStateHandler(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Quarter inserted");
        gumBallMachine.setState(gumBallMachine.getStateHandler(State.HasQuarterState));
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No Quarter exist");
    }

    @Override
    public void turnCrack() {
        System.out.println("You can't perform this operation");
    }

    @Override
    public void dispense() {
        System.out.println("You can't perform this operation");
    }

}
