package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import com.google.common.base.Q;
import com.google.common.base.z;
import com.google.common.collect.B3;
import com.google.common.collect.O2;
import com.google.common.collect.z3;
import j..util.DesugarCollections;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@c
@d
@N
public abstract class Y0 {
    static class a {
    }

    static class b extends f {
        private final Object[] d;

        private b(int v, Q q0) {
            super(v);
            H.e(v <= 0x40000000, "Stripes must be <= 2^30)");
            this.d = new Object[this.c + 1];
            for(int v1 = 0; true; ++v1) {
                Object[] arr_object = this.d;
                if(v1 >= arr_object.length) {
                    break;
                }
                arr_object[v1] = q0.get();
            }
        }

        b(int v, Q q0, a y0$a0) {
            this(v, q0);
        }

        @Override  // com.google.common.util.concurrent.Y0
        public Object j(int v) {
            return this.d[v];
        }

        @Override  // com.google.common.util.concurrent.Y0
        public int v() {
            return this.d.length;
        }
    }

    @e
    static class com.google.common.util.concurrent.Y0.c extends f {
        final ConcurrentMap d;
        final Q e;
        final int f;

        com.google.common.util.concurrent.Y0.c(int v, Q q0) {
            super(v);
            this.f = this.c == -1 ? 0x7FFFFFFF : this.c + 1;
            this.e = q0;
            this.d = new B3().m().i();
        }

        @Override  // com.google.common.util.concurrent.Y0
        public Object j(int v) {
            if(this.f != 0x7FFFFFFF) {
                H.C(v, this.v());
            }
            Object object0 = this.d.get(v);
            if(object0 != null) {
                return object0;
            }
            Object object1 = this.e.get();
            return z.a(this.d.putIfAbsent(v, object1), object1);
        }

        @Override  // com.google.common.util.concurrent.Y0
        public int v() {
            return this.f;
        }
    }

    static class com.google.common.util.concurrent.Y0.d extends ReentrantLock {
        long a;
        long b;
        long c;

        com.google.common.util.concurrent.Y0.d() {
            super(false);
        }
    }

    static class com.google.common.util.concurrent.Y0.e extends Semaphore {
        long a;
        long b;
        long c;

        com.google.common.util.concurrent.Y0.e(int v) {
            super(v, false);
        }
    }

    static abstract class f extends Y0 {
        final int c;

        f(int v) {
            super(null);
            H.e(v > 0, "Stripes must be positive");
            this.c = v <= 0x40000000 ? Y0.g(v) - 1 : -1;
        }

        @Override  // com.google.common.util.concurrent.Y0
        public final Object i(Object object0) {
            return this.j(this.k(object0));
        }

        @Override  // com.google.common.util.concurrent.Y0
        final int k(Object object0) {
            return Y0.w(object0.hashCode()) & this.c;
        }
    }

    @e
    static class g extends f {
        static final class com.google.common.util.concurrent.Y0.g.a extends WeakReference {
            final int a;

            com.google.common.util.concurrent.Y0.g.a(Object object0, int v, ReferenceQueue referenceQueue0) {
                super(object0, referenceQueue0);
                this.a = v;
            }
        }

        final AtomicReferenceArray d;
        final Q e;
        final int f;
        final ReferenceQueue g;

        g(int v, Q q0) {
            super(v);
            this.g = new ReferenceQueue();
            int v1 = this.c == -1 ? 0x7FFFFFFF : this.c + 1;
            this.f = v1;
            this.d = new AtomicReferenceArray(v1);
            this.e = q0;
        }

        @Override  // com.google.common.util.concurrent.Y0
        public Object j(int v) {
            if(this.f != 0x7FFFFFFF) {
                H.C(v, this.v());
            }
            com.google.common.util.concurrent.Y0.g.a y0$g$a0 = (com.google.common.util.concurrent.Y0.g.a)this.d.get(v);
            Object object0 = y0$g$a0 == null ? null : y0$g$a0.get();
            if(object0 != null) {
                return object0;
            }
            Object object1 = this.e.get();
            com.google.common.util.concurrent.Y0.g.a y0$g$a1 = new com.google.common.util.concurrent.Y0.g.a(object1, v, this.g);
            while(!Z0.a(this.d, v, y0$g$a0, y0$g$a1)) {
                y0$g$a0 = (com.google.common.util.concurrent.Y0.g.a)this.d.get(v);
                Object object2 = y0$g$a0 == null ? null : y0$g$a0.get();
                if(object2 != null) {
                    return object2;
                }
                if(false) {
                    break;
                }
            }
            this.x();
            return object1;
        }

