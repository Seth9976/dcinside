package com.dcinside.app.gif.maker;

import C4.b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.L;
import y4.l;

public final class e implements b {
    private float a;
    private float b;
    private float c;
    private float d;
    @l
    private final RectF e;
    private boolean f;
    private float g;
    private float h;
    private int i;
    private float j;
    private boolean k;
    private float l;
    private boolean m;

    public e() {
        this.e = new RectF();
        this.g = 1.0f;
        this.j = 1.0f;
        this.l = 1.0f;
    }

    @Override  // C4.b
    public void a(@l Canvas canvas0, @l Paint paint0, @l Bitmap bitmap0) {
        L.p(canvas0, "canvas");
        L.p(paint0, "paint");
        L.p(bitmap0, "buffer");
        canvas0.save();
        canvas0.rotate(this.h, this.b, this.d);
        canvas0.scale(this.j, this.l, this.b, this.d);
        if(this.f) {
            float f = this.g;
            if(f != 1.0f) {
                canvas0.scale(f, f, this.b, this.d);
            }
        }
        canvas0.drawBitmap(bitmap0, null, this.e, paint0);
        canvas0.restore();
    }

    @Override  // C4.b
    public void b(@l Rect rect0) {
        L.p(rect0, "bounds");
        this.e.set(rect0);
        float f = this.e.width();
        this.a = f;
        this.b = f / 2.0f;
        float f1 = this.e.height();
        this.c = f1;
        this.d = f1 / 2.0f;
        this.g = this.a / f1;
    }

    private final void c() {
        float f1;
        boolean z = this.f;
        float f = 1.0f;
        if(!z) {
            f1 = this.k ? -1.0f : 1.0f;
        }
        else if(this.m) {
            f1 = -1.0f;
        }
        else {
            f1 = 1.0f;
        }
        this.j = f1;
        if(!z) {
            if(this.m) {
                f = -1.0f;
            }
        }
        else if(this.k) {
            f = -1.0f;
        }
        this.l = f;
    }

    public final boolean d() {
        return this.k;
    }

    public final boolean e() {
        return this.m;
    }

    public final int f() {
        return this.i;
    }

    public final void g(boolean z) {
        this.k = z;
        this.c();
    }

    public final void h(boolean z) {
        this.m = z;
        this.c();
    }

    public final void i(int v) {
        this.i = v;
        this.h = (float)v;
        this.f = v % 180 != 0;
        this.c();
    }
}

