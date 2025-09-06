package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.deser.t;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.s;
import com.fasterxml.jackson.databind.type.b;
import java.io.Serializable;
import java.util.HashMap;

public class c implements t, Serializable {
    protected HashMap a;
    private static final long b = 1L;

    public c() {
        this.a = null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.t
    public s a(m m0, g g0, com.fasterxml.jackson.databind.c c0) {
        return this.a == null ? null : ((s)this.a.get(new b(m0.g())));
    }

    public c b(Class class0, s s0) {
        if(this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(new b(class0), s0);
        return this;
    }
}

