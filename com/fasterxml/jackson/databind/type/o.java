package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.a;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.q;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class o extends m implements q {
    protected final m g;
    protected final m[] h;
    protected final p i;
    volatile transient String j;
    private static final long k = 1L;
    private static final p l;
    private static final m[] m;

    static {
        o.l = p.i();
        o.m = new m[0];
    }

    protected o(o o0) {
        super(o0);
        this.g = o0.g;
        this.h = o0.h;
        this.i = o0.i;
    }

    protected o(Class class0, p p0, m m0, m[] arr_m, int v, Object object0, Object object1, boolean z) {
        super(class0, v, object0, object1, z);
        if(p0 == null) {
            p0 = o.l;
        }
        this.i = p0;
        this.g = m0;
        this.h = arr_m;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public final m A(Class class0) {
        if(class0 == this.a) {
            return this;
        }
        if(class0.isInterface()) {
            m[] arr_m = this.h;
            if(arr_m != null) {
                for(int v = 0; v < arr_m.length; ++v) {
                    m m0 = this.h[v].A(class0);
                    if(m0 != null) {
                        return m0;
                    }
                }
            }
        }
        m m1 = this.g;
        if(m1 != null) {
            m m2 = m1.A(class0);
            return m2 == null ? null : m2;
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m[] B(Class class0) {
        m m0 = this.A(class0);
        return m0 == null ? o.m : m0.D().s();
    }

    @Override  // com.fasterxml.jackson.databind.m
    public p D() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.databind.q
    public void H(k k0, I i0, j j0) throws IOException {
        c c0 = new c(this, r.q);
        j0.o(k0, c0);
        this.P(k0, i0);
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public abstract StringBuilder J(StringBuilder arg1);

    @Override  // com.fasterxml.jackson.databind.m
    public abstract StringBuilder L(StringBuilder arg1);

    @Override  // com.fasterxml.jackson.databind.m
    public List M() {
        m[] arr_m = this.h;
        if(arr_m == null) {
            return Collections.emptyList();
        }
        switch(arr_m.length) {
            case 0: {
                return Collections.emptyList();
            }
            case 1: {
                return Collections.singletonList(arr_m[0]);
            }
            default: {
                return Arrays.asList(arr_m);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.q
    public void P(k k0, I i0) throws IOException {
        k0.d(this.w());
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m Q() {
        return this.g;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public a a(int v) {
        return this.y(v);
    }

    @Override  // com.fasterxml.jackson.databind.m
    public int b() {
        return this.i.r();
    }

    @Override  // com.fasterxml.jackson.databind.m
    @Deprecated
    public String c(int v) {
        return this.i.k(v);
    }

    protected static m n0(Class class0) {
        return class0.getSuperclass() == null ? null : com.fasterxml.jackson.databind.type.q.v0();
    }

    protected static StringBuilder o0(Class class0, StringBuilder stringBuilder0, boolean z) {
        if(class0.isPrimitive()) {
            if(class0 == Boolean.TYPE) {
                stringBuilder0.append('Z');
                return stringBuilder0;
            }
            if(class0 == Byte.TYPE) {
                stringBuilder0.append('B');
                return stringBuilder0;
            }
            if(class0 == Short.TYPE) {
                stringBuilder0.append('S');
                return stringBuilder0;
            }
            if(class0 == Character.TYPE) {
                stringBuilder0.append('C');
                return stringBuilder0;
            }
            if(class0 == Integer.TYPE) {
                stringBuilder0.append('I');
                return stringBuilder0;
            }
            if(class0 == Long.TYPE) {
                stringBuilder0.append('J');
                return stringBuilder0;
            }
            if(class0 == Float.TYPE) {
                stringBuilder0.append('F');
                return stringBuilder0;
            }
            if(class0 == Double.TYPE) {
                stringBuilder0.append('D');
                return stringBuilder0;
            }
            if(class0 != Void.TYPE) {
                throw new IllegalStateException("Unrecognized primitive type: " + class0.getName());
            }
            stringBuilder0.append('V');
            return stringBuilder0;
        }
        stringBuilder0.append('L');
        String s = class0.getName();
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append(((char)(s.charAt(v1) == 46 ? 0x2F : s.charAt(v1))));
        }
        if(z) {
            stringBuilder0.append(';');
        }
        return stringBuilder0;
    }

    protected boolean p0(int v) {
        return this.a.getTypeParameters().length == v;
    }

    protected String q0() {
        return this.a.getName();
    }

    @Override  // com.fasterxml.jackson.core.type.a
    public String w() {
        return this.j == null ? this.q0() : this.j;
    }

    @Override  // com.fasterxml.jackson.databind.m
    public m y(int v) {
        return this.i.l(v);
    }
}

