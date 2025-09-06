package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.a;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.jsontype.j;

public class e extends i {
    public e(g g0, d d0, String s) {
        super(g0, d0, s);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.i
    public b D(d d0) {
        return this.F(d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.i
    public i E(d d0) {
        return this.F(d0);
    }

    public e F(d d0) {
        return this.b == d0 ? this : new e(this.a, d0, this.c);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.i
    public j b(d d0) {
        return this.F(d0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.i
    public a e() {
        return a.e;
    }
}

