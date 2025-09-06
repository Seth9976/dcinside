package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.cardview.R.color;
import androidx.cardview.R.dimen;

class RoundRectDrawableWithShadow extends Drawable {
    interface RoundRectHelper {
        void a(Canvas arg1, RectF arg2, float arg3, Paint arg4);
    }

    private final int a;
    private Paint b;
    private Paint c;
    private Paint d;
    private final RectF e;
    private float f;
    private Path g;
    private float h;
    private float i;
    private float j;
    private ColorStateList k;
    private boolean l;
    private final int m;
    private final int n;
    private boolean o;
    private boolean p;
    private static final double q = 0.0;
    private static final float r = 1.5f;
    static RoundRectHelper s;

    static {
        RoundRectDrawableWithShadow.q = 0.707107;
    }

    RoundRectDrawableWithShadow(Resources resources0, ColorStateList colorStateList0, float f, float f1, float f2) {
        this.l = true;
        this.o = true;
        this.p = false;
        this.m = resources0.getColor(color.cardview_shadow_start_color);
        this.n = resources0.getColor(color.cardview_shadow_end_color);
        this.a = resources0.getDimensionPixelSize(dimen.cardview_compat_inset_shadow);
        this.b = new Paint(5);
        this.n(colorStateList0);
        Paint paint0 = new Paint(5);
        this.c = paint0;
        paint0.setStyle(Paint.Style.FILL);
        this.f = (float)(((int)(f + 0.5f)));
        this.e = new RectF();
        Paint paint1 = new Paint(this.c);
        this.d = paint1;
        paint1.setAntiAlias(false);
        this.s(f1, f2);
    }

    private void a(Rect rect0) {
        this.e.set(((float)rect0.left) + this.h, ((float)rect0.top) + 1.5f * this.h, ((float)rect0.right) - this.h, ((float)rect0.bottom) - 1.5f * this.h);
        this.b();
    }

    private void b() {
        RectF rectF0 = new RectF(-this.f, -this.f, this.f, this.f);
        RectF rectF1 = new RectF(rectF0);
        rectF1.inset(-this.i, -this.i);
        Path path0 = this.g;
        if(path0 == null) {
            this.g = new Path();
        }
        else {
            path0.reset();
        }
        this.g.setFillType(Path.FillType.EVEN_ODD);
        this.g.moveTo(-this.f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF1, 180.0f, 90.0f, false);
        this.g.arcTo(rectF0, 270.0f, -90.0f, false);
        this.g.close();
        Shader.TileMode shader$TileMode0 = Shader.TileMode.CLAMP;
        this.c.setShader(new RadialGradient(0.0f, 0.0f, this.f + this.i, new int[]{this.m, this.m, this.n}, new float[]{0.0f, this.f / (this.i + this.f), 1.0f}, shader$TileMode0));
        this.d.setShader(new LinearGradient(0.0f, this.i - this.f, 0.0f, -this.f - this.i, new int[]{this.m, this.m, this.n}, new float[]{0.0f, 0.5f, 1.0f}, shader$TileMode0));
        this.d.setAntiAlias(false);
    }

    // 去混淆评级： 低(20)
    static float c(float f, float f1, boolean z) {
        return z ? ((float)(((double)f) + (1.0 - RoundRectDrawableWithShadow.q) * ((double)f1))) : f;
    }

    // 去混淆评级： 低(20)
    static float d(float f, float f1, boolean z) {
        return z ? ((float)(((double)(f * 1.5f)) + (1.0 - RoundRectDrawableWithShadow.q) * ((double)f1))) : f * 1.5f;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        if(this.l) {
            this.a(this.getBounds());
            this.l = false;
        }
        canvas0.translate(0.0f, this.j / 2.0f);
        this.e(canvas0);
        canvas0.translate(0.0f, -this.j / 2.0f);
        RoundRectDrawableWithShadow.s.a(canvas0, this.e, this.f, this.b);
    }

