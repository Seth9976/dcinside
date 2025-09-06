package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class NativeAdOptionsView extends FrameLayout {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    @l
    public static final a Companion;
    private ImageView icon;

    static {
        NativeAdOptionsView.Companion = new a(null);
    }

    public NativeAdOptionsView(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.initView(context0);
    }

    public NativeAdOptionsView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        this.initView(context0);
    }

    public NativeAdOptionsView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.initView(context0);
    }

    public final void destroy() {
        try {
            ImageView imageView0 = this.icon;
            if(imageView0 == null) {
                L.S("icon");
                imageView0 = null;
            }
            Drawable drawable0 = imageView0.getDrawable();
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
        ImageView imageView1 = this.icon;
        if(imageView1 == null) {
            L.S("icon");
            imageView1 = null;
        }
        imageView1.setImageDrawable(null);
        this.removeAllViews();
        if(this.getParent() != null) {
            ViewParent viewParent0 = this.getParent();
            L.n(viewParent0, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup)viewParent0).removeView(this);
        }
    }

    @l
    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView0 = this.icon;
        if(imageView0 == null) {
            L.S("icon");
            return null;
        }
        return imageView0;
    }

    private final void initView(Context context0) {
        this.icon = new ImageView(context0);
        int v = y.INSTANCE.dpToPixels(context0, 20);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v, v);
        ImageView imageView0 = this.icon;
        ImageView imageView1 = null;
        if(imageView0 == null) {
            L.S("icon");
            imageView0 = null;
        }
        imageView0.setLayoutParams(frameLayout$LayoutParams0);
        ImageView imageView2 = this.icon;
        if(imageView2 == null) {
            L.S("icon");
        }
        else {
            imageView1 = imageView2;
        }
        this.addView(imageView1);
    }

    public final void renderTo(@l FrameLayout frameLayout0, @com.vungle.ads.y0.a int v) {
        L.p(frameLayout0, "rootView");
        if(this.getParent() != null) {
            ViewParent viewParent0 = this.getParent();
            L.n(viewParent0, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup)viewParent0).removeView(this);
        }
        frameLayout0.addView(this);
        Context context0 = this.getContext();
        L.o(context0, "context");
        int v1 = y.INSTANCE.dpToPixels(context0, 20);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v1, v1);
        switch(v) {
            case 0: {
                frameLayout$LayoutParams0.gravity = 0x800033;
                break;
            }
            case 1: {
                frameLayout$LayoutParams0.gravity = 0x800035;
                break;
            }
            case 2: {
                frameLayout$LayoutParams0.gravity = 0x800053;
                break;
            }
            case 3: {
                frameLayout$LayoutParams0.gravity = 0x800055;
                break;
            }
            default: {
                frameLayout$LayoutParams0.gravity = 0x800035;
            }
        }
        this.setLayoutParams(frameLayout$LayoutParams0);
        frameLayout0.requestLayout();
    }
}

