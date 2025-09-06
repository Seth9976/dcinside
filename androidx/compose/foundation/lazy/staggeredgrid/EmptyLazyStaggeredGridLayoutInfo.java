package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.collections.u;
import y4.l;

public final class EmptyLazyStaggeredGridLayoutInfo implements LazyStaggeredGridLayoutInfo {
    @l
    public static final EmptyLazyStaggeredGridLayoutInfo a;
    @l
    private static final List b;
    private static final int c;
    private static final long d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    @l
    private static final Orientation j;

    static {
        EmptyLazyStaggeredGridLayoutInfo.a = new EmptyLazyStaggeredGridLayoutInfo();
        EmptyLazyStaggeredGridLayoutInfo.b = u.H();
        EmptyLazyStaggeredGridLayoutInfo.d = 0L;
        EmptyLazyStaggeredGridLayoutInfo.j = Orientation.a;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public long a() {
        return EmptyLazyStaggeredGridLayoutInfo.d;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int b() {
        return EmptyLazyStaggeredGridLayoutInfo.h;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int c() {
        return EmptyLazyStaggeredGridLayoutInfo.c;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int d() {
        return EmptyLazyStaggeredGridLayoutInfo.i;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int e() {
        return EmptyLazyStaggeredGridLayoutInfo.e;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @l
    public List f() {
        return EmptyLazyStaggeredGridLayoutInfo.b;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int g() {
        return EmptyLazyStaggeredGridLayoutInfo.f;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @l
    public Orientation getOrientation() {
        return EmptyLazyStaggeredGridLayoutInfo.j;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int h() {
        return EmptyLazyStaggeredGridLayoutInfo.g;
    }
}

