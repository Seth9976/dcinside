package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.e;
import com.fasterxml.jackson.databind.jsontype.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.type.q;
import java.io.IOException;

public abstract class t implements g {
    protected final q a;
    protected final m b;

    protected t() {
        this(null, null);
    }

    protected t(m m0, q q0) {
        this.b = m0;
        this.a = q0;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public String b() {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public m c(e e0, String s) throws IOException {
        throw new IllegalStateException("Sub-class " + this.getClass().getName() + " MUST implement `typeFromId(DatabindContext,String)");
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public void d(m m0) {
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public String f() {
        return this.e(null, this.b.g());
    }
}

