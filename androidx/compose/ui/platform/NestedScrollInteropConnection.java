package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class NestedScrollInteropConnection implements NestedScrollConnection {
    @l
    private final View a;
    @l
    private final NestedScrollingChildHelper b;
    @l
    private final int[] c;

    public NestedScrollInteropConnection(@l View view0) {
        L.p(view0, "view");
        super();
        this.a = view0;
        NestedScrollingChildHelper nestedScrollingChildHelper0 = new NestedScrollingChildHelper(view0);
        nestedScrollingChildHelper0.p(true);
        this.b = nestedScrollingChildHelper0;
        this.c = new int[2];
        ViewCompat.k2(view0, true);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    public Object a(long v, long v1, @l d d0) {
        if(!this.b.a(NestedScrollInteropConnectionKt.d(Velocity.l(v1)), NestedScrollInteropConnectionKt.d(Velocity.n(v1)), true)) {
            v1 = 0L;
        }
        this.c();
        return Velocity.b(v1);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long b(long v, long v1, int v2) {
        int v3 = NestedScrollInteropConnectionKt.g(v1);
        int v4 = NestedScrollInteropConnectionKt.k(v2);
        if(this.b.s(v3, v4)) {
            kotlin.collections.l.T1(this.c, 0, 0, 0, 6, null);
            int v5 = NestedScrollInteropConnectionKt.f(Offset.p(v));
            int v6 = NestedScrollInteropConnectionKt.f(Offset.r(v));
            int v7 = NestedScrollInteropConnectionKt.f(Offset.p(v1));
            int v8 = NestedScrollInteropConnectionKt.f(Offset.r(v1));
            int v9 = NestedScrollInteropConnectionKt.k(v2);
            this.b.e(v5, v6, v7, v8, null, v9, this.c);
            return NestedScrollInteropConnectionKt.j(this.c, v1);
        }
        return 0L;
    }

    private final void c() {
        if(this.b.l(0)) {
            this.b.u(0);
        }
        if(this.b.l(1)) {
            this.b.u(1);
        }
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    public Object d(long v, @l d d0) {
        if(!this.b.b(NestedScrollInteropConnectionKt.d(Velocity.l(v)), NestedScrollInteropConnectionKt.d(Velocity.n(v)))) {
            v = 0L;
        }
        this.c();
        return Velocity.b(v);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long i(long v, int v1) {
        int v2 = NestedScrollInteropConnectionKt.g(v);
        int v3 = NestedScrollInteropConnectionKt.k(v1);
        if(this.b.s(v2, v3)) {
            kotlin.collections.l.T1(this.c, 0, 0, 0, 6, null);
            int v4 = NestedScrollInteropConnectionKt.f(Offset.p(v));
            int v5 = NestedScrollInteropConnectionKt.f(Offset.r(v));
            int v6 = NestedScrollInteropConnectionKt.k(v1);
            this.b.d(v4, v5, this.c, null, v6);
            return NestedScrollInteropConnectionKt.j(this.c, v);
        }
        return 0L;
    }
}

