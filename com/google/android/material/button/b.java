package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.M;
import com.google.android.material.resources.d;
import com.google.android.material.ripple.a;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;

@RestrictTo({Scope.b})
class b {
    private final MaterialButton a;
    @NonNull
    private p b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    @Nullable
    private PorterDuff.Mode i;
    @Nullable
    private ColorStateList j;
    @Nullable
    private ColorStateList k;
    @Nullable
    private ColorStateList l;
    @Nullable
    private Drawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private LayerDrawable s;
    private int t;
    @ChecksSdkIntAtLeast(api = 21)
    private static final boolean u;
    private static final boolean v;

    static {
        boolean z = true;
        b.u = true;
        if(Build.VERSION.SDK_INT > 22) {
            z = false;
        }
        b.v = z;
    }

    b(MaterialButton materialButton0, @NonNull p p0) {
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = true;
        this.a = materialButton0;
        this.b = p0;
    }

    void A(boolean z) {
        this.n = z;
        this.K();
    }

    void B(@Nullable ColorStateList colorStateList0) {
        if(this.k != colorStateList0) {
            this.k = colorStateList0;
            this.K();
        }
    }

    void C(int v) {
        if(this.h != v) {
            this.h = v;
            this.K();
        }
    }

    void D(@Nullable ColorStateList colorStateList0) {
        if(this.j != colorStateList0) {
            this.j = colorStateList0;
            if(this.f() != null) {
                DrawableCompat.o(this.f(), this.j);
            }
        }
    }

