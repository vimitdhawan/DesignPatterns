package com.gumball;

import com.gumball.state.*;

import java.util.HashMap;
import java.util.Map;

public class GumBallMachine {
    private Map<State, StateHandler> stateHandlers = new HashMap<>();
    private StateHandler currentState;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;
    public GumBallMachine(int gumBalls){
        stateHandlers.put(State.HasQuarterState, new HasStateHandler(this));
        stateHandlers.put(State.NoQuarterState, new NoQuarterStateHandler(this));
        stateHandlers.put(State.SoldOutState, new SoldOutStateHandler(this));
        stateHandlers.put(State.SoldState, new SoldStateHandler(this));
        setCount(gumBalls);
        if(gumBalls<=0){
            currentState = stateHandlers.get(State.SoldOutState);
        } else {
            currentState = stateHandlers.get(State.NoQuarterState);
        }

    }
    public StateHandler getStateHandler(State state){
        return stateHandlers.get(state);
    }

    public void setState(StateHandler stateHandler) {
        this.currentState = stateHandler;
    }


    public void insertQuarter() {
        currentState.insertQuarter();
    }


    public void ejectQuarter() {
        currentState.ejectQuarter();
    }


    public void turnCrack() {
        currentState.turnCrack();
        currentState.dispense();
    }

    public void release(){ this.count--;}
}
