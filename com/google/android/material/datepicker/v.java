package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;

class v extends LinearLayoutManager {
    private static final float O = 100.0f;

    v(Context context0, int v, boolean z) {
        super(context0, v, z);
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public void y2(RecyclerView recyclerView0, State recyclerView$State0, int v) {
        class a extends LinearSmoothScroller {
            final v x;

            a(Context context0) {
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected float w(DisplayMetrics displayMetrics0) {
                return 100.0f / ((float)displayMetrics0.densityDpi);
            }
        }

        a v$a0 = new a(this, recyclerView0.getContext());
        v$a0.q(v);
        this.z2(v$a0);
    }
}

