package com.aircraft.fire;

import com.aircraft.abstracts.AbstractHandler;
import com.aircraft.abstracts.AbstractRequest;

public class FireHandler extends AbstractHandler {

    public FireHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void takeAction(AbstractRequest abstractRequest){
        if(abstractRequest.getRequestCode()==1){
                System.out.println("Fire Action");
        } else {
            super.takeAction(abstractRequest);
            System.out.println("Its not Fire Action");
        }
    }


}
