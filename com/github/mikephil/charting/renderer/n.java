package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.a;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.data.t;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.l;
import t1.j;

public class n extends k {
    protected RadarChart i;
    protected Paint j;
    protected Paint k;
    protected Path l;
    protected Path m;

    public n(RadarChart radarChart0, a a0, l l0) {
        super(a0, l0);
        this.l = new Path();
        this.m = new Path();
        this.i = radarChart0;
        Paint paint0 = new Paint(1);
        this.d = paint0;
        Paint.Style paint$Style0 = Paint.Style.STROKE;
        paint0.setStyle(paint$Style0);
        this.d.setStrokeWidth(2.0f);
        this.d.setColor(Color.rgb(0xFF, 0xBB, 0x73));
        Paint paint1 = new Paint(1);
        this.j = paint1;
        paint1.setStyle(paint$Style0);
        this.k = new Paint(1);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas0) {
        t t0 = (t)this.i.getData();
        int v = ((j)t0.w()).N();
        for(Object object0: t0.q()) {
            j j0 = (j)object0;
            if(j0.isVisible()) {
                this.r(canvas0, j0, v);
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas0) {
        this.t(canvas0);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas0, d[] arr_d) {
        int v2;
        float f = this.i.getSliceAngle();
        float f1 = this.i.getFactor();
        g g0 = this.i.getCenterOffsets();
        g g1 = g.c(0.0f, 0.0f);
        com.github.mikephil.charting.data.k k0 = this.i.getData();
        for(int v = 0; v < arr_d.length; v = v2 + 1) {
            d d0 = arr_d[v];
            j j0 = (j)((t)k0).k(d0.d());
            if(j0 != null && j0.f0()) {
                RadarEntry radarEntry0 = (RadarEntry)j0.l(((int)d0.h()));
                if(this.l(radarEntry0, j0)) {
                    com.github.mikephil.charting.utils.k.B(g0, (radarEntry0.d() - this.i.getYChartMin()) * f1 * this.b.i(), d0.h() * f * this.b.h() + this.i.getRotationAngle(), g1);
                    d0.n(g1.c, g1.d);
                    this.n(canvas0, g1.c, g1.d, j0);
                    if(j0.N0() && !Float.isNaN(g1.c) && !Float.isNaN(g1.d)) {
                        int v1 = j0.m0();
                        if(v1 == 0x112233) {
                            v1 = j0.Y0(0);
                        }
                        if(j0.G() < 0xFF) {
                            v1 = com.github.mikephil.charting.utils.a.a(v1, j0.G());
                        }
                        v2 = v;
                        this.s(canvas0, g1, j0.J0(), j0.q0(), j0.c(), v1, j0.G0());
                    }
                }
            }
            else {
                v2 = v;
            }
        }
        g.h(g0);
        g.h(g1);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas0, String s, float f, float f1, int v) {
        this.f.setColor(v);
        canvas0.drawText(s, f, f1, this.f);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas0) {
        float f5;
        int v1;
        int v4;
        j j1;
        com.github.mikephil.charting.formatter.l l1;
        g g4;
        float f7;
        int v3;
        RadarEntry radarEntry1;
        float f = this.b.h();
        float f1 = this.b.i();
        float f2 = this.i.getSliceAngle();
        float f3 = this.i.getFactor();
        g g0 = this.i.getCenterOffsets();
        g g1 = g.c(0.0f, 0.0f);
        g g2 = g.c(0.0f, 0.0f);
        float f4 = com.github.mikephil.charting.utils.k.e(5.0f);
        int v = 0;
        while(v < ((t)this.i.getData()).m()) {
            j j0 = (j)((t)this.i.getData()).k(v);
            if(this.m(j0)) {
                this.a(j0);
                com.github.mikephil.charting.formatter.l l0 = j0.t0();
                g g3 = g.d(j0.m1());
                g3.c = com.github.mikephil.charting.utils.k.e(g3.c);
                g3.d = com.github.mikephil.charting.utils.k.e(g3.d);
                int v2 = 0;
                while(v2 < j0.N()) {
                    RadarEntry radarEntry0 = (RadarEntry)j0.l(v2);
                    float f6 = ((float)v2) * f2 * f;
                    com.github.mikephil.charting.utils.k.B(g0, (radarEntry0.d() - this.i.getYChartMin()) * f3 * f1, f6 + this.i.getRotationAngle(), g1);
                    if(j0.D0()) {
                        radarEntry1 = radarEntry0;
                        v3 = v2;
                        f7 = f;
                        g4 = g3;
                        l1 = l0;
                        j1 = j0;
                        v4 = v;
                        this.e(canvas0, l0.k(radarEntry0), g1.c, g1.d - f4, j0.q(v2));
                    }
                    else {
                        radarEntry1 = radarEntry0;
                        v3 = v2;
                        j1 = j0;
                        v4 = v;
                        f7 = f;
                        g4 = g3;
                        l1 = l0;
                    }
                    if(radarEntry1.c() != null && j1.K()) {
                        Drawable drawable0 = radarEntry1.c();
                        com.github.mikephil.charting.utils.k.B(g0, radarEntry1.d() * f3 * f1 + g4.d, f6 + this.i.getRotationAngle(), g2);
                        float f8 = g2.d + g4.c;
                        g2.d = f8;
                        com.github.mikephil.charting.utils.k.k(canvas0, drawable0, ((int)g2.c), ((int)f8), drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                    }
                    v2 = v3 + 1;
                    g3 = g4;
                    j0 = j1;
                    l0 = l1;
                    v = v4;
                    f = f7;
                }
                v1 = v;
                f5 = f;
                g.h(g3);
            }
            else {
                v1 = v;
                f5 = f;
            }
            v = v1 + 1;
            f = f5;
        }
        g.h(g0);
        g.h(g1);
        g.h(g2);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    protected void r(Canvas canvas0, j j0, int v) {
        float f = this.b.h();
        float f1 = this.b.i();
        float f2 = this.i.getSliceAngle();
        float f3 = this.i.getFactor();
        g g0 = this.i.getCenterOffsets();
        g g1 = g.c(0.0f, 0.0f);
        Path path0 = this.l;
        path0.reset();
        boolean z = false;
        for(int v1 = 0; v1 < j0.N(); ++v1) {
            this.c.setColor(j0.Y0(v1));
            com.github.mikephil.charting.utils.k.B(g0, (((RadarEntry)j0.l(v1)).d() - this.i.getYChartMin()) * f3 * f1, ((float)v1) * f2 * f + this.i.getRotationAngle(), g1);
            if(!Float.isNaN(g1.c)) {
                if(z) {
                    path0.lineTo(g1.c, g1.d);
                }
                else {
                    path0.moveTo(g1.c, g1.d);
                    z = true;
                }
            }
        }
        if(j0.N() > v) {
            path0.lineTo(g0.c, g0.d);
        }
        path0.close();
        if(j0.V0()) {
            Drawable drawable0 = j0.j();
            if(drawable0 == null) {
                this.p(canvas0, path0, j0.F(), j0.k0());
            }
            else {
                this.q(canvas0, path0, drawable0);
            }
        }
        this.c.setStrokeWidth(j0.n0());
        this.c.setStyle(Paint.Style.STROKE);
        if(!j0.V0() || j0.k0() < 0xFF) {
            canvas0.drawPath(path0, this.c);
        }
        g.h(g0);
        g.h(g1);
    }

    public void s(Canvas canvas0, g g0, float f, float f1, int v, int v1, float f2) {
        canvas0.save();
        float f3 = com.github.mikephil.charting.utils.k.e(f1);
        float f4 = com.github.mikephil.charting.utils.k.e(f);
        if(v != 0x112233) {
            Path path0 = this.m;
            path0.reset();
            path0.addCircle(g0.c, g0.d, f3, Path.Direction.CW);
            if(f4 > 0.0f) {
                path0.addCircle(g0.c, g0.d, f4, Path.Direction.CCW);
            }
            this.k.setColor(v);
            this.k.setStyle(Paint.Style.FILL);
            canvas0.drawPath(path0, this.k);
        }
        if(v1 != 0x112233) {
            this.k.setColor(v1);
            this.k.setStyle(Paint.Style.STROKE);
            this.k.setStrokeWidth(com.github.mikephil.charting.utils.k.e(f2));
            canvas0.drawCircle(g0.c, g0.d, f3, this.k);
        }
        canvas0.restore();
    }

    protected void t(Canvas canvas0) {
        float f = this.i.getSliceAngle();
        float f1 = this.i.getFactor();
        float f2 = this.i.getRotationAngle();
        g g0 = this.i.getCenterOffsets();
        this.j.setStrokeWidth(this.i.getWebLineWidth());
        this.j.setColor(this.i.getWebColor());
        this.j.setAlpha(this.i.getWebAlpha());
        int v = this.i.getSkipWebLineCount();
        int v1 = ((j)((t)this.i.getData()).w()).N();
        g g1 = g.c(0.0f, 0.0f);
        for(int v2 = 0; v2 < v1; v2 += v + 1) {
            com.github.mikephil.charting.utils.k.B(g0, this.i.getYRange() * f1, ((float)v2) * f + f2, g1);
            canvas0.drawLine(g0.c, g0.d, g1.c, g1.d, this.j);
        }
        g.h(g1);
        this.j.setStrokeWidth(this.i.getWebLineWidthInner());
        this.j.setColor(this.i.getWebColorInner());
        this.j.setAlpha(this.i.getWebAlpha());
        int v3 = this.i.getYAxis().n;
        g g2 = g.c(0.0f, 0.0f);
        g g3 = g.c(0.0f, 0.0f);
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = 0;
            while(v5 < ((t)this.i.getData()).r()) {
                float f3 = (this.i.getYAxis().l[v4] - this.i.getYChartMin()) * f1;
                com.github.mikephil.charting.utils.k.B(g0, f3, ((float)v5) * f + f2, g2);
                ++v5;
                com.github.mikephil.charting.utils.k.B(g0, f3, ((float)v5) * f + f2, g3);
                canvas0.drawLine(g2.c, g2.d, g3.c, g3.d, this.j);
            }
        }
        g.h(g2);
        g.h(g3);
    }

    public Paint u() {
        return this.j;
    }
}

