package com.google.common.eventbus;

import com.google.common.base.H;
import com.google.common.base.z;

@e
public class c {
    private final Object a;
    private final Object b;

    public c(Object object0, Object object1) {
        this.a = H.E(object0);
        this.b = H.E(object1);
    }

    public Object a() {
        return this.b;
    }

    public Object b() {
        return this.a;
    }

    @Override
    public String toString() {
        return z.c(this).f("source", this.a).f("event", this.b).toString();
    }
}

