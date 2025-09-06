package androidx.compose.foundation.lazy.layout;

import A3.o;
import android.os.Trace;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@s0({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n*L\n1#1,311:1\n1182#2:312\n1161#2,2:313\n523#3:315\n26#4,5:316\n26#4,5:321\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher\n*L\n122#1:312\n122#1:313,2\n159#1:315\n164#1:316,5\n182#1:321,5\n*E\n"})
public final class LazyLayoutPrefetcher implements Choreographer.FrameCallback, Prefetcher, RememberObserver, Runnable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final void b(View view0) {
            float f;
            Display display0 = view0.getDisplay();
            if(view0.isInEditMode() || display0 == null) {
                f = 60.0f;
            }
            else {
                f = display0.getRefreshRate();
                if(f < 30.0f) {
                    f = 60.0f;
                }
            }
            LazyLayoutPrefetcher.l = (long)(1000000000.0f / f);
        }
    }

    static final class PrefetchRequest implements PrefetchHandle {
        private final int a;
        private final long b;
        @m
        private PrecomposedSlotHandle c;
        private boolean d;
        private boolean e;

        private PrefetchRequest(int v, long v1) {
            this.a = v;
            this.b = v1;
        }

        public PrefetchRequest(int v, long v1, w w0) {
            this(v, v1);
        }

        public final boolean a() {
            return this.d;
        }

        public final long b() {
            return this.b;
        }

        public final int c() {
            return this.a;
        }

        @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle
        public void cancel() {
            if(!this.d) {
                this.d = true;
                PrecomposedSlotHandle subcomposeLayoutState$PrecomposedSlotHandle0 = this.c;
                if(subcomposeLayoutState$PrecomposedSlotHandle0 != null) {
                    subcomposeLayoutState$PrecomposedSlotHandle0.dispose();
                }
                this.c = null;
            }
        }

        public final boolean d() {
            return this.e;
        }

        @m
        public final PrecomposedSlotHandle e() {
            return this.c;
        }

        public final void f(boolean z) {
            this.d = z;
        }

        public final void g(boolean z) {
            this.e = z;
        }

        public final void h(@m PrecomposedSlotHandle subcomposeLayoutState$PrecomposedSlotHandle0) {
            this.c = subcomposeLayoutState$PrecomposedSlotHandle0;
        }
    }

    @l
    private final LazyLayoutPrefetchState a;
    @l
    private final SubcomposeLayoutState b;
    @l
    private final LazyLayoutItemContentFactory c;
    @l
    private final View d;
    @l
    private final MutableVector e;
    private long f;
    private long g;
    private boolean h;
    private final Choreographer i;
    private boolean j;
    @l
    public static final Companion k;
    private static long l;

    static {
        LazyLayoutPrefetcher.k = new Companion(null);
    }

    public LazyLayoutPrefetcher(@l LazyLayoutPrefetchState lazyLayoutPrefetchState0, @l SubcomposeLayoutState subcomposeLayoutState0, @l LazyLayoutItemContentFactory lazyLayoutItemContentFactory0, @l View view0) {
        L.p(lazyLayoutPrefetchState0, "prefetchState");
        L.p(subcomposeLayoutState0, "subcomposeLayoutState");
        L.p(lazyLayoutItemContentFactory0, "itemContentFactory");
        L.p(view0, "view");
        super();
        this.a = lazyLayoutPrefetchState0;
        this.b = subcomposeLayoutState0;
        this.c = lazyLayoutItemContentFactory0;
        this.d = view0;
        this.e = new MutableVector(new PrefetchRequest[16], 0);
        this.i = Choreographer.getInstance();
        LazyLayoutPrefetcher.k.b(view0);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void a() {
        this.a.c(this);
        this.j = true;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$Prefetcher
    @l
    public PrefetchHandle b(int v, long v1) {
        PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = new PrefetchRequest(v, v1, null);
        this.e.b(lazyLayoutPrefetchState$PrefetchHandle0);
        if(!this.h) {
            this.h = true;
            this.d.post(this);
        }
        return lazyLayoutPrefetchState$PrefetchHandle0;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void c() {
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void d() {
        this.j = false;
        this.a.c(null);
        this.d.removeCallbacks(this);
        this.i.removeFrameCallback(this);
    }

    @Override  // android.view.Choreographer$FrameCallback
    public void doFrame(long v) {
        if(this.j) {
            this.d.post(this);
        }
    }

    public static final long e() [...] // 潜在的解密器

    private final long g(long v, long v1) {
        return v1 == 0L ? v : v / 4L + v1 / 4L * 3L;
    }

    private final boolean h(long v, long v1, long v2) {
        return v > v1 || v + v2 < v1;
    }

    @Override
    public void run() {
        if(!this.e.N() && this.h && this.j && this.d.getWindowVisibility() == 0) {
            long v = TimeUnit.MILLISECONDS.toNanos(this.d.getDrawingTime()) + LazyLayoutPrefetcher.l;
            boolean z = false;
            while(this.e.O() && !z) {
                PrefetchRequest lazyLayoutPrefetcher$PrefetchRequest0 = (PrefetchRequest)this.e.F()[0];
                LazyLayoutItemProvider lazyLayoutItemProvider0 = (LazyLayoutItemProvider)this.c.d().invoke();
                if(!lazyLayoutPrefetcher$PrefetchRequest0.a()) {
                    int v1 = lazyLayoutPrefetcher$PrefetchRequest0.c();
                    if(v1 >= 0 && v1 < lazyLayoutItemProvider0.getItemCount()) {
                        if(lazyLayoutPrefetcher$PrefetchRequest0.e() == null) {
                            Trace.beginSection("compose:lazylist:prefetch:compose");
                            try {
                                long v2 = System.nanoTime();
                                if(this.h(v2, v, this.f)) {
                                    Object object0 = lazyLayoutItemProvider0.D(lazyLayoutPrefetcher$PrefetchRequest0.c());
                                    o o0 = this.c.b(lazyLayoutPrefetcher$PrefetchRequest0.c(), object0);
                                    lazyLayoutPrefetcher$PrefetchRequest0.h(this.b.j(object0, o0));
                                    this.f = this.g(System.nanoTime() - v2, this.f);
                                }
                                else {
                                    z = true;
                                }
                                goto label_43;
                            }
                            catch(Throwable throwable0) {
                            }
                            Trace.endSection();
                            throw throwable0;
                        }
                        else {
                            if(lazyLayoutPrefetcher$PrefetchRequest0.d()) {
                                throw new IllegalStateException("Check failed.");
                            }
                            Trace.beginSection("compose:lazylist:prefetch:measure");
                            try {
                                long v3 = System.nanoTime();
                                if(this.h(v3, v, this.g)) {
                                    PrecomposedSlotHandle subcomposeLayoutState$PrecomposedSlotHandle0 = lazyLayoutPrefetcher$PrefetchRequest0.e();
                                    L.m(subcomposeLayoutState$PrecomposedSlotHandle0);
                                    int v4 = subcomposeLayoutState$PrecomposedSlotHandle0.a();
                                    for(int v5 = 0; v5 < v4; ++v5) {
                                        subcomposeLayoutState$PrecomposedSlotHandle0.b(v5, lazyLayoutPrefetcher$PrefetchRequest0.b());
                                    }
                                    this.g = this.g(System.nanoTime() - v3, this.g);
                                    this.e.e0(0);
                                }
                                else {
                                    z = true;
                                }
                            }
                            catch(Throwable throwable1) {
                                Trace.endSection();
                                throw throwable1;
                            }
                        label_43:
                            Trace.endSection();
                            continue;
                        }
                    }
                }
                this.e.e0(0);
            }
            if(z) {
                this.i.postFrameCallback(this);
                return;
            }
            this.h = false;
            return;
        }
        this.h = false;
    }
}

