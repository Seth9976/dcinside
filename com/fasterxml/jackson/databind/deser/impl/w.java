package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.N.a;
import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.annotation.O.d;

public class w extends d {
    private static final long c = 1L;

    public w(Class class0) {
        super(class0);
    }

    @Override  // com.fasterxml.jackson.annotation.N
    public N b(Class class0) {
        return class0 == this.a ? this : new w(class0);
    }

    @Override  // com.fasterxml.jackson.annotation.O$a
    public Object c(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.fasterxml.jackson.annotation.N
    public a f(Object object0) {
        return object0 == null ? null : new a(this.getClass(), this.a, object0);
    }

    @Override  // com.fasterxml.jackson.annotation.N
    public N h(Object object0) {
        return this;
    }
}

