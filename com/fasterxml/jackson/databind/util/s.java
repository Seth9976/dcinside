package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.q;
import java.io.IOException;

public class s implements q {
    protected final String a;
    protected final String b;
    protected final Object c;
    protected final m d;

    public s(String s, String s1, Object object0) {
        this(s, s1, object0, null);
    }

    public s(String s, String s1, Object object0, m m0) {
        this.a = s;
        this.b = s1;
        this.c = object0;
        this.d = m0;
    }

    @Override  // com.fasterxml.jackson.databind.q
    public void H(k k0, I i0, j j0) throws IOException {
        this.P(k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.q
    public void P(k k0, I i0) throws IOException {
        String s = this.a;
        if(s != null) {
            k0.r4(s);
        }
        Object object0 = this.c;
        if(object0 == null) {
            i0.X(k0);
        }
        else {
            m m0 = this.d;
            if(m0 == null) {
                i0.m0(object0.getClass(), true, null).m(this.c, k0, i0);
            }
            else {
                i0.k0(m0, true, null).m(this.c, k0, i0);
            }
        }
        String s1 = this.b;
        if(s1 != null) {
            k0.r4(s1);
        }
    }

    public String a() {
        return this.a;
    }

    public m b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public Object d() {
        return this.c;
    }
}

