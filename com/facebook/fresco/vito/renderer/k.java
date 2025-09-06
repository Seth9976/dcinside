package com.facebook.fresco.vito.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.jvm.internal.L;
import y4.l;

public final class k extends o {
    @l
    private final Path a;

    public k(@l Path path0) {
        L.p(path0, "path");
        super(null);
        this.a = path0;
    }

    @Override  // com.facebook.fresco.vito.renderer.o
    public void a(@l Canvas canvas0, @l Paint paint0) {
        L.p(canvas0, "canvas");
        L.p(paint0, "paint");
        canvas0.drawPath(this.a, paint0);
    }

    @l
    public final Path b() {
        return this.a;
    }
}

