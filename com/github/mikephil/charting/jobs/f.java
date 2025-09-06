package com.github.mikephil.charting.jobs;

import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.k.a;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

public class f extends e {
    protected float i;
    protected float j;
    protected a k;
    protected Matrix l;
    private static h m;

    static {
        h h0 = h.a(1, new f(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null));
        f.m = h0;
        h0.l(0.5f);
    }

    public f(l l0, float f, float f1, float f2, float f3, i i0, a k$a0, View view0) {
        super(l0, f2, f3, i0, view0);
        this.l = new Matrix();
        this.i = f;
        this.j = f1;
        this.k = k$a0;
    }

    @Override  // com.github.mikephil.charting.utils.h$a
    protected com.github.mikephil.charting.utils.h.a a() {
        return new f(null, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null);
    }

    public static f d(l l0, float f, float f1, float f2, float f3, i i0, a k$a0, View view0) {
        f f4 = (f)f.m.b();
        f4.e = f2;
        f4.f = f3;
        f4.i = f;
        f4.j = f1;
        f4.d = l0;
        f4.g = i0;
        f4.k = k$a0;
        f4.h = view0;
        return f4;
    }

    public static void e(f f0) {
        f.m.g(f0);
    }

    @Override
    public void run() {
        Matrix matrix0 = this.l;
        this.d.m0(this.i, this.j, matrix0);
        this.d.S(matrix0, this.h, false);
        float f = ((BarLineChartBase)this.h).f(this.k).I;
        float f1 = this.d.x();
        float f2 = ((BarLineChartBase)this.h).getXAxis().I;
        float[] arr_f = this.c;
        arr_f[0] = this.e - f2 / this.d.w() / 2.0f;
        arr_f[1] = this.f + f / f1 / 2.0f;
        this.g.o(arr_f);
        this.d.i0(this.c, matrix0);
        this.d.S(matrix0, this.h, false);
        ((BarLineChartBase)this.h).p();
        this.h.postInvalidate();
        f.e(this);
    }
}

