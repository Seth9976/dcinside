package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.g;
import com.github.mikephil.charting.components.k.a;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;
import java.util.List;

public class u extends t {
    protected Path r;
    protected Path s;
    protected float[] t;

    public u(l l0, k k0, i i0) {
        super(l0, k0, i0);
        this.r = new Path();
        this.s = new Path();
        this.t = new float[4];
        this.g.setTextAlign(Paint.Align.LEFT);
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void a(float f, float f1, boolean z) {
        double f5;
        float f4;
        if(this.a.g() > 10.0f && !this.a.E()) {
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

    @Override  // com.github.mikephil.charting.renderer.t
    public void g(Canvas canvas0) {
        if(this.h.f() && this.h.P()) {
            float[] arr_f = this.n();
            this.e.setTypeface(this.h.c());
            this.e.setTextSize(this.h.b());
            this.e.setColor(this.h.a());
            this.e.setTextAlign(Paint.Align.CENTER);
            float f = com.github.mikephil.charting.utils.k.e(2.5f);
            float f1 = (float)com.github.mikephil.charting.utils.k.a(this.e, "Q");
            a k$a0 = this.h.v0();
            this.h.w0();
            this.k(canvas0, (k$a0 == a.a ? this.a.j() - f : this.a.f() + f1 + f), arr_f, this.h.e());
        }
    }

    @Override  // com.github.mikephil.charting.renderer.t
    public void h(Canvas canvas0) {
        if(this.h.f() && this.h.M()) {
            this.f.setColor(this.h.s());
            this.f.setStrokeWidth(this.h.u());
            if(this.h.v0() == a.a) {
                canvas0.drawLine(this.a.h(), this.a.j(), this.a.i(), this.a.j(), this.f);
                return;
            }
            canvas0.drawLine(this.a.h(), this.a.f(), this.a.i(), this.a.f(), this.f);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.t
    public void j(Canvas canvas0) {
        List list0 = this.h.D();
        if(list0 != null && list0.size() > 0) {
            float[] arr_f = this.t;
            arr_f[0] = 0.0f;
            arr_f[1] = 0.0f;
            arr_f[2] = 0.0f;
            arr_f[3] = 0.0f;
            Path path0 = this.s;
            path0.reset();
            for(int v = 0; v < list0.size(); ++v) {
                g g0 = (g)list0.get(v);
                if(g0.f()) {
                    int v1 = canvas0.save();
                    this.q.set(this.a.q());
                    this.q.inset(-g0.t(), 0.0f);
                    canvas0.clipRect(this.q);
                    arr_f[0] = g0.r();
                    arr_f[2] = g0.r();
                    this.c.o(arr_f);
                    arr_f[1] = this.a.j();
                    arr_f[3] = this.a.f();
                    path0.moveTo(arr_f[0], arr_f[1]);
                    path0.lineTo(arr_f[2], arr_f[3]);
                    this.g.setStyle(Paint.Style.STROKE);
                    this.g.setColor(g0.s());
                    this.g.setPathEffect(g0.o());
                    this.g.setStrokeWidth(g0.t());
                    canvas0.drawPath(path0, this.g);
                    path0.reset();
                    String s = g0.p();
                    if(s != null && !s.equals("")) {
                        this.g.setStyle(g0.u());
                        this.g.setPathEffect(null);
                        this.g.setColor(g0.a());
                        this.g.setTypeface(g0.c());
                        this.g.setStrokeWidth(0.5f);
                        this.g.setTextSize(g0.b());
                        float f = g0.t() + g0.d();
                        float f1 = com.github.mikephil.charting.utils.k.e(2.0f) + g0.e();
                        com.github.mikephil.charting.components.g.a g$a0 = g0.q();
                        if(g$a0 == com.github.mikephil.charting.components.g.a.c) {
                            float f2 = (float)com.github.mikephil.charting.utils.k.a(this.g, s);
                            this.g.setTextAlign(Paint.Align.LEFT);
                            canvas0.drawText(s, arr_f[0] + f, this.a.j() + f1 + f2, this.g);
                        }
                        else if(g$a0 == com.github.mikephil.charting.components.g.a.d) {
                            this.g.setTextAlign(Paint.Align.LEFT);
                            canvas0.drawText(s, arr_f[0] + f, this.a.f() - f1, this.g);
                        }
                        else if(g$a0 == com.github.mikephil.charting.components.g.a.a) {
                            this.g.setTextAlign(Paint.Align.RIGHT);
                            float f3 = (float)com.github.mikephil.charting.utils.k.a(this.g, s);
                            canvas0.drawText(s, arr_f[0] - f, this.a.j() + f1 + f3, this.g);
                        }
                        else {
                            this.g.setTextAlign(Paint.Align.RIGHT);
                            canvas0.drawText(s, arr_f[0] - f, this.a.f() - f1, this.g);
                        }
                    }
                    canvas0.restoreToCount(v1);
                }
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.t
    protected void k(Canvas canvas0, float f, float[] arr_f, float f1) {
        this.e.setTypeface(this.h.c());
        this.e.setTextSize(this.h.b());
        this.e.setColor(this.h.a());
        int v = !this.h.F0();
        int v1 = this.h.G0() ? this.h.n : this.h.n - 1;
        while(v < v1) {
            canvas0.drawText(this.h.x(v), arr_f[v * 2], f - f1, this.e);
            ++v;
        }
    }

    @Override  // com.github.mikephil.charting.renderer.t
    protected void l(Canvas canvas0) {
        int v = canvas0.save();
        this.n.set(this.a.q());
        this.n.inset(-this.h.E0(), 0.0f);
        canvas0.clipRect(this.q);
        f f0 = this.c.f(0.0f, 0.0f);
        this.i.setColor(this.h.D0());
        this.i.setStrokeWidth(this.h.E0());
        Path path0 = this.r;
        path0.reset();
        path0.moveTo(((float)f0.c) - 1.0f, this.a.j());
        path0.lineTo(((float)f0.c) - 1.0f, this.a.f());
        canvas0.drawPath(path0, this.i);
        canvas0.restoreToCount(v);
    }

    @Override  // com.github.mikephil.charting.renderer.t
    public RectF m() {
        this.k.set(this.a.q());
        this.k.inset(-this.b.B(), 0.0f);
        return this.k;
    }

    @Override  // com.github.mikephil.charting.renderer.t
    protected float[] n() {
        int v = this.h.n;
        if(this.l.length != v * 2) {
            this.l = new float[v * 2];
        }
        float[] arr_f = this.l;
        for(int v1 = 0; v1 < arr_f.length; v1 += 2) {
            arr_f[v1] = this.h.l[v1 / 2];
        }
        this.c.o(arr_f);
        return arr_f;
    }

    @Override  // com.github.mikephil.charting.renderer.t
    protected Path o(Path path0, int v, float[] arr_f) {
        path0.moveTo(arr_f[v], this.a.j());
        path0.lineTo(arr_f[v], this.a.f());
        return path0;
    }
}

