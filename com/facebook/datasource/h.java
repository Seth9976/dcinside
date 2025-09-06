package com.facebook.datasource;

import com.facebook.common.internal.l;
import com.facebook.common.internal.q;
import java.util.List;
import k1.n.a;
import k1.n;
import p3.d;

@n(a.a)
@d
public class h implements q {
    @d
    class com.facebook.datasource.h.a extends com.facebook.datasource.a {
        class com.facebook.datasource.h.a.a implements g {
            final com.facebook.datasource.h.a a;

            private com.facebook.datasource.h.a.a() {
            }

            com.facebook.datasource.h.a.a(i i0) {
            }

            @Override  // com.facebook.datasource.g
            public void a(com.facebook.datasource.d d0) {
            }

            @Override  // com.facebook.datasource.g
            public void b(com.facebook.datasource.d d0) {
                float f = Math.max(com.facebook.datasource.h.a.this.getProgress(), d0.getProgress());
                com.facebook.datasource.h.a.this.r(f);
            }

            @Override  // com.facebook.datasource.g
            public void c(com.facebook.datasource.d d0) {
                com.facebook.datasource.h.a.this.E(d0);
            }

            @Override  // com.facebook.datasource.g
            public void d(com.facebook.datasource.d d0) {
                if(d0.a()) {
                    com.facebook.datasource.h.a.this.F(d0);
                    return;
                }
                if(d0.g()) {
                    com.facebook.datasource.h.a.this.E(d0);
                }
            }
        }

        private int i;
        @o3.h
        private com.facebook.datasource.d j;
        @o3.h
        private com.facebook.datasource.d k;
        final h l;

        public com.facebook.datasource.h.a() {
            this.i = 0;
            this.j = null;
            this.k = null;
            if(!this.H()) {
                this.o(new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        private void A(@o3.h com.facebook.datasource.d d0) {
            if(d0 != null) {
                d0.close();
            }
        }

        @o3.h
        private com.facebook.datasource.d B() {
            synchronized(this) {
            }
            return this.k;
        }

        @o3.h
        private q C() {
            synchronized(this) {
                if(!this.isClosed() && this.i < h.this.a.size()) {
                    int v1 = this.i;
                    this.i = v1 + 1;
                    return (q)h.this.a.get(v1);
                }
                return null;
            }
        }

        private void D(com.facebook.datasource.d d0, boolean z) {
            synchronized(this) {
                if(d0 == this.j) {
                    com.facebook.datasource.d d1 = this.k;
                    if(d0 != d1) {
                        if(d1 == null || z) {
                            this.k = d0;
                        }
                        else {
                            d1 = null;
                        }
                        this.A(d1);
                    }
                }
            }
        }

        private void E(com.facebook.datasource.d d0) {
            if(!this.z(d0)) {
                return;
            }
            if(d0 != this.B()) {
                this.A(d0);
            }
            if(!this.H()) {
                this.p(d0.c(), d0.getExtras());
            }
        }

        private void F(com.facebook.datasource.d d0) {
            this.D(d0, d0.g());
            if(d0 == this.B()) {
                this.u(null, d0.g(), d0.getExtras());
            }
        }

        private boolean G(com.facebook.datasource.d d0) {
            synchronized(this) {
                if(this.isClosed()) {
                    return false;
                }
                this.j = d0;
                return true;
            }
        }

        private boolean H() {
            q q0 = this.C();
            com.facebook.datasource.d d0 = q0 == null ? null : ((com.facebook.datasource.d)q0.get());
            if(this.G(d0) && d0 != null) {
                d0.d(new com.facebook.datasource.h.a.a(this, null), com.facebook.common.executors.a.a());
                return true;
            }
            this.A(d0);
            return false;
        }

        @Override  // com.facebook.datasource.a
        public boolean a() {
            synchronized(this) {
                com.facebook.datasource.d d0 = this.B();
                return d0 != null && d0.a();
            }
        }

        @Override  // com.facebook.datasource.a
        public boolean close() {
            com.facebook.datasource.d d1;
            com.facebook.datasource.d d0;
            synchronized(this) {
                if(!super.close()) {
                    return false;
                }
                d0 = this.j;
                this.j = null;
                d1 = this.k;
                this.k = null;
            }
            this.A(d1);
            this.A(d0);
            return true;
        }

        @Override  // com.facebook.datasource.a
        @o3.h
        public Object getResult() {
            synchronized(this) {
                com.facebook.datasource.d d0 = this.B();
                return d0 == null ? null : d0.getResult();
            }
        }

        private boolean z(com.facebook.datasource.d d0) {
            synchronized(this) {
                if(!this.isClosed() && d0 == this.j) {
                    this.j = null;
                    return true;
                }
                return false;
            }
        }
    }

    private final List a;

    private h(List list0) {
        com.facebook.common.internal.n.e(!list0.isEmpty(), "List of suppliers is empty!");
        this.a = list0;
    }

    public static h b(List list0) {
        return new h(list0);
    }

    public com.facebook.datasource.d c() {
        return new com.facebook.datasource.h.a(this);
    }

    @Override
    public boolean equals(@o3.h Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof h ? l.a(this.a, ((h)object0).a) : false;
    }

    @Override  // com.facebook.common.internal.q
    public Object get() {
        return this.c();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return l.e(this).f("list", this.a).toString();
    }
}

