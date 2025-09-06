package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.i;
import com.github.mikephil.charting.renderer.e;
import s1.d;

public class CandleStickChart extends BarLineChartBase implements d {
    public CandleStickChart(Context context0) {
        super(context0);
    }

    public CandleStickChart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public CandleStickChart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    protected void H() {
        super.H();
        this.r = new e(this, this.u, this.t);
        this.getXAxis().t0(0.5f);
        this.getXAxis().s0(0.5f);
    }

    @Override  // s1.d
    public i getCandleData() {
        return (i)this.b;
    }
}

