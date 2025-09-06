package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.k;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.dagger.internal.a;
import com.google.android.datatransport.runtime.dagger.internal.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import com.google.android.datatransport.runtime.scheduling.persistence.O;
import com.google.android.datatransport.runtime.scheduling.persistence.Y;
import com.google.android.datatransport.runtime.scheduling.persistence.d;
import com.google.android.datatransport.runtime.scheduling.persistence.g;
import com.google.android.datatransport.runtime.scheduling.persistence.h;
import com.google.android.datatransport.runtime.scheduling.persistence.i;
import com.google.android.datatransport.runtime.scheduling.persistence.j;

@a
final class f {
    static class com.google.android.datatransport.runtime.f.a {
    }

    static final class b implements com.google.android.datatransport.runtime.x.a {
        private Context a;

        private b() {
        }

        b(com.google.android.datatransport.runtime.f.a f$a0) {
        }

        @Override  // com.google.android.datatransport.runtime.x$a
        public com.google.android.datatransport.runtime.x.a a(Context context0) {
            return this.b(context0);
        }

        public b b(Context context0) {
            this.a = (Context)e.b(context0);
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.x$a
        public x build() {
            e.a(this.a, Context.class);
            return new c(this.a, null);
        }
    }

    static final class c extends x {
        private final c a;
        private r3.c b;
        private r3.c c;
        private r3.c d;
        private r3.c e;
        private r3.c f;
        private r3.c g;
        private r3.c h;
        private r3.c i;
        private r3.c j;
        private r3.c k;
        private r3.c l;
        private r3.c m;
        private r3.c n;

        private c(Context context0) {
            this.a = this;
            this.c(context0);
        }

        c(Context context0, com.google.android.datatransport.runtime.f.a f$a0) {
            this(context0);
        }

        @Override  // com.google.android.datatransport.runtime.x
        d a() {
            return (d)this.h.get();
        }

        @Override  // com.google.android.datatransport.runtime.x
        w b() {
            return (w)this.n.get();
        }

        private void c(Context context0) {
            this.b = com.google.android.datatransport.runtime.dagger.internal.b.b(l.a());
            com.google.android.datatransport.runtime.dagger.internal.c c0 = com.google.android.datatransport.runtime.dagger.internal.d.a(context0);
            this.c = c0;
            k k0 = k.a(c0, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a());
            this.d = k0;
            this.e = com.google.android.datatransport.runtime.dagger.internal.b.b(m.a(this.c, k0));
            this.f = Y.a(this.c, g.a(), i.a());
            this.g = com.google.android.datatransport.runtime.dagger.internal.b.b(h.a(this.c));
            this.h = com.google.android.datatransport.runtime.dagger.internal.b.b(O.a(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), j.a(), this.f, this.g));
            com.google.android.datatransport.runtime.scheduling.g g0 = com.google.android.datatransport.runtime.scheduling.g.b(com.google.android.datatransport.runtime.time.e.a());
            this.i = g0;
            com.google.android.datatransport.runtime.scheduling.i i0 = com.google.android.datatransport.runtime.scheduling.i.a(this.c, this.h, g0, com.google.android.datatransport.runtime.time.f.a());
            this.j = i0;
            this.k = com.google.android.datatransport.runtime.scheduling.d.a(this.b, this.e, i0, this.h, this.h);
            this.l = t.a(this.c, this.e, this.h, this.j, this.b, this.h, com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.h);
            this.m = com.google.android.datatransport.runtime.scheduling.jobscheduling.x.a(this.b, this.h, this.j, this.h);
            this.n = com.google.android.datatransport.runtime.dagger.internal.b.b(y.a(com.google.android.datatransport.runtime.time.e.a(), com.google.android.datatransport.runtime.time.f.a(), this.k, this.l, this.m));
        }
    }

    public static com.google.android.datatransport.runtime.x.a a() {
        return new b(null);
    }
}

