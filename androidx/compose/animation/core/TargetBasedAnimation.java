package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class TargetBasedAnimation implements Animation {
    @l
    private final VectorizedAnimationSpec a;
    @l
    private final TwoWayConverter b;
    private final Object c;
    private final Object d;
    @l
    private final AnimationVector e;
    @l
    private final AnimationVector f;
    @l
    private final AnimationVector g;
    private final long h;
    @l
    private final AnimationVector i;
    public static final int j;

    static {
    }

    public TargetBasedAnimation(@l AnimationSpec animationSpec0, @l TwoWayConverter twoWayConverter0, Object object0, Object object1, @m AnimationVector animationVector0) {
        L.p(animationSpec0, "animationSpec");
        L.p(twoWayConverter0, "typeConverter");
        this(animationSpec0.a(twoWayConverter0), twoWayConverter0, object0, object1, animationVector0);
    }

    public TargetBasedAnimation(AnimationSpec animationSpec0, TwoWayConverter twoWayConverter0, Object object0, Object object1, AnimationVector animationVector0, int v, w w0) {
        if((v & 16) != 0) {
            animationVector0 = null;
        }
        this(animationSpec0, twoWayConverter0, object0, object1, animationVector0);
    }

    public TargetBasedAnimation(@l VectorizedAnimationSpec vectorizedAnimationSpec0, @l TwoWayConverter twoWayConverter0, Object object0, Object object1, @m AnimationVector animationVector0) {
        L.p(vectorizedAnimationSpec0, "animationSpec");
        AnimationVector animationVector3;
        L.p(twoWayConverter0, "typeConverter");
        super();
        this.a = vectorizedAnimationSpec0;
        this.b = twoWayConverter0;
        this.c = object0;
        this.d = object1;
        AnimationVector animationVector1 = (AnimationVector)this.d().a().invoke(object0);
        this.e = animationVector1;
        AnimationVector animationVector2 = (AnimationVector)this.d().a().invoke(this.f());
        this.f = animationVector2;
        if(animationVector0 == null) {
            animationVector3 = AnimationVectorsKt.g(((AnimationVector)this.d().a().invoke(object0)));
        }
        else {
            animationVector3 = AnimationVectorsKt.e(animationVector0);
            if(animationVector3 == null) {
                animationVector3 = AnimationVectorsKt.g(((AnimationVector)this.d().a().invoke(object0)));
            }
        }
        this.g = animationVector3;
        this.h = vectorizedAnimationSpec0.b(animationVector1, animationVector2, animationVector3);
        this.i = vectorizedAnimationSpec0.d(animationVector1, animationVector2, animationVector3);
    }

    public TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec0, TwoWayConverter twoWayConverter0, Object object0, Object object1, AnimationVector animationVector0, int v, w w0) {
        if((v & 16) != 0) {
            animationVector0 = null;
        }
        this(vectorizedAnimationSpec0, twoWayConverter0, object0, object1, animationVector0);
    }

    @Override  // androidx.compose.animation.core.Animation
    public boolean a() {
        return this.a.a();
    }

    @Override  // androidx.compose.animation.core.Animation
    public boolean b(long v) {
        return a.a(this, v);
    }

    @Override  // androidx.compose.animation.core.Animation
    public long c() {
        return this.h;
    }

    @Override  // androidx.compose.animation.core.Animation
    @l
    public TwoWayConverter d() {
        return this.b;
    }

    @Override  // androidx.compose.animation.core.Animation
    public Object e(long v) {
        if(!this.b(v)) {
            AnimationVector animationVector0 = this.a.f(v, this.e, this.f, this.g);
            int v1 = animationVector0.b();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(Float.isNaN(animationVector0.a(v2))) {
                    throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + animationVector0 + ". Animation: " + this + ", playTimeNanos: " + v).toString());
                }
            }
            return this.d().b().invoke(animationVector0);
        }
        return this.f();
    }

    @Override  // androidx.compose.animation.core.Animation
    public Object f() {
        return this.d;
    }

    @Override  // androidx.compose.animation.core.Animation
    @l
    public AnimationVector g(long v) {
        return this.b(v) ? this.i : this.a.e(v, this.e, this.f, this.g);
    }

    @l
    public final VectorizedAnimationSpec h() {
        return this.a;
    }

    public final Object i() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "TargetBasedAnimation: " + this.c + " -> " + this.f() + ",initial velocity: " + this.g + ", duration: " + AnimationKt.e(this) + " ms,animationSpec: " + this.a;
    }
}

