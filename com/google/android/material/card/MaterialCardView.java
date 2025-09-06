package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MaterialCardView extends CardView implements Checkable, t {
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(MaterialCardView arg1, boolean arg2);
    }

    @NonNull
    private final c j;
    private boolean k;
    private boolean l;
    private boolean m;
    private b n;
    private static final int[] o = null;
    private static final int[] p = null;
    private static final int[] q = null;
    private static final int r = 0;
    private static final String s = "MaterialCardView";
    private static final String t = "androidx.cardview.widget.CardView";
    public static final int u = 0x800033;
    public static final int v = 0x800053;
    public static final int w = 0x800035;
    public static final int x = 0x800055;

    static {
        MaterialCardView.o = new int[]{0x101009F};
        MaterialCardView.p = new int[]{0x10100A0};
        MaterialCardView.q = new int[]{attr.state_dragged};
        MaterialCardView.r = style.Widget_MaterialComponents_CardView;
    }

    public MaterialCardView(Context context0) {
        this(context0, null);
    }

    public MaterialCardView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context0, AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, MaterialCardView.r), attributeSet0, v);
        this.l = false;
        this.m = false;
        this.k = true;
        TypedArray typedArray0 = D.k(this.getContext(), attributeSet0, styleable.MaterialCardView, v, MaterialCardView.r, new int[0]);
        c c0 = new c(this, attributeSet0, v, MaterialCardView.r);
        this.j = c0;
        c0.M(super.getCardBackgroundColor());
        c0.c0(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        c0.J(typedArray0);
        typedArray0.recycle();
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF0 = new RectF();
        rectF0.set(this.j.l().getBounds());
        return rectF0;
    }

    @Override  // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.j.m();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.j.n();
    }

    float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.j.o();
    }

    public int getCheckedIconGravity() {
        return this.j.p();
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.j.q();
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.j.r();
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.j.s();
    }

    @Override  // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.j.C().bottom;
    }

    @Override  // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.j.C().left;
    }

    @Override  // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.j.C().right;
    }

    @Override  // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.j.C().top;
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float getProgress() {
        return this.j.w();
    }

    @Override  // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.j.u();
    }

    public ColorStateList getRippleColor() {
        return this.j.x();
    }

    @Override  // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.j.y();
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        return this.j.z();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.j.A();
    }

    @Dimension
    public int getStrokeWidth() {
        return this.j.B();
    }

    @Override  // androidx.cardview.widget.CardView
    public void h(int v, int v1, int v2, int v3) {
        this.j.c0(v, v1, v2, v3);
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.l;
    }

    private void j() {
        if(Build.VERSION.SDK_INT > 26) {
            this.j.k();
        }
    }

    public boolean k() {
        return this.j != null && this.j.F();
    }

    public boolean l() {
        return this.m;
    }

    void m(int v, int v1, int v2, int v3) {
        super.h(v, v1, v2, v3);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j.g0();
        l.f(this, this.j.l());
    }

    @Override  // android.view.ViewGroup
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 3);
        if(this.k()) {
            View.mergeDrawableStates(arr_v, MaterialCardView.o);
        }
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, MaterialCardView.p);
        }
        if(this.l()) {
            View.mergeDrawableStates(arr_v, MaterialCardView.q);
        }
        return arr_v;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent0.setChecked(this.isChecked());
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo0.setCheckable(this.k());
        accessibilityNodeInfo0.setClickable(this.isClickable());
        accessibilityNodeInfo0.setChecked(this.isChecked());
    }

    @Override  // androidx.cardview.widget.CardView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = this.getMeasuredWidth();
        int v3 = this.getMeasuredHeight();
        this.j.K(v2, v3);
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        this.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        if(this.k) {
            if(!this.j.E()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.j.L(true);
            }
            super.setBackgroundDrawable(drawable0);
        }
    }

    void setBackgroundInternal(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int v) {
        ColorStateList colorStateList0 = ColorStateList.valueOf(v);
        this.j.M(colorStateList0);
    }

    @Override  // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList0) {
        this.j.M(colorStateList0);
    }

    @Override  // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.j.i0();
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList0) {
        this.j.N(colorStateList0);
    }

    public void setCheckable(boolean z) {
        this.j.O(z);
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.l != z) {
            this.toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable0) {
        this.j.R(drawable0);
    }

    public void setCheckedIconGravity(int v) {
        if(this.j.p() != v) {
            this.j.S(v);
        }
    }

    public void setCheckedIconMargin(@Dimension int v) {
        this.j.T(v);
    }

    public void setCheckedIconMarginResource(@DimenRes int v) {
        if(v != -1) {
            int v1 = this.getResources().getDimensionPixelSize(v);
            this.j.T(v1);
        }
    }

    public void setCheckedIconResource(@DrawableRes int v) {
        Drawable drawable0 = AppCompatResources.b(this.getContext(), v);
        this.j.R(drawable0);
    }

    public void setCheckedIconSize(@Dimension int v) {
        this.j.U(v);
    }

    public void setCheckedIconSizeResource(@DimenRes int v) {
        if(v != 0) {
            int v1 = this.getResources().getDimensionPixelSize(v);
            this.j.U(v1);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList0) {
        this.j.V(colorStateList0);
    }

    @Override  // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        c c0 = this.j;
        if(c0 != null) {
            c0.g0();
        }
    }

    public void setDragged(boolean z) {
        if(this.m != z) {
            this.m = z;
            this.refreshDrawableState();
            this.j();
            this.invalidate();
        }
    }

    @Override  // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.j.k0();
    }

    public void setOnCheckedChangeListener(@Nullable b materialCardView$b0) {
        this.n = materialCardView$b0;
    }

    @Override  // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.j.k0();
        this.j.h0();
    }

    public void setProgress(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.j.X(f);
    }

    @Override  // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.j.W(f);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList0) {
        this.j.Y(colorStateList0);
    }

    public void setRippleColorResource(@ColorRes int v) {
        ColorStateList colorStateList0 = AppCompatResources.a(this.getContext(), v);
        this.j.Y(colorStateList0);
    }

    @Override  // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p p0) {
        this.setClipToOutline(p0.u(this.getBoundsAsRectF()));
        this.j.Z(p0);
    }

    public void setStrokeColor(@ColorInt int v) {
        this.setStrokeColor(ColorStateList.valueOf(v));
    }

    public void setStrokeColor(ColorStateList colorStateList0) {
        this.j.a0(colorStateList0);
        this.invalidate();
    }

    public void setStrokeWidth(@Dimension int v) {
        this.j.b0(v);
        this.invalidate();
    }

    @Override  // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.j.k0();
        this.j.h0();
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        if(this.k() && this.isEnabled()) {
            this.l = !this.l;
            this.refreshDrawableState();
            this.j();
            this.j.Q(this.l, true);
            b materialCardView$b0 = this.n;
            if(materialCardView$b0 != null) {
                materialCardView$b0.a(this, this.l);
            }
        }
    }
}

