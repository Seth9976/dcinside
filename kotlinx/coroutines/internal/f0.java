package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.E0;
import y4.l;
import y4.m;

@s0({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,159:1\n24#2,4:160\n24#2,4:165\n24#2,4:170\n24#2,4:175\n24#2,4:180\n24#2,4:185\n24#2,4:190\n16#3:164\n16#3:169\n16#3:174\n16#3:179\n16#3:184\n16#3:189\n16#3:194\n1#4:195\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n33#1:160,4\n41#1:165,4\n43#1:170,4\n51#1:175,4\n60#1:180,4\n63#1:185,4\n72#1:190,4\n33#1:164\n41#1:169\n43#1:174\n51#1:179\n60#1:184\n63#1:189\n72#1:194\n*E\n"})
@E0
public class f0 {
    private volatile int _size$volatile;
    @m
    private g0[] a;
    private static final AtomicIntegerFieldUpdater b;

    static {
        f0.b = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_size$volatile");
    }

    @b0
    public final void a(@l g0 g00) {
        g00.a(this);
        g0[] arr_g0 = this.k();
        int v = this.f();
        this.p(v + 1);
        arr_g0[v] = g00;
        g00.setIndex(v);
        this.s(v);
    }

    public final void b(@l g0 g00) {
        synchronized(this) {
            this.a(g00);
        }
    }

    public final boolean c(@l g0 g00, @l Function1 function10) {
        boolean z;
        synchronized(this) {
            if(((Boolean)function10.invoke(this.e())).booleanValue()) {
                this.a(g00);
                z = true;
            }
            else {
                z = false;
            }
            return z;
        }
    }

    @m
    public final g0 d(@l Function1 function10) {
        g0 g00;
        synchronized(this) {
            int v1 = this.f();
            for(int v2 = 0; true; ++v2) {
                g00 = null;
                if(v2 >= v1) {
                    break;
                }
                g0[] arr_g0 = this.a;
                if(arr_g0 != null) {
                    g00 = arr_g0[v2];
                }
                L.m(g00);
                if(((Boolean)function10.invoke(g00)).booleanValue()) {
                    break;
                }
            }
            return g00;
        }
    }

    @b0
    @m
    public final g0 e() {
        return this.a == null ? null : this.a[0];
    }

    public final int f() {
        return f0.b.get(this);
    }

    private final int g() {
        return this._size$volatile;
    }

    public final boolean i() {
        return this.f() == 0;
    }

    @m
    public final g0 j() {
        synchronized(this) {
            return this.e();
        }
    }

    private final g0[] k() {
        g0[] arr_g0 = this.a;
        if(arr_g0 == null) {
            arr_g0 = new g0[4];
            this.a = arr_g0;
            return arr_g0;
        }
        if(this.f() >= arr_g0.length) {
            Object[] arr_object = Arrays.copyOf(arr_g0, this.f() * 2);
            L.o(arr_object, "copyOf(...)");
            arr_g0 = (g0[])arr_object;
            this.a = arr_g0;
        }
        return arr_g0;
    }

    public final boolean l(@l g0 g00) {
        boolean z;
        synchronized(this) {
            if(g00.c() == null) {
                z = false;
            }
            else {
                this.m(g00.getIndex());
                z = true;
            }
            return z;
        }
    }

    @b0
    @l
    public final g0 m(int v) {
        g0[] arr_g0 = this.a;
        L.m(arr_g0);
        this.p(this.f() - 1);
        if(v < this.f()) {
            this.t(v, this.f());
            int v1 = (v - 1) / 2;
            if(v > 0) {
                g0 g00 = arr_g0[v];
                L.m(g00);
                g0 g01 = arr_g0[v1];
                L.m(g01);
                if(((Comparable)g00).compareTo(g01) < 0) {
                    this.t(v, v1);
                    this.s(v1);
                }
                else {
                    this.r(v);
                }
            }
            else {
                this.r(v);
            }
        }
        g0 g02 = arr_g0[this.f()];
        L.m(g02);
        g02.a(null);
        g02.setIndex(-1);
        arr_g0[this.f()] = null;
        return g02;
    }

    @m
    public final g0 n(@l Function1 function10) {
        synchronized(this) {
            g0 g00 = null;
            g0 g01 = this.e();
            if(g01 == null) {
                return null;
            }
            if(((Boolean)function10.invoke(g01)).booleanValue()) {
                g00 = this.m(0);
            }
            return g00;
        }
    }

    @m
    public final g0 o() {
        synchronized(this) {
            return this.f() <= 0 ? null : this.m(0);
        }
    }

    private final void p(int v) {
        f0.b.set(this, v);
    }

    private final void q(int v) {
        this._size$volatile = v;
    }

    private final void r(int v) {
        while(true) {
            int v1 = v * 2 + 1;
            if(v1 >= this.f()) {
                return;
            }
            g0[] arr_g0 = this.a;
            L.m(arr_g0);
            int v2 = v * 2 + 2;
            if(v2 < this.f()) {
                g0 g00 = arr_g0[v2];
                L.m(g00);
                g0 g01 = arr_g0[v1];
                L.m(g01);
                if(((Comparable)g00).compareTo(g01) >= 0) {
                    v2 = v1;
                }
            }
            else {
                v2 = v1;
            }
            g0 g02 = arr_g0[v];
            L.m(g02);
            g0 g03 = arr_g0[v2];
            L.m(g03);
            if(((Comparable)g02).compareTo(g03) <= 0) {
                return;
            }
            this.t(v, v2);
            v = v2;
        }
    }

    private final void s(int v) {
        while(true) {
            if(v <= 0) {
                return;
            }
            g0[] arr_g0 = this.a;
            L.m(arr_g0);
            int v1 = (v - 1) / 2;
            g0 g00 = arr_g0[v1];
            L.m(g00);
            g0 g01 = arr_g0[v];
            L.m(g01);
            if(((Comparable)g00).compareTo(g01) <= 0) {
                return;
            }
            this.t(v, v1);
            v = v1;
        }
    }

    private final void t(int v, int v1) {
        g0[] arr_g0 = this.a;
        L.m(arr_g0);
        g0 g00 = arr_g0[v1];
        L.m(g00);
        g0 g01 = arr_g0[v];
        L.m(g01);
        arr_g0[v] = g00;
        arr_g0[v1] = g01;
        g00.setIndex(v);
        g01.setIndex(v1);
    }
}

