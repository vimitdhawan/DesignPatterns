package com.aircraft.abstracts;

abstract public class AbstractHandler {

    private AbstractHandler next;

    public AbstractHandler(AbstractHandler next){
        this.next = next;
    }

    public void takeAction(AbstractRequest abstractRequest){
        if(next != null){
            next.takeAction(abstractRequest);
        }

    }

}
