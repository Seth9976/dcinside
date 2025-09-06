package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@StabilityInferred(parameters = 0)
public final class VectorizedKeyframesSpec implements VectorizedDurationBasedAnimationSpec {
    @l
    private final Map a;
    private final int b;
    private final int c;
    private AnimationVector d;
    private AnimationVector e;
    public static final int f = 8;

    static {
    }

    public VectorizedKeyframesSpec(@l Map map0, int v, int v1) {
        L.p(map0, "keyframes");
        super();
        this.a = map0;
        this.b = v;
        this.c = v1;
    }

    public VectorizedKeyframesSpec(Map map0, int v, int v1, int v2, w w0) {
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        this(map0, v, v1);
    }

    @Override  // androidx.compose.animation.core.VectorizedFiniteAnimationSpec
    public boolean a() {
        return false;
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public long b(AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        return g.a(this, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int c() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector d(AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        return f.a(this, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector e(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        long v1 = VectorizedAnimationSpecKt.c(this, v / 1000000L);
        if(v1 <= 0L) {
            return animationVector2;
        }
        AnimationVector animationVector3 = VectorizedAnimationSpecKt.f(this, v1 - 1L, animationVector0, animationVector1, animationVector2);
        AnimationVector animationVector4 = VectorizedAnimationSpecKt.f(this, v1, animationVector0, animationVector1, animationVector2);
        this.h(animationVector0);
        int v2 = animationVector3.b();
        for(int v3 = 0; true; ++v3) {
            AnimationVector animationVector5 = null;
            if(v3 >= v2) {
                break;
            }
            AnimationVector animationVector6 = this.e;
            if(animationVector6 == null) {
                L.S("velocityVector");
            }
            else {
                animationVector5 = animationVector6;
            }
            animationVector5.e(v3, (animationVector3.a(v3) - animationVector4.a(v3)) * 1000.0f);
        }
        AnimationVector animationVector7 = this.e;
        if(animationVector7 == null) {
            L.S("velocityVector");
            return null;
        }
        return animationVector7;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector f(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        int v1 = (int)VectorizedAnimationSpecKt.c(this, v / 1000000L);
        if(this.a.containsKey(v1)) {
            return (AnimationVector)((V)Y.K(this.a, v1)).e();
        }
        if(v1 >= this.c()) {
            return animationVector1;
        }
        if(v1 <= 0) {
            return animationVector0;
        }
        int v2 = this.c();
        Easing easing0 = EasingKt.c();
        AnimationVector animationVector3 = animationVector0;
        int v4 = 0;
        for(Object object0: this.a.entrySet()) {
            int v5 = ((Number)((Map.Entry)object0).getKey()).intValue();
            V v6 = (V)((Map.Entry)object0).getValue();
            if(v1 > v5 && v5 >= v4) {
                animationVector3 = (AnimationVector)v6.e();
                easing0 = (Easing)v6.f();
                v4 = v5;
            }
            else if(v1 < v5 && v5 <= v2) {
                animationVector1 = (AnimationVector)v6.e();
                v2 = v5;
            }
        }
        float f = easing0.a(((float)(v1 - v4)) / ((float)(v2 - v4)));
        this.h(animationVector0);
        int v7 = animationVector3.b();
        for(int v3 = 0; true; ++v3) {
            AnimationVector animationVector4 = null;
            if(v3 >= v7) {
                break;
            }
            AnimationVector animationVector5 = this.d;
            if(animationVector5 == null) {
                L.S("valueVector");
            }
            else {
                animationVector4 = animationVector5;
            }
            animationVector4.e(v3, VectorConvertersKt.k(animationVector3.a(v3), animationVector1.a(v3), f));
        }
        AnimationVector animationVector6 = this.d;
        if(animationVector6 == null) {
            L.S("valueVector");
            return null;
        }
        return animationVector6;
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int g() {
        return this.c;
    }

    private final void h(AnimationVector animationVector0) {
        if(this.d == null) {
            this.d = AnimationVectorsKt.g(animationVector0);
            this.e = AnimationVectorsKt.g(animationVector0);
        }
    }
}

