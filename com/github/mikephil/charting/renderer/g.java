package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import com.github.mikephil.charting.animation.a;
import com.github.mikephil.charting.highlight.d;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import t1.e;

public abstract class g extends o {
    protected a b;
    protected Paint c;
    protected Paint d;
    protected Paint e;
    protected Paint f;

    public g(a a0, l l0) {
        super(l0);
        this.b = a0;
        Paint paint0 = new Paint(1);
        this.c = paint0;
        paint0.setStyle(Paint.Style.FILL);
        this.e = new Paint(4);
        Paint paint1 = new Paint(1);
        this.f = paint1;
        paint1.setColor(Color.rgb(0x3F, 0x3F, 0x3F));
        this.f.setTextAlign(Paint.Align.CENTER);
        this.f.setTextSize(k.e(9.0f));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(2.0f);
        this.d.setColor(Color.rgb(0xFF, 0xBB, 0x73));
    }

    protected void a(e e0) {
        this.f.setTypeface(e0.o());
        this.f.setTextSize(e0.S0());
    }

    public abstract void b(Canvas arg1);

    public abstract void c(Canvas arg1);

    public abstract void d(Canvas arg1, d[] arg2);

    public abstract void e(Canvas arg1, String arg2, float arg3, float arg4, int arg5);

    public abstract void f(Canvas arg1);

    public Paint g() {
        return this.d;
    }

    public Paint h() {
        return this.c;
    }

    public Paint i() {
        return this.f;
    }

    public abstract void j();

    protected boolean k(s1.e e0) {
        return ((float)e0.getData().r()) < ((float)e0.getMaxVisibleCount()) * this.a.w();
    }
}

