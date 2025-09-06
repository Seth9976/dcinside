package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import java.text.DecimalFormat;

public class j extends l {
    public DecimalFormat a;
    private PieChart b;

    public j() {
        this.a = new DecimalFormat("###,###,##0.0");
    }

    public j(PieChart pieChart0) {
        this.b = pieChart0;
    }

    @Override  // com.github.mikephil.charting.formatter.l
    public String h(float f) {
        return this.a.format(((double)f)) + " %";
    }

    @Override  // com.github.mikephil.charting.formatter.l
    public String i(float f, PieEntry pieEntry0) {
        return this.b == null || !this.b.p0() ? this.a.format(((double)f)) : this.h(f);
    }
}

