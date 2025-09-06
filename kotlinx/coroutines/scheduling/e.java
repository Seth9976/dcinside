package kotlinx.coroutines.scheduling;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.b0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.K;
import kotlinx.coroutines.V;
import kotlinx.coroutines.u0;
import y4.l;

@b0
@s0({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,209:1\n1#2:210\n*E\n"})
public class e extends u0 {
    private final int c;
    private final int d;
    private final long e;
    @l
    private final String f;
    @l
    private a g;

    @k(level = m.c, message = "Binary compatibility for Ktor 1.0-beta")
    public e(int v, int v1) {
        this(v, v1, o.e, null, 8, null);
    }

    public e(int v, int v1, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = o.c;
        }
        if((v2 & 2) != 0) {
            v1 = o.d;
        }
        this(v, v1);
    }

    public e(int v, int v1, long v2, @l String s) {
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = s;
        this.g = this.d2();
    }

    public e(int v, int v1, long v2, String s, int v3, w w0) {
        if((v3 & 8) != 0) {
            s = "CoroutineScheduler";
        }
        this(v, v1, v2, s);
    }

    public e(int v, int v1, @l String s) {
        this(v, v1, o.e, s);
    }

    public e(int v, int v1, String s, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = o.c;
        }
        if((v2 & 2) != 0) {
            v1 = o.d;
        }
        if((v2 & 4) != 0) {
            s = "DefaultDispatcher";
        }
        this(v, v1, s);
    }

    @l
    public final K J1(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but have " + v).toString());
        }
        return new g(this, v, null, 1);
    }

    public static K Q1(e e0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blocking");
        }
        if((v1 & 1) != 0) {
            v = 16;
        }
        return e0.J1(v);
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l kotlin.coroutines.g g0, @l Runnable runnable0) {
        try {
            a.q(this.g, runnable0, null, false, 6, null);
        }
        catch(RejectedExecutionException unused_ex) {
            V.h.b1(g0, runnable0);
        }
    }

    @Override  // kotlinx.coroutines.u0
    public void close() {
        this.g.close();
    }

    private final a d2() {
        return new a(this.c, this.d, this.e, this.f);
    }

    public final void e2(@l Runnable runnable0, @l kotlinx.coroutines.scheduling.l l0, boolean z) {
        try {
            this.g.p(runnable0, l0, z);
        }
        catch(RejectedExecutionException unused_ex) {
            kotlinx.coroutines.scheduling.k k0 = this.g.i(runnable0, l0);
            V.h.n3(k0);
        }
    }

    @l
    public final K g2(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but have " + v).toString());
        }
        if(v > this.c) {
            throw new IllegalArgumentException(("Expected parallelism level lesser than core pool size (" + this.c + "), but have " + v).toString());
        }
        return new g(this, v, null, 0);
    }

    @Override  // kotlinx.coroutines.K
    public void h1(@l kotlin.coroutines.g g0, @l Runnable runnable0) {
        try {
            a.q(this.g, runnable0, null, true, 2, null);
        }
        catch(RejectedExecutionException unused_ex) {
            V.h.h1(g0, runnable0);
        }
    }

    // 去混淆评级： 低(40)
    @Override  // kotlinx.coroutines.K
    @l
    public String toString() {
        return "K@3619232[scheduler = " + this.g + ']';
    }

    @Override  // kotlinx.coroutines.u0
    @l
    public Executor u1() {
        return this.g;
    }
}

