package com.coupang.ads.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.L;
import y4.l;

public final class c extends ItemDecoration {
    private final int a;
    private final int b;
    private final int c;

    public c(int v, int v1, int v2) {
        this.a = v;
        this.b = v2;
        this.c = v1 / 2;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
    public void d(@l Rect rect0, @l View view0, @l RecyclerView recyclerView0, @l State recyclerView$State0) {
        L.p(rect0, "outRect");
        L.p(view0, "view");
        L.p(recyclerView0, "parent");
        L.p(recyclerView$State0, "state");
        super.d(rect0, view0, recyclerView0, recyclerView$State0);
        LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
        LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
        if(linearLayoutManager0 != null) {
            int v = recyclerView0.getChildAdapterPosition(view0);
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            int v1 = 0;
            int v2 = v == 0 ? this.n() : 0;
            if(v == (recyclerView$Adapter0 == null ? 0 : recyclerView$Adapter0.getItemCount()) - 1) {
                v1 = this.l();
            }
            if(linearLayoutManager0.b3() == 1) {
                rect0.top += this.m() + v2;
                rect0.bottom += this.m() + v1;
                return;
            }
            rect0.left += this.m() + v2;
            rect0.right += this.m() + v1;
        }
    }

    public final int l() {
        return this.b;
    }

    public final int m() {
        return this.c;
    }

    public final int n() {
        return this.a;
    }
}

