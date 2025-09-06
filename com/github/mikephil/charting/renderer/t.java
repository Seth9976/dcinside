package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.g;
import com.github.mikephil.charting.components.k.b;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;
import java.util.List;

public class t extends a {
    protected k h;
    protected Paint i;
    protected Path j;
    protected RectF k;
    protected float[] l;
    protected Path m;
    protected RectF n;
    protected Path o;
    protected float[] p;
    protected RectF q;

    public t(l l0, k k0, i i0) {
        super(l0, i0, k0);
        this.j = new Path();
        this.k = new RectF();
        this.l = new float[2];
        this.m = new Path();
        this.n = new RectF();
        this.o = new Path();
        this.p = new float[2];
        this.q = new RectF();
        this.h = k0;
        if(this.a != null) {
            this.e.setColor(0xFF000000);
            this.e.setTextSize(com.github.mikephil.charting.utils.k.e(10.0f));
            Paint paint0 = new Paint(1);
            this.i = paint0;
            paint0.setColor(0xFF888888);
            this.i.setStrokeWidth(1.0f);
            this.i.setStyle(Paint.Style.STROKE);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void g(Canvas canvas0) {
        float f3;
        if(this.h.f() && this.h.P()) {
            float[] arr_f = this.n();
            this.e.setTypeface(this.h.c());
            this.e.setTextSize(this.h.b());
            this.e.setColor(this.h.a());
            float f = this.h.d();
            float f1 = ((float)com.github.mikephil.charting.utils.k.a(this.e, "A")) / 2.5f;
            float f2 = this.h.e();
            com.github.mikephil.charting.components.k.a k$a0 = this.h.v0();
            b k$b0 = this.h.w0();
            if(k$a0 != com.github.mikephil.charting.components.k.a.a) {
                if(k$b0 == b.a) {
                    this.e.setTextAlign(Paint.Align.LEFT);
                    f3 = this.a.i() + f;
                }
                else {
                    this.e.setTextAlign(Paint.Align.RIGHT);
                    f3 = this.a.i() - f;
                }
            }
            else if(k$b0 == b.a) {
                this.e.setTextAlign(Paint.Align.RIGHT);
                f3 = this.a.P() - f;
            }
            else {
                this.e.setTextAlign(Paint.Align.LEFT);
                f3 = this.a.P() + f;
            }
            this.k(canvas0, f3, arr_f, f1 + f2);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void h(Canvas canvas0) {
        if(this.h.f() && this.h.M()) {
            this.f.setColor(this.h.s());
            this.f.setStrokeWidth(this.h.u());
            if(this.h.v0() == com.github.mikephil.charting.components.k.a.a) {
                canvas0.drawLine(this.a.h(), this.a.j(), this.a.h(), this.a.f(), this.f);
                return;
            }
            canvas0.drawLine(this.a.i(), this.a.j(), this.a.i(), this.a.f(), this.f);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void i(Canvas canvas0) {
        if(!this.h.f()) {
            return;
        }
        if(this.h.O()) {
            int v = canvas0.save();
            canvas0.clipRect(this.m());
            float[] arr_f = this.n();
            this.d.setColor(this.h.z());
            this.d.setStrokeWidth(this.h.B());
            this.d.setPathEffect(this.h.A());
            Path path0 = this.j;
            path0.reset();
            for(int v1 = 0; v1 < arr_f.length; v1 += 2) {
                canvas0.drawPath(this.o(path0, v1, arr_f), this.d);
                path0.reset();
            }
            canvas0.restoreToCount(v);
        }
        if(this.h.H0()) {
            this.l(canvas0);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.a
    public void j(Canvas canvas0) {
        List list0 = this.h.D();
        if(list0 != null && list0.size() > 0) {
            float[] arr_f = this.p;
            arr_f[0] = 0.0f;
            arr_f[1] = 0.0f;
            Path path0 = this.o;
            path0.reset();
            for(int v = 0; v < list0.size(); ++v) {
                g g0 = (g)list0.get(v);
                if(g0.f()) {
                    int v1 = canvas0.save();
                    this.q.set(this.a.q());
                    this.q.inset(0.0f, -g0.t());
                    canvas0.clipRect(this.q);
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
                        this.g.setTypeface(g0.c());
                        this.g.setStrokeWidth(0.5f);
                        this.g.setTextSize(g0.b());
                        float f = (float)com.github.mikephil.charting.utils.k.a(this.g, s);
                        float f1 = com.github.mikephil.charting.utils.k.e(4.0f) + g0.d();
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

    protected void k(Canvas canvas0, float f, float[] arr_f, float f1) {
        int v = !this.h.F0();
        int v1 = this.h.G0() ? this.h.n : this.h.n - 1;
        while(v < v1) {
            canvas0.drawText(this.h.x(v), f, arr_f[v * 2 + 1] + f1, this.e);
            ++v;
        }
    }

    protected void l(Canvas canvas0) {
        int v = canvas0.save();
        this.n.set(this.a.q());
        this.n.inset(0.0f, -this.h.E0());
        canvas0.clipRect(this.n);
        f f0 = this.c.f(0.0f, 0.0f);
        this.i.setColor(this.h.D0());
        this.i.setStrokeWidth(this.h.E0());
        Path path0 = this.m;
        path0.reset();
        path0.moveTo(this.a.h(), ((float)f0.d));
        path0.lineTo(this.a.i(), ((float)f0.d));
        canvas0.drawPath(path0, this.i);
        canvas0.restoreToCount(v);
    }

    public RectF m() {
        this.k.set(this.a.q());
        this.k.inset(0.0f, -this.b.B());
        return this.k;
    }

    protected float[] n() {
        int v = this.h.n;
        if(this.l.length != v * 2) {
            this.l = new float[v * 2];
        }
        float[] arr_f = this.l;
        for(int v1 = 0; v1 < arr_f.length; v1 += 2) {
            arr_f[v1 + 1] = this.h.l[v1 / 2];
        }
        this.c.o(arr_f);
        return arr_f;
    }

    protected Path o(Path path0, int v, float[] arr_f) {
        path0.moveTo(this.a.P(), arr_f[v + 1]);
        path0.lineTo(this.a.i(), arr_f[v + 1]);
        return path0;
    }
}

