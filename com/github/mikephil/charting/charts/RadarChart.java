package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.k.a;
import com.github.mikephil.charting.components.k;
import com.github.mikephil.charting.data.t;
import com.github.mikephil.charting.highlight.i;
import com.github.mikephil.charting.renderer.n;
import com.github.mikephil.charting.renderer.s;
import com.github.mikephil.charting.renderer.v;
import t1.j;

public class RadarChart extends PieRadarChartBase {
    private float M8;
    private float N8;
    private int O8;
    private int P8;
    private int Q8;
    private boolean R8;
    private int S8;
    private k T8;
    protected v U8;
    protected s V8;

    public RadarChart(Context context0) {
        super(context0);
        this.M8 = 2.5f;
        this.N8 = 1.5f;
        this.O8 = Color.rgb(0x7A, 0x7A, 0x7A);
        this.P8 = Color.rgb(0x7A, 0x7A, 0x7A);
        this.Q8 = 150;
        this.R8 = true;
        this.S8 = 0;
    }

    public RadarChart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.M8 = 2.5f;
        this.N8 = 1.5f;
        this.O8 = Color.rgb(0x7A, 0x7A, 0x7A);
        this.P8 = Color.rgb(0x7A, 0x7A, 0x7A);
        this.Q8 = 150;
        this.R8 = true;
        this.S8 = 0;
    }

    public RadarChart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.M8 = 2.5f;
        this.N8 = 1.5f;
        this.O8 = Color.rgb(0x7A, 0x7A, 0x7A);
        this.P8 = Color.rgb(0x7A, 0x7A, 0x7A);
        this.Q8 = 150;
        this.R8 = true;
        this.S8 = 0;
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    protected void H() {
        super.H();
        this.T8 = new k(a.a);
        this.M8 = com.github.mikephil.charting.utils.k.e(1.5f);
        this.N8 = com.github.mikephil.charting.utils.k.e(0.75f);
        this.r = new n(this, this.u, this.t);
        this.U8 = new v(this.t, this.T8, this);
        this.V8 = new s(this.t, this.i, this);
        this.s = new i(this);
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    public void O() {
        if(this.b == null) {
            return;
        }
        this.o();
        this.U8.a(this.T8.H, this.T8.G, this.T8.I0());
        this.V8.a(this.i.H, this.i.G, false);
        if(this.l != null && !this.l.I()) {
            this.q.a(this.b);
        }
        this.p();
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    public int b0(float f) {
        float f1 = com.github.mikephil.charting.utils.k.z(f - this.getRotationAngle());
        float f2 = this.getSliceAngle();
        int v = ((j)((t)this.b).w()).N();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((float)(v1 + 1)) * f2 - f2 / 2.0f > f1) {
                return v1;
            }
        }
        return 0;
    }

    public float getFactor() {
        RectF rectF0 = this.t.q();
        return Math.min(rectF0.width() / 2.0f, rectF0.height() / 2.0f) / this.T8.I;
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        RectF rectF0 = this.t.q();
        return Math.min(rectF0.width() / 2.0f, rectF0.height() / 2.0f);
    }

    // 去混淆评级： 低(20)
    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
        return !this.i.f() || !this.i.P() ? com.github.mikephil.charting.utils.k.e(10.0f) : ((float)this.i.L);
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
        return this.q.e().getTextSize() * 4.0f;
    }

    public int getSkipWebLineCount() {
        return this.S8;
    }

    public float getSliceAngle() {
        return 360.0f / ((float)((j)((t)this.b).w()).N());
    }

    public int getWebAlpha() {
        return this.Q8;
    }

    public int getWebColor() {
        return this.O8;
    }

    public int getWebColorInner() {
        return this.P8;
    }

    public float getWebLineWidth() {
        return this.M8;
    }

    public float getWebLineWidthInner() {
        return this.N8;
    }

    public k getYAxis() {
        return this.T8;
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getYChartMax() {
        return this.T8.G;
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getYChartMin() {
        return this.T8.H;
    }

    public float getYRange() {
        return this.T8.I;
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    protected void o() {
        super.o();
        this.T8.n(((t)this.b).C(a.a), ((t)this.b).A(a.a));
        this.i.n(0.0f, ((float)((j)((t)this.b).w()).N()));
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.b == null) {
            return;
        }
        if(this.i.f()) {
            this.V8.a(this.i.H, this.i.G, false);
        }
        this.V8.g(canvas0);
        if(this.R8) {
            this.r.c(canvas0);
        }
        if(this.T8.f() && this.T8.Q()) {
            this.U8.j(canvas0);
        }
        this.r.b(canvas0);
        if(this.Y()) {
            this.r.d(canvas0, this.A);
        }
        if(this.T8.f() && !this.T8.Q()) {
            this.U8.j(canvas0);
        }
        this.U8.g(canvas0);
        this.r.f(canvas0);
        this.q.f(canvas0);
        this.u(canvas0);
        this.v(canvas0);
    }

    public void setDrawWeb(boolean z) {
        this.R8 = z;
    }

    public void setSkipWebLineCount(int v) {
        this.S8 = Math.max(0, v);
    }

    public void setWebAlpha(int v) {
        this.Q8 = v;
    }

    public void setWebColor(int v) {
        this.O8 = v;
    }

    public void setWebColorInner(int v) {
        this.P8 = v;
    }

    public void setWebLineWidth(float f) {
        this.M8 = com.github.mikephil.charting.utils.k.e(f);
    }

    public void setWebLineWidthInner(float f) {
        this.N8 = com.github.mikephil.charting.utils.k.e(f);
    }
}

