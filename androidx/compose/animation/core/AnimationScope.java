package androidx.compose.animation.core;

import A3.a;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n76#2:344\n102#2,2:345\n76#2:347\n102#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
public final class AnimationScope {
    @l
    private final TwoWayConverter a;
    private final Object b;
    private final long c;
    @l
    private final a d;
    @l
    private final MutableState e;
    @l
    private AnimationVector f;
    private long g;
    private long h;
    @l
    private final MutableState i;
    public static final int j = 8;

    static {
    }

    public AnimationScope(Object object0, @l TwoWayConverter twoWayConverter0, @l AnimationVector animationVector0, long v, Object object1, long v1, boolean z, @l a a0) {
        L.p(twoWayConverter0, "typeConverter");
        L.p(animationVector0, "initialVelocityVector");
        L.p(a0, "onCancel");
        super();
        this.a = twoWayConverter0;
        this.b = object1;
        this.c = v1;
        this.d = a0;
        this.e = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
        this.f = AnimationVectorsKt.e(animationVector0);
        this.g = v;
        this.h = 0x8000000000000000L;
        this.i = SnapshotStateKt__SnapshotStateKt.g(Boolean.valueOf(z), null, 2, null);
    }

    public final void a() {
        this.m(false);
        this.d.invoke();
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final long d() {
        return this.c;
    }

    public final Object e() {
        return this.b;
    }

    @l
    public final TwoWayConverter f() {
        return this.a;
    }

    public final Object g() {
        return this.e.getValue();
    }

    public final Object h() {
        return this.a.b().invoke(this.f);
    }

    @l
    public final AnimationVector i() {
        return this.f;
    }

    public final boolean j() {
        return ((Boolean)this.i.getValue()).booleanValue();
    }

    public final void k(long v) {
        this.h = v;
    }

    public final void l(long v) {
        this.g = v;
    }

    public final void m(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void n(Object object0) {
        this.e.setValue(object0);
    }

    public final void o(@l AnimationVector animationVector0) {
        L.p(animationVector0, "<set-?>");
        this.f = animationVector0;
    }

    @l
    public final AnimationState p() {
        Object object0 = this.g();
        AnimationVector animationVector0 = this.f;
        long v = this.g;
        long v1 = this.h;
        boolean z = this.j();
        return new AnimationState(this.a, object0, animationVector0, v, v1, z);
    }
}

