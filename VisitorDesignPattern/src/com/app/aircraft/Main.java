package com.app.aircraft;

import com.app.aircraft.element.MetricVisitor;
import com.app.aircraft.visitor.Aircraft;
import com.app.aircraft.visitor.Boeing7;
import com.app.aircraft.visitor.G17;

public class Main {
    public static void main(String[] args) {
        Aircraft boeing7 = new Boeing7();
        Aircraft g17 = new G17();
        MetricVisitor metricVisitor = new MetricVisitor();
        boeing7.accept(metricVisitor);
        g17.accept(metricVisitor);

    }
}
