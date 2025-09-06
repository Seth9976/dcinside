package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1155:1\n76#2:1156\n102#2,2:1157\n76#2:1159\n102#2,2:1160\n76#2:1162\n102#2,2:1163\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n103#1:1156\n103#1:1157,2\n115#1:1159\n115#1:1160,2\n127#1:1162\n127#1:1163,2\n*E\n"})
public final class MutableTransitionState {
    @l
    private final MutableState a;
    @l
    private final MutableState b;
    @l
    private final MutableState c;
    public static final int d;

    static {
    }

    public MutableTransitionState(Object object0) {
        this.a = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
        this.b = SnapshotStateKt__SnapshotStateKt.g(object0, null, 2, null);
        this.c = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
    }

    public final Object a() {
        return this.a.getValue();
    }

    public final Object b() {
        return this.b.getValue();
    }

    // 去混淆评级： 低(20)
    public final boolean c() {
        return L.g(this.a(), this.b()) && !this.d();
    }

    public final boolean d() {
        return ((Boolean)this.c.getValue()).booleanValue();
    }

    public final void e(Object object0) {
        this.a.setValue(object0);
    }

    public final void f(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }

    public final void g(Object object0) {
        this.b.setValue(object0);
    }
}

