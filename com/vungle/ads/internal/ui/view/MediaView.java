package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.util.p;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class MediaView extends RelativeLayout {
    private ImageView imageView;

    public MediaView(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.initView(context0);
    }

    public MediaView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        this.initView(context0);
    }

    public MediaView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.initView(context0);
    }

    public final void destroy() {
        ImageView imageView0 = null;
        try {
            ImageView imageView1 = this.imageView;
            if(imageView1 == null) {
                L.S("imageView");
                imageView1 = null;
            }
            Drawable drawable0 = imageView1.getDrawable();
            if(drawable0 instanceof BitmapDrawable) {
                Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
                if(!bitmap0.isRecycled()) {
                    bitmap0.recycle();
                }
            }
        }
        catch(Exception exception0) {
            p.Companion.w("NativeAd", "error msg: " + exception0.getLocalizedMessage());
        }
        ImageView imageView2 = this.imageView;
        if(imageView2 == null) {
            L.S("imageView");
            imageView2 = null;
        }
        imageView2.setImageDrawable(null);
        ImageView imageView3 = this.imageView;
        if(imageView3 == null) {
            L.S("imageView");
            imageView3 = null;
        }
        if(imageView3.getParent() != null) {
            ImageView imageView4 = this.imageView;
            if(imageView4 == null) {
                L.S("imageView");
                imageView4 = null;
            }
            ViewParent viewParent0 = imageView4.getParent();
            L.n(viewParent0, "null cannot be cast to non-null type android.view.ViewGroup");
            ImageView imageView5 = this.imageView;
            if(imageView5 == null) {
                L.S("imageView");
            }
            else {
                imageView0 = imageView5;
            }
            ((ViewGroup)viewParent0).removeView(imageView0);
        }
    }

    @l
    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView0 = this.imageView;
        if(imageView0 == null) {
            L.S("imageView");
            return null;
        }
        return imageView0;
    }

    private final void initView(Context context0) {
        this.imageView = new ImageView(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout$LayoutParams0.addRule(13);
        ImageView imageView0 = this.imageView;
        ImageView imageView1 = null;
        if(imageView0 == null) {
            L.S("imageView");
            imageView0 = null;
        }
        imageView0.setLayoutParams(relativeLayout$LayoutParams0);
        ImageView imageView2 = this.imageView;
        if(imageView2 == null) {
            L.S("imageView");
            imageView2 = null;
        }
        imageView2.setAdjustViewBounds(true);
        ImageView imageView3 = this.imageView;
        if(imageView3 == null) {
            L.S("imageView");
        }
        else {
            imageView1 = imageView3;
        }
        this.addView(imageView1);
        this.requestLayout();
    }
}

