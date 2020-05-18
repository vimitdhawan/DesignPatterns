package com.aircraft.fire;

import com.aircraft.abstracts.AbstractRequest;

public class FireRequest extends AbstractRequest {
    private static int code =1;

    public FireRequest() {
        super(code);
    }
}
