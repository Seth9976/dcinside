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
final class t extends e {
    @b
    @a
    private transient Reference d;
    @b
    @a
    private transient Reference e;

    private t(Map map0, Map map1, int v) {
        super(map0, map1, v);
    }

    @Override  // com.google.common.graph.c0
    public Set b() {
        return DesugarCollections.unmodifiableSet(this.s().f());
    }

    @Override  // com.google.common.graph.c0
    public Set c() {
        return DesugarCollections.unmodifiableSet(this.r().f());
    }

    @Override  // com.google.common.graph.e
    public Object f(Object object0) {
        Object object1 = super.f(object0);
        S3 s30 = (S3)t.o(this.e);
        if(s30 != null) {
            H.g0(s30.remove(object1));
        }
        return object1;
    }

    @Override  // com.google.common.graph.e
    public Object h(Object object0, boolean z) {
        Object object1 = super.h(object0, z);
        S3 s30 = (S3)t.o(this.d);
        if(s30 != null) {
            H.g0(s30.remove(object1));
        }
        return object1;
    }

    @Override  // com.google.common.graph.e
    public void i(Object object0, Object object1) {
        super.i(object0, object1);
        S3 s30 = (S3)t.o(this.e);
        if(s30 != null) {
            H.g0(s30.add(object1));
        }
    }

    @Override  // com.google.common.graph.e
    public void j(Object object0, Object object1, boolean z) {
        super.j(object0, object1, z);
        S3 s30 = (S3)t.o(this.d);
        if(s30 != null) {
            H.g0(s30.add(object1));
        }
    }

    @Override  // com.google.common.graph.c0
    public Set l(Object object0) {
        class com.google.common.graph.t.a extends V {
            final Object c;
            final t d;

            com.google.common.graph.t.a(Map map0, Object object0, Object object1) {
                this.c = object1;
                super(map0, object0);
            }

            @Override
            public int size() {
                return t.this.s().y3(this.c);
            }
        }

        return new com.google.common.graph.t.a(this, this.b, object0, object0);
    }

    @a
    private static Object o(@a Reference reference0) {
        return reference0 == null ? null : reference0.get();
    }

    static t p() {
        return new t(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    static t q(Map map0, Map map1, int v) {
        return new t(Q2.g(map0), Q2.g(map1), v);
    }

    private S3 r() {
        S3 s30 = (S3)t.o(this.d);
        if(s30 == null) {
            s30 = E2.n(this.a.values());
            this.d = new SoftReference(s30);
        }
        return s30;
    }

    private S3 s() {
        S3 s30 = (S3)t.o(this.e);
        if(s30 == null) {
            s30 = E2.n(this.b.values());
            this.e = new SoftReference(s30);
        }
        return s30;
    }
}

