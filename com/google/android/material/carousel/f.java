package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

public class f extends SnapHelper {
    private final boolean e;
    private RecyclerView f;
    private static final float g = 100.0f;
    private static final float h = 50.0f;

    public f() {
        this(true);
    }

    public f(boolean z) {
        this.e = z;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    public void b(@Nullable RecyclerView recyclerView0) {
        super.b(recyclerView0);
        this.f = recyclerView0;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] c(@NonNull LayoutManager recyclerView$LayoutManager0, @NonNull View view0) {
        return this.o(recyclerView$LayoutManager0, view0, false);
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    protected SmoothScroller e(@NonNull LayoutManager recyclerView$LayoutManager0) {
        class a extends LinearSmoothScroller {
            final LayoutManager x;
            final f y;

            a(Context context0, LayoutManager recyclerView$LayoutManager0) {
                this.x = recyclerView$LayoutManager0;
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected void p(View view0, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
                if(f.this.f != null) {
                    int[] arr_v = f.this.o(f.this.f.getLayoutManager(), view0, true);
                    int v = arr_v[0];
                    int v1 = arr_v[1];
                    int v2 = this.x(Math.max(Math.abs(v), Math.abs(v1)));
                    if(v2 > 0) {
                        recyclerView$SmoothScroller$Action0.l(v, v1, v2, this.j);
                    }
                }
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected float w(DisplayMetrics displayMetrics0) {
                return this.x.H() ? 50.0f / ((float)displayMetrics0.densityDpi) : 100.0f / ((float)displayMetrics0.densityDpi);
            }
        }

        return recyclerView$LayoutManager0 instanceof ScrollVectorProvider ? new a(this, this.f.getContext(), recyclerView$LayoutManager0) : null;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View h(LayoutManager recyclerView$LayoutManager0) {
        return this.q(recyclerView$LayoutManager0);
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    public int i(LayoutManager recyclerView$LayoutManager0, int v, int v1) {
        if(!this.e) {
            return -1;
        }
        int v2 = recyclerView$LayoutManager0.getItemCount();
        if(v2 == 0) {
            return -1;
        }
        int v3 = recyclerView$LayoutManager0.j0();
        View view0 = null;
        View view1 = null;
        int v4 = 0x80000000;
        int v5 = 0x7FFFFFFF;
        for(int v6 = 0; v6 < v3; ++v6) {
            View view2 = recyclerView$LayoutManager0.i0(v6);
            if(view2 != null) {
                int v7 = this.p(view2, ((CarouselLayoutManager)recyclerView$LayoutManager0), false);
                if(v7 <= 0 && v7 > v4) {
                    view1 = view2;
                    v4 = v7;
                }
                if(v7 >= 0 && v7 < v5) {
                    view0 = view2;
                    v5 = v7;
                }
            }
        }
        boolean z = this.r(recyclerView$LayoutManager0, v, v1);
        if(z && view0 != null) {
            return recyclerView$LayoutManager0.K0(view0);
        }
        if(!z && view1 != null) {
            return recyclerView$LayoutManager0.K0(view1);
        }
        if(z) {
            view0 = view1;
        }
        if(view0 == null) {
            return -1;
        }
        int v8 = recyclerView$LayoutManager0.K0(view0) + (this.s(recyclerView$LayoutManager0) == z ? -1 : 1);
        return v8 < 0 || v8 >= v2 ? -1 : v8;
    }

    private int[] o(@NonNull LayoutManager recyclerView$LayoutManager0, @NonNull View view0, boolean z) {
        if(!(recyclerView$LayoutManager0 instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int v = this.p(view0, ((CarouselLayoutManager)recyclerView$LayoutManager0), z);
        if(recyclerView$LayoutManager0.G()) {
            return new int[]{v, 0};
        }
        return recyclerView$LayoutManager0.H() ? new int[]{0, v} : new int[]{0, 0};
    }

    private int p(@NonNull View view0, CarouselLayoutManager carouselLayoutManager0, boolean z) {
        return carouselLayoutManager0.h3(carouselLayoutManager0.K0(view0), z);
    }

    @Nullable
    private View q(LayoutManager recyclerView$LayoutManager0) {
        int v = recyclerView$LayoutManager0.j0();
        View view0 = null;
        if(v != 0 && recyclerView$LayoutManager0 instanceof CarouselLayoutManager) {
            int v1 = 0x7FFFFFFF;
            for(int v2 = 0; v2 < v; ++v2) {
                View view1 = recyclerView$LayoutManager0.i0(v2);
                int v3 = Math.abs(((CarouselLayoutManager)recyclerView$LayoutManager0).h3(recyclerView$LayoutManager0.K0(view1), false));
                if(v3 < v1) {
                    view0 = view1;
                    v1 = v3;
                }
            }
        }
        return view0;
    }

    // 去混淆评级： 低(20)
    private boolean r(LayoutManager recyclerView$LayoutManager0, int v, int v1) {
        return recyclerView$LayoutManager0.G() ? v > 0 : v1 > 0;
    }

    private boolean s(LayoutManager recyclerView$LayoutManager0) {
        int v = recyclerView$LayoutManager0.getItemCount();
        if(recyclerView$LayoutManager0 instanceof ScrollVectorProvider) {
            PointF pointF0 = ((ScrollVectorProvider)recyclerView$LayoutManager0).g(v - 1);
            return pointF0 != null && (pointF0.x < 0.0f || pointF0.y < 0.0f);
        }
        return false;
    }
}

