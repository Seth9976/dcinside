package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.U0;
import kotlinx.coroutines.X0;
import kotlinx.coroutines.Z;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.o;
import y4.l;
import y4.m;

@s0({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 2 Runnable.kt\nkotlinx/coroutines/RunnableKt\n*L\n1#1,212:1\n13#2:213\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n*L\n140#1:213\n*E\n"})
public final class d extends e implements Z {
    @l
    private final Handler b;
    @m
    private final String c;
    private final boolean d;
    @l
    private final d e;

    public d(@l Handler handler0, @m String s) {
        this(handler0, s, false);
    }

    public d(Handler handler0, String s, int v, w w0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(handler0, s);
    }

    private d(Handler handler0, String s, boolean z) {
        super(null);
        this.b = handler0;
        this.c = s;
        this.d = z;
        this.e = z ? this : new d(handler0, s, true);
    }

    @Override  // kotlinx.coroutines.android.e
    public e Q1() {
        return this.i2();
    }

    @Override  // kotlinx.coroutines.android.e, kotlinx.coroutines.Z
    @l
    public k0 Y(long v, @l Runnable runnable0, @l g g0) {
        long v1 = s.C(v, 0x3FFFFFFFFFFFFFFFL);
        if(this.b.postDelayed(runnable0, v1)) {
            return () -> this.b.removeCallbacks(runnable0);
        }
        this.g2(g0, runnable0);
        return X0.a;
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l g g0, @l Runnable runnable0) {
        if(!this.b.post(runnable0)) {
            this.g2(g0, runnable0);
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof d && ((d)object0).b == this.b && ((d)object0).d == this.d;
    }

    private final void g2(g g0, Runnable runnable0) {
        M0.f(g0, new CancellationException("The task was rejected, the handler underlying the dispatcher \'" + this + "\' was closed"));
        h0.c().b1(g0, runnable0);
    }

    @Override
    public int hashCode() {
        int v = System.identityHashCode(this.b);
        return this.d ? v ^ 0x4CF : v ^ 0x4D5;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.coroutines.K
    public boolean i1(@l g g0) {
        return !this.d || !L.g(Looper.myLooper(), this.b.getLooper());
    }

    @l
    public d i2() {
        return this.e;
    }

    // 检测为 Lambda 实现
    private static final void j2(d d0, Runnable runnable0) [...]

    @Override  // kotlinx.coroutines.U0
    @l
    public String toString() {
        String s = this.J1();
        if(s == null) {
            s = this.c == null ? this.b.toString() : this.c;
            return this.d ? s + ".immediate" : s;
        }
        return s;
    }

    @Override  // kotlinx.coroutines.U0
    public U0 u1() {
        return this.i2();
    }

    @Override  // kotlinx.coroutines.Z
    public void v(long v, @l o o0) {
        @s0({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerContext\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n141#2:15\n142#2:17\n1#3:16\n*E\n"})
        public static final class a implements Runnable {
            final o a;
            final d b;

            public a(o o0, d d0) {
                this.a = o0;
                this.b = d0;
                super();
            }

            @Override
            public final void run() {
                this.a.X(this.b, S0.a);
            }
        }


        static final class b extends N implements Function1 {
            final d e;
            final Runnable f;

            b(d d0, Runnable runnable0) {
                this.e = d0;
                this.f = runnable0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.e.b.removeCallbacks(this.f);
            }
        }

        a d$a0 = new a(o0, this);
        long v1 = s.C(v, 0x3FFFFFFFFFFFFFFFL);
        if(this.b.postDelayed(d$a0, v1)) {
            o0.K(new b(this, d$a0));
            return;
        }
        this.g2(o0.getContext(), d$a0);
    }
}

