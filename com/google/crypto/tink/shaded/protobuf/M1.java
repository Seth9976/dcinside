package com.google.crypto.tink.shaded.protobuf;

import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

@y
final class m1 {
    private final u1 a;
    private final ConcurrentMap b;
    private static final m1 c;

    static {
        m1.c = new m1();
    }

    private m1() {
        this.b = new ConcurrentHashMap();
        this.a = new J0();
    }

    public static m1 a() {
        return m1.c;
    }

    int b() {
        int v = 0;
        for(Object object0: this.b.values()) {
            t1 t10 = (t1)object0;
            if(t10 instanceof U0) {
                v += ((U0)t10).r();
            }
        }
        return v;
    }

    boolean c(Object object0) {
        return this.j(object0).isInitialized(object0);
    }

    public void d(Object object0) {
        this.j(object0).makeImmutable(object0);
    }

    public void e(Object object0, r1 r10) throws IOException {
        this.f(object0, r10, V.d());
    }

    public void f(Object object0, r1 r10, V v0) throws IOException {
        this.j(object0).b(object0, r10, v0);
    }

    public t1 g(Class class0, t1 t10) {
        t0.e(class0, "messageType");
        t0.e(t10, "schema");
        return (t1)this.b.putIfAbsent(class0, t10);
    }

    @x
    public t1 h(Class class0, t1 t10) {
        t0.e(class0, "messageType");
        t0.e(t10, "schema");
        return (t1)this.b.put(class0, t10);
    }

    public t1 i(Class class0) {
        t0.e(class0, "messageType");
        t1 t10 = (t1)this.b.get(class0);
        if(t10 == null) {
            t10 = this.a.createSchema(class0);
            t1 t11 = this.g(class0, t10);
            return t11 == null ? t10 : t11;
        }
        return t10;
    }

    public t1 j(Object object0) {
        return this.i(object0.getClass());
    }

    public void k(Object object0, e2 e20) throws IOException {
        this.j(object0).c(object0, e20);
    }
}

