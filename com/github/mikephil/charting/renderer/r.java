package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.j.a;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.utils.c;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import java.util.List;

public class r extends q {
    protected BarChart p;
    protected Path q;

    public r(l l0, j j0, i i0, BarChart barChart0) {
        super(l0, j0, i0);
        this.q = new Path();
        this.p = barChart0;
    }

    @Override  // com.github.mikephil.charting.renderer.q
    public void a(float f, float f1, boolean z) {
        double f5;
        float f4;
        if(this.a.k() > 10.0f && !this.a.F()) {
            f f2 = this.c.j(this.a.h(), this.a.f());
            f f3 = this.c.j(this.a.h(), this.a.j());
            if(z) {
                f4 = (float)f3.d;
                f5 = f2.d;
            }
            else {
                f4 = (float)f2.d;
                f5 = f3.d;
            }
            f.c(f2);
            f.c(f3);
            f = f4;
            f1 = (float)f5;
        }
        this.b(f, f1);
    }

    @Override  // com.github.mikephil.charting.renderer.q
    public void g(Canvas canvas0) {
        if(this.h.f() && this.h.P()) {
            float f = this.h.d();
            this.e.setTypeface(this.h.c());
            this.e.setTextSize(this.h.b());
            this.e.setColor(this.h.a());
            g g0 = g.c(0.0f, 0.0f);
            if(this.h.w0() == a.a) {
                g0.c = 0.0f;
                g0.d = 0.5f;
                this.n(canvas0, this.a.i() + f, g0);
            }
            else if(this.h.w0() == a.d) {
                g0.c = 1.0f;
                g0.d = 0.5f;
                this.n(canvas0, this.a.i() - f, g0);
            }
            else if(this.h.w0() == a.b) {
                g0.c = 1.0f;
                g0.d = 0.5f;
                this.n(canvas0, this.a.h() - f, g0);
            }
            else if(this.h.w0() == a.e) {
                g0.c = 1.0f;
                g0.d = 0.5f;
                this.n(canvas0, this.a.h() + f, g0);
            }
            else {
                g0.c = 0.0f;
                g0.d = 0.5f;
                this.n(canvas0, this.a.i() + f, g0);
                g0.c = 1.0f;
                g0.d = 0.5f;
                this.n(canvas0, this.a.h() - f, g0);
            }
            g.h(g0);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.q
    public void h(Canvas canvas0) {
        if(this.h.M() && this.h.f()) {
            this.f.setColor(this.h.s());
            this.f.setStrokeWidth(this.h.u());
            if(this.h.w0() == a.a || this.h.w0() == a.d || this.h.w0() == a.c) {
                canvas0.drawLine(this.a.i(), this.a.j(), this.a.i(), this.a.f(), this.f);
            }
            if(this.h.w0() == a.b || this.h.w0() == a.e || this.h.w0() == a.c) {
                canvas0.drawLine(this.a.h(), this.a.j(), this.a.h(), this.a.f(), this.f);
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.q
    public void j(Canvas canvas0) {
        List list0 = this.h.D();
        if(list0 != null && list0.size() > 0) {
            float[] arr_f = this.l;
            arr_f[0] = 0.0f;
            arr_f[1] = 0.0f;
            Path path0 = this.q;
            path0.reset();
            for(int v = 0; v < list0.size(); ++v) {
                com.github.mikephil.charting.components.g g0 = (com.github.mikephil.charting.components.g)list0.get(v);
                if(g0.f()) {
                    int v1 = canvas0.save();
                    this.m.set(this.a.q());
                    this.m.inset(0.0f, -g0.t());
                    canvas0.clipRect(this.m);
                    this.g.setStyle(Paint.Style.STROKE);
                    this.g.setColor(g0.s());
                    this.g.setStrokeWidth(g0.t());
                    this.g.setPathEffect(g0.o());
                    arr_f[1] = g0.r();
                    this.c.o(arr_f);
                    path0.moveTo(this.a.h(), arr_f[1]);
                    path0.lineTo(this.a.i(), arr_f[1]);
                    canvas0.drawPath(path0, this.g);
                    path0.reset();
                    String s = g0.p();
                    if(s != null && !s.equals("")) {
                        this.g.setStyle(g0.u());
                        this.g.setPathEffect(null);
                        this.g.setColor(g0.a());
                        this.g.setStrokeWidth(0.5f);
                        this.g.setTextSize(g0.b());
                        float f = (float)k.a(this.g, s);
                        float f1 = k.e(4.0f) + g0.d();
                        float f2 = g0.t() + f + g0.e();
                        com.github.mikephil.charting.components.g.a g$a0 = g0.q();
                        if(g$a0 == com.github.mikephil.charting.components.g.a.c) {
                            this.g.setTextAlign(Paint.Align.RIGHT);
                            canvas0.drawText(s, this.a.i() - f1, arr_f[1] - f2 + f, this.g);
                        }
                        else if(g$a0 == com.github.mikephil.charting.components.g.a.d) {
                            this.g.setTextAlign(Paint.Align.RIGHT);
                            canvas0.drawText(s, this.a.i() - f1, arr_f[1] + f2, this.g);
                        }
                        else if(g$a0 == com.github.mikephil.charting.components.g.a.a) {
                            this.g.setTextAlign(Paint.Align.LEFT);
                            canvas0.drawText(s, this.a.h() + f1, arr_f[1] - f2 + f, this.g);
                        }
                        else {
                            this.g.setTextAlign(Paint.Align.LEFT);
                            canvas0.drawText(s, this.a.P() + f1, arr_f[1] + f2, this.g);
                        }
                    }
                    canvas0.restoreToCount(v1);
                }
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.q
    protected void k() {
        this.e.setTypeface(this.h.c());
        this.e.setTextSize(this.h.b());
        c c0 = k.b(this.e, "");
        float f = c0.c;
        float f1 = this.h.d();
        float f2 = c0.d;
        c c1 = k.D(c0.c, f2, this.h.v0());
        this.h.J = Math.round(((int)(f + f1 * 3.5f)));
        this.h.K = Math.round(f2);
        this.h.L = (int)(c1.c + this.h.d() * 3.5f);
        this.h.M = Math.round(c1.d);
        c.c(c1);
    }

    @Override  // com.github.mikephil.charting.renderer.q
    protected void l(Canvas canvas0, float f, float f1, Path path0) {
        path0.moveTo(this.a.i(), f1);
        path0.lineTo(this.a.h(), f1);
        canvas0.drawPath(path0, this.d);
        path0.reset();
    }

    @Override  // com.github.mikephil.charting.renderer.q
    protected void n(Canvas canvas0, float f, g g0) {
        float f1 = this.h.v0();
        boolean z = this.h.L();
        int v = this.h.n * 2;
        float[] arr_f = new float[v];
        for(int v1 = 0; v1 < v; v1 += 2) {
            arr_f[v1 + 1] = z ? this.h.m[v1 / 2] : this.h.l[v1 / 2];
        }
        this.c.o(arr_f);
        for(int v2 = 0; v2 < v; v2 += 2) {
            float f2 = arr_f[v2 + 1];
            if(this.a.M(f2)) {
                this.m(canvas0, this.h.H().c(this.h.l[v2 / 2], this.h), f, f2, g0, f1);
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.q
    public RectF o() {
        this.k.set(this.a.q());
        this.k.inset(0.0f, -this.b.B());
        return this.k;
    }
}

