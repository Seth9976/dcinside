package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.text.BidiFormatter;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.i;
import com.google.android.material.color.v;
import com.google.android.material.drawable.f;
import com.google.android.material.internal.A;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import com.google.android.material.resources.d;
import com.google.android.material.resources.e;
import com.google.android.material.shape.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class b extends k implements Drawable.Callback, TintAwareDrawable, com.google.android.material.internal.A.b {
    public interface a {
        void b();
    }

    @Nullable
    private ColorStateList A9;
    @NonNull
    private WeakReference B9;
    private TextUtils.TruncateAt C9;
    private boolean D9;
    @Nullable
    private ColorStateList E;
    private int E9;
    @Nullable
    private ColorStateList F;
    private boolean F9;
    private float G;
    private static final boolean G9 = false;
    private float H;
    private static final int[] H9 = null;
    @Nullable
    private ColorStateList I;
    private static final String I9 = "http://schemas.android.com/apk/res-auto";
    private float J;
    private static final int J9 = 24;
    @Nullable
    private ColorStateList K;
    private static final ShapeDrawable K9;
    @Nullable
    private CharSequence L;
    private boolean M;
    @Nullable
    private ColorStateList M8;
    @Nullable
    private Drawable N;
    private float N8;
    @Nullable
    private ColorStateList O;
    @Nullable
    private CharSequence O8;
    private float P;
    private boolean P8;
    private boolean Q;
    private boolean Q8;
    @Nullable
    private Drawable R8;
    @Nullable
    private ColorStateList S8;
    @Nullable
    private i T8;
    @Nullable
    private i U8;
    private float V8;
    private float W8;
    private boolean X;
    private float X8;
    @Nullable
    private Drawable Y;
    private float Y8;
    @Nullable
    private Drawable Z;
    private float Z8;
    private float a9;
    private float b9;
    private float c9;
    @NonNull
    private final Context d9;
    private final Paint e9;
    @Nullable
    private final Paint f9;
    private final Paint.FontMetrics g9;
    private final RectF h9;
    private final PointF i9;
    private final Path j9;
    @NonNull
    private final A k9;
    @ColorInt
    private int l9;
    @ColorInt
    private int m9;
    @ColorInt
    private int n9;
    @ColorInt
    private int o9;
    @ColorInt
    private int p9;
    @ColorInt
    private int q9;
    private boolean r9;
    @ColorInt
    private int s9;
    private int t9;
    @Nullable
    private ColorFilter u9;
    @Nullable
    private PorterDuffColorFilter v9;
    @Nullable
    private ColorStateList w9;
    @Nullable
    private PorterDuff.Mode x9;
    private int[] y9;
    private boolean z9;

    static {
        b.H9 = new int[]{0x101009E};
        b.K9 = new ShapeDrawable(new OvalShape());
    }

    private b(@NonNull Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(context0, attributeSet0, v, v1);
        this.H = -1.0f;
        this.e9 = new Paint(1);
        this.g9 = new Paint.FontMetrics();
        this.h9 = new RectF();
        this.i9 = new PointF();
        this.j9 = new Path();
        this.t9 = 0xFF;
        this.x9 = PorterDuff.Mode.SRC_IN;
        this.B9 = new WeakReference(null);
        this.a0(context0);
        this.d9 = context0;
        A a0 = new A(this);
        this.k9 = a0;
        this.L = "";
        a0.g().density = context0.getResources().getDisplayMetrics().density;
        this.f9 = null;
        this.setState(b.H9);
        this.g3(b.H9);
        this.D9 = true;
        if(com.google.android.material.ripple.b.a) {
            b.K9.setTint(-1);
        }
    }

    @Nullable
    public CharSequence A1() {
        return this.O8;
    }

    public void A2(float f) {
        if(this.c9 != f) {
            this.c9 = f;
            this.invalidateSelf();
            this.k2();
        }
    }

    public void A3(@Nullable e e0) {
        this.k9.l(e0, this.d9);
    }

    public float B1() {
        return this.b9;
    }

    public void B2(@DimenRes int v) {
        this.A2(this.d9.getResources().getDimension(v));
    }

    public void B3(@StyleRes int v) {
        this.A3(new e(this.d9, v));
    }

    public float C1() {
        return this.N8;
    }

    public void C2(@Nullable Drawable drawable0) {
        Drawable drawable1 = this.r1();
        if(drawable1 != drawable0) {
            float f = this.S0();
            this.N = drawable0 == null ? null : DrawableCompat.r(drawable0).mutate();
            float f1 = this.S0();
            this.P3(drawable1);
            if(this.N3()) {
                this.Q0(this.N);
            }
            this.invalidateSelf();
            if(f != f1) {
                this.k2();
            }
        }
    }

    public void C3(@ColorInt int v) {
        this.D3(ColorStateList.valueOf(v));
    }

    public float D1() {
        return this.a9;
    }

    @Deprecated
    public void D2(boolean z) {
        this.L2(z);
    }

    public void D3(@Nullable ColorStateList colorStateList0) {
        e e0 = this.R1();
        if(e0 != null) {
            e0.k(colorStateList0);
            this.invalidateSelf();
        }
    }

    @NonNull
    public int[] E1() {
        return this.y9;
    }

    @Deprecated
    public void E2(@BoolRes int v) {
        this.K2(v);
    }

    public void E3(float f) {
        if(this.Z8 != f) {
            this.Z8 = f;
            this.invalidateSelf();
            this.k2();
        }
    }

    @Nullable
    public ColorStateList F1() {
        return this.M8;
    }

    public void F2(@DrawableRes int v) {
        this.C2(AppCompatResources.b(this.d9, v));
    }

    public void F3(@DimenRes int v) {
        this.E3(this.d9.getResources().getDimension(v));
    }

    public void G1(@NonNull RectF rectF0) {
        this.V0(this.getBounds(), rectF0);
    }

    public void G2(float f) {
        if(this.P != f) {
            float f1 = this.S0();
            this.P = f;
            float f2 = this.S0();
            this.invalidateSelf();
            if(f1 != f2) {
                this.k2();
            }
        }
    }

    public void G3(@StringRes int v) {
        this.z3(this.d9.getResources().getString(v));
    }

    private float H1() {
        Drawable drawable0 = this.r9 ? this.R8 : this.N;
        float f = this.P;
        if(f <= 0.0f && drawable0 != null) {
            f = (float)Math.ceil(M.i(this.d9, 24));
            return ((float)drawable0.getIntrinsicHeight()) <= f ? ((float)drawable0.getIntrinsicHeight()) : f;
        }
        return f;
    }

    public void H2(@DimenRes int v) {
        this.G2(this.d9.getResources().getDimension(v));
    }

    public void H3(@Dimension float f) {
        e e0 = this.R1();
        if(e0 != null) {
            e0.l(f);
            this.k9.g().setTextSize(f);
            this.a();
        }
    }

    private float I1() {
        Drawable drawable0 = this.r9 ? this.R8 : this.N;
        return this.P > 0.0f || drawable0 == null ? this.P : ((float)drawable0.getIntrinsicWidth());
    }

    public void I2(@Nullable ColorStateList colorStateList0) {
        this.Q = true;
        if(this.O != colorStateList0) {
            this.O = colorStateList0;
            if(this.N3()) {
                DrawableCompat.o(this.N, colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    public void I3(float f) {
        if(this.Y8 != f) {
            this.Y8 = f;
            this.invalidateSelf();
            this.k2();
        }
    }

    public TextUtils.TruncateAt J1() {
        return this.C9;
    }

    public void J2(@ColorRes int v) {
        this.I2(AppCompatResources.a(this.d9, v));
    }

    public void J3(@DimenRes int v) {
        this.I3(this.d9.getResources().getDimension(v));
    }

    @Nullable
    public i K1() {
        return this.U8;
    }

    public void K2(@BoolRes int v) {
        this.L2(this.d9.getResources().getBoolean(v));
    }

    public void K3(boolean z) {
        if(this.z9 != z) {
            this.z9 = z;
            this.Q3();
            this.onStateChange(this.getState());
        }
    }

    public float L1() {
        return this.X8;
    }

    public void L2(boolean z) {
        if(this.M != z) {
            boolean z1 = this.N3();
            this.M = z;
            boolean z2 = this.N3();
            if(z1 != z2) {
                if(z2) {
                    this.Q0(this.N);
                }
                else {
                    this.P3(this.N);
                }
                this.invalidateSelf();
                this.k2();
            }
        }
    }

    boolean L3() {
        return this.D9;
    }

    public float M1() {
        return this.W8;
    }

    public void M2(float f) {
        if(this.G != f) {
            this.G = f;
            this.invalidateSelf();
            this.k2();
        }
    }

    // 去混淆评级： 低(20)
    private boolean M3() {
        return this.Q8 && this.R8 != null && this.r9;
    }

    @Px
    public int N1() {
        return this.E9;
    }

    public void N2(@DimenRes int v) {
        this.M2(this.d9.getResources().getDimension(v));
    }

    private boolean N3() {
        return this.M && this.N != null;
    }

    @Nullable
    public ColorStateList O1() {
        return this.K;
    }

    public void O2(float f) {
        if(this.V8 != f) {
            this.V8 = f;
            this.invalidateSelf();
            this.k2();
        }
    }

    private boolean O3() {
        return this.X && this.Y != null;
    }

    @Nullable
    public i P1() {
        return this.T8;
    }

    public void P2(@DimenRes int v) {
        this.O2(this.d9.getResources().getDimension(v));
    }

    private void P3(@Nullable Drawable drawable0) {
        if(drawable0 != null) {
            drawable0.setCallback(null);
        }
    }

    private void Q0(@Nullable Drawable drawable0) {
        if(drawable0 == null) {
            return;
        }
        drawable0.setCallback(this);
        DrawableCompat.m(drawable0, DrawableCompat.f(this));
        drawable0.setLevel(this.getLevel());
        drawable0.setVisible(this.isVisible(), false);
        if(drawable0 == this.Y) {
            if(drawable0.isStateful()) {
                drawable0.setState(this.E1());
            }
            DrawableCompat.o(drawable0, this.M8);
            return;
        }
        Drawable drawable1 = this.N;
        if(drawable0 == drawable1 && this.Q) {
            DrawableCompat.o(drawable1, this.O);
        }
        if(drawable0.isStateful()) {
            drawable0.setState(this.getState());
        }
    }

    @Nullable
    public CharSequence Q1() {
        return this.L;
    }

    public void Q2(@Nullable ColorStateList colorStateList0) {
        if(this.I != colorStateList0) {
            this.I = colorStateList0;
            if(this.F9) {
                this.G0(colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    private void Q3() {
        this.A9 = this.z9 ? com.google.android.material.ripple.b.e(this.K) : null;
    }

    private void R0(@NonNull Rect rect0, @NonNull RectF rectF0) {
        rectF0.setEmpty();
        if(this.N3() || this.M3()) {
            float f = this.V8 + this.W8;
            float f1 = this.I1();
            if(DrawableCompat.f(this) == 0) {
                float f2 = ((float)rect0.left) + f;
                rectF0.left = f2;
                rectF0.right = f2 + f1;
            }
            else {
                float f3 = ((float)rect0.right) - f;
                rectF0.right = f3;
                rectF0.left = f3 - f1;
            }
            float f4 = this.H1();
            float f5 = rect0.exactCenterY() - f4 / 2.0f;
            rectF0.top = f5;
            rectF0.bottom = f5 + f4;
        }
    }

    @Nullable
    public e R1() {
        return this.k9.e();
    }

    public void R2(@ColorRes int v) {
        this.Q2(AppCompatResources.a(this.d9, v));
    }

    @TargetApi(21)
    private void R3() {
        this.Z = new RippleDrawable(com.google.android.material.ripple.b.e(this.O1()), this.Y, b.K9);
    }

    // 去混淆评级： 低(20)
    float S0() {
        return this.N3() || this.M3() ? this.W8 + this.I1() + this.X8 : 0.0f;
    }

    public float S1() {
        return this.Z8;
    }

    public void S2(float f) {
        if(this.J != f) {
            this.J = f;
            this.e9.setStrokeWidth(f);
            if(this.F9) {
                super.J0(f);
            }
            this.invalidateSelf();
        }
    }

    private void T0(@NonNull Rect rect0, @NonNull RectF rectF0) {
        rectF0.set(rect0);
        if(this.O3()) {
            float f = this.c9 + this.b9 + this.N8 + this.a9 + this.Z8;
            if(DrawableCompat.f(this) == 0) {
                rectF0.right = ((float)rect0.right) - f;
                return;
            }
            rectF0.left = ((float)rect0.left) + f;
        }
    }

    public float T1() {
        return this.Y8;
    }

    public void T2(@DimenRes int v) {
        this.S2(this.d9.getResources().getDimension(v));
    }

    private void U0(@NonNull Rect rect0, @NonNull RectF rectF0) {
        rectF0.setEmpty();
        if(this.O3()) {
            float f = this.c9 + this.b9;
            if(DrawableCompat.f(this) == 0) {
                float f1 = ((float)rect0.right) - f;
                rectF0.right = f1;
                rectF0.left = f1 - this.N8;
            }
            else {
                float f2 = ((float)rect0.left) + f;
                rectF0.left = f2;
                rectF0.right = f2 + this.N8;
            }
            float f3 = rect0.exactCenterY() - this.N8 / 2.0f;
            rectF0.top = f3;
            rectF0.bottom = f3 + this.N8;
        }
    }

    @Nullable
    private ColorFilter U1() {
        ColorFilter colorFilter0 = this.u9;
        return colorFilter0 == null ? this.v9 : colorFilter0;
    }

    private void U2(@Nullable ColorStateList colorStateList0) {
        if(this.E != colorStateList0) {
            this.E = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    private void V0(@NonNull Rect rect0, @NonNull RectF rectF0) {
        rectF0.setEmpty();
        if(this.O3()) {
            float f = this.c9 + this.b9 + this.N8 + this.a9 + this.Z8;
            if(DrawableCompat.f(this) == 0) {
                float f1 = (float)rect0.right;
                rectF0.right = f1;
                rectF0.left = f1 - f;
            }
            else {
                int v = rect0.left;
                rectF0.left = (float)v;
                rectF0.right = ((float)v) + f;
            }
            rectF0.top = (float)rect0.top;
            rectF0.bottom = (float)rect0.bottom;
        }
    }

    public boolean V1() {
        return this.z9;
    }

    public void V2(@Nullable Drawable drawable0) {
        Drawable drawable1 = this.z1();
        if(drawable1 != drawable0) {
            float f = this.W0();
            this.Y = drawable0 == null ? null : DrawableCompat.r(drawable0).mutate();
            if(com.google.android.material.ripple.b.a) {
                this.R3();
            }
            float f1 = this.W0();
            this.P3(drawable1);
            if(this.O3()) {
                this.Q0(this.Y);
            }
            this.invalidateSelf();
            if(f != f1) {
                this.k2();
            }
        }
    }

    // 去混淆评级： 低(20)
    float W0() {
        return this.O3() ? this.a9 + this.N8 + this.b9 : 0.0f;
    }

    private static boolean W1(@Nullable int[] arr_v, @AttrRes int v) {
        if(arr_v == null) {
            return false;
        }
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    public void W2(@Nullable CharSequence charSequence0) {
        if(this.O8 != charSequence0) {
            this.O8 = BidiFormatter.c().m(charSequence0);
            this.invalidateSelf();
        }
    }

    private void X0(@NonNull Rect rect0, @NonNull RectF rectF0) {
        rectF0.setEmpty();
        if(this.L != null) {
            float f = this.V8 + this.S0() + this.Y8;
            float f1 = this.c9 + this.W0() + this.Z8;
            if(DrawableCompat.f(this) == 0) {
                rectF0.left = ((float)rect0.left) + f;
                rectF0.right = ((float)rect0.right) - f1;
            }
            else {
                rectF0.left = ((float)rect0.left) + f1;
                rectF0.right = ((float)rect0.right) - f;
            }
            rectF0.top = (float)rect0.top;
            rectF0.bottom = (float)rect0.bottom;
        }
    }

    public boolean X1() {
        return this.P8;
    }

    @Deprecated
    public void X2(boolean z) {
        this.k3(z);
    }

    private float Y0() {
        this.k9.g().getFontMetrics(this.g9);
        return (this.g9.descent + this.g9.ascent) / 2.0f;
    }

    @Deprecated
    public boolean Y1() {
        return this.Z1();
    }

    @Deprecated
    public void Y2(@BoolRes int v) {
        this.j3(v);
    }

    @NonNull
    Paint.Align Z0(@NonNull Rect rect0, @NonNull PointF pointF0) {
        pointF0.set(0.0f, 0.0f);
        Paint.Align paint$Align0 = Paint.Align.LEFT;
        if(this.L != null) {
            float f = this.V8 + this.S0() + this.Y8;
            if(DrawableCompat.f(this) == 0) {
                pointF0.x = ((float)rect0.left) + f;
            }
            else {
                pointF0.x = ((float)rect0.right) - f;
                paint$Align0 = Paint.Align.RIGHT;
            }
            pointF0.y = ((float)rect0.centerY()) - this.Y0();
        }
        return paint$Align0;
    }

    public boolean Z1() {
        return this.Q8;
    }

    public void Z2(float f) {
        if(this.b9 != f) {
            this.b9 = f;
            this.invalidateSelf();
            if(this.O3()) {
                this.k2();
            }
        }
    }

    @Override  // com.google.android.material.internal.A$b
    public void a() {
        this.k2();
        this.invalidateSelf();
    }

    // 去混淆评级： 低(20)
    private boolean a1() {
        return this.Q8 && this.R8 != null && this.P8;
    }

    @Deprecated
    public boolean a2() {
        return this.b2();
    }

    public void a3(@DimenRes int v) {
        this.Z2(this.d9.getResources().getDimension(v));
    }

    @NonNull
    public static b b1(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        b b0 = new b(context0, attributeSet0, v, v1);
        b0.j2(attributeSet0, v, v1);
        return b0;
    }

    public boolean b2() {
        return this.M;
    }

    public void b3(@DrawableRes int v) {
        this.V2(AppCompatResources.b(this.d9, v));
    }

    @NonNull
    public static b c1(@NonNull Context context0, @XmlRes int v) {
        AttributeSet attributeSet0 = f.k(context0, v, "chip");
        int v1 = attributeSet0.getStyleAttribute();
        if(v1 == 0) {
            v1 = style.Widget_MaterialComponents_Chip_Entry;
        }
        return b.b1(context0, attributeSet0, attr.chipStandaloneStyle, v1);
    }

    @Deprecated
    public boolean c2() {
        return this.e2();
    }

    public void c3(float f) {
        if(this.N8 != f) {
            this.N8 = f;
            this.invalidateSelf();
            if(this.O3()) {
                this.k2();
            }
        }
    }

    private void d1(@NonNull Canvas canvas0, @NonNull Rect rect0) {
        if(this.M3()) {
            this.R0(rect0, this.h9);
            float f = this.h9.left;
            float f1 = this.h9.top;
            canvas0.translate(f, f1);
            this.R8.setBounds(0, 0, ((int)this.h9.width()), ((int)this.h9.height()));
            this.R8.draw(canvas0);
            canvas0.translate(-f, -f1);
        }
    }

    public boolean d2() {
        return b.h2(this.Y);
    }

    public void d3(@DimenRes int v) {
        this.c3(this.d9.getResources().getDimension(v));
    }

    @Override  // com.google.android.material.shape.k
    public void draw(@NonNull Canvas canvas0) {
        Rect rect0 = this.getBounds();
        if(!rect0.isEmpty() && this.getAlpha() != 0) {
            int v = this.t9 >= 0xFF ? 0 : D1.a.a(canvas0, ((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom), this.t9);
            this.h1(canvas0, rect0);
            this.e1(canvas0, rect0);
            if(this.F9) {
                super.draw(canvas0);
            }
            this.g1(canvas0, rect0);
            this.j1(canvas0, rect0);
            this.f1(canvas0, rect0);
            this.d1(canvas0, rect0);
            if(this.D9) {
                this.l1(canvas0, rect0);
            }
            this.i1(canvas0, rect0);
            this.k1(canvas0, rect0);
            if(this.t9 < 0xFF) {
                canvas0.restoreToCount(v);
            }
        }
    }

    private void e1(@NonNull Canvas canvas0, @NonNull Rect rect0) {
        if(!this.F9) {
            this.e9.setColor(this.m9);
            this.e9.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter0 = this.U1();
            this.e9.setColorFilter(colorFilter0);
            this.h9.set(rect0);
            float f = this.p1();
            float f1 = this.p1();
            canvas0.drawRoundRect(this.h9, f, f1, this.e9);
        }
    }

    public boolean e2() {
        return this.X;
    }

    public void e3(float f) {
        if(this.a9 != f) {
            this.a9 = f;
            this.invalidateSelf();
            if(this.O3()) {
                this.k2();
            }
        }
    }

    private void f1(@NonNull Canvas canvas0, @NonNull Rect rect0) {
        if(this.N3()) {
            this.R0(rect0, this.h9);
            float f = this.h9.left;
            float f1 = this.h9.top;
            canvas0.translate(f, f1);
            this.N.setBounds(0, 0, ((int)this.h9.width()), ((int)this.h9.height()));
            this.N.draw(canvas0);
            canvas0.translate(-f, -f1);
        }
    }

    boolean f2() {
        return this.F9;
    }

    public void f3(@DimenRes int v) {
        this.e3(this.d9.getResources().getDimension(v));
    }

    private void g1(@NonNull Canvas canvas0, @NonNull Rect rect0) {
        if(this.J > 0.0f && !this.F9) {
            this.e9.setColor(this.o9);
            this.e9.setStyle(Paint.Style.STROKE);
            if(!this.F9) {
                ColorFilter colorFilter0 = this.U1();
                this.e9.setColorFilter(colorFilter0);
            }
            this.h9.set(((float)rect0.left) + this.J / 2.0f, ((float)rect0.top) + this.J / 2.0f, ((float)rect0.right) - this.J / 2.0f, ((float)rect0.bottom) - this.J / 2.0f);
            float f = this.H - this.J / 2.0f;
            canvas0.drawRoundRect(this.h9, f, f, this.e9);
        }
    }

    private static boolean g2(@Nullable ColorStateList colorStateList0) {
        return colorStateList0 != null && colorStateList0.isStateful();
    }

    public boolean g3(@NonNull int[] arr_v) {
        if(!Arrays.equals(this.y9, arr_v)) {
            this.y9 = arr_v;
            return this.O3() ? this.l2(this.getState(), arr_v) : false;
        }
        return false;
    }

    @Override  // com.google.android.material.shape.k
    public int getAlpha() {
        return this.t9;
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.u9;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int)this.G;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.V8 + this.S0() + this.Y8 + this.k9.h(this.Q1().toString()) + this.Z8 + this.W0() + this.c9), this.E9);
    }

    @Override  // com.google.android.material.shape.k
    public int getOpacity() {
        return -3;
    }

    @Override  // com.google.android.material.shape.k
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline0) {
        if(this.F9) {
            super.getOutline(outline0);
            return;
        }
        Rect rect0 = this.getBounds();
        if(rect0.isEmpty()) {
            outline0.setRoundRect(0, 0, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.H);
        }
        else {
            outline0.setRoundRect(rect0, this.H);
        }
        outline0.setAlpha(((float)this.getAlpha()) / 255.0f);
    }

    private void h1(@NonNull Canvas canvas0, @NonNull Rect rect0) {
        if(!this.F9) {
            this.e9.setColor(this.l9);
            this.e9.setStyle(Paint.Style.FILL);
            this.h9.set(rect0);
            float f = this.p1();
            float f1 = this.p1();
            canvas0.drawRoundRect(this.h9, f, f1, this.e9);
        }
    }

    private static boolean h2(@Nullable Drawable drawable0) {
        return drawable0 != null && drawable0.isStateful();
    }

    public void h3(@Nullable ColorStateList colorStateList0) {
        if(this.M8 != colorStateList0) {
            this.M8 = colorStateList0;
            if(this.O3()) {
                DrawableCompat.o(this.Y, colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    private void i1(@NonNull Canvas canvas0, @NonNull Rect rect0) {
        if(this.O3()) {
            this.U0(rect0, this.h9);
            float f = this.h9.left;
            float f1 = this.h9.top;
            canvas0.translate(f, f1);
            this.Y.setBounds(0, 0, ((int)this.h9.width()), ((int)this.h9.height()));
            if(com.google.android.material.ripple.b.a) {
                this.Z.setBounds(this.Y.getBounds());
                this.Z.jumpToCurrentState();
                this.Z.draw(canvas0);
            }
            else {
                this.Y.draw(canvas0);
            }
            canvas0.translate(-f, -f1);
        }
    }

    private static boolean i2(@Nullable e e0) {
        return e0 != null && e0.i() != null && e0.i().isStateful();
    }

    public void i3(@ColorRes int v) {
        this.h3(AppCompatResources.a(this.d9, v));
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(@NonNull Drawable drawable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.invalidateDrawable(this);
        }
    }

    // 去混淆评级： 中等(100)
    @Override  // com.google.android.material.shape.k
    public boolean isStateful() {
        return b.g2(this.E) || b.g2(this.F) || b.g2(this.I) || this.z9 && b.g2(this.A9) || b.i2(this.k9.e()) || this.a1() || b.h2(this.N) || b.h2(this.R8) || b.g2(this.w9);
    }

    private void j1(@NonNull Canvas canvas0, @NonNull Rect rect0) {
        this.e9.setColor(this.p9);
        this.e9.setStyle(Paint.Style.FILL);
        this.h9.set(rect0);
        if(!this.F9) {
            float f = this.p1();
            float f1 = this.p1();
            canvas0.drawRoundRect(this.h9, f, f1, this.e9);
            return;
        }
        this.h(new RectF(rect0), this.j9);
        RectF rectF0 = this.w();
        super.r(canvas0, this.e9, this.j9, rectF0);
    }

    private void j2(@Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        TypedArray typedArray0 = D.k(this.d9, attributeSet0, styleable.Chip, v, v1, new int[0]);
        this.F9 = typedArray0.hasValue(styleable.Chip_shapeAppearance);
        this.U2(d.a(this.d9, typedArray0, styleable.Chip_chipSurfaceColor));
        this.w2(d.a(this.d9, typedArray0, styleable.Chip_chipBackgroundColor));
        this.M2(typedArray0.getDimension(styleable.Chip_chipMinHeight, 0.0f));
        if(typedArray0.hasValue(styleable.Chip_chipCornerRadius)) {
            this.y2(typedArray0.getDimension(12, 0.0f));
        }
        this.Q2(d.a(this.d9, typedArray0, styleable.Chip_chipStrokeColor));
        this.S2(typedArray0.getDimension(styleable.Chip_chipStrokeWidth, 0.0f));
        this.u3(d.a(this.d9, typedArray0, styleable.Chip_rippleColor));
        this.z3(typedArray0.getText(styleable.Chip_android_text));
        e e0 = d.h(this.d9, typedArray0, styleable.Chip_android_textAppearance);
        e0.l(typedArray0.getDimension(styleable.Chip_android_textSize, e0.j()));
        if(Build.VERSION.SDK_INT < 23) {
            e0.k(d.a(this.d9, typedArray0, styleable.Chip_android_textColor));
        }
        this.A3(e0);
        switch(typedArray0.getInt(styleable.Chip_android_ellipsize, 0)) {
            case 1: {
                this.m3(TextUtils.TruncateAt.START);
                break;
            }
            case 2: {
                this.m3(TextUtils.TruncateAt.MIDDLE);
                break;
            }
            case 3: {
                this.m3(TextUtils.TruncateAt.END);
            }
        }
        this.L2(typedArray0.getBoolean(styleable.Chip_chipIconVisible, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            this.L2(typedArray0.getBoolean(styleable.Chip_chipIconEnabled, false));
        }
        this.C2(d.e(this.d9, typedArray0, styleable.Chip_chipIcon));
        if(typedArray0.hasValue(styleable.Chip_chipIconTint)) {
            this.I2(d.a(this.d9, typedArray0, 17));
        }
        this.G2(typedArray0.getDimension(styleable.Chip_chipIconSize, -1.0f));
        this.k3(typedArray0.getBoolean(styleable.Chip_closeIconVisible, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            this.k3(typedArray0.getBoolean(styleable.Chip_closeIconEnabled, false));
        }
        this.V2(d.e(this.d9, typedArray0, styleable.Chip_closeIcon));
        this.h3(d.a(this.d9, typedArray0, styleable.Chip_closeIconTint));
        this.c3(typedArray0.getDimension(styleable.Chip_closeIconSize, 0.0f));
        this.m2(typedArray0.getBoolean(styleable.Chip_android_checkable, false));
        this.v2(typedArray0.getBoolean(styleable.Chip_checkedIconVisible, false));
        if(attributeSet0 != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet0.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            this.v2(typedArray0.getBoolean(styleable.Chip_checkedIconEnabled, false));
        }
        this.o2(d.e(this.d9, typedArray0, styleable.Chip_checkedIcon));
        if(typedArray0.hasValue(styleable.Chip_checkedIconTint)) {
            this.s2(d.a(this.d9, typedArray0, 9));
        }
        this.x3(i.c(this.d9, typedArray0, styleable.Chip_showMotionSpec));
        this.n3(i.c(this.d9, typedArray0, styleable.Chip_hideMotionSpec));
        this.O2(typedArray0.getDimension(styleable.Chip_chipStartPadding, 0.0f));
        this.r3(typedArray0.getDimension(styleable.Chip_iconStartPadding, 0.0f));
        this.p3(typedArray0.getDimension(styleable.Chip_iconEndPadding, 0.0f));
        this.I3(typedArray0.getDimension(styleable.Chip_textStartPadding, 0.0f));
        this.E3(typedArray0.getDimension(styleable.Chip_textEndPadding, 0.0f));
        this.e3(typedArray0.getDimension(styleable.Chip_closeIconStartPadding, 0.0f));
        this.Z2(typedArray0.getDimension(styleable.Chip_closeIconEndPadding, 0.0f));
        this.A2(typedArray0.getDimension(styleable.Chip_chipEndPadding, 0.0f));
        this.t3(typedArray0.getDimensionPixelSize(styleable.Chip_android_maxWidth, 0x7FFFFFFF));
        typedArray0.recycle();
    }

    public void j3(@BoolRes int v) {
        this.k3(this.d9.getResources().getBoolean(v));
    }

    private void k1(@NonNull Canvas canvas0, @NonNull Rect rect0) {
        Paint paint0 = this.f9;
        if(paint0 != null) {
            paint0.setColor(ColorUtils.D(0xFF000000, 0x7F));
            canvas0.drawRect(rect0, this.f9);
            if(this.N3() || this.M3()) {
                this.R0(rect0, this.h9);
                canvas0.drawRect(this.h9, this.f9);
            }
            if(this.L != null) {
                canvas0.drawLine(((float)rect0.left), rect0.exactCenterY(), ((float)rect0.right), rect0.exactCenterY(), this.f9);
            }
            if(this.O3()) {
                this.U0(rect0, this.h9);
                canvas0.drawRect(this.h9, this.f9);
            }
            int v = ColorUtils.D(0xFFFF0000, 0x7F);
            this.f9.setColor(v);
            this.T0(rect0, this.h9);
            canvas0.drawRect(this.h9, this.f9);
            int v1 = ColorUtils.D(0xFF00FF00, 0x7F);
            this.f9.setColor(v1);
            this.V0(rect0, this.h9);
            canvas0.drawRect(this.h9, this.f9);
        }
    }

    protected void k2() {
        a b$a0 = (a)this.B9.get();
        if(b$a0 != null) {
            b$a0.b();
        }
    }

    public void k3(boolean z) {
        if(this.X != z) {
            boolean z1 = this.O3();
            this.X = z;
            boolean z2 = this.O3();
            if(z1 != z2) {
                if(z2) {
                    this.Q0(this.Y);
                }
                else {
                    this.P3(this.Y);
                }
                this.invalidateSelf();
                this.k2();
            }
        }
    }

    private void l1(@NonNull Canvas canvas0, @NonNull Rect rect0) {
        if(this.L != null) {
            Paint.Align paint$Align0 = this.Z0(rect0, this.i9);
            this.X0(rect0, this.h9);
            if(this.k9.e() != null) {
                this.k9.g().drawableState = this.getState();
                this.k9.o(this.d9);
            }
            this.k9.g().setTextAlign(paint$Align0);
            int v = 0;
            boolean z = Math.round(this.k9.h(this.Q1().toString())) > Math.round(this.h9.width());
            if(z) {
                v = canvas0.save();
                canvas0.clipRect(this.h9);
            }
            CharSequence charSequence0 = this.L;
            if(z && this.C9 != null) {
                float f = this.h9.width();
                charSequence0 = TextUtils.ellipsize(charSequence0, this.k9.g(), f, this.C9);
            }
            canvas0.drawText(charSequence0, 0, charSequence0.length(), this.i9.x, this.i9.y, this.k9.g());
            if(z) {
                canvas0.restoreToCount(v);
            }
        }
    }

    private boolean l2(@NonNull int[] arr_v, @NonNull int[] arr_v1) {
        boolean z3;
        boolean z = super.onStateChange(arr_v);
        int v = this.l((this.E == null ? 0 : this.E.getColorForState(arr_v, this.l9)));
        boolean z1 = true;
        if(this.l9 != v) {
            this.l9 = v;
            z = true;
        }
        int v1 = this.l((this.F == null ? 0 : this.F.getColorForState(arr_v, this.m9)));
        if(this.m9 != v1) {
            this.m9 = v1;
            z = true;
        }
        int v2 = v.s(v, v1);
        if(((this.n9 == v2 ? 0 : 1) | (this.z() == null ? 1 : 0)) != 0) {
            this.n9 = v2;
            this.p0(ColorStateList.valueOf(v2));
            z = true;
        }
        int v3 = this.I == null ? 0 : this.I.getColorForState(arr_v, this.o9);
        if(this.o9 != v3) {
            this.o9 = v3;
            z = true;
        }
        int v4 = this.A9 == null || !com.google.android.material.ripple.b.f(arr_v) ? 0 : this.A9.getColorForState(arr_v, this.p9);
        if(this.p9 != v4) {
            this.p9 = v4;
            if(this.z9) {
                z = true;
            }
        }
        int v5 = this.k9.e() == null || this.k9.e().i() == null ? 0 : this.k9.e().i().getColorForState(arr_v, this.q9);
        if(this.q9 != v5) {
            this.q9 = v5;
            z = true;
        }
        boolean z2 = b.W1(this.getState(), 0x10100A0) && this.P8;
        if(this.r9 == z2 || this.R8 == null) {
            z3 = false;
        }
        else {
            float f = this.S0();
            this.r9 = z2;
            if(f == this.S0()) {
                z = true;
                z3 = false;
            }
            else {
                z = true;
                z3 = true;
            }
        }
        int v6 = this.w9 == null ? 0 : this.w9.getColorForState(arr_v, this.s9);
        if(this.s9 == v6) {
            z1 = z;
        }
        else {
            this.s9 = v6;
            this.v9 = f.o(this, this.w9, this.x9);
        }
        if(b.h2(this.N)) {
            z1 |= this.N.setState(arr_v);
        }
        if(b.h2(this.R8)) {
            z1 |= this.R8.setState(arr_v);
        }
        if(b.h2(this.Y)) {
            int[] arr_v2 = new int[arr_v.length + arr_v1.length];
            System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
            System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
            z1 |= this.Y.setState(arr_v2);
        }
        if(com.google.android.material.ripple.b.a && b.h2(this.Z)) {
            z1 |= this.Z.setState(arr_v1);
        }
        if(z1) {
            this.invalidateSelf();
        }
        if(z3) {
            this.k2();
        }
        return z1;
    }

    public void l3(@Nullable a b$a0) {
        this.B9 = new WeakReference(b$a0);
    }

    @Nullable
    public Drawable m1() {
        return this.R8;
    }

    public void m2(boolean z) {
        if(this.P8 != z) {
            this.P8 = z;
            float f = this.S0();
            if(!z && this.r9) {
                this.r9 = false;
            }
            float f1 = this.S0();
            this.invalidateSelf();
            if(f != f1) {
                this.k2();
            }
        }
    }

    public void m3(@Nullable TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.C9 = textUtils$TruncateAt0;
    }

    @Nullable
    public ColorStateList n1() {
        return this.S8;
    }

    public void n2(@BoolRes int v) {
        this.m2(this.d9.getResources().getBoolean(v));
    }

    public void n3(@Nullable i i0) {
        this.U8 = i0;
    }

    @Nullable
    public ColorStateList o1() {
        return this.F;
    }

    public void o2(@Nullable Drawable drawable0) {
        if(this.R8 != drawable0) {
            float f = this.S0();
            this.R8 = drawable0;
            float f1 = this.S0();
            this.P3(this.R8);
            this.Q0(this.R8);
            this.invalidateSelf();
            if(f != f1) {
                this.k2();
            }
        }
    }

    public void o3(@AnimatorRes int v) {
        this.n3(i.d(this.d9, v));
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int v) {
        boolean z = super.onLayoutDirectionChanged(v);
        if(this.N3()) {
            z |= DrawableCompat.m(this.N, v);
        }
        if(this.M3()) {
            z |= DrawableCompat.m(this.R8, v);
        }
        if(this.O3()) {
            z |= DrawableCompat.m(this.Y, v);
        }
        if(z) {
            this.invalidateSelf();
        }
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        boolean z = super.onLevelChange(v);
        if(this.N3()) {
            z |= this.N.setLevel(v);
        }
        if(this.M3()) {
            z |= this.R8.setLevel(v);
        }
        if(this.O3()) {
            z |= this.Y.setLevel(v);
        }
        if(z) {
            this.invalidateSelf();
        }
        return z;
    }

    @Override  // com.google.android.material.shape.k, com.google.android.material.internal.A$b
    public boolean onStateChange(@NonNull int[] arr_v) {
        if(this.F9) {
            super.onStateChange(arr_v);
        }
        return this.l2(arr_v, this.E1());
    }

    // 去混淆评级： 低(20)
    public float p1() {
        return this.F9 ? this.T() : this.H;
    }

    @Deprecated
    public void p2(boolean z) {
        this.v2(z);
    }

    public void p3(float f) {
        if(this.X8 != f) {
            float f1 = this.S0();
            this.X8 = f;
            float f2 = this.S0();
            this.invalidateSelf();
            if(f1 != f2) {
                this.k2();
            }
        }
    }

    public float q1() {
        return this.c9;
    }

    @Deprecated
    public void q2(@BoolRes int v) {
        this.v2(this.d9.getResources().getBoolean(v));
    }

    public void q3(@DimenRes int v) {
        this.p3(this.d9.getResources().getDimension(v));
    }

    @Nullable
    public Drawable r1() {
        return this.N == null ? null : DrawableCompat.q(this.N);
    }

    public void r2(@DrawableRes int v) {
        this.o2(AppCompatResources.b(this.d9, v));
    }

    public void r3(float f) {
        if(this.W8 != f) {
            float f1 = this.S0();
            this.W8 = f;
            float f2 = this.S0();
            this.invalidateSelf();
            if(f1 != f2) {
                this.k2();
            }
        }
    }

    public float s1() {
        return this.P;
    }

    public void s2(@Nullable ColorStateList colorStateList0) {
        if(this.S8 != colorStateList0) {
            this.S8 = colorStateList0;
            if(this.a1()) {
                DrawableCompat.o(this.R8, colorStateList0);
            }
            this.onStateChange(this.getState());
        }
    }

    public void s3(@DimenRes int v) {
        this.r3(this.d9.getResources().getDimension(v));
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0, long v) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // com.google.android.material.shape.k
    public void setAlpha(int v) {
        if(this.t9 != v) {
            this.t9 = v;
            this.invalidateSelf();
        }
    }

    @Override  // com.google.android.material.shape.k
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        if(this.u9 != colorFilter0) {
            this.u9 = colorFilter0;
            this.invalidateSelf();
        }
    }

    @Override  // com.google.android.material.shape.k, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList0) {
        if(this.w9 != colorStateList0) {
            this.w9 = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    @Override  // com.google.android.material.shape.k, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        if(this.x9 != porterDuff$Mode0) {
            this.x9 = porterDuff$Mode0;
            this.v9 = f.o(this, this.w9, porterDuff$Mode0);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        if(this.N3()) {
            z2 |= this.N.setVisible(z, z1);
        }
        if(this.M3()) {
            z2 |= this.R8.setVisible(z, z1);
        }
        if(this.O3()) {
            z2 |= this.Y.setVisible(z, z1);
        }
        if(z2) {
            this.invalidateSelf();
        }
        return z2;
    }

    @Nullable
    public ColorStateList t1() {
        return this.O;
    }

    public void t2(@ColorRes int v) {
        this.s2(AppCompatResources.a(this.d9, v));
    }

    public void t3(@Px int v) {
        this.E9 = v;
    }

    public float u1() {
        return this.G;
    }

    public void u2(@BoolRes int v) {
        this.v2(this.d9.getResources().getBoolean(v));
    }

    public void u3(@Nullable ColorStateList colorStateList0) {
        if(this.K != colorStateList0) {
            this.K = colorStateList0;
            this.Q3();
            this.onStateChange(this.getState());
        }
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(@NonNull Drawable drawable0, @NonNull Runnable runnable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.unscheduleDrawable(this, runnable0);
        }
    }

    public float v1() {
        return this.V8;
    }

    public void v2(boolean z) {
        if(this.Q8 != z) {
            boolean z1 = this.M3();
            this.Q8 = z;
            boolean z2 = this.M3();
            if(z1 != z2) {
                if(z2) {
                    this.Q0(this.R8);
                }
                else {
                    this.P3(this.R8);
                }
                this.invalidateSelf();
                this.k2();
            }
        }
    }

    public void v3(@ColorRes int v) {
        this.u3(AppCompatResources.a(this.d9, v));
    }

    @Nullable
    public ColorStateList w1() {
        return this.I;
    }

    public void w2(@Nullable ColorStateList colorStateList0) {
        if(this.F != colorStateList0) {
            this.F = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    void w3(boolean z) {
        this.D9 = z;
    }

    public float x1() {
        return this.J;
    }

    public void x2(@ColorRes int v) {
        this.w2(AppCompatResources.a(this.d9, v));
    }

    public void x3(@Nullable i i0) {
        this.T8 = i0;
    }

    public void y1(@NonNull RectF rectF0) {
        this.T0(this.getBounds(), rectF0);
    }

    @Deprecated
    public void y2(float f) {
        if(this.H != f) {
            this.H = f;
            this.setShapeAppearanceModel(this.getShapeAppearanceModel().w(f));
        }
    }

    public void y3(@AnimatorRes int v) {
        this.x3(i.d(this.d9, v));
    }

    @Nullable
    public Drawable z1() {
        return this.Y == null ? null : DrawableCompat.q(this.Y);
    }

    @Deprecated
    public void z2(@DimenRes int v) {
        this.y2(this.d9.getResources().getDimension(v));
    }

    public void z3(@Nullable CharSequence charSequence0) {
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        if(!TextUtils.equals(this.L, charSequence0)) {
            this.L = charSequence0;
            this.k9.n(true);
            this.invalidateSelf();
            this.k2();
        }
    }
}

