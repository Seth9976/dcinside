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

class p extends m implements j {
    private ChipsLayoutManager e;

    p(ChipsLayoutManager chipsLayoutManager0, com.beloo.widget.chipslayoutmanager.layouter.m m0, a m$a0) {
        super(chipsLayoutManager0, m0, m$a0);
        this.e = chipsLayoutManager0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.j
    public SmoothScroller a(@NonNull Context context0, int v, int v1, AnchorViewState anchorViewState0) {
        class com.beloo.widget.chipslayoutmanager.p.a extends LinearSmoothScroller {
            final p A;
            final AnchorViewState x;
            final int y;
            final int z;

            com.beloo.widget.chipslayoutmanager.p.a(Context context0, AnchorViewState anchorViewState0, int v, int v1) {
                this.x = anchorViewState0;
                this.y = v;
                this.z = v1;
                super(context0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
            public PointF a(int v) {
                return this.y <= ((int)this.x.d()) ? new PointF(0.0f, -1.0f) : new PointF(0.0f, 1.0f);
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected void p(View view0, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
                super.p(view0, recyclerView$State0, recyclerView$SmoothScroller$Action0);
                int v = p.this.e.J0();
                int v1 = p.this.e.v0(view0);
                LinearInterpolator linearInterpolator0 = new LinearInterpolator();
                recyclerView$SmoothScroller$Action0.l(0, v1 - v, this.z, linearInterpolator0);
            }
        }

        return new com.beloo.widget.chipslayoutmanager.p.a(this, context0, anchorViewState0, v, v1);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.j
    public boolean i() {
        this.d.j();
        if(this.e.j0() > 0) {
            int v = this.e.v0(this.d.x());
            int v1 = this.e.p0(this.d.w());
            return ((int)this.d.v()) != 0 || ((int)this.d.D()) != this.e.getItemCount() - 1 || v < this.e.J0() || v1 > this.e.x0() - this.e.E0() ? this.e.a() : false;
        }
        return false;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.j
    public boolean k() {
        return false;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.m
    void t(int v) {
        this.e.n1(v);
    }
}

