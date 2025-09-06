package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.highlight.j;

@SuppressLint({"ParcelCreator"})
public class BarEntry extends Entry {
    private float[] e;
    private j[] f;
    private float g;
    private float h;

    public BarEntry(float f, float f1) {
        super(f, f1);
    }

    public BarEntry(float f, float f1, Drawable drawable0) {
        super(f, f1, drawable0);
    }

    public BarEntry(float f, float f1, Drawable drawable0, Object object0) {
        super(f, f1, drawable0, object0);
    }

    public BarEntry(float f, float f1, Object object0) {
        super(f, f1, object0);
    }

    public BarEntry(float f, float[] arr_f) {
        super(f, BarEntry.r(arr_f));
        this.e = arr_f;
        this.o();
        this.q();
    }

    public BarEntry(float f, float[] arr_f, Drawable drawable0) {
        super(f, BarEntry.r(arr_f), drawable0);
        this.e = arr_f;
        this.o();
        this.q();
    }

    public BarEntry(float f, float[] arr_f, Drawable drawable0, Object object0) {
        super(f, BarEntry.r(arr_f), drawable0, object0);
        this.e = arr_f;
        this.o();
        this.q();
    }

    public BarEntry(float f, float[] arr_f, Object object0) {
        super(f, BarEntry.r(arr_f), object0);
        this.e = arr_f;
        this.o();
        this.q();
    }

    public void A(float[] arr_f) {
        this.g(BarEntry.r(arr_f));
        this.e = arr_f;
        this.o();
        this.q();
    }

    @Override  // com.github.mikephil.charting.data.f
    public float d() {
        return super.d();
    }

    @Override  // com.github.mikephil.charting.data.Entry
    public Entry h() {
        return this.s();
    }

    private void o() {
        float[] arr_f = this.e;
        if(arr_f == null) {
            this.g = 0.0f;
            this.h = 0.0f;
            return;
        }
        float f = 0.0f;
        float f1 = 0.0f;
        for(int v = 0; v < arr_f.length; ++v) {
            float f2 = arr_f[v];
            if(f2 <= 0.0f) {
                f += Math.abs(f2);
            }
            else {
                f1 += f2;
            }
        }
        this.g = f;
        this.h = f1;
    }

    protected void q() {
        float[] arr_f = this.y();
        if(arr_f != null && arr_f.length != 0) {
            this.f = new j[arr_f.length];
            float f = -this.u();
            float f1 = 0.0f;
            for(int v = 0; true; ++v) {
                j[] arr_j = this.f;
                if(v >= arr_j.length) {
                    break;
                }
                float f2 = arr_f[v];
                if(f2 < 0.0f) {
                    float f3 = f - f2;
                    arr_j[v] = new j(f, f3);
                    f = f3;
                }
                else {
                    float f4 = f2 + f1;
                    arr_j[v] = new j(f1, f4);
                    f1 = f4;
                }
            }
        }
    }

    private static float r(float[] arr_f) {
        float f = 0.0f;
        if(arr_f == null) {
            return 0.0f;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            f += arr_f[v];
        }
        return f;
    }

    public BarEntry s() {
        BarEntry barEntry0 = new BarEntry(this.l(), this.d(), this.a());
        barEntry0.A(this.e);
        return barEntry0;
    }

    @Deprecated
    public float t(int v) {
        return this.x(v);
    }

    public float u() {
        return this.g;
    }

    public float v() {
        return this.h;
    }

    public j[] w() {
        return this.f;
    }

    public float x(int v) {
        float[] arr_f = this.e;
        float f = 0.0f;
        if(arr_f == null) {
            return 0.0f;
        }
        for(int v1 = arr_f.length - 1; v1 > v && v1 >= 0; --v1) {
            f += this.e[v1];
        }
        return f;
    }

    public float[] y() {
        return this.e;
    }

    public boolean z() {
        return this.e != null;
    }
}

