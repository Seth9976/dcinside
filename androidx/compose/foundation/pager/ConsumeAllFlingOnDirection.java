package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class ConsumeAllFlingOnDirection implements NestedScrollConnection {
    @l
    private final Orientation a;

    public ConsumeAllFlingOnDirection(@l Orientation orientation0) {
        L.p(orientation0, "orientation");
        super();
        this.a = orientation0;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    public Object a(long v, long v1, @l d d0) {
        return Velocity.b(this.e(v1, this.a));
    }

    // 去混淆评级： 中等(60)
    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long b(long v, long v1, int v2) {
        return NestedScrollSource.g(v2, 2) ? this.c(v1, this.a) : 0L;
    }

    public final long c(long v, @l Orientation orientation0) {
        L.p(orientation0, "orientation");
        return orientation0 == Orientation.a ? Offset.i(v, 0.0f, 0.0f, 2, null) : Offset.i(v, 0.0f, 0.0f, 1, null);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object d(long v, d d0) {
        return a.c(this, v, d0);
    }

    public final long e(long v, @l Orientation orientation0) {
        L.p(orientation0, "orientation");
        return orientation0 == Orientation.a ? Velocity.g(v, 0.0f, 0.0f, 2, null) : Velocity.g(v, 0.0f, 0.0f, 1, null);
    }

    @l
    public final Orientation f() {
        return this.a;
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long i(long v, int v1) {
        return a.d(this, v, v1);
    }
}

