package com.fasterxml.jackson.databind.type;

import java.io.Serializable;

public final class b implements Serializable, Comparable {
    private String a;
    private Class b;
    private int c;
    private static final long d = 1L;

    public b() {
        this.b = null;
        this.a = null;
        this.c = 0;
    }

    public b(Class class0) {
        this.b = class0;
        String s = class0.getName();
        this.a = s;
        this.c = s.hashCode();
    }

    public int a(b b0) {
        return this.a.compareTo(b0.a);
    }

    public void b(Class class0) {
        this.b = class0;
        String s = class0.getName();
        this.a = s;
        this.c = s.hashCode();
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((b)object0));
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        return object0.getClass() == b.class ? ((b)object0).b == this.b : false;
    }

    @Override
    public int hashCode() {
        return this.c;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

