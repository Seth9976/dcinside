package androidx.swiperefreshlayout.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressDrawable extends Drawable implements Animatable {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    static class Ring {
        final RectF a;
        final Paint b;
        final Paint c;
        final Paint d;
        float e;
        float f;
        float g;
        float h;
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float p;
        float q;
        int r;
        int s;
        int t;
        int u;

        Ring() {
            this.a = new RectF();
            Paint paint0 = new Paint();
            this.b = paint0;
            Paint paint1 = new Paint();
            this.c = paint1;
            Paint paint2 = new Paint();
            this.d = paint2;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 0xFF;
            paint0.setStrokeCap(Paint.Cap.SQUARE);
            paint0.setAntiAlias(true);
            paint0.setStyle(Paint.Style.STROKE);
            paint1.setStyle(Paint.Style.FILL);
            paint1.setAntiAlias(true);
            paint2.setColor(0);
        }

        void A(int v) {
            this.d.setColor(v);
        }

        void B(float f) {
            this.q = f;
        }

        void C(int v) {
            this.u = v;
        }

        void D(ColorFilter colorFilter0) {
            this.b.setColorFilter(colorFilter0);
        }

        void E(int v) {
            this.j = v;
            this.u = this.i[v];
        }

        void F(@NonNull int[] arr_v) {
            this.i = arr_v;
            this.E(0);
        }

        void G(float f) {
            this.f = f;
        }

        void H(float f) {
            this.g = f;
        }

        void I(boolean z) {
            if(this.n != z) {
                this.n = z;
            }
        }

        void J(float f) {
            this.e = f;
        }

        void K(Paint.Cap paint$Cap0) {
            this.b.setStrokeCap(paint$Cap0);
        }

        void L(float f) {
            this.h = f;
            this.b.setStrokeWidth(f);
        }

        void M() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        void a(Canvas canvas0, Rect rect0) {
            float f = this.q <= 0.0f ? ((float)Math.min(rect0.width(), rect0.height())) / 2.0f - Math.max(((float)this.r) * this.p / 2.0f, this.h / 2.0f) : this.h / 2.0f + this.q;
            this.a.set(((float)rect0.centerX()) - f, ((float)rect0.centerY()) - f, ((float)rect0.centerX()) + f, ((float)rect0.centerY()) + f);
            float f1 = (this.e + this.g) * 360.0f;
            float f2 = (this.f + this.g) * 360.0f - f1;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f3 = this.h / 2.0f;
            this.a.inset(f3, f3);
            canvas0.drawCircle(this.a.centerX(), this.a.centerY(), this.a.width() / 2.0f, this.d);
            this.a.inset(-f3, -f3);
            canvas0.drawArc(this.a, f1, f2, false, this.b);
            this.b(canvas0, f1, f2, this.a);
        }

        void b(Canvas canvas0, float f, float f1, RectF rectF0) {
            if(this.n) {
                Path path0 = this.o;
                if(path0 == null) {
                    Path path1 = new Path();
                    this.o = path1;
                    path1.setFillType(Path.FillType.EVEN_ODD);
                }
                else {
                    path0.reset();
                }
                float f2 = Math.min(rectF0.width(), rectF0.height());
                float f3 = ((float)this.r) * this.p / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(((float)this.r) * this.p, 0.0f);
                this.o.lineTo(((float)this.r) * this.p / 2.0f, ((float)this.s) * this.p);
                this.o.offset(f2 / 2.0f + rectF0.centerX() - f3, rectF0.centerY() + this.h / 2.0f);
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas0.save();
                canvas0.rotate(f + f1, rectF0.centerX(), rectF0.centerY());
                canvas0.drawPath(this.o, this.c);
                canvas0.restore();
            }
        }

        int c() {
            return this.t;
        }

        float d() {
            return (float)this.s;
        }

        float e() {
            return this.p;
        }

        float f() {
            return (float)this.r;
        }

        int g() {
            return this.d.getColor();
        }

        float h() {
            return this.q;
        }

        int[] i() {
            return this.i;
        }

        float j() {
            return this.f;
        }

        int k() {
            int[] arr_v = this.i;
            return arr_v[this.l()];
        }

        int l() {
            return (this.j + 1) % this.i.length;
        }

        float m() {
            return this.g;
        }

        boolean n() {
            return this.n;
        }

        float o() {
            return this.e;
        }

        int p() {
            return this.i[this.j];
        }

        float q() {
            return this.l;
        }

        float r() {
            return this.m;
        }

        float s() {
            return this.k;
        }

        Paint.Cap t() {
            return this.b.getStrokeCap();
        }

        float u() {
            return this.h;
        }

        void v() {
            this.E(this.l());
        }

        void w() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            this.J(0.0f);
            this.G(0.0f);
            this.H(0.0f);
        }

        void x(int v) {
            this.t = v;
        }

        void y(float f, float f1) {
            this.r = (int)f;
            this.s = (int)f1;
        }

        void z(float f) {
            if(f != this.p) {
                this.p = f;
            }
        }
    }

    private final Ring a;
    private float b;
    private Resources c;
    private Animator d;
    float e;
    boolean f;
    private static final Interpolator g = null;
    private static final Interpolator h = null;
    public static final int i = 0;
    private static final float j = 11.0f;
    private static final float k = 3.0f;
    private static final int l = 12;
    private static final int m = 6;
    public static final int n = 1;
    private static final float o = 7.5f;
    private static final float p = 2.5f;
    private static final int q = 10;
    private static final int r = 5;
    private static final int[] s = null;
    private static final float t = 0.75f;
    private static final float u = 0.5f;
    private static final int v = 0x534;
    private static final float w = 216.0f;
    private static final float x = 0.8f;
    private static final float y = 0.01f;
    private static final float z = 0.21f;

    static {
        CircularProgressDrawable.g = new LinearInterpolator();
        CircularProgressDrawable.h = new FastOutSlowInInterpolator();
        CircularProgressDrawable.s = new int[]{0xFF000000};
    }

    public CircularProgressDrawable(@NonNull Context context0) {
        this.c = ((Context)Preconditions.l(context0)).getResources();
        Ring circularProgressDrawable$Ring0 = new Ring();
        this.a = circularProgressDrawable$Ring0;
        circularProgressDrawable$Ring0.F(CircularProgressDrawable.s);
        this.E(2.5f);
        this.G();
    }

    private void A(float f) {
        this.b = f;
    }

    private void B(float f, float f1, float f2, float f3) {
        float f4 = this.c.getDisplayMetrics().density;
        this.a.L(f1 * f4);
        this.a.B(f * f4);
        this.a.E(0);
        this.a.y(f2 * f4, f3 * f4);
    }

    public void C(float f, float f1) {
        this.a.J(f);
        this.a.G(f1);
        this.invalidateSelf();
    }

    public void D(@NonNull Paint.Cap paint$Cap0) {
        this.a.K(paint$Cap0);
        this.invalidateSelf();
    }

    public void E(float f) {
        this.a.L(f);
        this.invalidateSelf();
    }

    public void F(int v) {
        if(v == 0) {
            this.B(11.0f, 3.0f, 12.0f, 6.0f);
        }
        else {
            this.B(7.5f, 2.5f, 10.0f, 5.0f);
        }
        this.invalidateSelf();
    }

    private void G() {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            final CircularProgressDrawable b;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                CircularProgressDrawable.this.H(f, this.a);
                CircularProgressDrawable.this.c(f, this.a, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        valueAnimator0.setRepeatCount(-1);
        valueAnimator0.setRepeatMode(1);
        valueAnimator0.setInterpolator(CircularProgressDrawable.g);
        valueAnimator0.addListener(new Animator.AnimatorListener() {
            final CircularProgressDrawable b;

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
                CircularProgressDrawable.this.c(1.0f, this.a, true);
                this.a.M();
                this.a.v();
                CircularProgressDrawable circularProgressDrawable0 = CircularProgressDrawable.this;
                if(circularProgressDrawable0.f) {
                    circularProgressDrawable0.f = false;
                    animator0.cancel();
                    animator0.setDuration(0x534L);
                    animator0.start();
                    this.a.I(false);
                    return;
                }
                ++circularProgressDrawable0.e;
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                CircularProgressDrawable.this.e = 0.0f;
            }
        });
        this.d = valueAnimator0;
    }

    void H(float f, Ring circularProgressDrawable$Ring0) {
        if(f > 0.75f) {
            circularProgressDrawable$Ring0.C(this.f((f - 0.75f) / 0.25f, circularProgressDrawable$Ring0.p(), circularProgressDrawable$Ring0.k()));
            return;
        }
        circularProgressDrawable$Ring0.C(circularProgressDrawable$Ring0.p());
    }

    private void a(float f, Ring circularProgressDrawable$Ring0) {
        this.H(f, circularProgressDrawable$Ring0);
        circularProgressDrawable$Ring0.J(circularProgressDrawable$Ring0.s() + (circularProgressDrawable$Ring0.q() - 0.01f - circularProgressDrawable$Ring0.s()) * f);
        circularProgressDrawable$Ring0.G(circularProgressDrawable$Ring0.q());
        circularProgressDrawable$Ring0.H(circularProgressDrawable$Ring0.r() + (((float)(Math.floor(circularProgressDrawable$Ring0.r() / 0.8f) + 1.0)) - circularProgressDrawable$Ring0.r()) * f);
    }

    void c(float f, Ring circularProgressDrawable$Ring0, boolean z) {
        float f3;
        float f2;
        if(this.f) {
            this.a(f, circularProgressDrawable$Ring0);
            return;
        }
        if(f != 1.0f || z) {
            float f1 = circularProgressDrawable$Ring0.r();
            if(f < 0.5f) {
                f2 = circularProgressDrawable$Ring0.s();
                f3 = CircularProgressDrawable.h.getInterpolation(f / 0.5f) * 0.79f + 0.01f + f2;
            }
            else {
                float f4 = circularProgressDrawable$Ring0.s();
                f2 = f4 + 0.79f - ((1.0f - CircularProgressDrawable.h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f + 0.01f);
                f3 = f4 + 0.79f;
            }
            float f5 = (f + this.e) * 216.0f;
            circularProgressDrawable$Ring0.J(f2);
            circularProgressDrawable$Ring0.G(f3);
            circularProgressDrawable$Ring0.H(f1 + 0.21f * f);
            this.A(f5);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        canvas0.save();
        canvas0.rotate(this.b, rect0.exactCenterX(), rect0.exactCenterY());
        this.a.a(canvas0, rect0);
        canvas0.restore();
    }

    private int f(float f, int v, int v1) {
        int v2 = v >> 24 & 0xFF;
        int v3 = v >> 16 & 0xFF;
        int v4 = v >> 8 & 0xFF;
        return v2 + ((int)(((float)((v1 >> 24 & 0xFF) - v2)) * f)) << 24 | v3 + ((int)(((float)((v1 >> 16 & 0xFF) - v3)) * f)) << 16 | v4 + ((int)(((float)((v1 >> 8 & 0xFF) - v4)) * f)) << 8 | (v & 0xFF) + ((int)(f * ((float)((v1 & 0xFF) - (v & 0xFF)))));
    }

    public boolean g() {
        return this.a.n();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.c();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.a.d();
    }

    public float i() {
        return this.a.e();
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.d.isRunning();
    }

    public float j() {
        return this.a.f();
    }

    public int k() {
        return this.a.g();
    }

    public float l() {
        return this.a.h();
    }

    @NonNull
    public int[] m() {
        return this.a.i();
    }

    public float n() {
        return this.a.j();
    }

    public float o() {
        return this.a.m();
    }

    private float p() {
        return this.b;
    }

    public float q() {
        return this.a.o();
    }

    @NonNull
    public Paint.Cap r() {
        return this.a.t();
    }

    public float s() {
        return this.a.u();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.a.x(v);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.a.D(colorFilter0);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        this.d.cancel();
        this.a.M();
        if(this.a.j() != this.a.o()) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
            return;
        }
        this.a.E(0);
        this.a.w();
        this.d.setDuration(0x534L);
        this.d.start();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.d.cancel();
        this.A(0.0f);
        this.a.I(false);
        this.a.E(0);
        this.a.w();
        this.invalidateSelf();
    }

    public void t(float f, float f1) {
        this.a.y(f, f1);
        this.invalidateSelf();
    }

    public void u(boolean z) {
        this.a.I(z);
        this.invalidateSelf();
    }

    public void v(float f) {
        this.a.z(f);
        this.invalidateSelf();
    }

    public void w(int v) {
        this.a.A(v);
        this.invalidateSelf();
    }

    public void x(float f) {
        this.a.B(f);
        this.invalidateSelf();
    }

    public void y(@NonNull int[] arr_v) {
        this.a.F(arr_v);
        this.a.E(0);
        this.invalidateSelf();
    }

    public void z(float f) {
        this.a.H(f);
        this.invalidateSelf();
    }
}

