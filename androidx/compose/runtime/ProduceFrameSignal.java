package androidx.compose.runtime;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@s0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1419\n314#3,9:1410\n323#3,2:1420\n1#4:1422\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1355#1:1409\n1362#1:1419\n1361#1:1410,9\n1361#1:1420,2\n*E\n"})
final class ProduceFrameSignal {
    @m
    private Object a;

    @m
    public final Object c(@l Object object0, @l d d0) {
        S0 s00;
        p p1;
        synchronized(object0) {
            if(this.a == RecomposerKt.b) {
                this.a = RecomposerKt.c;
                return S0.a;
            }
            s00 = S0.a;
        }
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        synchronized(object0) {
            if(this.a == RecomposerKt.b) {
                this.a = RecomposerKt.c;
                p1 = p0;
            }
            else {
                this.a = p0;
                p1 = null;
            }
        }
        if(p1 != null) {
            p1.resumeWith(s00);
        }
        Object object1 = p0.x();
        if(object1 == b.l()) {
            h.c(d0);
        }
        return object1 == b.l() ? object1 : s00;
    }

    @m
    public final d d() {
        Object object0 = this.a;
        if(object0 instanceof d) {
            this.a = RecomposerKt.c;
            return (d)object0;
        }
        if((L.g(object0, RecomposerKt.b) ? true : L.g(object0, RecomposerKt.c))) {
            return null;
        }
        if(object0 != null) {
            throw new IllegalStateException(("invalid pendingFrameContinuation " + object0).toString());
        }
        this.a = RecomposerKt.b;
        return null;
    }

    public final void e() {
        if(this.a != RecomposerKt.c) {
            throw new IllegalStateException("frame not pending");
        }
        this.a = null;
    }
}

