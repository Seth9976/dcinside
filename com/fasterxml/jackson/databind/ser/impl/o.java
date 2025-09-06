package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.c;
import com.fasterxml.jackson.databind.ser.m;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class o extends m implements Serializable {
    protected final Map a;
    protected com.fasterxml.jackson.databind.ser.o b;
    protected boolean c;
    private static final long d = 1L;

    public o() {
        this(new HashMap());
    }

    public o(Map map0) {
        this.c = true;
        for(Object object0: map0.values()) {
            if(!(object0 instanceof com.fasterxml.jackson.databind.ser.o)) {
                this.a = o.d(map0);
                return;
            }
            if(false) {
                break;
            }
        }
        this.a = map0;
    }

    @Override  // com.fasterxml.jackson.databind.ser.m
    @Deprecated
    public c a(Object object0) {
        throw new UnsupportedOperationException("Access to deprecated filters not supported");
    }

    @Override  // com.fasterxml.jackson.databind.ser.m
    public com.fasterxml.jackson.databind.ser.o b(Object object0, Object object1) {
        com.fasterxml.jackson.databind.ser.o o0 = (com.fasterxml.jackson.databind.ser.o)this.a.get(object0);
        if(o0 == null) {
            o0 = this.b;
            if(o0 == null && this.c) {
                throw new IllegalArgumentException("No filter configured with id \'" + object0 + "\' (type " + object0.getClass().getName() + ")");
            }
        }
        return o0;
    }

    private static final com.fasterxml.jackson.databind.ser.o c(c c0) {
        return n.k(c0);
    }

    private static final Map d(Map map0) {
        Map map1 = new HashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            if(object1 instanceof com.fasterxml.jackson.databind.ser.o) {
                ((HashMap)map1).put(map$Entry0.getKey(), ((com.fasterxml.jackson.databind.ser.o)object1));
            }
            else {
                if(!(object1 instanceof c)) {
                    throw new IllegalArgumentException("Unrecognized filter type (" + object1.getClass().getName() + ")");
                }
                ((HashMap)map1).put(map$Entry0.getKey(), o.c(((c)object1)));
            }
        }
        return map1;
    }

    @Deprecated
    public o e(String s, c c0) {
        com.fasterxml.jackson.databind.ser.o o0 = o.c(c0);
        this.a.put(s, o0);
        return this;
    }

    public o f(String s, com.fasterxml.jackson.databind.ser.o o0) {
        this.a.put(s, o0);
        return this;
    }

    public o g(String s, n n0) {
        this.a.put(s, n0);
        return this;
    }

    public com.fasterxml.jackson.databind.ser.o h() {
        return this.b;
    }

    public com.fasterxml.jackson.databind.ser.o i(String s) {
        return (com.fasterxml.jackson.databind.ser.o)this.a.remove(s);
    }

    @Deprecated
    public o j(c c0) {
        this.b = n.k(c0);
        return this;
    }

    public o k(com.fasterxml.jackson.databind.ser.o o0) {
        this.b = o0;
        return this;
    }

    public o l(n n0) {
        this.b = n0;
        return this;
    }

    public o m(boolean z) {
        this.c = z;
        return this;
    }

    public boolean n() {
        return this.c;
    }
}

