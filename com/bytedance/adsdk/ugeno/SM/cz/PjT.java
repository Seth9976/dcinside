package com.bytedance.adsdk.ugeno.SM.cz;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.PjT.JQp;
import com.bytedance.adsdk.ugeno.PjT.cz;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.cr;

public class PjT extends TextView implements JQp, IAnimation {
    private cr PjT;
    private cz ReZ;
    private float Zh;

    public PjT(Context context0) {
        super(context0);
        this.ReZ = new cz(this);
    }

    public void PjT(cr cr0) {
        this.PjT = cr0;
    }

    public float getBorderRadius() {
        return this.ReZ.PjT();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.Zh;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getRubIn() {
        return this.ReZ.getRubIn();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getShine() {
        return this.ReZ.getShine();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getStretch() {
        return this.ReZ.getStretch();
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.XX();
        }
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.Au();
        }
    }

    @Override  // android.widget.TextView
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.PjT(canvas0, this);
            this.PjT.PjT(canvas0);
        }
    }

    @Override  // android.widget.TextView
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.PjT(v, v1, v2, v3);
        }
        super.onLayout(z, v, v1, v2, v3);
    }

    @Override  // android.widget.TextView
    protected void onMeasure(int v, int v1) {
        cr cr0 = this.PjT;
        if(cr0 != null) {
            int[] arr_v = cr0.PjT(v, v1);
            super.onMeasure(arr_v[0], arr_v[1]);
            return;
        }
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.Zh(v, v1, v2, v2);
        }
    }

    @Override  // android.widget.TextView
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        this.ReZ.PjT(v);
    }

    public void setBorderRadius(float f) {
        cz cz0 = this.ReZ;
        if(cz0 != null) {
            cz0.PjT(f);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.Zh = f;
        cz cz0 = this.ReZ;
        if(cz0 != null) {
            cz0.Zh(f);
        }
        this.postInvalidate();
    }

    public void setRubIn(float f) {
        cz cz0 = this.ReZ;
        if(cz0 != null) {
            cz0.JQp(f);
        }
    }

    public void setShine(float f) {
        cz cz0 = this.ReZ;
        if(cz0 != null) {
            cz0.ReZ(f);
        }
    }

    public void setStretch(float f) {
        cz cz0 = this.ReZ;
        if(cz0 != null) {
            cz0.cr(f);
        }
    }
}

