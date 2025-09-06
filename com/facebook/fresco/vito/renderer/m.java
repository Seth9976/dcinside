package com.facebook.fresco.vito.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import kotlin.jvm.internal.L;
import y4.l;

public final class m extends o {
    @l
    private final RectF a;

    public m(@l RectF rectF0) {
        L.p(rectF0, "rect");
        super(null);
        this.a = rectF0;
    }

    @Override  // com.facebook.fresco.vito.renderer.o
    public void a(@l Canvas canvas0, @l Paint paint0) {
        L.p(canvas0, "canvas");
        L.p(paint0, "paint");
        canvas0.drawRect(this.a, paint0);
    }

    @l
    public final RectF b() {
        return this.a;
    }
}

