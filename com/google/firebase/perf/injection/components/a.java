package com.google.firebase.perf.injection.components;

import com.google.firebase.perf.e;
import com.google.firebase.perf.injection.modules.d;
import com.google.firebase.perf.injection.modules.f;
import com.google.firebase.perf.injection.modules.g;
import com.google.firebase.perf.injection.modules.h;
import dagger.internal.p;
import r3.c;

public final class a implements b {
    static class com.google.firebase.perf.injection.components.a.a {
    }

    public static final class com.google.firebase.perf.injection.components.a.b {
        private com.google.firebase.perf.injection.modules.a a;

        private com.google.firebase.perf.injection.components.a.b() {
        }

        com.google.firebase.perf.injection.components.a.b(com.google.firebase.perf.injection.components.a.a a$a0) {
        }

        public b a() {
            p.a(this.a, com.google.firebase.perf.injection.modules.a.class);
            return new a(this.a, null);
        }

        public com.google.firebase.perf.injection.components.a.b b(com.google.firebase.perf.injection.modules.a a0) {
            this.a = (com.google.firebase.perf.injection.modules.a)p.b(a0);
            return this;
        }
    }

    private c a;
    private c b;
    private c c;
    private c d;
    private c e;
    private c f;
    private c g;
    private c h;

    private a(com.google.firebase.perf.injection.modules.a a0) {
        this.c(a0);
    }

    a(com.google.firebase.perf.injection.modules.a a0, com.google.firebase.perf.injection.components.a.a a$a0) {
        this(a0);
    }

    @Override  // com.google.firebase.perf.injection.components.b
    public e a() {
        return (e)this.h.get();
    }

    public static com.google.firebase.perf.injection.components.a.b b() {
        return new com.google.firebase.perf.injection.components.a.b(null);
    }

    private void c(com.google.firebase.perf.injection.modules.a a0) {
        this.a = com.google.firebase.perf.injection.modules.c.a(a0);
        this.b = com.google.firebase.perf.injection.modules.e.a(a0);
        this.c = d.a(a0);
        this.d = h.a(a0);
        this.e = f.a(a0);
        this.f = com.google.firebase.perf.injection.modules.b.a(a0);
        g g0 = g.a(a0);
        this.g = g0;
        this.h = dagger.internal.f.b(com.google.firebase.perf.h.a(this.a, this.b, this.c, this.d, this.e, this.f, g0));
    }
}

