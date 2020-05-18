package com.aircraft.abstracts;

abstract public class AbstracctHandler {

    private AbstracctHandler next;

    AbstracctHandler(AbstracctHandler next){
        this.next = next;
    }

    public void takeAction(AbstracctHandler abstractHandler){
        if(abstractHandler != null){
            abstractHandler.takeAction(abstractHandler.next);
        }

    }

}
