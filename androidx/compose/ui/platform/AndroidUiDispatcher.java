package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.collections.k;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.K;
import y4.l;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nAndroidUiDispatcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n*L\n1#1,191:1\n34#2:192\n34#2:193\n34#2:194\n34#2:195\n34#2:196\n34#2:197\n*S KotlinDebug\n*F\n+ 1 AndroidUiDispatcher.android.kt\nandroidx/compose/ui/platform/AndroidUiDispatcher\n*L\n73#1:192\n89#1:193\n99#1:194\n115#1:195\n125#1:196\n137#1:197\n*E\n"})
public final class AndroidUiDispatcher extends K {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final g a() {
            if(AndroidUiDispatcher_androidKt.b()) {
                return this.b();
            }
            g g0 = (g)AndroidUiDispatcher.o.get();
            if(g0 == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
            return g0;
        }

        @l
        public final g b() {
            return (g)AndroidUiDispatcher.n.getValue();
        }
    }

    @l
    private final Choreographer b;
    @l
    private final Handler c;
    @l
    private final Object d;
    @l
    private final k e;
    @l
    private List f;
    @l
    private List g;
    private boolean h;
    private boolean i;
    @l
    private final androidx.compose.ui.platform.AndroidUiDispatcher.dispatchCallback.1 j;
    @l
    private final MonotonicFrameClock k;
    @l
    public static final Companion l;
    public static final int m;
    @l
    private static final D n;
    @l
    private static final ThreadLocal o;

    static {
        AndroidUiDispatcher.l = new Companion(null);
        AndroidUiDispatcher.m = 8;
        AndroidUiDispatcher.n = E.a(AndroidUiDispatcher.Companion.Main.2.e);
        AndroidUiDispatcher.o = new AndroidUiDispatcher.Companion.currentThread.1();
    }

    private AndroidUiDispatcher(Choreographer choreographer0, Handler handler0) {
        this.b = choreographer0;
        this.c = handler0;
        this.d = new Object();
        this.e = new k();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.j = new Object() {
            @Override  // android.view.Choreographer$FrameCallback
            public void doFrame(long v) {
                this.a.c.removeCallbacks(this);
                this.a.C2();
                this.a.A2(v);
            }

            @Override
            public void run() {
                this.a.C2();
                Object object0 = this.a.d;
                AndroidUiDispatcher androidUiDispatcher0 = this.a;
                synchronized(object0) {
                    if(androidUiDispatcher0.f.isEmpty()) {
                        androidUiDispatcher0.o2().removeFrameCallback(this);
                        androidUiDispatcher0.i = false;
                    }
                }
            }
        };
        this.k = new AndroidUiFrameClock(choreographer0);
    }

    public AndroidUiDispatcher(Choreographer choreographer0, Handler handler0, w w0) {
        this(choreographer0, handler0);
    }

    private final void A2(long v) {
        List list0;
        synchronized(this.d) {
            if(!this.i) {
                return;
            }
            this.i = false;
            list0 = this.f;
            this.f = this.g;
            this.g = list0;
        }
        int v2 = list0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            ((Choreographer.FrameCallback)list0.get(v1)).doFrame(v);
        }
        list0.clear();
    }

    private final void C2() {
        boolean z;
        do {
            for(Runnable runnable0 = this.t2(); runnable0 != null; runnable0 = this.t2()) {
                runnable0.run();
            }
            synchronized(this.d) {
                if(this.e.isEmpty()) {
                    z = false;
                    this.h = false;
                }
                else {
                    z = true;
                }
            }
        }
        while(z);
    }

    public final void I2(@l Choreographer.FrameCallback choreographer$FrameCallback0) {
        L.p(choreographer$FrameCallback0, "callback");
        synchronized(this.d) {
            this.f.add(choreographer$FrameCallback0);
            if(!this.i) {
                this.i = true;
                this.b.postFrameCallback(this.j);
            }
        }
    }

    public final void L2(@l Choreographer.FrameCallback choreographer$FrameCallback0) {
        L.p(choreographer$FrameCallback0, "callback");
        synchronized(this.d) {
            this.f.remove(choreographer$FrameCallback0);
        }
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l g g0, @l Runnable runnable0) {
        L.p(g0, "context");
        L.p(runnable0, "block");
        synchronized(this.d) {
            this.e.addLast(runnable0);
            if(!this.h) {
                this.h = true;
                this.c.post(this.j);
                if(!this.i) {
                    this.i = true;
                    this.b.postFrameCallback(this.j);
                }
            }
        }
    }

    @l
    public final Choreographer o2() {
        return this.b;
    }

    @l
    public final MonotonicFrameClock p2() {
        return this.k;
    }

    private final Runnable t2() {
        synchronized(this.d) {
            return (Runnable)this.e.y();
        }
    }
}

