package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;
import z3.f;
import z3.i;
import z3.j;

@s0({"SMAP\nHandlerDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n318#2,11:213\n318#2,9:224\n327#2,2:234\n13#3:233\n1#4:236\n*S KotlinDebug\n*F\n+ 1 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n184#1:213,11\n192#1:224,9\n192#1:234,2\n196#1:233\n*E\n"})
public final class g {
    private static final long a = 0x3FFFFFFFFFFFFFFFL;
    @m
    @f
    public static final e b;
    @m
    private static volatile Choreographer choreographer;

    static {
        Object object1;
        Object object0 = null;
        try {
            object1 = e0.b(new d(g.e(Looper.getMainLooper(), true), null, 2, null));
        }
        catch(Throwable throwable0) {
            object1 = e0.b(f0.a(throwable0));
        }
        if(!e0.i(object1)) {
            object0 = object1;
        }
        g.b = (e)object0;
    }

    public static final Object b(kotlin.coroutines.d d0) {
        return g.g(d0);
    }

    @VisibleForTesting
    @l
    public static final Handler e(@l Looper looper0, boolean z) {
        if(z) {
            Class class0 = Looper.class;
            Class class1 = Handler.class;
            if(Build.VERSION.SDK_INT >= 28) {
                Handler handler0 = Handler.createAsync(looper0);
                L.n(handler0, "null cannot be cast to non-null type android.os.Handler");
                return handler0;
            }
            try {
                return (Handler)class1.getDeclaredConstructor(class0, Handler.Callback.class, Boolean.TYPE).newInstance(looper0, null, Boolean.TRUE);
            }
            catch(NoSuchMethodException unused_ex) {
                return new Handler(looper0);
            }
        }
        return new Handler(looper0);
    }

    @m
    public static final Object f(@l kotlin.coroutines.d d0) {
        Choreographer choreographer0 = g.choreographer;
        if(choreographer0 != null) {
            p p0 = new p(b.e(d0), 1);
            p0.c0();
            g.l(choreographer0, p0);
            Object object0 = p0.x();
            if(object0 == b.l()) {
                h.c(d0);
            }
            return object0;
        }
        return g.g(d0);
    }

    private static final Object g(kotlin.coroutines.d d0) {
        @s0({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 HandlerDispatcher.kt\nkotlinx/coroutines/android/HandlerDispatcherKt\n*L\n1#1,14:1\n197#2,2:15\n*E\n"})
        public static final class a implements Runnable {
            final o a;

            public a(o o0) {
                this.a = o0;
                super();
            }

            @Override
            public final void run() {
                g.n(this.a);
            }
        }

        p p0 = new p(b.e(d0), 1);
        p0.c0();
        if(Looper.myLooper() == Looper.getMainLooper()) {
            g.n(p0);
        }
        else {
            h0.e().b1(p0.getContext(), new a(p0));
        }
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @l
    @i(name = "from")
    @j
    public static final e h(@l Handler handler0) {
        return g.j(handler0, null, 1, null);
    }

    @l
    @i(name = "from")
    @j
    public static final e i(@l Handler handler0, @m String s) {
        return new d(handler0, s);
    }

    public static e j(Handler handler0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        return g.i(handler0, s);
    }

    @k(level = kotlin.m.c, message = "Use Dispatchers.Main instead")
    public static void k() {
    }

    private static final void l(Choreographer choreographer0, o o0) {
        choreographer0.postFrameCallback((long v) -> o0.X(h0.e(), v));
    }

    // 检测为 Lambda 实现
    private static final void m(o o0, long v) [...]

    private static final void n(o o0) {
        Choreographer choreographer0 = g.choreographer;
        if(choreographer0 == null) {
            choreographer0 = Choreographer.getInstance();
            L.m(choreographer0);
            g.choreographer = choreographer0;
        }
        g.l(choreographer0, o0);
    }
}

