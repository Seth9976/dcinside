package com.beloo.widget.chipslayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import androidx.recyclerview.widget.RecyclerView.State;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

class d extends m implements j {
    private ChipsLayoutManager e;

    d(ChipsLayoutManager chipsLayoutManager0, com.beloo.widget.chipslayoutmanager.layouter.m m0, a m$a0) {
        super(chipsLayoutManager0, m0, m$a0);
        this.e = chipsLayoutManager0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.j
    public SmoothScroller a(@NonNull Context context0, int v, int v1, AnchorViewState anchorViewState0) {
        class com.beloo.widget.chipslayoutmanager.d.a extends LinearSmoothScroller {
            final d A;
            final AnchorViewState x;
            final int y;
            final int z;

            com.beloo.widget.chipslayoutmanager.d.a(Context context0, AnchorViewState anchorViewState0, int v, int v1) {
                this.x = anchorViewState0;
                this.y = v;
                this.z = v1;
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
            public PointF a(int v) {
                return this.y <= ((int)this.x.d()) ? new PointF(-1.0f, 0.0f) : new PointF(1.0f, 0.0f);
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected void p(View view0, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
                super.p(view0, recyclerView$State0, recyclerView$SmoothScroller$Action0);
                int v = d.this.e.G0();
                int v1 = d.this.e.r0(view0);
                LinearInterpolator linearInterpolator0 = new LinearInterpolator();
                recyclerView$SmoothScroller$Action0.l(v1 - v, 0, this.z, linearInterpolator0);
            }
        }

        return new com.beloo.widget.chipslayoutmanager.d.a(this, context0, anchorViewState0, v, v1);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.j
    public boolean i() {
        return false;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.j
    public boolean k() {
        this.d.j();
        if(this.e.j0() > 0) {
            int v = this.e.r0(this.d.a());
            int v1 = this.e.u0(this.d.e());
            return ((int)this.d.v()) != 0 || ((int)this.d.D()) != this.e.getItemCount() - 1 || v < this.e.G0() || v1 > this.e.R0() - this.e.H0() ? this.e.a() : false;
        }
        return false;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.m
    void t(int v) {
        this.e.m1(v);
    }
}

