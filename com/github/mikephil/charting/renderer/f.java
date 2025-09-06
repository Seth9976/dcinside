package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.util.Log;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.utils.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class f extends g {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.github.mikephil.charting.charts.CombinedChart.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.github.mikephil.charting.charts.CombinedChart.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.CombinedChart.a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.CombinedChart.a.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.CombinedChart.a.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.charts.CombinedChart.a.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected List g;
    protected WeakReference h;
    protected List i;

    public f(CombinedChart combinedChart0, com.github.mikephil.charting.animation.a a0, l l0) {
        super(a0, l0);
        this.g = new ArrayList(5);
        this.i = new ArrayList();
        this.h = new WeakReference(combinedChart0);
        this.l();
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void b(Canvas canvas0) {
        for(Object object0: this.g) {
            ((g)object0).b(canvas0);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void c(Canvas canvas0) {
        for(Object object0: this.g) {
            ((g)object0).c(canvas0);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void d(Canvas canvas0, d[] arr_d) {
        com.github.mikephil.charting.data.a a0;
        Chart chart0 = (Chart)this.h.get();
        if(chart0 == null) {
            return;
        }
        for(Object object0: this.g) {
            g g0 = (g)object0;
            if(g0 instanceof b) {
                a0 = ((b)g0).h.getBarData();
            }
            else if(g0 instanceof j) {
                a0 = ((j)g0).i.getLineData();
            }
            else if(g0 instanceof e) {
                a0 = ((e)g0).i.getCandleData();
            }
            else if(g0 instanceof p) {
                a0 = ((p)g0).i.getScatterData();
            }
            else if(g0 instanceof com.github.mikephil.charting.renderer.d) {
                a0 = ((com.github.mikephil.charting.renderer.d)g0).h.getBubbleData();
            }
            else {
                a0 = null;
            }
            int v = a0 == null ? -1 : ((com.github.mikephil.charting.data.l)chart0.getData()).Q().indexOf(a0);
            this.i.clear();
            for(int v1 = 0; v1 < arr_d.length; ++v1) {
                d d0 = arr_d[v1];
                if(d0.c() == v || d0.c() == -1) {
                    this.i.add(d0);
                }
            }
            g0.d(canvas0, ((d[])this.i.toArray(new d[this.i.size()])));
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void e(Canvas canvas0, String s, float f, float f1, int v) {
        Log.e("MPAndroidChart", "Erroneous call to drawValue() in CombinedChartRenderer!");
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void f(Canvas canvas0) {
        for(Object object0: this.g) {
            ((g)object0).f(canvas0);
        }
    }

    @Override  // com.github.mikephil.charting.renderer.g
    public void j() {
        for(Object object0: this.g) {
            ((g)object0).j();
        }
    }

    public void l() {
        this.g.clear();
        CombinedChart combinedChart0 = (CombinedChart)this.h.get();
        if(combinedChart0 == null) {
            return;
        }
        com.github.mikephil.charting.charts.CombinedChart.a[] arr_combinedChart$a = combinedChart0.getDrawOrder();
        for(int v = 0; v < arr_combinedChart$a.length; ++v) {
            switch(arr_combinedChart$a[v]) {
                case 1: {
                    if(combinedChart0.getBarData() != null) {
                        this.g.add(new b(combinedChart0, this.b, this.a));
                    }
                    break;
                }
                case 2: {
                    if(combinedChart0.getBubbleData() != null) {
                        this.g.add(new com.github.mikephil.charting.renderer.d(combinedChart0, this.b, this.a));
                    }
                    break;
                }
                case 3: {
                    if(combinedChart0.getLineData() != null) {
                        this.g.add(new j(combinedChart0, this.b, this.a));
                    }
                    break;
                }
                case 4: {
                    if(combinedChart0.getCandleData() != null) {
                        this.g.add(new e(combinedChart0, this.b, this.a));
                    }
                    break;
                }
                case 5: {
                    if(combinedChart0.getScatterData() != null) {
                        this.g.add(new p(combinedChart0, this.b, this.a));
                    }
                }
            }
        }
    }

    public g m(int v) {
        return v >= this.g.size() || v < 0 ? null : ((g)this.g.get(v));
    }

    public List n() {
        return this.g;
    }

    public void o(List list0) {
        this.g = list0;
    }
}

