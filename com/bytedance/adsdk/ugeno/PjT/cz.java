package com.bytedance.adsdk.ugeno.PjT;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

public class cz implements JQp {
    private float JQp;
    private View PjT;
    private float ReZ;
    private float Zh;
    private float cr;
    private float cz;

    public cz(View view0) {
        this.PjT = view0;
    }

    public void JQp(float f) {
        this.cz = f;
        this.PjT.postInvalidate();
    }

    public float PjT() {
        return this.Zh;
    }

    public void PjT(float f) {
        View view0 = this.PjT;
        if(view0 == null) {
            return;
        }
        this.Zh = f;
        Drawable drawable0 = view0.getBackground();
        if(drawable0 instanceof GradientDrawable) {
            ((GradientDrawable)drawable0).setCornerRadius(f);
        }
    }

    public void PjT(int v) {
        View view0 = this.PjT;
        if(view0 == null) {
            return;
        }
        Drawable drawable0 = view0.getBackground();
        if(drawable0 instanceof GradientDrawable) {
            ((GradientDrawable)drawable0).setColor(v);
            return;
        }
        if(drawable0 instanceof ColorDrawable) {
            ((ColorDrawable)drawable0.mutate()).setColor(v);
        }
    }

    public void ReZ(float f) {
        View view0 = this.PjT;
        if(view0 == null) {
            return;
        }
        this.cr = f;
        view0.postInvalidate();
    }

    public void Zh(float f) {
        View view0 = this.PjT;
        if(view0 == null) {
            return;
        }
        this.ReZ = f;
        view0.postInvalidate();
    }

    public void cr(float f) {
        this.JQp = f;
        this.PjT.postInvalidate();
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getRipple() {
        return this.ReZ;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getRubIn() {
        return this.cz;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getShine() {
        return this.cr;
    }

    @Override  // com.bytedance.adsdk.ugeno.PjT.JQp
    public float getStretch() {
        return this.JQp;
    }
}

