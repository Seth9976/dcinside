package com.github.mikephil.charting.jobs;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

@SuppressLint({"NewApi"})
public class a extends b {
    private static h m;

    static {
        h h0 = h.a(4, new a(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
        a.m = h0;
        h0.l(0.5f);
    }

    public a(l l0, float f, float f1, i i0, View view0, float f2, float f3, long v) {
        super(l0, f, f1, i0, view0, f2, f3, v);
    }

    @Override  // com.github.mikephil.charting.utils.h$a
    protected com.github.mikephil.charting.utils.h.a a() {
        return new a(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L);
    }

    @Override  // com.github.mikephil.charting.jobs.b
    public void g() {
        a.k(this);
    }

    public static a j(l l0, float f, float f1, i i0, View view0, float f2, float f3, long v) {
        a a0 = (a)a.m.b();
        a0.d = l0;
        a0.e = f;
        a0.f = f1;
        a0.g = i0;
        a0.h = view0;
        a0.k = f2;
        a0.l = f3;
        a0.i.setDuration(v);
        return a0;
    }

    public static void k(a a0) {
        a.m.g(a0);
    }

    @Override  // com.github.mikephil.charting.jobs.b
    public void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float[] arr_f = this.c;
        float f = this.j;
        arr_f[0] = this.k + (this.e - this.k) * f;
        arr_f[1] = this.l + (this.f - this.l) * f;
        this.g.o(arr_f);
        this.d.e(this.c, this.h);
    }
}

