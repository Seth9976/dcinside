package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.color.v;
import com.google.android.material.resources.a;
import com.google.android.material.resources.e;
import com.google.android.material.resources.i;

@RestrictTo({Scope.b})
public final class b {
    private Typeface A;
    private Typeface B;
    private Typeface C;
    private a D;
    private a E;
    private TextUtils.TruncateAt F;
    @Nullable
    private CharSequence G;
    @Nullable
    private CharSequence H;
    private boolean I;
    private boolean J;
    private boolean K;
    @Nullable
    private Bitmap L;
    private Paint M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private int S;
    private int[] T;
    private boolean U;
    @NonNull
    private final TextPaint V;
    @NonNull
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;
    private final View a;
    private float a0;
    private float b;
    private float b0;
    private boolean c;
    private ColorStateList c0;
    private float d;
    private float d0;
    private float e;
    private float e0;
    private int f;
    private float f0;
    @NonNull
    private final Rect g;
    private ColorStateList g0;
    @NonNull
    private final Rect h;
    private float h0;
    @NonNull
    private final RectF i;
    private float i0;
    private int j;
    private float j0;
    private int k;
    private StaticLayout k0;
    private float l;
    private float l0;
    private float m;
    private float m0;
    private ColorStateList n;
    private float n0;
    private ColorStateList o;
    private CharSequence o0;
    private int p;
    private int p0;
    private float q;
    private float q0;
    private float r;
    private float r0;
    private float s;
    private int s0;
    private float t;
    @Nullable
    private z t0;
    private float u;
    private static final boolean u0 = false;
    private float v;
    private static final String v0 = "CollapsingTextHelper";
    private Typeface w;
    private static final String w0 = "…";
    private Typeface x;
    private static final float x0 = 0.5f;
    private Typeface y;
    private static final boolean y0 = false;
    private Typeface z;
    @NonNull
    private static final Paint z0;

    static {
        b.u0 = false;
        b.z0 = null;
    }

    public b(View view0) {
        this.j = 16;
        this.k = 16;
        this.l = 15.0f;
        this.m = 15.0f;
        this.F = TextUtils.TruncateAt.END;
        this.J = true;
        this.p0 = 1;
        this.q0 = 0.0f;
        this.r0 = 1.0f;
        this.s0 = y.o;
        this.a = view0;
        TextPaint textPaint0 = new TextPaint(0x81);
        this.V = textPaint0;
        this.W = new TextPaint(textPaint0);
        this.h = new Rect();
        this.g = new Rect();
        this.i = new RectF();
        this.e = this.e();
        this.a0(view0.getContext().getResources().getConfiguration());
    }

    public ColorStateList A() {
        return this.n;
    }

    public void A0(float f) {
        float f1 = MathUtils.d(f, 0.0f, 1.0f);
        if(f1 != this.b) {
            this.b = f1;
            this.c();
        }
    }

    public float B() {
        this.R(this.W);
        return -this.W.ascent() + this.W.descent();
    }

    public void B0(boolean z) {
        this.c = z;
    }

    public int C() {
        return this.j;
    }

    public void C0(float f) {
        this.d = f;
        this.e = this.e();
    }

    public float D() {
        this.R(this.W);
        return -this.W.ascent();
    }

    @RequiresApi(23)
    public void D0(int v) {
        this.s0 = v;
    }

    public float E() {
        return this.l;
    }

    private void E0(float f) {
        this.h(f);
        boolean z = b.u0 && this.N != 1.0f;
        this.K = z;
        if(z) {
            this.n();
        }
        ViewCompat.v1(this.a);
    }

    public Typeface F() {
        return this.z == null ? Typeface.DEFAULT : this.z;
    }

    @RequiresApi(23)
    public void F0(float f) {
        this.q0 = f;
    }

    public float G() {
        return this.b;
    }

    @RequiresApi(23)
    public void G0(@FloatRange(from = 0.0) float f) {
        this.r0 = f;
    }

    public float H() {
        return this.e;
    }

