package com.github.mikephil.charting.renderer;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.l;
import s1.b;
import t1.e;

public abstract class c extends g {
    public class a {
        public int a;
        public int b;
        public int c;
        final c d;

        public void a(b b0, t1.b b1) {
            float f = Math.max(0.0f, Math.min(1.0f, c.this.b.h()));
            float f1 = b0.getLowestVisibleX();
            float f2 = b0.getHighestVisibleX();
            Entry entry0 = b1.d1(f1, NaNf, com.github.mikephil.charting.data.m.a.b);
            Entry entry1 = b1.d1(f2, NaNf, com.github.mikephil.charting.data.m.a.a);
            int v = 0;
            this.a = entry0 == null ? 0 : b1.e(entry0);
            if(entry1 != null) {
                v = b1.e(entry1);
            }
            this.b = v;
            this.c = (int)(((float)(v - this.a)) * f);
        }
    }

    protected a g;

    public c(com.github.mikephil.charting.animation.a a0, l l0) {
        super(a0, l0);
        this.g = new a(this);
    }

    protected boolean l(Entry entry0, t1.b b0) {
        return entry0 == null ? false : ((float)b0.e(entry0)) < ((float)b0.N()) * this.b.h();
    }

    // 去混淆评级： 低(30)
    protected boolean m(e e0) {
        return e0.isVisible() && (e0.D0() || e0.K());
    }
}

