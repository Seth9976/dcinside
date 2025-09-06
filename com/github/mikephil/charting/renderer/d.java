package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.a;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.g;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import java.util.List;

public class d extends c {
    protected s1.c h;
    private float[] i;
    private float[] j;
    private float[] k;

    public d(s1.c c0, a a0, l l0) {
        super(a0, l0);
        this.i = new float[4];
        this.j = new float[2];
        this.k = new float[3];
        this.h = c0;
        this.c.setStyle(Paint.Style.FILL);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(k.e(1.5f));
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas0) {
        for(Object object0: this.h.getBubbleData().q()) {
            t1.c c0 = (t1.c)object0;
            if(c0.isVisible()) {
                this.n(canvas0, c0);
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas0) {
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas0, com.github.mikephil.charting.highlight.d[] arr_d) {
        g g0 = this.h.getBubbleData();
        float f = this.b.i();
        for(int v = 0; v < arr_d.length; ++v) {
            com.github.mikephil.charting.highlight.d d0 = arr_d[v];
            t1.c c0 = (t1.c)g0.k(d0.d());
            if(c0 != null && c0.f0()) {
                BubbleEntry bubbleEntry0 = (BubbleEntry)c0.M0(d0.h(), d0.j());
                if(bubbleEntry0.d() == d0.j() && this.l(bubbleEntry0, c0)) {
                    i i0 = this.h.d(c0.E0());
                    float[] arr_f = this.i;
                    arr_f[0] = 0.0f;
                    arr_f[2] = 1.0f;
                    i0.o(arr_f);
                    boolean z = c0.D();
                    float f1 = Math.min(Math.abs(this.a.f() - this.a.j()), Math.abs(this.i[2] - this.i[0]));
                    float[] arr_f1 = this.j;
                    arr_f1[0] = bubbleEntry0.l();
                    float[] arr_f2 = this.j;
                    arr_f2[1] = bubbleEntry0.d() * f;
                    i0.o(this.j);
                    d0.n(this.j[0], this.j[1]);
                    float f2 = this.o(bubbleEntry0.q(), c0.a(), f1, z) / 2.0f;
                    if(this.a.K(this.j[1] + f2) && this.a.H(this.j[1] - f2) && this.a.I(this.j[0] + f2)) {
                        if(!this.a.J(this.j[0] - f2)) {
                            break;
                        }
                        int v1 = c0.Y0(((int)bubbleEntry0.l()));
                        Color.RGBToHSV(Color.red(v1), Color.green(v1), Color.blue(v1), this.k);
                        this.k[2] *= 0.5f;
                        int v2 = Color.HSVToColor(Color.alpha(v1), this.k);
                        this.d.setColor(v2);
                        this.d.setStrokeWidth(c0.C0());
                        canvas0.drawCircle(this.j[0], this.j[1], f2, this.d);
                    }
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
        int v4;
        float f7;
        float f6;
        BubbleEntry bubbleEntry1;
        g g0 = this.h.getBubbleData();
        if(g0 == null) {
            return;
        }
        if(this.k(this.h)) {
            List list0 = g0.q();
            float f = (float)k.a(this.f, "1");
            for(int v = 0; v < list0.size(); ++v) {
                t1.c c0 = (t1.c)list0.get(v);
                if(this.m(c0) && c0.N() >= 1) {
                    this.a(c0);
                    float f1 = Math.max(0.0f, Math.min(1.0f, this.b.h()));
                    float f2 = this.b.i();
                    this.g.a(this.h, c0);
                    float[] arr_f = this.h.d(c0.E0()).a(c0, f2, this.g.a, this.g.b);
                    float f3 = f1 == 1.0f ? f2 : f1;
                    com.github.mikephil.charting.formatter.l l0 = c0.t0();
                    com.github.mikephil.charting.utils.g g1 = com.github.mikephil.charting.utils.g.d(c0.m1());
                    g1.c = k.e(g1.c);
                    g1.d = k.e(g1.d);
                    for(int v1 = 0; v1 < arr_f.length; v1 = v4 + 2) {
                        int v2 = c0.q(this.g.a + v1 / 2);
                        int v3 = Color.argb(Math.round(255.0f * f3), Color.red(v2), Color.green(v2), Color.blue(v2));
                        float f4 = arr_f[v1];
                        float f5 = arr_f[v1 + 1];
                        if(!this.a.J(f4)) {
                            break;
                        }
                        if(this.a.I(f4) && this.a.M(f5)) {
                            BubbleEntry bubbleEntry0 = (BubbleEntry)c0.l(v1 / 2 + this.g.a);
                            if(c0.D0()) {
                                bubbleEntry1 = bubbleEntry0;
                                f6 = f5;
                                f7 = f4;
                                v4 = v1;
                                this.e(canvas0, l0.f(bubbleEntry0), f4, f5 + 0.5f * f, v3);
                            }
                            else {
                                bubbleEntry1 = bubbleEntry0;
                                f6 = f5;
                                f7 = f4;
                                v4 = v1;
                            }
                            if(bubbleEntry1.c() != null && c0.K()) {
                                Drawable drawable0 = bubbleEntry1.c();
                                k.k(canvas0, drawable0, ((int)(f7 + g1.c)), ((int)(f6 + g1.d)), drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
                            }
                        }
                        else {
                            v4 = v1;
                        }
                    }
                    com.github.mikephil.charting.utils.g.h(g1);
                }
            }
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void j() {
    }

    protected void n(Canvas canvas0, t1.c c0) {
        if(c0.N() < 1) {
            return;
        }
        i i0 = this.h.d(c0.E0());
        float f = this.b.i();
        this.g.a(this.h, c0);
        float[] arr_f = this.i;
        arr_f[0] = 0.0f;
        arr_f[2] = 1.0f;
        i0.o(arr_f);
        boolean z = c0.D();
        float f1 = Math.min(Math.abs(this.a.f() - this.a.j()), Math.abs(this.i[2] - this.i[0]));
        for(int v = this.g.a; v <= this.g.c + this.g.a; ++v) {
            BubbleEntry bubbleEntry0 = (BubbleEntry)c0.l(v);
            float[] arr_f1 = this.j;
            arr_f1[0] = bubbleEntry0.l();
            float[] arr_f2 = this.j;
            arr_f2[1] = bubbleEntry0.d() * f;
            i0.o(this.j);
            float f2 = this.o(bubbleEntry0.q(), c0.a(), f1, z) / 2.0f;
            if(this.a.K(this.j[1] + f2) && this.a.H(this.j[1] - f2) && this.a.I(this.j[0] + f2)) {
                if(!this.a.J(this.j[0] - f2)) {
                    break;
                }
                int v1 = c0.Y0(((int)bubbleEntry0.l()));
                this.c.setColor(v1);
                canvas0.drawCircle(this.j[0], this.j[1], f2, this.c);
            }
        }
    }

    protected float o(float f, float f1, float f2, boolean z) {
        if(z) {
            if(f1 == 0.0f) {
                return f2 * 1.0f;
            }
            f = (float)Math.sqrt(f / f1);
        }
        return f2 * f;
    }
}

