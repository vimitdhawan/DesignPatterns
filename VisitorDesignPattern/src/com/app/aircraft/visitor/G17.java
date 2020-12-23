package com.app.aircraft.visitor;

import com.app.aircraft.element.AircraftVisitor;

public class G17 implements Aircraft{
    @Override
    public void accept(AircraftVisitor aircraftVisitor) {
        aircraftVisitor.visitG17();
    }
}
