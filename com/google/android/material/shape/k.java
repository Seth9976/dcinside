package com.google.android.material.shape;

import F1.a;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.R.attr;
import com.google.android.material.color.v;
import com.google.android.material.drawable.f;
import com.google.android.material.shadow.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

public class k extends Drawable implements TintAwareDrawable, t {
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @RestrictTo({Scope.b})
    public static class d extends Drawable.ConstantState {
        @NonNull
        p a;
        @Nullable
        a b;
        @Nullable
        ColorFilter c;
        @Nullable
        ColorStateList d;
        @Nullable
        ColorStateList e;
        @Nullable
        ColorStateList f;
        @Nullable
        ColorStateList g;
        @Nullable
        PorterDuff.Mode h;
        @Nullable
        Rect i;
        float j;
        float k;
        float l;
        int m;
        float n;
        float o;
        float p;
        int q;
        int r;
        int s;
        int t;
        boolean u;
        Paint.Style v;

        public d(@NonNull d k$d0) {
            this.i = null;
            this.a = k$d0.a;
            this.b = k$d0.b;
            this.l = k$d0.l;
            this.c = k$d0.c;
            this.d = k$d0.d;
            this.e = k$d0.e;
            this.h = k$d0.h;
            this.g = k$d0.g;
            this.m = k$d0.m;
            this.j = k$d0.j;
            this.s = k$d0.s;
            this.q = k$d0.q;
            this.u = k$d0.u;
            this.k = k$d0.k;
            this.n = k$d0.n;
            this.o = k$d0.o;
            this.p = k$d0.p;
            this.r = k$d0.r;
            this.t = k$d0.t;
            this.f = k$d0.f;
            this.v = k$d0.v;
            if(k$d0.i != null) {
                this.i = new Rect(k$d0.i);
            }
        }

        public d(@NonNull p p0, @Nullable a a0) {
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 0xFF;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.a = p0;
            this.b = a0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable() {
            Drawable drawable0 = new k(this);
            ((k)drawable0).e = true;
            return drawable0;
        }
    }

    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    private static final Paint D = null;
    private d a;
    private final j[] b;
    private final j[] c;
    private final BitSet d;
    private boolean e;
    private final Matrix f;
    private final Path g;
    private final Path h;
    private final RectF i;
    private final RectF j;
    private final Region k;
    private final Region l;
    private p m;
    private final Paint n;
    private final Paint o;
    private final b p;
    @NonNull
    private final com.google.android.material.shape.q.b q;
    private final q r;
    @Nullable
    private PorterDuffColorFilter s;
    @Nullable
    private PorterDuffColorFilter t;
    private int u;
    @NonNull
    private final RectF v;
    private boolean w;
    private static final String x = "k";
    private static final float y = 0.75f;
    private static final float z = 0.25f;

