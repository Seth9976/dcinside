package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.m;

abstract class f extends o {
    private static final long n = 1L;

    protected f(Class class0, p p0, m m0, m[] arr_m, int v, Object object0, Object object1, boolean z) {
        super(class0, p0, m0, arr_m, v, object0, object1, z);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public final boolean equals(Object object0) {
        return object0 == this;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public final int hashCode() {
        return System.identityHashCode(this);
    }
}

