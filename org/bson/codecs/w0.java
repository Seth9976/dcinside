package org.bson.codecs;

import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;

public class w0 implements b {
    private final Map a;

    public w0() {
        this.a = new HashMap();
        this.c();
    }

    private void a(N n0) {
        Class class0 = n0.d();
        this.a.put(class0, n0);
    }

    @Override  // org.bson.codecs.configuration.b
    public N b(Class class0, d d0) {
        return (N)this.a.get(class0);
    }

    private void c() {
        this.a(new e());
        this.a(new f());
        this.a(new P());
        this.a(new W());
        this.a(new b0());
        this.a(new e0());
        this.a(new i0());
        this.a(new h0());
        this.a(new L());
        this.a(new Q());
        this.a(new org.bson.codecs.d());
        this.a(new k0());
        this.a(new K());
        this.a(new r0());
        this.a(new s0());
        this.a(new n0());
        this.a(new J());
        this.a(new o0());
        this.a(new q0());
        this.a(new I());
        this.a(new Z());
        this.a(new a());
        this.a(new org.bson.codecs.b());
        this.a(new c());
    }

    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass();
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

