package com.github.mikephil.charting.utils;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import java.util.List;
import t1.c;
import t1.d;
import t1.f;
import t1.k;

public class i {
    protected Matrix a;
    protected Matrix b;
    protected l c;
    protected float[] d;
    protected float[] e;
    protected float[] f;
    protected float[] g;
    protected Matrix h;
    float[] i;
    private Matrix j;
    private Matrix k;

    public i(l l0) {
        this.a = new Matrix();
        this.b = new Matrix();
        this.d = new float[1];
        this.e = new float[1];
        this.f = new float[1];
        this.g = new float[1];
        this.h = new Matrix();
        this.i = new float[2];
        this.j = new Matrix();
        this.k = new Matrix();
        this.c = l0;
    }

    public float[] a(c c0, float f, int v, int v1) {
        int v2 = (v1 - v + 1) * 2;
        if(this.e.length != v2) {
            this.e = new float[v2];
        }
        float[] arr_f = this.e;
        for(int v3 = 0; v3 < v2; v3 += 2) {
            Entry entry0 = c0.l(v3 / 2 + v);
            if(entry0 == null) {
                arr_f[v3] = 0.0f;
                arr_f[v3 + 1] = 0.0f;
            }
            else {
                arr_f[v3] = entry0.l();
                arr_f[v3 + 1] = entry0.d() * f;
            }
        }
        this.i().mapPoints(arr_f);
        return arr_f;
    }

    public float[] b(d d0, float f, float f1, int v, int v1) {
        int v2 = ((int)(((float)(v1 - v)) * f + 1.0f)) * 2;
        if(this.g.length != v2) {
            this.g = new float[v2];
        }
        float[] arr_f = this.g;
        for(int v3 = 0; v3 < v2; v3 += 2) {
            CandleEntry candleEntry0 = (CandleEntry)d0.l(v3 / 2 + v);
            if(candleEntry0 == null) {
                arr_f[v3] = 0.0f;
                arr_f[v3 + 1] = 0.0f;
            }
            else {
                arr_f[v3] = candleEntry0.l();
                arr_f[v3 + 1] = candleEntry0.s() * f1;
            }
        }
        this.i().mapPoints(arr_f);
        return arr_f;
    }

    public float[] c(f f0, float f1, float f2, int v, int v1) {
        int v2 = (((int)(((float)(v1 - v)) * f1)) + 1) * 2;
        if(this.f.length != v2) {
            this.f = new float[v2];
        }
        float[] arr_f = this.f;
        for(int v3 = 0; v3 < v2; v3 += 2) {
            Entry entry0 = f0.l(v3 / 2 + v);
            if(entry0 == null) {
                arr_f[v3] = 0.0f;
                arr_f[v3 + 1] = 0.0f;
            }
            else {
                arr_f[v3] = entry0.l();
                arr_f[v3 + 1] = entry0.d() * f2;
            }
        }
        this.i().mapPoints(arr_f);
        return arr_f;
    }

    public float[] d(k k0, float f, float f1, int v, int v1) {
        int v2 = ((int)(((float)(v1 - v)) * f + 1.0f)) * 2;
        if(this.d.length != v2) {
            this.d = new float[v2];
        }
        float[] arr_f = this.d;
        for(int v3 = 0; v3 < v2; v3 += 2) {
            Entry entry0 = k0.l(v3 / 2 + v);
            if(entry0 == null) {
                arr_f[v3] = 0.0f;
                arr_f[v3 + 1] = 0.0f;
            }
            else {
                arr_f[v3] = entry0.l();
                arr_f[v3 + 1] = entry0.d() * f1;
            }
        }
        this.i().mapPoints(arr_f);
        return arr_f;
    }

    public Matrix e() {
        return this.b;
    }

    public com.github.mikephil.charting.utils.f f(float f, float f1) {
        float[] arr_f = this.i;
        arr_f[0] = f;
        arr_f[1] = f1;
        this.o(arr_f);
        return com.github.mikephil.charting.utils.f.b(this.i[0], this.i[1]);
    }

    public Matrix g() {
        this.i().invert(this.k);
        return this.k;
    }

    public Matrix h() {
        return this.a;
    }

    public Matrix i() {
        this.j.set(this.a);
        this.j.postConcat(this.c.a);
        this.j.postConcat(this.b);
        return this.j;
    }

    public com.github.mikephil.charting.utils.f j(float f, float f1) {
        com.github.mikephil.charting.utils.f f2 = com.github.mikephil.charting.utils.f.b(0.0, 0.0);
        this.k(f, f1, f2);
        return f2;
    }

    public void k(float f, float f1, com.github.mikephil.charting.utils.f f2) {
        float[] arr_f = this.i;
        arr_f[0] = f;
        arr_f[1] = f1;
        this.n(arr_f);
        float[] arr_f1 = this.i;
        f2.c = (double)arr_f1[0];
        f2.d = (double)arr_f1[1];
    }

    public void l(Path path0) {
        path0.transform(this.a);
        path0.transform(this.c.r());
        path0.transform(this.b);
    }

    public void m(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            this.l(((Path)list0.get(v)));
        }
    }

    public void n(float[] arr_f) {
        Matrix matrix0 = this.h;
        matrix0.reset();
        this.b.invert(matrix0);
        matrix0.mapPoints(arr_f);
        this.c.r().invert(matrix0);
        matrix0.mapPoints(arr_f);
        this.a.invert(matrix0);
        matrix0.mapPoints(arr_f);
    }

    public void o(float[] arr_f) {
        this.a.mapPoints(arr_f);
        this.c.r().mapPoints(arr_f);
        this.b.mapPoints(arr_f);
    }

    public void p(boolean z) {
        this.b.reset();
        if(!z) {
            this.b.postTranslate(this.c.P(), this.c.n() - this.c.O());
            return;
        }
        this.b.setTranslate(this.c.P(), -this.c.R());
        this.b.postScale(1.0f, -1.0f);
    }

    public void q(float f, float f1, float f2, float f3) {
        float f4 = this.c.k() / f1;
        float f5 = this.c.g() / f2;
        if(Float.isInfinite(f4)) {
            f4 = 0.0f;
        }
        if(Float.isInfinite(f5)) {
            f5 = 0.0f;
        }
        this.a.reset();
        this.a.postTranslate(-f, -f3);
        this.a.postScale(f4, -f5);
    }

    public void r(RectF rectF0, float f) {
        rectF0.top *= f;
        rectF0.bottom *= f;
        this.a.mapRect(rectF0);
        this.c.r().mapRect(rectF0);
        this.b.mapRect(rectF0);
    }

    public void s(RectF rectF0, float f) {
        rectF0.left *= f;
        rectF0.right *= f;
        this.a.mapRect(rectF0);
        this.c.r().mapRect(rectF0);
        this.b.mapRect(rectF0);
    }

    public void t(RectF rectF0) {
        this.a.mapRect(rectF0);
        this.c.r().mapRect(rectF0);
        this.b.mapRect(rectF0);
    }

    public void u(RectF rectF0) {
        this.a.mapRect(rectF0);
        this.c.r().mapRect(rectF0);
        this.b.mapRect(rectF0);
    }

    public void v(RectF rectF0, float f) {
        rectF0.left *= f;
        rectF0.right *= f;
        this.a.mapRect(rectF0);
        this.c.r().mapRect(rectF0);
        this.b.mapRect(rectF0);
    }

    public void w(List list0) {
        Matrix matrix0 = this.i();
        for(int v = 0; v < list0.size(); ++v) {
            matrix0.mapRect(((RectF)list0.get(v)));
        }
    }
}

