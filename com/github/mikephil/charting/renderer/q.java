package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.utils.c;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import java.util.List;

public class q extends a {
    protected j h;
    protected Path i;
    protected float[] j;
    protected RectF k;
    protected float[] l;
    protected RectF m;
    float[] n;
    private Path o;

    public q(l l0, j j0, i i0) {
        super(l0, i0, j0);
        this.i = new Path();
        this.j = new float[2];
        this.k = new RectF();
        this.l = new float[2];
        this.m = new RectF();
        this.n = new float[4];
        this.o = new Path();
        this.h = j0;
        this.e.setColor(0xFF000000);
        this.e.setTextAlign(Paint.Align.CENTER);
        this.e.setTextSize(k.e(10.0f));
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void a(float f, float f1, boolean z) {
        double f5;
        float f4;
        if(this.a.k() > 10.0f && !this.a.E()) {
            f f2 = this.c.j(this.a.h(), this.a.j());
            f f3 = this.c.j(this.a.i(), this.a.j());
            if(z) {
                f4 = (float)f3.c;
                f5 = f2.c;
            }
            else {
                f4 = (float)f2.c;
                f5 = f3.c;
            }
            f.c(f2);
            f.c(f3);
            f = f4;
            f1 = (float)f5;
        }
        this.b(f, f1);
    }

    @Override  // com.github.mikephil.charting.renderer.a
    protected void b(float f, float f1) {
        super.b(f, f1);
        this.k();
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void g(Canvas canvas0) {
        if(this.h.f() && this.h.P()) {
            float f = this.h.e();
            this.e.setTypeface(this.h.c());
            this.e.setTextSize(this.h.b());
            this.e.setColor(this.h.a());
            g g0 = g.c(0.0f, 0.0f);
            if(this.h.w0() == com.github.mikephil.charting.components.j.a.a) {
                g0.c = 0.5f;
                g0.d = 1.0f;
                this.n(canvas0, this.a.j() - f, g0);
            }
            else if(this.h.w0() == com.github.mikephil.charting.components.j.a.d) {
                g0.c = 0.5f;
                g0.d = 1.0f;
                this.n(canvas0, this.a.j() + f + ((float)this.h.M), g0);
            }
            else if(this.h.w0() == com.github.mikephil.charting.components.j.a.b) {
                g0.c = 0.5f;
                g0.d = 0.0f;
                this.n(canvas0, this.a.f() + f, g0);
            }
            else if(this.h.w0() == com.github.mikephil.charting.components.j.a.e) {
                g0.c = 0.5f;
                g0.d = 0.0f;
                this.n(canvas0, this.a.f() - f - ((float)this.h.M), g0);
            }
            else {
                g0.c = 0.5f;
                g0.d = 1.0f;
                this.n(canvas0, this.a.j() - f, g0);
                g0.c = 0.5f;
                g0.d = 0.0f;
                this.n(canvas0, this.a.f() + f, g0);
            }
            g.h(g0);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void h(Canvas canvas0) {
        if(this.h.M() && this.h.f()) {
            this.f.setColor(this.h.s());
            this.f.setStrokeWidth(this.h.u());
            this.f.setPathEffect(this.h.t());
            if(this.h.w0() == com.github.mikephil.charting.components.j.a.a || this.h.w0() == com.github.mikephil.charting.components.j.a.d || this.h.w0() == com.github.mikephil.charting.components.j.a.c) {
                canvas0.drawLine(this.a.h(), this.a.j(), this.a.i(), this.a.j(), this.f);
            }
            if(this.h.w0() == com.github.mikephil.charting.components.j.a.b || this.h.w0() == com.github.mikephil.charting.components.j.a.e || this.h.w0() == com.github.mikephil.charting.components.j.a.c) {
                canvas0.drawLine(this.a.h(), this.a.f(), this.a.i(), this.a.f(), this.f);
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void i(Canvas canvas0) {
        if(this.h.O() && this.h.f()) {
            int v = canvas0.save();
            canvas0.clipRect(this.o());
            if(this.j.length != this.b.n * 2) {
                this.j = new float[this.h.n * 2];
            }
            float[] arr_f = this.j;
            for(int v2 = 0; v2 < arr_f.length; v2 += 2) {
                float[] arr_f1 = this.h.l;
                arr_f[v2] = arr_f1[v2 / 2];
                arr_f[v2 + 1] = arr_f1[v2 / 2];
            }
            this.c.o(arr_f);
            this.r();
            Path path0 = this.i;
            path0.reset();
            for(int v1 = 0; v1 < arr_f.length; v1 += 2) {
                this.l(canvas0, arr_f[v1], arr_f[v1 + 1], path0);
            }
            canvas0.restoreToCount(v);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void j(Canvas canvas0) {
        List list0 = this.h.D();
        if(list0 != null && list0.size() > 0) {
            float[] arr_f = this.l;
            arr_f[0] = 0.0f;
            arr_f[1] = 0.0f;
            for(int v = 0; v < list0.size(); ++v) {
                com.github.mikephil.charting.components.g g0 = (com.github.mikephil.charting.components.g)list0.get(v);
                if(g0.f()) {
                    int v1 = canvas0.save();
                    this.m.set(this.a.q());
                    this.m.inset(-g0.t(), 0.0f);
                    canvas0.clipRect(this.m);
                    arr_f[0] = g0.r();
                    arr_f[1] = 0.0f;
                    this.c.o(arr_f);
                    this.q(canvas0, g0, arr_f);
                    this.p(canvas0, g0, arr_f, g0.e() + 2.0f);
                    canvas0.restoreToCount(v1);
                }
            }
        }
    }

    protected void k() {
        this.e.setTypeface(this.h.c());
        this.e.setTextSize(this.h.b());
        c c0 = k.b(this.e, "");
        float f = c0.c;
        float f1 = (float)k.a(this.e, "Q");
        c c1 = k.D(f, f1, this.h.v0());
        this.h.J = Math.round(f);
        this.h.K = Math.round(f1);
        this.h.L = Math.round(c1.c);
        this.h.M = Math.round(c1.d);
        c.c(c1);
        c.c(c0);
    }

    protected void l(Canvas canvas0, float f, float f1, Path path0) {
        path0.moveTo(f, this.a.f());
        path0.lineTo(f, this.a.j());
        canvas0.drawPath(path0, this.d);
        path0.reset();
    }

    protected void m(Canvas canvas0, String s, float f, float f1, g g0, float f2) {
        k.n(canvas0, s, f, f1, this.e, g0, f2);
    }

    protected void n(Canvas canvas0, float f, g g0) {
        float f1 = this.h.v0();
        boolean z = this.h.L();
        int v = this.h.n * 2;
        float[] arr_f = new float[v];
        for(int v1 = 0; v1 < v; v1 += 2) {
            arr_f[v1] = z ? this.h.m[v1 / 2] : this.h.l[v1 / 2];
        }
        this.c.o(arr_f);
        for(int v2 = 0; v2 < v; v2 += 2) {
            float f2 = arr_f[v2];
            if(this.a.L(f2)) {
                String s = this.h.H().c(this.h.l[v2 / 2], this.h);
                if(this.h.x0()) {
                    int v3 = this.h.n;
                    if(v2 / 2 == v3 - 1 && v3 > 1) {
                        float f3 = (float)k.d(this.e, s);
                        if(f3 > this.a.Q() * 2.0f && f2 + f3 > this.a.o()) {
                            f2 -= f3 / 2.0f;
                        }
                    }
                    else if(v2 == 0) {
                        f2 += ((float)k.d(this.e, s)) / 2.0f;
                    }
                }
                this.m(canvas0, s, f2, f, g0, f1);
            }
        }
    }

    public RectF o() {
        this.k.set(this.a.q());
        this.k.inset(-this.b.B(), 0.0f);
        return this.k;
    }

    public void p(Canvas canvas0, com.github.mikephil.charting.components.g g0, float[] arr_f, float f) {
        String s = g0.p();
        if(s != null && !s.equals("")) {
            this.g.setStyle(g0.u());
            this.g.setPathEffect(null);
            this.g.setColor(g0.a());
            this.g.setStrokeWidth(0.5f);
            this.g.setTextSize(g0.b());
            float f1 = g0.t() + g0.d();
            com.github.mikephil.charting.components.g.a g$a0 = g0.q();
            if(g$a0 == com.github.mikephil.charting.components.g.a.c) {
                float f2 = (float)k.a(this.g, s);
                this.g.setTextAlign(Paint.Align.LEFT);
                canvas0.drawText(s, arr_f[0] + f1, this.a.j() + f + f2, this.g);
                return;
            }
            if(g$a0 == com.github.mikephil.charting.components.g.a.d) {
                this.g.setTextAlign(Paint.Align.LEFT);
                canvas0.drawText(s, arr_f[0] + f1, this.a.f() - f, this.g);
                return;
            }
            if(g$a0 == com.github.mikephil.charting.components.g.a.a) {
                this.g.setTextAlign(Paint.Align.RIGHT);
                float f3 = (float)k.a(this.g, s);
                canvas0.drawText(s, arr_f[0] - f1, this.a.j() + f + f3, this.g);
                return;
            }
            this.g.setTextAlign(Paint.Align.RIGHT);
            canvas0.drawText(s, arr_f[0] - f1, this.a.f() - f, this.g);
        }
    }

    public void q(Canvas canvas0, com.github.mikephil.charting.components.g g0, float[] arr_f) {
        float[] arr_f1 = this.n;
        arr_f1[0] = arr_f[0];
        arr_f1[1] = this.a.j();
        float[] arr_f2 = this.n;
        arr_f2[2] = arr_f[0];
        arr_f2[3] = this.a.f();
        this.o.reset();
        this.o.moveTo(this.n[0], this.n[1]);
        this.o.lineTo(this.n[2], this.n[3]);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setColor(g0.s());
        this.g.setStrokeWidth(g0.t());
        this.g.setPathEffect(g0.o());
        canvas0.drawPath(this.o, this.g);
    }

    protected void r() {
        this.d.setColor(this.h.z());
        this.d.setStrokeWidth(this.h.B());
        this.d.setPathEffect(this.h.A());
    }
}

