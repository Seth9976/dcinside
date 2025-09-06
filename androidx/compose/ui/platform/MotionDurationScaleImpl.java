package androidx.compose.ui.platform;

import A3.o;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.MotionDurationScale.DefaultImpls;
import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,426:1\n76#2:427\n102#2,2:428\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n*L\n424#1:427\n424#1:428,2\n*E\n"})
final class MotionDurationScaleImpl implements MotionDurationScale {
    @l
    private final MutableState a;

    public MotionDurationScaleImpl() {
        this.a = SnapshotStateKt__SnapshotStateKt.g(1.0f, null, 2, null);
    }

    @Override  // androidx.compose.ui.MotionDurationScale
    public float T0() {
        return ((Number)this.a.getValue()).floatValue();
    }

    public void b(float f) {
        this.a.setValue(f);
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return DefaultImpls.a(this, object0, o0);
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public b get(@l c g$c0) {
        return DefaultImpls.b(this, g$c0);
    }

    @Override  // androidx.compose.ui.MotionDurationScale
    public c getKey() {
        return androidx.compose.ui.c.a(this);
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return DefaultImpls.c(this, g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return DefaultImpls.d(this, g0);
    }
}

