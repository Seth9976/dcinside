package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n76#2:90\n102#2,2:91\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:90\n30#1:91,2\n*E\n"})
public final class IntrinsicsPolicy {
    static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final LayoutNode a;
    @l
    private final MutableState b;
    @l
    private static final Companion c = null;
    @Deprecated
    @l
    private static final String d = "Intrinsic size is queried but there is no measure policy in place.";

    static {
        IntrinsicsPolicy.c = new Companion(null);
    }

    public IntrinsicsPolicy(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "layoutNode");
        super();
        this.a = layoutNode0;
        this.b = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
    }

    @l
    public final LayoutNode a() {
        return this.a;
    }

    private final MeasurePolicy b() {
        return (MeasurePolicy)this.b.getValue();
    }

    public final int c(int v) {
        return this.g().d(this.a.A0(), this.a.Z(), v);
    }

    public final int d(int v) {
        return this.g().e(this.a.A0(), this.a.Z(), v);
    }

    public final int e(int v) {
        return this.g().d(this.a.A0(), this.a.Y(), v);
    }

    public final int f(int v) {
        return this.g().e(this.a.A0(), this.a.Y(), v);
    }

    private final MeasurePolicy g() {
        MeasurePolicy measurePolicy0 = this.b();
        if(measurePolicy0 == null) {
            throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
        }
        return measurePolicy0;
    }

    public final int h(int v) {
        return this.g().b(this.a.A0(), this.a.Z(), v);
    }

    public final int i(int v) {
        return this.g().c(this.a.A0(), this.a.Z(), v);
    }

    public final int j(int v) {
        return this.g().b(this.a.A0(), this.a.Y(), v);
    }

    public final int k(int v) {
        return this.g().c(this.a.A0(), this.a.Y(), v);
    }

    private final void l(MeasurePolicy measurePolicy0) {
        this.b.setValue(measurePolicy0);
    }

    public final void m(@l MeasurePolicy measurePolicy0) {
        L.p(measurePolicy0, "measurePolicy");
        this.l(measurePolicy0);
    }
}

