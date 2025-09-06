package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class HighVelocityApproachAnimation implements ApproachAnimation {
    @l
    private final DecayAnimationSpec a;

    public HighVelocityApproachAnimation(@l DecayAnimationSpec decayAnimationSpec0) {
        L.p(decayAnimationSpec0, "decayAnimationSpec");
        super();
        this.a = decayAnimationSpec0;
    }

    @Override  // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public Object a(ScrollScope scrollScope0, Object object0, Object object1, Function1 function10, d d0) {
        return this.b(scrollScope0, ((Number)object0).floatValue(), ((Number)object1).floatValue(), function10, d0);
    }

    @m
    public Object b(@l ScrollScope scrollScope0, float f, float f1, @l Function1 function10, @l d d0) {
        Object object0 = SnapFlingBehaviorKt.f(scrollScope0, f, AnimationStateKt.c(0.0f, f1, 0L, 0L, false, 28, null), this.a, function10, d0);
        return object0 == b.l() ? object0 : ((AnimationResult)object0);
    }
}

