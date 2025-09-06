package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.S0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.ranges.s;
import kotlinx.coroutines.internal.D;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.g0;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n51#2:541\n52#2,7:547\n24#3,4:542\n16#4:546\n53#5:554\n1#6:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n266#1:541\n266#1:547,7\n266#1:542,4\n266#1:546\n277#1:554\n*E\n"})
public abstract class p0 extends q0 implements Z {
    @s0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n1#2:541\n*E\n"})
    final class a extends c {
        @l
        private final o c;
        final p0 d;

        public a(long v, @l o o0) {
            super(v);
            this.c = o0;
        }

        @Override
        public void run() {
            this.c.X(p0.this, S0.a);
        }

        @Override  // kotlinx.coroutines.p0$c
        @l
        public String toString() {
            return super.toString() + this.c;
        }
    }

    static final class b extends c {
        @l
        private final Runnable c;

        public b(long v, @l Runnable runnable0) {
            super(v);
            this.c = runnable0;
        }

        @Override
        public void run() {
            this.c.run();
        }

        @Override  // kotlinx.coroutines.p0$c
        @l
        public String toString() {
            return super.toString() + this.c;
        }
    }

    @s0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,540:1\n24#2,4:541\n24#2,4:547\n24#2,4:559\n16#3:545\n16#3:551\n16#3:563\n63#4:546\n64#4,7:552\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n434#1:541,4\n436#1:547,4\n476#1:559,4\n434#1:545\n436#1:551\n476#1:563\n436#1:546\n436#1:552,7\n*E\n"})
    public static abstract class c implements Comparable, Runnable, g0, k0 {
        @m
        private volatile Object _heap;
        @f
        public long a;
        private int b;

        public c(long v) {
            this.a = v;
            this.b = -1;
        }

        @Override  // kotlinx.coroutines.internal.g0
        public void a(@m f0 f00) {
            if(this._heap == kotlinx.coroutines.s0.a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = f00;
        }

        // 去混淆评级： 低(20)
        @Override  // kotlinx.coroutines.internal.g0
        @m
        public f0 c() {
            return this._heap instanceof f0 ? ((f0)this._heap) : null;
        }

        @Override
        public int compareTo(Object object0) {
            return this.d(((c)object0));
        }

        public int d(@l c p0$c0) {
            int v = Long.compare(this.a - p0$c0.a, 0L);
            if(v > 0) {
                return 1;
            }
            return v >= 0 ? 0 : -1;
        }

        @Override  // kotlinx.coroutines.k0
        public final void dispose() {
            __monitor_enter(this);
            try {
                Object object0 = this._heap;
                if(object0 != kotlinx.coroutines.s0.a) {
                    d p0$d0 = object0 instanceof d ? ((d)object0) : null;
                    if(p0$d0 != null) {
                        p0$d0.l(this);
                    }
                    this._heap = kotlinx.coroutines.s0.a;
                    goto label_11;
                }
                goto label_13;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        label_11:
            __monitor_exit(this);
            return;
        label_13:
            __monitor_exit(this);
        }

        public final int e(long v, @l d p0$d0, @l p0 p00) {
            synchronized(this) {
                if(this._heap == kotlinx.coroutines.s0.a) {
                    return 2;
                }
                __monitor_enter(p0$d0);
                try {
                    c p0$c0 = (c)p0$d0.e();
                    if(!p00.k()) {
                        if(p0$c0 == null) {
                            p0$d0.c = v;
                        }
                        else {
                            long v2 = p0$c0.a;
                            if(v2 - v < 0L) {
                                v = v2;
                            }
                            if(v - p0$d0.c > 0L) {
                                p0$d0.c = v;
                            }
                        }
                        long v3 = p0$d0.c;
                        if(this.a - v3 < 0L) {
                            this.a = v3;
                        }
                        p0$d0.a(this);
                        goto label_27;
                    }
                    goto label_30;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(p0$d0);
                throw throwable0;
            label_27:
                __monitor_exit(p0$d0);
                return 0;
            label_30:
                __monitor_exit(p0$d0);
                return 1;
            }
        }

        public final boolean f(long v) {
            return v - this.a >= 0L;
        }

        @Override  // kotlinx.coroutines.internal.g0
        public int getIndex() {
            return this.b;
        }

        @Override  // kotlinx.coroutines.internal.g0
        public void setIndex(int v) {
            this.b = v;
        }

        @Override
        @l
        public String toString() {
            return "Delayed[nanos=" + this.a + ']';
        }
    }

    public static final class d extends f0 {
        @f
        public long c;

        public d(long v) {
            this.c = v;
        }
    }

    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile;
    private volatile Object _queue$volatile;
    private static final AtomicReferenceFieldUpdater e;
    private static final AtomicReferenceFieldUpdater f;
    private static final AtomicIntegerFieldUpdater g;

    static {
        p0.e = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_queue$volatile");
        p0.f = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_delayed$volatile");
        p0.g = AtomicIntegerFieldUpdater.newUpdater(p0.class, "_isCompleted$volatile");
    }

    public p0() {
        this._isCompleted$volatile = 0;
    }

    private final Object C3() {
        return this._queue$volatile;
    }

    private final void F3(Object object0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicReferenceFieldUpdater0.get(object0));
        }
    }

