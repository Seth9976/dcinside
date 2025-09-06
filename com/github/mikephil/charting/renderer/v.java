package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.a;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.l;
import java.util.List;
import t1.j;

public class v extends t {
    private RadarChart r;
    private Path s;

    public v(l l0, k k0, RadarChart radarChart0) {
        super(l0, k0, null);
        this.s = new Path();
        this.r = radarChart0;
    }

    @Override  // com.github.mikephil.charting.renderer.a
    protected void b(float f, float f1) {
        int v3;
        int v = this.b.C();
        double f2 = (double)Math.abs(f1 - f);
        if(v != 0 && f2 > 0.0 && !Double.isInfinite(f2)) {
            double f3 = (double)com.github.mikephil.charting.utils.k.L(f2 / ((double)v));
            if(this.b.S() && f3 < ((double)this.b.y())) {
                f3 = (double)this.b.y();
            }
            double f4 = (double)com.github.mikephil.charting.utils.k.L(Math.pow(10.0, ((int)Math.log10(f3))));
            if(((int)(f3 / f4)) > 5) {
                f3 = Math.floor(f4 * 10.0);
            }
            boolean z = this.b.L();
            if(this.b.R()) {
                a a0 = this.b;
                a0.n = v;
                if(a0.l.length < v) {
                    a0.l = new float[v];
                }
                for(int v1 = 0; v1 < v; ++v1) {
                    this.b.l[v1] = f;
                    f += ((float)f2) / ((float)(v - 1));
                }
            }
            else {
                int v2 = Double.compare(f3, 0.0);
                double f5 = v2 == 0 ? 0.0 : Math.ceil(((double)f) / f3) * f3;
                if(z) {
                    f5 -= f3;
                }
                double f6 = v2 == 0 ? 0.0 : com.github.mikephil.charting.utils.k.J(Math.floor(((double)f1) / f3) * f3);
                if(v2 == 0) {
                    v3 = z;
                }
                else {
                    double f7 = f5;
                    v3 = z;
                    while(f7 <= f6) {
                        ++v3;
                        f7 += f3;
                    }
                }
                a a1 = this.b;
                a1.n = v3 + 1;
                if(a1.l.length < v3 + 1) {
                    a1.l = new float[v3 + 1];
                }
                for(int v4 = 0; v4 < v3 + 1; ++v4) {
                    if(f5 == 0.0) {
                        f5 = 0.0;
                    }
                    this.b.l[v4] = (float)f5;
                    f5 += f3;
                }
                v = v3 + 1;
            }
            this.b.o = f3 < 1.0 ? ((int)Math.ceil(-Math.log10(f3))) : 0;
            if(z) {
                a a2 = this.b;
                if(a2.m.length < v) {
                    a2.m = new float[v];
                }
                float f8 = (a2.l[1] - a2.l[0]) / 2.0f;
                for(int v5 = 0; v5 < v; ++v5) {
                    this.b.m[v5] = this.b.l[v5] + f8;
                }
            }
            a a3 = this.b;
            float[] arr_f = a3.l;
            float f9 = arr_f[0];
            a3.H = f9;
            float f10 = arr_f[v - 1];
            a3.G = f10;
            a3.I = Math.abs(f10 - f9);
            return;
        }
        this.b.l = new float[0];
        this.b.m = new float[0];
        this.b.n = 0;
    }

    @Override  // com.github.mikephil.charting.renderer.t
    public void g(Canvas canvas0) {
        if(this.h.f() && this.h.P()) {
            this.e.setTypeface(this.h.c());
            this.e.setTextSize(this.h.b());
            this.e.setColor(this.h.a());
            g g0 = this.r.getCenterOffsets();
            g g1 = g.c(0.0f, 0.0f);
            float f = this.r.getFactor();
            int v = !this.h.F0();
            int v1 = this.h.G0() ? this.h.n : this.h.n - 1;
            while(v < v1) {
                com.github.mikephil.charting.utils.k.B(g0, (this.h.l[v] - this.h.H) * f, this.r.getRotationAngle(), g1);
                canvas0.drawText(this.h.x(v), g1.c + 10.0f, g1.d, this.e);
                ++v;
            }
            g.h(g0);
            g.h(g1);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.t
    public void j(Canvas canvas0) {
        List list0 = this.h.D();
        if(list0 == null) {
            return;
        }
        float f = this.r.getSliceAngle();
        float f1 = this.r.getFactor();
        g g0 = this.r.getCenterOffsets();
        g g1 = g.c(0.0f, 0.0f);
        for(int v = 0; v < list0.size(); ++v) {
            com.github.mikephil.charting.components.g g2 = (com.github.mikephil.charting.components.g)list0.get(v);
            if(g2.f()) {
                this.g.setColor(g2.s());
                this.g.setPathEffect(g2.o());
                this.g.setStrokeWidth(g2.t());
                float f2 = (g2.r() - this.r.getYChartMin()) * f1;
                Path path0 = this.s;
                path0.reset();
                for(int v1 = 0; v1 < ((j)((com.github.mikephil.charting.data.t)this.r.getData()).w()).N(); ++v1) {
                    com.github.mikephil.charting.utils.k.B(g0, f2, ((float)v1) * f + this.r.getRotationAngle(), g1);
                    if(v1 == 0) {
                        path0.moveTo(g1.c, g1.d);
                    }
                    else {
                        path0.lineTo(g1.c, g1.d);
                    }
                }
                path0.close();
                canvas0.drawPath(path0, this.g);
            }
        }
        g.h(g0);
        g.h(g1);
    }
}

