package com.dcinside.app.voice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class VoiceTabIndicatorView extends View {
    @ColorInt
    private int a;
    @l
    private final Paint b;
    @l
    private final Path c;

    @j
    public VoiceTabIndicatorView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public VoiceTabIndicatorView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public VoiceTabIndicatorView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        Paint paint0 = new Paint();
        this.b = paint0;
        this.c = new Path();
        int v1 = vk.b(context0, 0x7F040507);  // attr:recordTabsColor
        this.a = v1;
        paint0.setColor(v1);
        paint0.setStrokeWidth(0.5f);
        paint0.setStyle(Paint.Style.STROKE);
    }

    public VoiceTabIndicatorView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // android.view.View
    protected void onDraw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        super.onDraw(canvas0);
        this.c.reset();
        float f = (float)this.getWidth();
        float f1 = (float)this.getHeight();
        this.c.moveTo(0.0f, f1);
        this.c.lineTo(f / 2.0f, 0.0f);
        this.c.lineTo(f, f1);
        canvas0.drawPath(this.c, this.b);
    }
}

