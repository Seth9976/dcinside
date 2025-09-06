package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSnapFlingBehavior.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapFlingBehavior.kt\nandroidx/compose/foundation/gestures/snapping/LowVelocityApproachAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
final class LowVelocityApproachAnimation implements ApproachAnimation {
    @l
    private final AnimationSpec a;
    @l
    private final SnapLayoutInfoProvider b;
    @l
    private final Density c;

    public LowVelocityApproachAnimation(@l AnimationSpec animationSpec0, @l SnapLayoutInfoProvider snapLayoutInfoProvider0, @l Density density0) {
        L.p(animationSpec0, "lowVelocityAnimationSpec");
        L.p(snapLayoutInfoProvider0, "layoutInfoProvider");
        L.p(density0, "density");
        super();
        this.a = animationSpec0;
        this.b = snapLayoutInfoProvider0;
        this.c = density0;
    }

    @Override  // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public Object a(ScrollScope scrollScope0, Object object0, Object object1, Function1 function10, d d0) {
        return this.b(scrollScope0, ((Number)object0).floatValue(), ((Number)object1).floatValue(), function10, d0);
    }

    @m
    public Object b(@l ScrollScope scrollScope0, float f, float f1, @l Function1 function10, @l d d0) {
        AnimationState animationState0 = AnimationStateKt.c(0.0f, f1, 0L, 0L, false, 28, null);
        Object object0 = SnapFlingBehaviorKt.h(scrollScope0, (Math.abs(f) + this.b.a(this.c)) * Math.signum(f1), f, animationState0, this.a, function10, d0);
        return object0 == b.l() ? object0 : ((AnimationResult)object0);
    }
}

