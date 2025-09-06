package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.components.k.a;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.renderer.h;
import com.github.mikephil.charting.renderer.r;
import com.github.mikephil.charting.renderer.u;
import com.github.mikephil.charting.utils.e;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.j;
import com.github.mikephil.charting.utils.k;

public class HorizontalBarChart extends BarChart {
    private RectF u9;
    protected float[] v9;

    public HorizontalBarChart(Context context0) {
        super(context0);
        this.u9 = new RectF();
        this.v9 = new float[2];
    }

    public HorizontalBarChart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.u9 = new RectF();
        this.v9 = new float[2];
    }

    public HorizontalBarChart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.u9 = new RectF();
        this.v9 = new float[2];
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    protected void G0() {
        this.e9.q(this.a9.H, this.a9.I, this.i.I, this.i.H);
        this.d9.q(this.Z8.H, this.Z8.I, this.i.I, this.i.H);
    }

    @Override  // com.github.mikephil.charting.charts.BarChart
    protected void H() {
        this.t = new e();
        super.H();
        this.d9 = new j(this.t);
        this.e9 = new j(this.t);
        this.r = new h(this, this.u, this.t);
        this.setHighlighter(new com.github.mikephil.charting.highlight.e(this));
        this.b9 = new u(this.t, this.Z8, this.d9);
        this.c9 = new u(this.t, this.a9, this.e9);
        this.f9 = new r(this.t, this.i, this.d9, this);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    public void M0(float f, float f1) {
        float f2 = this.i.I;
        this.t.b0(f2 / f, f2 / f1);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    public void N0(float f, float f1, a k$a0) {
        float f2 = this.g0(k$a0);
        float f3 = this.g0(k$a0);
        this.t.a0(f2 / f, f3 / f1);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    public void O0(float f, a k$a0) {
        float f1 = this.g0(k$a0);
        this.t.c0(f1 / f);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    public void P0(float f, a k$a0) {
        float f1 = this.g0(k$a0);
        this.t.Y(f1 / f);
    }

    @Override  // com.github.mikephil.charting.charts.BarChart
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
        rectF0.set(f3, f1 - f2 / 2.0f, f, f1 + f2 / 2.0f);
        this.d(a0.E0()).t(rectF0);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase, s1.b
    public float getHighestVisibleX() {
        this.d(a.a).k(this.t.h(), this.t.j(), this.o9);
        return (float)Math.min(this.i.G, this.o9.d);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase, s1.b
    public float getLowestVisibleX() {
        this.d(a.a).k(this.t.h(), this.t.f(), this.n9);
        return (float)Math.max(this.i.H, this.n9.d);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    public g k0(Entry entry0, a k$a0) {
        if(entry0 == null) {
            return null;
        }
        float[] arr_f = this.v9;
        arr_f[0] = entry0.d();
        arr_f[1] = entry0.l();
        this.d(k$a0).o(arr_f);
        return g.c(arr_f[0], arr_f[1]);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    public void p() {
        this.a0(this.u9);
        float f = this.u9.left + 0.0f;
        float f1 = this.u9.top + 0.0f;
        float f2 = this.u9.right + 0.0f;
        float f3 = this.u9.bottom + 0.0f;
        if(this.Z8.L0()) {
            f1 += this.Z8.z0(this.b9.c());
        }
        if(this.a9.L0()) {
            f3 += this.a9.z0(this.c9.c());
        }
        float f4 = (float)this.i.L;
        if(this.i.f()) {
            if(this.i.w0() == com.github.mikephil.charting.components.j.a.b) {
                f += f4;
            }
            else if(this.i.w0() == com.github.mikephil.charting.components.j.a.a) {
                f2 += f4;
            }
            else if(this.i.w0() == com.github.mikephil.charting.components.j.a.c) {
                f += f4;
                f2 += f4;
            }
        }
        float f5 = f1 + this.getExtraTopOffset();
        float f6 = f2 + this.getExtraRightOffset();
        float f7 = f3 + this.getExtraBottomOffset();
        float f8 = f + this.getExtraLeftOffset();
        float f9 = k.e(this.W8);
        this.t.U(Math.max(f9, f8), Math.max(f9, f5), Math.max(f9, f6), Math.max(f9, f7));
        if(this.a) {
            Log.i("MPAndroidChart", "offsetLeft: " + f8 + ", offsetTop: " + f5 + ", offsetRight: " + f6 + ", offsetBottom: " + f7);
            Log.i("MPAndroidChart", "Content: " + this.t.q().toString());
        }
        this.F0();
        this.G0();
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMaximum(float f) {
        this.t.d0(this.i.I / f);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRangeMinimum(float f) {
        this.t.Z(this.i.I / f);
    }

    @Override  // com.github.mikephil.charting.charts.BarChart
    public d x(float f, float f1) {
        if(this.b == null) {
            if(this.a) {
                Log.e("MPAndroidChart", "Can\'t select by touch. No data set.");
            }
            return null;
        }
        return this.getHighlighter().a(f1, f);
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected float[] y(d d0) {
        return new float[]{d0.f(), d0.e()};
    }
}

