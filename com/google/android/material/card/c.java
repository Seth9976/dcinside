package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.motion.j;
import com.google.android.material.resources.d;
import com.google.android.material.shape.f;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p.b;
import com.google.android.material.shape.p;

@RestrictTo({Scope.b})
class c {
    private static final double A = 0.0;
    private static final float B = 1.5f;
    private static final int C = 2;
    private static final Drawable D = null;
    public static final int E = 300;
    @NonNull
    private final MaterialCardView a;
    @NonNull
    private final Rect b;
    @NonNull
    private final k c;
    @NonNull
    private final k d;
    @Dimension
    private int e;
    @Dimension
    private int f;
    private int g;
    @Dimension
    private int h;
    @Nullable
    private Drawable i;
    @Nullable
    private Drawable j;
    @Nullable
    private ColorStateList k;
    @Nullable
    private ColorStateList l;
    @Nullable
    private p m;
    @Nullable
    private ColorStateList n;
    @Nullable
    private Drawable o;
    @Nullable
    private LayerDrawable p;
    @Nullable
    private k q;
    @Nullable
    private k r;
    private boolean s;
    private boolean t;
    @Nullable
    private ValueAnimator u;
    private final TimeInterpolator v;
    private final int w;
    private final int x;
    private float y;
    private static final int z = -1;

    static {
        c.A = 0.707107;
        c.D = Build.VERSION.SDK_INT > 28 ? null : new ColorDrawable();
    }

    public c(@NonNull MaterialCardView materialCardView0, AttributeSet attributeSet0, int v, @StyleRes int v1) {
        this.b = new Rect();
        this.s = false;
        this.y = 0.0f;
        this.a = materialCardView0;
        k k0 = new k(materialCardView0.getContext(), attributeSet0, v, v1);
        this.c = k0;
        k0.a0(materialCardView0.getContext());
        k0.w0(-12303292);
        b p$b0 = k0.getShapeAppearanceModel().v();
        TypedArray typedArray0 = materialCardView0.getContext().obtainStyledAttributes(attributeSet0, styleable.CardView, v, style.CardView);
        if(typedArray0.hasValue(styleable.CardView_cardCornerRadius)) {
            p$b0.o(typedArray0.getDimension(3, 0.0f));
        }
        this.d = new k();
        this.Z(p$b0.m());
        this.v = j.g(materialCardView0.getContext(), attr.motionEasingLinearInterpolator, com.google.android.material.animation.b.a);
        this.w = j.f(materialCardView0.getContext(), attr.motionDurationShort2, 300);
        this.x = j.f(materialCardView0.getContext(), attr.motionDurationShort1, 300);
        typedArray0.recycle();
    }

    @Nullable
    ColorStateList A() {
        return this.n;
    }

    @Dimension
    int B() {
        return this.h;
    }

    @NonNull
    Rect C() {
        return this.b;
    }

    @NonNull
    private Drawable D(Drawable drawable0) {
        class a extends InsetDrawable {
            final c a;

            a(Drawable drawable0, int v, int v1, int v2, int v3) {
                super(drawable0, v, v1, v2, v3);
            }

            @Override  // android.graphics.drawable.Drawable
            public int getMinimumHeight() {
                return -1;
            }

            @Override  // android.graphics.drawable.Drawable
            public int getMinimumWidth() {
                return -1;
            }

            @Override  // android.graphics.drawable.InsetDrawable
            public boolean getPadding(Rect rect0) {
                return false;
            }
        }

        if(this.a.getUseCompatPadding()) {
            int v = (int)Math.ceil(this.f());
            int v1 = (int)Math.ceil(this.e());
            return new a(this, drawable0, v1, v, v1, v);
        }
        return new a(this, drawable0, 0, 0, 0, 0);
    }

    boolean E() {
        return this.s;
    }

    boolean F() {
        return this.t;
    }

    private boolean G() {
        return (this.g & 80) == 80;
    }

    private boolean H() {
        return (this.g & 0x800005) == 0x800005;
    }

