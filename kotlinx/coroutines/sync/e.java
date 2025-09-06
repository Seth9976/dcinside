package kotlinx.coroutines.sync;

import androidx.concurrent.futures.a;
import com.google.common.util.concurrent.Z0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.S;
import kotlinx.coroutines.internal.T;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import kotlinx.coroutines.selects.m;
import kotlinx.coroutines.y1;
import y4.l;

@s0({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,392:1\n200#1,10:406\n200#1,10:416\n1#2:393\n336#3,12:394\n68#4,3:426\n42#4,8:429\n68#4,3:440\n42#4,8:443\n370#5:437\n370#5:438\n362#5:439\n373#5:451\n362#5:452\n370#5:453\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n192#1:406,10\n216#1:416,10\n182#1:394,12\n284#1:426,3\n284#1:429,8\n317#1:440,3\n317#1:443,8\n288#1:437\n294#1:438\n308#1:439\n323#1:451\n329#1:452\n332#1:453\n*E\n"})
public class e implements d {
    private volatile int _availablePermits$volatile;
    private final int a;
    @l
    private final Function1 b;
    private static final AtomicReferenceFieldUpdater c;
    private static final AtomicLongFieldUpdater d;
    private volatile long deqIdx$volatile;
    private static final AtomicReferenceFieldUpdater e;
    private volatile long enqIdx$volatile;
    private static final AtomicLongFieldUpdater f;
    private static final AtomicIntegerFieldUpdater g;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    static {
        e.c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "head$volatile");
        e.d = AtomicLongFieldUpdater.newUpdater(e.class, "deqIdx$volatile");
        e.e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "tail$volatile");
        e.f = AtomicLongFieldUpdater.newUpdater(e.class, "enqIdx$volatile");
        e.g = AtomicIntegerFieldUpdater.newUpdater(e.class, "_availablePermits$volatile");
    }

    public e(int v, int v1) {
        static final class b extends N implements Function1 {
            final e e;

            b(e e0) {
                this.e = e0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@l Throwable throwable0) {
                this.e.release();
            }
        }

        this.a = v;
        if(v <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + v).toString());
        }
        if(v1 < 0 || v1 > v) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + v).toString());
        }
        g g0 = new g(0L, null, 2);
        this.head$volatile = g0;
        this.tail$volatile = g0;
        this._availablePermits$volatile = v - v1;
        this.b = new b(this);
    }

    private final int A() {
        return this._availablePermits$volatile;
    }

    protected final void C(@l m m0, @y4.m Object object0) {
        do {
            if(this.r() > 0) {
                m0.g(S0.a);
                return;
            }
            L.n(m0, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
        }
        while(!this.p(((y1)m0)));
    }

    private final void D(long v) {
        this.deqIdx$volatile = v;
    }

    private final void E(long v) {
        this.enqIdx$volatile = v;
    }

    private final void F(Object object0) {
        this.head$volatile = object0;
    }

    private final void G(Object object0) {
        this.tail$volatile = object0;
    }

    private final void H(int v) {
        this._availablePermits$volatile = v;
    }

    private final boolean I(Object object0) {
        if(object0 instanceof o) {
            L.n(object0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            Object object1 = ((o)object0).U(S0.a, null, this.b);
            if(object1 != null) {
                ((o)object0).E(object1);
                return true;
            }
            return false;
        }
        if(!(object0 instanceof m)) {
            throw new IllegalStateException(("unexpected: " + object0).toString());
        }
        return ((m)object0).j(this, S0.a);
    }

    private final boolean J() {
        final class c extends H implements A3.o {
            public static final c a;

            static {
                c.a = new c();
            }

            c() {
                super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
            }

            @l
            public final g a(long v, @y4.m g g0) {
                return f.j(v, g0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).longValue(), ((g)object1));
            }
        }

        Object object0;
        g g0 = (g)e.c.get(this);
        long v = e.d.getAndIncrement(this);
        c e$c0 = c.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = e.c;
    alab1:
        while(true) {
            object0 = kotlinx.coroutines.internal.f.g(g0, v / 16L, e$c0);
            if(T.h(object0)) {
                break;
            }
            S s0 = T.f(object0);
            while(true) {
                S s1 = (S)atomicReferenceFieldUpdater0.get(this);
                if(s1.c >= s0.c) {
                    break alab1;
                }
                if(!s0.C()) {
                    break;
                }
                if(a.a(atomicReferenceFieldUpdater0, this, s1, s0)) {
                    if(!s1.v()) {
                        break alab1;
                    }
                    s1.q();
                    break alab1;
                }
                if(s0.v()) {
                    s0.q();
                }
            }
        }
        g g1 = (g)T.f(object0);
        g1.c();
        if(g1.c > v / 16L) {
            return false;
        }
        Object object1 = g1.F().getAndSet(((int)(v % 16L)), f.b);
        if(object1 == null) {
            for(int v1 = 0; v1 < 100; ++v1) {
                if(g1.F().get(((int)(v % 16L))) == f.c) {
                    return true;
                }
            }
            return !Z0.a(g1.F(), ((int)(v % 16L)), f.b, f.d);
        }
        return object1 == f.e ? false : this.I(object1);
    }

    @Override  // kotlinx.coroutines.sync.d
    public boolean a() {
        while(true) {
            int v = e.g.get(this);
            if(v > this.a) {
                this.q();
            }
            else {
                if(v <= 0) {
                    return false;
                }
                if(e.g.compareAndSet(this, v, v - 1)) {
                    break;
                }
            }
        }
        return true;
    }

    @Override  // kotlinx.coroutines.sync.d
    public int f() {
        return Math.max(e.g.get(this), 0);
    }

    @Override  // kotlinx.coroutines.sync.d
    @y4.m
    public Object g(@l kotlin.coroutines.d d0) {
        return e.n(this, d0);
    }

    public static final Object j(e e0, kotlin.coroutines.d d0) {
        return e0.o(d0);
    }

    private final void l(Object object0, Function1 function10, Function1 function11) {
        do {
            if(this.r() > 0) {
                function11.invoke(object0);
                return;
            }
        }
        while(!((Boolean)function10.invoke(object0)).booleanValue());
    }

    protected final void m(@l o o0) {
        do {
            if(this.r() > 0) {
                o0.B(S0.a, this.b);
                return;
            }
            L.n(o0, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
        }
        while(!this.p(((y1)o0)));
    }

    static Object n(e e0, kotlin.coroutines.d d0) {
        if(e0.r() > 0) {
            return S0.a;
        }
        Object object0 = e0.o(d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    private final Object o(kotlin.coroutines.d d0) {
        p p0 = r.b(kotlin.coroutines.intrinsics.b.e(d0));
        try {
            if(!this.p(p0)) {
                this.m(p0);
            }
        }
        catch(Throwable throwable0) {
            p0.V();
            throw throwable0;
        }
        Object object0 = p0.x();
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    private final boolean p(y1 y10) {
        final class kotlinx.coroutines.sync.e.a extends H implements A3.o {
            public static final kotlinx.coroutines.sync.e.a a;

            static {
                kotlinx.coroutines.sync.e.a.a = new kotlinx.coroutines.sync.e.a();
            }

            kotlinx.coroutines.sync.e.a() {
                super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
            }

            @l
            public final g a(long v, @y4.m g g0) {
                return f.j(v, g0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Number)object0).longValue(), ((g)object1));
            }
        }

        Object object0;
        g g0 = (g)e.e.get(this);
        long v = e.f.getAndIncrement(this);
        kotlinx.coroutines.sync.e.a e$a0 = kotlinx.coroutines.sync.e.a.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = e.e;
    alab1:
        while(true) {
            object0 = kotlinx.coroutines.internal.f.g(g0, v / 16L, e$a0);
            if(T.h(object0)) {
                break;
            }
            S s0 = T.f(object0);
            while(true) {
                S s1 = (S)atomicReferenceFieldUpdater0.get(this);
                if(s1.c >= s0.c) {
                    break alab1;
                }
                if(!s0.C()) {
                    break;
                }
                if(a.a(atomicReferenceFieldUpdater0, this, s1, s0)) {
                    if(!s1.v()) {
                        break alab1;
                    }
                    s1.q();
                    break alab1;
                }
                if(s0.v()) {
                    s0.q();
                }
            }
        }
        g g1 = (g)T.f(object0);
        if(Z0.a(g1.F(), ((int)(v % 16L)), null, y10)) {
            y10.d(g1, ((int)(v % 16L)));
            return true;
        }
        if(Z0.a(g1.F(), ((int)(v % 16L)), f.b, f.c)) {
            if(y10 instanceof o) {
                L.n(y10, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                ((o)y10).B(S0.a, this.b);
                return true;
            }
            if(!(y10 instanceof m)) {
                throw new IllegalStateException(("unexpected: " + y10).toString());
            }
            ((m)y10).g(S0.a);
            return true;
        }
        return false;
    }

    private final void q() {
        do {
            int v = e.g.get(this);
        }
        while(v > this.a && !e.g.compareAndSet(this, v, this.a));
    }

    private final int r() {
        int v;
        do {
            v = e.g.getAndDecrement(this);
        }
        while(v > this.a);
        return v;
    }

    @Override  // kotlinx.coroutines.sync.d
    public void release() {
        int v;
        while((v = e.g.getAndIncrement(this)) < this.a) {
            if(v >= 0) {
                return;
            }
            if(this.J()) {
                return;
            }
        }
        this.q();
        throw new IllegalStateException(("The number of released permits cannot be greater than " + this.a).toString());
    }

    private final long s() {
        return this.deqIdx$volatile;
    }

    private final long u() {
        return this.enqIdx$volatile;
    }

    private final Object w() {
        return this.head$volatile;
    }

    private final Object y() {
        return this.tail$volatile;
    }
}

