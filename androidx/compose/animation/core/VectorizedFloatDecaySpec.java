package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import y4.l;

final class VectorizedFloatDecaySpec implements VectorizedDecayAnimationSpec {
    @l
    private final FloatDecayAnimationSpec a;
    private AnimationVector b;
    private AnimationVector c;
    private AnimationVector d;
    private final float e;

    public VectorizedFloatDecaySpec(@l FloatDecayAnimationSpec floatDecayAnimationSpec0) {
        L.p(floatDecayAnimationSpec0, "floatDecaySpec");
        super();
        this.a = floatDecayAnimationSpec0;
        this.e = floatDecayAnimationSpec0.a();
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float a() {
        return this.e;
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @l
    public AnimationVector b(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "initialVelocity");
        if(this.c == null) {
            this.c = AnimationVectorsKt.g(animationVector0);
        }
        AnimationVector animationVector2 = this.c;
        if(animationVector2 == null) {
            L.S("velocityVector");
            animationVector2 = null;
        }
        int v1 = animationVector2.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            AnimationVector animationVector3 = this.c;
            if(animationVector3 == null) {
                L.S("velocityVector");
                animationVector3 = null;
            }
            float f = animationVector0.a(v2);
            float f1 = animationVector1.a(v2);
            animationVector3.e(v2, this.a.b(v, f, f1));
        }
        AnimationVector animationVector4 = this.c;
        if(animationVector4 == null) {
            L.S("velocityVector");
            return null;
        }
        return animationVector4;
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long c(@l AnimationVector animationVector0, @l AnimationVector animationVector1) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "initialVelocity");
        if(this.c == null) {
            this.c = AnimationVectorsKt.g(animationVector0);
        }
        AnimationVector animationVector2 = this.c;
        if(animationVector2 == null) {
            L.S("velocityVector");
            animationVector2 = null;
        }
        int v = animationVector2.b();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            float f = animationVector0.a(v2);
            float f1 = animationVector1.a(v2);
            v1 = Math.max(v1, this.a.c(f, f1));
        }
        return v1;
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @l
    public AnimationVector d(@l AnimationVector animationVector0, @l AnimationVector animationVector1) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "initialVelocity");
        if(this.d == null) {
            this.d = AnimationVectorsKt.g(animationVector0);
        }
        AnimationVector animationVector2 = this.d;
        if(animationVector2 == null) {
            L.S("targetVector");
            animationVector2 = null;
        }
        int v = animationVector2.b();
        for(int v1 = 0; v1 < v; ++v1) {
            AnimationVector animationVector3 = this.d;
            if(animationVector3 == null) {
                L.S("targetVector");
                animationVector3 = null;
            }
            float f = animationVector0.a(v1);
            float f1 = animationVector1.a(v1);
            animationVector3.e(v1, this.a.d(f, f1));
        }
        AnimationVector animationVector4 = this.d;
        if(animationVector4 == null) {
            L.S("targetVector");
            return null;
        }
        return animationVector4;
    }

    @Override  // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @l
    public AnimationVector e(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "initialVelocity");
        if(this.b == null) {
            this.b = AnimationVectorsKt.g(animationVector0);
        }
        AnimationVector animationVector2 = this.b;
        if(animationVector2 == null) {
            L.S("valueVector");
            animationVector2 = null;
        }
        int v1 = animationVector2.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            AnimationVector animationVector3 = this.b;
            if(animationVector3 == null) {
                L.S("valueVector");
                animationVector3 = null;
            }
            float f = animationVector0.a(v2);
            float f1 = animationVector1.a(v2);
            animationVector3.e(v2, this.a.e(v, f, f1));
        }
        AnimationVector animationVector4 = this.b;
        if(animationVector4 == null) {
            L.S("valueVector");
            return null;
        }
        return animationVector4;
    }

    @l
    public final FloatDecayAnimationSpec f() {
        return this.a;
    }
}

