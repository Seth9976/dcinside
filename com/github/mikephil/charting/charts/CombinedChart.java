package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.g;
import com.github.mikephil.charting.data.i;
import com.github.mikephil.charting.data.k;
import com.github.mikephil.charting.data.l;
import com.github.mikephil.charting.data.n;
import com.github.mikephil.charting.data.v;
import com.github.mikephil.charting.highlight.c;
import com.github.mikephil.charting.highlight.d;
import s1.f;
import t1.b;

public class CombinedChart extends BarLineChartBase implements f {
    public static enum a {
        BAR,
        BUBBLE,
        LINE,
        CANDLE,
        SCATTER;

    }

    private boolean q9;
    protected boolean r9;
    private boolean s9;
    protected a[] t9;

    public CombinedChart(Context context0) {
        super(context0);
        this.q9 = true;
        this.r9 = false;
        this.s9 = false;
    }

    public CombinedChart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.q9 = true;
        this.r9 = false;
        this.s9 = false;
    }

    public CombinedChart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.q9 = true;
        this.r9 = false;
        this.s9 = false;
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    protected void H() {
        super.H();
        this.t9 = new a[]{a.a, a.b, a.c, a.d, a.e};
        this.setHighlighter(new c(this, this));
        this.setHighlightFullBarEnabled(true);
        this.r = new com.github.mikephil.charting.renderer.f(this, this.u, this.t);
    }

    @Override  // s1.a
    public boolean a() {
        return this.q9;
    }

    @Override  // s1.a
    public boolean b() {
        return this.r9;
    }

    @Override  // s1.a
    public boolean c() {
        return this.s9;
    }

    @Override  // s1.a
    public com.github.mikephil.charting.data.a getBarData() {
        return this.b == null ? null : ((l)this.b).R();
    }

    @Override  // s1.c
    public g getBubbleData() {
        return this.b == null ? null : ((l)this.b).S();
    }

    @Override  // s1.d
    public i getCandleData() {
        return this.b == null ? null : ((l)this.b).T();
    }

    @Override  // s1.f
    public l getCombinedData() {
        return (l)this.b;
    }

    public a[] getDrawOrder() {
        return this.t9;
    }

    @Override  // s1.g
    public n getLineData() {
        return this.b == null ? null : ((l)this.b).X();
    }

    @Override  // s1.h
    public v getScatterData() {
        return this.b == null ? null : ((l)this.b).Y();
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    public void setData(k k0) {
        this.setData(((l)k0));
    }

    public void setData(l l0) {
        super.setData(l0);
        this.setHighlighter(new c(this, this));
        ((com.github.mikephil.charting.renderer.f)this.r).l();
        this.r.j();
    }

    public void setDrawBarShadow(boolean z) {
        this.s9 = z;
    }

    public void setDrawOrder(a[] arr_combinedChart$a) {
        if(arr_combinedChart$a != null && arr_combinedChart$a.length > 0) {
            this.t9 = arr_combinedChart$a;
        }
    }

    public void setDrawValueAboveBar(boolean z) {
        this.q9 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.r9 = z;
    }

    @Override  // com.github.mikephil.charting.charts.Chart
    protected void v(Canvas canvas0) {
        if(this.D != null && this.K() && this.Y()) {
            for(int v = 0; true; ++v) {
                d[] arr_d = this.A;
                if(v >= arr_d.length) {
                    break;
                }
                d d0 = arr_d[v];
                b b0 = ((l)this.b).W(d0);
                Entry entry0 = ((l)this.b).s(d0);
                if(entry0 != null && ((float)b0.e(entry0)) <= ((float)b0.N()) * this.u.h()) {
                    float[] arr_f = this.y(d0);
                    if(this.t.G(arr_f[0], arr_f[1])) {
                        this.D.b(entry0, d0);
                        this.D.a(canvas0, arr_f[0], arr_f[1]);
                    }
                }
            }
        }
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

