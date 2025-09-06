package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class SnapHelper extends OnFlingListener {
    RecyclerView a;
    private Scroller b;
    private final OnScrollListener c;
    static final float d = 100.0f;

    public SnapHelper() {
        this.c = new OnScrollListener() {
            boolean a;
            final SnapHelper b;

            {
                this.a = false;
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView0, int v) {
                super.onScrollStateChanged(recyclerView0, v);
                if(v == 0 && this.a) {
                    this.a = false;
                    SnapHelper.this.l();
                }
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrolled(RecyclerView recyclerView0, int v, int v1) {
                if(v != 0 || v1 != 0) {
                    this.a = true;
                }
            }
        };
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnFlingListener
    public boolean a(int v, int v1) {
        LayoutManager recyclerView$LayoutManager0 = this.a.getLayoutManager();
        if(recyclerView$LayoutManager0 == null) {
            return false;
        }
        if(this.a.getAdapter() == null) {
            return false;
        }
        int v2 = this.a.getMinFlingVelocity();
        return (Math.abs(v1) > v2 || Math.abs(v) > v2) && this.k(recyclerView$LayoutManager0, v, v1);
    }

    public void b(@Nullable RecyclerView recyclerView0) throws IllegalStateException {
        RecyclerView recyclerView1 = this.a;
        if(recyclerView1 == recyclerView0) {
            return;
        }
        if(recyclerView1 != null) {
            this.g();
        }
        this.a = recyclerView0;
        if(recyclerView0 != null) {
            this.j();
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            this.l();
        }
    }

    @Nullable
    public abstract int[] c(@NonNull LayoutManager arg1, @NonNull View arg2);

    @SuppressLint({"UnknownNullness"})
    public int[] d(int v, int v1) {
        this.b.fling(0, 0, v, v1, 0x80000000, 0x7FFFFFFF, 0x80000000, 0x7FFFFFFF);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    @Nullable
    protected SmoothScroller e(@NonNull LayoutManager recyclerView$LayoutManager0) {
        return this.f(recyclerView$LayoutManager0);
    }

    @Nullable
    @Deprecated
    protected LinearSmoothScroller f(@NonNull LayoutManager recyclerView$LayoutManager0) {
        return !(recyclerView$LayoutManager0 instanceof ScrollVectorProvider) ? null : new LinearSmoothScroller(this.a.getContext()) {
            final SnapHelper x;

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected void p(View view0, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
                SnapHelper snapHelper0 = SnapHelper.this;
                RecyclerView recyclerView0 = snapHelper0.a;
                if(recyclerView0 == null) {
                    return;
                }
                int[] arr_v = snapHelper0.c(recyclerView0.getLayoutManager(), view0);
                int v = arr_v[0];
                int v1 = arr_v[1];
                int v2 = this.x(Math.max(Math.abs(v), Math.abs(v1)));
                if(v2 > 0) {
                    recyclerView$SmoothScroller$Action0.l(v, v1, v2, this.j);
                }
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected float w(DisplayMetrics displayMetrics0) {
                return 100.0f / ((float)displayMetrics0.densityDpi);
            }
        };
    }

    private void g() {
        this.a.removeOnScrollListener(this.c);
        this.a.setOnFlingListener(null);
    }

    @SuppressLint({"UnknownNullness"})
    @Nullable
    public abstract View h(LayoutManager arg1);

    @SuppressLint({"UnknownNullness"})
    public abstract int i(LayoutManager arg1, int arg2, int arg3);

    private void j() throws IllegalStateException {
        if(this.a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.a.addOnScrollListener(this.c);
        this.a.setOnFlingListener(this);
    }

    private boolean k(@NonNull LayoutManager recyclerView$LayoutManager0, int v, int v1) {
        if(!(recyclerView$LayoutManager0 instanceof ScrollVectorProvider)) {
            return false;
        }
        SmoothScroller recyclerView$SmoothScroller0 = this.e(recyclerView$LayoutManager0);
        if(recyclerView$SmoothScroller0 == null) {
            return false;
        }
        int v2 = this.i(recyclerView$LayoutManager0, v, v1);
        if(v2 == -1) {
            return false;
        }
        recyclerView$SmoothScroller0.q(v2);
        recyclerView$LayoutManager0.z2(recyclerView$SmoothScroller0);
        return true;
    }

    void l() {
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0 == null) {
            return;
        }
        LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
        if(recyclerView$LayoutManager0 == null) {
            return;
        }
        View view0 = this.h(recyclerView$LayoutManager0);
        if(view0 == null) {
            return;
        }
        int[] arr_v = this.c(recyclerView$LayoutManager0, view0);
        int v = arr_v[0];
        if(v != 0 || arr_v[1] != 0) {
            this.a.smoothScrollBy(v, arr_v[1]);
        }
    }
}

