package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;

public class b extends a {
    protected int g;
    protected int h;
    protected boolean i;
    protected boolean j;
    protected float k;

    public b(int v, int v1, boolean z) {
        super(v);
        this.g = 0;
        this.j = false;
        this.k = 1.0f;
        this.h = v1;
        this.i = z;
    }

    @Override  // com.github.mikephil.charting.buffer.a
    public void a(Object object0) {
        this.h(((t1.a)object0));
    }

    protected void g(float f, float f1, float f2, float f3) {
        int v = this.a;
        this.a = v + 1;
        this.b[v] = f;
        this.a = v + 2;
        this.b[v + 1] = f1;
        this.a = v + 3;
        this.b[v + 2] = f2;
        this.a = v + 4;
        this.b[v + 3] = f3;
    }

    public void h(t1.a a0) {
        float f9;
        float f8;
        float f7;
        float f12;
        float f = ((float)a0.N()) * this.c;
        float f1 = this.k / 2.0f;
        for(int v = 0; ((float)v) < f; ++v) {
            BarEntry barEntry0 = (BarEntry)a0.l(v);
            if(barEntry0 != null) {
                float f2 = barEntry0.l();
                float f3 = barEntry0.d();
                float[] arr_f = barEntry0.y();
                if(!this.i || arr_f == null) {
                    if(this.j) {
                        f12 = f3 >= 0.0f ? f3 : 0.0f;
                        if(f3 > 0.0f) {
                            f3 = 0.0f;
                        }
                    }
                    else {
                        float f13 = f3 >= 0.0f ? f3 : 0.0f;
                        if(f3 > 0.0f) {
                            f3 = 0.0f;
                        }
                        float f14 = f3;
                        f3 = f13;
                        f12 = f14;
                    }
                    if(f3 > 0.0f) {
                        f3 *= this.d;
                    }
                    else {
                        f12 *= this.d;
                    }
                    this.g(f2 - f1, f3, f2 + f1, f12);
                }
                else {
                    float f4 = -barEntry0.u();
                    int v1 = 0;
                    float f5 = 0.0f;
                    while(v1 < arr_f.length) {
                        float f6 = arr_f[v1];
                        int v2 = Float.compare(f6, 0.0f);
                        if(v2 == 0 && (f5 == 0.0f || f4 == 0.0f)) {
                            f7 = f6;
                            f8 = f4;
                            f4 = f7;
                        }
                        else if(v2 >= 0) {
                            f7 = f6 + f5;
                            f8 = f4;
                            f4 = f5;
                            f5 = f7;
                        }
                        else {
                            f7 = Math.abs(f6) + f4;
                            f8 = Math.abs(f6) + f4;
                        }
                        if(this.j) {
                            f9 = f4 >= f7 ? f4 : f7;
                            if(f4 > f7) {
                                f4 = f7;
                            }
                        }
                        else {
                            float f10 = f4 >= f7 ? f4 : f7;
                            if(f4 > f7) {
                                f4 = f7;
                            }
                            float f11 = f4;
                            f4 = f10;
                            f9 = f11;
                        }
                        this.g(f2 - f1, f4 * this.d, f2 + f1, f9 * this.d);
                        ++v1;
                        f4 = f8;
                    }
                }
            }
        }
        this.d();
    }

    public void i(float f) {
        this.k = f;
    }

    public void j(int v) {
        this.g = v;
    }

    public void k(boolean z) {
        this.j = z;
    }
}

