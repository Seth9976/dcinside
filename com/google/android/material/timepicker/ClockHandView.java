package com.google.android.material.timepicker;

import H1.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.M;
import com.google.android.material.motion.j;
import java.util.ArrayList;
import java.util.List;

class ClockHandView extends View {
    public interface b {
        void b(@FloatRange(from = 0.0, to = 360.0) float arg1, boolean arg2);
    }

    public interface c {
        void k(@FloatRange(from = 0.0, to = 360.0) float arg1, boolean arg2);
    }

    private final int a;
    private final TimeInterpolator b;
    private final ValueAnimator c;
    private boolean d;
    private float e;
    private float f;
    private boolean g;
    private final int h;
    private boolean i;
    private final List j;
    private final int k;
    private final float l;
    private final Paint m;
    private final RectF n;
    @Px
    private final int o;
    private float p;
    private boolean q;
    private b r;
    private double s;
    private int t;
    private int u;
    private static final int v = 200;

    public ClockHandView(Context context0) {
        this(context0, null);
    }

    public ClockHandView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialClockStyle);
    }

    public ClockHandView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = new ValueAnimator();
        this.j = new ArrayList();
        Paint paint0 = new Paint();
        this.m = paint0;
        this.n = new RectF();
        this.u = 1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ClockHandView, v, style.Widget_MaterialComponents_TimePicker_Clock);
        this.a = j.f(context0, attr.motionDurationLong2, 200);
        this.b = j.g(context0, attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.b);
        this.t = typedArray0.getDimensionPixelSize(styleable.ClockHandView_materialCircleRadius, 0);
        this.k = typedArray0.getDimensionPixelSize(styleable.ClockHandView_selectorSize, 0);
        Resources resources0 = this.getResources();
        this.o = resources0.getDimensionPixelSize(dimen.material_clock_hand_stroke_width);
        this.l = (float)resources0.getDimensionPixelSize(dimen.material_clock_hand_center_dot_radius);
        int v1 = typedArray0.getColor(styleable.ClockHandView_clockHandColor, 0);
        paint0.setAntiAlias(true);
        paint0.setColor(v1);
        this.q(0.0f);
        this.h = ViewConfiguration.get(context0).getScaledTouchSlop();
        ViewCompat.b2(this, 2);
        typedArray0.recycle();
    }

    public void b(c clockHandView$c0) {
        this.j.add(clockHandView$c0);
    }

    private void c(float f, float f1) {
        this.u = a.a(this.getWidth() / 2, this.getHeight() / 2, f, f1) <= ((float)this.i(2)) + M.i(this.getContext(), 12) ? 2 : 1;
    }

    private void d(Canvas canvas0) {
        int v = this.getHeight();
        int v1 = this.getWidth();
        int v2 = this.i(this.u);
        float f = ((float)Math.cos(this.s)) * ((float)v2) + ((float)(v1 / 2));
        float f1 = ((float)v2) * ((float)Math.sin(this.s)) + ((float)(v / 2));
        this.m.setStrokeWidth(0.0f);
        canvas0.drawCircle(f, f1, ((float)this.k), this.m);
        double f2 = Math.sin(this.s);
        double f3 = Math.cos(this.s);
        double f4 = (double)(((float)(v2 - this.k)));
        this.m.setStrokeWidth(((float)this.o));
        canvas0.drawLine(((float)(v1 / 2)), ((float)(v / 2)), ((float)(v1 / 2 + ((int)(f3 * f4)))), ((float)(v / 2 + ((int)(f4 * f2)))), this.m);
        canvas0.drawCircle(((float)(v1 / 2)), ((float)(v / 2)), this.l, this.m);
    }

    int e() {
        return this.u;
    }

    public RectF f() {
        return this.n;
    }

    private int g(float f, float f1) {
        int v = this.getWidth();
        int v1 = (int)Math.toDegrees(Math.atan2(f1 - ((float)(this.getHeight() / 2)), f - ((float)(v / 2))));
        return v1 + 90 >= 0 ? v1 + 90 : v1 + 450;
    }

    @FloatRange(from = 0.0, to = 360.0)
    public float h() {
        return this.p;
    }

    @Dimension
    private int i(int v) {
        return v == 2 ? Math.round(((float)this.t) * 0.66f) : this.t;
    }

    public int j() {
        return this.k;
    }

    private Pair k(float f) {
        float f1 = this.h();
        if(Math.abs(f1 - f) > 180.0f) {
            if(f1 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if(f1 < 180.0f && f > 180.0f) {
                f1 += 360.0f;
            }
        }
        return new Pair(f1, f);
    }

    private boolean l(float f, float f1, boolean z, boolean z1, boolean z2) {
        int v = this.g(f, f1);
        boolean z3 = false;
        boolean z4 = this.h() != ((float)v);
        if(z1 && z4) {
            return true;
        }
        if(!z4 && !z) {
            return false;
        }
        if(z2 && this.d) {
            z3 = true;
        }
        this.r(((float)v), z3);
        return true;
    }

    // 检测为 Lambda 实现
    private void m(ValueAnimator valueAnimator0) [...]

    public void n(boolean z) {
        this.d = z;
    }

    public void o(@Dimension int v) {
        this.t = v;
        this.invalidate();
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        this.d(canvas0);
    }

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(!this.c.isRunning()) {
            this.q(this.h());
        }
    }

    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z1;
        boolean z;
        boolean z2;
        int v = motionEvent0.getActionMasked();
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        switch(v) {
            case 0: {
                this.e = f;
                this.f = f1;
                this.g = true;
                this.q = false;
                z = false;
                z1 = false;
                z2 = true;
                break;
            }
            case 1: {
            label_16:
                int v1 = (int)(f - this.e);
                int v2 = (int)(f1 - this.f);
                this.g = v1 * v1 + v2 * v2 > this.h;
                boolean z3 = this.q;
                z = v == 1;
                if(this.i) {
                    this.c(f, f1);
                }
                z1 = z3;
                z2 = false;
                break;
            }
            default: {
                if(v == 2) {
                    goto label_16;
                }
                else {
                    z = false;
                    z1 = false;
                }
                z2 = false;
                break;
            }
        }
        boolean z4 = this.q;
        int v3 = this.l(f, f1, z1, z2, z) | z4;
        this.q = v3;
        if(v3 != 0 && z) {
            b clockHandView$b0 = this.r;
            if(clockHandView$b0 != null) {
                clockHandView$b0.b(((float)this.g(f, f1)), this.g);
            }
        }
        return true;
    }

    void p(int v) {
        this.u = v;
        this.invalidate();
    }

    public void q(@FloatRange(from = 0.0, to = 360.0) float f) {
        this.r(f, false);
    }

    public void r(@FloatRange(from = 0.0, to = 360.0) float f, boolean z) {
        class com.google.android.material.timepicker.ClockHandView.a extends AnimatorListenerAdapter {
            final ClockHandView a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                animator0.end();
            }
        }

        ValueAnimator valueAnimator0 = this.c;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        if(!z) {
            this.s(f, false);
            return;
        }
        Pair pair0 = this.k(f);
        this.c.setFloatValues(new float[]{((float)(((Float)pair0.first))), ((float)(((Float)pair0.second)))});
        this.c.setDuration(((long)this.a));
        this.c.setInterpolator(this.b);
        com.google.android.material.timepicker.c c0 = (ValueAnimator valueAnimator0) -> this.s(((float)(((Float)valueAnimator0.getAnimatedValue()))), true);
        this.c.addUpdateListener(c0);
        com.google.android.material.timepicker.ClockHandView.a clockHandView$a0 = new com.google.android.material.timepicker.ClockHandView.a(this);
        this.c.addListener(clockHandView$a0);
        this.c.start();
    }

    private void s(@FloatRange(from = 0.0, to = 360.0) float f, boolean z) {
        this.p = f % 360.0f;
        this.s = Math.toRadians(f % 360.0f - 90.0f);
        int v = this.getHeight();
        int v1 = this.getWidth();
        float f1 = (float)this.i(this.u);
        float f2 = ((float)(v1 / 2)) + ((float)Math.cos(this.s)) * f1;
        float f3 = ((float)(v / 2)) + f1 * ((float)Math.sin(this.s));
        this.n.set(f2 - ((float)this.k), f3 - ((float)this.k), f2 + ((float)this.k), f3 + ((float)this.k));
        for(Object object0: this.j) {
            ((c)object0).k(f % 360.0f, z);
        }
        this.invalidate();
    }

    void t(boolean z) {
        if(this.i && !z) {
            this.u = 1;
        }
        this.i = z;
        this.invalidate();
    }

    public void u(b clockHandView$b0) {
        this.r = clockHandView$b0;
    }
}