        @Override  // com.google.common.util.concurrent.Y0
        public int v() {
            return this.f;
        }

        private void x() {
            Reference reference0;
            while((reference0 = this.g.poll()) != null) {
                Z0.a(this.d, ((com.google.common.util.concurrent.Y0.g.a)reference0).a, ((com.google.common.util.concurrent.Y0.g.a)reference0), null);
            }
        }
    }

    static final class h extends X {
        private final Condition a;
        private final j b;

        h(Condition condition0, j y0$j0) {
            this.a = condition0;
            this.b = y0$j0;
        }

        @Override  // com.google.common.util.concurrent.X
        Condition a() {
            return this.a;
        }
    }

    static final class i extends d0 {
        private final Lock a;
        private final j b;

        i(Lock lock0, j y0$j0) {
            this.a = lock0;
            this.b = y0$j0;
        }

        @Override  // com.google.common.util.concurrent.d0
        Lock a() {
            return this.a;
        }

        @Override  // com.google.common.util.concurrent.d0
        public Condition newCondition() {
            return new h(this.a.newCondition(), this.b);
        }
    }

    static final class j implements ReadWriteLock {
        private final ReadWriteLock a;

        j() {
            this.a = new ReentrantReadWriteLock();
        }

        @Override
        public Lock readLock() {
            return new i(this.a.readLock(), this);
        }

        @Override
        public Lock writeLock() {
            return new i(this.a.writeLock(), this);
        }
    }

    private static final int a = 0x400;
    private static final int b = -1;

    private Y0() {
    }

    Y0(a y0$a0) {
    }

    public Iterable f(Iterable iterable0) {
        ArrayList arrayList0 = z3.r(iterable0);
        if(arrayList0.isEmpty()) {
            return O2.A();
        }
        int[] arr_v = new int[arrayList0.size()];
        for(int v = 0; v < arrayList0.size(); ++v) {
            arr_v[v] = this.k(arrayList0.get(v));
        }
        Arrays.sort(arr_v);
        int v1 = arr_v[0];
        arrayList0.set(0, this.j(v1));
        for(int v2 = 1; v2 < arrayList0.size(); ++v2) {
            int v3 = arr_v[v2];
            if(v3 == v1) {
                arrayList0.set(v2, arrayList0.get(v2 - 1));
            }
            else {
                arrayList0.set(v2, this.j(v3));
                v1 = v3;
            }
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    private static int g(int v) {
        return 1 << com.google.common.math.f.p(v, RoundingMode.CEILING);
    }

    static Y0 h(int v, Q q0) {
        return new b(v, q0, null);
    }

    public abstract Object i(Object arg1);

    public abstract Object j(int arg1);

    abstract int k(Object arg1);

    // 检测为 Lambda 实现
    private static Lock l() [...]

    // 检测为 Lambda 实现
    private static Semaphore m(int v) [...]

    // 检测为 Lambda 实现
    private static Semaphore n(int v) [...]

    private static Y0 o(int v, Q q0) {
        return v < 0x400 ? new g(v, q0) : new com.google.common.util.concurrent.Y0.c(v, q0);
    }

    public static Y0 p(int v) {
        return Y0.o(v, () -> new ReentrantLock(false));
    }

    public static Y0 q(int v) {
        return Y0.o(v, new S0());
    }

    public static Y0 r(int v, int v1) {
        return Y0.o(v, () -> new Semaphore(v1, false));
    }

    public static Y0 s(int v) {
        return Y0.h(v, new T0());
    }

    public static Y0 t(int v) {
        return Y0.h(v, new X0());
    }

    public static Y0 u(int v, int v1) {
        return Y0.h(v, () -> new com.google.common.util.concurrent.Y0.e(v1));
    }

    public abstract int v();

    private static int w(int v) {
        int v1 = v ^ (v >>> 20 ^ v >>> 12);
        return v1 >>> 4 ^ (v1 >>> 7 ^ v1);
    }
}

