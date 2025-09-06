package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.functions.b;
import rx.functions.p;
import rx.g;
import rx.i;
import rx.internal.util.m;
import rx.internal.util.unsafe.z;
import rx.n;
import rx.o;
import rx.observables.c;
import rx.subscriptions.f;

public final class a1 extends c {
    static final class rx.internal.operators.a1.c extends AtomicLong implements i, o {
        final d a;
        final n b;
        private static final long c = 0xC23093C4D18F2746L;
        static final long d = 0x8000000000000000L;
        static final long e = 0xC000000000000000L;

        public rx.internal.operators.a1.c(d a1$d0, n n0) {
            this.a = a1$d0;
            this.b = n0;
            this.lazySet(0xC000000000000000L);
        }

        public long a(long v) {
            long v2;
            if(v <= 0L) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                long v1 = this.get();
                if(v1 == 0xC000000000000000L) {
                    throw new IllegalStateException("Produced without request");
                }
                if(v1 == 0x8000000000000000L) {
                    return 0x8000000000000000L;
                }
                v2 = v1 - v;
                if(v2 < 0L) {
                    throw new IllegalStateException("More produced (" + v + ") than requested (" + v1 + ")");
                }
            }
            while(!this.compareAndSet(v1, v2));
            return v2;
        }

        @Override  // rx.o
        public boolean j() {
            return this.get() == 0x8000000000000000L;
        }

        @Override  // rx.o
        public void l() {
            if(this.get() != 0x8000000000000000L && this.getAndSet(0x8000000000000000L) != 0x8000000000000000L) {
                this.a.Y(this);
                this.a.R();
            }
        }

