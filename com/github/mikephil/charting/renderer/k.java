package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.a;

public abstract class k extends l {
    public k(a a0, com.github.mikephil.charting.utils.l l0) {
        super(a0, l0);
    }

    // 去混淆评级： 低(20)
    private boolean o() [...] // 潜在的解密器

    protected void p(Canvas canvas0, Path path0, int v, int v1) {
        int v2 = canvas0.save();
        canvas0.clipPath(path0);
        canvas0.drawColor(v & 0xFFFFFF | v1 << 24);
        canvas0.restoreToCount(v2);
    }

    protected void q(Canvas canvas0, Path path0, Drawable drawable0) {
        int v = canvas0.save();
        canvas0.clipPath(path0);
        drawable0.setBounds(((int)this.a.h()), ((int)this.a.j()), ((int)this.a.i()), ((int)this.a.f()));
        drawable0.draw(canvas0);
        canvas0.restoreToCount(v);
    }
}

