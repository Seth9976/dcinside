package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.n;
import s1.g;

public class c implements f {
    @Override  // com.github.mikephil.charting.formatter.f
    public float a(t1.f f0, g g0) {
        float f1 = g0.getYChartMax();
        float f2 = g0.getYChartMin();
        n n0 = g0.getLineData();
        if(f0.l0() <= 0.0f || f0.p0() >= 0.0f) {
            if(n0.z() > 0.0f) {
                f1 = 0.0f;
            }
            if(n0.B() < 0.0f) {
                f2 = 0.0f;
            }
            return f0.p0() >= 0.0f ? f2 : f1;
        }
        return 0.0f;
    }
}

