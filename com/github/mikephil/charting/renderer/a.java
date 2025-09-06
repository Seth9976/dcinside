package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.f;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;

public abstract class a extends o {
    protected com.github.mikephil.charting.components.a b;
    protected i c;
    protected Paint d;
    protected Paint e;
    protected Paint f;
    protected Paint g;

    public a(l l0, i i0, com.github.mikephil.charting.components.a a0) {
        super(l0);
        this.c = i0;
        this.b = a0;
        if(this.a != null) {
            this.e = new Paint(1);
            Paint paint0 = new Paint();
            this.d = paint0;
            paint0.setColor(0xFF888888);
            this.d.setStrokeWidth(1.0f);
            Paint.Style paint$Style0 = Paint.Style.STROKE;
            this.d.setStyle(paint$Style0);
            this.d.setAlpha(90);
            Paint paint1 = new Paint();
            this.f = paint1;
            paint1.setColor(0xFF000000);
            this.f.setStrokeWidth(1.0f);
            this.f.setStyle(paint$Style0);
            Paint paint2 = new Paint(1);
            this.g = paint2;
            paint2.setStyle(paint$Style0);
        }
    }

    public void a(float f, float f1, boolean z) {
        double f5;
        float f4;
        if(this.a != null && this.a.k() > 10.0f && !this.a.F()) {
            f f2 = this.c.j(this.a.h(), this.a.j());
            f f3 = this.c.j(this.a.h(), this.a.f());
            if(z) {
                f4 = (float)f2.d;
                f5 = f3.d;
            }
            else {
                f4 = (float)f3.d;
                f5 = f2.d;
            }
            f.c(f2);
            f.c(f3);
            f = f4;
            f1 = (float)f5;
        }
        this.b(f, f1);
    }

    protected void b(float f, float f1) {
        int v = this.b.C();
        double f2 = (double)Math.abs(f1 - f);
        if(v != 0 && f2 > 0.0 && !Double.isInfinite(f2)) {
            double f3 = (double)k.L(f2 / ((double)v));
            if(this.b.S() && f3 < ((double)this.b.y())) {
                f3 = (double)this.b.y();
            }
            double f4 = (double)k.L(Math.pow(10.0, ((int)Math.log10(f3))));
            if(((int)(f3 / f4)) > 5) {
                f3 = Math.floor(f4 * 10.0);
            }
            int v1 = this.b.L();
            if(this.b.R()) {
                f3 = (double)(((float)f2) / ((float)(v - 1)));
                com.github.mikephil.charting.components.a a0 = this.b;
                a0.n = v;
                if(a0.l.length < v) {
                    a0.l = new float[v];
                }
                for(int v2 = 0; v2 < v; ++v2) {
                    this.b.l[v2] = f;
                    f = (float)(((double)f) + f3);
                }
            }
            else {
                int v3 = Double.compare(f3, 0.0);
                double f5 = v3 == 0 ? 0.0 : Math.ceil(((double)f) / f3) * f3;
                if(this.b.L()) {
                    f5 -= f3;
                }
                double f6 = v3 == 0 ? 0.0 : k.J(Math.floor(((double)f1) / f3) * f3);
                if(v3 != 0) {
                    for(double f7 = f5; f7 <= f6; f7 += f3) {
                        ++v1;
                    }
                }
                com.github.mikephil.charting.components.a a1 = this.b;
                a1.n = v1;
                if(a1.l.length < v1) {
                    a1.l = new float[v1];
                }
                for(int v4 = 0; v4 < v1; ++v4) {
                    if(f5 == 0.0) {
                        f5 = 0.0;
                    }
                    this.b.l[v4] = (float)f5;
                    f5 += f3;
                }
                v = v1;
            }
            this.b.o = f3 < 1.0 ? ((int)Math.ceil(-Math.log10(f3))) : 0;
            if(this.b.L()) {
                com.github.mikephil.charting.components.a a2 = this.b;
                if(a2.m.length < v) {
                    a2.m = new float[v];
                }
                for(int v5 = 0; v5 < v; ++v5) {
                    this.b.m[v5] = this.b.l[v5] + ((float)f3) / 2.0f;
                }
            }
            return;
        }
        this.b.l = new float[0];
        this.b.m = new float[0];
        this.b.n = 0;
    }

    public Paint c() {
        return this.e;
    }

    public Paint d() {
        return this.f;
    }

    public Paint e() {
        return this.d;
    }

    public i f() {
        return this.c;
    }

    public abstract void g(Canvas arg1);

    public abstract void h(Canvas arg1);

    public abstract void i(Canvas arg1);

    public abstract void j(Canvas arg1);
}

