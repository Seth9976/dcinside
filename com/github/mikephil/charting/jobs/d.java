package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.h.a;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

public class d extends e {
    private static h i;

    static {
        h h0 = h.a(2, new d(null, 0.0f, 0.0f, null, null));
        d.i = h0;
        h0.l(0.5f);
    }

    public d(l l0, float f, float f1, i i0, View view0) {
        super(l0, f, f1, i0, view0);
    }

    @Override  // com.github.mikephil.charting.utils.h$a
    protected a a() {
        return new d(this.d, this.e, this.f, this.g, this.h);
    }

    public static d d(l l0, float f, float f1, i i0, View view0) {
        d d0 = (d)d.i.b();
        d0.d = l0;
        d0.e = f;
        d0.f = f1;
        d0.g = i0;
        d0.h = view0;
        return d0;
    }

    public static void e(d d0) {
        d.i.g(d0);
    }

    @Override
    public void run() {
        float[] arr_f = this.c;
        arr_f[0] = this.e;
        arr_f[1] = this.f;
        this.g.o(arr_f);
        this.d.e(this.c, this.h);
        d.e(this);
    }
}

