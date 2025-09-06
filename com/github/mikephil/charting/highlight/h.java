package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

public abstract class h implements f {
    protected PieRadarChartBase a;
    protected List b;

    public h(PieRadarChartBase pieRadarChartBase0) {
        this.b = new ArrayList();
        this.a = pieRadarChartBase0;
    }

    @Override  // com.github.mikephil.charting.highlight.f
    public d a(float f, float f1) {
        if(this.a.Z(f, f1) > this.a.getRadius()) {
            return null;
        }
        float f2 = this.a.a0(f, f1);
        PieRadarChartBase pieRadarChartBase0 = this.a;
        if(pieRadarChartBase0 instanceof PieChart) {
            f2 /= pieRadarChartBase0.getAnimator().i();
        }
        int v = this.a.b0(f2);
        return v < 0 || v >= this.a.getData().w().N() ? null : this.b(v, f, f1);
    }

    protected abstract d b(int arg1, float arg2, float arg3);
}

