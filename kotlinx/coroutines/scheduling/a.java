package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.P;
import kotlinx.coroutines.internal.V;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1051:1\n281#1:1054\n279#1:1055\n279#1:1056\n281#1:1057\n276#1:1063\n277#1,5:1064\n287#1:1070\n279#1:1071\n280#1:1072\n279#1:1078\n280#1:1079\n276#1:1080\n284#1:1081\n279#1:1082\n279#1:1085\n280#1:1086\n281#1:1087\n89#2:1052\n89#2:1069\n1#3:1053\n24#4,4:1058\n24#4,4:1073\n16#5:1062\n16#5:1077\n86#6:1083\n617#7:1084\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n277#1:1054\n284#1:1055\n285#1:1056\n294#1:1057\n343#1:1063\n372#1:1064,5\n395#1:1070\n442#1:1071\n443#1:1072\n479#1:1078\n480#1:1079\n486#1:1080\n495#1:1081\n495#1:1082\n576#1:1085\n577#1:1086\n578#1:1087\n115#1:1052\n392#1:1069\n343#1:1058,4\n475#1:1073,4\n343#1:1062\n475#1:1077\n512#1:1083\n519#1:1084\n*E\n"})
public final class a implements Closeable, Executor {
    public static final class kotlinx.coroutines.scheduling.a.a {
        private kotlinx.coroutines.scheduling.a.a() {
        }

