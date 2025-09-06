package com.dcinside.app.image.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class DrawStateView extends ImageView {
    @l
    private final Paint a;
    @l
    private final Paint b;
    private float c;
    @m
    private Function1 d;
    private boolean e;

    @j
    public DrawStateView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public DrawStateView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public DrawStateView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        Paint paint0 = new Paint(1);
        this.a = paint0;
        this.b = new Paint(1);
        this.c = 20.0f;
        paint0.setStyle(Paint.Style.FILL);
        this.setClickable(true);
    }

    public DrawStateView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final boolean a() {
        return this.e;
    }

    public final float getDrawStateSize() {
        return this.c;
    }

    @m
    public final Function1 getOnEraseChange() {
        return this.d;
    }

    @Override  // android.widget.ImageView
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        int v = this.getWidth();
        float f = ((float)this.getHeight()) / 2.0f;
        canvas0.drawCircle(((float)v) / 2.0f, f, Math.min(((float)v) / 2.0f, f), this.b);
        canvas0.drawCircle(((float)v) / 2.0f, f, this.c / 2.0f, this.a);
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    public boolean performClick() {
        this.setErase(!this.e);
        return super.performClick();
    }

    public final void setDrawStateBackgroundColor(int v) {
        this.b.setColor(v);
        this.invalidate();
    }

    public final void setDrawStateColor(int v) {
        this.a.setColor(v);
        this.invalidate();
    }

    public final void setDrawStateSize(float f) {
        this.c = f;
        this.invalidate();
    }

    public final void setErase(boolean z) {
        this.e = z;
        if(z) {
            this.setImageResource(0x7F08037C);  // drawable:image_edit_draw_eraser
        }
        else {
            this.setImageDrawable(null);
        }
        Function1 function10 = this.d;
        if(function10 != null) {
            function10.invoke(Boolean.valueOf(z));
        }
    }

    public final void setOnEraseChange(@m Function1 function10) {
        this.d = function10;
    }
}

