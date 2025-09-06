package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.o;

public class c extends d {
    protected final o b;
    protected final boolean c;

    public c(o o0) {
        this(o0, false);
    }

    public c(o o0, boolean z) {
        this.b = o0;
        this.c = z;
    }

    public c(String s) {
        this(o.m(s), false);
    }

    @Override  // com.fasterxml.jackson.core.filter.d
    protected boolean a() {
        return this.b.y();
    }

    @Override  // com.fasterxml.jackson.core.filter.d
    public d d() {
        return this;
    }

    @Override  // com.fasterxml.jackson.core.filter.d
    public d e() {
        return this;
    }

    @Override  // com.fasterxml.jackson.core.filter.d
    public d h(int v) {
        o o0 = !this.c || this.b.B() ? this.b.w(v) : this.b.D();
        if(o0 == null) {
            return null;
        }
        return o0.y() ? d.a : this.y(o0, this.c);
    }

    @Override  // com.fasterxml.jackson.core.filter.d
    public d s(String s) {
        o o0 = this.b.x(s);
        if(o0 == null) {
            return null;
        }
        return o0.y() ? d.a : this.y(o0, this.c);
    }

    @Override  // com.fasterxml.jackson.core.filter.d
    public String toString() {
        return "[JsonPointerFilter at: " + this.b + "]";
    }

    protected c y(o o0, boolean z) {
        return new c(o0, z);
    }
}

