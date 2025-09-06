package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.g;
import com.github.mikephil.charting.renderer.d;
import s1.c;

public class BubbleChart extends BarLineChartBase implements c {
    public BubbleChart(Context context0) {
        super(context0);
    }

    public BubbleChart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public BubbleChart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    protected void H() {
        super.H();
        this.r = new d(this, this.u, this.t);
    }

    @Override  // s1.c
    public g getBubbleData() {
        return (g)this.b;
    }
}

