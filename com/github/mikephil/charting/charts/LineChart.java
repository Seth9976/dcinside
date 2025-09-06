package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.n;
import com.github.mikephil.charting.renderer.j;
import s1.g;

public class LineChart extends BarLineChartBase implements g {
    public LineChart(Context context0) {
        super(context0);
    }

    public LineChart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public LineChart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    protected void H() {
        super.H();
        this.r = new j(this, this.u, this.t);
    }

    @Override  // s1.g
    public n getLineData() {
        return (n)this.b;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void onDetachedFromWindow() {
        com.github.mikephil.charting.renderer.g g0 = this.r;
        if(g0 != null && g0 instanceof j) {
            ((j)g0).A();
        }
        super.onDetachedFromWindow();
    }
}

