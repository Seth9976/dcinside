package com.google.common.graph;

import P1.b;
import com.google.common.base.H;
import com.google.common.collect.E2;
import com.google.common.collect.Q2;
import com.google.common.collect.S3;
import j..util.DesugarCollections;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o3.a;

@x
final class o0 extends k {
    @b
    @a
    private transient Reference b;

    private o0(Map map0) {
        super(map0);
    }

    @Override  // com.google.common.graph.c0
    public Set a() {
        return DesugarCollections.unmodifiableSet(this.n().f());
    }

    @Override  // com.google.common.graph.k
    public Object f(Object object0) {
        Object object1 = super.f(object0);
        S3 s30 = (S3)o0.o(this.b);
        if(s30 != null) {
            H.g0(s30.remove(object1));
        }
        return object1;
    }

    @Override  // com.google.common.graph.k
    @a
    public Object h(Object object0, boolean z) {
        return z ? null : this.f(object0);
    }

    @Override  // com.google.common.graph.k
    public void i(Object object0, Object object1) {
        super.i(object0, object1);
        S3 s30 = (S3)o0.o(this.b);
        if(s30 != null) {
            H.g0(s30.add(object1));
        }
    }

    @Override  // com.google.common.graph.k
    public void j(Object object0, Object object1, boolean z) {
        if(!z) {
            this.i(object0, object1);
        }
    }

    @Override  // com.google.common.graph.c0
    public Set l(Object object0) {
        class com.google.common.graph.o0.a extends V {
            final Object c;
            final o0 d;

            com.google.common.graph.o0.a(Map map0, Object object0, Object object1) {
                this.c = object1;
                super(map0, object0);
            }

            @Override
            public int size() {
                return o0.this.n().y3(this.c);
            }
        }

        return new com.google.common.graph.o0.a(this, this.a, object0, object0);
    }

    private S3 n() {
        S3 s30 = (S3)o0.o(this.b);
        if(s30 == null) {
            s30 = E2.n(this.a.values());
            this.b = new SoftReference(s30);
        }
        return s30;
    }

    @a
    private static Object o(@a Reference reference0) {
        return reference0 == null ? null : reference0.get();
    }

    static o0 p() {
        return new o0(new HashMap(2, 1.0f));
    }

    static o0 q(Map map0) {
        return new o0(Q2.g(map0));
    }
}

