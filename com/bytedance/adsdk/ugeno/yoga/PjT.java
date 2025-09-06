package com.bytedance.adsdk.ugeno.yoga;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;

public class PjT extends ViewGroup {
    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(view0 instanceof PjT) {
            throw null;
        }
        xf xf0 = xs.PjT();
        Au.PjT(new com.bytedance.adsdk.ugeno.yoga.Au.PjT(viewGroup$LayoutParams0), xf0, view0);
        xf0.PjT(view0);
        xf0.PjT(new Zh());
        throw null;
    }

    @Override  // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return viewGroup$LayoutParams0 instanceof com.bytedance.adsdk.ugeno.yoga.Au.PjT;
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new com.bytedance.adsdk.ugeno.yoga.Au.PjT(-1, -1);
    }

    @Override  // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        return new com.bytedance.adsdk.ugeno.yoga.Au.PjT(viewGroup$LayoutParams0);
    }

    public xf getYogaNode() {
        throw null;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}

