package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.drawable.f;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;

@RestrictTo({Scope.b})
class c extends Drawable {
    static class a {
    }

    class b extends Drawable.ConstantState {
        final c a;

        private b() {
        }

        b(a c$a0) {
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable() {
            return c.this;
        }
    }

    private final q a;
    @NonNull
    private final Paint b;
    private final Path c;
    private final Rect d;
    private final RectF e;
    private final RectF f;
    private final b g;
    @Dimension
    float h;
    @ColorInt
    private int i;
    @ColorInt
    private int j;
    @ColorInt
    private int k;
    @ColorInt
    private int l;
    @ColorInt
    private int m;
    private boolean n;
    private p o;
    @Nullable
    private ColorStateList p;
    private static final float q = 1.3333f;

    c(p p0) {
        this.a = q.k();
        this.c = new Path();
        this.d = new Rect();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new b(this, null);
        this.n = true;
        this.o = p0;
        Paint paint0 = new Paint(1);
        this.b = paint0;
        paint0.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    private Shader a() {
        this.copyBounds(this.d);
        float f = this.h / ((float)this.d.height());
        int[] arr_v = {ColorUtils.v(this.i, this.m), ColorUtils.v(this.j, this.m), ColorUtils.v(ColorUtils.D(this.j, 0), this.m), ColorUtils.v(ColorUtils.D(this.l, 0), this.m), ColorUtils.v(this.l, this.m), ColorUtils.v(this.k, this.m)};
        return new LinearGradient(0.0f, ((float)this.d.top), 0.0f, ((float)this.d.bottom), arr_v, new float[]{0.0f, f, 0.5f, 0.5f, 1.0f - f, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    protected RectF b() {
        Rect rect0 = this.getBounds();
        this.f.set(rect0);
        return this.f;
    }

    public p c() {
        return this.o;
    }

    void d(@Nullable ColorStateList colorStateList0) {
        if(colorStateList0 != null) {
            this.m = colorStateList0.getColorForState(this.getState(), this.m);
        }
        this.p = colorStateList0;
        this.n = true;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        if(this.n) {
            Shader shader0 = this.a();
            this.b.setShader(shader0);
            this.n = false;
        }
        float f = this.b.getStrokeWidth();
        this.copyBounds(this.d);
        this.e.set(this.d);
        float f1 = Math.min(this.o.r().a(this.b()), this.e.width() / 2.0f);
        if(this.o.u(this.b())) {
            this.e.inset(f / 2.0f, f / 2.0f);
            canvas0.drawRoundRect(this.e, f1, f1, this.b);
        }
    }

    public void e(@Dimension float f) {
        if(this.h != f) {
            this.h = f;
            this.b.setStrokeWidth(f * 1.3333f);
            this.n = true;
            this.invalidateSelf();
        }
    }

    void f(@ColorInt int v, @ColorInt int v1, @ColorInt int v2, @ColorInt int v3) {
        this.i = v;
        this.j = v1;
        this.k = v2;
        this.l = v3;
    }

    public void g(p p0) {
        this.o = p0;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override  // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline0) {
        if(this.o.u(this.b())) {
            float f = this.o.r().a(this.b());
            outline0.setRoundRect(this.getBounds(), f);
            return;
        }
        this.copyBounds(this.d);
        this.e.set(this.d);
        this.a.d(this.o, 1.0f, this.e, this.c);
        f.l(outline0, this.c);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect0) {
        if(this.o.u(this.b())) {
            int v = Math.round(this.h);
            rect0.set(v, v, v, v);
        }
        return true;
    }

    // 去混淆评级： 低(30)
    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.p != null && this.p.isStateful() || super.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        this.n = true;
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        ColorStateList colorStateList0 = this.p;
        if(colorStateList0 != null) {
            int v = colorStateList0.getColorForState(arr_v, this.m);
            if(v != this.m) {
                this.n = true;
                this.m = v;
            }
        }
        if(this.n) {
            this.invalidateSelf();
        }
        return this.n;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0L, to = 0xFFL) int v) {
        this.b.setAlpha(v);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.b.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }
}

