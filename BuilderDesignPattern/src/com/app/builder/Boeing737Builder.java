package com.app.builder;

public class Boeing737Builder implements AircraftBuilder{
    private Boeing737 boeing737;

    public Boeing737Builder() {
        boeing737 = new Boeing737();
    }

    @Override
    public AircraftBuilder buildName(String name) {
        boeing737.setName(name);
        return this;
    }

    @Override
    public AircraftBuilder buildCockpit(String cockpit) {
        boeing737.setCockpit(cockpit);
        return this;
    }

    @Override
    public Aircraft build() {
        return boeing737;
    }
}