    public void H0(int v) {
        if(v != this.p0) {
            this.p0 = v;
            this.j();
            this.c0();
        }
    }

    @RequiresApi(23)
    public int I() {
        return this.s0;
    }

    public void I0(TimeInterpolator timeInterpolator0) {
        this.X = timeInterpolator0;
        this.c0();
    }

    public int J() {
        return this.k0 == null ? 0 : this.k0.getLineCount();
    }

    public void J0(boolean z) {
        this.J = z;
    }

    @RequiresApi(23)
    public float K() {
        return this.k0.getSpacingAdd();
    }

    public final boolean K0(int[] arr_v) {
        this.T = arr_v;
        if(this.X()) {
            this.c0();
            return true;
        }
        return false;
    }

    @RequiresApi(23)
    public float L() {
        return this.k0.getSpacingMultiplier();
    }

    @RequiresApi(23)
    public void L0(@Nullable z z0) {
        if(this.t0 != z0) {
            this.t0 = z0;
            this.d0(true);
        }
    }

    public int M() {
        return this.p0;
    }

    public void M0(@Nullable CharSequence charSequence0) {
        if(charSequence0 == null || !TextUtils.equals(this.G, charSequence0)) {
            this.G = charSequence0;
            this.H = null;
            this.j();
            this.c0();
        }
    }

