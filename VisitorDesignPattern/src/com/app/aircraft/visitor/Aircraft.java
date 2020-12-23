package com.app.aircraft.visitor;

import com.app.aircraft.element.AircraftVisitor;

public interface Aircraft {
    void accept(AircraftVisitor aircraftVisitor);
}
