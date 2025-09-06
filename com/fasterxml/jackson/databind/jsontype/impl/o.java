package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.b;
import com.fasterxml.jackson.databind.e;
import com.fasterxml.jackson.databind.jsontype.c;
import com.fasterxml.jackson.databind.m;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeSet;

public class o extends t {
    protected final com.fasterxml.jackson.databind.cfg.t c;
    protected final ConcurrentHashMap d;
    protected final Map e;
    protected final boolean f;

    protected o(com.fasterxml.jackson.databind.cfg.t t0, m m0, ConcurrentHashMap concurrentHashMap0, HashMap hashMap0) {
        super(m0, t0.S());
        this.c = t0;
        this.d = concurrentHashMap0;
        this.e = hashMap0;
        this.f = t0.a0(com.fasterxml.jackson.databind.t.A);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public String a(Object object0) {
        return this.k(object0.getClass());
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.t
    public String b() {
        TreeSet treeSet0 = new TreeSet();
        for(Object object0: this.e.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((m)map$Entry0.getValue()).n()) {
                treeSet0.add(map$Entry0.getKey());
            }
        }
        return treeSet0.toString();
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.t
    public m c(e e0, String s) {
        return this.i(s);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public String e(Object object0, Class class0) {
        return object0 == null ? this.k(class0) : this.a(object0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public b g() {
        return b.f;
    }

    protected static String h(Class class0) {
        String s = class0.getName();
        int v = Math.max(s.lastIndexOf(46), s.lastIndexOf(36));
        return v < 0 ? s : s.substring(v + 1);
    }

    protected m i(String s) {
        if(this.f) {
            s = s.toLowerCase();
        }
        return (m)this.e.get(s);
    }

    public static o j(com.fasterxml.jackson.databind.cfg.t t0, m m0, Collection collection0, boolean z, boolean z1) {
        HashMap hashMap0;
        ConcurrentHashMap concurrentHashMap0;
        if(z == z1) {
            throw new IllegalArgumentException();
        }
        if(z) {
            concurrentHashMap0 = new ConcurrentHashMap();
            hashMap0 = null;
        }
        else {
            hashMap0 = new HashMap();
            concurrentHashMap0 = new ConcurrentHashMap(4);
        }
        boolean z2 = t0.a0(com.fasterxml.jackson.databind.t.A);
        if(collection0 != null) {
            for(Object object0: collection0) {
                c c0 = (c)object0;
                Class class0 = c0.a();
                String s = c0.b() ? c0.getName() : o.h(class0);
                if(z) {
                    concurrentHashMap0.put(class0.getName(), s);
                }
                if(z1) {
                    if(z2) {
                        s = s.toLowerCase();
                    }
                    m m1 = (m)hashMap0.get(s);
                    if(m1 == null || !class0.isAssignableFrom(m1.g())) {
                        hashMap0.put(s, t0.h(class0));
                    }
                }
            }
        }
        return new o(t0, m0, concurrentHashMap0, hashMap0);
    }

    protected String k(Class class0) {
        if(class0 == null) {
            return null;
        }
        String s = class0.getName();
        String s1 = (String)this.d.get(s);
        if(s1 == null) {
            Class class1 = this.a.f0(class0).g();
            if(this.c.Z()) {
                com.fasterxml.jackson.databind.c c0 = this.c.W(class1);
                s1 = this.c.n().q0(c0.A());
            }
            if(s1 == null) {
                s1 = o.h(class1);
            }
            this.d.put(s, s1);
        }
        return s1;
    }

    @Override
    public String toString() {
        return String.format("[%s; id-to-type=%s]", this.getClass().getName(), this.e);
    }
}

