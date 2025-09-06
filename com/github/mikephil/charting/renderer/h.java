package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.buffer.c;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import java.util.List;
import s1.a;
import s1.e;

public class h extends b {
    private RectF n;

    public h(a a0, com.github.mikephil.charting.animation.a a1, l l0) {
        super(a0, a1, l0);
        this.n = new RectF();
        this.f.setTextAlign(Paint.Align.LEFT);
    }

    @Override  // com.github.mikephil.charting.renderer.b
    public void e(Canvas canvas0, String s, float f, float f1, int v) {
        this.f.setColor(v);
        canvas0.drawText(s, f, f1, this.f);
    }

    @Override  // com.github.mikephil.charting.renderer.b
    public void f(Canvas canvas0) {
        int v1;
        List list1;
        g g2;
        com.github.mikephil.charting.formatter.l l1;
        int v4;
        com.github.mikephil.charting.buffer.b b1;
        float f10;
        g g1;
        List list2;
        int v3;
        int v8;
        BarEntry barEntry2;
        float[] arr_f1;
        float f16;
        float f31;
        float[] arr_f3;
        int v14;
        float f30;
        float f22;
        if(this.k(this.h)) {
            List list0 = this.h.getBarData().q();
            float f = k.e(5.0f);
            boolean z = this.h.a();
            int v = 0;
            while(v < this.h.getBarData().m()) {
                t1.a a0 = (t1.a)list0.get(v);
                if(this.m(a0)) {
                    boolean z1 = this.h.e(a0.E0());
                    this.a(a0);
                    float f1 = ((float)k.a(this.f, "10")) / 2.0f;
                    com.github.mikephil.charting.formatter.l l0 = a0.t0();
                    com.github.mikephil.charting.buffer.b b0 = this.j[v];
                    float f2 = this.b.i();
                    g g0 = g.d(a0.m1());
                    g0.c = k.e(g0.c);
                    g0.d = k.e(g0.d);
                    if(a0.b0()) {
                        com.github.mikephil.charting.buffer.b b2 = b0;
                        list1 = list0;
                        v1 = v;
                        g2 = g0;
                        com.github.mikephil.charting.formatter.l l2 = l0;
                        i i0 = this.h.d(a0.E0());
                        int v5 = 0;
                        int v6 = 0;
                        while(((float)v5) < ((float)a0.N()) * this.b.h()) {
                            BarEntry barEntry1 = (BarEntry)a0.l(v5);
                            int v7 = a0.q(v5);
                            float[] arr_f = barEntry1.y();
                            if(arr_f != null) {
                                BarEntry barEntry3 = barEntry1;
                                v8 = v5;
                                f16 = f1;
                                arr_f1 = arr_f;
                                int v9 = arr_f1.length * 2;
                                float[] arr_f2 = new float[v9];
                                float f18 = -barEntry3.u();
                                int v10 = 0;
                                int v11 = 0;
                                float f19 = 0.0f;
                                while(v10 < v9) {
                                    float f20 = arr_f1[v11];
                                    int v12 = Float.compare(f20, 0.0f);
                                    if(v12 == 0 && (f19 == 0.0f || f18 == 0.0f)) {
                                        float f21 = f18;
                                        f18 = f20;
                                        f22 = f21;
                                    }
                                    else if(v12 >= 0) {
                                        f19 += f20;
                                        f22 = f18;
                                        f18 = f19;
                                    }
                                    else {
                                        f22 = f18 - f20;
                                    }
                                    arr_f2[v10] = f18 * f2;
                                    v10 += 2;
                                    ++v11;
                                    f18 = f22;
                                }
                                i0.o(arr_f2);
                                int v13 = 0;
                                while(v13 < v9) {
                                    float f23 = arr_f1[v13 / 2];
                                    String s2 = l2.e(f23, barEntry3);
                                    float f24 = (float)k.d(this.f, s2);
                                    String s3 = s2;
                                    float f25 = z ? f : -(f24 + f);
                                    float f26 = z ? -(f24 + f) : f;
                                    if(z1) {
                                        f25 = -f25 - f24;
                                        f26 = -f26 - f24;
                                    }
                                    float f27 = arr_f2[v13];
                                    if(f23 == 0.0f && f18 == 0.0f && f19 > 0.0f || f23 < 0.0f) {
                                        f25 = f26;
                                    }
                                    float f28 = f27 + f25;
                                    float f29 = (b2.b[v6 + 1] + b2.b[v6 + 3]) / 2.0f;
                                    if(!this.a.K(f29)) {
                                        break;
                                    }
                                    if(!this.a.L(f28)) {
                                        v14 = v13;
                                        arr_f3 = arr_f2;
                                    }
                                    else if(this.a.H(f29)) {
                                        if(a0.D0()) {
                                            f30 = f29;
                                            v14 = v13;
                                            arr_f3 = arr_f2;
                                            f31 = f28;
                                            this.e(canvas0, s3, f28, f29 + f16, v7);
                                        }
                                        else {
                                            f30 = f29;
                                            v14 = v13;
                                            arr_f3 = arr_f2;
                                            f31 = f28;
                                        }
                                        if(barEntry3.c() != null && a0.K()) {
                                            Drawable drawable2 = barEntry3.c();
                                            k.k(canvas0, drawable2, ((int)(f31 + g2.c)), ((int)(f30 + g2.d)), drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                                        }
                                    }
                                    else {
                                        v14 = v13;
                                        arr_f3 = arr_f2;
                                    }
                                    v13 = v14 + 2;
                                    arr_f2 = arr_f3;
                                }
                            }
                            else if(this.a.K(b2.b[v6 + 1])) {
                                if(!this.a.L(b2.b[v6]) || !this.a.H(b2.b[v6 + 1])) {
                                    continue;
                                }
                                String s1 = l2.d(barEntry1);
                                float f12 = (float)k.d(this.f, s1);
                                float f13 = z ? f : -(f12 + f);
                                float f14 = z ? -(f12 + f) : f;
                                if(z1) {
                                    f13 = -f13 - f12;
                                    f14 = -f14 - f12;
                                }
                                float f15 = f13;
                                if(a0.D0()) {
                                    f16 = f1;
                                    arr_f1 = null;
                                    barEntry2 = barEntry1;
                                    v8 = v5;
                                    this.e(canvas0, s1, b2.b[v6 + 2] + (barEntry1.d() >= 0.0f ? f15 : f14), b2.b[v6 + 1] + f1, v7);
                                }
                                else {
                                    v8 = v5;
                                    f16 = f1;
                                    arr_f1 = null;
                                    barEntry2 = barEntry1;
                                }
                                if(barEntry2.c() != null && a0.K()) {
                                    Drawable drawable1 = barEntry2.c();
                                    float f17 = b2.b[v6 + 2];
                                    if(barEntry2.d() < 0.0f) {
                                        f15 = f14;
                                    }
                                    k.k(canvas0, drawable1, ((int)(f17 + f15 + g2.c)), ((int)(b2.b[v6 + 1] + g2.d)), drawable1.getIntrinsicWidth(), drawable1.getIntrinsicHeight());
                                }
                            }
                            else {
                                break;
                            }
                            v6 = arr_f1 == null ? v6 + 4 : v6 + arr_f1.length * 4;
                            v5 = v8 + 1;
                            f1 = f16;
                        }
                    }
                    else {
                        int v2 = 0;
                        while(((float)v2) < ((float)b0.b.length) * this.b.h()) {
                            float f3 = b0.b[v2 + 1];
                            float f4 = (b0.b[v2 + 3] + f3) / 2.0f;
                            if(!this.a.K(f3)) {
                                break;
                            }
                            if(!this.a.L(b0.b[v2]) || !this.a.H(b0.b[v2 + 1])) {
                                v3 = v2;
                                b1 = b0;
                                list2 = list0;
                                v4 = v;
                                g1 = g0;
                                l1 = l0;
                            }
                            else {
                                BarEntry barEntry0 = (BarEntry)a0.l(v2 / 4);
                                float f5 = barEntry0.d();
                                String s = l0.d(barEntry0);
                                float f6 = (float)k.d(this.f, s);
                                float f7 = z ? f : -(f6 + f);
                                float f8 = z ? -(f6 + f) : f;
                                if(z1) {
                                    f7 = -f7 - f6;
                                    f8 = -f8 - f6;
                                }
                                float f9 = f7;
                                if(a0.D0()) {
                                    v3 = v2;
                                    list2 = list0;
                                    g1 = g0;
                                    f10 = f8;
                                    b1 = b0;
                                    v4 = v;
                                    l1 = l0;
                                    this.e(canvas0, s, b0.b[v2 + 2] + (f5 >= 0.0f ? f9 : f8), f4 + f1, a0.q(v2 / 2));
                                }
                                else {
                                    v3 = v2;
                                    list2 = list0;
                                    v4 = v;
                                    f10 = f8;
                                    g1 = g0;
                                    b1 = b0;
                                    l1 = l0;
                                }
                                if(barEntry0.c() != null && a0.K()) {
                                    Drawable drawable0 = barEntry0.c();
                                    float f11 = b1.b[v3 + 2];
                                    if(f5 < 0.0f) {
                                        f9 = f10;
                                    }
                                    k.k(canvas0, drawable0, ((int)(f11 + f9 + g1.c)), ((int)(f4 + g1.d)), drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                                }
                            }
                            v2 = v3 + 4;
                            g0 = g1;
                            l0 = l1;
                            b0 = b1;
                            list0 = list2;
                            v = v4;
                        }
                        list1 = list0;
                        v1 = v;
                        g2 = g0;
                    }
                    g.h(g2);
                }
                else {
                    list1 = list0;
                    v1 = v;
                }
                v = v1 + 1;
                list0 = list1;
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.b
    public void j() {
        com.github.mikephil.charting.data.a a0 = this.h.getBarData();
        this.j = new c[a0.m()];
        for(int v = 0; v < this.j.length; ++v) {
            t1.a a1 = (t1.a)a0.k(v);
            com.github.mikephil.charting.buffer.b[] arr_b = this.j;
            arr_b[v] = new c(a1.N() * 4 * (a1.b0() ? a1.s() : 1), a0.m(), a1.b0());
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    protected boolean k(e e0) {
        return ((float)e0.getData().r()) < ((float)e0.getMaxVisibleCount()) * this.a.x();
    }

    @Override  // com.github.mikephil.charting.renderer.b
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
                this.n.top = f3 - f2 / 2.0f;
                this.n.bottom = f3 + f2 / 2.0f;
                i0.t(this.n);
                if(this.a.K(this.n.bottom)) {
                    if(!this.a.H(this.n.top)) {
                        break;
                    }
                    this.n.left = this.a.h();
                    this.n.right = this.a.i();
                    canvas0.drawRect(this.n, this.k);
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
        for(int v1 = 0; v1 < b0.f() && this.a.K(b0.b[v1 + 3]); v1 += 4) {
            if(this.a.H(b0.b[v1 + 1])) {
                if(!z) {
                    this.c.setColor(a0.Y0(v1 / 4));
                }
                canvas0.drawRect(b0.b[v1], b0.b[v1 + 1], b0.b[v1 + 2], b0.b[v1 + 3], this.c);
                if(z1) {
                    canvas0.drawRect(b0.b[v1], b0.b[v1 + 1], b0.b[v1 + 2], b0.b[v1 + 3], this.l);
                }
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.b
    protected void o(float f, float f1, float f2, float f3, i i0) {
        this.i.set(f1, f - f3, f2, f + f3);
        i0.s(this.i, this.b.i());
    }

    @Override  // com.github.mikephil.charting.renderer.b
    protected void p(d d0, RectF rectF0) {
        d0.n(rectF0.centerY(), rectF0.right);
    }
}

