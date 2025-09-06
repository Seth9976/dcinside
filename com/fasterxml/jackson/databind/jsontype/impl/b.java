package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.a;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.jsontype.j;

public class b extends v {
    public b(g g0, d d0) {
        super(g0, d0);
    }

    public b D(d d0) {
        return this.b == d0 ? this : new b(this.a, d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.j
    public j b(d d0) {
        return this.D(d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.v
    public a e() {
        return a.c;
    }
}

