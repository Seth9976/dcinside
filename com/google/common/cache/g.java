package com.google.common.cache;

import J1.b;
import com.google.common.base.H;
import com.google.common.base.Q;
import com.google.common.base.t;
import com.google.common.util.concurrent.h0;
import com.google.common.util.concurrent.t0;
import com.google.common.util.concurrent.u0;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;

@b(emulated = true)
@i
public abstract class g {
    static final class com.google.common.cache.g.b extends g implements Serializable {
        private final t a;
        private static final long b;

        public com.google.common.cache.g.b(t t0) {
            this.a = (t)H.E(t0);
        }

        @Override  // com.google.common.cache.g
        public Object d(Object object0) {
            Object object1 = H.E(object0);
            return this.a.apply(object1);
        }
    }

    public static final class c extends RuntimeException {
        public c(String s) {
            super(s);
        }
    }

    static final class d extends g implements Serializable {
        private final Q a;
        private static final long b;

        public d(Q q0) {
            this.a = (Q)H.E(q0);
        }

        @Override  // com.google.common.cache.g
        public Object d(Object object0) {
            H.E(object0);
            return this.a.get();
        }
    }

    public static final class e extends UnsupportedOperationException {
    }

    @J1.c
    public static g a(g g0, Executor executor0) {
        class a extends g {
            final g a;
            final Executor b;

            a(Executor executor0) {
                this.b = executor0;
                super();
            }

            @Override  // com.google.common.cache.g
            public Object d(Object object0) throws Exception {
                return g.this.d(object0);
            }

            @Override  // com.google.common.cache.g
            public Map e(Iterable iterable0) throws Exception {
                return g.this.e(iterable0);
            }

            @Override  // com.google.common.cache.g
            public t0 f(Object object0, Object object1) {
                t0 t00 = u0.b(() -> g.this.f(object0, object1).get());
                this.b.execute(((Runnable)t00));
                return t00;
            }

            // 检测为 Lambda 实现
            private static Object h(g g0, Object object0, Object object1) throws Exception [...]
        }

        H.E(g0);
        H.E(executor0);
        return new a(g0, executor0);
    }

    public static g b(t t0) {
        return new com.google.common.cache.g.b(t0);
    }

    public static g c(Q q0) {
        return new d(q0);
    }

    public abstract Object d(Object arg1) throws Exception;

    public Map e(Iterable iterable0) throws Exception {
        throw new e();
    }

    @J1.c
    public t0 f(Object object0, Object object1) throws Exception {
        H.E(object0);
        H.E(object1);
        return h0.o(this.d(object0));
    }
}

