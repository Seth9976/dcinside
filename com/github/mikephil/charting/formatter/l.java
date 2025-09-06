package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.a;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarEntry;

public abstract class l implements e, g {
    @Override  // com.github.mikephil.charting.formatter.e
    @Deprecated
    public String a(float f, a a0) {
        return this.h(f);
    }

    @Override  // com.github.mikephil.charting.formatter.g
    @Deprecated
    public String b(float f, Entry entry0, int v, com.github.mikephil.charting.utils.l l0) {
        return this.h(f);
    }

    public String c(float f, a a0) {
        return this.h(f);
    }

    public String d(BarEntry barEntry0) {
        return this.h(barEntry0.d());
    }

    public String e(float f, BarEntry barEntry0) {
        return this.h(f);
    }

    public String f(BubbleEntry bubbleEntry0) {
        return this.h(bubbleEntry0.q());
    }

    public String g(CandleEntry candleEntry0) {
        return this.h(candleEntry0.s());
    }

    public String h(float f) {
        return String.valueOf(f);
    }

    public String i(float f, PieEntry pieEntry0) {
        return this.h(f);
    }

    public String j(Entry entry0) {
        return this.h(entry0.d());
    }

    public String k(RadarEntry radarEntry0) {
        return this.h(radarEntry0.d());
    }
}