    // 检测为 Lambda 实现
    private void I(ValueAnimator valueAnimator0) [...]

    void J(@NonNull TypedArray typedArray0) {
        ColorStateList colorStateList0 = d.a(this.a.getContext(), typedArray0, styleable.MaterialCardView_strokeColor);
        this.n = colorStateList0;
        if(colorStateList0 == null) {
            this.n = ColorStateList.valueOf(-1);
        }
        this.h = typedArray0.getDimensionPixelSize(styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray0.getBoolean(styleable.MaterialCardView_android_checkable, false);
        this.t = z;
        this.a.setLongClickable(z);
        this.l = d.a(this.a.getContext(), typedArray0, styleable.MaterialCardView_checkedIconTint);
        this.R(d.e(this.a.getContext(), typedArray0, styleable.MaterialCardView_checkedIcon));
        this.U(typedArray0.getDimensionPixelSize(styleable.MaterialCardView_checkedIconSize, 0));
        this.T(typedArray0.getDimensionPixelSize(styleable.MaterialCardView_checkedIconMargin, 0));
        this.g = typedArray0.getInteger(styleable.MaterialCardView_checkedIconGravity, 0x800035);
        ColorStateList colorStateList1 = d.a(this.a.getContext(), typedArray0, styleable.MaterialCardView_rippleColor);
        this.k = colorStateList1;
        if(colorStateList1 == null) {
            this.k = ColorStateList.valueOf(v.d(this.a, attr.colorControlHighlight));
        }
        this.N(d.a(this.a.getContext(), typedArray0, styleable.MaterialCardView_cardForegroundColor));
        this.l0();
        this.i0();
        this.m0();
        Drawable drawable0 = this.D(this.c);
        this.a.setBackgroundInternal(drawable0);
        Drawable drawable1 = this.f0() ? this.t() : this.d;
        this.i = drawable1;
        Drawable drawable2 = this.D(drawable1);
        this.a.setForeground(drawable2);
    }

    void K(int v, int v1) {
        int v9;
        int v8;
        int v3;
        int v2;
        if(this.p != null) {
            if(this.a.getUseCompatPadding()) {
                v2 = (int)Math.ceil(this.f() * 2.0f);
                v3 = (int)Math.ceil(this.e() * 2.0f);
            }
            else {
                v2 = 0;
                v3 = 0;
            }
            int v4 = this.H() ? v - this.e - this.f - v3 : this.e;
            int v5 = this.G() ? this.e : v1 - this.e - this.f - v2;
            int v6 = this.H() ? this.e : v - this.e - this.f - v3;
            int v7 = this.G() ? v1 - this.e - this.f - v2 : this.e;
            if(ViewCompat.e0(this.a) == 1) {
                v8 = v6;
                v9 = v4;
            }
            else {
                v9 = v6;
                v8 = v4;
            }
            this.p.setLayerInset(2, v8, v7, v9, v5);
        }
    }

    void L(boolean z) {
        this.s = z;
    }

    void M(ColorStateList colorStateList0) {
        this.c.p0(colorStateList0);
    }

    void N(@Nullable ColorStateList colorStateList0) {
        k k0 = this.d;
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(0);
        }
        k0.p0(colorStateList0);
    }

    void O(boolean z) {
        this.t = z;
    }

    public void P(boolean z) {
        this.Q(z, false);
    }

    public void Q(boolean z, boolean z1) {
        Drawable drawable0 = this.j;
        if(drawable0 != null) {
            if(z1) {
                this.b(z);
                return;
            }
            drawable0.setAlpha((z ? 0xFF : 0));
            this.y = z ? 1.0f : 0.0f;
        }
    }

    void R(@Nullable Drawable drawable0) {
        if(drawable0 == null) {
            this.j = c.D;
        }
        else {
            Drawable drawable1 = DrawableCompat.r(drawable0).mutate();
            this.j = drawable1;
            DrawableCompat.o(drawable1, this.l);
            this.P(this.a.isChecked());
        }
        LayerDrawable layerDrawable0 = this.p;
        if(layerDrawable0 != null) {
            layerDrawable0.setDrawableByLayerId(id.mtrl_card_checked_layer_id, this.j);
        }
    }

