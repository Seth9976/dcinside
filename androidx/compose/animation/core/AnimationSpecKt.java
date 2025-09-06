package androidx.compose.animation.core;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class AnimationSpecKt {
    private static final AnimationVector b(TwoWayConverter twoWayConverter0, Object object0) {
        return object0 == null ? null : ((AnimationVector)twoWayConverter0.a().invoke(object0));
    }

    @Stable
    @k(level = m.c, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final InfiniteRepeatableSpec c(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0) {
        L.p(durationBasedAnimationSpec0, "animation");
        L.p(repeatMode0, "repeatMode");
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public static InfiniteRepeatableSpec d(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, int v, Object object0) {
        if((v & 2) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        return AnimationSpecKt.c(durationBasedAnimationSpec0, repeatMode0);
    }

    @Stable
    @l
    public static final InfiniteRepeatableSpec e(@l DurationBasedAnimationSpec durationBasedAnimationSpec0, @l RepeatMode repeatMode0, long v) {
        L.p(durationBasedAnimationSpec0, "animation");
        L.p(repeatMode0, "repeatMode");
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec0, repeatMode0, v, null);
    }

    public static InfiniteRepeatableSpec f(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        if((v1 & 4) != 0) {
            v = 0L;
        }
        return AnimationSpecKt.e(durationBasedAnimationSpec0, repeatMode0, v);
    }

    @Stable
    @l
    public static final KeyframesSpec g(@l Function1 function10) {
        L.p(function10, "init");
        KeyframesSpecConfig keyframesSpec$KeyframesSpecConfig0 = new KeyframesSpecConfig();
        function10.invoke(keyframesSpec$KeyframesSpecConfig0);
        return new KeyframesSpec(keyframesSpec$KeyframesSpecConfig0);
    }

    @Stable
    @k(level = m.c, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final RepeatableSpec h(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0) {
        L.p(durationBasedAnimationSpec0, "animation");
        L.p(repeatMode0, "repeatMode");
        return new RepeatableSpec(v, durationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public static RepeatableSpec i(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, int v1, Object object0) {
        if((v1 & 4) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        return AnimationSpecKt.h(v, durationBasedAnimationSpec0, repeatMode0);
    }

    @Stable
    @l
    public static final RepeatableSpec j(int v, @l DurationBasedAnimationSpec durationBasedAnimationSpec0, @l RepeatMode repeatMode0, long v1) {
        L.p(durationBasedAnimationSpec0, "animation");
        L.p(repeatMode0, "repeatMode");
        return new RepeatableSpec(v, durationBasedAnimationSpec0, repeatMode0, v1, null);
    }

    public static RepeatableSpec k(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, int v2, Object object0) {
        if((v2 & 4) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        if((v2 & 8) != 0) {
            v1 = 0L;
        }
        return AnimationSpecKt.j(v, durationBasedAnimationSpec0, repeatMode0, v1);
    }

    @Stable
    @l
    public static final SnapSpec l(int v) {
        return new SnapSpec(v);
    }

    public static SnapSpec m(int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return AnimationSpecKt.l(v);
    }

    @Stable
    @l
    public static final SpringSpec n(float f, float f1, @y4.m Object object0) {
        return new SpringSpec(f, f1, object0);
    }

    public static SpringSpec o(float f, float f1, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1500.0f;
        }
        if((v & 4) != 0) {
            object0 = null;
        }
        return AnimationSpecKt.n(f, f1, object0);
    }

    @Stable
    @l
    public static final TweenSpec p(int v, int v1, @l Easing easing0) {
        L.p(easing0, "easing");
        return new TweenSpec(v, v1, easing0);
    }

    public static TweenSpec q(int v, int v1, Easing easing0, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 300;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            easing0 = EasingKt.b();
        }
        return AnimationSpecKt.p(v, v1, easing0);
    }
}

