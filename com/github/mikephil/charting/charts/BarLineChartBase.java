package com.github.mikephil.charting.charts;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.github.mikephil.charting.components.e.d;
import com.github.mikephil.charting.components.e.e;
import com.github.mikephil.charting.components.e.f;
import com.github.mikephil.charting.components.k.a;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.jobs.c;
import com.github.mikephil.charting.renderer.g;
import com.github.mikephil.charting.renderer.q;
import com.github.mikephil.charting.renderer.t;
import com.github.mikephil.charting.utils.i;
import s1.b;

@SuppressLint({"RtlHardcoded"})
public abstract class BarLineChartBase extends Chart implements b {
    static class com.github.mikephil.charting.charts.BarLineChartBase.b {
        static final int[] a;
        static final int[] b;
        static final int[] c;

        static {
            int[] arr_v = new int[e.values().length];
            com.github.mikephil.charting.charts.BarLineChartBase.b.c = arr_v;
            try {
                arr_v[e.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.github.mikephil.charting.charts.BarLineChartBase.b.c[e.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[d.values().length];
            com.github.mikephil.charting.charts.BarLineChartBase.b.b = arr_v1;
            try {
                arr_v1[d.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.github.mikephil.charting.charts.BarLineChartBase.b.b[d.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.github.mikephil.charting.charts.BarLineChartBase.b.b[d.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v2 = new int[f.values().length];
            com.github.mikephil.charting.charts.BarLineChartBase.b.a = arr_v2;
            try {
                arr_v2[f.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.github.mikephil.charting.charts.BarLineChartBase.b.a[f.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected boolean M8;
    protected int N;
    private boolean N8;
    protected boolean O;
    private boolean O8;
    protected boolean P;
    private boolean P8;
    protected boolean Q;
    private boolean Q8;
    protected Paint R8;
    protected Paint S8;
    protected boolean T8;
    protected boolean U8;
    protected boolean V8;
    protected float W8;
    protected boolean X8;
    protected com.github.mikephil.charting.listener.f Y8;
    protected k Z8;
    protected k a9;
    protected t b9;
    protected t c9;
    protected i d9;
    protected i e9;
    protected q f9;
    private long g9;
    private long h9;
    private RectF i9;
    protected Matrix j9;
    protected Matrix k9;
    private boolean l9;
    protected float[] m9;
    protected com.github.mikephil.charting.utils.f n9;
    protected com.github.mikephil.charting.utils.f o9;
    protected float[] p9;

    public BarLineChartBase(Context context0) {
        super(context0);
        this.N = 100;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.M8 = true;
        this.N8 = true;
        this.O8 = true;
        this.P8 = true;
        this.Q8 = true;
        this.T8 = false;
        this.U8 = false;
        this.V8 = false;
        this.W8 = 15.0f;
        this.X8 = false;
        this.g9 = 0L;
        this.h9 = 0L;
        this.i9 = new RectF();
        this.j9 = new Matrix();
        this.k9 = new Matrix();
        this.l9 = false;
        this.m9 = new float[2];
        this.n9 = com.github.mikephil.charting.utils.f.b(0.0, 0.0);
        this.o9 = com.github.mikephil.charting.utils.f.b(0.0, 0.0);
        this.p9 = new float[2];
    }

    public BarLineChartBase(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.N = 100;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.M8 = true;
        this.N8 = true;
        this.O8 = true;
        this.P8 = true;
        this.Q8 = true;
        this.T8 = false;
        this.U8 = false;
        this.V8 = false;
        this.W8 = 15.0f;
        this.X8 = false;
        this.g9 = 0L;
        this.h9 = 0L;
        this.i9 = new RectF();
        this.j9 = new Matrix();
        this.k9 = new Matrix();
        this.l9 = false;
        this.m9 = new float[2];
        this.n9 = com.github.mikephil.charting.utils.f.b(0.0, 0.0);
        this.o9 = com.github.mikephil.charting.utils.f.b(0.0, 0.0);
        this.p9 = new float[2];
    }

    public BarLineChartBase(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.N = 100;
        this.O = false;
        this.P = false;
        this.Q = true;
        this.M8 = true;
        this.N8 = true;
        this.O8 = true;
        this.P8 = true;
        this.Q8 = true;
        this.T8 = false;
        this.U8 = false;
        this.V8 = false;
        this.W8 = 15.0f;
        this.X8 = false;
        this.g9 = 0L;
        this.h9 = 0L;
        this.i9 = new RectF();
        this.j9 = new Matrix();
        this.k9 = new Matrix();
        this.l9 = false;
        this.m9 = new float[2];
        this.n9 = com.github.mikephil.charting.utils.f.b(0.0, 0.0);
        this.o9 = com.github.mikephil.charting.utils.f.b(0.0, 0.0);
        this.p9 = new float[2];
    }

    public boolean A0() {
        return this.P8;
    }

    public boolean B0() {
        return this.Q8;
    }

    public void C0(float f, float f1, a k$a0) {
        float f2 = this.g0(k$a0);
        this.g(com.github.mikephil.charting.jobs.d.d(this.t, f, f1 + f2 / this.t.x() / 2.0f, this.d(k$a0), this));
    }

    @TargetApi(11)
    public void D0(float f, float f1, a k$a0, long v) {
        com.github.mikephil.charting.utils.f f2 = this.l0(this.t.h(), this.t.j(), k$a0);
        float f3 = this.g0(k$a0);
        this.g(com.github.mikephil.charting.jobs.a.j(this.t, f, f1 + f3 / this.t.x() / 2.0f, this.d(k$a0), this, ((float)f2.c), ((float)f2.d), v));
        com.github.mikephil.charting.utils.f.c(f2);
    }

    public void E0(float f) {
        this.g(com.github.mikephil.charting.jobs.d.d(this.t, f, 0.0f, this.d(a.a), this));
    }

    protected void F0() {
        this.e9.p(this.a9.I0());
        this.d9.p(this.Z8.I0());
    }

    protected void G0() {
        if(this.a) {
            Log.i("MPAndroidChart", "Preparing Value-Px Matrix, xmin: " + this.i.H + ", xmax: " + this.i.G + ", xdelta: " + this.i.I);
        }
        this.e9.q(this.i.H, this.i.I, this.a9.I, this.a9.H);
        this.d9.q(this.i.H, this.i.I, this.Z8.I, this.Z8.H);
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void H() {
        super.H();
        this.Z8 = new k(a.a);
        this.a9 = new k(a.b);
        this.d9 = new i(this.t);
        this.e9 = new i(this.t);
        this.b9 = new t(this.t, this.Z8, this.d9);
        this.c9 = new t(this.t, this.a9, this.e9);
        this.f9 = new q(this.t, this.i, this.d9);
        this.setHighlighter(new com.github.mikephil.charting.highlight.b(this));
        this.n = new com.github.mikephil.charting.listener.a(this, this.t.r(), 3.0f);
        Paint paint0 = new Paint();
        this.R8 = paint0;
        paint0.setStyle(Paint.Style.FILL);
        this.R8.setColor(Color.rgb(0xF0, 0xF0, 0xF0));
        Paint paint1 = new Paint();
        this.S8 = paint1;
        paint1.setStyle(Paint.Style.STROKE);
        this.S8.setColor(0xFF000000);
        this.S8.setStrokeWidth(com.github.mikephil.charting.utils.k.e(1.0f));
    }

    public void H0() {
        this.g9 = 0L;
        this.h9 = 0L;
    }

    public void I0() {
        this.l9 = false;
        this.p();
    }

    public void J0() {
        this.t.T(this.j9);
        this.t.S(this.j9, this, false);
        this.p();
        this.postInvalidate();
    }

    public void K0(float f, float f1) {
        this.t.c0(f);
        this.t.d0(f1);
    }

    public void L0(float f, float f1, float f2, float f3) {
        class com.github.mikephil.charting.charts.BarLineChartBase.a implements Runnable {
            final float a;
            final float b;
            final float c;
            final float d;
            final BarLineChartBase e;

            com.github.mikephil.charting.charts.BarLineChartBase.a(float f, float f1, float f2, float f3) {
                this.a = f;
                this.b = f1;
                this.c = f2;
                this.d = f3;
                super();
            }

            @Override
            public void run() {
                BarLineChartBase.this.t.U(this.a, this.b, this.c, this.d);
                BarLineChartBase.this.F0();
                BarLineChartBase.this.G0();
            }
        }

        this.l9 = true;
        this.post(new com.github.mikephil.charting.charts.BarLineChartBase.a(this, f, f1, f2, f3));
    }

    public void M0(float f, float f1) {
        float f2 = this.i.I;
        this.t.a0(f2 / f, f2 / f1);
    }

    public void N0(float f, float f1, a k$a0) {
        float f2 = this.g0(k$a0);
        float f3 = this.g0(k$a0);
        this.t.b0(f2 / f, f3 / f1);
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    public void O() {
        if(this.b == null) {
            if(this.a) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
            }
            return;
        }
        if(this.a) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        g g0 = this.r;
        if(g0 != null) {
            g0.j();
        }
        this.o();
        this.b9.a(this.Z8.H, this.Z8.G, this.Z8.I0());
        this.c9.a(this.a9.H, this.a9.G, this.a9.I0());
        this.f9.a(this.i.H, this.i.G, false);
        if(this.l != null) {
            this.q.a(this.b);
        }
        this.p();
    }

    public void O0(float f, a k$a0) {
        float f1 = this.g0(k$a0);
        this.t.d0(f1 / f);
    }

    public void P0(float f, a k$a0) {
        float f1 = this.g0(k$a0);
        this.t.Z(f1 / f);
    }

    public void Q0(float f, float f1, float f2, float f3) {
        this.t.l0(f, f1, f2, -f3, this.j9);
        this.t.S(this.j9, this, false);
        this.p();
        this.postInvalidate();
    }

    public void R0(float f, float f1, float f2, float f3, a k$a0) {
        this.g(com.github.mikephil.charting.jobs.f.d(this.t, f, f1, f2, f3, this.d(k$a0), k$a0, this));
    }

    @TargetApi(11)
    public void S0(float f, float f1, float f2, float f3, a k$a0, long v) {
        com.github.mikephil.charting.utils.f f4 = this.l0(this.t.h(), this.t.j(), k$a0);
        float f5 = this.i.I;
        this.g(c.j(this.t, this, this.d(k$a0), this.f(k$a0), f5, f, f1, this.t.w(), this.t.x(), f2, f3, ((float)f4.c), ((float)f4.d), v));
        com.github.mikephil.charting.utils.f.c(f4);
    }

    public void T0() {
        com.github.mikephil.charting.utils.g g0 = this.t.p();
        this.t.o0(g0.c, -g0.d, this.j9);
        this.t.S(this.j9, this, false);
        com.github.mikephil.charting.utils.g.h(g0);
        this.p();
        this.postInvalidate();
    }

    public void U0() {
        com.github.mikephil.charting.utils.g g0 = this.t.p();
        this.t.q0(g0.c, -g0.d, this.j9);
        this.t.S(this.j9, this, false);
        com.github.mikephil.charting.utils.g.h(g0);
        this.p();
        this.postInvalidate();
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    public void V(Paint paint0, int v) {
        super.V(paint0, v);
        if(v == 4) {
            this.R8 = paint0;
        }
    }

    public void V0(float f, float f1) {
        com.github.mikephil.charting.utils.g g0 = this.getCenterOffsets();
        Matrix matrix0 = this.j9;
        this.t.l0(f, f1, g0.c, -g0.d, matrix0);
        this.t.S(matrix0, this, false);
    }

    protected void Z() {
        float f = this.getLowestVisibleX();
        float f1 = this.getHighestVisibleX();
        ((com.github.mikephil.charting.data.c)this.b).g(f, f1);
        this.i.n(((com.github.mikephil.charting.data.c)this.b).y(), ((com.github.mikephil.charting.data.c)this.b).x());
        if(this.Z8.f()) {
            this.Z8.n(((com.github.mikephil.charting.data.c)this.b).C(a.a), ((com.github.mikephil.charting.data.c)this.b).A(a.a));
        }
        if(this.a9.f()) {
            this.a9.n(((com.github.mikephil.charting.data.c)this.b).C(a.b), ((com.github.mikephil.charting.data.c)this.b).A(a.b));
        }
        this.p();
    }

    protected void a0(RectF rectF0) {
        rectF0.left = 0.0f;
        rectF0.right = 0.0f;
        rectF0.top = 0.0f;
        rectF0.bottom = 0.0f;
        if(this.l != null && this.l.f() && !this.l.H()) {
        alab1:
            switch(this.l.C()) {
                case 1: {
                    int v = com.github.mikephil.charting.charts.BarLineChartBase.b.b[this.l.y().ordinal()];
                    switch(v) {
                        case 1: {
                            rectF0.left += Math.min(this.l.x, this.t.o() * this.l.z()) + this.l.d();
                            break alab1;
                        }
                        case 2: {
                            rectF0.right += Math.min(this.l.x, this.t.o() * this.l.z()) + this.l.d();
                            return;
                        label_18:
                            if(v == 3) {
                                switch(this.l.E()) {
                                    case 1: {
                                        rectF0.top += Math.min(this.l.y, this.t.n() * this.l.z()) + this.l.e();
                                        return;
                                    }
                                    case 2: {
                                        rectF0.bottom += Math.min(this.l.y, this.t.n() * this.l.z()) + this.l.e();
                                        return;
                                    }
                                    default: {
                                        return;
                                    }
                                }
                            }
                            break alab1;
                        }
                        default: {
                            goto label_18;
                        }
                    }
                }
                case 2: {
                    switch(this.l.E()) {
                        case 1: {
                            rectF0.top += Math.min(this.l.y, this.t.n() * this.l.z()) + this.l.e();
                            return;
                        }
                        case 2: {
                            rectF0.bottom += Math.min(this.l.y, this.t.n() * this.l.z()) + this.l.e();
                        }
                    }
                }
            }
        }
    }

    public void b0(float f, float f1, a k$a0) {
        float f2 = this.g0(k$a0);
        float f3 = this.t.x();
        float f4 = this.getXAxis().I;
        this.g(com.github.mikephil.charting.jobs.d.d(this.t, f - f4 / this.t.w() / 2.0f, f1 + f2 / f3 / 2.0f, this.d(k$a0), this));
    }

    @TargetApi(11)
    public void c0(float f, float f1, a k$a0, long v) {
        com.github.mikephil.charting.utils.f f2 = this.l0(this.t.h(), this.t.j(), k$a0);
        float f3 = this.g0(k$a0);
        float f4 = this.t.x();
        float f5 = this.getXAxis().I;
        this.g(com.github.mikephil.charting.jobs.a.j(this.t, f - f5 / this.t.w() / 2.0f, f1 + f3 / f4 / 2.0f, this.d(k$a0), this, ((float)f2.c), ((float)f2.d), v));
        com.github.mikephil.charting.utils.f.c(f2);
    }

    @Override  // android.view.View
    public void computeScroll() {
        com.github.mikephil.charting.listener.b b0 = this.n;
        if(b0 instanceof com.github.mikephil.charting.listener.a) {
            ((com.github.mikephil.charting.listener.a)b0).h();
        }
    }

    @Override  // s1.b
    public i d(a k$a0) {
        return k$a0 == a.a ? this.d9 : this.e9;
    }

    public void d0(float f, a k$a0) {
        float f1 = this.g0(k$a0);
        this.g(com.github.mikephil.charting.jobs.d.d(this.t, 0.0f, f + f1 / this.t.x() / 2.0f, this.d(k$a0), this));
    }

    @Override  // s1.b
    public boolean e(a k$a0) {
        return this.f(k$a0).I0();
    }

    protected void e0(Canvas canvas0) {
        if(this.T8) {
            canvas0.drawRect(this.t.q(), this.R8);
        }
        if(this.U8) {
            canvas0.drawRect(this.t.q(), this.S8);
        }
    }

    public k f(a k$a0) {
        return k$a0 == a.a ? this.Z8 : this.a9;
    }

    public void f0() {
        Matrix matrix0 = this.k9;
        this.t.m(matrix0);
        this.t.S(matrix0, this, false);
        this.p();
        this.postInvalidate();
    }

    protected float g0(a k$a0) {
        return k$a0 == a.a ? this.Z8.I : this.a9.I;
    }

    public k getAxisLeft() {
        return this.Z8;
    }

    public k getAxisRight() {
        return this.a9;
    }

    @Override  // s1.b
    public com.github.mikephil.charting.data.c getData() {
        return (com.github.mikephil.charting.data.c)super.getData();
    }

    public com.github.mikephil.charting.listener.f getDrawListener() {
        return this.Y8;
    }

    @Override  // s1.b
    public float getHighestVisibleX() {
        this.d(a.a).k(this.t.i(), this.t.f(), this.o9);
        return (float)Math.min(this.i.G, this.o9.c);
    }

    @Override  // s1.b
    public float getLowestVisibleX() {
        this.d(a.a).k(this.t.h(), this.t.f(), this.n9);
        return (float)Math.max(this.i.H, this.n9.c);
    }

    @Override  // s1.e
    public int getMaxVisibleCount() {
        return this.N;
    }

    public float getMinOffset() {
        return this.W8;
    }

    public t getRendererLeftYAxis() {
        return this.b9;
    }

    public t getRendererRightYAxis() {
        return this.c9;
    }

    public q getRendererXAxis() {
        return this.f9;
    }

    @Override  // android.view.View
    public float getScaleX() {
        return this.t == null ? 1.0f : this.t.w();
    }

    @Override  // android.view.View
    public float getScaleY() {
        return this.t == null ? 1.0f : this.t.x();
    }

    public float getVisibleXRange() {
        return Math.abs(this.getHighestVisibleX() - this.getLowestVisibleX());
    }

    @Override  // s1.e
    public float getYChartMax() {
        return Math.max(this.Z8.G, this.a9.G);
    }

    @Override  // s1.e
    public float getYChartMin() {
        return Math.min(this.Z8.H, this.a9.H);
    }

    public t1.b h0(float f, float f1) {
        com.github.mikephil.charting.highlight.d d0 = this.x(f, f1);
        return d0 == null ? null : ((t1.b)((com.github.mikephil.charting.data.c)this.b).k(d0.d()));
    }

    public Entry i0(float f, float f1) {
        com.github.mikephil.charting.highlight.d d0 = this.x(f, f1);
        return d0 == null ? null : ((com.github.mikephil.charting.data.c)this.b).s(d0);
    }

    public com.github.mikephil.charting.utils.f j0(float f, float f1, a k$a0) {
        return this.d(k$a0).f(f, f1);
    }

    public com.github.mikephil.charting.utils.g k0(Entry entry0, a k$a0) {
        if(entry0 == null) {
            return null;
        }
        float[] arr_f = this.m9;
        arr_f[0] = entry0.l();
        float[] arr_f1 = this.m9;
        arr_f1[1] = entry0.d();
        this.d(k$a0).o(this.m9);
        return com.github.mikephil.charting.utils.g.c(this.m9[0], this.m9[1]);
    }

    public com.github.mikephil.charting.utils.f l0(float f, float f1, a k$a0) {
        com.github.mikephil.charting.utils.f f2 = com.github.mikephil.charting.utils.f.b(0.0, 0.0);
        this.m0(f, f1, k$a0, f2);
        return f2;
    }

    public void m0(float f, float f1, a k$a0, com.github.mikephil.charting.utils.f f2) {
        this.d(k$a0).k(f, f1, f2);
    }

    public boolean n0() {
        return this.t.C();
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void o() {
        this.i.n(((com.github.mikephil.charting.data.c)this.b).y(), ((com.github.mikephil.charting.data.c)this.b).x());
        this.Z8.n(((com.github.mikephil.charting.data.c)this.b).C(a.a), ((com.github.mikephil.charting.data.c)this.b).A(a.a));
        this.a9.n(((com.github.mikephil.charting.data.c)this.b).C(a.b), ((com.github.mikephil.charting.data.c)this.b).A(a.b));
    }

    // 去混淆评级： 低(30)
    public boolean o0() {
        return this.Z8.I0() ? true : this.a9.I0();
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.b == null) {
            return;
        }
        long v = System.currentTimeMillis();
        this.e0(canvas0);
        if(this.O) {
            this.Z();
        }
        if(this.Z8.f()) {
            this.b9.a(this.Z8.H, this.Z8.G, this.Z8.I0());
        }
        if(this.a9.f()) {
            this.c9.a(this.a9.H, this.a9.G, this.a9.I0());
        }
        if(this.i.f()) {
            this.f9.a(this.i.H, this.i.G, false);
        }
        this.f9.h(canvas0);
        this.b9.h(canvas0);
        this.c9.h(canvas0);
        if(this.i.N()) {
            this.f9.i(canvas0);
        }
        if(this.Z8.N()) {
            this.b9.i(canvas0);
        }
        if(this.a9.N()) {
            this.c9.i(canvas0);
        }
        if(this.i.f() && this.i.Q()) {
            this.f9.j(canvas0);
        }
        if(this.Z8.f() && this.Z8.Q()) {
            this.b9.j(canvas0);
        }
        if(this.a9.f() && this.a9.Q()) {
            this.c9.j(canvas0);
        }
        int v1 = canvas0.save();
        canvas0.clipRect(this.t.q());
        this.r.b(canvas0);
        if(!this.i.N()) {
            this.f9.i(canvas0);
        }
        if(!this.Z8.N()) {
            this.b9.i(canvas0);
        }
        if(!this.a9.N()) {
            this.c9.i(canvas0);
        }
        if(this.Y()) {
            this.r.d(canvas0, this.A);
        }
        canvas0.restoreToCount(v1);
        this.r.c(canvas0);
        if(this.i.f() && !this.i.Q()) {
            this.f9.j(canvas0);
        }
        if(this.Z8.f() && !this.Z8.Q()) {
            this.b9.j(canvas0);
        }
        if(this.a9.f() && !this.a9.Q()) {
            this.c9.j(canvas0);
        }
        this.f9.g(canvas0);
        this.b9.g(canvas0);
        this.c9.g(canvas0);
        if(this.q0()) {
            int v2 = canvas0.save();
            canvas0.clipRect(this.t.q());
            this.r.f(canvas0);
            canvas0.restoreToCount(v2);
        }
        else {
            this.r.f(canvas0);
        }
        this.q.f(canvas0);
        this.u(canvas0);
        this.v(canvas0);
        if(this.a) {
            long v3 = System.currentTimeMillis() - v;
            long v4 = this.g9 + v3;
            this.g9 = v4;
            long v5 = this.h9 + 1L;
            this.h9 = v5;
            Log.i("MPAndroidChart", "Drawtime: " + v3 + " ms, average: " + v4 / v5 + " ms, cycles: " + this.h9);
        }
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        float[] arr_f = this.p9;
        arr_f[1] = 0.0f;
        arr_f[0] = 0.0f;
        if(this.X8) {
            arr_f[0] = this.t.h();
            this.p9[1] = this.t.j();
            this.d(a.a).n(this.p9);
        }
        super.onSizeChanged(v, v1, v2, v3);
        if(this.X8) {
            this.d(a.a).o(this.p9);
            this.t.e(this.p9, this);
            return;
        }
        this.t.S(this.t.r(), this, true);
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        super.onTouchEvent(motionEvent0);
        return this.n != null && this.b != null && this.j ? this.n.onTouch(this, motionEvent0) : false;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    public void p() {
        if(!this.l9) {
            this.a0(this.i9);
            float f = this.i9.left + 0.0f;
            float f1 = this.i9.top + 0.0f;
            float f2 = this.i9.right + 0.0f;
            float f3 = this.i9.bottom + 0.0f;
            if(this.Z8.L0()) {
                f += this.Z8.A0(this.b9.c());
            }
            if(this.a9.L0()) {
                f2 += this.a9.A0(this.c9.c());
            }
            if(this.i.f() && this.i.P()) {
                float f4 = ((float)this.i.M) + this.i.e();
                if(this.i.w0() == com.github.mikephil.charting.components.j.a.b) {
                    f3 += f4;
                }
                else if(this.i.w0() == com.github.mikephil.charting.components.j.a.a) {
                    f1 += f4;
                }
                else if(this.i.w0() == com.github.mikephil.charting.components.j.a.c) {
                    f3 += f4;
                    f1 += f4;
                }
            }
            float f5 = f1 + this.getExtraTopOffset();
            float f6 = f2 + this.getExtraRightOffset();
            float f7 = f3 + this.getExtraBottomOffset();
            float f8 = f + this.getExtraLeftOffset();
            float f9 = com.github.mikephil.charting.utils.k.e(this.W8);
            this.t.U(Math.max(f9, f8), Math.max(f9, f5), Math.max(f9, f6), Math.max(f9, f7));
            if(this.a) {
                Log.i("MPAndroidChart", "offsetLeft: " + f8 + ", offsetTop: " + f5 + ", offsetRight: " + f6 + ", offsetBottom: " + f7);
                Log.i("MPAndroidChart", "Content: " + this.t.q().toString());
            }
        }
        this.F0();
        this.G0();
    }

    public boolean p0() {
        return this.O;
    }

    public boolean q0() {
        return this.V8;
    }

    public boolean r0() {
        return this.Q;
    }

    // 去混淆评级： 低(20)
    public boolean s0() {
        return this.N8 || this.O8;
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.O = z;
    }

    public void setBorderColor(int v) {
        this.S8.setColor(v);
    }

    public void setBorderWidth(float f) {
        this.S8.setStrokeWidth(com.github.mikephil.charting.utils.k.e(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.V8 = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.Q = z;
    }

    public void setDragEnabled(boolean z) {
        this.N8 = z;
        this.O8 = z;
    }

    public void setDragOffsetX(float f) {
        this.t.W(f);
    }

    public void setDragOffsetY(float f) {
        this.t.X(f);
    }

    public void setDragXEnabled(boolean z) {
        this.N8 = z;
    }

    public void setDragYEnabled(boolean z) {
        this.O8 = z;
    }

    public void setDrawBorders(boolean z) {
        this.U8 = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.T8 = z;
    }

    public void setGridBackgroundColor(int v) {
        this.R8.setColor(v);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.M8 = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.X8 = z;
    }

    public void setMaxVisibleValueCount(int v) {
        this.N = v;
    }

    public void setMinOffset(float f) {
        this.W8 = f;
    }

    public void setOnDrawListener(com.github.mikephil.charting.listener.f f0) {
        this.Y8 = f0;
    }

    public void setPinchZoom(boolean z) {
        this.P = z;
    }

    public void setRendererLeftYAxis(t t0) {
        this.b9 = t0;
    }

    public void setRendererRightYAxis(t t0) {
        this.c9 = t0;
    }

    public void setScaleEnabled(boolean z) {
        this.P8 = z;
        this.Q8 = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.P8 = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.Q8 = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        this.t.c0(this.i.I / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        this.t.Y(this.i.I / f);
    }

    public void setXAxisRenderer(q q0) {
        this.f9 = q0;
    }

    public boolean t0() {
        return this.N8;
    }

    public boolean u0() {
        return this.O8;
    }

    public boolean v0() {
        return this.U8;
    }

    public boolean w0() {
        return this.t.D();
    }

    public boolean x0() {
        return this.M8;
    }

    public boolean y0() {
        return this.X8;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    public Paint z(int v) {
        Paint paint0 = super.z(v);
        if(paint0 != null) {
            return paint0;
        }
        return v == 4 ? this.R8 : null;
    }

    public boolean z0() {
        return this.P;
    }
}

