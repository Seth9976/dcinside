package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DrawerArrowDrawable extends Drawable {
    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    private final Paint a;
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private final Path g;
    private final int h;
    private boolean i;
    private float j;
    private float k;
    private int l;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    private static final float q;

    static {
        DrawerArrowDrawable.q = 0.785398f;
    }

    public DrawerArrowDrawable(Context context0) {
        Paint paint0 = new Paint();
        this.a = paint0;
        this.g = new Path();
        this.i = false;
        this.l = 2;
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeJoin(Paint.Join.MITER);
        paint0.setStrokeCap(Paint.Cap.BUTT);
        paint0.setAntiAlias(true);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(null, styleable.DrawerArrowToggle, attr.drawerArrowStyle, style.Base_Widget_AppCompat_DrawerArrowToggle);
        this.p(typedArray0.getColor(styleable.DrawerArrowToggle_color, 0));
        this.o(typedArray0.getDimension(styleable.DrawerArrowToggle_thickness, 0.0f));
        this.s(typedArray0.getBoolean(styleable.DrawerArrowToggle_spinBars, true));
        this.r(((float)Math.round(typedArray0.getDimension(styleable.DrawerArrowToggle_gapBetweenBars, 0.0f))));
        this.h = typedArray0.getDimensionPixelSize(styleable.DrawerArrowToggle_drawableSize, 0);
        this.c = (float)Math.round(typedArray0.getDimension(styleable.DrawerArrowToggle_barLength, 0.0f));
        this.b = (float)Math.round(typedArray0.getDimension(styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.d = typedArray0.getDimension(styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArray0.recycle();
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.a.getStrokeWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        Rect rect0 = this.getBounds();
        boolean z = false;
        switch(this.l) {
            case 0: {
                break;
            }
            case 1: {
                z = true;
                break;
            }
            case 3: {
                if(DrawableCompat.f(this) == 0) {
                    z = true;
                }
                break;
            }
            default: {
                if(DrawableCompat.f(this) == 1) {
                    z = true;
                }
            }
        }
        float f = this.c + (((float)Math.sqrt(this.b * this.b * 2.0f)) - this.c) * this.j;
        float f1 = this.c + (this.d - this.c) * this.j;
        float f2 = (float)Math.round(0.0f + (this.k - 0.0f) * this.j);
        float f3 = 0.0f + (DrawerArrowDrawable.q - 0.0f) * this.j;
        float f4 = z ? 0.0f : -180.0f;
        float f5 = f4 + ((z ? 180.0f : 0.0f) - f4) * this.j;
        float f6 = (float)Math.round(Math.cos(f3) * ((double)f));
        float f7 = (float)Math.round(((double)f) * Math.sin(f3));
        this.g.rewind();
        float f8 = DrawerArrowDrawable.k(this.e + this.a.getStrokeWidth(), -this.k, this.j);
        this.g.moveTo(-f1 / 2.0f + f2, 0.0f);
        this.g.rLineTo(f1 - f2 * 2.0f, 0.0f);
        this.g.moveTo(-f1 / 2.0f, f8);
        this.g.rLineTo(f6, f7);
        this.g.moveTo(-f1 / 2.0f, -f8);
        this.g.rLineTo(f6, -f7);
        this.g.close();
        canvas0.save();
        float f9 = this.a.getStrokeWidth();
        float f10 = ((float)(((int)(((float)rect0.height()) - 3.0f * f9 - 2.0f * this.e)) / 4 * 2)) + (f9 * 1.5f + this.e);
        canvas0.translate(((float)rect0.centerX()), f10);
        if(this.f) {
            canvas0.rotate(f5 * ((float)((this.i ^ z) == 0 ? 1 : -1)));
        }
        else if(z) {
            canvas0.rotate(180.0f);
        }
        canvas0.drawPath(this.g, this.a);
        canvas0.restore();
    }

    @ColorInt
    public int e() {
        return this.a.getColor();
    }

    public int f() {
        return this.l;
    }

    public float g() {
        return this.e;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.a;
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float i() {
        return this.j;
    }

    public boolean j() {
        return this.f;
    }

    private static float k(float f, float f1, float f2) [...] // Inlined contents

    public void l(float f) {
        if(this.b != f) {
            this.b = f;
            this.invalidateSelf();
        }
    }

    public void m(float f) {
        if(this.d != f) {
            this.d = f;
            this.invalidateSelf();
        }
    }

    public void n(float f) {
        if(this.c != f) {
            this.c = f;
            this.invalidateSelf();
        }
    }

    public void o(float f) {
        if(this.a.getStrokeWidth() != f) {
            this.a.setStrokeWidth(f);
            this.k = (float)(((double)(f / 2.0f)) * Math.cos(DrawerArrowDrawable.q));
            this.invalidateSelf();
        }
    }

    public void p(@ColorInt int v) {
        if(v != this.a.getColor()) {
            this.a.setColor(v);
            this.invalidateSelf();
        }
    }

    public void q(int v) {
        if(v != this.l) {
            this.l = v;
            this.invalidateSelf();
        }
    }

    public void r(float f) {
        if(f != this.e) {
            this.e = f;
            this.invalidateSelf();
        }
    }

    public void s(boolean z) {
        if(this.f != z) {
            this.f = z;
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(v != this.a.getAlpha()) {
            this.a.setAlpha(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0, to = 1.0) float f) {
        if(this.j != f) {
            this.j = f;
            this.invalidateSelf();
        }
    }

    public void t(boolean z) {
        if(this.i != z) {
            this.i = z;
            this.invalidateSelf();
        }
    }
}

