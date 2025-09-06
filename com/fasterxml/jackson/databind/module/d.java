package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.core.H;
import com.fasterxml.jackson.databind.D;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.h;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.s;
import com.fasterxml.jackson.databind.ser.i;
import com.fasterxml.jackson.databind.w;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class d extends w implements Serializable {
    protected final String a;
    protected final H b;
    protected final boolean c;
    protected e d;
    protected b e;
    protected e f;
    protected c g;
    protected a h;
    protected f i;
    protected h j;
    protected i k;
    protected HashMap l;
    protected LinkedHashSet m;
    protected D n;
    private static final long o = 1L;
    private static final AtomicInteger p;

    static {
        d.p = new AtomicInteger(1);
    }

    public d() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.a = this.getClass() == d.class ? "SimpleModule-" + d.p.getAndIncrement() : this.getClass().getName();
        this.b = H.k();
        this.c = false;
    }

    public d(H h0) {
        this(h0.b(), h0);
    }

    public d(String s) {
        this(s, H.k());
    }

    public d(String s, H h0) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.a = s;
        this.b = h0;
        this.c = true;
    }

    public d(String s, H h0, List list0) {
        this(s, h0, null, list0);
    }

    public d(String s, H h0, Map map0) {
        this(s, h0, map0, null);
    }

    public d(String s, H h0, Map map0, List list0) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.a = s;
        this.c = true;
        this.b = h0;
        if(map0 != null) {
            this.e = new b(map0);
        }
        if(list0 != null) {
            this.d = new e(list0);
        }
    }

    public void A(f f0) {
        this.i = f0;
    }

    @Override  // com.fasterxml.jackson.databind.w
    public String b() {
        return this.a;
    }

    @Override  // com.fasterxml.jackson.databind.w
    public Object c() {
        if(this.c) {
            return this.a;
        }
        return this.getClass() == d.class ? this.a : super.c();
    }

    @Override  // com.fasterxml.jackson.databind.w
    public void d(com.fasterxml.jackson.databind.w.a w$a0) {
        e e0 = this.d;
        if(e0 != null) {
            w$a0.g0(e0);
        }
        b b0 = this.e;
        if(b0 != null) {
            w$a0.h0(b0);
        }
        e e1 = this.f;
        if(e1 != null) {
            w$a0.t0(e1);
        }
        c c0 = this.g;
        if(c0 != null) {
            w$a0.r0(c0);
        }
        a a0 = this.h;
        if(a0 != null) {
            w$a0.f0(a0);
        }
        f f0 = this.i;
        if(f0 != null) {
            w$a0.j0(f0);
        }
        h h0 = this.j;
        if(h0 != null) {
            w$a0.D0(h0);
        }
        i i0 = this.k;
        if(i0 != null) {
            w$a0.A0(i0);
        }
        if(this.m != null && this.m.size() > 0) {
            w$a0.s0(((com.fasterxml.jackson.databind.jsontype.c[])this.m.toArray(new com.fasterxml.jackson.databind.jsontype.c[this.m.size()])));
        }
        D d0 = this.n;
        if(d0 != null) {
            w$a0.E0(d0);
        }
        HashMap hashMap0 = this.l;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.entrySet()) {
                w$a0.y0(((Class)((Map.Entry)object0).getKey()), ((Class)((Map.Entry)object0).getValue()));
            }
        }
    }

    protected void e(Object object0, String s) {
        if(object0 == null) {
            throw new IllegalArgumentException(String.format("Cannot pass `null` as %s", s));
        }
    }

    public d f(Class class0, Class class1) {
        this.e(class0, "abstract type to map");
        this.e(class1, "concrete type to map to");
        if(this.h == null) {
            this.h = new a();
        }
        this.h = this.h.d(class0, class1);
        return this;
    }

    public d g(Class class0, n n0) {
        this.e(class0, "type to register deserializer for");
        this.e(n0, "deserializer");
        if(this.e == null) {
            this.e = new b();
        }
        this.e.l(class0, n0);
        return this;
    }

    public d h(Class class0, s s0) {
        this.e(class0, "type to register key deserializer for");
        this.e(s0, "key deserializer");
        if(this.g == null) {
            this.g = new c();
        }
        this.g.b(class0, s0);
        return this;
    }

    public d i(Class class0, r r0) {
        this.e(class0, "type to register key serializer for");
        this.e(r0, "key serializer");
        if(this.f == null) {
            this.f = new e();
        }
        this.f.k(class0, r0);
        return this;
    }

    public d j(r r0) {
        this.e(r0, "serializer");
        if(this.d == null) {
            this.d = new e();
        }
        this.d.j(r0);
        return this;
    }

    public d k(Class class0, r r0) {
        this.e(class0, "type to register serializer for");
        this.e(r0, "serializer");
        if(this.d == null) {
            this.d = new e();
        }
        this.d.k(class0, r0);
        return this;
    }

    public d l(Class class0, B b0) {
        this.e(class0, "class to register value instantiator for");
        this.e(b0, "value instantiator");
        if(this.i == null) {
            this.i = new f();
        }
        this.i = this.i.b(class0, b0);
        return this;
    }

    public d m(Collection collection0) {
        if(this.m == null) {
            this.m = new LinkedHashSet();
        }
        for(Object object0: collection0) {
            this.e(((Class)object0), "subtype to register");
            this.m.add(new com.fasterxml.jackson.databind.jsontype.c(((Class)object0)));
        }
        return this;
    }

    public d n(com.fasterxml.jackson.databind.jsontype.c[] arr_c) {
        if(this.m == null) {
            this.m = new LinkedHashSet();
        }
        for(int v = 0; v < arr_c.length; ++v) {
            com.fasterxml.jackson.databind.jsontype.c c0 = arr_c[v];
            this.e(c0, "subtype to register");
            this.m.add(c0);
        }
        return this;
    }

    public d o(Class[] arr_class) {
        if(this.m == null) {
            this.m = new LinkedHashSet();
        }
        for(int v = 0; v < arr_class.length; ++v) {
            Class class0 = arr_class[v];
            this.e(class0, "subtype to register");
            this.m.add(new com.fasterxml.jackson.databind.jsontype.c(class0));
        }
        return this;
    }

    public void p(a a0) {
        this.h = a0;
    }

    public d q(h h0) {
        this.j = h0;
        return this;
    }

    public void r(b b0) {
        this.e = b0;
    }

    public void s(c c0) {
        this.g = c0;
    }

    public void u(e e0) {
        this.f = e0;
    }

    @Override  // com.fasterxml.jackson.databind.w
    public H version() {
        return this.b;
    }

    public d w(Class class0, Class class1) {
        this.e(class0, "target type");
        this.e(class1, "mixin class");
        if(this.l == null) {
            this.l = new HashMap();
        }
        this.l.put(class0, class1);
        return this;
    }

    protected d x(D d0) {
        this.n = d0;
        return this;
    }

    public d y(i i0) {
        this.k = i0;
        return this;
    }

    public void z(e e0) {
        this.d = e0;
    }
}

