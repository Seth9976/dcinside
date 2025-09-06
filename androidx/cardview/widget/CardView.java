package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.cardview.R.attr;
import androidx.cardview.R.color;
import androidx.cardview.R.style;
import androidx.cardview.R.styleable;

public class CardView extends FrameLayout {
    private boolean a;
    private boolean b;
    int c;
    int d;
    final Rect e;
    final Rect f;
    private final CardViewDelegate g;
    private static final int[] h;
    private static final CardViewImpl i;

    static {
        CardView.h = new int[]{0x1010031};
        CardViewApi21Impl cardViewApi21Impl0 = new CardViewApi21Impl();
        CardView.i = cardViewApi21Impl0;
        cardViewApi21Impl0.n();
    }

    public CardView(@NonNull Context context0) {
        this(context0, null);
    }

    public CardView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.cardViewStyle);
    }

    public CardView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        ColorStateList colorStateList0;
        Rect rect0 = new Rect();
        this.e = rect0;
        this.f = new Rect();
        androidx.cardview.widget.CardView.1 cardView$10 = new CardViewDelegate() {
            private Drawable a;
            final CardView b;

            @Override  // androidx.cardview.widget.CardViewDelegate
            public void b(int v, int v1, int v2, int v3) {
                CardView.this.f.set(v, v1, v2, v3);
                CardView.this.super.setPadding(v + CardView.this.e.left, v1 + CardView.this.e.top, v2 + CardView.this.e.right, v3 + CardView.this.e.bottom);
            }

            @Override  // androidx.cardview.widget.CardViewDelegate
            public boolean c() {
                return CardView.this.getUseCompatPadding();
            }

            @Override  // androidx.cardview.widget.CardViewDelegate
            public void d(int v, int v1) {
                CardView cardView0 = CardView.this;
                if(v > cardView0.c) {
                    cardView0.super.setMinimumWidth(v);
                }
                CardView cardView1 = CardView.this;
                if(v1 > cardView1.d) {
                    cardView1.super.setMinimumHeight(v1);
                }
            }

            @Override  // androidx.cardview.widget.CardViewDelegate
            public void e(Drawable drawable0) {
                this.a = drawable0;
                CardView.this.setBackgroundDrawable(drawable0);
            }

            @Override  // androidx.cardview.widget.CardViewDelegate
            public Drawable f() {
                return this.a;
            }

            @Override  // androidx.cardview.widget.CardViewDelegate
            public boolean g() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override  // androidx.cardview.widget.CardViewDelegate
            public View h() {
                return CardView.this;
            }
        };
        this.g = cardView$10;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.CardView, v, style.CardView);
        if(typedArray0.hasValue(styleable.CardView_cardBackgroundColor)) {
            colorStateList0 = typedArray0.getColorStateList(2);
        }
        else {
            TypedArray typedArray1 = this.getContext().obtainStyledAttributes(CardView.h);
            int v1 = typedArray1.getColor(0, 0);
            typedArray1.recycle();
            float[] arr_f = new float[3];
            Color.colorToHSV(v1, arr_f);
            colorStateList0 = ColorStateList.valueOf((arr_f[2] > 0.5f ? this.getResources().getColor(color.cardview_light_background) : this.getResources().getColor(color.cardview_dark_background)));
        }
        float f = typedArray0.getDimension(styleable.CardView_cardCornerRadius, 0.0f);
        float f1 = typedArray0.getDimension(styleable.CardView_cardElevation, 0.0f);
        float f2 = typedArray0.getDimension(styleable.CardView_cardMaxElevation, 0.0f);
        this.a = typedArray0.getBoolean(styleable.CardView_cardUseCompatPadding, false);
        this.b = typedArray0.getBoolean(styleable.CardView_cardPreventCornerOverlap, true);
        int v2 = typedArray0.getDimensionPixelSize(styleable.CardView_contentPadding, 0);
        rect0.left = typedArray0.getDimensionPixelSize(styleable.CardView_contentPaddingLeft, v2);
        rect0.top = typedArray0.getDimensionPixelSize(styleable.CardView_contentPaddingTop, v2);
        rect0.right = typedArray0.getDimensionPixelSize(styleable.CardView_contentPaddingRight, v2);
        rect0.bottom = typedArray0.getDimensionPixelSize(styleable.CardView_contentPaddingBottom, v2);
        this.c = typedArray0.getDimensionPixelSize(styleable.CardView_android_minWidth, 0);
        this.d = typedArray0.getDimensionPixelSize(styleable.CardView_android_minHeight, 0);
        typedArray0.recycle();
        CardView.i.l(cardView$10, context0, colorStateList0, f, f1, (f1 > f2 ? f1 : f2));
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return CardView.i.j(this.g);
    }

    public float getCardElevation() {
        return CardView.i.d(this.g);
    }

    @Px
    public int getContentPaddingBottom() {
        return this.e.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.e.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.e.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.e.top;
    }

    public float getMaxCardElevation() {
        return CardView.i.b(this.g);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return CardView.i.a(this.g);
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    public void h(@Px int v, @Px int v1, @Px int v2, @Px int v3) {
        this.e.set(v, v1, v2, v3);
        CardView.i.e(this.g);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        CardViewImpl cardViewImpl0 = CardView.i;
        if(!(cardViewImpl0 instanceof CardViewApi21Impl)) {
            int v2 = View.MeasureSpec.getMode(v);
            if(v2 == 0x80000000 || v2 == 0x40000000) {
                v = View.MeasureSpec.makeMeasureSpec(Math.max(((int)Math.ceil(cardViewImpl0.f(this.g))), View.MeasureSpec.getSize(v)), v2);
            }
            int v3 = View.MeasureSpec.getMode(v1);
            if(v3 == 0x80000000 || v3 == 0x40000000) {
                v1 = View.MeasureSpec.makeMeasureSpec(Math.max(((int)Math.ceil(cardViewImpl0.c(this.g))), View.MeasureSpec.getSize(v1)), v3);
            }
            super.onMeasure(v, v1);
            return;
        }
        super.onMeasure(v, v1);
    }

    public void setCardBackgroundColor(@ColorInt int v) {
        ColorStateList colorStateList0 = ColorStateList.valueOf(v);
        CardView.i.o(this.g, colorStateList0);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList0) {
        CardView.i.o(this.g, colorStateList0);
    }

    public void setCardElevation(float f) {
        CardView.i.i(this.g, f);
    }

    public void setMaxCardElevation(float f) {
        CardView.i.g(this.g, f);
    }

    @Override  // android.view.View
    public void setMinimumHeight(int v) {
        this.d = v;
        super.setMinimumHeight(v);
    }

    @Override  // android.view.View
    public void setMinimumWidth(int v) {
        this.c = v;
        super.setMinimumWidth(v);
    }

    @Override  // android.view.View
    public void setPadding(int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    public void setPaddingRelative(int v, int v1, int v2, int v3) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if(z != this.b) {
            this.b = z;
            CardView.i.k(this.g);
        }
    }

    public void setRadius(float f) {
        CardView.i.h(this.g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if(this.a != z) {
            this.a = z;
            CardView.i.m(this.g);
        }
    }
}

