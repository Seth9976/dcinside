package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.H.b;
import com.fasterxml.jackson.databind.e;
import com.fasterxml.jackson.databind.jsontype.d;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.h;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;

public class l extends t {
    protected final d c;
    private static final String d = "java.util.";

    @Deprecated
    protected l(m m0, q q0) {
        this(m0, q0, com.fasterxml.jackson.databind.jsontype.impl.m.d);
    }

    public l(m m0, q q0, d d0) {
        super(m0, q0);
        this.c = d0;
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public String a(Object object0) {
        return this.h(object0, object0.getClass(), this.a);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.t
    public String b() {
        return "class name used as type id";
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.impl.t
    public m c(e e0, String s) throws IOException {
        return this.i(s, e0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public String e(Object object0, Class class0) {
        return this.h(object0, class0, this.a);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.g
    public b g() {
        return b.c;
    }

    protected String h(Object object0, Class class0, q q0) {
        if(h.Y(class0) && !class0.isEnum()) {
            class0 = class0.getSuperclass();
        }
        String s = class0.getName();
        if(s.startsWith("java.util.")) {
            if(object0 instanceof EnumSet) {
                Class class1 = h.w(((EnumSet)object0));
                return q0.I(EnumSet.class, class1).w();
            }
            if(object0 instanceof EnumMap) {
                Class class2 = h.v(((EnumMap)object0));
                return q0.O(EnumMap.class, class2, Object.class).w();
            }
            return s;
        }
        return s.indexOf(36) < 0 || h.N(class0) == null || h.N(this.b.g()) != null ? s : this.b.g().getName();
    }

    protected m i(String s, e e0) throws IOException {
        m m0 = e0.F(this.b, s, this.c);
        return m0 != null || !(e0 instanceof com.fasterxml.jackson.databind.h) ? m0 : ((com.fasterxml.jackson.databind.h)e0).y0(this.b, s, this, "no such class found");
    }

    public static l j(m m0, com.fasterxml.jackson.databind.cfg.t t0, d d0) {
        return new l(m0, t0.S(), d0);
    }

    public void k(Class class0, String s) {
    }
}

