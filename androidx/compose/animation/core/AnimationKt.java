package androidx.compose.animation.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

public final class AnimationKt {
    public static final long a = 1000000L;

    @l
    public static final DecayAnimation a(@l FloatDecayAnimationSpec floatDecayAnimationSpec0, float f, float f1) {
        L.p(floatDecayAnimationSpec0, "animationSpec");
        return new DecayAnimation(DecayAnimationSpecKt.e(floatDecayAnimationSpec0), VectorConvertersKt.i(A.a), f, AnimationVectorsKt.a(f1));
    }

    public static DecayAnimation b(FloatDecayAnimationSpec floatDecayAnimationSpec0, float f, float f1, int v, Object object0) {
        if((v & 4) != 0) {
            f1 = 0.0f;
        }
        return AnimationKt.a(floatDecayAnimationSpec0, f, f1);
    }

    @l
    public static final TargetBasedAnimation c(@l AnimationSpec animationSpec0, @l TwoWayConverter twoWayConverter0, Object object0, Object object1, Object object2) {
        L.p(animationSpec0, "animationSpec");
        L.p(twoWayConverter0, "typeConverter");
        return new TargetBasedAnimation(animationSpec0, twoWayConverter0, object0, object1, ((AnimationVector)twoWayConverter0.a().invoke(object2)));
    }

    @l
    public static final TargetBasedAnimation d(@l VectorizedAnimationSpec vectorizedAnimationSpec0, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(vectorizedAnimationSpec0, "<this>");
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return new TargetBasedAnimation(vectorizedAnimationSpec0, VectorConvertersKt.a(androidx.compose.animation.core.AnimationKt.createAnimation.1.e, androidx.compose.animation.core.AnimationKt.createAnimation.2.e), animationVector0, animationVector1, animationVector2);

        final class androidx.compose.animation.core.AnimationKt.createAnimation.1 extends N implements Function1 {
            public static final androidx.compose.animation.core.AnimationKt.createAnimation.1 e;

            static {
                androidx.compose.animation.core.AnimationKt.createAnimation.1.e = new androidx.compose.animation.core.AnimationKt.createAnimation.1();
            }

            androidx.compose.animation.core.AnimationKt.createAnimation.1() {
                super(1);
            }

            @l
            public final AnimationVector a(@l AnimationVector animationVector0) {
                L.p(animationVector0, "it");
                return animationVector0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((AnimationVector)object0));
            }
        }


        final class androidx.compose.animation.core.AnimationKt.createAnimation.2 extends N implements Function1 {
            public static final androidx.compose.animation.core.AnimationKt.createAnimation.2 e;

            static {
                androidx.compose.animation.core.AnimationKt.createAnimation.2.e = new androidx.compose.animation.core.AnimationKt.createAnimation.2();
            }

            androidx.compose.animation.core.AnimationKt.createAnimation.2() {
                super(1);
            }

            @l
            public final AnimationVector a(@l AnimationVector animationVector0) {
                L.p(animationVector0, "it");
                return animationVector0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((AnimationVector)object0));
            }
        }

    }

    public static final long e(@l Animation animation0) {
        L.p(animation0, "<this>");
        return animation0.c() / 1000000L;
    }

    public static final Object f(@l Animation animation0, long v) {
        L.p(animation0, "<this>");
        return animation0.d().b().invoke(animation0.g(v));
    }
}

