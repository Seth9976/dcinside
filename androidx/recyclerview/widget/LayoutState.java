package androidx.recyclerview.widget;

import android.view.View;

class LayoutState {
    boolean a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    boolean h;
    boolean i;
    static final int j = -1;
    static final int k = 1;
    static final int l = 0x80000000;
    static final int m = -1;
    static final int n = 1;

    LayoutState() {
        this.a = true;
        this.f = 0;
        this.g = 0;
    }

    boolean a(State recyclerView$State0) {
        return this.c >= 0 && this.c < recyclerView$State0.d();
    }

    View b(Recycler recyclerView$Recycler0) {
        View view0 = recyclerView$Recycler0.p(this.c);
        this.c += this.d;
        return view0;
    }

    @Override
    public String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}

