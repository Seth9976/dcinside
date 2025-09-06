package com.google.common.graph;

import com.google.common.base.H;
import com.google.common.collect.D4;
import com.google.common.collect.a3;
import com.google.common.collect.c;
import j..util.Objects;
import java.util.Iterator;
import java.util.Set;

@x
abstract class z extends c {
    static class a {
    }

    static final class b extends z {
        private b(o o0) {
            super(o0, null);
        }

        b(o o0, a z$a0) {
            this(o0);
        }

        @Override  // com.google.common.collect.c
        @o3.a
        protected Object a() {
            return this.f();
        }

        @o3.a
        protected y f() {
            do {
                if(this.f.hasNext()) {
                    Object object0 = this.e;
                    Objects.requireNonNull(object0);
                    Object object1 = this.f.next();
                    return y.j(object0, object1);
                }
            }
            while(this.d());
            return (y)this.b();
        }
    }

    static final class com.google.common.graph.z.c extends z {
        @o3.a
        private Set g;

        private com.google.common.graph.z.c(o o0) {
            super(o0, null);
            this.g = D4.y(o0.e().size() + 1);
        }

        com.google.common.graph.z.c(o o0, a z$a0) {
            this(o0);
        }

        @Override  // com.google.common.collect.c
        @o3.a
        protected Object a() {
            return this.f();
        }

        @o3.a
        protected y f() {
            do {
                Objects.requireNonNull(this.g);
                while(this.f.hasNext()) {
                    Object object0 = this.f.next();
                    if(!this.g.contains(object0)) {
                        Object object1 = this.e;
                        Objects.requireNonNull(object1);
                        return y.m(object1, object0);
                    }
                    if(false) {
                        break;
                    }
                }
                this.g.add(this.e);
            }
            while(this.d());
            this.g = null;
            return (y)this.b();
        }
    }

    private final o c;
    private final Iterator d;
    @o3.a
    Object e;
    Iterator f;

    private z(o o0) {
        this.e = null;
        this.f = a3.B().i();
        this.c = o0;
        this.d = o0.e().iterator();
    }

    z(o o0, a z$a0) {
        this(o0);
    }

    final boolean d() {
        H.g0(!this.f.hasNext());
        if(!this.d.hasNext()) {
            return false;
        }
        Object object0 = this.d.next();
        this.e = object0;
        this.f = this.c.a(object0).iterator();
        return true;
    }

    static z e(o o0) {
        return o0.c() ? new b(o0, null) : new com.google.common.graph.z.c(o0, null);
    }
}

