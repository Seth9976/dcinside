package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.cfg.c;
import com.fasterxml.jackson.databind.cfg.f;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.j;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.i;
import com.fasterxml.jackson.databind.util.k;
import j..util.Objects;
import j..util.Optional;
import java.io.IOException;

@b
public class m extends I implements j {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            a.a = arr_v;
            try {
                arr_v[c.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected Object[] g;
    private final Enum h;
    protected final i i;
    protected volatile i j;
    protected final Boolean k;
    private Boolean l;
    private Boolean m;
    protected final boolean n;
    protected final i o;
    private static final long p = 1L;

    @Deprecated
    protected m(m m0, Boolean boolean0) {
        this(m0, boolean0, null, null);
    }

    protected m(m m0, Boolean boolean0, Boolean boolean1, Boolean boolean2) {
        super(m0);
        this.i = m0.i;
        this.g = m0.g;
        this.h = m0.h;
        this.k = boolean0;
        this.n = m0.n;
        this.l = boolean1;
        this.m = boolean2;
        this.o = m0.o;
        this.j = m0.j;
    }

    @Deprecated
    public m(k k0) {
        this(k0, null);
    }

    @Deprecated
    public m(k k0, Boolean boolean0) {
        this(k0, boolean0.booleanValue(), null, null);
    }

    @Deprecated
    public m(k k0, boolean z, k k1) {
        super(k0.w());
        this.i = k0.i();
        this.g = k0.z();
        this.h = k0.s();
        this.k = Boolean.valueOf(z);
        this.n = k0.A();
        this.o = k1 == null ? null : k1.i();
        this.j = null;
    }

    public m(k k0, boolean z, k k1, k k2) {
        super(k0.w());
        this.i = k0.i();
        this.g = k0.z();
        this.h = k0.s();
        this.k = Boolean.valueOf(z);
        this.n = k0.A();
        i i0 = null;
        this.o = k1 == null ? null : k1.i();
        if(k2 != null) {
            i0 = k2.i();
        }
        this.j = i0;
    }

    public static n A1(g g0, Class class0, l l0) {
        if(g0.c()) {
            h.i(l0.L(), g0.a0(t.q));
        }
        return new p(class0, l0);
    }

    // 去混淆评级： 低(20)
    protected boolean B1(com.fasterxml.jackson.databind.h h0) {
        return this.h != null && (Boolean.TRUE.equals(this.l) || h0.J0(com.fasterxml.jackson.databind.i.A));
    }

    // 去混淆评级： 低(20)
    protected boolean C1(com.fasterxml.jackson.databind.h h0) {
        return Boolean.TRUE.equals(this.m) || h0.J0(com.fasterxml.jackson.databind.i.z);
    }

    @Deprecated
    public m D1(Boolean boolean0) {
        return this.E1(boolean0, this.l, this.m);
    }

    // 去混淆评级： 低(30)
    public m E1(Boolean boolean0, Boolean boolean1, Boolean boolean2) {
        return !Objects.equals(this.k, boolean0) || !Objects.equals(this.l, boolean1) || !Objects.equals(this.m, boolean2) ? new m(this, boolean0, boolean1, boolean2) : this;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(com.fasterxml.jackson.databind.h h0, d d0) throws o {
        return this.E1(((Boolean)Optional.ofNullable(this.g1(h0, d0, this.s(), com.fasterxml.jackson.annotation.n.a.b)).orElse(this.k)), ((Boolean)Optional.ofNullable(this.g1(h0, d0, this.s(), com.fasterxml.jackson.annotation.n.a.d)).orElse(this.l)), ((Boolean)Optional.ofNullable(this.g1(h0, d0, this.s(), com.fasterxml.jackson.annotation.n.a.c)).orElse(this.m)));
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
        if(n0.Y3(r.q)) {
            return this.v1(n0, h0, n0.R2());
        }
        if(n0.Y3(r.r)) {
            return this.n ? this.v1(n0, h0, n0.R2()) : this.u1(n0, h0, n0.Q1());
        }
        return n0.e4() ? this.v1(n0, h0, h0.T(n0, this, this.a)) : this.s1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object o(com.fasterxml.jackson.databind.h h0) throws o {
        return this.h;
    }

    private final Object r1(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0, i i0, String s) throws IOException {
        String s1 = s.trim();
        if(s1.isEmpty()) {
            if(this.B1(h0)) {
                return this.h;
            }
            if(this.C1(h0)) {
                return null;
            }
            switch((s.isEmpty() ? this.C(h0, this.c0(h0), this.s(), s, "empty String (\"\")") : this.C(h0, this.a0(h0), this.s(), s, "blank String (all whitespace)"))) {
                case 2: 
                case 3: {
                    return this.o(h0);
                }
                default: {
                    return null;
                }
            }
        }
        if(Boolean.TRUE.equals(this.k)) {
            Object object0 = i0.d(s1);
            if(object0 != null) {
                return object0;
            }
        }
        if(!h0.J0(com.fasterxml.jackson.databind.i.i) && !this.n) {
            int v = s1.charAt(0);
            if(v >= 0x30 && v <= 57) {
                try {
                    int v1 = Integer.parseInt(s1);
                    if(!h0.z(t.F)) {
                        return h0.C0(this.t1(), s1, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                    }
                    if(v1 >= 0) {
                        Object[] arr_object = this.g;
                        if(v1 < arr_object.length) {
                            return arr_object[v1];
                        }
                    }
                }
                catch(NumberFormatException unused_ex) {
                }
            }
        }
        if(this.B1(h0)) {
            return this.h;
        }
        return this.C1(h0) ? null : h0.C0(this.t1(), s1, "not one of the values accepted for Enum class: %s", new Object[]{i0.f()});
    }

    // 去混淆评级： 低(20)
    protected Object s1(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0) throws IOException {
        return n0.Y3(r.m) ? this.U(n0, h0) : h0.v0(this.t1(), n0);
    }

    protected Class t1() {
        return this.s();
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return true;
    }

    protected Object u1(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0, int v) throws IOException {
        c c0 = h0.V(this.w(), this.s(), f.c);
        if(c0 == c.a) {
            if(h0.J0(com.fasterxml.jackson.databind.i.i)) {
                return h0.B0(this.t1(), v, "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            this.C(h0, c0, this.s(), v, "Integer value (" + v + ")");
        }
        switch(c0) {
            case 1: {
                return null;
            }
            case 2: {
                return this.o(h0);
            }
            default: {
                if(v >= 0) {
                    Object[] arr_object = this.g;
                    if(v < arr_object.length) {
                        return arr_object[v];
                    }
                }
                if(this.B1(h0)) {
                    return this.h;
                }
                return this.C1(h0) ? null : h0.B0(this.t1(), v, "index value outside legal index range [0..%s]", new Object[]{((int)(this.g.length - 1))});
            }
        }
    }

    protected Object v1(com.fasterxml.jackson.core.n n0, com.fasterxml.jackson.databind.h h0, String s) throws IOException {
        i i0 = this.x1(h0);
        Object object0 = i0.c(s);
        if(object0 == null) {
            String s1 = s.trim();
            if(s1 != s) {
                Object object1 = i0.c(s1);
                return object1 == null ? this.r1(n0, h0, i0, s1) : object1;
            }
            return this.r1(n0, h0, i0, s1);
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.I
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.i;
    }

    @Deprecated
    protected i w1(com.fasterxml.jackson.databind.h h0) {
        i i0 = this.j;
        if(i0 == null) {
            synchronized(this) {
                i0 = this.j;
                if(i0 == null) {
                    i i1 = k.q(h0.g0(), this.t1()).i();
                    this.j = i1;
                    i0 = i1;
                }
            }
        }
        return i0;
    }

    private i x1(com.fasterxml.jackson.databind.h h0) {
        i i0 = this.o;
        if(i0 != null) {
            return i0;
        }
        return h0.J0(com.fasterxml.jackson.databind.i.y) ? this.w1(h0) : this.i;
    }

    @Deprecated
    public static n y1(g g0, Class class0, l l0) {
        return m.z1(g0, class0, l0, null, null);
    }

    public static n z1(g g0, Class class0, l l0, B b0, y[] arr_y) {
        if(g0.c()) {
            h.i(l0.L(), g0.a0(t.q));
        }
        return new p(class0, l0, l0.E(0), b0, arr_y);
    }
}

