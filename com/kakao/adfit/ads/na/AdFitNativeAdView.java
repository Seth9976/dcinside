package com.kakao.adfit.ads.na;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import com.kakao.adfit.ads.R.drawable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nAdFitNativeAdView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdFitNativeAdView.kt\ncom/kakao/adfit/ads/na/AdFitNativeAdView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
public class AdFitNativeAdView extends FrameLayout {
    public interface a {
        void a(b arg1);

        boolean a();

        boolean b();

        int c();

        int d();

        boolean e();

        boolean f();

        ImageView g();
    }

    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    private final a a;
    private ImageView b;
    private boolean c;
    private b d;

    @j
    public AdFitNativeAdView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdFitNativeAdView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdFitNativeAdView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        public static final class c implements a {
            final AdFitNativeAdView a;
            final Context b;

            c(AdFitNativeAdView adFitNativeAdView0, Context context0) {
                this.a = adFitNativeAdView0;
                this.b = context0;
                super();
            }

            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$a
            public void a(b adFitNativeAdView$b0) {
                this.a.d = adFitNativeAdView$b0;
            }

            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$a
            public boolean a() {
                return this.a.hasWindowFocus();
            }

            // 去混淆评级： 低(20)
            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$a
            public boolean b() {
                return this.a.c && this.a.isAttachedToWindow();
            }

            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$a
            public int c() {
                return this.a.getMeasuredWidth();
            }

            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$a
            public int d() {
                return this.a.getMeasuredHeight();
            }

            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$a
            public boolean e() {
                return this.a.getVisibility() == 0;
            }

            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$a
            public boolean f() {
                return this.a.getWindowVisibility() == 0;
            }

            @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView$a
            public ImageView g() {
                ImageView imageView0 = this.a.b;
                if(imageView0 == null) {
                    imageView0 = new ImageView(this.b);
                    imageView0.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView0.setImageResource(drawable.adfit_icon_ad_info);
                    this.a.b = imageView0;
                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = this.a.a();
                    this.a.addView(imageView0, frameLayout$LayoutParams0);
                }
                return imageView0;
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = new c(this, context0);
        if(!this.isInEditMode() && !(context0 instanceof Activity)) {
            throw new IllegalArgumentException("Context must be Activity context!");
        }
    }

    public AdFitNativeAdView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final int a(float f) {
        return (int)TypedValue.applyDimension(1, f, this.getResources().getDisplayMetrics());
    }

    private final FrameLayout.LayoutParams a() {
        int v = this.a(3.0f);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams0.gravity = 53;
        frameLayout$LayoutParams0.setMargins(v, v, v, v);
        return frameLayout$LayoutParams0;
    }

    @Override  // android.view.ViewGroup
    public void addView(@m View view0, int v, @m ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        super.bringChildToFront(this.b);
    }

    @Override  // android.view.ViewGroup
    public void bringChildToFront(@m View view0) {
        super.bringChildToFront(view0);
        ImageView imageView0 = this.b;
        if(imageView0 != view0) {
            super.bringChildToFront(imageView0);
        }
    }

    @l
    public final a getDelegate$library_networkRelease() {
        return this.a;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = true;
        b adFitNativeAdView$b0 = this.d;
        if(adFitNativeAdView$b0 != null) {
            adFitNativeAdView$b0.e();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = false;
        b adFitNativeAdView$b0 = this.d;
        if(adFitNativeAdView$b0 != null) {
            adFitNativeAdView$b0.e();
        }
    }

    @Override  // android.widget.FrameLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        b adFitNativeAdView$b0 = this.d;
        if(adFitNativeAdView$b0 != null) {
            adFitNativeAdView$b0.d();
        }
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(View view0, int v) {
        L.p(view0, "changedView");
        super.onVisibilityChanged(view0, v);
        b adFitNativeAdView$b0 = this.d;
        if(adFitNativeAdView$b0 != null) {
            adFitNativeAdView$b0.b();
        }
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        b adFitNativeAdView$b0 = this.d;
        if(adFitNativeAdView$b0 != null) {
            adFitNativeAdView$b0.c();
        }
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        b adFitNativeAdView$b0 = this.d;
        if(adFitNativeAdView$b0 != null) {
            adFitNativeAdView$b0.a();
        }
    }

    @Override  // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.b, this.a());
    }

    @Override  // android.view.ViewGroup
    public void removeView(View view0) {
        if(this.b != view0) {
            super.removeView(view0);
        }
    }
}

