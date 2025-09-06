package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,119:1\n318#2,9:120\n327#2,2:131\n13309#3,2:129\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n63#1:120,9\n63#1:131,2\n75#1:129,2\n*E\n"})
final class e {
    @s0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,119:1\n11065#2:120\n11400#2,3:121\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n113#1:120\n113#1:121,3\n*E\n"})
    final class a extends P0 {
        private volatile Object _disposer$volatile;
        @l
        private final o e;
        public k0 f;
        final e g;
        private static final AtomicReferenceFieldUpdater h;

        static {
            a.h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        }

        public a(@l o o0) {
            this.e = o0;
        }

        @m
        public final b J() {
            return (b)a.h.get(this);
        }

        @l
        public final k0 K() {
            k0 k00 = this.f;
            if(k00 != null) {
                return k00;
            }
            L.S("handle");
            return null;
        }

        private final Object L() {
            return this._disposer$volatile;
        }

        public final void N(@m b e$b0) {
            a.h.set(this, e$b0);
        }

        public final void O(@l k0 k00) {
            this.f = k00;
        }

        private final void P(Object object0) {
            this._disposer$volatile = object0;
        }

        @Override  // kotlinx.coroutines.D0
        public void a(@m Throwable throwable0) {
            if(throwable0 != null) {
                Object object0 = this.e.P(throwable0);
                if(object0 != null) {
                    this.e.E(object0);
                    b e$b0 = this.J();
                    if(e$b0 != null) {
                        e$b0.b();
                    }
                }
            }
            else if(e.b.decrementAndGet(e.this) == 0) {
                o o0 = this.e;
                X[] arr_x = e.this.a;
                ArrayList arrayList0 = new ArrayList(arr_x.length);
                for(int v = 0; v < arr_x.length; ++v) {
                    arrayList0.add(arr_x[v].j());
                }
                o0.resumeWith(arrayList0);
            }
        }
    }

    @s0({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,119:1\n13309#2,2:120\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n88#1:120,2\n*E\n"})
    final class b implements n {
        @l
        private final a[] a;
        final e b;

        public b(@l a[] arr_e$a) {
            this.a = arr_e$a;
        }

        @Override  // kotlinx.coroutines.n
        public void a(@m Throwable throwable0) {
            this.b();
        }

        public final void b() {
            a[] arr_e$a = this.a;
            for(int v = 0; v < arr_e$a.length; ++v) {
                arr_e$a[v].K().dispose();
            }
        }

        @Override
        @l
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.a + ']';
        }
    }

    @l
    private final X[] a;
    private static final AtomicIntegerFieldUpdater b;
    private volatile int notCompletedCount$volatile;

    static {
        e.b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    }

    public e(@l X[] arr_x) {
        this.a = arr_x;
        this.notCompletedCount$volatile = arr_x.length;
    }

    @m
    public final Object c(@l d d0) {
        p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        X[] arr_x = this.a;
        a[] arr_e$a = new a[arr_x.length];
        for(int v1 = 0; v1 < arr_x.length; ++v1) {
            X x0 = this.a[v1];
            x0.start();
            a e$a0 = new a(this, p0);
            e$a0.O(O0.B(x0, false, false, e$a0, 3, null));
            arr_e$a[v1] = e$a0;
        }
        b e$b0 = new b(this, arr_e$a);
        for(int v = 0; v < arr_x.length; ++v) {
            arr_e$a[v].N(e$b0);
        }
        if(p0.k()) {
            e$b0.b();
        }
        else {
            r.c(p0, e$b0);
        }
        Object object0 = p0.x();
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0;
    }

    private final int d() {
        return this.notCompletedCount$volatile;
    }

    private final void f(int v) {
        this.notCompletedCount$volatile = v;
    }
}

