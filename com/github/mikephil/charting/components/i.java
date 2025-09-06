package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.g;
import java.lang.ref.WeakReference;

public class i extends RelativeLayout implements d {
    private g a;
    private g b;
    private WeakReference c;

    public i(Context context0, int v) {
        super(context0);
        this.a = new g();
        this.b = new g();
        this.setupLayoutResource(v);
    }

    @Override  // com.github.mikephil.charting.components.d
    public void a(Canvas canvas0, float f, float f1) {
        g g0 = this.c(f, f1);
        int v = canvas0.save();
        canvas0.translate(f + g0.c, f1 + g0.d);
        this.draw(canvas0);
        canvas0.restoreToCount(v);
    }

    @Override  // com.github.mikephil.charting.components.d
    public void b(Entry entry0, com.github.mikephil.charting.highlight.d d0) {
        this.measure(0, 0);
        this.layout(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    @Override  // com.github.mikephil.charting.components.d
    public g c(float f, float f1) {
        g g0 = this.getOffset();
        this.b.c = g0.c;
        this.b.d = g0.d;
        Chart chart0 = this.getChartView();
        float f2 = (float)this.getWidth();
        float f3 = (float)this.getHeight();
        g g1 = this.b;
        float f4 = g1.c;
        if(f + f4 < 0.0f) {
            g1.c = -f;
        }
        else if(chart0 != null && f + f2 + f4 > ((float)chart0.getWidth())) {
            g g2 = this.b;
            g2.c = ((float)chart0.getWidth()) - f - f2;
        }
        g g3 = this.b;
        float f5 = g3.d;
        if(f1 + f5 < 0.0f) {
            g3.d = -f1;
            return this.b;
        }
        if(chart0 != null && f1 + f3 + f5 > ((float)chart0.getHeight())) {
            g g4 = this.b;
            g4.d = ((float)chart0.getHeight()) - f1 - f3;
        }
        return this.b;
    }

    public void d(float f, float f1) {
        this.a.c = f;
        this.a.d = f1;
    }

    public Chart getChartView() {
        return this.c == null ? null : ((Chart)this.c.get());
    }

    @Override  // com.github.mikephil.charting.components.d
    public g getOffset() {
        return this.a;
    }

    public void setChartView(Chart chart0) {
        this.c = new WeakReference(chart0);
    }

    public void setOffset(g g0) {
        this.a = g0;
        if(g0 == null) {
            this.a = new g();
        }
    }

    private void setupLayoutResource(int v) {
        View view0 = LayoutInflater.from(this.getContext()).inflate(v, this);
        view0.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        view0.measure(0, 0);
        view0.layout(0, 0, view0.getMeasuredWidth(), view0.getMeasuredHeight());
    }
}