    void S(int v) {
        this.g = v;
        this.K(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
    }

    void T(@Dimension int v) {
        this.e = v;
    }

    void U(@Dimension int v) {
        this.f = v;
    }

    void V(@Nullable ColorStateList colorStateList0) {
        this.l = colorStateList0;
        Drawable drawable0 = this.j;
        if(drawable0 != null) {
            DrawableCompat.o(drawable0, colorStateList0);
        }
    }

    void W(float f) {
        this.Z(this.m.w(f));
        this.i.invalidateSelf();
        if(this.e0() || this.d0()) {
            this.h0();
        }
        if(this.e0()) {
            this.k0();
        }
    }

    void X(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.c.q0(f);
        k k0 = this.d;
        if(k0 != null) {
            k0.q0(f);
        }
        k k1 = this.r;
        if(k1 != null) {
            k1.q0(f);
        }
    }

    void Y(@Nullable ColorStateList colorStateList0) {
        this.k = colorStateList0;
        this.l0();
    }

    void Z(@NonNull p p0) {
        this.m = p0;
        this.c.setShapeAppearanceModel(p0);
        boolean z = this.c.f0();
        this.c.v0(!z);
        k k0 = this.d;
        if(k0 != null) {
            k0.setShapeAppearanceModel(p0);
        }
        k k1 = this.r;
        if(k1 != null) {
            k1.setShapeAppearanceModel(p0);
        }
        k k2 = this.q;
        if(k2 != null) {
            k2.setShapeAppearanceModel(p0);
        }
    }

    void a0(ColorStateList colorStateList0) {
        if(this.n == colorStateList0) {
            return;
        }
        this.n = colorStateList0;
        this.m0();
    }

    public void b(boolean z) {
        float f = z ? 1.0f - this.y : this.y;
        ValueAnimator valueAnimator0 = this.u;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
            this.u = null;
        }
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{this.y, (z ? 1.0f : 0.0f)});
        this.u = valueAnimator1;
        valueAnimator1.addUpdateListener((ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            this.j.setAlpha(((int)(255.0f * f)));
            this.y = f;
        });
        this.u.setInterpolator(this.v);
        this.u.setDuration(((long)(((float)(z ? this.w : this.x)) * f)));
        this.u.start();
    }

    void b0(@Dimension int v) {
        if(v == this.h) {
            return;
        }
        this.h = v;
        this.m0();
    }

    private float c() {
        return Math.max(Math.max(this.d(this.m.q(), this.c.T()), this.d(this.m.s(), this.c.U())), Math.max(this.d(this.m.k(), this.c.v()), this.d(this.m.i(), this.c.u())));
    }

    void c0(int v, int v1, int v2, int v3) {
        this.b.set(v, v1, v2, v3);
        this.h0();
    }

    private float d(f f0, float f1) {
        if(f0 instanceof o) {
            return (float)((1.0 - c.A) * ((double)f1));
        }
        return f0 instanceof g ? f1 / 2.0f : 0.0f;
    }

    // 去混淆评级： 低(20)
    private boolean d0() {
        return this.a.getPreventCornerOverlap() && !this.g();
    }

    private float e() {
        float f = this.a.getMaxCardElevation();
        return this.e0() ? f + this.c() : f + 0.0f;
    }

    // 去混淆评级： 低(30)
    private boolean e0() {
        return this.a.getPreventCornerOverlap() && this.g() && this.a.getUseCompatPadding();
    }

    private float f() {
        float f = this.a.getMaxCardElevation();
        return this.e0() ? f * 1.5f + this.c() : f * 1.5f + 0.0f;
    }

    private boolean f0() {
        if(this.a.isClickable()) {
            return true;
        }
        View view0;
        for(view0 = this.a; view0.isDuplicateParentStateEnabled() && view0.getParent() instanceof View; view0 = (View)view0.getParent()) {
        }
        return view0.isClickable();
    }

    private boolean g() {
        return this.c.f0();
    }

    void g0() {
        Drawable drawable0 = this.i;
        Drawable drawable1 = this.f0() ? this.t() : this.d;
        this.i = drawable1;
        if(drawable0 != drawable1) {
            this.j0(drawable1);
        }
    }

    @NonNull
    private Drawable h() {
        Drawable drawable0 = new StateListDrawable();
        k k0 = this.j();
        this.q = k0;
        k0.p0(this.k);
        ((StateListDrawable)drawable0).addState(new int[]{0x10100A7}, this.q);
        return drawable0;
    }

    void h0() {
        int v = (int)((this.d0() || this.e0() ? this.c() : 0.0f) - this.v());
        this.a.m(this.b.left + v, this.b.top + v, this.b.right + v, this.b.bottom + v);
    }

    @NonNull
    private Drawable i() {
        if(com.google.android.material.ripple.b.a) {
            this.r = this.j();
            return new RippleDrawable(this.k, null, this.r);
        }
        return this.h();
    }

    void i0() {
        float f = this.a.getCardElevation();
        this.c.o0(f);
    }

    @NonNull
    private k j() {
        return new k(this.m);
    }

    private void j0(Drawable drawable0) {
        if(Build.VERSION.SDK_INT >= 23 && this.a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable)this.a.getForeground()).setDrawable(drawable0);
            return;
        }
        Drawable drawable1 = this.D(drawable0);
        this.a.setForeground(drawable1);
    }

    @RequiresApi(api = 23)
    void k() {
        Drawable drawable0 = this.o;
        if(drawable0 != null) {
            Rect rect0 = drawable0.getBounds();
            int v = rect0.bottom;
            this.o.setBounds(rect0.left, rect0.top, rect0.right, v - 1);
            this.o.setBounds(rect0.left, rect0.top, rect0.right, v);
        }
    }

    void k0() {
        if(!this.E()) {
            Drawable drawable0 = this.D(this.c);
            this.a.setBackgroundInternal(drawable0);
        }
        Drawable drawable1 = this.D(this.i);
        this.a.setForeground(drawable1);
    }

    @NonNull
    k l() {
        return this.c;
    }

    private void l0() {
        if(com.google.android.material.ripple.b.a) {
            Drawable drawable0 = this.o;
            if(drawable0 != null) {
                ((RippleDrawable)drawable0).setColor(this.k);
                return;
            }
        }
        k k0 = this.q;
        if(k0 != null) {
            k0.p0(this.k);
        }
    }

    ColorStateList m() {
        return this.c.z();
    }

    void m0() {
        this.d.F0(((float)this.h), this.n);
    }

    ColorStateList n() {
        return this.d.z();
    }

    @Nullable
    Drawable o() {
        return this.j;
    }

    int p() {
        return this.g;
    }

    @Dimension
    int q() {
        return this.e;
    }

    @Dimension
    int r() {
        return this.f;
    }

    @Nullable
    ColorStateList s() {
        return this.l;
    }

    @NonNull
    private Drawable t() {
        if(this.o == null) {
            this.o = this.i();
        }
        if(this.p == null) {
            LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable0;
            layerDrawable0.setId(2, id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    float u() {
        return this.c.T();
    }

    private float v() {
        if(this.a.getPreventCornerOverlap() && this.a.getUseCompatPadding()) {
            double f = (double)this.a.getCardViewRadius();
            return (float)((1.0 - c.A) * f);
        }
        return 0.0f;
    }

    @FloatRange(from = 0.0, to = 1.0)
    float w() {
        return this.c.A();
    }

    @Nullable
    ColorStateList x() {
        return this.k;
    }

    p y() {
        return this.m;
    }

    @ColorInt
    int z() {
        return this.n == null ? -1 : this.n.getDefaultColor();
    }
}

