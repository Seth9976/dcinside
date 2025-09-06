package com.github.mikephil.charting.buffer;

import com.github.mikephil.charting.data.BarEntry;
import t1.a;

public class c extends b {
    public c(int v, int v1, boolean z) {
        super(v, v1, z);
    }

    @Override  // com.github.mikephil.charting.buffer.b
    public void a(Object object0) {
        this.h(((a)object0));
    }

    @Override  // com.github.mikephil.charting.buffer.b
    public void h(a a0) {
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
                    this.g(f12, f2 + f1, f3, f2 - f1);
                }
                else {
                    float f4 = -barEntry0.u();
                    int v1 = 0;
                    float f5 = 0.0f;
                    while(v1 < arr_f.length) {
                        float f6 = arr_f[v1];
                        if(f6 >= 0.0f) {
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
                        this.g(f9 * this.d, f2 + f1, f4 * this.d, f2 - f1);
                        ++v1;
                        f4 = f8;
                    }
                }
            }
        }
        this.d();
    }
}

