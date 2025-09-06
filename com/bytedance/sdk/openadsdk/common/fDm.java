package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;

@SuppressLint({"ViewConstructor"})
public class fDm extends View {
    public interface PjT {
        View PjT(Context arg1);
    }

    private final PjT PjT;
    private View Zh;

    public fDm(Context context0, PjT fDm$PjT0) {
        super(context0);
        this.PjT = fDm$PjT0;
        this.PjT();
    }

    private void PjT() {
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    private void PjT(View view0, ViewGroup viewGroup0) {
        int v = viewGroup0.indexOfChild(this);
        viewGroup0.removeViewInLayout(this);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 != null) {
            viewGroup0.addView(view0, v, viewGroup$LayoutParams0);
            return;
        }
        viewGroup0.addView(view0, v);
    }

    private View Zh() {
        if(this.Zh == null) {
            PjT fDm$PjT0 = this.PjT;
            if(fDm$PjT0 != null) {
                this.Zh = fDm$PjT0.PjT(this.getContext());
                ViewParent viewParent0 = this.getParent();
                this.PjT(this.Zh, ((ViewGroup)viewParent0));
            }
        }
        return this.Zh;
    }

    @Override  // android.view.View
    @SuppressLint({"MissingSuperCall"})
    protected void dispatchDraw(Canvas canvas0) {
    }

    @Override  // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas0) {
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        View view0 = this.Zh;
        if(view0 != null) {
            view0.setVisibility(v);
            return;
        }
        super.setVisibility(v);
        if(v == 0 || v == 4) {
            this.Zh();
        }
    }
}

