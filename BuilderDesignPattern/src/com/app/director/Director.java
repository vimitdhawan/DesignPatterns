package com.app.director;

import com.app.builder.Aircraft;
import com.app.builder.AircraftBuilder;

public class  Director {
    private AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder aircraftBuilder){
        this.aircraftBuilder = aircraftBuilder;
    }

    public Aircraft construct() {
       return aircraftBuilder.buildName("boeing737").buildCockpit("cockpit").build();
    }

}
