package com.dcinside.app.view.tool;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout.Behavior;
import com.google.android.material.appbar.AppBarLayout;

public final class FlingBehavior extends Behavior {
    private boolean s;
    private static final int t = 3;

    public FlingBehavior() {
    }

    public FlingBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public boolean P0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, float f, float f1, boolean z) {
        if(f1 > 0.0f && !this.s || f1 < 0.0f && this.s) {
            f1 *= -1.0f;
        }
        View view1 = view0 instanceof SwipeRefreshLayout ? ((SwipeRefreshLayout)view0).getChildAt(0) : view0;
        if(view1 instanceof RecyclerView && f1 < 0.0f) {
            if(((RecyclerView)view1).getChildAdapterPosition(((RecyclerView)view1).getChildAt(0)) > 3) {
                return super.v(coordinatorLayout0, appBarLayout0, view0, f, f1, true);
            }
            z = false;
        }
        return super.v(coordinatorLayout0, appBarLayout0, view0, f, f1, z);
    }

    public void Q0(CoordinatorLayout coordinatorLayout0, AppBarLayout appBarLayout0, View view0, int v, int v1, int[] arr_v) {
        super.x(coordinatorLayout0, appBarLayout0, view0, v, v1, arr_v);
        this.s = v1 > 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean v(CoordinatorLayout coordinatorLayout0, View view0, View view1, float f, float f1, boolean z) {
        return this.P0(coordinatorLayout0, ((AppBarLayout)view0), view1, f, f1, z);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void x(CoordinatorLayout coordinatorLayout0, View view0, View view1, int v, int v1, int[] arr_v) {
        this.Q0(coordinatorLayout0, ((AppBarLayout)view0), view1, v, v1, arr_v);
    }
}

