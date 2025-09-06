package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.N.a;
import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.annotation.O.d;
import com.fasterxml.jackson.databind.introspect.F;

public class j extends d {
    protected final com.fasterxml.jackson.databind.ser.d c;
    private static final long d = 1L;

    public j(F f0, com.fasterxml.jackson.databind.ser.d d0) {
        this(f0.f(), d0);
    }

    protected j(Class class0, com.fasterxml.jackson.databind.ser.d d0) {
        super(class0);
        this.c = d0;
    }

    @Override  // com.fasterxml.jackson.annotation.O$d
    public boolean a(N n0) {
        return n0.getClass() == this.getClass() && ((j)n0).d() == this.a && ((j)n0).c == this.c;
    }

    @Override  // com.fasterxml.jackson.annotation.N
    public N b(Class class0) {
        return class0 == this.a ? this : new j(class0, this.c);
    }

    @Override  // com.fasterxml.jackson.annotation.O$a
    public Object c(Object object0) {
        try {
            return this.c.B(object0);
        }
        catch(RuntimeException runtimeException0) {
            throw runtimeException0;
        }
        catch(Exception exception0) {
            throw new IllegalStateException("Problem accessing property \'" + this.c.getName() + "\': " + exception0.getMessage(), exception0);
        }
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

