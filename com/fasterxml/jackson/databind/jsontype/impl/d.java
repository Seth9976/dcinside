package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.a;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.jsontype.j;
import java.io.IOException;

public class d extends v {
    private static final d c;

    static {
        d.c = new d();
    }

    protected d() {
        super(null, null);
    }

    public d D(com.fasterxml.jackson.databind.d d0) [...] // Inlined contents

    public static d E() {
        return d.c;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.j
    public j b(com.fasterxml.jackson.databind.d d0) {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.v
    public a e() {
        return a.e;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.v
    public c o(k k0, c c0) throws IOException {
        if(c0.f.i()) {
            if(k0.x()) {
                c0.g = false;
                r r0 = c0.f;
                if(r0 == r.k) {
                    k0.E4(c0.a);
                    return c0;
                }
                if(r0 == r.m) {
                    k0.B4(c0.a);
                }
                return c0;
            }
            return k0.M4(c0);
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.v
    public c v(k k0, c c0) throws IOException {
        return c0 == null ? null : k0.N4(c0);
    }
}