    void E(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.i != porterDuff$Mode0) {
            this.i = porterDuff$Mode0;
            if(this.f() != null && this.i != null) {
                DrawableCompat.p(this.f(), this.i);
            }
        }
    }

    void F(boolean z) {
        this.r = z;
    }

    private void G(@Dimension int v, @Dimension int v1) {
        int v2 = ViewCompat.p0(this.a);
        int v3 = this.a.getPaddingTop();
        int v4 = ViewCompat.o0(this.a);
        int v5 = this.a.getPaddingBottom();
        int v6 = this.e;
        int v7 = this.f;
        this.f = v1;
        this.e = v;
        if(!this.o) {
            this.H();
        }
        ViewCompat.p2(this.a, v2, v3 + v - v6, v4, v5 + v1 - v7);
    }

    private void H() {
        Drawable drawable0 = this.a();
        this.a.setInternalBackground(drawable0);
        k k0 = this.f();
        if(k0 != null) {
            k0.o0(((float)this.t));
            k0.setState(this.a.getDrawableState());
        }
    }

    private void I(@NonNull p p0) {
        if(b.v && !this.o) {
            int v = ViewCompat.p0(this.a);
            int v1 = this.a.getPaddingTop();
            int v2 = ViewCompat.o0(this.a);
            int v3 = this.a.getPaddingBottom();
            this.H();
            ViewCompat.p2(this.a, v, v1, v2, v3);
            return;
        }
        if(this.f() != null) {
            this.f().setShapeAppearanceModel(p0);
        }
        if(this.n() != null) {
            this.n().setShapeAppearanceModel(p0);
        }
        if(this.e() != null) {
            this.e().setShapeAppearanceModel(p0);
        }
    }

    void J(int v, int v1) {
        Drawable drawable0 = this.m;
        if(drawable0 != null) {
            drawable0.setBounds(this.c, this.e, v1 - this.d, v - this.f);
        }
    }

    private void K() {
        k k0 = this.f();
        k k1 = this.n();
        if(k0 != null) {
            k0.F0(((float)this.h), this.k);
            if(k1 != null) {
                k1.E0(((float)this.h), (this.n ? v.d(this.a, attr.colorSurface) : 0));
            }
        }
    }

    @NonNull
    private InsetDrawable L(Drawable drawable0) {
        return new InsetDrawable(drawable0, this.c, this.e, this.d, this.f);
    }

    private Drawable a() {
        k k0 = new k(this.b);
        k0.a0(this.a.getContext());
        DrawableCompat.o(k0, this.j);
        PorterDuff.Mode porterDuff$Mode0 = this.i;
        if(porterDuff$Mode0 != null) {
            DrawableCompat.p(k0, porterDuff$Mode0);
        }
        k0.F0(((float)this.h), this.k);
        k k1 = new k(this.b);
        k1.setTint(0);
        k1.E0(((float)this.h), (this.n ? v.d(this.a, attr.colorSurface) : 0));
        if(b.u) {
            k k2 = new k(this.b);
            this.m = k2;
            DrawableCompat.n(k2, -1);
            LayerDrawable layerDrawable0 = new RippleDrawable(com.google.android.material.ripple.b.e(this.l), this.L(new LayerDrawable(new Drawable[]{k1, k0})), this.m);
            this.s = layerDrawable0;
            return layerDrawable0;
        }
        a a0 = new a(this.b);
        this.m = a0;
        DrawableCompat.o(a0, com.google.android.material.ripple.b.e(this.l));
        LayerDrawable layerDrawable1 = new LayerDrawable(new Drawable[]{k1, k0, this.m});
        this.s = layerDrawable1;
        return this.L(layerDrawable1);
    }

    int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    @Nullable
    public t e() {
        if(this.s != null && this.s.getNumberOfLayers() > 1) {
            return this.s.getNumberOfLayers() <= 2 ? ((t)this.s.getDrawable(1)) : ((t)this.s.getDrawable(2));
        }
        return null;
    }

    @Nullable
    k f() {
        return this.g(false);
    }

    @Nullable
    private k g(boolean z) {
        if(this.s != null && this.s.getNumberOfLayers() > 0) {
            return b.u ? ((k)((LayerDrawable)((InsetDrawable)this.s.getDrawable(0)).getDrawable()).getDrawable(!z)) : ((k)this.s.getDrawable(!z));
        }
        return null;
    }

    @Nullable
    ColorStateList h() {
        return this.l;
    }

    @NonNull
    p i() {
        return this.b;
    }

    @Nullable
    ColorStateList j() {
        return this.k;
    }

    int k() {
        return this.h;
    }

    ColorStateList l() {
        return this.j;
    }

    PorterDuff.Mode m() {
        return this.i;
    }

    @Nullable
    private k n() {
        return this.g(true);
    }

    boolean o() {
        return this.o;
    }

    boolean p() {
        return this.q;
    }

    boolean q() {
        return this.r;
    }

    void r(@NonNull TypedArray typedArray0) {
        this.c = typedArray0.getDimensionPixelOffset(styleable.MaterialButton_android_insetLeft, 0);
        this.d = typedArray0.getDimensionPixelOffset(styleable.MaterialButton_android_insetRight, 0);
        this.e = typedArray0.getDimensionPixelOffset(styleable.MaterialButton_android_insetTop, 0);
        this.f = typedArray0.getDimensionPixelOffset(styleable.MaterialButton_android_insetBottom, 0);
        if(typedArray0.hasValue(styleable.MaterialButton_cornerRadius)) {
            int v = typedArray0.getDimensionPixelSize(8, -1);
            this.g = v;
            this.z(this.b.w(((float)v)));
            this.p = true;
        }
        this.h = typedArray0.getDimensionPixelSize(styleable.MaterialButton_strokeWidth, 0);
        this.i = M.u(typedArray0.getInt(styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = d.a(this.a.getContext(), typedArray0, styleable.MaterialButton_backgroundTint);
        this.k = d.a(this.a.getContext(), typedArray0, styleable.MaterialButton_strokeColor);
        this.l = d.a(this.a.getContext(), typedArray0, styleable.MaterialButton_rippleColor);
        this.q = typedArray0.getBoolean(styleable.MaterialButton_android_checkable, false);
        this.t = typedArray0.getDimensionPixelSize(styleable.MaterialButton_elevation, 0);
        this.r = typedArray0.getBoolean(styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int v1 = ViewCompat.p0(this.a);
        int v2 = this.a.getPaddingTop();
        int v3 = ViewCompat.o0(this.a);
        int v4 = this.a.getPaddingBottom();
        if(typedArray0.hasValue(styleable.MaterialButton_android_background)) {
            this.t();
        }
        else {
            this.H();
        }
        ViewCompat.p2(this.a, v1 + this.c, v2 + this.e, v3 + this.d, v4 + this.f);
    }

    void s(int v) {
        if(this.f() != null) {
            this.f().setTint(v);
        }
    }

    void t() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    void u(boolean z) {
        this.q = z;
    }

    void v(int v) {
        if(!this.p || this.g != v) {
            this.g = v;
            this.p = true;
            this.z(this.b.w(((float)v)));
        }
    }

    public void w(@Dimension int v) {
        this.G(this.e, v);
    }

    public void x(@Dimension int v) {
        this.G(v, this.f);
    }

    void y(@Nullable ColorStateList colorStateList0) {
        if(this.l != colorStateList0) {
            this.l = colorStateList0;
            boolean z = b.u;
            if(z && this.a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable)this.a.getBackground()).setColor(com.google.android.material.ripple.b.e(colorStateList0));
                return;
            }
            if(!z && this.a.getBackground() instanceof a) {
                ((a)this.a.getBackground()).setTintList(com.google.android.material.ripple.b.e(colorStateList0));
            }
        }
    }

    void z(@NonNull p p0) {
        this.b = p0;
        this.I(p0);
    }
}