        @Override  // rx.i
        public void request(long v) {
            long v3;
            int v1 = Long.compare(v, 0L);
            if(v1 < 0) {
                return;
            }
            do {
                long v2 = this.get();
                if(v2 == 0x8000000000000000L) {
                    return;
                }
                if(v2 >= 0L && v1 == 0) {
                    return;
                }
                if(v2 == 0xC000000000000000L) {
                    v3 = v;
                }
                else {
                    long v4 = v2 + v;
                    v3 = v4 < 0L ? 0x7FFFFFFFFFFFFFFFL : v4;
                }
            }
            while(!this.compareAndSet(v2, v3));
            this.a.R();
        }
    }

    static final class d extends n implements o {
        final Queue f;
        final AtomicReference g;
        volatile Object h;
        final AtomicReference i;
        final AtomicBoolean j;
        boolean k;
        boolean l;
        static final rx.internal.operators.a1.c[] m;
        static final rx.internal.operators.a1.c[] n;

        static {
            d.m = new rx.internal.operators.a1.c[0];
            d.n = new rx.internal.operators.a1.c[0];
        }

        public d(AtomicReference atomicReference0) {
            this.f = new z(m.d);
            this.i = new AtomicReference(d.m);
            this.g = atomicReference0;
            this.j = new AtomicBoolean();
        }

        boolean Q(Object object0, boolean z) {
            int v = 0;
            if(object0 != null) {
                if(!x.f(object0)) {
                    Throwable throwable1 = x.d(object0);
                    androidx.compose.animation.core.d.a(this.g, this, null);
                    try {
                        rx.internal.operators.a1.c[] arr_a1$c1 = (rx.internal.operators.a1.c[])this.i.getAndSet(d.n);
                        while(v < arr_a1$c1.length) {
                            arr_a1$c1[v].b.onError(throwable1);
                            ++v;
                        }
                    }
                    catch(Throwable throwable2) {
                        this.l();
                        throw throwable2;
                    }
                    this.l();
                    return true;
                }
                else if(z) {
                    androidx.compose.animation.core.d.a(this.g, this, null);
                    try {
                        rx.internal.operators.a1.c[] arr_a1$c = (rx.internal.operators.a1.c[])this.i.getAndSet(d.n);
                        while(v < arr_a1$c.length) {
                            arr_a1$c[v].b.d();
                            ++v;
                        }
                    }
                    catch(Throwable throwable0) {
                        this.l();
                        throw throwable0;
                    }
                    this.l();
                    return true;
                }
            }
            return false;
        }

        void R() {
            boolean z1;
            __monitor_enter(this);
            if(this.k) {
                this.l = true;
                __monitor_exit(this);
                return;
            }
            this.k = true;
            this.l = false;
            __monitor_exit(this);
            while(true) {
                try {
                label_8:
                    Object object0 = this.h;
                    boolean z = this.f.isEmpty();
                    if(this.Q(object0, z)) {
                        return;
                    }
                    if(!z) {
                        rx.internal.operators.a1.c[] arr_a1$c = (rx.internal.operators.a1.c[])this.i.get();
                        long v = 0x7FFFFFFFFFFFFFFFL;
                        int v2 = 0;
                        for(int v1 = 0; v1 < arr_a1$c.length; ++v1) {
                            long v3 = arr_a1$c[v1].get();
                            if(v3 >= 0L) {
                                v = Math.min(v, v3);
                            }
                            else if(v3 == 0x8000000000000000L) {
                                ++v2;
                            }
                        }
                        if(arr_a1$c.length == v2) {
                            if(this.Q(this.h, this.f.poll() == null)) {
                                return;
                            }
                            this.v(1L);
                        }
                        else {
                            int v4 = 0;
                            while(((long)v4) < v) {
                                Object object1 = this.h;
                                Object object2 = this.f.poll();
                                if(this.Q(object1, object2 == null)) {
                                    return;
                                }
                                if(object2 == null) {
                                    z = true;
                                    break;
                                }
                                Object object3 = x.e(object2);
                                int v5 = arr_a1$c.length;
                                int v6 = 0;
                            label_43:
                                if(v6 >= v5) {
                                    ++v4;
                                    z = false;
                                    continue;
                                }
                                rx.internal.operators.a1.c a1$c0 = arr_a1$c[v6];
                                if(a1$c0.get() > 0L) {
                                    try {
                                        a1$c0.b.onNext(object3);
                                    }
                                    catch(Throwable throwable1) {
                                        a1$c0.l();
                                        rx.exceptions.c.g(throwable1, a1$c0.b, object3);
                                        ++v6;
                                        goto label_43;
                                    }
                                    a1$c0.a(1L);
                                }
                                ++v6;
                                goto label_43;
                            }
                            if(v4 > 0) {
                                this.v(((long)v4));
                            }
                            if(v == 0L || z) {
                                goto label_61;
                            }
                        }
                        goto label_8;
                    }
                label_61:
                    __monitor_enter(this);
                }
                catch(Throwable throwable0) {
                    z1 = false;
                    goto label_84;
                }
                try {
                    if(!this.l) {
                        this.k = false;
                        try {
                            __monitor_exit(this);
                            return;
                        }
                        catch(Throwable throwable2) {
                            z1 = true;
                            goto label_78;
                        }
                    }
                    this.l = false;
                    __monitor_exit(this);
                    goto label_8;
                }
                catch(Throwable throwable2) {
                }
                break;
            }
            z1 = false;
            while(true) {
            label_78:
                __monitor_exit(this);
                break;
            }
            try {
                throw throwable2;
            }
            catch(Throwable throwable0) {
            }
        label_84:
            if(!z1) {
                synchronized(this) {
                    this.k = false;
                }
            }
            throw throwable0;
        }

        void T() {
            class a implements rx.functions.a {
                final d a;

                @Override  // rx.functions.a
                public void call() {
                    d.this.i.getAndSet(d.n);
                    androidx.compose.animation.core.d.a(d.this.g, d.this, null);
                }
            }

            this.q(f.a(new a(this)));
        }

        void Y(rx.internal.operators.a1.c a1$c0) {
            rx.internal.operators.a1.c[] arr_a1$c1;
            do {
                rx.internal.operators.a1.c[] arr_a1$c = (rx.internal.operators.a1.c[])this.i.get();
                if(arr_a1$c == d.m || arr_a1$c == d.n) {
                    break;
                }
                int v = arr_a1$c.length;
                int v1 = 0;
                while(true) {
                    if(v1 < v) {
                        if(arr_a1$c[v1].equals(a1$c0)) {
                            break;
                        }
                        else {
                            ++v1;
                            continue;
                        }
                    }
                    v1 = -1;
                    break;
                }
                if(v1 < 0) {
                    return;
                }
                if(v == 1) {
                    arr_a1$c1 = d.m;
                }
                else {
                    rx.internal.operators.a1.c[] arr_a1$c2 = new rx.internal.operators.a1.c[v - 1];
                    System.arraycopy(arr_a1$c, 0, arr_a1$c2, 0, v1);
                    System.arraycopy(arr_a1$c, v1 + 1, arr_a1$c2, v1, v - v1 - 1);
                    arr_a1$c1 = arr_a1$c2;
                }
            }
            while(!androidx.compose.animation.core.d.a(this.i, arr_a1$c, arr_a1$c1));
        }

        @Override  // rx.h
        public void d() {
            if(this.h == null) {
                this.h = x.b();
                this.R();
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.h == null) {
                this.h = x.c(throwable0);
                this.R();
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            Object object1 = x.j(object0);
            if(!this.f.offer(object1)) {
                this.onError(new rx.exceptions.d());
                return;
            }
            this.R();
        }

        @Override  // rx.n
        public void onStart() {
            this.v(((long)m.d));
        }

        boolean x(rx.internal.operators.a1.c a1$c0) {
            a1$c0.getClass();
            do {
                rx.internal.operators.a1.c[] arr_a1$c = (rx.internal.operators.a1.c[])this.i.get();
                if(arr_a1$c == d.n) {
                    return false;
                }
                rx.internal.operators.a1.c[] arr_a1$c1 = new rx.internal.operators.a1.c[arr_a1$c.length + 1];
                System.arraycopy(arr_a1$c, 0, arr_a1$c1, 0, arr_a1$c.length);
                arr_a1$c1[arr_a1$c.length] = a1$c0;
            }
            while(!androidx.compose.animation.core.d.a(this.i, arr_a1$c, arr_a1$c1));
            return true;
        }
    }

    final g b;
    final AtomicReference c;

    private a1(rx.g.a g$a0, g g0, AtomicReference atomicReference0) {
        super(g$a0);
        this.b = g0;
        this.c = atomicReference0;
    }

    @Override  // rx.observables.c
    public void E7(b b0) {
        d a1$d0;
        while(true) {
            a1$d0 = (d)this.c.get();
            if(a1$d0 != null && !a1$d0.j()) {
                break;
            }
            d a1$d1 = new d(this.c);
            a1$d1.T();
            if(androidx.compose.animation.core.d.a(this.c, a1$d0, a1$d1)) {
                a1$d0 = a1$d1;
                break;
            }
        }
        boolean z = !a1$d0.j.get() && a1$d0.j.compareAndSet(false, true);
        b0.b(a1$d0);
        if(z) {
            this.b.N6(a1$d0);
        }
    }

    public static g G7(g g0, p p0) {
        return a1.H7(g0, p0, false);
    }

    public static g H7(g g0, p p0, boolean z) {
        static final class rx.internal.operators.a1.b implements rx.g.a {
            final boolean a;
            final p b;
            final g c;

            rx.internal.operators.a1.b(boolean z, p p0, g g0) {
                this.a = z;
                this.b = p0;
                this.c = g0;
                super();
            }

            public void a(n n0) {
                class rx.internal.operators.a1.b.a extends n {
                    final n f;
                    final Z g;
                    final rx.internal.operators.a1.b h;

                    rx.internal.operators.a1.b.a(n n0, Z z0) {
                        this.f = n0;
                        this.g = z0;
                        super();
                    }

                    @Override  // rx.n
                    public void X(i i0) {
                        this.f.X(i0);
                    }

                    @Override  // rx.h
                    public void d() {
                        this.g.l();
                        this.f.d();
                    }

                    @Override  // rx.h
                    public void onError(Throwable throwable0) {
                        this.g.l();
                        this.f.onError(throwable0);
                    }

                    @Override  // rx.h
                    public void onNext(Object object0) {
                        this.f.onNext(object0);
                    }
                }

                Z z0 = new Z(m.d, this.a);
                rx.internal.operators.a1.b.a a1$b$a0 = new rx.internal.operators.a1.b.a(this, n0, z0);
                n0.q(z0);
                n0.q(a1$b$a0);
                g g0 = g.M6(z0);
                ((g)this.b.b(g0)).N6(a1$b$a0);
                this.c.N6(z0.T());
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }

        return g.M6(new rx.internal.operators.a1.b(z, p0, g0));
    }

    public static c I7(g g0) {
        static final class rx.internal.operators.a1.a implements rx.g.a {
            final AtomicReference a;

            rx.internal.operators.a1.a(AtomicReference atomicReference0) {
                this.a = atomicReference0;
                super();
            }

            public void a(n n0) {
                rx.internal.operators.a1.c a1$c0;
                d a1$d0;
                do {
                    while(true) {
                        a1$d0 = (d)this.a.get();
                        if(a1$d0 != null && !a1$d0.j()) {
                            break;
                        }
                        d a1$d1 = new d(this.a);
                        a1$d1.T();
                        if(androidx.compose.animation.core.d.a(this.a, a1$d0, a1$d1)) {
                            a1$d0 = a1$d1;
                            break;
                        }
                    }
                    a1$c0 = new rx.internal.operators.a1.c(a1$d0, n0);
                }
                while(!a1$d0.x(a1$c0));
                n0.q(a1$c0);
                n0.X(a1$c0);
            }

            @Override  // rx.functions.b
            public void b(Object object0) {
                this.a(((n)object0));
            }
        }

        AtomicReference atomicReference0 = new AtomicReference();
        return new a1(new rx.internal.operators.a1.a(atomicReference0), g0, atomicReference0);
    }
}

