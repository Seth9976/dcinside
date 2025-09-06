package com.github.mikephil.charting.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.v;
import com.github.mikephil.charting.renderer.p;
import s1.h;

public class ScatterChart extends BarLineChartBase implements h {
    public static enum a {
        SQUARE("SQUARE"),
        CIRCLE("CIRCLE"),
        TRIANGLE("TRIANGLE"),
        CROSS("CROSS"),
        X("X"),
        CHEVRON_UP("CHEVRON_UP"),
        CHEVRON_DOWN("CHEVRON_DOWN");

        private final String a;

        private a(String s1) {
            this.a = s1;
        }

        public static a[] a() {
            return new a[]{a.b, a.c, a.d, a.e, a.f, a.g, a.h};
        }

        @Override
        public String toString() {
            return this.a;
        }
    }

    public ScatterChart(Context context0) {
        super(context0);
    }

    public ScatterChart(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public ScatterChart(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.github.mikephil.charting.charts.BarLineChartBase
    protected void H() {
        super.H();
        this.r = new p(this, this.u, this.t);
        this.getXAxis().t0(0.5f);
        this.getXAxis().s0(0.5f);
    }

    @Override  // s1.h
    public v getScatterData() {
        return (v)this.b;
    }
}

