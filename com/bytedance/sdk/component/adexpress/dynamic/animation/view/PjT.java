package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

public class PjT extends TextView implements IAnimation {
    private float JQp;
    ReZ PjT;
    private float ReZ;
    private float Zh;
    private float cr;

    public PjT(Context context0) {
        super(context0);
        this.PjT = new ReZ();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.cr;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.JQp;
    }

    @Override  // android.widget.TextView
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        this.PjT.PjT(canvas0, this, this);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.PjT.PjT(this, v, v1);
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f) {
        this.cr = f;
        this.postInvalidate();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f) {
        this.Zh = f;
        this.postInvalidate();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f) {
        this.ReZ = f;
        this.postInvalidate();
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f) {
        this.JQp = f;
        this.PjT.PjT(this, f);
    }
}

