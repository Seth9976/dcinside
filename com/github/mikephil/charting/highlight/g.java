package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.r;
import t1.i;

public class g extends h {
    public g(PieChart pieChart0) {
        super(pieChart0);
    }

    @Override  // com.github.mikephil.charting.highlight.h
    protected d b(int v, float f, float f1) {
        i i0 = ((r)((PieChart)this.a).getData()).Q();
        return new d(((float)v), i0.l(v).d(), f, f1, 0, i0.E0());
    }
}

