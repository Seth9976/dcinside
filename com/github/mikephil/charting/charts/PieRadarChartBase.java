package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.github.mikephil.charting.animation.b.C;
import com.github.mikephil.charting.components.e.d;
import com.github.mikephil.charting.components.e.e;
import com.github.mikephil.charting.components.e.f;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.listener.g;
import com.github.mikephil.charting.utils.k;

public abstract class PieRadarChartBase extends Chart {
    static class b {
        static final int[] a;
        static final int[] b;
        static final int[] c;

        static {
            int[] arr_v = new int[e.values().length];
            b.c = arr_v;
            try {
                arr_v[e.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.c[e.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[d.values().length];
            b.b = arr_v1;
            try {
                arr_v1[d.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.b[d.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.b[d.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[f.values().length];
            b.a = arr_v2;
            try {
                arr_v2[f.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[f.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private float N;
    private float O;
    protected boolean P;
    protected float Q;

    public PieRadarChartBase(Context context0) {
        super(context0);
        this.N = 270.0f;
        this.O = 270.0f;
        this.P = true;
        this.Q = 0.0f;
    }

    public PieRadarChartBase(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.N = 270.0f;
        this.O = 270.0f;
        this.P = true;
        this.Q = 0.0f;
    }

    public PieRadarChartBase(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.N = 270.0f;
        this.O = 270.0f;
        this.P = true;
        this.Q = 0.0f;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void H() {
        super.H();
        this.n = new g(this);
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    public void O() {
        if(this.b == null) {
            return;
        }
        this.o();
        if(this.l != null) {
            this.q.a(this.b);
        }
        this.p();
    }

    public float Z(float f, float f1) {
        com.github.mikephil.charting.utils.g g0 = this.getCenterOffsets();
        float f2 = f > g0.c ? f - g0.c : g0.c - f;
        float f3 = f1 > g0.d ? f1 - g0.d : g0.d - f1;
        com.github.mikephil.charting.utils.g.h(g0);
        return (float)Math.sqrt(Math.pow(f2, 2.0) + Math.pow(f3, 2.0));
    }

    public float a0(float f, float f1) {
        com.github.mikephil.charting.utils.g g0 = this.getCenterOffsets();
        double f2 = (double)(f - g0.c);
        double f3 = (double)(f1 - g0.d);
        float f4 = (float)Math.toDegrees(Math.acos(f3 / Math.sqrt(f2 * f2 + f3 * f3)));
        if(f > g0.c) {
            f4 = 360.0f - f4;
        }
        float f5 = f4 + 90.0f;
        com.github.mikephil.charting.utils.g.h(g0);
        return f5 > 360.0f ? f5 - 360.0f : f4 + 90.0f;
    }

    public abstract int b0(float arg1);

    public com.github.mikephil.charting.utils.g c0(com.github.mikephil.charting.utils.g g0, float f, float f1) {
        com.github.mikephil.charting.utils.g g1 = com.github.mikephil.charting.utils.g.c(0.0f, 0.0f);
        this.d0(g0, f, f1, g1);
        return g1;
    }

    @Override  // android.view.View
    public void computeScroll() {
        com.github.mikephil.charting.listener.b b0 = this.n;
        if(b0 instanceof g) {
            ((g)b0).i();
        }
    }

    public void d0(com.github.mikephil.charting.utils.g g0, float f, float f1, com.github.mikephil.charting.utils.g g1) {
        g1.c = (float)(((double)g0.c) + Math.cos(Math.toRadians(f1)) * ((double)f));
        g1.d = (float)(((double)g0.d) + ((double)f) * Math.sin(Math.toRadians(f1)));
    }

    public boolean e0() {
        return this.P;
    }

    @SuppressLint({"NewApi"})
    public void f0(int v, float f, float f1, C b$C0) {
        class a implements ValueAnimator.AnimatorUpdateListener {
            final PieRadarChartBase a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                PieRadarChartBase.this.postInvalidate();
            }
        }

        this.setRotationAngle(f);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, "rotationAngle", new float[]{f, f1});
        objectAnimator0.setDuration(((long)v));
        objectAnimator0.setInterpolator(b$C0);
        objectAnimator0.addUpdateListener(new a(this));
        objectAnimator0.start();
    }

    public float getDiameter() {
        RectF rectF0 = this.t.q();
        rectF0.left += this.getExtraLeftOffset();
        rectF0.top += this.getExtraTopOffset();
        rectF0.right -= this.getExtraRightOffset();
        rectF0.bottom -= this.getExtraBottomOffset();
        return Math.min(rectF0.width(), rectF0.height());
    }

    @Override  // s1.e
    public int getMaxVisibleCount() {
        return this.b.r();
    }

    public float getMinOffset() {
        return this.Q;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.O;
    }

    protected abstract float getRequiredBaseOffset();

    protected abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.N;
    }

    @Override  // s1.e
    public float getYChartMax() {
        return 0.0f;
    }

    @Override  // s1.e
    public float getYChartMin() {
        return 0.0f;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void o() {
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(this.j) {
            com.github.mikephil.charting.listener.b b0 = this.n;
            return b0 == null ? super.onTouchEvent(motionEvent0) : b0.onTouch(this, motionEvent0);
        }
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    public void p() {
        float f14;
        float f13;
        float f12;
        float f4;
        float f3;
        float f2;
        float f10;
        float f = 0.0f;
        if(this.l == null || !this.l.f() || this.l.H()) {
            f12 = 0.0f;
            f14 = 0.0f;
            f13 = 0.0f;
        }
        else {
            float f1 = Math.min(this.l.x, this.t.o() * this.l.z());
        alab1:
            switch(this.l.C()) {
                case 1: {
                    if(this.l.y() != d.a && this.l.y() != d.c) {
                        f2 = 0.0f;
                    }
                    else if(this.l.E() == f.b) {
                        f2 = f1 + k.e(13.0f);
                    }
                    else {
                        f2 = f1 + k.e(8.0f);
                        float f5 = this.l.y + this.l.z;
                        com.github.mikephil.charting.utils.g g0 = this.getCenter();
                        float f6 = this.l.y() == d.c ? ((float)this.getWidth()) - f2 + 15.0f : f2 - 15.0f;
                        float f7 = this.Z(f6, f5 + 15.0f);
                        com.github.mikephil.charting.utils.g g1 = this.c0(g0, this.getRadius(), this.a0(f6, f5 + 15.0f));
                        float f8 = this.Z(g1.c, g1.d);
                        float f9 = k.e(5.0f);
                        if(f5 + 15.0f < g0.d || ((float)this.getHeight()) - f2 <= ((float)this.getWidth())) {
                            f2 = f7 < f8 ? f9 + (f8 - f7) : 0.0f;
                        }
                        com.github.mikephil.charting.utils.g.h(g0);
                        com.github.mikephil.charting.utils.g.h(g1);
                    }
                    switch(this.l.y()) {
                        case 1: {
                            f = f2;
                            f2 = 0.0f;
                            f3 = 0.0f;
                            f4 = 0.0f;
                            break alab1;
                        }
                        case 2: {
                            f3 = 0.0f;
                            f4 = 0.0f;
                            break alab1;
                        }
                        case 3: {
                            switch(this.l.E()) {
                                case 1: {
                                    f10 = Math.min(this.l.y, this.t.n() * this.l.z());
                                    goto label_58;
                                }
                                case 2: {
                                    f3 = Math.min(this.l.y, this.t.n() * this.l.z());
                                    f2 = 0.0f;
                                    f4 = 0.0f;
                                    break alab1;
                                }
                                default: {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                    f4 = 0.0f;
                                    break alab1;
                                }
                            }
                        }
                        default: {
                            f2 = 0.0f;
                            f3 = 0.0f;
                            f4 = 0.0f;
                            break alab1;
                        }
                    }
                }
                case 2: {
                    if(this.l.E() != f.a && this.l.E() != f.c) {
                        f2 = 0.0f;
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                    else {
                        float f11 = this.getRequiredLegendOffset();
                        f10 = Math.min(this.l.y + f11, this.t.n() * this.l.z());
                        switch(this.l.E()) {
                            case 1: {
                            label_58:
                                f4 = f10;
                                f2 = 0.0f;
                                f3 = 0.0f;
                                break;
                            }
                            case 2: {
                                f3 = f10;
                                f2 = 0.0f;
                                f4 = 0.0f;
                                break;
                            }
                            default: {
                                f2 = 0.0f;
                                f3 = 0.0f;
                                f4 = 0.0f;
                            }
                        }
                    }
                    break;
                }
                default: {
                    f2 = 0.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                }
            }
            f += this.getRequiredBaseOffset();
            f12 = f2 + this.getRequiredBaseOffset();
            f13 = f4 + this.getRequiredBaseOffset();
            f14 = f3 + this.getRequiredBaseOffset();
        }
        float f15 = k.e(this.Q);
        if(this instanceof RadarChart) {
            j j0 = this.getXAxis();
            if(j0.f() && j0.P()) {
                f15 = Math.max(f15, j0.L);
            }
        }
        float f16 = Math.max(f15, f + this.getExtraLeftOffset());
        float f17 = Math.max(f15, f13 + this.getExtraTopOffset());
        float f18 = Math.max(f15, f12 + this.getExtraRightOffset());
        float f19 = Math.max(f15, Math.max(this.getRequiredBaseOffset(), f14 + this.getExtraBottomOffset()));
        this.t.U(f16, f17, f18, f19);
        if(this.a) {
            Log.i("MPAndroidChart", "offsetLeft: " + f16 + ", offsetTop: " + f17 + ", offsetRight: " + f18 + ", offsetBottom: " + f19);
        }
    }

    public void setMinOffset(float f) {
        this.Q = f;
    }

    public void setRotationAngle(float f) {
        this.O = f;
        this.N = k.z(f);
    }

    public void setRotationEnabled(boolean z) {
        this.P = z;
    }
}

