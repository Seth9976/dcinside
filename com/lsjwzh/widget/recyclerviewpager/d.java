package com.lsjwzh.widget.recyclerviewpager;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.AdapterDataObserver;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;

public class d extends Adapter {
    private final RecyclerViewPager a;
    Adapter b;

    public d(RecyclerViewPager recyclerViewPager0, Adapter recyclerView$Adapter0) {
        this.b = recyclerView$Adapter0;
        this.a = recyclerViewPager0;
        this.setHasStableIds(recyclerView$Adapter0.hasStableIds());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.getItemCount();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public long getItemId(int v) {
        return this.b.getItemId(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.b.getItemViewType(v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView0) {
        super.onAttachedToRecyclerView(recyclerView0);
        this.b.onAttachedToRecyclerView(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0;
        this.b.onBindViewHolder(recyclerView$ViewHolder0, v);
        View view0 = recyclerView$ViewHolder0.itemView;
        if(view0.getLayoutParams() == null) {
            viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
        }
        else {
            viewGroup$LayoutParams0 = view0.getLayoutParams();
            if(this.a.getLayoutManager().G()) {
                viewGroup$LayoutParams0.width = -1;
            }
            else {
                viewGroup$LayoutParams0.height = -1;
            }
        }
        view0.setLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.b.onCreateViewHolder(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView0) {
        super.onDetachedFromRecyclerView(recyclerView0);
        this.b.onDetachedFromRecyclerView(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public boolean onFailedToRecycleView(ViewHolder recyclerView$ViewHolder0) {
        return this.b.onFailedToRecycleView(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewAttachedToWindow(ViewHolder recyclerView$ViewHolder0) {
        super.onViewAttachedToWindow(recyclerView$ViewHolder0);
        this.b.onViewAttachedToWindow(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewDetachedFromWindow(ViewHolder recyclerView$ViewHolder0) {
        super.onViewDetachedFromWindow(recyclerView$ViewHolder0);
        this.b.onViewDetachedFromWindow(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(ViewHolder recyclerView$ViewHolder0) {
        super.onViewRecycled(recyclerView$ViewHolder0);
        this.b.onViewRecycled(recyclerView$ViewHolder0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void registerAdapterDataObserver(AdapterDataObserver recyclerView$AdapterDataObserver0) {
        super.registerAdapterDataObserver(recyclerView$AdapterDataObserver0);
        this.b.registerAdapterDataObserver(recyclerView$AdapterDataObserver0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.b.setHasStableIds(z);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void unregisterAdapterDataObserver(AdapterDataObserver recyclerView$AdapterDataObserver0) {
        super.unregisterAdapterDataObserver(recyclerView$AdapterDataObserver0);
        this.b.unregisterAdapterDataObserver(recyclerView$AdapterDataObserver0);
    }
}

