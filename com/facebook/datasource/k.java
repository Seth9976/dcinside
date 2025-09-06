package com.facebook.datasource;

import com.facebook.common.internal.q;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import k1.n.a;
import k1.n;
import o3.h;
import p3.c;

@n(a.a)
@c
public class k implements q {
    static class com.facebook.datasource.k.a extends com.facebook.datasource.a {
        class com.facebook.datasource.k.a.a implements g {
            final com.facebook.datasource.k.a a;

            private com.facebook.datasource.k.a.a() {
            }

            com.facebook.datasource.k.a.a(l l0) {
            }

            @Override  // com.facebook.datasource.g
            public void a(d d0) {
            }

            @Override  // com.facebook.datasource.g
            public void b(d d0) {
                com.facebook.datasource.k.a.this.D(d0);
            }

            @Override  // com.facebook.datasource.g
            public void c(d d0) {
            }

            @Override  // com.facebook.datasource.g
            public void d(d d0) {
                if(d0.a()) {
                    com.facebook.datasource.k.a.this.C(d0);
                    return;
                }
                boolean z = !d0.g();
            }
        }

        @h
        @p3.a("RetainingDataSource.this")
        private d i;

        private com.facebook.datasource.k.a() {
            this.i = null;
        }

        com.facebook.datasource.k.a(l l0) {
        }

        private static void A(d d0) {
            if(d0 != null) {
                d0.close();
            }
        }

        private void B() {
        }

        private void C(d d0) {
            if(d0 == this.i) {
                this.u(null, false, d0.getExtras());
            }
        }

        private void D(d d0) {
            if(d0 == this.i) {
                this.r(d0.getProgress());
            }
        }

        public void E(@h q q0) {
            d d1;
            if(this.isClosed()) {
                return;
            }
            d d0 = q0 == null ? null : ((d)q0.get());
            synchronized(this) {
                if(this.isClosed()) {
                    com.facebook.datasource.k.a.A(d0);
                    return;
                }
                d1 = this.i;
                this.i = d0;
            }
            if(d0 != null) {
                d0.d(new com.facebook.datasource.k.a.a(this, null), com.facebook.common.executors.a.a());
            }
            com.facebook.datasource.k.a.A(d1);
        }

        @Override  // com.facebook.datasource.a
        public boolean a() {
            synchronized(this) {
                return this.i != null && this.i.a();
            }
        }

        @Override  // com.facebook.datasource.a
        public boolean close() {
            d d0;
            synchronized(this) {
                if(!super.close()) {
                    return false;
                }
                d0 = this.i;
                this.i = null;
            }
            com.facebook.datasource.k.a.A(d0);
            return true;
        }

        @Override  // com.facebook.datasource.a
        public boolean e() {
            return true;
        }

        @Override  // com.facebook.datasource.a
        @h
        public Object getResult() {
            synchronized(this) {
                return this.i == null ? null : this.i.getResult();
            }
        }

        static void x(com.facebook.datasource.k.a k$a0) {
        }
    }

    private final Set a;
    @h
    private q b;

    public k() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.b = null;
    }

    public d a() {
        d d0 = new com.facebook.datasource.k.a(null);
        ((com.facebook.datasource.k.a)d0).E(this.b);
        this.a.add(d0);
        return d0;
    }

    public void b(q q0) {
        this.b = q0;
        for(Object object0: this.a) {
            com.facebook.datasource.k.a k$a0 = (com.facebook.datasource.k.a)object0;
            if(!k$a0.isClosed()) {
                k$a0.E(q0);
            }
        }
    }

    @Override  // com.facebook.common.internal.q
    public Object get() {
        return this.a();
    }
}

