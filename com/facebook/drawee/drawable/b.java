package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import k1.n.a;
import k1.n;

@n(a.a)
public class b extends h implements c, Runnable {
    private int e;
    private boolean f;
    @VisibleForTesting
    float g;
    private boolean h;
    private static final int i = 360;
    private static final int j = 20;

    public b(Drawable drawable0, int v) {
        this(drawable0, v, true);
    }

    public b(Drawable drawable0, int v, boolean z) {
        super(((Drawable)com.facebook.common.internal.n.i(drawable0)));
        this.g = 0.0f;
        this.h = false;
        this.e = v;
        this.f = z;
    }

    @Nullable
    public b A() {
        Drawable drawable0 = f.a(this.o());
        return drawable0 == null ? null : new b(drawable0, this.e, this.f);
    }

    private int B() {
        return (int)(20.0f / ((float)this.e) * 360.0f);
    }

    public void C() {
        this.g = 0.0f;
        this.h = false;
        this.unscheduleSelf(this);
        this.invalidateSelf();
    }

    private void D() {
        if(!this.h) {
            this.h = true;
            this.scheduleSelf(this, SystemClock.uptimeMillis() + 20L);
        }
    }

    public void E(boolean z) {
        this.f = z;
    }

    @Override  // com.facebook.drawee.drawable.h
    public void draw(Canvas canvas0) {
        int v = canvas0.save();
        Rect rect0 = this.getBounds();
        canvas0.rotate((this.f ? this.g : 360.0f - this.g), ((float)(rect0.left + (rect0.right - rect0.left) / 2)), ((float)(rect0.top + (rect0.bottom - rect0.top) / 2)));
        super.draw(canvas0);
        canvas0.restoreToCount(v);
        this.D();
    }

    @Override  // com.facebook.drawee.drawable.c
    @Nullable
    public Drawable p() {
        return this.A();
    }

    @Override
    public void run() {
        this.h = false;
        this.g += (float)this.B();
        this.invalidateSelf();
    }
}

