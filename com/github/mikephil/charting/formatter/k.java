package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.BarEntry;
import java.text.DecimalFormat;

public class k extends l {
    private boolean a;
    private String b;
    private DecimalFormat c;

    public k(boolean z, String s, int v) {
        this.a = z;
        this.b = s;
        StringBuffer stringBuffer0 = new StringBuffer();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 == 0) {
                stringBuffer0.append(".");
            }
            stringBuffer0.append("0");
        }
        this.c = new DecimalFormat("###,###,###,##0" + stringBuffer0.toString());
    }

    @Override  // com.github.mikephil.charting.formatter.l
    public String e(float f, BarEntry barEntry0) {
        if(!this.a) {
            float[] arr_f = barEntry0.y();
            if(arr_f != null) {
                return arr_f[arr_f.length - 1] == f ? this.c.format(((double)barEntry0.d())) + this.b : "";
            }
        }
        return this.c.format(((double)f)) + this.b;
    }
}

