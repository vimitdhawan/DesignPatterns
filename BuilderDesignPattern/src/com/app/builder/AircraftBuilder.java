package com.app.builder;

public interface AircraftBuilder {

     AircraftBuilder buildName(String name);
     AircraftBuilder buildCockpit(String cockpit);
     Aircraft build();


}
