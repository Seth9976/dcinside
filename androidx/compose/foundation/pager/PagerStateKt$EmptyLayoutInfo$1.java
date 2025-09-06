package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.b;
import java.util.List;
import kotlin.collections.u;
import y4.l;

public final class PagerStateKt.EmptyLayoutInfo.1 implements LazyListLayoutInfo {
    @l
    private final List a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    PagerStateKt.EmptyLayoutInfo.1() {
        this.a = u.H();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public long a() {
        return b.f(this);
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int b() {
        return 0;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int c() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int d() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int e() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @l
    public List f() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int g() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public Orientation getOrientation() {
        return b.d(this);
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int h() {
        return 0;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean i() {
        return false;
    }
}

