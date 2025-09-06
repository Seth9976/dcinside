package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.j;
import com.github.mikephil.charting.data.t;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;

public class s extends q {
    private RadarChart p;

    public s(l l0, j j0, RadarChart radarChart0) {
        super(l0, j0, null);
        this.p = radarChart0;
    }

    @Override  // com.github.mikephil.charting.renderer.q
    public void g(Canvas canvas0) {
        if(this.h.f() && this.h.P()) {
            float f = this.h.v0();
            g g0 = g.c(0.5f, 0.25f);
            this.e.setTypeface(this.h.c());
            this.e.setTextSize(this.h.b());
            this.e.setColor(this.h.a());
            float f1 = this.p.getSliceAngle();
            float f2 = this.p.getFactor();
            g g1 = this.p.getCenterOffsets();
            g g2 = g.c(0.0f, 0.0f);
            for(int v = 0; v < ((t1.j)((t)this.p.getData()).w()).N(); ++v) {
                String s = this.h.H().c(((float)v), this.h);
                k.B(g1, this.p.getYRange() * f2 + ((float)this.h.L) / 2.0f, (((float)v) * f1 + this.p.getRotationAngle()) % 360.0f, g2);
                this.m(canvas0, s, g2.c, g2.d - ((float)this.h.M) / 2.0f, g0, f);
            }
            g.h(g1);
            g.h(g2);
            g.h(g0);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.q
    public void j(Canvas canvas0) {
    }
}

