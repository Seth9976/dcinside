package androidx.compose.foundation.pager;

import kotlin.ranges.s;
import y4.m;

public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    private final int b;

    public PagerSnapDistanceMaxPages(int v) {
        this.b = v;
    }

    @Override  // androidx.compose.foundation.pager.PagerSnapDistance
    public int a(int v, int v1, float f, int v2, int v3) {
        return s.I(v1, v - this.b, v + this.b);
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof PagerSnapDistanceMaxPages && this.b == ((PagerSnapDistanceMaxPages)object0).b;
    }

    @Override
    public int hashCode() {
        return this.b;
    }
}

