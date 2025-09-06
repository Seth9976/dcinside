package com.github.mikephil.charting.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.c;
import com.github.mikephil.charting.utils.g;
import java.lang.ref.WeakReference;

public class h implements d {
    private Context a;
    private Drawable b;
    private g c;
    private g d;
    private WeakReference e;
    private c f;
    private Rect g;

    public h(Context context0, int v) {
        this.c = new g();
        this.d = new g();
        this.f = new c();
        this.g = new Rect();
        this.a = context0;
        this.b = context0.getResources().getDrawable(v, null);
    }

    @Override  // com.github.mikephil.charting.components.d
    public void a(Canvas canvas0, float f, float f1) {
        if(this.b == null) {
            return;
        }
        g g0 = this.c(f, f1);
        float f2 = this.f.c;
        float f3 = this.f.d;
        if(f2 == 0.0f) {
            f2 = (float)this.b.getIntrinsicWidth();
        }
        if(f3 == 0.0f) {
            f3 = (float)this.b.getIntrinsicHeight();
        }
        this.b.copyBounds(this.g);
        this.b.setBounds(this.g.left, this.g.top, ((int)f2) + this.g.left, ((int)f3) + this.g.top);
        int v = canvas0.save();
        canvas0.translate(f + g0.c, f1 + g0.d);
        this.b.draw(canvas0);
        canvas0.restoreToCount(v);
        this.b.setBounds(this.g);
    }

    @Override  // com.github.mikephil.charting.components.d
    public void b(Entry entry0, com.github.mikephil.charting.highlight.d d0) {
    }

    @Override  // com.github.mikephil.charting.components.d
    public g c(float f, float f1) {
        g g0 = this.getOffset();
        this.d.c = g0.c;
        this.d.d = g0.d;
        Chart chart0 = this.d();
        float f2 = this.f.c;
        float f3 = this.f.d;
        if(f2 == 0.0f) {
            Drawable drawable0 = this.b;
            if(drawable0 != null) {
                f2 = (float)drawable0.getIntrinsicWidth();
            }
        }
        if(f3 == 0.0f) {
            Drawable drawable1 = this.b;
            if(drawable1 != null) {
                f3 = (float)drawable1.getIntrinsicHeight();
            }
        }
        g g1 = this.d;
        float f4 = g1.c;
        if(f + f4 < 0.0f) {
            g1.c = -f;
        }
        else if(chart0 != null && f + f2 + f4 > ((float)chart0.getWidth())) {
            g g2 = this.d;
            g2.c = ((float)chart0.getWidth()) - f - f2;
        }
        g g3 = this.d;
        float f5 = g3.d;
        if(f1 + f5 < 0.0f) {
            g3.d = -f1;
            return this.d;
        }
        if(chart0 != null && f1 + f3 + f5 > ((float)chart0.getHeight())) {
            g g4 = this.d;
            g4.d = ((float)chart0.getHeight()) - f1 - f3;
        }
        return this.d;
    }

    public Chart d() {
        return this.e == null ? null : ((Chart)this.e.get());
    }

    public c e() {
        return this.f;
    }

    public void f(Chart chart0) {
        this.e = new WeakReference(chart0);
    }

    public void g(float f, float f1) {
        g g0 = this.c;
        g0.c = f;
        g0.d = f1;
    }

    @Override  // com.github.mikephil.charting.components.d
    public g getOffset() {
        return this.c;
    }

    public void h(g g0) {
        this.c = g0;
        if(g0 == null) {
            this.c = new g();
        }
    }

    public void i(c c0) {
        this.f = c0;
        if(c0 == null) {
            this.f = new c();
        }
    }
}

