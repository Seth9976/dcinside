package com.lsjwzh.widget.recyclerviewpager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;

public class LoopRecyclerViewPager extends RecyclerViewPager {
    public LoopRecyclerViewPager(Context context0) {
        this(context0, null);
    }

    public LoopRecyclerViewPager(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public LoopRecyclerViewPager(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    // 去混淆评级： 低(20)
    @Override  // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager
    @NonNull
    protected d Y(Adapter recyclerView$Adapter0) {
        return recyclerView$Adapter0 instanceof b ? ((b)recyclerView$Adapter0) : new b(this, recyclerView$Adapter0);
    }

    private int e0(int v) {
        int v1 = this.getActualItemCountFromAdapter();
        int v2 = this.getCurrentPosition() % v1;
        int v3 = this.getCurrentPosition();
        int v4 = v % v1;
        int v5 = v3 - v2 + v4;
        int v6 = this.getCurrentPosition() - v2 - v1 + v4;
        int v7 = this.getCurrentPosition() - v2 + v1 + v4;
        if(Math.abs(v5 - this.getCurrentPosition()) > Math.abs(v6 - this.getCurrentPosition())) {
            return Math.abs(v6 - this.getCurrentPosition()) <= Math.abs(v7 - this.getCurrentPosition()) ? v6 : v7;
        }
        return Math.abs(v5 - this.getCurrentPosition()) <= Math.abs(v7 - this.getCurrentPosition()) ? v5 : v7;
    }

    public int f0(int v) {
        return v % this.getActualItemCountFromAdapter();
    }

    public int getActualCurrentPosition() {
        return this.f0(this.getCurrentPosition());
    }

    private int getActualItemCountFromAdapter() {
        return ((b)this.getWrapperAdapter()).v();
    }

    private int getMiddlePosition() {
        int v = this.getActualItemCountFromAdapter();
        return v <= 0 || 0x3FFFFFFF % v == 0 ? 0x3FFFFFFF : 0x3FFFFFFF - 0x3FFFFFFF % v;
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager
    public void scrollToPosition(int v) {
        super.scrollToPosition(this.e0(v));
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager
    public void setAdapter(Adapter recyclerView$Adapter0) {
        super.setAdapter(recyclerView$Adapter0);
        super.scrollToPosition(this.getMiddlePosition());
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager
    public void smoothScrollToPosition(int v) {
        try {
            int v1 = this.e0(v);
            super.smoothScrollToPosition(v1);
            timber.log.b.h("transformedPosition:%s", new Object[]{v1});
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager
    public void swapAdapter(Adapter recyclerView$Adapter0, boolean z) {
        super.swapAdapter(recyclerView$Adapter0, z);
        super.scrollToPosition(this.getMiddlePosition());
    }
}

