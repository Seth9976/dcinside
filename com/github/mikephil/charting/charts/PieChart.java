package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.r;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.renderer.m;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.k;
import java.util.List;
import t1.i;

public class PieChart extends PieRadarChartBase {
    private RectF M8;
    private boolean N8;
    private float[] O8;
    private float[] P8;
    private boolean Q8;
    private boolean R8;
    private boolean S8;
    private boolean T8;
    private CharSequence U8;
    private g V8;
    private float W8;
    protected float X8;
    private boolean Y8;
    private float Z8;
    protected float a9;
    private float b9;

    public PieChart(Context context0) {
        super(context0);
        this.M8 = new RectF();
        this.N8 = true;
        this.O8 = new float[1];
        this.P8 = new float[1];
        this.Q8 = true;
        this.R8 = false;
        this.S8 = false;
        this.T8 = false;
        this.U8 = "";
        this.V8 = g.c(0.0f, 0.0f);
        this.W8 = 50.0f;
        this.X8 = 55.0f;
        this.Y8 = true;
        this.Z8 = 100.0f;
        this.a9 = 360.0f;
        this.b9 = 0.0f;
    }

    public PieChart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.M8 = new RectF();
        this.N8 = true;
        this.O8 = new float[1];
        this.P8 = new float[1];
        this.Q8 = true;
        this.R8 = false;
        this.S8 = false;
        this.T8 = false;
        this.U8 = "";
        this.V8 = g.c(0.0f, 0.0f);
        this.W8 = 50.0f;
        this.X8 = 55.0f;
        this.Y8 = true;
        this.Z8 = 100.0f;
        this.a9 = 360.0f;
        this.b9 = 0.0f;
    }

    public PieChart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.M8 = new RectF();
        this.N8 = true;
        this.O8 = new float[1];
        this.P8 = new float[1];
        this.Q8 = true;
        this.R8 = false;
        this.S8 = false;
        this.T8 = false;
        this.U8 = "";
        this.V8 = g.c(0.0f, 0.0f);
        this.W8 = 50.0f;
        this.X8 = 55.0f;
        this.Y8 = true;
        this.Z8 = 100.0f;
        this.a9 = 360.0f;
        this.b9 = 0.0f;
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    protected void H() {
        super.H();
        this.r = new m(this, this.u, this.t);
        this.i = null;
        this.s = new com.github.mikephil.charting.highlight.g(this);
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    public int b0(float f) {
        float f1 = k.z(f - this.getRotationAngle());
        for(int v = 0; true; ++v) {
            float[] arr_f = this.P8;
            if(v >= arr_f.length) {
                break;
            }
            if(arr_f[v] > f1) {
                return v;
            }
        }
        return -1;
    }

    private float g0(float f) {
        return this.h0(f, ((r)this.b).T());
    }

    public float[] getAbsoluteAngles() {
        return this.P8;
    }

    public g getCenterCircleBox() {
        return g.c(this.M8.centerX(), this.M8.centerY());
    }

    public CharSequence getCenterText() {
        return this.U8;
    }

    public g getCenterTextOffset() {
        return g.c(this.V8.c, this.V8.d);
    }

    public float getCenterTextRadiusPercent() {
        return this.Z8;
    }

    public RectF getCircleBox() {
        return this.M8;
    }

    public float[] getDrawAngles() {
        return this.O8;
    }

    public float getHoleRadius() {
        return this.W8;
    }

    public float getMaxAngle() {
        return this.a9;
    }

    public float getMinAngleForSlices() {
        return this.b9;
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    public float getRadius() {
        return this.M8 == null ? 0.0f : Math.min(this.M8.width() / 2.0f, this.M8.height() / 2.0f);
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredBaseOffset() {
        return 0.0f;
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    protected float getRequiredLegendOffset() {
        return this.q.e().getTextSize() * 2.0f;
    }

    public float getTransparentCircleRadius() {
        return this.X8;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    @Deprecated
    public j getXAxis() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    private float h0(float f, float f1) {
        return f / f1 * this.a9;
    }

    private void i0() {
        int v = ((r)this.b).r();
        if(this.O8.length == v) {
            for(int v1 = 0; v1 < v; ++v1) {
                this.O8[v1] = 0.0f;
            }
        }
        else {
            this.O8 = new float[v];
        }
        if(this.P8.length == v) {
            for(int v2 = 0; v2 < v; ++v2) {
                this.P8[v2] = 0.0f;
            }
        }
        else {
            this.P8 = new float[v];
        }
        float f = ((r)this.b).T();
        List list0 = ((r)this.b).q();
        boolean z = this.b9 != 0.0f && ((float)v) * this.b9 <= this.a9;
        float[] arr_f = new float[v];
        float f1 = 0.0f;
        float f2 = 0.0f;
        int v4 = 0;
        for(int v3 = 0; v3 < ((r)this.b).m(); ++v3) {
            i i0 = (i)list0.get(v3);
            for(int v5 = 0; v5 < i0.N(); ++v5) {
                float f3 = this.h0(Math.abs(((PieEntry)i0.l(v5)).d()), f);
                if(z) {
                    float f4 = this.b9;
                    float f5 = f3 - f4;
                    if(f5 <= 0.0f) {
                        arr_f[v4] = f4;
                        f1 += -f5;
                    }
                    else {
                        arr_f[v4] = f3;
                        f2 += f5;
                    }
                }
                this.O8[v4] = f3;
                if(v4 == 0) {
                    this.P8[0] = f3;
                }
                else {
                    this.P8[v4] = this.P8[v4 - 1] + f3;
                }
                ++v4;
            }
        }
        if(z) {
            for(int v6 = 0; v6 < v; ++v6) {
                float f6 = arr_f[v6];
                float f7 = f6 - (f6 - this.b9) / f2 * f1;
                arr_f[v6] = f7;
                if(v6 == 0) {
                    this.P8[0] = arr_f[0];
                }
                else {
                    this.P8[v6] = this.P8[v6 - 1] + f7;
                }
            }
            this.O8 = arr_f;
        }
    }

    public int j0(int v) {
        List list0 = ((r)this.b).q();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if(((i)list0.get(v1)).M0(((float)v), NaNf) != null) {
                return v1;
            }
        }
        return -1;
    }

    public boolean k0() {
        return this.Y8;
    }

    public boolean l0() {
        return this.N8;
    }

    public boolean m0() {
        return this.Q8;
    }

    public boolean n0() {
        return this.T8;
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    protected void o() {
        this.i0();
    }

    public boolean o0() {
        return this.R8;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void onDetachedFromWindow() {
        com.github.mikephil.charting.renderer.g g0 = this.r;
        if(g0 != null && g0 instanceof m) {
            ((m)g0).w();
        }
        super.onDetachedFromWindow();
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        if(this.b == null) {
            return;
        }
        this.r.b(canvas0);
        if(this.Y()) {
            this.r.d(canvas0, this.A);
        }
        this.r.c(canvas0);
        this.r.f(canvas0);
        this.q.f(canvas0);
        this.u(canvas0);
        this.v(canvas0);
    }

    @Override  // com.github.mikephil.charting.charts.PieRadarChartBase
    public void p() {
        super.p();
        if(this.b == null) {
            return;
        }
        float f = this.getDiameter();
        g g0 = this.getCenterOffsets();
        float f1 = ((r)this.b).Q().x();
        this.M8.set(g0.c - f / 2.0f + f1, g0.d - f / 2.0f + f1, g0.c + f / 2.0f - f1, g0.d + f / 2.0f - f1);
        g.h(g0);
    }

    public boolean p0() {
        return this.S8;
    }

    public boolean q0(int v) {
        if(!this.Y()) {
            return false;
        }
        for(int v1 = 0; true; ++v1) {
            d[] arr_d = this.A;
            if(v1 >= arr_d.length) {
                break;
            }
            if(((int)arr_d[v1].h()) == v) {
                return true;
            }
        }
        return false;
    }

    public void r0(float f, float f1) {
        g g0 = this.V8;
        g0.c = k.e(f);
        g g1 = this.V8;
        g1.d = k.e(f1);
    }

    public void setCenterText(CharSequence charSequence0) {
        if(charSequence0 == null) {
            this.U8 = "";
            return;
        }
        this.U8 = charSequence0;
    }

    public void setCenterTextColor(int v) {
        ((m)this.r).r().setColor(v);
    }

    public void setCenterTextRadiusPercent(float f) {
        this.Z8 = f;
    }

    public void setCenterTextSize(float f) {
        ((m)this.r).r().setTextSize(k.e(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((m)this.r).r().setTextSize(f);
    }

    public void setCenterTextTypeface(Typeface typeface0) {
        ((m)this.r).r().setTypeface(typeface0);
    }

    public void setDrawCenterText(boolean z) {
        this.Y8 = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.N8 = z;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.Q8 = z;
    }

    public void setDrawRoundedSlices(boolean z) {
        this.T8 = z;
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.N8 = z;
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.R8 = z;
    }

    public void setEntryLabelColor(int v) {
        ((m)this.r).s().setColor(v);
    }

    public void setEntryLabelTextSize(float f) {
        ((m)this.r).s().setTextSize(k.e(f));
    }

    public void setEntryLabelTypeface(Typeface typeface0) {
        ((m)this.r).s().setTypeface(typeface0);
    }

    public void setHoleColor(int v) {
        ((m)this.r).t().setColor(v);
    }

    public void setHoleRadius(float f) {
        this.W8 = f;
    }

    public void setMaxAngle(float f) {
        if(f > 360.0f) {
            f = 360.0f;
        }
        if(f < 90.0f) {
            f = 90.0f;
        }
        this.a9 = f;
    }

    public void setMinAngleForSlices(float f) {
        float f1 = this.a9;
        if(f > f1 / 2.0f) {
            f = f1 / 2.0f;
        }
        else if(f < 0.0f) {
            f = 0.0f;
        }
        this.b9 = f;
    }

    public void setTransparentCircleAlpha(int v) {
        ((m)this.r).u().setAlpha(v);
    }

    public void setTransparentCircleColor(int v) {
        Paint paint0 = ((m)this.r).u();
        int v1 = paint0.getAlpha();
        paint0.setColor(v);
        paint0.setAlpha(v1);
    }

    public void setTransparentCircleRadius(float f) {
        this.X8 = f;
    }

    public void setUsePercentValues(boolean z) {
        this.S8 = z;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected float[] y(d d0) {
        g g0 = this.getCenterCircleBox();
        float f = this.getRadius();
        float f1 = this.getRotationAngle();
        int v = (int)d0.h();
        float f2 = this.O8[v] / 2.0f;
        double f3 = (double)(f - (this.m0() ? (f - f / 100.0f * this.getHoleRadius()) / 2.0f : f / 10.0f * 3.6f));
        float f4 = (float)(Math.cos(Math.toRadians((this.P8[v] + f1 - f2) * this.u.i())) * f3 + ((double)g0.c));
        float f5 = (float)(f3 * Math.sin(Math.toRadians((f1 + this.P8[v] - f2) * this.u.i())) + ((double)g0.d));
        g.h(g0);
        return new float[]{f4, f5};
    }
}

