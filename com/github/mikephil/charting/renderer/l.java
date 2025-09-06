package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.animation.a;
import t1.h;

public abstract class l extends c {
    private Path h;

    public l(a a0, com.github.mikephil.charting.utils.l l0) {
        super(a0, l0);
        this.h = new Path();
    }

    protected void n(Canvas canvas0, float f, float f1, h h0) {
        this.d.setColor(h0.l1());
        this.d.setStrokeWidth(h0.P0());
        this.d.setPathEffect(h0.e1());
        if(h0.C()) {
            this.h.reset();
            this.h.moveTo(f, this.a.j());
            this.h.lineTo(f, this.a.f());
            canvas0.drawPath(this.h, this.d);
        }
        if(h0.o1()) {
            this.h.reset();
            this.h.moveTo(this.a.h(), f1);
            this.h.lineTo(this.a.i(), f1);
            canvas0.drawPath(this.h, this.d);
        }
    }
}

