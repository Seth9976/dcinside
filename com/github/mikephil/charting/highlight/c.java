package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.k;
import java.util.List;
import t1.e;

public class c extends b implements f {
    protected a c;

    public c(s1.f f0, s1.a a0) {
        super(f0);
        this.c = a0.getBarData() == null ? null : new a(a0);
    }

    @Override  // com.github.mikephil.charting.highlight.b
    protected List h(float f, float f1, float f2) {
        this.b.clear();
        List list0 = ((s1.f)this.a).getCombinedData().Q();
        for(int v = 0; v < list0.size(); ++v) {
            k k0 = (k)list0.get(v);
            a a0 = this.c;
            if(a0 == null || !(k0 instanceof com.github.mikephil.charting.data.a)) {
                int v1 = k0.m();
                for(int v2 = 0; v2 < v1; ++v2) {
                    e e0 = ((com.github.mikephil.charting.data.c)list0.get(v)).k(v2);
                    if(e0.f0()) {
                        for(Object object0: this.b(e0, v2, f, com.github.mikephil.charting.data.m.a.c)) {
                            ((d)object0).m(v);
                            this.b.add(((d)object0));
                        }
                    }
                }
            }
            else {
                d d0 = a0.a(f1, f2);
                if(d0 != null) {
                    d0.m(v);
                    this.b.add(d0);
                }
            }
        }
        return this.b;
    }
}

