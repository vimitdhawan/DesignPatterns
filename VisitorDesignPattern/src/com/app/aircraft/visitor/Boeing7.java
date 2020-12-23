package com.app.aircraft.visitor;

import com.app.aircraft.element.AircraftVisitor;

public class Boeing7 implements Aircraft{
    @Override
    public void accept(AircraftVisitor aircraftVisitor) {
        aircraftVisitor.visitBoeing7();
    }
}
