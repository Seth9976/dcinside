package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.renderer.b;
import s1.a;

public class BarChart extends BarLineChartBase implements a {
    protected boolean q9;
    private boolean r9;
    private boolean s9;
    private boolean t9;

    public BarChart(Context context0) {
        super(context0);
        this.q9 = false;
        this.r9 = true;
        this.s9 = false;
        this.t9 = false;
    }

    public BarChart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.q9 = false;
        this.r9 = true;
        this.s9 = false;
        this.t9 = false;
    }

    public BarChart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.q9 = false;
        this.r9 = true;
        this.s9 = false;
        this.t9 = false;
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    protected void H() {
        super.H();
        this.r = new b(this, this.u, this.t);
        this.setHighlighter(new com.github.mikephil.charting.highlight.a(this));
        this.getXAxis().t0(0.5f);
        this.getXAxis().s0(0.5f);
    }

    public RectF W0(BarEntry barEntry0) {
        RectF rectF0 = new RectF();
        this.X0(barEntry0, rectF0);
        return rectF0;
    }

    public void X0(BarEntry barEntry0, RectF rectF0) {
        t1.a a0 = (t1.a)((com.github.mikephil.charting.data.a)this.b).n(barEntry0);
        if(a0 == null) {
            rectF0.set(1.401298E-45f, 1.401298E-45f, 1.401298E-45f, 1.401298E-45f);
            return;
        }
        float f = barEntry0.d();
        float f1 = barEntry0.l();
        float f2 = ((com.github.mikephil.charting.data.a)this.b).Q();
        float f3 = f >= 0.0f ? f : 0.0f;
        if(f > 0.0f) {
            f = 0.0f;
        }
        rectF0.set(f1 - f2 / 2.0f, f3, f1 + f2 / 2.0f, f);
        this.d(a0.E0()).t(rectF0);
    }

    public void Y0(float f, float f1, float f2) {
        if(this.getBarData() == null) {
            throw new RuntimeException("You need to set data for the chart before grouping bars.");
        }
        this.getBarData().S(f, f1, f2);
        this.O();
    }

    public void Z0(float f, int v, int v1) {
        this.F(new d(f, v, v1), false);
    }

    @Override  // s1.a
    public boolean a() {
        return this.r9;
    }

    @Override  // s1.a
    public boolean b() {
        return this.q9;
    }

    @Override  // s1.a
    public boolean c() {
        return this.s9;
    }

    @Override  // s1.a
    public com.github.mikephil.charting.data.a getBarData() {
        return (com.github.mikephil.charting.data.a)this.b;
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    protected void o() {
        if(this.t9) {
            this.i.n(((com.github.mikephil.charting.data.a)this.b).y() - ((com.github.mikephil.charting.data.a)this.b).Q() / 2.0f, ((com.github.mikephil.charting.data.a)this.b).x() + ((com.github.mikephil.charting.data.a)this.b).Q() / 2.0f);
        }
        else {
            this.i.n(((com.github.mikephil.charting.data.a)this.b).y(), ((com.github.mikephil.charting.data.a)this.b).x());
        }
        this.Z8.n(((com.github.mikephil.charting.data.a)this.b).C(com.github.mikephil.charting.components.k.a.a), ((com.github.mikephil.charting.data.a)this.b).A(com.github.mikephil.charting.components.k.a.a));
        this.a9.n(((com.github.mikephil.charting.data.a)this.b).C(com.github.mikephil.charting.components.k.a.b), ((com.github.mikephil.charting.data.a)this.b).A(com.github.mikephil.charting.components.k.a.b));
    }

    public void setDrawBarShadow(boolean z) {
        this.s9 = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.r9 = z;
    }

    public void setFitBars(boolean z) {
        this.t9 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.q9 = z;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    public d x(float f, float f1) {
        if(this.b == null) {
            Log.e("MPAndroidChart", "Can\'t select by touch. No data set.");
            return null;
        }
        d d0 = this.getHighlighter().a(f, f1);
        return d0 == null || !this.b() ? d0 : new d(d0.h(), d0.j(), d0.i(), d0.k(), d0.d(), -1, d0.b());
    }
}

