package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.github.mikephil.charting.animation.a;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.v;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.renderer.scatter.e;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.i;
import java.util.List;
import s1.h;
import t1.k;

public class p extends l {
    protected h i;
    float[] j;

    public p(h h0, a a0, com.github.mikephil.charting.utils.l l0) {
        super(a0, l0);
        this.j = new float[2];
        this.i = h0;
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas0) {
        for(Object object0: this.i.getScatterData().q()) {
            k k0 = (k)object0;
            if(k0.isVisible()) {
                this.o(canvas0, k0);
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas0) {
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas0, d[] arr_d) {
        v v0 = this.i.getScatterData();
        for(int v1 = 0; v1 < arr_d.length; ++v1) {
            d d0 = arr_d[v1];
            k k0 = (k)v0.k(d0.d());
            if(k0 != null && k0.f0()) {
                Entry entry0 = k0.M0(d0.h(), d0.j());
                if(this.l(entry0, k0)) {
                    f f0 = this.i.d(k0.E0()).f(entry0.l(), entry0.d() * this.b.i());
                    d0.n(((float)f0.c), ((float)f0.d));
                    this.n(canvas0, ((float)f0.c), ((float)f0.d), k0);
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
        k k1;
        Entry entry1;
        if(this.k(this.i)) {
            List list0 = this.i.getScatterData().q();
            for(int v = 0; v < this.i.getScatterData().m(); ++v) {
                k k0 = (k)list0.get(v);
                if(this.m(k0) && k0.N() >= 1) {
                    this.a(k0);
                    this.g.a(this.i, k0);
                    float[] arr_f = this.i.d(k0.E0()).d(k0, this.b.h(), this.b.i(), this.g.a, this.g.b);
                    float f = com.github.mikephil.charting.utils.k.e(k0.p());
                    com.github.mikephil.charting.formatter.l l0 = k0.t0();
                    g g0 = g.d(k0.m1());
                    g0.c = com.github.mikephil.charting.utils.k.e(g0.c);
                    g0.d = com.github.mikephil.charting.utils.k.e(g0.d);
                    int v1 = 0;
                    while(v1 < arr_f.length && this.a.J(arr_f[v1])) {
                        if(this.a.I(arr_f[v1]) && this.a.M(arr_f[v1 + 1])) {
                            Entry entry0 = k0.l(this.g.a + v1 / 2);
                            if(k0.D0()) {
                                entry1 = entry0;
                                k1 = k0;
                                this.e(canvas0, l0.j(entry0), arr_f[v1], arr_f[v1 + 1] - f, k0.q(v1 / 2 + this.g.a));
                            }
                            else {
                                entry1 = entry0;
                                k1 = k0;
                            }
                            if(entry1.c() != null && k1.K()) {
                                Drawable drawable0 = entry1.c();
                                com.github.mikephil.charting.utils.k.k(canvas0, drawable0, ((int)(arr_f[v1] + g0.c)), ((int)(arr_f[v1 + 1] + g0.d)), drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                            }
                        }
                        else {
                            k1 = k0;
                        }
                        v1 += 2;
                        k0 = k1;
                    }
                    g.h(g0);
                }
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    protected void o(Canvas canvas0, k k0) {
        int v2;
        if(k0.N() < 1) {
            return;
        }
        com.github.mikephil.charting.utils.l l0 = this.a;
        i i0 = this.i.d(k0.E0());
        float f = this.b.i();
        e e0 = k0.Y();
        if(e0 == null) {
            Log.i("MISSING", "There\'s no IShapeRenderer specified for ScatterDataSet");
            return;
        }
        int v = (int)Math.min(Math.ceil(((float)k0.N()) * this.b.h()), ((float)k0.N()));
        for(int v1 = 0; v1 < v; v1 = v2 + 1) {
            Entry entry0 = k0.l(v1);
            float[] arr_f = this.j;
            arr_f[0] = entry0.l();
            float[] arr_f1 = this.j;
            arr_f1[1] = entry0.d() * f;
            i0.o(this.j);
            if(!l0.J(this.j[0])) {
                break;
            }
            if(l0.I(this.j[0]) && l0.M(this.j[1])) {
                this.c.setColor(k0.Y0(v1 / 2));
                v2 = v1;
                e0.a(canvas0, k0, this.a, this.j[0], this.j[1], this.c);
            }
            else {
                v2 = v1;
            }
        }
    }
}