        public kotlinx.coroutines.scheduling.a.a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[d.values().length];
            try {
                arr_v[d.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.a.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @s0({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1051:1\n293#2,2:1052\n281#2:1054\n295#2,4:1055\n300#2:1059\n290#2,2:1060\n290#2,2:1064\n276#2:1071\n285#2:1072\n279#2:1073\n276#2:1074\n1#3:1062\n86#4:1063\n24#5,4:1066\n16#6:1070\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n682#1:1052,2\n682#1:1054\n682#1:1055,4\n697#1:1059\n771#1:1060,2\n825#1:1064,2\n873#1:1071\n899#1:1072\n899#1:1073\n981#1:1074\n808#1:1063\n869#1:1066,4\n869#1:1070\n*E\n"})
    public final class c extends Thread {
        @l
        @f
        public final q a;
        @l
        private final h b;
        @l
        @f
        public d c;
        private long d;
        private long e;
        private int f;
        @f
        public boolean g;
        final a h;
        private static final AtomicIntegerFieldUpdater i;
        private volatile int indexInArray;
        @m
        private volatile Object nextParkedWorker;
        private volatile int workerCtl$volatile;

        static {
            c.i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");
        }

        private c() {
            this.setDaemon(true);
            this.setContextClassLoader(a0.getClass().getClassLoader());
            this.a = new q();
            this.b = new h();
            this.c = d.d;
            this.nextParkedWorker = a.l;
            this.f = ((int)System.nanoTime()) == 0 ? 42 : ((int)System.nanoTime());
        }

        public c(int v) {
            this.v(v);
        }

        public final boolean A(@l d a$d0) {
            d a$d1 = this.c;
            boolean z = a$d1 == d.a;
            if(z) {
                a.j.addAndGet(a.this, 0x40000000000L);
            }
            if(a$d1 != a$d0) {
                this.c = a$d0;
            }
            return z;
        }

        private final k B(int v) {
            long v1 = a.j.get(a.this);
            if(((int)(v1 & 0x1FFFFFL)) < 2) {
                return null;
            }
            int v2 = this.q(((int)(v1 & 0x1FFFFFL)));
            a a0 = a.this;
            long v4 = 0x7FFFFFFFFFFFFFFFL;
            for(int v3 = 0; v3 < ((int)(v1 & 0x1FFFFFL)); ++v3) {
                ++v2;
                v2 = v2 <= ((int)(v1 & 0x1FFFFFL)) ? v2 + 1 : 1;
                c a$c0 = (c)a0.g.b(v2);
                if(a$c0 != null && a$c0 != this) {
                    long v5 = a$c0.a.B(v, this.b);
                    if(v5 == -1L) {
                        k k0 = (k)this.b.a;
                        this.b.a = null;
                        return k0;
                    }
                    if(v5 > 0L) {
                        v4 = Math.min(v4, v5);
                    }
                }
            }
            if(v4 == 0x7FFFFFFFFFFFFFFFL) {
                v4 = 0L;
            }
            this.e = v4;
            return null;
        }

        private final void C() {
            a a0 = a.this;
            P p0 = a0.g;
            __monitor_enter(p0);
            try {
                if(!a0.isTerminated()) {
                    if(((int)(a.j.get(a0) & 0x1FFFFFL)) > a0.a) {
                        if(c.i.compareAndSet(this, -1, 1)) {
                            int v = this.indexInArray;
                            this.v(0);
                            a0.u0(this, v, 0);
                            long v1 = a.j.getAndDecrement(a0);
                            if(((int)(v1 & 0x1FFFFFL)) != v) {
                                Object object0 = a0.g.b(((int)(v1 & 0x1FFFFFL)));
                                L.m(object0);
                                a0.g.c(v, ((c)object0));
                                ((c)object0).v(v);
                                a0.u0(((c)object0), ((int)(v1 & 0x1FFFFFL)), v);
                            }
                            a0.g.c(((int)(v1 & 0x1FFFFFL)), null);
                            goto label_21;
                        }
                        goto label_24;
                    }
                    goto label_26;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(p0);
            throw throwable0;
        label_21:
            __monitor_exit(p0);
            this.c = d.e;
            return;
        label_24:
            __monitor_exit(p0);
            return;
        label_26:
            __monitor_exit(p0);
            return;
        label_28:
            __monitor_exit(p0);
        }

        private final void b(int v) {
            if(v == 0) {
                return;
            }
            a.j.addAndGet(a.this, 0xFFFFFFFFFFE00000L);
            if(this.c != d.e) {
                this.c = d.d;
            }
        }

        private final void c(int v) {
            if(v == 0) {
                return;
            }
            if(this.A(d.b)) {
                a.this.c1();
            }
        }

        private final void d(k k0) {
            int v = k0.b.d0();
            this.n(v);
            this.c(v);
            a.this.E0(k0);
            this.b(v);
        }

        private final k e(boolean z) {
            if(z) {
                boolean z1 = this.q(a.this.a * 2) == 0;
                if(z1) {
                    k k0 = this.s();
                    if(k0 != null) {
                        return k0;
                    }
                }
                k k1 = this.a.p();
                if(k1 != null) {
                    return k1;
                }
                if(!z1) {
                    k k2 = this.s();
                    return k2 == null ? this.B(3) : k2;
                }
                return this.B(3);
            }
            k k3 = this.s();
            return k3 == null ? this.B(3) : k3;
        }

        private final k f() {
            k k0 = this.a.q();
            if(k0 == null) {
                k0 = (k)a.this.f.j();
                return k0 == null ? this.B(1) : k0;
            }
            return k0;
        }

        private final k g() {
            k k0 = this.a.s();
            if(k0 == null) {
                k0 = (k)a.this.f.j();
                return k0 == null ? this.B(2) : k0;
            }
            return k0;
        }

        // 去混淆评级： 低(20)
        @m
        public final k h(boolean z) {
            return this.y() ? this.e(z) : this.f();
        }

        public final int i() {
            return this.indexInArray;
        }

        @m
        public final Object j() {
            return this.nextParkedWorker;
        }

        @l
        public final a k() {
            return a.this;
        }

        private final int l() {
            return this.workerCtl$volatile;
        }

        private final void n(int v) {
            this.d = 0L;
            if(this.c == d.c) {
                this.c = d.b;
            }
        }

        private final boolean o() {
            return this.nextParkedWorker != a.l;
        }

        public final boolean p() {
            return this.c == d.b;
        }

        public final int q(int v) {
            int v1 = this.f ^ this.f << 13;
            int v2 = v1 ^ v1 >> 17;
            int v3 = v2 ^ v2 << 5;
            this.f = v3;
            return (v - 1 & v) == 0 ? v3 & v - 1 : (v3 & 0x7FFFFFFF) % v;
        }

        private final void r() {
            if(this.d == 0L) {
                this.d = System.nanoTime() + a.this.c;
            }
            LockSupport.parkNanos(a.this.c);
            if(System.nanoTime() - this.d >= 0L) {
                this.d = 0L;
                this.C();
            }
        }

        @Override
        public void run() {
            this.u();
        }

        private final k s() {
            if(this.q(2) == 0) {
                k k0 = (k)a.this.e.j();
                return k0 == null ? ((k)a.this.f.j()) : k0;
            }
            k k1 = (k)a.this.f.j();
            return k1 == null ? ((k)a.this.e.j()) : k1;
        }

        public final long t() {
            boolean z = this.c == d.a;
            k k0 = z ? this.g() : this.f();
            if(k0 == null) {
                return this.e == 0L ? -1L : this.e;
            }
            a.this.E0(k0);
            if(!z) {
                a.j.addAndGet(a.this, 0xFFFFFFFFFFE00000L);
            }
            return 0L;
        }

        private final void u() {
        alab1:
            while(true) {
                boolean z = false;
                while(true) {
                    if(a.this.isTerminated() || this.c == d.e) {
                        break alab1;
                    }
                    k k0 = this.h(this.g);
                    if(k0 != null) {
                        this.e = 0L;
                        this.d(k0);
                        break;
                    }
                    this.g = false;
                    if(this.e == 0L) {
                        this.z();
                    }
                    else {
                        if(z) {
                            this.A(d.c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.e);
                            this.e = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
            this.A(d.e);
        }

        public final void v(int v) {
            this.setName(a.this.d + "-worker-" + (v == 0 ? "TERMINATED" : String.valueOf(v)));
            this.indexInArray = v;
        }

        public final void w(@m Object object0) {
            this.nextParkedWorker = object0;
        }

        private final void x(int v) {
            this.workerCtl$volatile = v;
        }

        private final boolean y() {
            if(this.c != d.a) {
                a a0 = a.this;
                AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.j;
                do {
                    long v = atomicLongFieldUpdater0.get(a0);
                    if(((int)((0x7FFFFC0000000000L & v) >> 42)) == 0) {
                        return false;
                    }
                }
                while(!a.j.compareAndSet(a0, v, v - 0x40000000000L));
                this.c = d.a;
            }
            return true;
        }

        private final void z() {
            if(!this.o()) {
                a.this.l0(this);
                return;
            }
            c.i.set(this, -1);
            while(this.o() && c.i.get(this) == -1 && !a.this.isTerminated() && this.c != d.e) {
                this.A(d.c);
                Thread.interrupted();
                this.r();
            }
        }
    }

    public static enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        private static final d[] f;
        private static final kotlin.enums.a g;

        static {
            d.f = arr_a$d;
            L.p(arr_a$d, "entries");
            d.g = new kotlin.enums.d(arr_a$d);
        }

        private static final d[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return d.g;
        }
    }

    private volatile int _isTerminated$volatile;
    @f
    public final int a;
    @f
    public final int b;
    @f
    public final long c;
    private volatile long controlState$volatile;
    @l
    @f
    public final String d;
    @l
    @f
    public final kotlinx.coroutines.scheduling.f e;
    @l
    @f
    public final kotlinx.coroutines.scheduling.f f;
    @l
    @f
    public final P g;
    @l
    public static final kotlinx.coroutines.scheduling.a.a h = null;
    private static final AtomicLongFieldUpdater i = null;
    private static final AtomicLongFieldUpdater j = null;
    private static final AtomicIntegerFieldUpdater k = null;
    @l
    @f
    public static final V l = null;
    private static final int m = -1;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 21;
    private volatile long parkedWorkersStack$volatile;
    private static final long q = 0x1FFFFFL;
    private static final long r = 0x3FFFFE00000L;
    private static final int s = 42;
    private static final long t = 0x7FFFFC0000000000L;
    public static final int u = 1;
    public static final int v = 0x1FFFFE;
    private static final long w = 0x1FFFFFL;
    private static final long x = 0xFFFFFFFFFFE00000L;
    private static final long y = 0x200000L;

    static {
        a.h = new kotlinx.coroutines.scheduling.a.a(null);
        a.i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");
        a.j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");
        a.k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");
        a.l = new V("NOT_IN_STACK");
    }

    public a(int v, int v1, long v2, @l String s) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
        if(v < 1) {
            throw new IllegalArgumentException(("Core pool size " + v + " should be at least 1").toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("Max pool size " + v1 + " should be greater than or equals to core pool size " + v).toString());
        }
        if(v1 > 0x1FFFFE) {
            throw new IllegalArgumentException(("Max pool size " + v1 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if(v2 <= 0L) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + v2 + " must be positive").toString());
        }
        this.e = new kotlinx.coroutines.scheduling.f();
        this.f = new kotlinx.coroutines.scheduling.f();
        this.g = new P((v + 1) * 2);
        this.controlState$volatile = ((long)v) << 42;
        this._isTerminated$volatile = 0;
    }

    public a(int v, int v1, long v2, String s, int v3, w w0) {
        if((v3 & 4) != 0) {
            v2 = o.e;
        }
        if((v3 & 8) != 0) {
            s = "DefaultDispatcher";
        }
        this(v, v1, v2, s);
    }

    public final void E0(@l k k0) {
        kotlinx.coroutines.b b0;
        try {
            k0.run();
            b0 = kotlinx.coroutines.c.a;
        }
        catch(Throwable throwable0) {
            try {
                Thread thread0 = Thread.currentThread();
                thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
                b0 = kotlinx.coroutines.c.a;
            }
            catch(Throwable throwable1) {
                kotlinx.coroutines.b b1 = kotlinx.coroutines.c.a;
                if(b1 != null) {
                    b1.f();
                }
                throw throwable1;
            }
            if(b0 != null) {
                b0.f();
                return;
            }
            return;
        }
        if(b0 != null) {
            b0.f();
        }
    }

    private final void L0(long v) {
        this.controlState$volatile = v;
    }

    private final int Q() {
        return this._isTerminated$volatile;
    }

    private final long T() {
        return a.j.addAndGet(this, 0x200000L);
    }

    private final void T0(long v) {
        this.parkedWorkersStack$volatile = v;
    }

    private final int Y() {
        return (int)(a.j.incrementAndGet(this) & 0x1FFFFFL);
    }

    private final void Y0(int v) {
        this._isTerminated$volatile = v;
    }

    public final void a1(long v) {
        k k1;
        if(!a.k.compareAndSet(this, 0, 1)) {
            return;
        }
        c a$c0 = this.k();
        synchronized(this.g) {
            long v2 = a.j.get(this);
        }
        if(1 <= ((int)(v2 & 0x1FFFFFL))) {
            for(int v3 = 1; true; ++v3) {
                Object object0 = this.g.b(v3);
                L.m(object0);
                c a$c1 = (c)object0;
                if(a$c1 != a$c0) {
                    while(a$c1.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(a$c1);
                        a$c1.join(v);
                    }
                    a$c1.a.o(this.f);
                }
                if(v3 == ((int)(v2 & 0x1FFFFFL))) {
                    break;
                }
            }
        }
        this.f.b();
        this.e.b();
        while(true) {
            if(a$c0 == null) {
                k k2 = (k)this.e.j();
                if(k2 == null) {
                    k1 = (k)this.f.j();
                    if(k1 != null) {
                        goto label_36;
                    }
                    break;
                }
                else {
                    k1 = k2;
                }
            }
            else {
                k k0 = a$c0.h(true);
                if(k0 != null) {
                    k1 = k0;
                }
            }
        label_36:
            this.E0(k1);
        }
        if(a$c0 != null) {
            a$c0.A(d.e);
        }
        a.i.set(this, 0L);
        a.j.set(this, 0L);
    }

    private final boolean b(k k0) {
        return k0.b.d0() == 1 ? this.f.a(k0) : this.e.a(k0);
    }

    private final void b1(long v, boolean z) {
        if(z) {
            return;
        }
        if(this.t1()) {
            return;
        }
        if(this.i1(v)) {
            return;
        }
        this.t1();
    }

    public final int c(long v) {
        return (int)((v & 0x7FFFFC0000000000L) >> 42);
    }

    public final void c1() {
        if(this.t1()) {
            return;
        }
        if(a.j1(this, 0L, 1, null)) {
            return;
        }
        this.t1();
    }

    @Override
    public void close() {
        this.a1(10000L);
    }

    private final void d0(Object object0, AtomicLongFieldUpdater atomicLongFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicLongFieldUpdater0.get(object0));
        }
    }

    private final k d1(c a$c0, k k0, boolean z) {
        if(a$c0 == null) {
            return k0;
        }
        if(a$c0.c == d.e) {
            return k0;
        }
        if(k0.b.d0() == 0 && a$c0.c == d.b) {
            return k0;
        }
        a$c0.g = true;
        return a$c0.a.a(k0, z);
    }

    private final int e(long v) {
        return (int)((v & 0x3FFFFE00000L) >> 21);
    }

    private final int e0(c a$c0) {
        for(Object object0 = a$c0.j(); true; object0 = ((c)object0).j()) {
            if(object0 == a.l) {
                return -1;
            }
            if(object0 == null) {
                return 0;
            }
            int v = ((c)object0).i();
            if(v != 0) {
                return v;
            }
        }
    }

    @Override
    public void execute(@l Runnable runnable0) {
        a.q(this, runnable0, null, false, 6, null);
    }

    private final int f() {
        c a$c0;
        int v1;
        synchronized(this.g) {
            if(!this.isTerminated()) {
                long v = a.j.get(this);
                v1 = s.u(((int)(v & 0x1FFFFFL)) - ((int)((v & 0x3FFFFE00000L) >> 21)), 0);
                if(v1 >= this.a) {
                    return 0;
                }
                goto label_8;
            }
            return -1;
        }
        return 0;
    label_8:
        if(((int)(v & 0x1FFFFFL)) >= this.b) {
            return 0;
        }
        int v2 = ((int)(a.j.get(this) & 0x1FFFFFL)) + 1;
        if(v2 <= 0 || this.g.b(v2) != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        a$c0 = new c(this, v2);
        this.g.c(v2, a$c0);
        if(v2 != ((int)(0x1FFFFFL & a.j.incrementAndGet(this)))) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        a$c0.start();
        return v1 + 1;
    }

    private final c f0() {
        c a$c0;
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.i;
        do {
            long v = atomicLongFieldUpdater0.get(this);
            a$c0 = (c)this.g.b(((int)(0x1FFFFFL & v)));
            if(a$c0 == null) {
                return null;
            }
            int v1 = this.e0(a$c0);
        }
        while(v1 < 0 || !a.i.compareAndSet(this, v, ((long)v1) | v + 0x200000L & 0xFFFFFFFFFFE00000L));
        a$c0.w(a.l);
        return a$c0;
    }

    private final boolean h1() {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.j;
        do {
            long v = atomicLongFieldUpdater0.get(this);
            if(((int)((0x7FFFFC0000000000L & v) >> 42)) == 0) {
                return false;
            }
        }
        while(!a.j.compareAndSet(this, v, v - 0x40000000000L));
        return true;
    }

    @l
    public final k i(@l Runnable runnable0, @l kotlinx.coroutines.scheduling.l l0) {
        long v = o.f.a();
        if(runnable0 instanceof k) {
            ((k)runnable0).a = v;
            ((k)runnable0).b = l0;
            return (k)runnable0;
        }
        return new n(runnable0, v, l0);
    }

    private final boolean i1(long v) {
        if(s.u(((int)(0x1FFFFFL & v)) - ((int)((v & 0x3FFFFE00000L) >> 21)), 0) < this.a) {
            int v1 = this.f();
            if(v1 == 1 && this.a > 1) {
                this.f();
            }
            return v1 > 0;
        }
        return false;
    }

    public final boolean isTerminated() {
        return a.k.get(this) != 0;
    }

    private final int j(long v) {
        return (int)(v & 0x1FFFFFL);
    }

    static boolean j1(a a0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = a.j.get(a0);
        }
        return a0.i1(v);
    }

    private final c k() {
        Thread thread0 = Thread.currentThread();
        c a$c0 = thread0 instanceof c ? ((c)thread0) : null;
        return a$c0 == null || !L.g(a.this, this) ? null : a$c0;
    }

    public final boolean l0(@l c a$c0) {
        if(a$c0.j() != a.l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.i;
        do {
            long v = atomicLongFieldUpdater0.get(this);
            a$c0.w(this.g.b(((int)(0x1FFFFFL & v))));
        }
        while(!a.i.compareAndSet(this, v, v + 0x200000L & 0xFFFFFFFFFFE00000L | ((long)a$c0.i())));
        return true;
    }

    private final void n() {
        a.j.addAndGet(this, 0xFFFFFFFFFFE00000L);
    }

    private final int o() {
        return (int)(a.j.getAndDecrement(this) & 0x1FFFFFL);
    }

    public final void p(@l Runnable runnable0, @l kotlinx.coroutines.scheduling.l l0, boolean z) {
        kotlinx.coroutines.b b0 = kotlinx.coroutines.c.a;
        if(b0 != null) {
            b0.e();
        }
        k k0 = this.i(runnable0, l0);
        boolean z1 = false;
        boolean z2 = k0.b.d0() == 1;
        long v = z2 ? a.j.addAndGet(this, 0x200000L) : 0L;
        c a$c0 = this.k();
        k k1 = this.d1(a$c0, k0, z);
        if(k1 != null && !this.b(k1)) {
            throw new RejectedExecutionException(this.d + " was terminated");
        }
        if(z && a$c0 != null) {
            z1 = true;
        }
        if(z2) {
            this.b1(v, z1);
            return;
        }
        if(z1) {
            return;
        }
        this.c1();
    }

    public static void q(a a0, Runnable runnable0, kotlinx.coroutines.scheduling.l l0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            l0 = o.i;
        }
        if((v & 4) != 0) {
            z = false;
        }
        a0.p(runnable0, l0, z);
    }

    private final int s() {
        return (int)((a.j.get(this) & 0x7FFFFC0000000000L) >> 42);
    }

    private final long t() {
        return this.controlState$volatile;
    }

    private final boolean t1() {
        c a$c0;
        do {
            a$c0 = this.f0();
            if(a$c0 == null) {
                return false;
            }
        }
        while(!c.i.compareAndSet(a$c0, -1, 0));
        LockSupport.unpark(a$c0);
        return true;
    }

    @Override
    @l
    public String toString() {
        ArrayList arrayList0 = new ArrayList();
        int v = this.g.a();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        for(int v6 = 1; v6 < v; ++v6) {
            c a$c0 = (c)this.g.b(v6);
            if(a$c0 != null) {
                int v7 = a$c0.a.n();
                switch(a$c0.c) {
                    case 1: {
                        ++v3;
                        break;
                    }
                    case 2: {
                        ++v2;
                        arrayList0.add(v7 + 'b');
                        break;
                    }
                    case 3: {
                        ++v1;
                        arrayList0.add(v7 + 'c');
                        break;
                    }
                    case 4: {
                        ++v4;
                        if(v7 > 0) {
                            arrayList0.add(v7 + 'd');
                        }
                        break;
                    }
                    case 5: {
                        ++v5;
                    }
                }
            }
        }
        long v8 = a.j.get(this);
        return this.d + '@' + U.b(this) + "[Pool Size {core = " + this.a + ", max = " + this.b + "}, Worker States {CPU = " + v1 + ", blocking = " + v2 + ", parked = " + v3 + ", dormant = " + v4 + ", terminated = " + v5 + "}, running workers queues = " + arrayList0 + ", global CPU queue size = " + this.e.c() + ", global blocking queue size = " + this.f.c() + ", Control State {created workers= " + ((int)(0x1FFFFFL & v8)) + ", blocking tasks = " + ((int)((0x3FFFFE00000L & v8) >> 21)) + ", CPUs acquired = " + (this.a - ((int)((0x7FFFFC0000000000L & v8) >> 42))) + "}]";
    }

    public final void u0(@l c a$c0, int v, int v1) {
        AtomicLongFieldUpdater atomicLongFieldUpdater0 = a.i;
        do {
            long v2 = atomicLongFieldUpdater0.get(this);
            int v3 = (int)(0x1FFFFFL & v2);
            if(v3 == v) {
                v3 = v1 == 0 ? this.e0(a$c0) : v1;
            }
        }
        while(v3 < 0 || !a.i.compareAndSet(this, v2, v2 + 0x200000L & 0xFFFFFFFFFFE00000L | ((long)v3)));
    }

    private final int w() {
        return (int)(a.j.get(this) & 0x1FFFFFL);
    }

    private final long x() {
        return this.parkedWorkersStack$volatile;
    }

    private final long x0() {
        return a.j.addAndGet(this, 0x40000000000L);
    }
}

