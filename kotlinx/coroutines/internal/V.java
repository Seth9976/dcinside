package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.L;
import kotlinx.coroutines.W;
import kotlinx.coroutines.Z;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.o;
import kotlinx.coroutines.x0;
import y4.l;

@s0({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,130:1\n62#1,8:131\n62#1,8:139\n24#2,4:147\n24#2,4:152\n16#3:151\n16#3:156\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n44#1:131,8\n51#1:139,8\n75#1:147,4\n88#1:152,4\n75#1:151\n88#1:156\n*E\n"})
public final class v extends K implements Z {
    final class a implements Runnable {
        @l
        private Runnable a;
        final v b;

        public a(@l Runnable runnable0) {
            this.a = runnable0;
        }

        @Override
        public void run() {
            int v = 0;
            do {
                try {
                    this.a.run();
                }
                catch(Throwable throwable0) {
                    L.b(i.a, throwable0);
                }
                Runnable runnable0 = v.this.g2();
                if(runnable0 == null) {
                    return;
                }
                this.a = runnable0;
                ++v;
            }
            while(v < 16 || !v.this.b.i1(v.this));
            v.this.b.b1(v.this, this);
        }
    }

    @l
    private final K b;
    private final int c;
    private final Z d;
    @l
    private final C e;
    @l
    private final Object f;
    private static final AtomicIntegerFieldUpdater g;
    private volatile int runningWorkers$volatile;

    static {
        v.g = AtomicIntegerFieldUpdater.newUpdater(v.class, "runningWorkers$volatile");
    }

    public v(@l K k0, int v) {
        this.b = k0;
        this.c = v;
        Z z0 = k0 instanceof Z ? ((Z)k0) : null;
        if(z0 == null) {
            z0 = W.a();
        }
        this.d = z0;
        this.e = new C(false);
        this.f = new Object();
    }

    private final void Q1(Runnable runnable0, Function1 function10) {
        this.e.a(runnable0);
        if(v.g.get(this) >= this.c) {
            return;
        }
        if(!this.j2()) {
            return;
        }
        Runnable runnable1 = this.g2();
        if(runnable1 == null) {
            return;
        }
        function10.invoke(new a(this, runnable1));
    }

    @Override  // kotlinx.coroutines.Z
    @l
    public k0 Y(long v, @l Runnable runnable0, @l g g0) {
        return this.d.Y(v, runnable0, g0);
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l g g0, @l Runnable runnable0) {
        this.e.a(runnable0);
        if(v.g.get(this) < this.c && this.j2()) {
            Runnable runnable1 = this.g2();
            if(runnable1 != null) {
                a v$a0 = new a(this, runnable1);
                this.b.b1(this, v$a0);
            }
        }
    }

    private final int d2() {
        return this.runningWorkers$volatile;
    }

    private final Runnable g2() {
        Runnable runnable0;
        while((runnable0 = (Runnable)this.e.j()) == null) {
            synchronized(this.f) {
                v.g.decrementAndGet(this);
                if(this.e.c() == 0) {
                    return null;
                }
                v.g.incrementAndGet(this);
            }
        }
        return runnable0;
    }

    @Override  // kotlinx.coroutines.K
    @E0
    public void h1(@l g g0, @l Runnable runnable0) {
        this.e.a(runnable0);
        if(v.g.get(this) < this.c && this.j2()) {
            Runnable runnable1 = this.g2();
            if(runnable1 != null) {
                a v$a0 = new a(this, runnable1);
                this.b.h1(this, v$a0);
            }
        }
    }

    private final void i2(int v) {
        this.runningWorkers$volatile = v;
    }

    @Override  // kotlinx.coroutines.K
    @x0
    @l
    public K j1(int v) {
        w.a(v);
        return v >= this.c ? this : super.j1(v);
    }

    private final boolean j2() {
        synchronized(this.f) {
            if(v.g.get(this) >= this.c) {
                return false;
            }
            v.g.incrementAndGet(this);
            return true;
        }
    }

    @Override  // kotlinx.coroutines.Z
    @k(level = m.b, message = "Deprecated without replacement as an internal method never intended for public use")
    @y4.m
    public Object l0(long v, @l d d0) {
        return this.d.l0(v, d0);
    }

    @Override  // kotlinx.coroutines.Z
    public void v(long v, @l o o0) {
        this.d.v(v, o0);
    }
}

