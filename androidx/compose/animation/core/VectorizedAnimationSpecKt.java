package androidx.compose.animation.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;

public final class VectorizedAnimationSpecKt {
    private static final int a = 0x7FFFFFFF;

    private static final long c(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, long v) {
        return s.K(v - ((long)vectorizedDurationBasedAnimationSpec0.g()), 0L, vectorizedDurationBasedAnimationSpec0.c());
    }

    private static final Animations d(AnimationVector animationVector0, float f, float f1) {
        return animationVector0 != null ? new Animations() {
            @l
            private final List a;

            {
                AnimationVector animationVector0 = animationVector0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                float f = f;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                float f1 = f1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                kotlin.ranges.l l0 = s.W1(0, animationVector0.b());
                ArrayList arrayList0 = new ArrayList(u.b0(l0, 10));
                Iterator iterator0 = l0.iterator();
                while(iterator0.hasNext()) {
                    arrayList0.add(new FloatSpringSpec(f, f1, animationVector0.a(((T)iterator0).b())));
                }
                this.a = arrayList0;
            }

            @l
            public FloatSpringSpec a(int v) {
                return (FloatSpringSpec)this.a.get(v);
            }

            @Override  // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int v) {
                return this.a(v);
            }
        } : new Animations() {
            @l
            private final FloatSpringSpec a;

            {
                float f = f;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                float f1 = f1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = new FloatSpringSpec(f, f1, 0.0f, 4, null);
            }

            @l
            public FloatSpringSpec a(int v) {
                return this.a;
            }

            @Override  // androidx.compose.animation.core.Animations
            public FloatAnimationSpec get(int v) {
                return this.a(v);
            }
        };
    }

    public static final long e(@l VectorizedAnimationSpec vectorizedAnimationSpec0, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(vectorizedAnimationSpec0, "<this>");
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return vectorizedAnimationSpec0.b(animationVector0, animationVector1, animationVector2) / 1000000L;
    }

    @l
    public static final AnimationVector f(@l VectorizedAnimationSpec vectorizedAnimationSpec0, long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(vectorizedAnimationSpec0, "<this>");
        L.p(animationVector0, "start");
        L.p(animationVector1, "end");
        L.p(animationVector2, "startVelocity");
        return vectorizedAnimationSpec0.f(v * 1000000L, animationVector0, animationVector1, animationVector2);
    }
}

