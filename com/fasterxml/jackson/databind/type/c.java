package com.fasterxml.jackson.databind.type;

import java.util.ArrayList;

public final class c {
    protected final c a;
    protected final Class b;
    private ArrayList c;

    private c(c c0, Class class0) {
        this.a = c0;
        this.b = class0;
    }

    public c(Class class0) {
        this(null, class0);
    }

    public void a(m m0) {
        if(this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(m0);
    }

    public c b(Class class0) {
        return new c(this, class0);
    }

    public c c(Class class0) {
        if(this.b == class0) {
            return this;
        }
        for(c c0 = this.a; c0 != null; c0 = c0.a) {
            if(c0.b == class0) {
                return c0;
            }
        }
        return null;
    }

    public void d(com.fasterxml.jackson.databind.m m0) {
        ArrayList arrayList0 = this.c;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                ((m)object0).s0(m0);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("[ClassStack (self-refs: ");
        stringBuilder0.append((this.c == null ? "0" : String.valueOf(this.c.size())));
        stringBuilder0.append(')');
        for(c c0 = this; c0 != null; c0 = c0.a) {
            stringBuilder0.append(' ');
            stringBuilder0.append(c0.b.getName());
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

