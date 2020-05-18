package com.aircraft;

import com.aircraft.engine.EngineHandler;
import com.aircraft.fire.FireHandler;
import com.aircraft.fire.FireRequest;

public class Main {
    public static void main(String[] args) {
        FireHandler fireHandler = new FireHandler(null);
        EngineHandler engineHandler = new EngineHandler(fireHandler);

        FireRequest fireRequest = new FireRequest();

        engineHandler.takeAction(fireRequest);
    }

}
