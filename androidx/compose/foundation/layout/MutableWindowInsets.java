package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@ExperimentalLayoutApi
@StabilityInferred(parameters = 0)
@s0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,674:1\n76#2:675\n102#2,2:676\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/MutableWindowInsets\n*L\n81#1:675\n81#1:676,2\n*E\n"})
public final class MutableWindowInsets implements WindowInsets {
    @l
    private final MutableState b;
    public static final int c;

    static {
    }

    public MutableWindowInsets() {
        this(null, 1, null);
    }

    public MutableWindowInsets(@l WindowInsets windowInsets0) {
        L.p(windowInsets0, "initialInsets");
        super();
        this.b = SnapshotStateKt__SnapshotStateKt.g(windowInsets0, null, 2, null);
    }

    public MutableWindowInsets(WindowInsets windowInsets0, int v, w w0) {
        if((v & 1) != 0) {
            windowInsets0 = WindowInsetsKt.a(0, 0, 0, 0);
        }
        this(windowInsets0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int a(@l Density density0) {
        L.p(density0, "density");
        return this.e().a(density0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int b(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return this.e().b(density0, layoutDirection0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int c(@l Density density0) {
        L.p(density0, "density");
        return this.e().c(density0);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int d(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return this.e().d(density0, layoutDirection0);
    }

    @l
    public final WindowInsets e() {
        return (WindowInsets)this.b.getValue();
    }

    public final void f(@l WindowInsets windowInsets0) {
        L.p(windowInsets0, "<set-?>");
        this.b.setValue(windowInsets0);
    }
}

