package com.coupang.ads.view.rating;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import com.coupang.ads.R.drawable;
import com.coupang.ads.tools.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class StarRatingBar extends View {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private final int a;
    @Px
    private int b;
    private double c;
    private int d;
    @m
    private Drawable e;
    @m
    private Drawable f;
    @m
    private Drawable g;
    @l
    public static final a h = null;
    public static final int i = 5;

    static {
        StarRatingBar.h = new a(null);
    }

    @j
    public StarRatingBar(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public StarRatingBar(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public StarRatingBar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = d.b(context0, 2);
        this.b = d.b(context0, 12);
        this.e = ContextCompat.getDrawable(context0, drawable.ic_ads_star_fill_24);
        this.f = ContextCompat.getDrawable(context0, drawable.ic_ads_star_half_24);
        this.g = ContextCompat.getDrawable(context0, drawable.ic_ads_star_empty_24);
        Drawable drawable0 = this.e;
        if(drawable0 != null) {
            this.d = drawable0.getIntrinsicWidth();
        }
    }

    public StarRatingBar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public void a() {
    }

    private final void b(Drawable drawable0) {
        int v = this.b;
        if(v > 0 && drawable0 != null) {
            drawable0.setBounds(0, 0, v, v);
        }
    }

    @m
    public final Drawable getEmptyStarDrawable$ads_release() {
        return this.g;
    }

    @m
    public final Drawable getFillStarDrawable$ads_release() {
        return this.e;
    }

    @m
    public final Drawable getHalfStarDrawable$ads_release() {
        return this.f;
    }

    public final double getRating$ads_release() {
        return this.c;
    }

    public final int getStarDrawableEdgeSize$ads_release() {
        return this.b;
    }

    @Override  // android.view.View
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        super.onDraw(canvas0);
        Drawable drawable0 = this.e;
        if(drawable0 == null) {
            return;
        }
        Drawable drawable1 = this.f;
        if(drawable1 == null) {
            return;
        }
        Drawable drawable2 = this.g;
        if(drawable2 == null) {
            return;
        }
        canvas0.save();
        for(int v = 0; true; ++v) {
            double f = this.c;
            if(((int)f) > v) {
                drawable0.draw(canvas0);
            }
            else if(f - ((double)v) == 0.5) {
                drawable1.draw(canvas0);
            }
            else {
                drawable2.draw(canvas0);
            }
            canvas0.translate(((float)(this.a + this.b)), 0.0f);
            if(v + 1 >= 5) {
                break;
            }
        }
        canvas0.restore();
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        this.setMeasuredDimension(View.resolveSizeAndState(this.b * 5 + this.a * 4, v, 0), View.resolveSizeAndState(this.b, v1, 0));
    }

    private final void setDrawableBound(int v) {
        Drawable drawable0 = this.e;
        if(drawable0 != null) {
            drawable0.setBounds(0, 0, v, v);
        }
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            drawable1.setBounds(0, 0, v, v);
        }
        Drawable drawable2 = this.g;
        if(drawable2 != null) {
            drawable2.setBounds(0, 0, v, v);
        }
    }

    public final void setEmptyStarDrawable$ads_release(@m Drawable drawable0) {
        this.g = drawable0;
        this.b(drawable0);
    }

    public final void setFillStarDrawable$ads_release(@m Drawable drawable0) {
        this.e = drawable0;
        this.b(drawable0);
    }

    public final void setHalfStarDrawable$ads_release(@m Drawable drawable0) {
        this.f = drawable0;
        this.b(drawable0);
    }

    public final void setRating$ads_release(double f) {
        this.c = f;
        this.invalidate();
    }

    public final void setStarDrawableEdgeSize$ads_release(int v) {
        if(this.b != v) {
            this.b = v;
            this.setDrawableBound(v);
        }
    }
}

