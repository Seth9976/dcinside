package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.jsontype.f;
import java.io.IOException;

public class w extends D {
    private static final long f = 1L;
    public static final w g;

    static {
        w.g = new w();
    }

    public w() {
        super(Object.class);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException {
        if(n0.Y3(r.o)) {
            while(true) {
                r r0 = n0.m4();
                if(r0 == null || r0 == r.l) {
                    break;
                }
                n0.I4();
            }
        }
        else {
            n0.I4();
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(n n0, h h0, f f0) throws IOException {
        switch(n0.d0()) {
            case 1: 
            case 3: 
            case 5: {
                return f0.c(n0, h0);
            }
            default: {
                return null;
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Boolean y(g g0) {
        return false;
    }
}