    static {
        Paint paint0 = new Paint(1);
        k.D = paint0;
        paint0.setColor(-1);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public k() {
        this(new p());
    }

    public k(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        this(p.e(context0, attributeSet0, v, v1).m());
    }

    @RestrictTo({Scope.b})
    protected k(@NonNull d k$d0) {
        class com.google.android.material.shape.k.a implements com.google.android.material.shape.q.b {
            final k a;

            @Override  // com.google.android.material.shape.q$b
            public void a(@NonNull r r0, Matrix matrix0, int v) {
                k.this.d.set(v, r0.e());
                k.this.b[v] = r0.f(matrix0);
            }

            @Override  // com.google.android.material.shape.q$b
            public void b(@NonNull r r0, Matrix matrix0, int v) {
                k.this.d.set(v + 4, r0.e());
                k.this.c[v] = r0.f(matrix0);
            }
        }

        this.b = new j[4];
        this.c = new j[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint paint0 = new Paint(1);
        this.n = paint0;
        Paint paint1 = new Paint(1);
        this.o = paint1;
        this.p = new b();
        this.r = Looper.getMainLooper().getThread() == Thread.currentThread() ? q.k() : new q();
        this.v = new RectF();
        this.w = true;
        this.a = k$d0;
        paint1.setStyle(Paint.Style.STROKE);
        paint0.setStyle(Paint.Style.FILL);
        this.O0();
        this.N0(this.getState());
        this.q = new com.google.android.material.shape.k.a(this);
    }

    public k(@NonNull p p0) {
        this(new d(p0, null));
    }

    @Deprecated
    public k(@NonNull s s0) {
        this(s0);
    }

    public float A() {
        return this.a.k;
    }

    @Deprecated
    public void A0(boolean z) {
        this.y0(!z);
    }

    public Paint.Style B() {
        return this.a.v;
    }

    @Deprecated
    public void B0(int v) {
        this.a.r = v;
    }

    public float C() {
        return this.a.n;
    }

    @RestrictTo({Scope.b})
    public void C0(int v) {
        d k$d0 = this.a;
        if(k$d0.s != v) {
            k$d0.s = v;
            this.b0();
        }
    }

    @Deprecated
    public void D(int v, int v1, @NonNull Path path0) {
        this.h(new RectF(0.0f, 0.0f, ((float)v), ((float)v1)), path0);
    }

    @Deprecated
    public void D0(@NonNull s s0) {
        this.setShapeAppearanceModel(s0);
    }

    @ColorInt
    public int E() {
        return this.u;
    }

    public void E0(float f, @ColorInt int v) {
        this.J0(f);
        this.G0(ColorStateList.valueOf(v));
    }

    public float F() {
        return this.a.j;
    }

    public void F0(float f, @Nullable ColorStateList colorStateList0) {
        this.J0(f);
        this.G0(colorStateList0);
    }

    public int G() {
        return this.a.t;
    }

    public void G0(@Nullable ColorStateList colorStateList0) {
        d k$d0 = this.a;
        if(k$d0.e != colorStateList0) {
            k$d0.e = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    public int H() {
        return this.a.q;
    }

    public void H0(@ColorInt int v) {
        this.I0(ColorStateList.valueOf(v));
    }

    @Deprecated
    public int I() {
        return (int)this.y();
    }

    public void I0(ColorStateList colorStateList0) {
        this.a.f = colorStateList0;
        this.O0();
        this.b0();
    }

    public int J() {
        return (int)(((double)this.a.s) * Math.sin(Math.toRadians(this.a.t)));
    }

    public void J0(float f) {
        this.a.l = f;
        this.invalidateSelf();
    }

    public int K() {
        return (int)(((double)this.a.s) * Math.cos(Math.toRadians(this.a.t)));
    }

    public void K0(float f) {
        d k$d0 = this.a;
        if(k$d0.p != f) {
            k$d0.p = f;
            this.P0();
        }
    }

    public int L() {
        return this.a.r;
    }

    public void L0(boolean z) {
        d k$d0 = this.a;
        if(k$d0.u != z) {
            k$d0.u = z;
            this.invalidateSelf();
        }
    }

    @RestrictTo({Scope.b})
    public int M() {
        return this.a.s;
    }

    public void M0(float f) {
        this.K0(f - this.y());
    }

    @Nullable
    @Deprecated
    public s N() {
        p p0 = this.getShapeAppearanceModel();
        return p0 instanceof s ? ((s)p0) : null;
    }

    private boolean N0(int[] arr_v) {
        boolean z;
        if(this.a.d == null) {
            z = false;
        }
        else {
            int v = this.n.getColor();
            int v1 = this.a.d.getColorForState(arr_v, v);
            if(v == v1) {
                z = false;
            }
            else {
                this.n.setColor(v1);
                z = true;
            }
        }
        if(this.a.e != null) {
            int v2 = this.o.getColor();
            int v3 = this.a.e.getColorForState(arr_v, v2);
            if(v2 != v3) {
                this.o.setColor(v3);
                return true;
            }
        }
        return z;
    }

    @Nullable
    public ColorStateList O() {
        return this.a.e;
    }

    private boolean O0() {
        PorterDuffColorFilter porterDuffColorFilter0 = this.s;
        PorterDuffColorFilter porterDuffColorFilter1 = this.t;
        this.s = this.k(this.a.g, this.a.h, this.n, true);
        this.t = this.k(this.a.f, this.a.h, this.o, false);
        d k$d0 = this.a;
        if(k$d0.u) {
            int v = k$d0.g.getColorForState(this.getState(), 0);
            this.p.e(v);
        }
        return !ObjectsCompat.a(porterDuffColorFilter0, this.s) || !ObjectsCompat.a(porterDuffColorFilter1, this.t);
    }

    // 去混淆评级： 低(20)
    private float P() {
        return this.Z() ? this.o.getStrokeWidth() / 2.0f : 0.0f;
    }

    private void P0() {
        float f = this.W();
        this.a.r = (int)Math.ceil(0.75f * f);
        this.a.s = (int)Math.ceil(f * 0.25f);
        this.O0();
        this.b0();
    }

    @Nullable
    public ColorStateList Q() {
        return this.a.f;
    }

    public float R() {
        return this.a.l;
    }

    @Nullable
    public ColorStateList S() {
        return this.a.g;
    }

    public float T() {
        return this.a.a.r().a(this.w());
    }

    public float U() {
        return this.a.a.t().a(this.w());
    }

    public float V() {
        return this.a.p;
    }

    public float W() {
        return this.y() + this.V();
    }

    private boolean X() {
        int v = this.a.q;
        return v != 1 && this.a.r > 0 && (v == 2 || this.k0());
    }

    private boolean Y() {
        Paint.Style paint$Style0 = this.a.v;
        return paint$Style0 == Paint.Style.FILL_AND_STROKE || paint$Style0 == Paint.Style.FILL;
    }

    private boolean Z() {
        Paint.Style paint$Style0 = this.a.v;
        return (paint$Style0 == Paint.Style.FILL_AND_STROKE || paint$Style0 == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    public void a0(Context context0) {
        d k$d0 = this.a;
        k$d0.b = new a(context0);
        this.P0();
    }

    private void b0() {
        super.invalidateSelf();
    }

    public boolean c0() {
        a a0 = this.a.b;
        return a0 != null && a0.l();
    }

    public boolean d0() {
        return this.a.b != null;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        this.n.setColorFilter(this.s);
        int v = this.n.getAlpha();
        this.n.setAlpha(v * (this.a.m + (this.a.m >>> 7)) >>> 8);
        this.o.setColorFilter(this.t);
        this.o.setStrokeWidth(this.a.l);
        int v1 = this.o.getAlpha();
        this.o.setAlpha(v1 * (this.a.m + (this.a.m >>> 7)) >>> 8);
        if(this.e) {
            this.i();
            this.g(this.w(), this.g);
            this.e = false;
        }
        this.h0(canvas0);
        if(this.Y()) {
            this.q(canvas0);
        }
        if(this.Z()) {
            this.t(canvas0);
        }
        this.n.setAlpha(v);
        this.o.setAlpha(v1);
    }

    public boolean e0(int v, int v1) {
        return this.getTransparentRegion().contains(v, v1);
    }

    @Nullable
    private PorterDuffColorFilter f(@NonNull Paint paint0, boolean z) {
        if(z) {
            int v = paint0.getColor();
            int v1 = this.l(v);
            this.u = v1;
            return v1 == v ? null : new PorterDuffColorFilter(v1, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    @RestrictTo({Scope.b})
    public boolean f0() {
        return this.a.a.u(this.w());
    }

    private void g(@NonNull RectF rectF0, @NonNull Path path0) {
        this.h(rectF0, path0);
        if(this.a.j != 1.0f) {
            this.f.reset();
            float f = this.a.j;
            float f1 = rectF0.width();
            float f2 = rectF0.height();
            this.f.setScale(f, f, f1 / 2.0f, f2 / 2.0f);
            path0.transform(this.f);
        }
        path0.computeBounds(this.v, true);
    }

    @Deprecated
    public boolean g0() {
        return this.a.q == 0 || this.a.q == 2;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.m;
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline0) {
        if(this.a.q == 2) {
            return;
        }
        if(this.f0()) {
            float f = this.T() * this.a.k;
            outline0.setRoundRect(this.getBounds(), f);
            return;
        }
        this.g(this.w(), this.g);
        f.l(outline0, this.g);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect0) {
        Rect rect1 = this.a.i;
        if(rect1 != null) {
            rect0.set(rect1);
            return true;
        }
        return super.getPadding(rect0);
    }

    @Override  // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.a.a;
    }

    @Override  // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Rect rect0 = this.getBounds();
        this.k.set(rect0);
        this.g(this.w(), this.g);
        this.l.setPath(this.g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    @RestrictTo({Scope.b})
    protected final void h(@NonNull RectF rectF0, @NonNull Path path0) {
        this.r.e(this.a.a, this.a.k, rectF0, this.q, path0);
    }

    private void h0(@NonNull Canvas canvas0) {
        if(!this.X()) {
            return;
        }
        canvas0.save();
        this.j0(canvas0);
        if(!this.w) {
            this.p(canvas0);
            canvas0.restore();
            return;
        }
        int v = (int)(this.v.width() - ((float)this.getBounds().width()));
        int v1 = (int)(this.v.height() - ((float)this.getBounds().height()));
        if(v < 0 || v1 < 0) {
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
        Bitmap bitmap0 = Bitmap.createBitmap(((int)this.v.width()) + this.a.r * 2 + v, ((int)this.v.height()) + this.a.r * 2 + v1, Bitmap.Config.ARGB_8888);
        Canvas canvas1 = new Canvas(bitmap0);
        float f = (float)(this.getBounds().left - this.a.r - v);
        float f1 = (float)(this.getBounds().top - this.a.r - v1);
        canvas1.translate(-f, -f1);
        this.p(canvas1);
        canvas0.drawBitmap(bitmap0, f, f1, null);
        bitmap0.recycle();
        canvas0.restore();
    }

    private void i() {
        class com.google.android.material.shape.k.b implements com.google.android.material.shape.p.c {
            final float a;
            final k b;

            com.google.android.material.shape.k.b(float f) {
                this.a = f;
                super();
            }

            @Override  // com.google.android.material.shape.p$c
            @NonNull
            public e a(@NonNull e e0) {
                return !(e0 instanceof n) ? new com.google.android.material.shape.b(this.a, e0) : e0;
            }
        }

        p p0 = this.getShapeAppearanceModel().y(new com.google.android.material.shape.k.b(this, -this.P()));
        this.m = p0;
        float f = this.a.k;
        RectF rectF0 = this.x();
        this.r.d(p0, f, rectF0, this.h);
    }

    private static int i0(int v, int v1) [...] // Inlined contents

    @Override  // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if(!super.isStateful()) {
            ColorStateList colorStateList0 = this.a.g;
            if(colorStateList0 == null || !colorStateList0.isStateful()) {
                ColorStateList colorStateList1 = this.a.f;
                if(colorStateList1 == null || !colorStateList1.isStateful()) {
                    ColorStateList colorStateList2 = this.a.e;
                    if(colorStateList2 == null || !colorStateList2.isStateful()) {
                        ColorStateList colorStateList3 = this.a.d;
                        return colorStateList3 != null && colorStateList3.isStateful();
                    }
                }
            }
        }
        return true;
    }

    @NonNull
    private PorterDuffColorFilter j(@NonNull ColorStateList colorStateList0, @NonNull PorterDuff.Mode porterDuff$Mode0, boolean z) {
        int v = colorStateList0.getColorForState(this.getState(), 0);
        if(z) {
            v = this.l(v);
        }
        this.u = v;
        return new PorterDuffColorFilter(v, porterDuff$Mode0);
    }

    private void j0(@NonNull Canvas canvas0) {
        canvas0.translate(((float)this.J()), ((float)this.K()));
    }

    @NonNull
    private PorterDuffColorFilter k(@Nullable ColorStateList colorStateList0, @Nullable PorterDuff.Mode porterDuff$Mode0, @NonNull Paint paint0, boolean z) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? this.f(paint0, z) : this.j(colorStateList0, porterDuff$Mode0, z);
    }

    public boolean k0() {
        int v = Build.VERSION.SDK_INT;
        return !this.f0() && !this.g.isConvex() && v < 29;
    }

    @ColorInt
    @RestrictTo({Scope.b})
    protected int l(@ColorInt int v) {
        a a0 = this.a.b;
        return a0 == null ? v : a0.e(v, this.W() + this.C());
    }

    public void l0(float f) {
        this.setShapeAppearanceModel(this.a.a.w(f));
    }

    @NonNull
    public static k m(Context context0) {
        return k.n(context0, 0.0f);
    }

    public void m0(@NonNull e e0) {
        this.setShapeAppearanceModel(this.a.a.x(e0));
    }

    @Override  // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.a = new d(this.a);
        return this;
    }

    @NonNull
    public static k n(@NonNull Context context0, float f) {
        return k.o(context0, f, null);
    }

    @RestrictTo({Scope.b})
    public void n0(boolean z) {
        this.r.n(z);
    }

    @NonNull
    public static k o(@NonNull Context context0, float f, @Nullable ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(v.c(context0, attr.colorSurface, "k"));
        }
        k k0 = new k();
        k0.a0(context0);
        k0.p0(colorStateList0);
        k0.o0(f);
        return k0;
    }

    public void o0(float f) {
        d k$d0 = this.a;
        if(k$d0.o != f) {
            k$d0.o = f;
            this.P0();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        this.e = true;
        super.onBoundsChange(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        boolean z = this.N0(arr_v) || this.O0();
        if(z) {
            this.invalidateSelf();
        }
        return z;
    }

    private void p(@NonNull Canvas canvas0) {
        if(this.d.cardinality() > 0) {
            Log.w("k", "Compatibility shadow requested but can\'t be drawn for all operations in this shape.");
        }
        if(this.a.s != 0) {
            canvas0.drawPath(this.g, this.p.d());
        }
        for(int v = 0; v < 4; ++v) {
            this.b[v].b(this.p, this.a.r, canvas0);
            this.c[v].b(this.p, this.a.r, canvas0);
        }
        if(this.w) {
            int v1 = this.J();
            int v2 = this.K();
            canvas0.translate(((float)(-v1)), ((float)(-v2)));
            canvas0.drawPath(this.g, k.D);
            canvas0.translate(((float)v1), ((float)v2));
        }
    }

    public void p0(@Nullable ColorStateList colorStateList0) {
        d k$d0 = this.a;
        if(k$d0.d != colorStateList0) {
            k$d0.d = colorStateList0;
            this.onStateChange(this.getState());
        }
    }

    private void q(@NonNull Canvas canvas0) {
        p p0 = this.a.a;
        RectF rectF0 = this.w();
        this.s(canvas0, this.n, this.g, p0, rectF0);
    }

    public void q0(float f) {
        d k$d0 = this.a;
        if(k$d0.k != f) {
            k$d0.k = f;
            this.e = true;
            this.invalidateSelf();
        }
    }

    @RestrictTo({Scope.b})
    protected void r(@NonNull Canvas canvas0, @NonNull Paint paint0, @NonNull Path path0, @NonNull RectF rectF0) {
        this.s(canvas0, paint0, path0, this.a.a, rectF0);
    }

    public void r0(int v, int v1, int v2, int v3) {
        d k$d0 = this.a;
        if(k$d0.i == null) {
            k$d0.i = new Rect();
        }
        this.a.i.set(v, v1, v2, v3);
        this.invalidateSelf();
    }

    private void s(@NonNull Canvas canvas0, @NonNull Paint paint0, @NonNull Path path0, @NonNull p p0, @NonNull RectF rectF0) {
        if(p0.u(rectF0)) {
            float f = p0.t().a(rectF0) * this.a.k;
            canvas0.drawRoundRect(rectF0, f, f, paint0);
            return;
        }
        canvas0.drawPath(path0, paint0);
    }

    public void s0(Paint.Style paint$Style0) {
        this.a.v = paint$Style0;
        this.b0();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0L, to = 0xFFL) int v) {
        d k$d0 = this.a;
        if(k$d0.m != v) {
            k$d0.m = v;
            this.b0();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.a.c = colorFilter0;
        this.b0();
    }

    @Override  // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p p0) {
        this.a.a = p0;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList0) {
        this.a.g = colorStateList0;
        this.O0();
        this.b0();
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        d k$d0 = this.a;
        if(k$d0.h != porterDuff$Mode0) {
            k$d0.h = porterDuff$Mode0;
            this.O0();
            this.b0();
        }
    }

    @RestrictTo({Scope.b})
    protected void t(@NonNull Canvas canvas0) {
        p p0 = this.m;
        RectF rectF0 = this.x();
        this.s(canvas0, this.o, this.h, p0, rectF0);
    }

    public void t0(float f) {
        d k$d0 = this.a;
        if(k$d0.n != f) {
            k$d0.n = f;
            this.P0();
        }
    }

    public float u() {
        return this.a.a.j().a(this.w());
    }

    public void u0(float f) {
        d k$d0 = this.a;
        if(k$d0.j != f) {
            k$d0.j = f;
            this.invalidateSelf();
        }
    }

    public float v() {
        return this.a.a.l().a(this.w());
    }

    @RestrictTo({Scope.b})
    public void v0(boolean z) {
        this.w = z;
    }

    @NonNull
    protected RectF w() {
        Rect rect0 = this.getBounds();
        this.i.set(rect0);
        return this.i;
    }

    public void w0(int v) {
        this.p.e(v);
        this.a.u = false;
        this.b0();
    }

    @NonNull
    private RectF x() {
        RectF rectF0 = this.w();
        this.j.set(rectF0);
        float f = this.P();
        this.j.inset(f, f);
        return this.j;
    }

    public void x0(int v) {
        d k$d0 = this.a;
        if(k$d0.t != v) {
            k$d0.t = v;
            this.b0();
        }
    }

    public float y() {
        return this.a.o;
    }

    public void y0(int v) {
        d k$d0 = this.a;
        if(k$d0.q != v) {
            k$d0.q = v;
            this.b0();
        }
    }

    @Nullable
    public ColorStateList z() {
        return this.a.d;
    }

    @Deprecated
    public void z0(int v) {
        this.o0(((float)v));
    }
}

