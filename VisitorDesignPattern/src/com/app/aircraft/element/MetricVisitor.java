package com.app.aircraft.element;

public class MetricVisitor implements AircraftVisitor {
    @Override
    public void visitG17() {
        System.out.println("G17 Metric");
    }

    @Override
    public void visitBoeing7() {
        System.out.println("Boeing Metric");
    }
}
