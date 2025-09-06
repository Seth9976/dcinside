package com.github.mikephil.charting.formatter;

import java.text.DecimalFormat;

public class d extends l {
    protected DecimalFormat a;
    protected int b;

    public d(int v) {
        this.m(v);
    }

    @Override  // com.github.mikephil.charting.formatter.l
    public String h(float f) {
        return this.a.format(((double)f));
    }

    public int l() {
        return this.b;
    }

    public void m(int v) {
        this.b = v;
        StringBuffer stringBuffer0 = new StringBuffer();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 == 0) {
                stringBuffer0.append(".");
            }
            stringBuffer0.append("0");
        }
        this.a = new DecimalFormat("###,###,###,##0" + stringBuffer0.toString());
    }
}

