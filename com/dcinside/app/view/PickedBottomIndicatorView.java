package com.dcinside.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import androidx.annotation.ColorInt;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class PickedBottomIndicatorView extends View {
    @ColorInt
    private int a;
    @m
    private View b;
    private float c;
    private float d;
    @l
    private final SizeF e;
    private final float f;
    @l
    private final Paint g;

    @j
    public PickedBottomIndicatorView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public PickedBottomIndicatorView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public PickedBottomIndicatorView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        Paint paint0 = new Paint();
        this.g = paint0;
        this.e = new SizeF(context0.getResources().getDimension(0x7F0703C9), context0.getResources().getDimension(0x7F0703C7));  // dimen:picked_bottom_indicator_width
        float f = context0.getResources().getDimension(0x7F0703C8);  // dimen:picked_bottom_indicator_line
        this.f = f;
        this.a = vk.b(context0, 0x7F040241);  // attr:divColor
        paint0.setStrokeWidth(f);
        paint0.setColor(this.a);
    }

    public PickedBottomIndicatorView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void a(@l View view0, float f) {
        L.p(view0, "view");
        this.b = view0;
        this.c = f;
        this.requestLayout();
    }

    @Override  // android.view.View
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        super.onDraw(canvas0);
        float f = this.e.getWidth();
        float f1 = this.f / 2.0f;
        canvas0.drawLines(new float[]{0.0f, f1, this.d - f / 2.0f, f1, this.d - f / 2.0f, f1, this.d, this.e.getHeight(), this.d, this.e.getHeight(), this.d + f / 2.0f, f1, this.d + f / 2.0f, f1, ((float)this.getWidth()), f1}, this.g);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        View view0 = this.b;
        if(view0 == null) {
            return;
        }
        this.d = view0.getX() + ((float)(view0.getWidth() / 2)) + this.c;
    }
}

