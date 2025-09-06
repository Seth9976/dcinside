package com.lsjwzh.widget.recyclerviewpager;

import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public abstract class c extends Adapter {
    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int findRelativeAdapterPositionIn(@l Adapter recyclerView$Adapter0, @l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$Adapter0, "adapter");
        L.p(recyclerView$ViewHolder0, "viewHolder");
        ViewParent viewParent0 = recyclerView$ViewHolder0.itemView.getParent();
        RecyclerViewPager recyclerViewPager0 = viewParent0 instanceof RecyclerViewPager ? ((RecyclerViewPager)viewParent0) : null;
        if(recyclerViewPager0 == null) {
            return -1;
        }
        if(L.g(recyclerViewPager0.getWrapperAdapter(), recyclerView$Adapter0)) {
            Adapter recyclerView$Adapter1 = recyclerViewPager0.getAdapter();
            return recyclerView$Adapter1 == null ? -1 : super.findRelativeAdapterPositionIn(recyclerView$Adapter1, recyclerView$ViewHolder0, v);
        }
        return super.findRelativeAdapterPositionIn(recyclerView$Adapter0, recyclerView$ViewHolder0, v);
    }
}

