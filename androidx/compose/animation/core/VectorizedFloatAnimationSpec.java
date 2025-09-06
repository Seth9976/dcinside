package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n1855#2,2:814\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n*L\n804#1:814,2\n*E\n"})
public final class VectorizedFloatAnimationSpec implements VectorizedFiniteAnimationSpec {
    @l
    private final Animations a;
    private AnimationVector b;
    private AnimationVector c;
    private AnimationVector d;
    public static final int e = 8;

    static {
    }

    public VectorizedFloatAnimationSpec(@l Animations animations0) {
        L.p(animations0, "anims");
        super();
        this.a = animations0;
    }

    public VectorizedFloatAnimationSpec(@l FloatAnimationSpec floatAnimationSpec0) {
        L.p(floatAnimationSpec0, "anim");
        this(new Animations() {
            @Override  // androidx.compose.animation.core.Animations
            @l
            public FloatAnimationSpec get(int v) {
                return this.a;
            }
        });
    }

    @Override  // androidx.compose.animation.core.VectorizedFiniteAnimationSpec
    public boolean a() [...] // 潜在的解密器

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public long b(@l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        long v = 0L;
        Iterator iterator0 = s.W1(0, animationVector0.b()).iterator();
        while(iterator0.hasNext()) {
            int v1 = ((T)iterator0).b();
            v = Math.max(v, this.a.get(v1).c(animationVector0.a(v1), animationVector1.a(v1), animationVector2.a(v1)));
        }
        return v;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector d(@l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        if(this.d == null) {
            this.d = AnimationVectorsKt.g(animationVector2);
        }
        AnimationVector animationVector3 = this.d;
        if(animationVector3 == null) {
            L.S("endVelocityVector");
            animationVector3 = null;
        }
        int v = animationVector3.b();
        for(int v1 = 0; v1 < v; ++v1) {
            AnimationVector animationVector4 = this.d;
            if(animationVector4 == null) {
                L.S("endVelocityVector");
                animationVector4 = null;
            }
            animationVector4.e(v1, this.a.get(v1).d(animationVector0.a(v1), animationVector1.a(v1), animationVector2.a(v1)));
        }
        AnimationVector animationVector5 = this.d;
        if(animationVector5 == null) {
            L.S("endVelocityVector");
            return null;
        }
        return animationVector5;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector e(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        if(this.c == null) {
            this.c = AnimationVectorsKt.g(animationVector2);
        }
        AnimationVector animationVector3 = this.c;
        if(animationVector3 == null) {
            L.S("velocityVector");
            animationVector3 = null;
        }
        int v1 = animationVector3.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            AnimationVector animationVector4 = this.c;
            if(animationVector4 == null) {
                L.S("velocityVector");
                animationVector4 = null;
            }
            animationVector4.e(v2, this.a.get(v2).b(v, animationVector0.a(v2), animationVector1.a(v2), animationVector2.a(v2)));
        }
        AnimationVector animationVector5 = this.c;
        if(animationVector5 == null) {
            L.S("velocityVector");
            return null;
        }
        return animationVector5;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector f(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        if(this.b == null) {
            this.b = AnimationVectorsKt.g(animationVector0);
        }
        AnimationVector animationVector3 = this.b;
        if(animationVector3 == null) {
            L.S("valueVector");
            animationVector3 = null;
        }
        int v1 = animationVector3.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            AnimationVector animationVector4 = this.b;
            if(animationVector4 == null) {
                L.S("valueVector");
                animationVector4 = null;
            }
            animationVector4.e(v2, this.a.get(v2).e(v, animationVector0.a(v2), animationVector1.a(v2), animationVector2.a(v2)));
        }
        AnimationVector animationVector5 = this.b;
        if(animationVector5 == null) {
            L.S("valueVector");
            return null;
        }
        return animationVector5;
    }
}

