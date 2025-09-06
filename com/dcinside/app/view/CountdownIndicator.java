package com.dcinside.app.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.dcinside.app.R.styleable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nCountdownIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountdownIndicator.kt\ncom/dcinside/app/view/CountdownIndicator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class CountdownIndicator extends View {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final Paint a;
    @m
    private RectF b;
    private double c;
    @l
    public static final a d = null;
    private static final int e = 0xFF3060C0;

    static {
        CountdownIndicator.d = new a(null);
    }

    @j
    public CountdownIndicator(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public CountdownIndicator(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.CountdownIndicator, 0, 0);
        L.o(typedArray0, "obtainStyledAttributes(...)");
        int v1 = typedArray0.getIndexCount();
        int v2 = 0xFF3060C0;
        for(int v = 0; v < v1; ++v) {
            if(typedArray0.getIndex(v) == 0) {
                v2 = typedArray0.getColor(0, 0xFF3060C0);
            }
        }
        Paint paint0 = new Paint(1);
        this.a = paint0;
        paint0.setColor(v2);
    }

    public CountdownIndicator(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    @Override  // android.view.View
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        float f = (float)(this.c * 360.0);
        if(this.b == null) {
            this.b = new RectF(1.0f, 1.0f, ((float)(this.getWidth() - 1)), ((float)(this.getHeight() - 1)));
        }
        if(270.0f - f < 360.0f) {
            RectF rectF0 = this.b;
            L.m(rectF0);
            canvas0.drawArc(rectF0, 270.0f - f, f, true, this.a);
            return;
        }
        RectF rectF1 = this.b;
        L.m(rectF1);
        canvas0.drawOval(rectF1, this.a);
    }

    public final void setIndicatorColor(int v) {
        this.a.setColor(v);
    }

    public final void setPhase(double f) {
        if(f < 0.0 || f > 1.0) {
            throw new IllegalArgumentException(("phase: " + f).toString());
        }
        this.c = f;
        this.invalidate();
    }
}

