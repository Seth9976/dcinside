package androidx.compose.foundation.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@Stable
@s0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,674:1\n76#2:675\n102#2,2:676\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/ValueInsets\n*L\n365#1:675\n365#1:676,2\n*E\n"})
public final class ValueInsets implements WindowInsets {
    @l
    private final String b;
    @l
    private final MutableState c;

    public ValueInsets(@l InsetsValues insetsValues0, @l String s) {
        L.p(insetsValues0, "insets");
        L.p(s, "name");
        super();
        this.b = s;
        this.c = SnapshotStateKt__SnapshotStateKt.g(insetsValues0, null, 2, null);
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int a(@l Density density0) {
        L.p(density0, "density");
        return this.f().d();
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int b(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return this.f().c();
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int c(@l Density density0) {
        L.p(density0, "density");
        return this.f().a();
    }

    @Override  // androidx.compose.foundation.layout.WindowInsets
    public int d(@l Density density0, @l LayoutDirection layoutDirection0) {
        L.p(density0, "density");
        L.p(layoutDirection0, "layoutDirection");
        return this.f().b();
    }

    @l
    public final String e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof ValueInsets ? L.g(this.f(), ((ValueInsets)object0).f()) : false;
    }

    @l
    public final InsetsValues f() {
        return (InsetsValues)this.c.getValue();
    }

    public final void g(@l InsetsValues insetsValues0) {
        L.p(insetsValues0, "<set-?>");
        this.c.setValue(insetsValues0);
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return this.b + "(left=" + this.f().b() + ", top=" + this.f().d() + ", right=" + this.f().c() + ", bottom=" + this.f().a() + ')';
    }
}

