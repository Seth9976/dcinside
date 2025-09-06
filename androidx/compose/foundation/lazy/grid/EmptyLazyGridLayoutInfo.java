package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.collections.u;
import y4.l;

final class EmptyLazyGridLayoutInfo implements LazyGridLayoutInfo {
    @l
    public static final EmptyLazyGridLayoutInfo a;
    @l
    private static final List b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final long f;
    @l
    private static final Orientation g;
    private static final boolean h;
    private static final int i;
    private static final int j;
    private static final int k;

    static {
        EmptyLazyGridLayoutInfo.a = new EmptyLazyGridLayoutInfo();
        EmptyLazyGridLayoutInfo.b = u.H();
        EmptyLazyGridLayoutInfo.f = 0L;
        EmptyLazyGridLayoutInfo.g = Orientation.a;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public long a() {
        return EmptyLazyGridLayoutInfo.f;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int b() {
        return EmptyLazyGridLayoutInfo.j;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int c() {
        return EmptyLazyGridLayoutInfo.e;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int d() {
        return EmptyLazyGridLayoutInfo.k;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int e() {
        return EmptyLazyGridLayoutInfo.c;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @l
    public List f() {
        return EmptyLazyGridLayoutInfo.b;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int g() {
        return EmptyLazyGridLayoutInfo.d;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @l
    public Orientation getOrientation() {
        return EmptyLazyGridLayoutInfo.g;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int h() {
        return EmptyLazyGridLayoutInfo.i;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean i() {
        return EmptyLazyGridLayoutInfo.h;
    }
}

