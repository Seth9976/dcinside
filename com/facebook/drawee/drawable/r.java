package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.imagepipeline.systrace.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class r extends q {
    public r(@l NinePatchDrawable ninePatchDrawable0) {
        L.p(ninePatchDrawable0, "ninePatchDrawable");
        super(ninePatchDrawable0);
    }

    @Override  // com.facebook.drawee.drawable.q
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        if(b.e()) {
            b.a("RoundedNinePatchDrawable#draw");
        }
        if(!this.o()) {
            super.draw(canvas0);
            if(b.e()) {
                b.c();
            }
            return;
        }
        this.q();
        this.p();
        canvas0.clipPath(this.e);
        super.draw(canvas0);
        if(b.e()) {
            b.c();
        }
    }
}

