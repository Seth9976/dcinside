package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.collections.u;
import y4.l;

final class EmptyLazyListLayoutInfo implements LazyListLayoutInfo {
    @l
    public static final EmptyLazyListLayoutInfo a;
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
        EmptyLazyListLayoutInfo.a = new EmptyLazyListLayoutInfo();
        EmptyLazyListLayoutInfo.b = u.H();
        EmptyLazyListLayoutInfo.f = 0L;
        EmptyLazyListLayoutInfo.g = Orientation.a;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public long a() {
        return EmptyLazyListLayoutInfo.f;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int b() {
        return EmptyLazyListLayoutInfo.j;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int c() {
        return EmptyLazyListLayoutInfo.e;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int d() {
        return EmptyLazyListLayoutInfo.k;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int e() {
        return EmptyLazyListLayoutInfo.c;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @l
    public List f() {
        return EmptyLazyListLayoutInfo.b;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int g() {
        return EmptyLazyListLayoutInfo.d;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @l
    public Orientation getOrientation() {
        return EmptyLazyListLayoutInfo.g;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int h() {
        return EmptyLazyListLayoutInfo.i;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean i() {
        return EmptyLazyListLayoutInfo.h;
    }
}

