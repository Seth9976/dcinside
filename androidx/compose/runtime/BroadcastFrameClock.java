package androidx.compose.runtime;

import A3.a;
import A3.o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import jeb.synthetic.FIN;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,132:1\n70#2:133\n70#2:134\n70#2:144\n70#2:147\n314#3,9:135\n323#3,2:145\n33#4,6:148\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n54#1:133\n62#1:134\n81#1:144\n112#1:147\n79#1:135,9\n79#1:145,2\n115#1:148,6\n*E\n"})
public final class BroadcastFrameClock implements MonotonicFrameClock {
    @s0({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
    static final class FrameAwaiter {
        @l
        private final Function1 a;
        @l
        private final d b;

        public FrameAwaiter(@l Function1 function10, @l d d0) {
            L.p(function10, "onFrame");
            L.p(d0, "continuation");
            super();
            this.a = function10;
            this.b = d0;
        }

        @l
        public final d a() {
            return this.b;
        }

        @l
        public final Function1 b() {
            return this.a;
        }

        public final void c(long v) {
            Object object0;
            d d0;
            try {
                d0 = this.b;
                object0 = e0.b(this.a.invoke(v));
            }
            catch(Throwable throwable0) {
                object0 = e0.b(f0.a(throwable0));
            }
            d0.resumeWith(object0);
        }
    }

    @m
    private final a a;
    @l
    private final Object b;
    @m
    private Throwable c;
    @l
    private List d;
    @l
    private List e;
    public static final int f = 8;

    static {
    }

    public BroadcastFrameClock() {
        this(null, 1, null);
    }

    public BroadcastFrameClock(@m a a0) {
        this.a = a0;
        this.b = new Object();
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public BroadcastFrameClock(a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = null;
        }
        this(a0);
    }

    public final void e(@l CancellationException cancellationException0) {
        L.p(cancellationException0, "cancellationException");
        this.r(cancellationException0);
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return DefaultImpls.a(this, object0, o0);
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public b get(@l c g$c0) {
        return DefaultImpls.b(this, g$c0);
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    public c getKey() {
        return androidx.compose.runtime.c.a(this);
    }

    public static void m(BroadcastFrameClock broadcastFrameClock0, CancellationException cancellationException0, int v, Object object0) {
        if((v & 1) != 0) {
            cancellationException0 = new CancellationException("clock cancelled");
        }
        broadcastFrameClock0.e(cancellationException0);
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return DefaultImpls.d(this, g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return DefaultImpls.e(this, g0);
    }

    private final void r(Throwable throwable0) {
        Object object0 = this.b;
        __monitor_enter(object0);
        try {
            if(this.c == null) {
                this.c = throwable0;
                List list0 = this.d;
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((FrameAwaiter)list0.get(v1)).a().resumeWith(e0.b(f0.a(throwable0)));
                }
                this.d.clear();
                goto label_16;
            }
            goto label_18;
        }
        catch(Throwable throwable1) {
        }
        __monitor_exit(object0);
        throw throwable1;
    label_16:
        __monitor_exit(object0);
        return;
    label_18:
        __monitor_exit(object0);
    }

    @Override  // androidx.compose.runtime.MonotonicFrameClock
    @m
    public Object s(@l Function1 function10, @l d d0) {
        FrameAwaiter broadcastFrameClock$FrameAwaiter0;
        p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        h l0$h0 = new h();
        Object object0 = this.b;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        Throwable throwable0 = this.c;
        if(throwable0 == null) {
            l0$h0.a = new FrameAwaiter(function10, p0);
            boolean z = this.d.isEmpty();
            List list0 = this.d;
            Object object1 = l0$h0.a;
            if(object1 == null) {
                L.S("awaiter");
                broadcastFrameClock$FrameAwaiter0 = null;
            }
            else {
                broadcastFrameClock$FrameAwaiter0 = (FrameAwaiter)object1;
            }
            list0.add(broadcastFrameClock$FrameAwaiter0);
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            p0.K(new Function1(l0$h0) {
                final BroadcastFrameClock e;
                final h f;

                {
                    this.e = broadcastFrameClock0;
                    this.f = l0$h0;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((Throwable)object0));
                    return S0.a;
                }

                public final void invoke(@m Throwable throwable0) {
                    FrameAwaiter broadcastFrameClock$FrameAwaiter0;
                    synchronized(this.e.b) {
                        List list0 = this.e.d;
                        Object object1 = this.f.a;
                        if(object1 == null) {
                            L.S("awaiter");
                            broadcastFrameClock$FrameAwaiter0 = null;
                        }
                        else {
                            broadcastFrameClock$FrameAwaiter0 = (FrameAwaiter)object1;
                        }
                        list0.remove(broadcastFrameClock$FrameAwaiter0);
                    }
                }
            });
            if(z && this.a != null) {
                try {
                    this.a.invoke();
                }
                catch(Throwable throwable1) {
                    this.r(throwable1);
                }
            }
        }
        else {
            p0.resumeWith(e0.b(f0.a(throwable0)));
            FIN.finallyExec$NT(v);
        }
        Object object2 = p0.x();
        if(object2 == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(d0);
        }
        return object2;
    }

    public final boolean t() {
        synchronized(this.b) {
            boolean z = this.d.isEmpty();
            return !z;
        }
    }

    public final void u(long v) {
        synchronized(this.b) {
            List list0 = this.d;
            this.d = this.e;
            this.e = list0;
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((FrameAwaiter)list0.get(v3)).c(v);
            }
            list0.clear();
        }
    }
}

