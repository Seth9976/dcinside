package com.facebook.fresco.vito.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class e extends o {
    private final float a;
    private final float b;
    private final float c;
    @m
    private final Boolean d;

    public e(float f, float f1, float f2, @m Boolean boolean0) {
        super(null);
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = boolean0;
    }

    public e(float f, float f1, float f2, Boolean boolean0, int v, w w0) {
        if((v & 8) != 0) {
            boolean0 = null;
        }
        this(f, f1, f2, boolean0);
    }

    @Override  // com.facebook.fresco.vito.renderer.o
    public void a(@l Canvas canvas0, @l Paint paint0) {
        L.p(canvas0, "canvas");
        L.p(paint0, "paint");
        if(this.d != null) {
            boolean z = paint0.isAntiAlias();
            paint0.setAntiAlias(this.d.booleanValue());
            canvas0.drawCircle(this.a, this.b, this.c, paint0);
            paint0.setAntiAlias(z);
            return;
        }
        canvas0.drawCircle(this.a, this.b, this.c, paint0);
    }
}

