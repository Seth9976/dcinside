package com.coupang.ads.custom.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.StyleRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import com.coupang.ads.R.color;
import com.coupang.ads.R.drawable;
import com.coupang.ads.R.id;
import com.coupang.ads.R.layout;
import com.coupang.ads.R.style;
import com.coupang.ads.R.styleable;
import com.coupang.ads.tools.d;
import com.coupang.ads.view.rating.StarRatingBar;
import com.coupang.ads.view.rating.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.r;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

public class AdsStarRating extends ConstraintLayout {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final AdsStarRating create(@l Context context0, @l Style adsStarRating$Style0) {
            L.p(context0, "inContext");
            L.p(adsStarRating$Style0, "style");
            AdsStarRating adsStarRating0 = new AdsStarRating(context0, null, 0, 0, 14, null);
            adsStarRating0.setStyle(adsStarRating$Style0);
            return adsStarRating0;
        }
    }

    public static enum Size {
        SMALL(12),
        MEDIUM(16),
        LARGE(24);

        private final int value;

        private static final Size[] $values() [...] // Inlined contents

        private Size(@Dimension(unit = 0) int v1) {
            this.value = v1;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static enum Style {
        STAR_RATING_SMALL(style.StarRating_Small),
        STAR_RATING_MEDIUM(style.StarRating_Medium),
        STAR_RATING_LARGE(style.StarRating_Large);

        private final int styleRes;

        private static final Style[] $values() [...] // Inlined contents

        private Style(@StyleRes int v1) {
            this.styleRes = v1;
        }

        public final int getStyleRes() {
            return this.styleRes;
        }
    }

    @l
    public static final Companion Companion;
    @ColorInt
    private int endTextColor;
    private boolean includeFontPadding;
    private double rating;
    private boolean showRatingWhenZero;
    @l
    private final StarRatingBar starRatingBar;
    @l
    private final TextView starRatingText;
    @l
    private Style style;

    static {
        AdsStarRating.Companion = new Companion(null);
    }

    @j
    public AdsStarRating(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    @j
    public AdsStarRating(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    @j
    public AdsStarRating(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    @j
    public AdsStarRating(@l Context context0, @m AttributeSet attributeSet0, int v, int v1) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        LayoutInflater.from(context0).inflate(layout.ads_star_rating_view, this, true);
        View view0 = this.findViewById(id.star_rating_bar);
        L.o(view0, "findViewById(R.id.star_rating_bar)");
        this.starRatingBar = (StarRatingBar)view0;
        View view1 = this.findViewById(id.star_rating_text);
        L.o(view1, "findViewById(R.id.star_rating_text)");
        this.starRatingText = (TextView)view1;
        this.applyStyle(attributeSet0, v, v1);
        this.style = Style.STAR_RATING_SMALL;
        this.includeFontPadding = true;
    }

    public AdsStarRating(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, w w0) {
        if((v2 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        this(context0, attributeSet0, v, v1);
    }

    public void _$_clearFindViewByIdCache() {
    }

    private final void applyStyle(AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        if(attributeSet0 == null && v == 0 && v1 == 0) {
            return;
        }
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.StarRating, v, v1);
        L.o(typedArray0, "context.obtainStyledAttr…       styleRes\n        )");
        try {
            CharSequence charSequence0 = typedArray0.getText(styleable.StarRating_android_text);
            ColorStateList colorStateList0 = typedArray0.getColorStateList(styleable.StarRating_android_textColor);
            int v3 = typedArray0.getResourceId(styleable.StarRating_android_textAppearance, style.T5_Regular);
            int v4 = typedArray0.getResourceId(styleable.StarRating_rds_empty_star_icon, drawable.ic_ads_star_empty_24);
            int v5 = typedArray0.getResourceId(styleable.StarRating_rds_half_star_icon, drawable.ic_ads_star_half_24);
            int v6 = typedArray0.getResourceId(styleable.StarRating_rds_fill_star_icon, drawable.ic_ads_star_fill_24);
            Size adsStarRating$Size0 = Size.SMALL;
            int v7 = typedArray0.getInt(styleable.StarRating_rds_ratingSize, -1);
            if(v7 >= 0) {
                adsStarRating$Size0 = Size.values()[v7];
            }
            int v8 = adsStarRating$Size0.getValue();
            float f = typedArray0.getFloat(styleable.StarRating_rds_rating, 0.0f);
            boolean z = typedArray0.getBoolean(styleable.StarRating_rds_show_rating_zero, false);
            boolean z1 = typedArray0.getBoolean(styleable.StarRating_android_includeFontPadding, true);
            Drawable drawable0 = d.q(this.getContext(), v4);
            if(drawable0 != null) {
                this.starRatingBar.setEmptyStarDrawable$ads_release(drawable0);
            }
            Drawable drawable1 = d.q(this.getContext(), v5);
            if(drawable1 != null) {
                this.starRatingBar.setHalfStarDrawable$ads_release(drawable1);
            }
            Drawable drawable2 = d.q(this.getContext(), v6);
            if(drawable2 != null) {
                this.starRatingBar.setFillStarDrawable$ads_release(drawable2);
            }
            this.setShowRatingWhenZero(z);
            this.setEndText(charSequence0);
            this.setRating(((double)f));
            com.coupang.ads.tools.m.b(this.starRatingText, colorStateList0);
            TextViewCompat.D(this.starRatingText, v3);
            int v9 = d.b(this.getContext(), v8);
            this.starRatingBar.setStarDrawableEdgeSize$ads_release(v9);
            this.setIncludeFontPadding(z1);
        }
        finally {
            typedArray0.recycle();
        }
    }

    static void applyStyle$default(AdsStarRating adsStarRating0, AttributeSet attributeSet0, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyStyle");
        }
        if((v2 & 1) != 0) {
            attributeSet0 = null;
        }
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        adsStarRating0.applyStyle(attributeSet0, v, v1);
    }

    private final void changeStyle(Style adsStarRating$Style0) {
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(adsStarRating$Style0.getStyleRes(), styleable.StarRating);
        L.o(typedArray0, "context.obtainStyledAttr…, R.styleable.StarRating)");
        try {
            Size adsStarRating$Size0 = Size.SMALL;
            int v1 = typedArray0.getInt(styleable.StarRating_rds_ratingSize, -1);
            if(v1 >= 0) {
                adsStarRating$Size0 = Size.values()[v1];
            }
            int v2 = typedArray0.getResourceId(styleable.StarRating_android_textAppearance, 0);
            int v3 = d.b(this.getContext(), adsStarRating$Size0.getValue());
            this.starRatingBar.setStarDrawableEdgeSize$ads_release(v3);
            TextViewCompat.D(this.starRatingText, v2);
            int v4 = typedArray0.getResourceId(styleable.StarRating_rds_empty_star_icon, drawable.ic_ads_star_empty_24);
            int v5 = typedArray0.getResourceId(styleable.StarRating_rds_half_star_icon, drawable.ic_ads_star_half_24);
            int v6 = typedArray0.getResourceId(styleable.StarRating_rds_fill_star_icon, drawable.ic_ads_star_fill_24);
            Drawable drawable0 = d.q(this.getContext(), v4);
            if(drawable0 != null) {
                this.starRatingBar.setEmptyStarDrawable$ads_release(drawable0);
            }
            Drawable drawable1 = d.q(this.getContext(), v5);
            if(drawable1 != null) {
                this.starRatingBar.setHalfStarDrawable$ads_release(drawable1);
            }
            Drawable drawable2 = d.q(this.getContext(), v6);
            if(drawable2 != null) {
                this.starRatingBar.setFillStarDrawable$ads_release(drawable2);
            }
        }
        finally {
            typedArray0.recycle();
        }
    }

    @m
    public final CharSequence getEndText() {
        return this.starRatingText.getText();
    }

    public final int getEndTextColor() {
        return this.endTextColor;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public final double getRating() {
        return this.rating;
    }

    public final boolean getShowRatingWhenZero() {
        return this.showRatingWhenZero;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(v, 0x80000000), v1);
    }

    public final void setEmptyStarIcon(@m Drawable drawable0) {
        this.starRatingBar.setEmptyStarDrawable$ads_release(drawable0);
    }

    public final void setEndText(@m CharSequence charSequence0) {
        this.starRatingText.setText(charSequence0);
        int v = charSequence0 == null || charSequence0.length() == 0 ? 8 : 0;
        this.starRatingText.setVisibility(v);
    }

    public final void setEndTextColor(int v) {
        this.endTextColor = v;
        this.starRatingText.setTextColor(v);
    }

    public final void setEndTextWithBracket(@m CharSequence charSequence0) {
        if(charSequence0 != null && charSequence0.length() != 0) {
            if(!v.V2(charSequence0, '(', false, 2, null) && !v.V2(charSequence0, ')', false, 2, null)) {
                charSequence0 = "(" + charSequence0 + ")";
            }
            this.setEndText(charSequence0);
        }
    }

    public final void setEndTextWithoutBracket(@m CharSequence charSequence0) {
        if(charSequence0 != null && charSequence0.length() != 0) {
            this.setEndText(new r("[()]").m(charSequence0.toString(), ""));
        }
    }

    public final void setFillStarIcon(@m Drawable drawable0) {
        this.starRatingBar.setFillStarDrawable$ads_release(drawable0);
    }

    public final void setHalfStarIcon(@m Drawable drawable0) {
        this.starRatingBar.setHalfStarDrawable$ads_release(drawable0);
    }

    public final void setIncludeFontPadding(boolean z) {
        if(this.includeFontPadding != z) {
            this.includeFontPadding = z;
            this.starRatingText.setIncludeFontPadding(z);
        }
    }

    @Override  // android.view.View
    public void setOnClickListener(@m View.OnClickListener view$OnClickListener0) {
        super.setOnClickListener(view$OnClickListener0);
        Context context0 = this.getContext();
        int v = this.isClickable() ? color.rds_blue_600 : color.rds_bluegray_600;
        this.starRatingText.setTextColor(d.k(context0, v));
    }

    public final void setRating(double f) {
        double f1 = a.a.a(f);
        this.rating = f1;
        this.starRatingBar.setRating$ads_release(f1);
        this.setVisibilityByRating(this.rating, this.showRatingWhenZero);
    }

    public final void setShowRatingWhenZero(boolean z) {
        this.showRatingWhenZero = z;
        this.setVisibilityByRating(this.rating, z);
    }

    public final void setStarRatingAutoVisible(@m Long long0, @m Double double0) {
        long v = long0 == null ? 0L : ((long)long0);
        double f = double0 == null ? 0.0 : ((double)double0);
        int v1 = Long.compare(v, 0L);
        if(v1 <= 0 && f <= 0.0) {
            this.setVisibility(8);
            return;
        }
        this.setVisibility(0);
        this.setRating(f);
        this.setEndTextWithBracket((v1 <= 0 ? null : String.valueOf(v)));
        this.setShowRatingWhenZero(true);
    }

    public final void setStyle(@l Style adsStarRating$Style0) {
        L.p(adsStarRating$Style0, "value");
        this.style = adsStarRating$Style0;
        this.changeStyle(adsStarRating$Style0);
    }

    private final void setVisibilityByRating(double f, boolean z) {
        this.starRatingBar.setVisibility((((long)f) > 0L || z ? 0 : 8));
    }
}

