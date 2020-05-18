package com.aircraft.engine;

import com.aircraft.abstracts.AbstractHandler;
import com.aircraft.abstracts.AbstractRequest;

public class EngineHandler extends AbstractHandler {

    public EngineHandler(AbstractHandler next) {
        super(next);
    }


    @Override
    public void takeAction(AbstractRequest abstractRequest){
        if(abstractRequest.getRequestCode()==2){
                System.out.println("Engine Action");
        } else {
            System.out.println("Its not Engine Action");
            super.takeAction(abstractRequest);

        }
    }


}
