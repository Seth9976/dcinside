package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.a;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.i;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.k;
import java.util.List;
import s1.d;

public class e extends l {
    protected d i;
    private float[] j;
    private float[] k;
    private float[] l;
    private float[] m;
    private float[] n;

    public e(d d0, a a0, com.github.mikephil.charting.utils.l l0) {
        super(a0, l0);
        this.j = new float[8];
        this.k = new float[4];
        this.l = new float[4];
        this.m = new float[4];
        this.n = new float[4];
        this.i = d0;
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas0) {
        for(Object object0: this.i.getCandleData().q()) {
            t1.d d0 = (t1.d)object0;
            if(d0.isVisible()) {
                this.o(canvas0, d0);
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas0) {
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas0, com.github.mikephil.charting.highlight.d[] arr_d) {
        i i0 = this.i.getCandleData();
        for(int v = 0; v < arr_d.length; ++v) {
            com.github.mikephil.charting.highlight.d d0 = arr_d[v];
            t1.d d1 = (t1.d)i0.k(d0.d());
            if(d1 != null && d1.f0()) {
                CandleEntry candleEntry0 = (CandleEntry)d1.M0(d0.h(), d0.j());
                if(this.l(candleEntry0, d1)) {
                    float f = this.b.i();
                    float f1 = this.b.i();
                    f f2 = this.i.d(d1.E0()).f(candleEntry0.l(), (candleEntry0.t() * f + candleEntry0.s() * f1) / 2.0f);
                    d0.n(((float)f2.c), ((float)f2.d));
                    this.n(canvas0, ((float)f2.c), ((float)f2.d), d1);
                }
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas0, String s, float f, float f1, int v) {
        this.f.setColor(v);
        canvas0.drawText(s, f, f1, this.f);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas0) {
        t1.d d1;
        float f3;
        CandleEntry candleEntry1;
        if(this.k(this.i)) {
            List list0 = this.i.getCandleData().q();
            for(int v = 0; v < list0.size(); ++v) {
                t1.d d0 = (t1.d)list0.get(v);
                if(this.m(d0) && d0.N() >= 1) {
                    this.a(d0);
                    com.github.mikephil.charting.utils.i i0 = this.i.d(d0.E0());
                    this.g.a(this.i, d0);
                    float[] arr_f = i0.b(d0, this.b.h(), this.b.i(), this.g.a, this.g.b);
                    float f = k.e(5.0f);
                    com.github.mikephil.charting.formatter.l l0 = d0.t0();
                    g g0 = g.d(d0.m1());
                    g0.c = k.e(g0.c);
                    g0.d = k.e(g0.d);
                    int v1 = 0;
                    while(v1 < arr_f.length) {
                        float f1 = arr_f[v1];
                        float f2 = arr_f[v1 + 1];
                        if(!this.a.J(f1)) {
                            break;
                        }
                        if(this.a.I(f1) && this.a.M(f2)) {
                            CandleEntry candleEntry0 = (CandleEntry)d0.l(this.g.a + v1 / 2);
                            if(d0.D0()) {
                                candleEntry1 = candleEntry0;
                                f3 = f2;
                                d1 = d0;
                                this.e(canvas0, l0.g(candleEntry0), f1, f2 - f, d0.q(v1 / 2));
                            }
                            else {
                                candleEntry1 = candleEntry0;
                                f3 = f2;
                                d1 = d0;
                            }
                            if(candleEntry1.c() != null && d1.K()) {
                                Drawable drawable0 = candleEntry1.c();
                                k.k(canvas0, drawable0, ((int)(f1 + g0.c)), ((int)(f3 + g0.d)), drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                            }
                        }
                        else {
                            d1 = d0;
                        }
                        v1 += 2;
                        d0 = d1;
                    }
                    g.h(g0);
                }
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    protected void o(Canvas canvas0, t1.d d0) {
        int v2;
        com.github.mikephil.charting.utils.i i0 = this.i.d(d0.E0());
        float f = this.b.i();
        float f1 = d0.T0();
        boolean z = d0.B();
        this.g.a(this.i, d0);
        this.c.setStrokeWidth(d0.L0());
        for(int v = this.g.a; v <= this.g.c + this.g.a; ++v) {
            CandleEntry candleEntry0 = (CandleEntry)d0.l(v);
            if(candleEntry0 != null) {
                float f2 = candleEntry0.l();
                float f3 = candleEntry0.u();
                float f4 = candleEntry0.r();
                float f5 = candleEntry0.s();
                float f6 = candleEntry0.t();
                if(z) {
                    float[] arr_f = this.j;
                    arr_f[0] = f2;
                    arr_f[2] = f2;
                    arr_f[4] = f2;
                    arr_f[6] = f2;
                    int v1 = Float.compare(f3, f4);
                    if(v1 > 0) {
                        arr_f[1] = f5 * f;
                        arr_f[3] = f3 * f;
                        arr_f[5] = f6 * f;
                        arr_f[7] = f4 * f;
                    }
                    else if(f3 < f4) {
                        arr_f[1] = f5 * f;
                        arr_f[3] = f4 * f;
                        arr_f[5] = f6 * f;
                        arr_f[7] = f3 * f;
                    }
                    else {
                        arr_f[1] = f5 * f;
                        float f7 = f3 * f;
                        arr_f[3] = f7;
                        arr_f[5] = f6 * f;
                        arr_f[7] = f7;
                    }
                    i0.o(arr_f);
                    if(!d0.y0()) {
                        this.c.setColor((d0.k1() == 0x112233 ? d0.Y0(v) : d0.k1()));
                    }
                    else if(v1 > 0) {
                        this.c.setColor((d0.j0() == 0x112233 ? d0.Y0(v) : d0.j0()));
                    }
                    else if(f3 < f4) {
                        this.c.setColor((d0.y() == 0x112233 ? d0.Y0(v) : d0.y()));
                    }
                    else {
                        this.c.setColor((d0.H0() == 0x112233 ? d0.Y0(v) : d0.H0()));
                    }
                    this.c.setStyle(Paint.Style.STROKE);
                    canvas0.drawLines(this.j, this.c);
                    float[] arr_f1 = this.k;
                    arr_f1[0] = f2 - 0.5f + f1;
                    arr_f1[1] = f4 * f;
                    arr_f1[2] = f2 + 0.5f - f1;
                    arr_f1[3] = f3 * f;
                    i0.o(arr_f1);
                    if(v1 > 0) {
                        if(d0.j0() == 0x112233) {
                            this.c.setColor(d0.Y0(v));
                        }
                        else {
                            this.c.setColor(d0.j0());
                        }
                        this.c.setStyle(d0.R0());
                        canvas0.drawRect(this.k[0], this.k[3], this.k[2], this.k[1], this.c);
                    }
                    else if(f3 < f4) {
                        if(d0.y() == 0x112233) {
                            this.c.setColor(d0.Y0(v));
                        }
                        else {
                            this.c.setColor(d0.y());
                        }
                        this.c.setStyle(d0.S());
                        canvas0.drawRect(this.k[0], this.k[1], this.k[2], this.k[3], this.c);
                    }
                    else {
                        if(d0.H0() == 0x112233) {
                            this.c.setColor(d0.Y0(v));
                        }
                        else {
                            this.c.setColor(d0.H0());
                        }
                        canvas0.drawLine(this.k[0], this.k[1], this.k[2], this.k[3], this.c);
                    }
                }
                else {
                    float[] arr_f2 = this.l;
                    arr_f2[0] = f2;
                    arr_f2[1] = f5 * f;
                    arr_f2[2] = f2;
                    arr_f2[3] = f6 * f;
                    float[] arr_f3 = this.m;
                    arr_f3[0] = f2 - 0.5f + f1;
                    float f8 = f3 * f;
                    arr_f3[1] = f8;
                    arr_f3[2] = f2;
                    arr_f3[3] = f8;
                    float[] arr_f4 = this.n;
                    arr_f4[0] = f2 + 0.5f - f1;
                    float f9 = f4 * f;
                    arr_f4[1] = f9;
                    arr_f4[2] = f2;
                    arr_f4[3] = f9;
                    i0.o(arr_f2);
                    i0.o(this.m);
                    i0.o(this.n);
                    if(f3 > f4) {
                        v2 = d0.j0() == 0x112233 ? d0.Y0(v) : d0.j0();
                    }
                    else if(f3 >= f4) {
                        v2 = d0.H0() == 0x112233 ? d0.Y0(v) : d0.H0();
                    }
                    else if(d0.y() == 0x112233) {
                        v2 = d0.Y0(v);
                    }
                    else {
                        v2 = d0.y();
                    }
                    this.c.setColor(v2);
                    canvas0.drawLine(this.l[0], this.l[1], this.l[2], this.l[3], this.c);
                    canvas0.drawLine(this.m[0], this.m[1], this.m[2], this.m[3], this.c);
                    canvas0.drawLine(this.n[0], this.n[1], this.n[2], this.n[3], this.c);
                }
            }
        }
    }
}