    private void e(Canvas canvas0) {
        float f = -this.f - this.i;
        float f1 = this.f + ((float)this.a) + this.j / 2.0f;
        boolean z = this.e.width() - f1 * 2.0f > 0.0f;
        boolean z1 = this.e.height() - f1 * 2.0f > 0.0f;
        int v = canvas0.save();
        canvas0.translate(this.e.left + f1, this.e.top + f1);
        canvas0.drawPath(this.g, this.c);
        if(z) {
            canvas0.drawRect(0.0f, f, this.e.width() - f1 * 2.0f, -this.f, this.d);
        }
        canvas0.restoreToCount(v);
        int v1 = canvas0.save();
        canvas0.translate(this.e.right - f1, this.e.bottom - f1);
        canvas0.rotate(180.0f);
        canvas0.drawPath(this.g, this.c);
        if(z) {
            canvas0.drawRect(0.0f, f, this.e.width() - f1 * 2.0f, this.i - this.f, this.d);
        }
        canvas0.restoreToCount(v1);
        int v2 = canvas0.save();
        canvas0.translate(this.e.left + f1, this.e.bottom - f1);
        canvas0.rotate(270.0f);
        canvas0.drawPath(this.g, this.c);
        if(z1) {
            canvas0.drawRect(0.0f, f, this.e.height() - f1 * 2.0f, -this.f, this.d);
        }
        canvas0.restoreToCount(v2);
        int v3 = canvas0.save();
        canvas0.translate(this.e.right - f1, this.e.top + f1);
        canvas0.rotate(90.0f);
        canvas0.drawPath(this.g, this.c);
        if(z1) {
            canvas0.drawRect(0.0f, f, this.e.height() - f1 * 2.0f, -this.f, this.d);
        }
        canvas0.restoreToCount(v3);
    }

    ColorStateList f() {
        return this.k;
    }

    float g() {
        return this.f;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect0) {
        int v = (int)Math.ceil(RoundRectDrawableWithShadow.d(this.h, this.f, this.o));
        int v1 = (int)Math.ceil(RoundRectDrawableWithShadow.c(this.h, this.f, this.o));
        rect0.set(v1, v, v1, v);
        return true;
    }

    void h(Rect rect0) {
        this.getPadding(rect0);
    }

    float i() {
        return this.h;
    }

    // 去混淆评级： 低(30)
    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.k != null && this.k.isStateful() || super.isStateful();
    }

    float j() {
        return Math.max(this.h, this.f + ((float)this.a) + this.h * 1.5f / 2.0f) * 2.0f + (this.h * 1.5f + ((float)this.a)) * 2.0f;
    }

    float k() {
        return Math.max(this.h, this.f + ((float)this.a) + this.h / 2.0f) * 2.0f + (this.h + ((float)this.a)) * 2.0f;
    }

    float l() {
        return this.j;
    }

    void m(boolean z) {
        this.o = z;
        this.invalidateSelf();
    }

    private void n(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(0);
        }
        this.k = colorStateList0;
        this.b.setColor(colorStateList0.getColorForState(this.getState(), this.k.getDefaultColor()));
    }

    void o(@Nullable ColorStateList colorStateList0) {
        this.n(colorStateList0);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.l = true;
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        int v = this.k.getColorForState(arr_v, this.k.getDefaultColor());
        if(this.b.getColor() == v) {
            return false;
        }
        this.b.setColor(v);
        this.l = true;
        this.invalidateSelf();
        return true;
    }

    void p(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f1 = (float)(((int)(f + 0.5f)));
        if(this.f == f1) {
            return;
        }
        this.f = f1;
        this.l = true;
        this.invalidateSelf();
    }

    void q(float f) {
        this.s(this.j, f);
    }

    void r(float f) {
        this.s(f, this.h);
    }

    private void s(float f, float f1) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if(f1 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f1 + ". Must be >= 0");
        }
        float f2 = (float)this.t(f);
        float f3 = (float)this.t(f1);
        if(f2 > f3) {
            if(!this.p) {
                this.p = true;
            }
            f2 = f3;
        }
        if(this.j == f2 && this.h == f3) {
            return;
        }
        this.j = f2;
        this.h = f3;
        this.i = (float)(((int)(f2 * 1.5f + ((float)this.a) + 0.5f)));
        this.l = true;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.b.setAlpha(v);
        this.c.setAlpha(v);
        this.d.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.b.setColorFilter(colorFilter0);
    }

    private int t(float f) {
        return ((int)(f + 0.5f)) % 2 == 1 ? ((int)(f + 0.5f)) - 1 : ((int)(f + 0.5f));
    }
}

