package com.google.android.material.tooltip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.A.b;
import com.google.android.material.internal.A;
import com.google.android.material.internal.D;
import com.google.android.material.resources.d;
import com.google.android.material.resources.e;
import com.google.android.material.shape.h;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.m;

@RestrictTo({Scope.b})
public class a extends k implements b {
    class com.google.android.material.tooltip.a.a implements View.OnLayoutChangeListener {
        final a a;

        @Override  // android.view.View$OnLayoutChangeListener
        public void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
            a.this.s1(view0);
        }
    }

    @Nullable
    private CharSequence E;
    @NonNull
    private final Context F;
    @Nullable
    private final Paint.FontMetrics G;
    @NonNull
    private final A H;
    @NonNull
    private final View.OnLayoutChangeListener I;
    @NonNull
    private final Rect J;
    private int K;
    private int L;
    private int M;
    private float M8;
    private int N;
    private float N8;
    private boolean O;
    @StyleRes
    private static final int O8;
    private int P;
    @AttrRes
    private static final int P8;
    private int Q;
    private float X;
    private float Y;
    private final float Z;

    static {
        a.O8 = style.Widget_MaterialComponents_Tooltip;
        a.P8 = attr.tooltipStyle;
    }

    private a(@NonNull Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(context0, attributeSet0, v, v1);
        this.G = new Paint.FontMetrics();
        A a0 = new A(this);
        this.H = a0;
        this.I = (View view0, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> {
            int[] arr_v = new int[2];
            view0.getLocationOnScreen(arr_v);
            a.this.Q = arr_v[0];
            view0.getWindowVisibleDisplayFrame(a.this.J);
        };
        this.J = new Rect();
        this.X = 1.0f;
        this.Y = 1.0f;
        this.Z = 0.5f;
        this.M8 = 0.5f;
        this.N8 = 1.0f;
        this.F = context0;
        a0.g().density = context0.getResources().getDisplayMetrics().density;
        a0.g().setTextAlign(Paint.Align.CENTER);
    }

    private float R0() {
        if(this.J.right - this.getBounds().right - this.Q - this.N < 0) {
            return (float)(this.J.right - this.getBounds().right - this.Q - this.N);
        }
        return this.J.left - this.getBounds().left - this.Q + this.N <= 0 ? 0.0f : ((float)(this.J.left - this.getBounds().left - this.Q + this.N));
    }

    private float S0() {
        this.H.g().getFontMetrics(this.G);
        return (this.G.descent + this.G.ascent) / 2.0f;
    }

    private float T0(@NonNull Rect rect0) {
        return ((float)rect0.centerY()) - this.S0();
    }

    @NonNull
    public static a U0(@NonNull Context context0) {
        return a.W0(context0, null, a.P8, a.O8);
    }

    @NonNull
    public static a V0(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        return a.W0(context0, attributeSet0, a.P8, a.O8);
    }

    @NonNull
    public static a W0(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        a a0 = new a(context0, attributeSet0, v, v1);
        a0.h1(attributeSet0, v, v1);
        return a0;
    }

    private h X0() {
        float f = this.R0();
        float f1 = ((float)(((double)this.getBounds().width()) - ((double)this.P) * 1.414214)) / 2.0f;
        return new m(new j(((float)this.P)), Math.min(Math.max(-f, -f1), f1));
    }

    public void Y0(@Nullable View view0) {
        if(view0 == null) {
            return;
        }
        view0.removeOnLayoutChangeListener(this.I);
    }

    private void Z0(@NonNull Canvas canvas0) {
        if(this.E == null) {
            return;
        }
        Rect rect0 = this.getBounds();
        int v = (int)this.T0(rect0);
        if(this.H.e() != null) {
            this.H.g().drawableState = this.getState();
            this.H.o(this.F);
            this.H.g().setAlpha(((int)(this.N8 * 255.0f)));
        }
        canvas0.drawText(this.E, 0, this.E.length(), ((float)rect0.centerX()), ((float)v), this.H.g());
    }

    @Override  // com.google.android.material.internal.A$b
    public void a() {
        this.invalidateSelf();
    }

    public int a1() {
        return this.N;
    }

    public int b1() {
        return this.M;
    }

    public int c1() {
        return this.L;
    }

    @Nullable
    public CharSequence d1() {
        return this.E;
    }

    @Override  // com.google.android.material.shape.k
    public void draw(@NonNull Canvas canvas0) {
        canvas0.save();
        float f = this.R0();
        float f1 = (float)(-(((double)this.P) * 1.414214 - ((double)this.P)));
        canvas0.scale(this.X, this.Y, ((float)this.getBounds().left) + ((float)this.getBounds().width()) * 0.5f, ((float)this.getBounds().top) + ((float)this.getBounds().height()) * this.M8);
        canvas0.translate(f, f1);
        super.draw(canvas0);
        this.Z0(canvas0);
        canvas0.restore();
    }

    @Nullable
    public e e1() {
        return this.H.e();
    }

    public int f1() {
        return this.K;
    }

    private float g1() {
        return this.E == null ? 0.0f : this.H.h(this.E.toString());
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int)Math.max(this.H.g().getTextSize(), this.M);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int)Math.max(((float)(this.K * 2)) + this.g1(), this.L);
    }

    private void h1(@Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        TypedArray typedArray0 = D.k(this.F, attributeSet0, styleable.Tooltip, v, v1, new int[0]);
        this.P = this.F.getResources().getDimensionPixelSize(dimen.mtrl_tooltip_arrowSize);
        boolean z = typedArray0.getBoolean(styleable.Tooltip_showMarker, true);
        this.O = z;
        if(z) {
            this.setShapeAppearanceModel(this.getShapeAppearanceModel().v().t(this.X0()).m());
        }
        else {
            this.P = 0;
        }
        this.n1(typedArray0.getText(styleable.Tooltip_android_text));
        e e0 = d.h(this.F, typedArray0, styleable.Tooltip_android_textAppearance);
        if(e0 != null && typedArray0.hasValue(styleable.Tooltip_android_textColor)) {
            e0.k(d.a(this.F, typedArray0, 1));
        }
        this.o1(e0);
        int v2 = v.c(this.F, attr.colorOnBackground, a.class.getCanonicalName());
        int v3 = v.s(ColorUtils.D(v.c(this.F, 0x1010031, a.class.getCanonicalName()), 0xE5), ColorUtils.D(v2, 0x99));
        this.p0(ColorStateList.valueOf(typedArray0.getColor(styleable.Tooltip_backgroundTint, v3)));
        this.G0(ColorStateList.valueOf(v.c(this.F, attr.colorSurface, a.class.getCanonicalName())));
        this.K = typedArray0.getDimensionPixelSize(styleable.Tooltip_android_padding, 0);
        this.L = typedArray0.getDimensionPixelSize(styleable.Tooltip_android_minWidth, 0);
        this.M = typedArray0.getDimensionPixelSize(styleable.Tooltip_android_minHeight, 0);
        this.N = typedArray0.getDimensionPixelSize(styleable.Tooltip_android_layout_margin, 0);
        typedArray0.recycle();
    }

    public void i1(@Px int v) {
        this.N = v;
        this.invalidateSelf();
    }

    public void j1(@Px int v) {
        this.M = v;
        this.invalidateSelf();
    }

    public void k1(@Px int v) {
        this.L = v;
        this.invalidateSelf();
    }

    public void l1(@Nullable View view0) {
        if(view0 == null) {
            return;
        }
        this.s1(view0);
        view0.addOnLayoutChangeListener(this.I);
    }

    public void m1(@FloatRange(from = 0.0, to = 1.0) float f) {
        this.M8 = 1.2f;
        this.X = f;
        this.Y = f;
        this.N8 = com.google.android.material.animation.b.b(0.0f, 1.0f, 0.19f, 1.0f, f);
        this.invalidateSelf();
    }

    public void n1(@Nullable CharSequence charSequence0) {
        if(!TextUtils.equals(this.E, charSequence0)) {
            this.E = charSequence0;
            this.H.n(true);
            this.invalidateSelf();
        }
    }

    public void o1(@Nullable e e0) {
        this.H.l(e0, this.F);
    }

    @Override  // com.google.android.material.shape.k
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        if(this.O) {
            this.setShapeAppearanceModel(this.getShapeAppearanceModel().v().t(this.X0()).m());
        }
    }

    @Override  // com.google.android.material.shape.k, com.google.android.material.internal.A$b
    public boolean onStateChange(int[] arr_v) {
        return super.onStateChange(arr_v);
    }

    public void p1(@StyleRes int v) {
        this.o1(new e(this.F, v));
    }

    public void q1(@Px int v) {
        this.K = v;
        this.invalidateSelf();
    }

    public void r1(@StringRes int v) {
        this.n1(this.F.getResources().getString(v));
    }

    // 检测为 Lambda 实现
    private void s1(@NonNull View view0) [...]
}

