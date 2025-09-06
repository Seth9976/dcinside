package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,350:1\n76#2:351\n102#2,2:352\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/PlaceableInfo\n*L\n340#1:351\n340#1:352,2\n*E\n"})
final class PlaceableInfo {
    private int a;
    @l
    private final Animatable b;
    private long c;
    @l
    private final MutableState d;

    private PlaceableInfo(long v, int v1) {
        this.a = v1;
        this.b = new Animatable(IntOffset.b(v), VectorConvertersKt.g(IntOffset.b), null, 4, null);
        this.c = v;
        this.d = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
    }

    public PlaceableInfo(long v, int v1, w w0) {
        this(v, v1);
    }

    @l
    public final Animatable a() {
        return this.b;
    }

    public final boolean b() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    public final int c() {
        return this.a;
    }

    public final long d() {
        return this.c;
    }

    public final void e(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void f(int v) {
        this.a = v;
    }

    public final void g(long v) {
        this.c = v;
    }
}

