package com.kakao.adfit.ads.na;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.kakao.adfit.ads.R.styleable;
import com.kakao.adfit.m.G;
import com.kakao.adfit.m.s;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

@s
@s0({"SMAP\nAdFitBizBoardAdTemplateLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdFitBizBoardAdTemplateLayout.kt\ncom/kakao/adfit/ads/na/AdFitBizBoardAdTemplateLayout\n+ 2 ViewMeasureSpecCalculator.kt\ncom/kakao/adfit/common/util/ViewMeasureSpecCalculator\n*L\n1#1,135:1\n90#2,3:136\n*S KotlinDebug\n*F\n+ 1 AdFitBizBoardAdTemplateLayout.kt\ncom/kakao/adfit/ads/na/AdFitBizBoardAdTemplateLayout\n*L\n119#1:136,3\n*E\n"})
public final class AdFitBizBoardAdTemplateLayout extends AdFitNativeAdView implements AdFitNativeAdTemplateLayout {
    private final AdFitNativeAdLayout e;
    private final AdFitMediaView f;
    private final G g;

    @j
    public AdFitBizBoardAdTemplateLayout(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdFitBizBoardAdTemplateLayout(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdFitBizBoardAdTemplateLayout(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        AdFitMediaView adFitMediaView0 = new AdFitMediaView(context0, null, 0, 6, null);
        this.f = adFitMediaView0;
        G g0 = new G(this, 3.988372f, 0, 0, 4, null);
        this.g = g0;
        this.e = new Builder(this).setMediaView(adFitMediaView0).build();
        this.addView(adFitMediaView0, new FrameLayout.LayoutParams(-1, -2, 17));
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.AdFitBizBoardAdTemplateLayout, v, 0);
            L.o(typedArray0, "context.obtainStyledAttr…plateLayout, defStyle, 0)");
            if(this.getBackground() == null) {
                int v2 = Color.rgb(0xF3, 0xF3, 0xF3);
                if(typedArray0.hasValue(styleable.AdFitBizBoardAdTemplateLayout_adfit_backgroundColor)) {
                    v2 = typedArray0.getColor(0, v2);
                }
                float f1 = com.kakao.adfit.m.l.a(context0, 5.0f);
                if(typedArray0.hasValue(styleable.AdFitBizBoardAdTemplateLayout_adfit_backgroundCornerRadius)) {
                    f1 = typedArray0.getDimension(1, f1);
                }
                GradientDrawable gradientDrawable1 = new GradientDrawable();
                gradientDrawable1.setColor(v2);
                gradientDrawable1.setCornerRadius(f1);
                this.setBackground(gradientDrawable1);
            }
            if(typedArray0.hasValue(styleable.AdFitBizBoardAdTemplateLayout_adfit_contentAspectRatio)) {
                String s = typedArray0.getString(2);
                if(s != null) {
                    List list0 = v.U4(s, new char[]{':'}, false, 0, 6, null);
                    if(list0.size() == 2) {
                        try {
                            g0.a(Float.parseFloat(((String)list0.get(0))), Float.parseFloat(((String)list0.get(1))));
                            goto label_38;
                        }
                        catch(NumberFormatException unused_ex) {
                        }
                    }
                    throw new UnsupportedOperationException("Can\'t convert value at index " + styleable.AdFitBizBoardAdTemplateLayout_adfit_contentAspectRatio + " to aspect ratio.");
                }
            }
        label_38:
            if(typedArray0.hasValue(styleable.AdFitBizBoardAdTemplateLayout_adfit_contentMaxHeight)) {
                g0.a(typedArray0.getDimensionPixelOffset(3, g0.c()));
            }
            typedArray0.recycle();
        }
        else if(this.getBackground() == null) {
            int v1 = Color.rgb(0xF3, 0xF3, 0xF3);
            float f = com.kakao.adfit.m.l.a(context0, 5.0f);
            GradientDrawable gradientDrawable0 = new GradientDrawable();
            gradientDrawable0.setColor(v1);
            gradientDrawable0.setCornerRadius(f);
            this.setBackground(gradientDrawable0);
        }
    }

    public AdFitBizBoardAdTemplateLayout(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final float getContentAspectRatio() {
        return this.g.a();
    }

    public final int getContentMaxHeight() {
        return this.g.c();
    }

    @l
    public final AdFitMediaView getMediaView() {
        return this.f;
    }

    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdTemplateLayout
    @l
    public AdFitNativeAdLayout getNativeAdLayout() {
        return this.e;
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        this.g.a(v, v1);
        super.onMeasure(this.g.e(), this.g.b());
    }

    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f);
    }

    @Override  // com.kakao.adfit.ads.na.AdFitNativeAdView
    public void removeView(@m View view0) {
        if(this.f != view0) {
            super.removeView(view0);
        }
    }

    public final void setContentAspectRatio(float f) {
        this.g.a(f);
    }

    public final void setContentAspectRatio(float f, float f1) {
        this.g.a(f, f1);
    }

    public final void setContentAspectRatio(int v, int v1) {
        this.g.b(v, v1);
    }

    public final void setContentMaxHeight(int v) {
        this.g.a(v);
    }
}

