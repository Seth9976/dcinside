package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class i extends h {
    public interface a {
        void a(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, @m String arg7);
    }

    @m
    private final a e;
    @l
    private final String f;
    private boolean g;

    public i(@l Drawable drawable0, @m a i$a0) {
        L.p(drawable0, "drawable");
        super(drawable0);
        this.e = i$a0;
        this.f = this.A(drawable0);
    }

    // 去混淆评级： 低(20)
    private final String A(Drawable drawable0) {
        return drawable0 instanceof s ? ((s)drawable0).K().toString() : "none";
    }

    @Override  // com.facebook.drawee.drawable.h
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        if(!this.g) {
            this.g = true;
            RectF rectF0 = new RectF();
            this.n(rectF0);
            int v = (int)rectF0.width();
            int v1 = (int)rectF0.height();
            this.x(rectF0);
            int v2 = (int)rectF0.width();
            int v3 = (int)rectF0.height();
            int v4 = this.getIntrinsicWidth();
            int v5 = this.getIntrinsicHeight();
            a i$a0 = this.e;
            if(i$a0 != null) {
                i$a0.a(v, v1, v4, v5, v2, v3, this.f);
            }
        }
        super.draw(canvas0);
    }
}

