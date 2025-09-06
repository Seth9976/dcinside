package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.a;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.jsontype.j;

public class i extends b {
    protected final String c;

    public i(g g0, d d0, String s) {
        super(g0, d0);
        this.c = s;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.b
    public b D(d d0) {
        return this.E(d0);
    }

    public i E(d d0) {
        return this.b == d0 ? this : new i(this.a, d0, this.c);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.b
    public j b(d d0) {
        return this.E(d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.v
    public String c() {
        return this.c;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.b
    public a e() {
        return a.a;
    }
}