    private final void N3() {
        kotlinx.coroutines.b b0 = kotlinx.coroutines.c.a;
        long v = b0 == null ? System.nanoTime() : b0.b();
        d p0$d0;
        while((p0$d0 = (d)p0.f.get(this)) != null) {
            c p0$c0 = (c)p0$d0.o();
            if(p0$c0 == null) {
                break;
            }
            this.L2(v, p0$c0);
        }
    }

    protected final void S3() {
        p0.e.set(this, null);
        p0.f.set(this, null);
    }

    public final void T3(long v, @l c p0$c0) {
        switch(this.Y3(v, p0$c0)) {
            case 0: {
                if(this.e4(p0$c0)) {
                    this.R2();
                }
                break;
            }
            case 1: {
                this.L2(v, p0$c0);
                return;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("unexpected result");
            }
        }
    }

    @Override  // kotlinx.coroutines.Z
    @l
    public k0 Y(long v, @l Runnable runnable0, @l g g0) {
        return kotlinx.coroutines.Z.a.b(this, v, runnable0, g0);
    }

    private final int Y3(long v, c p0$c0) {
        if(this.k()) {
            return 1;
        }
        d p0$d0 = (d)p0.f.get(this);
        if(p0$d0 == null) {
            androidx.concurrent.futures.a.a(p0.f, this, null, new d(v));
            Object object0 = p0.f.get(this);
            L.m(object0);
            p0$d0 = (d)object0;
        }
        return p0$c0.e(v, p0$d0, this);
    }

    @l
    protected final k0 Z3(long v, @l Runnable runnable0) {
        long v1 = kotlinx.coroutines.s0.d(v);
        if(v1 < 0x3FFFFFFFFFFFFFFFL) {
            kotlinx.coroutines.b b0 = kotlinx.coroutines.c.a;
            long v2 = b0 == null ? System.nanoTime() : b0.b();
            k0 k00 = new b(v1 + v2, runnable0);
            this.T3(v2, ((c)k00));
            return k00;
        }
        return X0.a;
    }

    private final void a4(boolean z) {
        p0.g.set(this, ((int)z));
    }

    @Override  // kotlinx.coroutines.K
    public final void b1(@l g g0, @l Runnable runnable0) {
        this.n3(runnable0);
    }

    private final void b3() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = p0.e;
        do {
            while(true) {
                object0 = atomicReferenceFieldUpdater0.get(this);
                if(object0 != null) {
                    break;
                }
                if(androidx.concurrent.futures.a.a(p0.e, this, null, kotlinx.coroutines.s0.h)) {
                    return;
                }
            }
            if(object0 instanceof D) {
                ((D)object0).d();
                return;
            }
            if(object0 == kotlinx.coroutines.s0.h) {
                return;
            }
            D d0 = new D(8, true);
            L.n(object0, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
            d0.a(((Runnable)object0));
        }
        while(!androidx.concurrent.futures.a.a(p0.e, this, object0, d0));
    }

    private final void b4(Object object0) {
        this._delayed$volatile = object0;
    }

    private final void c4(int v) {
        this._isCompleted$volatile = v;
    }

    private final void d4(Object object0) {
        this._queue$volatile = object0;
    }

    @Override  // kotlinx.coroutines.o0
    protected long e2() {
        if(super.e2() == 0L) {
            return 0L;
        }
        Object object0 = p0.e.get(this);
        if(object0 != null) {
            if(!(object0 instanceof D)) {
                return object0 == kotlinx.coroutines.s0.h ? 0x7FFFFFFFFFFFFFFFL : 0L;
            }
            else if(!((D)object0).m()) {
                return 0L;
            }
        }
        d p0$d0 = (d)p0.f.get(this);
        if(p0$d0 != null) {
            c p0$c0 = (c)p0$d0.j();
            if(p0$c0 != null) {
                long v = p0$c0.a;
                kotlinx.coroutines.b b0 = kotlinx.coroutines.c.a;
                return b0 == null ? s.v(v - System.nanoTime(), 0L) : s.v(v - b0.b(), 0L);
            }
        }
        return 0x7FFFFFFFFFFFFFFFL;
    }

