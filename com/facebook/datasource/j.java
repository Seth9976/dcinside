package com.facebook.datasource;

import com.facebook.common.internal.l;
import com.facebook.common.internal.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import k1.n.a;
import k1.n;
import o3.h;
import p3.d;

@n(a.a)
@d
public class j implements q {
    @d
    class com.facebook.datasource.j.a extends com.facebook.datasource.a {
        class com.facebook.datasource.j.a.a implements g {
            private int a;
            final com.facebook.datasource.j.a b;

            public com.facebook.datasource.j.a.a(int v) {
                this.a = v;
            }

            @Override  // com.facebook.datasource.g
            public void a(com.facebook.datasource.d d0) {
            }

            @Override  // com.facebook.datasource.g
            public void b(com.facebook.datasource.d d0) {
                if(this.a == 0) {
                    float f = d0.getProgress();
                    com.facebook.datasource.j.a.this.r(f);
                }
            }

            @Override  // com.facebook.datasource.g
            public void c(com.facebook.datasource.d d0) {
                com.facebook.datasource.j.a.this.G(this.a, d0);
            }

            @Override  // com.facebook.datasource.g
            public void d(com.facebook.datasource.d d0) {
                if(d0.a()) {
                    com.facebook.datasource.j.a.this.H(this.a, d0);
                    return;
                }
                if(d0.g()) {
                    com.facebook.datasource.j.a.this.G(this.a, d0);
                }
            }
        }

        @h
        @p3.a("IncreasingQualityDataSource.this")
        private ArrayList i;
        @p3.a("IncreasingQualityDataSource.this")
        private int j;
        private int k;
        private AtomicInteger l;
        @h
        private Throwable m;
        @h
        private Map n;
        final j o;

        public com.facebook.datasource.j.a() {
            if(!j0.b) {
                this.A();
            }
        }

        private void A() {
            if(this.l != null) {
                return;
            }
            synchronized(this) {
                if(this.l == null) {
                    this.l = new AtomicInteger(0);
                    int v2 = j.this.a.size();
                    this.k = v2;
                    this.j = v2;
                    this.i = new ArrayList(v2);
                    for(int v1 = 0; v1 < v2; ++v1) {
                        com.facebook.datasource.d d0 = (com.facebook.datasource.d)((q)j.this.a.get(v1)).get();
                        this.i.add(d0);
                        d0.d(new com.facebook.datasource.j.a.a(this, v1), com.facebook.common.executors.a.a());
                        if(d0.a()) {
                            break;
                        }
                    }
                }
            }
        }

        @h
        private com.facebook.datasource.d B(int v) {
            com.facebook.datasource.d d0 = null;
            synchronized(this) {
                if(this.i != null && v < this.i.size()) {
                    d0 = (com.facebook.datasource.d)this.i.set(v, null);
                }
                return d0;
            }
        }

        @h
        private com.facebook.datasource.d C(int v) {
            synchronized(this) {
                return this.i == null || v >= this.i.size() ? null : ((com.facebook.datasource.d)this.i.get(v));
            }
        }

        @h
        private com.facebook.datasource.d D() {
            synchronized(this) {
                return this.C(this.j);
            }
        }

        private void E() {
            if(this.l.incrementAndGet() == this.k) {
                Throwable throwable0 = this.m;
                if(throwable0 != null) {
                    this.p(throwable0, this.n);
                }
            }
        }

        private void F(int v, com.facebook.datasource.d d0, boolean z) {
            synchronized(this) {
                int v2 = this.j;
                if(d0 == this.C(v) && v != this.j) {
                    if(this.D() != null && (!z || v >= this.j)) {
                        v = v2;
                    }
                    else {
                        this.j = v;
                    }
                    while(v2 > v) {
                        this.z(this.B(v2));
                        --v2;
                    }
                }
            }
        }

        private void G(int v, com.facebook.datasource.d d0) {
            this.z(this.I(v, d0));
            if(v == 0) {
                this.m = d0.c();
                this.n = d0.getExtras();
            }
            this.E();
        }

        private void H(int v, com.facebook.datasource.d d0) {
            this.F(v, d0, d0.g());
            if(d0 == this.D()) {
                this.u(null, v == 0 && d0.g(), d0.getExtras());
            }
            this.E();
        }

        @h
        private com.facebook.datasource.d I(int v, com.facebook.datasource.d d0) {
            synchronized(this) {
                if(d0 == this.D()) {
                    return null;
                }
                return d0 == this.C(v) ? this.B(v) : d0;
            }
        }

        @Override  // com.facebook.datasource.a
        public boolean a() {
            synchronized(this) {
                if(j.this.b) {
                    this.A();
                }
                com.facebook.datasource.d d0 = this.D();
                return d0 != null && d0.a();
            }
        }

        @Override  // com.facebook.datasource.a
        public boolean close() {
            ArrayList arrayList0;
            if(j.this.b) {
                this.A();
            }
            synchronized(this) {
                if(!super.close()) {
                    return false;
                }
                arrayList0 = this.i;
                this.i = null;
            }
            if(arrayList0 != null) {
                for(int v = 0; v < arrayList0.size(); ++v) {
                    this.z(((com.facebook.datasource.d)arrayList0.get(v)));
                }
            }
            return true;
        }

        @Override  // com.facebook.datasource.a
        @h
        public Object getResult() {
            synchronized(this) {
                if(j.this.b) {
                    this.A();
                }
                com.facebook.datasource.d d0 = this.D();
                return d0 == null ? null : d0.getResult();
            }
        }

        private void z(com.facebook.datasource.d d0) {
            if(d0 != null) {
                d0.close();
            }
        }
    }

    private final List a;
    private final boolean b;

    private j(List list0, boolean z) {
        com.facebook.common.internal.n.e(!list0.isEmpty(), "List of suppliers is empty!");
        this.a = list0;
        this.b = z;
    }

    public static j c(List list0) {
        return j.d(list0, false);
    }

    public static j d(List list0, boolean z) {
        return new j(list0, z);
    }

    public com.facebook.datasource.d e() {
        return new com.facebook.datasource.j.a(this);
    }

    @Override
    public boolean equals(@h Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof j ? l.a(this.a, ((j)object0).a) : false;
    }

    @Override  // com.facebook.common.internal.q
    public Object get() {
        return this.e();
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

