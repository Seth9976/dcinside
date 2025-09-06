package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

final class DecayAnimationSpecImpl implements DecayAnimationSpec {
    @l
    private final FloatDecayAnimationSpec a;

    public DecayAnimationSpecImpl(@l FloatDecayAnimationSpec floatDecayAnimationSpec0) {
        L.p(floatDecayAnimationSpec0, "floatDecaySpec");
        super();
        this.a = floatDecayAnimationSpec0;
    }

    @Override  // androidx.compose.animation.core.DecayAnimationSpec
    @l
    public VectorizedDecayAnimationSpec a(@l TwoWayConverter twoWayConverter0) {
        L.p(twoWayConverter0, "typeConverter");
        return new VectorizedFloatDecaySpec(this.a);
    }
}