    private Layout.Alignment N() {
        switch(GravityCompat.d(this.j, ((int)this.I)) & 7) {
            case 1: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 5: {
                return this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
            }
            default: {
                return this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }

    public void N0(TimeInterpolator timeInterpolator0) {
        this.Y = timeInterpolator0;
        this.c0();
    }

    @Nullable
    public TimeInterpolator O() {
        return this.X;
    }

    public void O0(@NonNull TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.F = textUtils$TruncateAt0;
        this.c0();
    }

    @Nullable
    public CharSequence P() {
        return this.G;
    }

    public void P0(Typeface typeface0) {
        if(this.o0(typeface0) || this.z0(typeface0)) {
            this.c0();
        }
    }

    private void Q(@NonNull TextPaint textPaint0) {
        textPaint0.setTextSize(this.m);
        textPaint0.setTypeface(this.w);
        textPaint0.setLetterSpacing(this.h0);
    }

    // 去混淆评级： 低(30)
    private boolean Q0() {
        return this.p0 > 1 && (!this.I || this.c) && !this.K;
    }

    private void R(@NonNull TextPaint textPaint0) {
        textPaint0.setTextSize(this.l);
        textPaint0.setTypeface(this.z);
        textPaint0.setLetterSpacing(this.i0);
    }

    @NonNull
    public TextUtils.TruncateAt S() {
        return this.F;
    }

    private void T(float f) {
        if(this.c) {
            this.i.set((f < this.e ? this.g : this.h));
            return;
        }
        this.i.left = b.Z(this.g.left, this.h.left, f, this.X);
        this.i.top = b.Z(this.q, this.r, f, this.X);
        this.i.right = b.Z(this.g.right, this.h.right, f, this.X);
        this.i.bottom = b.Z(this.g.bottom, this.h.bottom, f, this.X);
    }

    private static boolean U(float f, float f1) {
        return Math.abs(f - f1) < 0.00001f;
    }

    private boolean V() {
        return ViewCompat.e0(this.a) == 1;
    }

    public boolean W() {
        return this.J;
    }

    // 去混淆评级： 低(30)
    public final boolean X() {
        return this.o != null && this.o.isStateful() || this.n != null && this.n.isStateful();
    }

    // 去混淆评级： 低(20)
    private boolean Y(@NonNull CharSequence charSequence0, boolean z) {
        return z ? TextDirectionHeuristicsCompat.d.a(charSequence0, 0, charSequence0.length()) : TextDirectionHeuristicsCompat.c.a(charSequence0, 0, charSequence0.length());
    }

    private static float Z(float f, float f1, float f2, @Nullable TimeInterpolator timeInterpolator0) {
        if(timeInterpolator0 != null) {
            f2 = timeInterpolator0.getInterpolation(f2);
        }
        return f + f2 * (f1 - f);
    }

    @ColorInt
    private static int a(@ColorInt int v, @ColorInt int v1, @FloatRange(from = 0.0, to = 1.0) float f) {
        return Color.argb(Math.round(((float)Color.alpha(v)) * (1.0f - f) + ((float)Color.alpha(v1)) * f), Math.round(((float)Color.red(v)) * (1.0f - f) + ((float)Color.red(v1)) * f), Math.round(((float)Color.green(v)) * (1.0f - f) + ((float)Color.green(v1)) * f), Math.round(((float)Color.blue(v)) * (1.0f - f) + ((float)Color.blue(v1)) * f));
    }

    public void a0(@NonNull Configuration configuration0) {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            Typeface typeface0 = this.y;
            if(typeface0 != null) {
                this.x = i.b(configuration0, typeface0);
            }
            Typeface typeface1 = this.B;
            if(typeface1 != null) {
                this.A = i.b(configuration0, typeface1);
            }
            this.w = this.x == null ? this.y : this.x;
            this.z = this.A == null ? this.B : this.A;
            this.d0(true);
        }
    }

    private void b(boolean z) {
        this.i(1.0f, z);
        CharSequence charSequence0 = this.H;
        if(charSequence0 != null) {
            StaticLayout staticLayout0 = this.k0;
            if(staticLayout0 != null) {
                float f = (float)staticLayout0.getWidth();
                this.o0 = TextUtils.ellipsize(charSequence0, this.V, f, this.F);
            }
        }
        CharSequence charSequence1 = this.o0;
        float f1 = 0.0f;
        this.l0 = charSequence1 == null ? 0.0f : this.b0(this.V, charSequence1);
        int v = GravityCompat.d(this.k, ((int)this.I));
        switch(v & 0x70) {
            case 0x30: {
                this.r = (float)this.h.top;
                break;
            }
            case 80: {
                this.r = ((float)this.h.bottom) + this.V.ascent();
                break;
            }
            default: {
                float f2 = this.V.descent();
                float f3 = this.V.ascent();
                this.r = ((float)this.h.centerY()) - (f2 - f3) / 2.0f;
            }
        }
        switch(v & 0x800007) {
            case 1: {
                this.t = ((float)this.h.centerX()) - this.l0 / 2.0f;
                break;
            }
            case 5: {
                this.t = ((float)this.h.right) - this.l0;
                break;
            }
            default: {
                this.t = (float)this.h.left;
            }
        }
        this.i(0.0f, z);
        float f4 = this.k0 == null ? 0.0f : ((float)this.k0.getHeight());
        StaticLayout staticLayout1 = this.k0;
        if(staticLayout1 == null || this.p0 <= 1) {
            CharSequence charSequence2 = this.H;
            if(charSequence2 != null) {
                f1 = this.b0(this.V, charSequence2);
            }
        }
        else {
            f1 = (float)staticLayout1.getWidth();
        }
        this.p = this.k0 == null ? 0 : this.k0.getLineCount();
        int v1 = GravityCompat.d(this.j, ((int)this.I));
        switch(v1 & 0x70) {
            case 0x30: {
                this.q = (float)this.g.top;
                break;
            }
            case 80: {
                this.q = ((float)this.g.bottom) - f4 + this.V.descent();
                break;
            }
            default: {
                this.q = ((float)this.g.centerY()) - f4 / 2.0f;
            }
        }
        switch(v1 & 0x800007) {
            case 1: {
                this.s = ((float)this.g.centerX()) - f1 / 2.0f;
                break;
            }
            case 5: {
                this.s = ((float)this.g.right) - f1;
                break;
            }
            default: {
                this.s = (float)this.g.left;
            }
        }
        this.j();
        this.E0(this.b);
    }

    private float b0(TextPaint textPaint0, CharSequence charSequence0) {
        return textPaint0.measureText(charSequence0, 0, charSequence0.length());
    }

    private void c() {
        this.g(this.b);
    }

    public void c0() {
        this.d0(false);
    }

    private float d(@FloatRange(from = 0.0, to = 1.0) float f) {
        return f <= this.e ? com.google.android.material.animation.b.b(1.0f, 0.0f, this.d, this.e, f) : com.google.android.material.animation.b.b(0.0f, 1.0f, this.e, 1.0f, f);
    }

    public void d0(boolean z) {
        if(this.a.getHeight() > 0 && this.a.getWidth() > 0 || z) {
            this.b(z);
            this.c();
        }
    }

    private float e() {
        return this.d + (1.0f - this.d) * 0.5f;
    }

    private static boolean e0(@NonNull Rect rect0, int v, int v1, int v2, int v3) {
        return rect0.left == v && rect0.top == v1 && rect0.right == v2 && rect0.bottom == v3;
    }

    private boolean f(@NonNull CharSequence charSequence0) {
        boolean z = this.V();
        return this.J ? this.Y(charSequence0, z) : z;
    }

    public void f0(@Nullable ColorStateList colorStateList0) {
        if(this.o != colorStateList0 || this.n != colorStateList0) {
            this.o = colorStateList0;
            this.n = colorStateList0;
            this.c0();
        }
    }

    private void g(float f) {
        float f1;
        this.T(f);
        if(!this.c) {
            this.u = b.Z(this.s, this.t, f, this.X);
            this.v = b.Z(this.q, this.r, f, this.X);
            this.E0(f);
            f1 = f;
        }
        else if(f < this.e) {
            this.u = this.s;
            this.v = this.q;
            this.E0(0.0f);
            f1 = 0.0f;
        }
        else {
            this.u = this.t;
            this.v = this.r - ((float)Math.max(0, this.f));
            this.E0(1.0f);
            f1 = 1.0f;
        }
        TimeInterpolator timeInterpolator0 = com.google.android.material.animation.b.b;
        this.j0(1.0f - b.Z(0.0f, 1.0f, 1.0f - f, timeInterpolator0));
        this.u0(b.Z(1.0f, 0.0f, f, timeInterpolator0));
        if(this.o == this.n) {
            int v1 = this.w();
            this.V.setColor(v1);
        }
        else {
            int v = b.a(this.y(), this.w(), f1);
            this.V.setColor(v);
        }
        int v2 = Build.VERSION.SDK_INT;
        float f2 = this.h0;
        float f3 = this.i0;
        if(f2 == f3) {
            this.V.setLetterSpacing(f2);
        }
        else {
            float f4 = b.Z(f3, f2, f, timeInterpolator0);
            this.V.setLetterSpacing(f4);
        }
        this.P = b.Z(this.d0, this.Z, f, null);
        this.Q = b.Z(this.e0, this.a0, f, null);
        this.R = b.Z(this.f0, this.b0, f, null);
        int v3 = b.a(this.x(this.g0), this.x(this.c0), f);
        this.S = v3;
        this.V.setShadowLayer(this.P, this.Q, this.R, v3);
        if(this.c) {
            int v4 = this.V.getAlpha();
            float f5 = this.d(f);
            this.V.setAlpha(((int)(f5 * ((float)v4))));
            if(v2 >= 0x1F) {
                float f6 = this.P;
                float f7 = this.Q;
                float f8 = this.R;
                int v5 = v.a(this.S, this.V.getAlpha());
                this.V.setShadowLayer(f6, f7, f8, v5);
            }
        }
        ViewCompat.v1(this.a);
    }

    public void g0(int v, int v1, int v2, int v3) {
        if(!b.e0(this.h, v, v1, v2, v3)) {
            this.h.set(v, v1, v2, v3);
            this.U = true;
        }
    }

    private void h(float f) {
        this.i(f, false);
    }

    public void h0(@NonNull Rect rect0) {
        this.g0(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    private void i(float f, boolean z) {
        Typeface typeface0;
        float f4;
        float f3;
        if(this.G == null) {
            return;
        }
        float f1 = (float)this.h.width();
        float f2 = (float)this.g.width();
        if(b.U(f, 1.0f)) {
            f3 = this.m;
            f4 = this.h0;
            this.N = 1.0f;
            typeface0 = this.w;
        }
        else {
            float f5 = this.l;
            float f6 = this.i0;
            Typeface typeface1 = this.z;
            this.N = b.U(f, 0.0f) ? 1.0f : b.Z(this.l, this.m, f, this.Y) / this.l;
            float f7 = this.m / this.l;
            f1 = z || this.c || f2 * f7 <= f1 ? f2 : Math.min(f1 / f7, f2);
            f3 = f5;
            f4 = f6;
            typeface0 = typeface1;
        }
        int v = 1;
        boolean z1 = false;
        if(f1 > 0.0f) {
            boolean z2 = this.C != typeface0;
            boolean z3 = this.O != f3 || this.j0 != f4 || this.k0 != null && f1 != ((float)this.k0.getWidth()) || z2 || this.U;
            this.O = f3;
            this.j0 = f4;
            this.C = typeface0;
            this.U = false;
            TextPaint textPaint0 = this.V;
            if(this.N != 1.0f) {
                z1 = true;
            }
            textPaint0.setLinearText(z1);
            z1 = z3;
        }
        if(this.H == null || z1) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.j0);
            this.I = this.f(this.G);
            if(this.Q0()) {
                v = this.p0;
            }
            StaticLayout staticLayout0 = this.k(v, f1, this.I);
            this.k0 = staticLayout0;
            this.H = staticLayout0.getText();
        }
    }

    public void i0(int v) {
        class com.google.android.material.internal.b.a implements com.google.android.material.resources.a.a {
            final b a;

            @Override  // com.google.android.material.resources.a$a
            public void a(Typeface typeface0) {
                b.this.n0(typeface0);
            }
        }

        e e0 = new e(this.a.getContext(), v);
        if(e0.i() != null) {
            this.o = e0.i();
        }
        if(e0.j() != 0.0f) {
            this.m = e0.j();
        }
        ColorStateList colorStateList0 = e0.c;
        if(colorStateList0 != null) {
            this.c0 = colorStateList0;
        }
        this.a0 = e0.h;
        this.b0 = e0.i;
        this.Z = e0.j;
        this.h0 = e0.l;
        a a0 = this.E;
        if(a0 != null) {
            a0.c();
        }
        this.E = new a((Typeface typeface0) -> if(b.this.o0(typeface0)) {
            b.this.c0();
        }, e0.e());
        e0.h(this.a.getContext(), this.E);
        this.c0();
    }

    private void j() {
        Bitmap bitmap0 = this.L;
        if(bitmap0 != null) {
            bitmap0.recycle();
            this.L = null;
        }
    }

    private void j0(float f) {
        this.m0 = f;
        ViewCompat.v1(this.a);
    }

    private StaticLayout k(int v, float f, boolean z) {
        try {
            Layout.Alignment layout$Alignment0 = v == 1 ? Layout.Alignment.ALIGN_NORMAL : this.N();
            return (StaticLayout)Preconditions.l(y.c(this.G, this.V, ((int)f)).e(this.F).i(z).d(layout$Alignment0).h(false).k(v).j(this.q0, this.r0).g(this.s0).m(this.t0).a());
        }
        catch(com.google.android.material.internal.y.a y$a0) {
        }
        Log.e("CollapsingTextHelper", y$a0.getCause().getMessage(), y$a0);
        return (StaticLayout)Preconditions.l(null);
    }

    public void k0(ColorStateList colorStateList0) {
        if(this.o != colorStateList0) {
            this.o = colorStateList0;
            this.c0();
        }
    }

    public void l(@NonNull Canvas canvas0) {
        int v = canvas0.save();
        if(this.H != null && this.i.width() > 0.0f && this.i.height() > 0.0f) {
            this.V.setTextSize(this.O);
            float f = this.u;
            float f1 = this.v;
            boolean z = this.K && this.L != null;
            float f2 = this.N;
            if(f2 != 1.0f && !this.c) {
                canvas0.scale(f2, f2, f, f1);
            }
            if(z) {
                canvas0.drawBitmap(this.L, f, f1, this.M);
                canvas0.restoreToCount(v);
                return;
            }
            if(!this.Q0() || this.c && this.b <= this.e) {
                canvas0.translate(f, f1);
                this.k0.draw(canvas0);
            }
            else {
                this.m(canvas0, this.u - ((float)this.k0.getLineStart(0)), f1);
            }
            canvas0.restoreToCount(v);
        }
    }

    public void l0(int v) {
        if(this.k != v) {
            this.k = v;
            this.c0();
        }
    }

    private void m(@NonNull Canvas canvas0, float f, float f1) {
        int v = this.V.getAlpha();
        canvas0.translate(f, f1);
        if(!this.c) {
            this.V.setAlpha(((int)(this.n0 * ((float)v))));
            if(Build.VERSION.SDK_INT >= 0x1F) {
                float f2 = this.P;
                float f3 = this.Q;
                float f4 = this.R;
                int v1 = v.a(this.S, this.V.getAlpha());
                this.V.setShadowLayer(f2, f3, f4, v1);
            }
            this.k0.draw(canvas0);
        }
        if(!this.c) {
            this.V.setAlpha(((int)(this.m0 * ((float)v))));
        }
        int v2 = Build.VERSION.SDK_INT;
        if(v2 >= 0x1F) {
            float f5 = this.P;
            float f6 = this.Q;
            float f7 = this.R;
            int v3 = v.a(this.S, this.V.getAlpha());
            this.V.setShadowLayer(f5, f6, f7, v3);
        }
        int v4 = this.k0.getLineBaseline(0);
        canvas0.drawText(this.o0, 0, this.o0.length(), 0.0f, ((float)v4), this.V);
        if(v2 >= 0x1F) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if(!this.c) {
            String s = this.o0.toString().trim();
            if(s.endsWith("…")) {
                s = s.substring(0, s.length() - 1);
            }
            this.V.setAlpha(v);
            canvas0.drawText(s, 0, Math.min(this.k0.getLineEnd(0), s.length()), 0.0f, ((float)v4), this.V);
        }
    }

    public void m0(float f) {
        if(this.m != f) {
            this.m = f;
            this.c0();
        }
    }

    private void n() {
        if(this.L == null && !this.g.isEmpty() && !TextUtils.isEmpty(this.H)) {
            this.g(0.0f);
            int v = this.k0.getWidth();
            int v1 = this.k0.getHeight();
            if(v > 0 && v1 > 0) {
                this.L = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
                Canvas canvas0 = new Canvas(this.L);
                this.k0.draw(canvas0);
                if(this.M == null) {
                    this.M = new Paint(3);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    public void n0(Typeface typeface0) [...]

    public void o(@NonNull RectF rectF0, int v, int v1) {
        this.I = this.f(this.G);
        rectF0.left = Math.max(this.s(v, v1), this.h.left);
        rectF0.top = (float)this.h.top;
        rectF0.right = Math.min(this.t(rectF0, v, v1), this.h.right);
        rectF0.bottom = ((float)this.h.top) + this.r();
    }

    private boolean o0(Typeface typeface0) {
        a a0 = this.E;
        if(a0 != null) {
            a0.c();
        }
        if(this.y != typeface0) {
            this.y = typeface0;
            Typeface typeface1 = i.b(this.a.getContext().getResources().getConfiguration(), typeface0);
            this.x = typeface1;
            if(typeface1 == null) {
                typeface1 = this.y;
            }
            this.w = typeface1;
            return true;
        }
        return false;
    }

    public ColorStateList p() {
        return this.o;
    }

    public void p0(int v) {
        this.f = v;
    }

    public int q() {
        return this.k;
    }

    public void q0(int v, int v1, int v2, int v3) {
        if(!b.e0(this.g, v, v1, v2, v3)) {
            this.g.set(v, v1, v2, v3);
            this.U = true;
        }
    }

    public float r() {
        this.Q(this.W);
        return -this.W.ascent();
    }

    public void r0(@NonNull Rect rect0) {
        this.q0(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    private float s(int v, int v1) {
        if(v1 != 17 && (v1 & 7) != 1) {
            if((v1 & 0x800005) != 0x800005 && (v1 & 5) != 5) {
                return this.I ? ((float)this.h.right) - this.l0 : ((float)this.h.left);
            }
            return this.I ? ((float)this.h.left) : ((float)this.h.right) - this.l0;
        }
        return ((float)v) / 2.0f - this.l0 / 2.0f;
    }

    public void s0(float f) {
        if(this.i0 != f) {
            this.i0 = f;
            this.c0();
        }
    }

    private float t(@NonNull RectF rectF0, int v, int v1) {
        if(v1 != 17 && (v1 & 7) != 1) {
            if((v1 & 0x800005) != 0x800005 && (v1 & 5) != 5) {
                return this.I ? ((float)this.h.right) : rectF0.left + this.l0;
            }
            return this.I ? rectF0.left + this.l0 : ((float)this.h.right);
        }
        return ((float)v) / 2.0f + this.l0 / 2.0f;
    }

    public void t0(int v) {
        class com.google.android.material.internal.b.b implements com.google.android.material.resources.a.a {
            final b a;

            @Override  // com.google.android.material.resources.a$a
            public void a(Typeface typeface0) {
                b.this.y0(typeface0);
            }
        }

        e e0 = new e(this.a.getContext(), v);
        if(e0.i() != null) {
            this.n = e0.i();
        }
        if(e0.j() != 0.0f) {
            this.l = e0.j();
        }
        ColorStateList colorStateList0 = e0.c;
        if(colorStateList0 != null) {
            this.g0 = colorStateList0;
        }
        this.e0 = e0.h;
        this.f0 = e0.i;
        this.d0 = e0.j;
        this.i0 = e0.l;
        a a0 = this.D;
        if(a0 != null) {
            a0.c();
        }
        this.D = new a((Typeface typeface0) -> if(b.this.z0(typeface0)) {
            b.this.c0();
        }, e0.e());
        e0.h(this.a.getContext(), this.D);
        this.c0();
    }

    public float u() {
        return this.m;
    }

    private void u0(float f) {
        this.n0 = f;
        ViewCompat.v1(this.a);
    }

    public Typeface v() {
        return this.w == null ? Typeface.DEFAULT : this.w;
    }

    public void v0(ColorStateList colorStateList0) {
        if(this.n != colorStateList0) {
            this.n = colorStateList0;
            this.c0();
        }
    }

    @ColorInt
    public int w() {
        return this.x(this.o);
    }

    public void w0(int v) {
        if(this.j != v) {
            this.j = v;
            this.c0();
        }
    }

    @ColorInt
    private int x(@Nullable ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            return 0;
        }
        int[] arr_v = this.T;
        return arr_v == null ? colorStateList0.getDefaultColor() : colorStateList0.getColorForState(arr_v, 0);
    }

    public void x0(float f) {
        if(this.l != f) {
            this.l = f;
            this.c0();
        }
    }

    @ColorInt
    private int y() {
        return this.x(this.n);
    }

    // 检测为 Lambda 实现
    public void y0(Typeface typeface0) [...]

    public int z() {
        return this.p;
    }

    private boolean z0(Typeface typeface0) {
        a a0 = this.D;
        if(a0 != null) {
            a0.c();
        }
        if(this.B != typeface0) {
            this.B = typeface0;
            Typeface typeface1 = i.b(this.a.getContext().getResources().getConfiguration(), typeface0);
            this.A = typeface1;
            if(typeface1 == null) {
                typeface1 = this.B;
            }
            this.z = typeface1;
            return true;
        }
        return false;
    }
}

