package com.facebook.fresco.vito.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.L;
import y4.l;

public final class n extends o {
    @l
    private final RectF a;
    private final float b;
    private final float c;

    public n(@l RectF rectF0, float f, float f1) {
        L.p(rectF0, "rect");
        super(null);
        this.a = rectF0;
        this.b = f;
        this.c = f1;
    }

    @Override  // com.facebook.fresco.vito.renderer.o
    public void a(@l Canvas canvas0, @l Paint paint0) {
        L.p(canvas0, "canvas");
        L.p(paint0, "paint");
        canvas0.drawRoundRect(this.a, this.b, this.c, paint0);
    }

    @l
    public final RectF b() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }
}

