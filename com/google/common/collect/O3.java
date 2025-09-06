package com.google.common.collect;

import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import com.google.common.base.m;
import com.google.common.base.t;

@c
@d
@C1
public final class o3 {
    static class a {
    }

    public static class b {
        private final B3 a;
        private boolean b;

        private b() {
            this.a = new B3();
            this.b = true;
        }

        b(a o3$a0) {
        }

        public n3 a() {
            if(!this.b) {
                this.a.l();
            }
            return new com.google.common.collect.o3.d(this.a, null);
        }

        public b b(int v) {
            this.a.a(v);
            return this;
        }

        public b c() {
            this.b = true;
            return this;
        }

        @c("java.lang.ref.WeakReference")
        public b d() {
            this.b = false;
            return this;
        }
    }

    static class com.google.common.collect.o3.c implements t {
        private final n3 a;

        public com.google.common.collect.o3.c(n3 n30) {
            this.a = n30;
        }

        @Override  // com.google.common.base.t
        public Object apply(Object object0) {
            return this.a.a(object0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.t
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof com.google.common.collect.o3.c ? this.a.equals(((com.google.common.collect.o3.c)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    @e
    static final class com.google.common.collect.o3.d implements n3 {
        @e
        final C3 a;

        private com.google.common.collect.o3.d(B3 b30) {
            this.a = C3.e(b30.h(m.c()));
        }

        com.google.common.collect.o3.d(B3 b30, a o3$a0) {
            this(b30);
        }

        @Override  // com.google.common.collect.n3
        public Object a(Object object0) {
            do {
                j c3$j0 = this.a.f(object0);
                if(c3$j0 != null) {
                    Object object1 = c3$j0.getKey();
                    if(object1 != null) {
                        return object1;
                    }
                }
            }
            while(((com.google.common.collect.B3.a)this.a.putIfAbsent(object0, com.google.common.collect.B3.a.a)) != null);
            return object0;
        }
    }

    public static t a(n3 n30) {
        return new com.google.common.collect.o3.c(((n3)H.E(n30)));
    }

    public static b b() {
        return new b(null);
    }

    public static n3 c() {
        return o3.b().c().a();
    }

    @c("java.lang.ref.WeakReference")
    public static n3 d() {
        return o3.b().d().a();
    }
}

