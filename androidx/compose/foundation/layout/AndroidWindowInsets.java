package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@Stable
@s0({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,767:1\n76#2:768\n102#2,2:769\n76#2:771\n102#2,2:772\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/AndroidWindowInsets\n*L\n58#1:768\n58#1:769,2\n64#1:771\n64#1:772,2\n*E\n"})
public final class AndroidWindowInsets implements WindowInsets {
    private final int b;
    @l
    private final String c;
    @l
    private final MutableState d;
    @l
    private final MutableState e;

    public AndroidWindowInsets(int v, @l String s) {
        L.p(s, "name");
        super();
        this.b = v;
        this.c = s;
        this.d = SnapshotStateKt__SnapshotStateKt.g(Insets.e, null, 2, null);
        this.e = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int a(@l Density density0) {
        L.p(density0, "density");
        return this.e().b;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int b(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return this.e().c;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int c(@l Density density0) {
        L.p(density0, "density");
        return this.e().d;
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int d(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return this.e().a;
    }

    @l
    public final Insets e() {
        return (Insets)this.d.getValue();
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AndroidWindowInsets ? this.b == ((AndroidWindowInsets)object0).b : false;
    }

    public final int f() {
        return this.b;
    }

    public final boolean g() {
        return ((Boolean)this.e.getValue()).booleanValue();
    }

    public final void h(@l Insets insets0) {
        L.p(insets0, "<set-?>");
        this.d.setValue(insets0);
    }

    @Override
    public int hashCode() {
        return this.b;
    }

    private final void i(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final void j(@l WindowInsetsCompat windowInsetsCompat0, int v) {
        L.p(windowInsetsCompat0, "windowInsetsCompat");
        if(v == 0 || (v & this.b) != 0) {
            this.h(windowInsetsCompat0.f(this.b));
            this.i(windowInsetsCompat0.C(this.b));
        }
    }

    @Override
    @l
    public String toString() {
        return this.c + '(' + this.e().a + ", " + this.e().b + ", " + this.e().c + ", " + this.e().d + ')';
    }
}