    private final Runnable e3() {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = p0.e;
        while(true) {
            object0 = atomicReferenceFieldUpdater0.get(this);
            if(object0 == null) {
                return null;
            }
            if(object0 instanceof D) {
                L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                Object object1 = ((D)object0).s();
                if(object1 != D.t) {
                    return (Runnable)object1;
                }
                androidx.concurrent.futures.a.a(p0.e, this, object0, ((D)object0).r());
            }
            else {
                if(object0 == kotlinx.coroutines.s0.h) {
                    return null;
                }
                if(androidx.concurrent.futures.a.a(p0.e, this, object0, null)) {
                    break;
                }
            }
        }
        L.n(object0, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
        return (Runnable)object0;
    }

    private final boolean e4(c p0$c0) {
        d p0$d0 = (d)p0.f.get(this);
        return (p0$d0 == null ? null : ((c)p0$d0.j())) == p0$c0;
    }

    @Override  // kotlinx.coroutines.o0
    protected boolean j2() {
        if(!this.p2()) {
            return false;
        }
        d p0$d0 = (d)p0.f.get(this);
        if(p0$d0 != null && !p0$d0.i()) {
            return false;
        }
        Object object0 = p0.e.get(this);
        if(object0 == null) {
            return true;
        }
        return object0 instanceof D ? ((D)object0).m() : object0 == kotlinx.coroutines.s0.h;
    }

    private final boolean k() {
        return p0.g.get(this) != 0;
    }

    @Override  // kotlinx.coroutines.Z
    @k(level = kotlin.m.b, message = "Deprecated without replacement as an internal method never intended for public use")
    @m
    public Object l0(long v, @l kotlin.coroutines.d d0) {
        return kotlinx.coroutines.Z.a.a(this, v, d0);
    }

    public void n3(@l Runnable runnable0) {
        if(this.p3(runnable0)) {
            this.R2();
            return;
        }
        V.h.n3(runnable0);
    }

    private final boolean p3(Runnable runnable0) {
        Object object0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = p0.e;
        while(true) {
        alab1:
            while(true) {
                while(true) {
                label_1:
                    object0 = atomicReferenceFieldUpdater0.get(this);
                    if(this.k()) {
                        return false;
                    }
                    if(object0 != null) {
                        break;
                    }
                    if(androidx.concurrent.futures.a.a(p0.e, this, null, runnable0)) {
                        return true;
                    }
                }
                if(!(object0 instanceof D)) {
                    goto label_18;
                }
                L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                int v = ((D)object0).a(runnable0);
                switch(v) {
                    case 0: {
                        return true;
                    label_14:
                        if(v != 2) {
                            break;
                        }
                        break alab1;
                    }
                    case 1: {
                        androidx.concurrent.futures.a.a(p0.e, this, object0, ((D)object0).r());
                        break;
                    }
                    default: {
                        goto label_14;
                    }
                }
            }
            return false;
        label_18:
            if(object0 == kotlinx.coroutines.s0.h) {
                return false;
            }
            D d0 = new D(8, true);
            L.n(object0, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
            d0.a(((Runnable)object0));
            d0.a(runnable0);
            if(!androidx.concurrent.futures.a.a(p0.e, this, object0, d0)) {
                goto label_1;
            }
            break;
        }
        return true;
    }

    private final Object s3() {
        return this._delayed$volatile;
    }

    @Override  // kotlinx.coroutines.o0
    public void shutdown() {
        m1.a.c();
        this.a4(true);
        this.b3();
        while(this.t2() <= 0L) {
        }
        this.N3();
    }

    @Override  // kotlinx.coroutines.o0
    public long t2() {
        if(this.A2()) {
            return 0L;
        }
        d p0$d0 = (d)p0.f.get(this);
        if(p0$d0 != null && !p0$d0.i()) {
            kotlinx.coroutines.b b0 = kotlinx.coroutines.c.a;
            long v = b0 == null ? System.nanoTime() : b0.b();
            while(true) {
                __monitor_enter(p0$d0);
                try {
                    g0 g00 = null;
                    g0 g01 = p0$d0.e();
                    if(g01 == null) {
                        goto label_18;
                    }
                    else {
                        if((((c)g01).f(v) ? this.p3(((c)g01)) : false)) {
                            g00 = p0$d0.m(0);
                        }
                        goto label_16;
                    }
                    goto label_19;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(p0$d0);
                throw throwable0;
            label_16:
                __monitor_exit(p0$d0);
                goto label_19;
            label_18:
                __monitor_exit(p0$d0);
            label_19:
                if(((c)g00) == null) {
                    break;
                }
            }
        }
        Runnable runnable0 = this.e3();
        if(runnable0 != null) {
            runnable0.run();
            return 0L;
        }
        return this.e2();
    }

    @Override  // kotlinx.coroutines.Z
    public void v(long v, @l o o0) {
        long v1 = kotlinx.coroutines.s0.d(v);
        if(v1 < 0x3FFFFFFFFFFFFFFFL) {
            kotlinx.coroutines.b b0 = kotlinx.coroutines.c.a;
            long v2 = b0 == null ? System.nanoTime() : b0.b();
            a p0$a0 = new a(this, v1 + v2, o0);
            this.T3(v2, p0$a0);
            r.a(o0, p0$a0);
        }
    }

    private final int y3() {
        return this._isCompleted$volatile;
    }
}

