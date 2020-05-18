package com.aircraft.engine;

import com.aircraft.abstracts.AbstractRequest;

public class EngineRequest extends AbstractRequest {
    private static int code = 2;
    public EngineRequest() {
        super(code);
    }
}
