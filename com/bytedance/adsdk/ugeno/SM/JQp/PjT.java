package com.bytedance.adsdk.ugeno.SM.JQp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.XX.Au;
import com.bytedance.adsdk.ugeno.cr;

public class PjT extends FrameLayout {
    private cr Au;
    private LinearLayout JQp;
    private float PjT;
    private double ReZ;
    private Context XX;
    private float Zh;
    private float cr;
    private LinearLayout cz;

    public PjT(Context context0) {
        super(context0);
        this.XX = context0;
        this.JQp = new LinearLayout(context0);
        this.cz = new LinearLayout(context0);
        this.JQp.setOrientation(0);
        this.JQp.setGravity(0x800003);
        this.cz.setOrientation(0);
        this.cz.setGravity(0x800003);
    }

    public void PjT(double f, int v, int v1, float f1, int v2) {
        this.removeAllViews();
        this.JQp.removeAllViews();
        this.cz.removeAllViews();
        this.PjT = (float)(((int)Au.PjT(this.XX, f1)));
        this.Zh = (float)(((int)Au.PjT(this.XX, f1)));
        this.ReZ = f;
        this.cr = (float)v2;
        for(int v4 = 0; v4 < 5; ++v4) {
            ImageView imageView0 = this.getStarImageView();
            imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView0.setImageResource(com.bytedance.adsdk.ugeno.XX.cr.PjT(this.XX, "tt_ugen_rating_star"));
            imageView0.setColorFilter(v, PorterDuff.Mode.SRC_IN);
            this.cz.addView(imageView0);
        }
        for(int v3 = 0; v3 < 5; ++v3) {
            ImageView imageView1 = this.getStarImageView();
            imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView1.setImageResource(com.bytedance.adsdk.ugeno.XX.cr.PjT(this.XX, "tt_ugen_rating_star"));
            imageView1.setColorFilter(v1);
            this.JQp.addView(imageView1);
        }
        this.addView(this.JQp);
        this.addView(this.cz);
        this.requestLayout();
    }

    public void PjT(cr cr0) {
        this.Au = cr0;
    }

    private ImageView getStarImageView() {
        ImageView imageView0 = new ImageView(this.getContext());
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(((int)this.PjT), ((int)this.Zh));
        linearLayout$LayoutParams0.leftMargin = (int)this.cr;
        linearLayout$LayoutParams0.topMargin = 0;
        linearLayout$LayoutParams0.rightMargin = (int)this.cr;
        linearLayout$LayoutParams0.bottomMargin = 1;
        imageView0.setLayoutParams(linearLayout$LayoutParams0);
        return imageView0;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        cr cr0 = this.Au;
        if(cr0 != null) {
            cr0.XX();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cr cr0 = this.Au;
        if(cr0 != null) {
            cr0.Au();
        }
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        cr cr0 = this.Au;
        if(cr0 != null) {
            cr0.PjT(v, v1, v2, v3);
        }
        super.onLayout(z, v, v1, v2, v3);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        cr cr0 = this.Au;
        if(cr0 != null) {
            cr0.PjT(v, v1);
        }
        super.onMeasure(v, v1);
        this.JQp.measure(v, v1);
        double f = Math.floor(this.ReZ);
        this.cz.measure(View.MeasureSpec.makeMeasureSpec(((int)(((double)(this.cr + this.cr + this.PjT)) * f + ((double)this.cr) + (this.ReZ - f) * ((double)this.PjT))), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.JQp.getMeasuredHeight(), 0x40000000));
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        cr cr0 = this.Au;
        if(cr0 != null) {
            cr0.Zh(v, v1, v2, v3);
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}

