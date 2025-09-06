package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n76#2:344\n102#2,2:345\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n53#1:344\n53#1:345,2\n*E\n"})
public final class AnimationState implements State {
    @l
    private final TwoWayConverter a;
    @l
    private final MutableState b;
    @l
    private AnimationVector c;
    private long d;
    private long e;
    private boolean f;
    public static final int g;

    static {
    }

    public AnimationState(@l TwoWayConverter twoWayConverter0, Object object0, @m AnimationVector animationVector0, long v, long v1, boolean z) {
        L.p(twoWayConverter0, "typeConverter");
        AnimationVector animationVector1;
        super();
        this.a = twoWayConverter0;
        this.b = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
        if(animationVector0 == null) {
            animationVector1 = AnimationStateKt.i(twoWayConverter0, object0);
        }
        else {
            animationVector1 = AnimationVectorsKt.e(animationVector0);
            if(animationVector1 == null) {
                animationVector1 = AnimationStateKt.i(twoWayConverter0, object0);
            }
        }
        this.c = animationVector1;
        this.d = v;
        this.e = v1;
        this.f = z;
    }

    public AnimationState(TwoWayConverter twoWayConverter0, Object object0, AnimationVector animationVector0, long v, long v1, boolean z, int v2, w w0) {
        this(twoWayConverter0, object0, ((v2 & 4) == 0 ? animationVector0 : null), ((v2 & 8) == 0 ? v : 0x8000000000000000L), ((v2 & 16) == 0 ? v1 : 0x8000000000000000L), ((v2 & 0x20) == 0 ? z : false));
    }

    public final long b() {
        return this.e;
    }

    public final long d() {
        return this.d;
    }

    @l
    public final TwoWayConverter g() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.b.getValue();
    }

    public final Object h() {
        return this.a.b().invoke(this.c);
    }

    @l
    public final AnimationVector j() {
        return this.c;
    }

    public final boolean k() {
        return this.f;
    }

    public final void m(long v) {
        this.e = v;
    }

    public final void n(long v) {
        this.d = v;
    }

    public final void o(boolean z) {
        this.f = z;
    }

    public void p(Object object0) {
        this.b.setValue(object0);
    }

    public final void q(@l AnimationVector animationVector0) {
        L.p(animationVector0, "<set-?>");
        this.c = animationVector0;
    }

    @Override
    @l
    public String toString() {
        return "AnimationState(value=" + this.getValue() + ", velocity=" + this.h() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ')';
    }
}

