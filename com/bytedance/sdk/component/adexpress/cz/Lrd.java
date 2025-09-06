package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.adexpress.cr.XX;
import com.bytedance.sdk.component.adexpress.dynamic.JQp.qj;

public class Lrd extends FrameLayout {
    private float Au;
    private static final int DWo;
    private Drawable JQp;
    LinearLayout PjT;
    private float ReZ;
    private static final int SM;
    private double XX;
    LinearLayout Zh;
    private float cr;
    private Drawable cz;

    static {
        Lrd.SM = qj.Zh("", 0.0f, true)[1] / 2 + 1;
        Lrd.DWo = qj.Zh("", 0.0f, true)[1] / 2 + 3;
    }

    public Lrd(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.PjT = new LinearLayout(this.getContext());
        this.Zh = new LinearLayout(this.getContext());
        this.PjT.setOrientation(0);
        this.PjT.setGravity(0x800003);
        this.Zh.setOrientation(0);
        this.Zh.setGravity(0x800003);
        this.JQp = com.bytedance.sdk.component.utils.Lrd.ReZ(context0, "tt_star_thick");
        this.cz = com.bytedance.sdk.component.utils.Lrd.ReZ(context0, "tt_star");
    }

    public void PjT(double f, int v, int v1, int v2) {
        this.ReZ = (float)(((int)XX.ReZ(this.getContext(), ((float)v1))));
        this.cr = (float)(((int)XX.ReZ(this.getContext(), ((float)v1))));
        this.XX = f;
        this.Au = (float)v2;
        this.removeAllViews();
        for(int v4 = 0; v4 < 5; ++v4) {
            ImageView imageView0 = this.getStarImageView();
            imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView0.setColorFilter(v, PorterDuff.Mode.SRC_IN);
            imageView0.setImageDrawable(this.getStarFillDrawable());
            this.Zh.addView(imageView0);
        }
        for(int v3 = 0; v3 < 5; ++v3) {
            ImageView imageView1 = this.getStarImageView();
            imageView1.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView1.setImageDrawable(this.getStarEmptyDrawable());
            this.PjT.addView(imageView1);
        }
        this.addView(this.PjT);
        this.addView(this.Zh);
        this.requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.JQp;
    }

    public Drawable getStarFillDrawable() {
        return this.cz;
    }

    private ImageView getStarImageView() {
        ImageView imageView0 = new ImageView(this.getContext());
        imageView0.setLayoutParams(new ViewGroup.LayoutParams(((int)this.ReZ), ((int)this.cr)));
        imageView0.setPadding(1, Lrd.SM, 1, Lrd.DWo);
        return imageView0;
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        this.PjT.measure(v, v1);
        this.Zh.measure(View.MeasureSpec.makeMeasureSpec(((int)(((double)(((float)(((int)this.XX))) * this.ReZ + 1.0f)) + ((double)(this.ReZ - 2.0f)) * (this.XX - ((double)(((int)this.XX)))))), 0x40000000), View.MeasureSpec.makeMeasureSpec(this.PjT.getMeasuredHeight(), 0x40000000));
        if(this.Au > 0.0f) {
            this.PjT.setPadding(0, ((int)(((float)this.PjT.getMeasuredHeight()) - this.Au)) / 2, 0, 0);
            this.Zh.setPadding(0, ((int)(((float)this.PjT.getMeasuredHeight()) - this.Au)) / 2, 0, 0);
        }
    }
}

