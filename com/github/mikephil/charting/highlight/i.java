package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.t;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.k;
import java.util.List;
import t1.e;

public class i extends h {
    public i(RadarChart radarChart0) {
        super(radarChart0);
    }

    @Override  // com.github.mikephil.charting.highlight.h
    protected d b(int v, float f, float f1) {
        List list0 = this.c(v);
        float f2 = ((RadarChart)this.a).Z(f, f1);
        float f3 = ((RadarChart)this.a).getFactor();
        d d0 = null;
        float f4 = 3.402823E+38f;
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            d d1 = (d)list0.get(v1);
            float f5 = Math.abs(d1.j() - f2 / f3);
            if(f5 < f4) {
                d0 = d1;
                f4 = f5;
            }
        }
        return d0;
    }

    protected List c(int v) {
        this.b.clear();
        float f = ((RadarChart)this.a).getAnimator().h();
        float f1 = ((RadarChart)this.a).getAnimator().i();
        float f2 = ((RadarChart)this.a).getSliceAngle();
        float f3 = ((RadarChart)this.a).getFactor();
        g g0 = g.c(0.0f, 0.0f);
        for(int v1 = 0; v1 < ((t)((RadarChart)this.a).getData()).m(); ++v1) {
            e e0 = ((t)((RadarChart)this.a).getData()).k(v1);
            Entry entry0 = e0.l(v);
            float f4 = entry0.d();
            float f5 = ((RadarChart)this.a).getYChartMin();
            k.B(((RadarChart)this.a).getCenterOffsets(), (f4 - f5) * f3 * f1, f2 * ((float)v) * f + ((RadarChart)this.a).getRotationAngle(), g0);
            float f6 = g0.c;
            float f7 = g0.d;
            this.b.add(new d(((float)v), entry0.d(), f6, f7, v1, e0.E0()));
        }
        return this.b;
    }
}

