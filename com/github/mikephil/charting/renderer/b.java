package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.highlight.j;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import java.util.List;
import s1.a;

public class b extends c {
    protected a h;
    protected RectF i;
    protected com.github.mikephil.charting.buffer.b[] j;
    protected Paint k;
    protected Paint l;
    private RectF m;

    public b(a a0, com.github.mikephil.charting.animation.a a1, l l0) {
        super(a1, l0);
        this.i = new RectF();
        this.m = new RectF();
        this.h = a0;
        Paint paint0 = new Paint(1);
        this.d = paint0;
        Paint.Style paint$Style0 = Paint.Style.FILL;
        paint0.setStyle(paint$Style0);
        this.d.setColor(0xFF000000);
        this.d.setAlpha(120);
        Paint paint1 = new Paint(1);
        this.k = paint1;
        paint1.setStyle(paint$Style0);
        Paint paint2 = new Paint(1);
        this.l = paint2;
        paint2.setStyle(Paint.Style.STROKE);
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas0) {
        com.github.mikephil.charting.data.a a0 = this.h.getBarData();
        for(int v = 0; v < a0.m(); ++v) {
            t1.a a1 = (t1.a)a0.k(v);
            if(a1.isVisible()) {
                this.n(canvas0, a1, v);
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas0) {
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas0, d[] arr_d) {
        float f1;
        float f;
        com.github.mikephil.charting.data.a a0 = this.h.getBarData();
        for(int v = 0; v < arr_d.length; ++v) {
            d d0 = arr_d[v];
            t1.a a1 = (t1.a)a0.k(d0.d());
            if(a1 != null && a1.f0()) {
                BarEntry barEntry0 = (BarEntry)a1.M0(d0.h(), d0.j());
                if(this.l(barEntry0, a1)) {
                    i i0 = this.h.d(a1.E0());
                    this.d.setColor(a1.l1());
                    this.d.setAlpha(a1.j1());
                    if(d0.g() < 0 || !barEntry0.z()) {
                        f1 = barEntry0.d();
                        f = 0.0f;
                    }
                    else if(this.h.b()) {
                        f = -barEntry0.u();
                        f1 = barEntry0.v();
                    }
                    else {
                        j j0 = barEntry0.w()[d0.g()];
                        f1 = j0.a;
                        f = j0.b;
                    }
                    this.o(barEntry0.l(), f1, f, a0.Q() / 2.0f, i0);
                    this.p(d0, this.i);
                    canvas0.drawRect(this.i, this.d);
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
        boolean z1;
        float f1;
        List list1;
        g g2;
        g g1;
        List list2;
        com.github.mikephil.charting.formatter.l l1;
        int v2;
        float f10;
        BarEntry barEntry1;
        i i1;
        boolean z3;
        int v6;
        BarEntry barEntry3;
        float[] arr_f1;
        float f13;
        float f12;
        int v13;
        BarEntry barEntry5;
        int v12;
        float[] arr_f3;
        float f24;
        i i2;
        float f21;
        if(this.k(this.h)) {
            List list0 = this.h.getBarData().q();
            float f = k.e(4.5f);
            boolean z = this.h.a();
            int v = 0;
            while(v < this.h.getBarData().m()) {
                t1.a a0 = (t1.a)list0.get(v);
                if(this.m(a0)) {
                    this.a(a0);
                    boolean z2 = this.h.e(a0.E0());
                    float f2 = (float)k.a(this.f, "8");
                    float f3 = z ? -f : f2 + f;
                    float f4 = z ? f2 + f : -f;
                    if(z2) {
                        f3 = -f3 - f2;
                        f4 = -f4 - f2;
                    }
                    float f5 = f3;
                    float f6 = f4;
                    com.github.mikephil.charting.buffer.b b0 = this.j[v];
                    float f7 = this.b.i();
                    com.github.mikephil.charting.formatter.l l0 = a0.t0();
                    g g0 = g.d(a0.m1());
                    g0.c = k.e(g0.c);
                    g0.d = k.e(g0.d);
                    if(a0.b0()) {
                        com.github.mikephil.charting.formatter.l l2 = l0;
                        list1 = list0;
                        g2 = g0;
                        i i0 = this.h.d(a0.E0());
                        int v3 = 0;
                        int v4 = 0;
                        while(((float)v3) < ((float)a0.N()) * this.b.h()) {
                            BarEntry barEntry2 = (BarEntry)a0.l(v3);
                            float[] arr_f = barEntry2.y();
                            float f11 = (b0.b[v4] + b0.b[v4 + 2]) / 2.0f;
                            int v5 = a0.q(v3);
                            if(arr_f != null) {
                                float f16 = f11;
                                BarEntry barEntry4 = barEntry2;
                                v6 = v3;
                                f13 = f;
                                z3 = z;
                                arr_f1 = arr_f;
                                i1 = i0;
                                int v7 = arr_f1.length * 2;
                                float[] arr_f2 = new float[v7];
                                float f17 = -barEntry4.u();
                                int v8 = 0;
                                int v9 = 0;
                                float f18 = 0.0f;
                                while(v8 < v7) {
                                    float f19 = arr_f1[v9];
                                    int v10 = Float.compare(f19, 0.0f);
                                    if(v10 == 0 && (f18 == 0.0f || f17 == 0.0f)) {
                                        float f20 = f17;
                                        f17 = f19;
                                        f21 = f20;
                                    }
                                    else if(v10 >= 0) {
                                        f18 += f19;
                                        f21 = f17;
                                        f17 = f18;
                                    }
                                    else {
                                        f21 = f17 - f19;
                                    }
                                    arr_f2[v8 + 1] = f17 * f7;
                                    v8 += 2;
                                    ++v9;
                                    f17 = f21;
                                }
                                i1.o(arr_f2);
                                int v11 = 0;
                                while(v11 < v7) {
                                    float f22 = arr_f1[v11 / 2];
                                    float f23 = arr_f2[v11 + 1] + ((f22 != 0.0f || f17 != 0.0f || f18 <= 0.0f) && f22 >= 0.0f ? f5 : f6);
                                    i2 = i1;
                                    if(!this.a.J(f16)) {
                                        goto label_172;
                                    }
                                    if(this.a.M(f23) && this.a.I(f16)) {
                                        if(a0.D0()) {
                                            barEntry5 = barEntry4;
                                            f24 = f23;
                                            v13 = v11;
                                            arr_f3 = arr_f2;
                                            v12 = v7;
                                            this.e(canvas0, l2.e(f22, barEntry4), f16, f24, v5);
                                        }
                                        else {
                                            f24 = f23;
                                            arr_f3 = arr_f2;
                                            v12 = v7;
                                            barEntry5 = barEntry4;
                                            v13 = v11;
                                        }
                                        if(barEntry5.c() != null && a0.K()) {
                                            Drawable drawable2 = barEntry5.c();
                                            k.k(canvas0, drawable2, ((int)(f16 + g2.c)), ((int)(f24 + g2.d)), drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                                        }
                                    }
                                    else {
                                        arr_f3 = arr_f2;
                                        v12 = v7;
                                        barEntry5 = barEntry4;
                                        v13 = v11;
                                    }
                                    v11 = v13 + 2;
                                    barEntry4 = barEntry5;
                                    arr_f2 = arr_f3;
                                    v7 = v12;
                                    i1 = i2;
                                }
                            }
                            else if(this.a.J(f11)) {
                                if(!this.a.M(b0.b[v4 + 1]) || !this.a.I(f11)) {
                                    continue;
                                }
                                if(a0.D0()) {
                                    f12 = f11;
                                    f13 = f;
                                    arr_f1 = null;
                                    barEntry3 = barEntry2;
                                    v6 = v3;
                                    z3 = z;
                                    i1 = i0;
                                    this.e(canvas0, l2.d(barEntry2), f12, b0.b[v4 + 1] + (barEntry2.d() >= 0.0f ? f5 : f6), v5);
                                }
                                else {
                                    f12 = f11;
                                    v6 = v3;
                                    f13 = f;
                                    z3 = z;
                                    arr_f1 = null;
                                    barEntry3 = barEntry2;
                                    i1 = i0;
                                }
                                if(barEntry3.c() != null && a0.K()) {
                                    Drawable drawable1 = barEntry3.c();
                                    float f14 = b0.b[v4 + 1];
                                    float f15 = barEntry3.d() >= 0.0f ? f5 : f6;
                                    k.k(canvas0, drawable1, ((int)(f12 + g2.c)), ((int)(f14 + f15 + g2.d)), drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight());
                                }
                            }
                            else {
                                break;
                            }
                            i2 = i1;
                        label_172:
                            v4 = arr_f1 == null ? v4 + 4 : v4 + arr_f1.length * 4;
                            v3 = v6 + 1;
                            z = z3;
                            f = f13;
                            i0 = i2;
                        }
                    }
                    else {
                        int v1 = 0;
                        while(((float)v1) < ((float)b0.b.length) * this.b.h()) {
                            float f8 = (b0.b[v1] + b0.b[v1 + 2]) / 2.0f;
                            if(!this.a.J(f8)) {
                                break;
                            }
                            if(this.a.M(b0.b[v1 + 1]) && this.a.I(f8)) {
                                BarEntry barEntry0 = (BarEntry)a0.l(v1 / 4);
                                float f9 = barEntry0.d();
                                if(a0.D0()) {
                                    barEntry1 = barEntry0;
                                    f10 = f8;
                                    v2 = v1;
                                    list2 = list0;
                                    g1 = g0;
                                    l1 = l0;
                                    this.e(canvas0, l0.d(barEntry0), f10, (Float.compare(f9, 0.0f) < 0 ? b0.b[v1 + 3] + f6 : b0.b[v1 + 1] + f5), a0.q(v1 / 4));
                                }
                                else {
                                    barEntry1 = barEntry0;
                                    f10 = f8;
                                    v2 = v1;
                                    l1 = l0;
                                    list2 = list0;
                                    g1 = g0;
                                }
                                if(barEntry1.c() != null && a0.K()) {
                                    Drawable drawable0 = barEntry1.c();
                                    k.k(canvas0, drawable0, ((int)(f10 + g1.c)), ((int)((f9 >= 0.0f ? b0.b[v1 + 1] + f5 : b0.b[v2 + 3] + f6) + g1.d)), drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                                }
                            }
                            else {
                                v2 = v1;
                                l1 = l0;
                                list2 = list0;
                                g1 = g0;
                            }
                            v1 = v2 + 4;
                            g0 = g1;
                            l0 = l1;
                            list0 = list2;
                        }
                        list1 = list0;
                        g2 = g0;
                    }
                    f1 = f;
                    z1 = z;
                    g.h(g2);
                }
                else {
                    list1 = list0;
                    f1 = f;
                    z1 = z;
                }
                ++v;
                z = z1;
                list0 = list1;
                f = f1;
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void j() {
        com.github.mikephil.charting.data.a a0 = this.h.getBarData();
        this.j = new com.github.mikephil.charting.buffer.b[a0.m()];
        for(int v = 0; v < this.j.length; ++v) {
            t1.a a1 = (t1.a)a0.k(v);
            com.github.mikephil.charting.buffer.b[] arr_b = this.j;
            arr_b[v] = new com.github.mikephil.charting.buffer.b(a1.N() * 4 * (a1.b0() ? a1.s() : 1), a0.m(), a1.b0());
        }
    }

    protected void n(Canvas canvas0, t1.a a0, int v) {
        i i0 = this.h.d(a0.E0());
        this.l.setColor(a0.o0());
        this.l.setStrokeWidth(k.e(a0.M()));
        boolean z = true;
        boolean z1 = a0.M() > 0.0f;
        float f = this.b.h();
        float f1 = this.b.i();
        if(this.h.c()) {
            this.k.setColor(a0.a1());
            float f2 = this.h.getBarData().Q();
            int v2 = Math.min(((int)Math.ceil(((float)a0.N()) * f)), a0.N());
            for(int v3 = 0; v3 < v2; ++v3) {
                float f3 = ((BarEntry)a0.l(v3)).l();
                this.m.left = f3 - f2 / 2.0f;
                this.m.right = f3 + f2 / 2.0f;
                i0.t(this.m);
                if(this.a.I(this.m.right)) {
                    if(!this.a.J(this.m.left)) {
                        break;
                    }
                    this.m.top = this.a.j();
                    this.m.bottom = this.a.f();
                    canvas0.drawRect(this.m, this.k);
                }
            }
        }
        com.github.mikephil.charting.buffer.b b0 = this.j[v];
        b0.e(f, f1);
        b0.j(v);
        b0.k(this.h.e(a0.E0()));
        b0.i(this.h.getBarData().Q());
        b0.h(a0);
        i0.o(b0.b);
        if(a0.z0().size() == 1) {
            this.c.setColor(a0.getColor());
        }
        else {
            z = false;
        }
        for(int v1 = 0; v1 < b0.f(); v1 += 4) {
            if(this.a.I(b0.b[v1 + 2])) {
                if(!this.a.J(b0.b[v1])) {
                    break;
                }
                if(!z) {
                    this.c.setColor(a0.Y0(v1 / 4));
                }
                if(a0.Q0() != null) {
                    v1.a a1 = a0.Q0();
                    Paint paint0 = this.c;
                    float f4 = b0.b[v1];
                    paint0.setShader(new LinearGradient(f4, b0.b[v1 + 3], f4, b0.b[v1 + 1], a1.b(), a1.a(), Shader.TileMode.MIRROR));
                }
                if(a0.w() != null) {
                    Paint paint1 = this.c;
                    float f5 = b0.b[v1];
                    paint1.setShader(new LinearGradient(f5, b0.b[v1 + 3], f5, b0.b[v1 + 1], a0.n1(v1 / 4).b(), a0.n1(v1 / 4).a(), Shader.TileMode.MIRROR));
                }
                canvas0.drawRect(b0.b[v1], b0.b[v1 + 1], b0.b[v1 + 2], b0.b[v1 + 3], this.c);
                if(z1) {
                    canvas0.drawRect(b0.b[v1], b0.b[v1 + 1], b0.b[v1 + 2], b0.b[v1 + 3], this.l);
                }
            }
        }
    }

    protected void o(float f, float f1, float f2, float f3, i i0) {
        this.i.set(f - f3, f1, f + f3, f2);
        i0.r(this.i, this.b.i());
    }

    protected void p(d d0, RectF rectF0) {
        d0.n(rectF0.centerX(), rectF0.top);
    }
}

