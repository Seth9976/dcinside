package rx.subjects;

import androidx.compose.animation.core.d;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.c;
import rx.h;
import rx.internal.operators.x;
import rx.internal.util.unsafe.G;
import rx.internal.util.unsafe.H;
import rx.n;
import rx.o;

public final class i extends f {
    static final class a extends AtomicLong implements rx.g.a, h, rx.i, o {
        final AtomicReference a;
        final Queue b;
        final boolean c;
        final AtomicReference d;
        Throwable e;
        volatile boolean f;
        boolean g;
        boolean h;
        volatile boolean i;
        private static final long j = -9044104859202255786L;

        public a(int v, boolean z, rx.functions.a a0) {
            this.a = new AtomicReference();
            this.d = a0 == null ? null : new AtomicReference(a0);
            this.c = z;
            H h0 = v > 1 ? new H(v) : new G();
            this.b = h0;
        }

        void Q() {
            boolean z1;
            __monitor_enter(this);
            if(this.g) {
                this.h = true;
                __monitor_exit(this);
                return;
            }
            this.g = true;
            __monitor_exit(this);
            Queue queue0 = this.b;
            boolean z = this.c;
            while(true) {
                n n0 = (n)this.a.get();
                if(n0 == null) {
                    z1 = false;
                }
                else {
                    if(this.q(this.f, queue0.isEmpty(), z, n0)) {
                        return;
                    }
                    long v = this.get();
                    z1 = v == 0x7FFFFFFFFFFFFFFFL;
                    long v1;
                    for(v1 = 0L; v != 0L; ++v1) {
                        boolean z2 = this.f;
                        Object object0 = queue0.poll();
                        if(this.q(z2, object0 == null, z, n0)) {
                            return;
                        }
                        if(object0 == null) {
                            break;
                        }
                        Object object1 = x.e(object0);
                        try {
                            n0.onNext(object1);
                            --v;
                        }
                        catch(Throwable throwable0) {
                            queue0.clear();
                            c.e(throwable0);
                            n0.onError(rx.exceptions.h.a(throwable0, object1));
                            return;
                        }
                    }
                    if(!z1 && v1 != 0L) {
                        this.addAndGet(-v1);
                    }
                }
                synchronized(this) {
                    if(!this.h) {
                        if(z1 && queue0.isEmpty()) {
                            this.i = true;
                        }
                        this.g = false;
                        __monitor_exit(this);
                        return;
                    }
                    goto label_44;
                }
                __monitor_exit(this);
                return;
                try {
                label_44:
                    this.h = false;
                }
                catch(Throwable throwable1) {
                    __monitor_exit(this);
                    throw throwable1;
                }
                __monitor_exit(this);
            }
        }

        @Override  // rx.functions.b
        public void b(Object object0) {
            this.o(((n)object0));
        }

        @Override  // rx.h
        public void d() {
            if(!this.f) {
                this.x();
                this.f = true;
                if(!this.i) {
                    this.Q();
                    return;
                }
                ((n)this.a.get()).d();
            }
        }

        @Override  // rx.o
        public boolean j() {
            return this.f;
        }

        @Override  // rx.o
        public void l() {
            this.x();
            this.f = true;
            synchronized(this) {
                if(this.g) {
                    return;
                }
                this.g = true;
            }
            this.b.clear();
        }

        public void o(n n0) {
            if(d.a(this.a, null, n0)) {
                n0.q(this);
                n0.X(this);
                return;
            }
            n0.onError(new IllegalStateException("Only a single subscriber is allowed"));
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(!this.f) {
                this.x();
                this.e = throwable0;
                this.f = true;
                if(!this.i) {
                    this.Q();
                    return;
                }
                ((n)this.a.get()).onError(throwable0);
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            boolean z;
            if(!this.f) {
                if(!this.i) {
                    synchronized(this) {
                        if(this.i) {
                            z = false;
                        }
                        else {
                            Object object1 = x.j(object0);
                            this.b.offer(object1);
                            z = true;
                        }
                    }
                    if(z) {
                        this.Q();
                        return;
                    }
                }
                n n0 = (n)this.a.get();
                try {
                    n0.onNext(object0);
                }
                catch(Throwable throwable0) {
                    c.g(throwable0, n0, object0);
                }
            }
        }

        boolean q(boolean z, boolean z1, boolean z2, n n0) {
            if(n0.j()) {
                this.b.clear();
                return true;
            }
            if(z) {
                Throwable throwable0 = this.e;
                if(throwable0 != null && !z2) {
                    this.b.clear();
                    n0.onError(throwable0);
                    return true;
                }
                if(z1) {
                    if(throwable0 != null) {
                        n0.onError(throwable0);
                        return true;
                    }
                    n0.d();
                    return true;
                }
            }
            return false;
        }

        @Override  // rx.i
        public void request(long v) {
            int v1 = Long.compare(v, 0L);
            if(v1 < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if(v1 > 0) {
                rx.internal.operators.a.b(this, v);
                this.Q();
                return;
            }
            if(this.f) {
                this.Q();
            }
        }

        void x() {
            AtomicReference atomicReference0 = this.d;
            if(atomicReference0 != null) {
                rx.functions.a a0 = (rx.functions.a)atomicReference0.get();
                if(a0 != null && d.a(atomicReference0, a0, null)) {
                    a0.call();
                }
            }
        }
    }

    final a b;

    private i(a i$a0) {
        super(i$a0);
        this.b = i$a0;
    }

    @Override  // rx.subjects.f
    public boolean A7() {
        return this.b.a.get() != null;
    }

    public static i C7() {
        return i.D7(16);
    }

    public static i D7(int v) {
        return new i(new a(v, false, null));
    }

    public static i E7(int v, rx.functions.a a0) {
        return new i(new a(v, false, a0));
    }

    public static i F7(int v, rx.functions.a a0, boolean z) {
        return new i(new a(v, z, a0));
    }

    public static i G7(boolean z) {
        return new i(new a(16, z, null));
    }

    @Override  // rx.h
    public void d() {
        this.b.d();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.b.onError(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.b.onNext(object0);
    }
}

