package com.aircraft.engine;

import com.aircraft.abstracts.AbstractHandler;
import com.aircraft.abstracts.AbstractRequest;

public class FireHandler extends AbstractHandler {

    FireHandler(AbstractHandler next) {
        super(next);
    }


    @Override
    public void takeAction(AbstractRequest abstractRequest){
        if(abstractRequest.getRequestCode()==1){
                System.out.println("Fire Action");
        } else {
            super.takeAction(abstractRequest);
        }
    }


}
