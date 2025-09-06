package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.L;
import y4.m;

public final class l extends Drawable implements c {
    @y4.l
    private final Paint a;
    @y4.l
    private final Path b;
    @y4.l
    private final RectF c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;

    public l() {
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
        this.d = 0x80000000;
        this.e = 0x800080FF;
        this.f = 10;
        this.g = 20;
    }

    private final void a(Canvas canvas0, int v) {
        this.a.setColor(v);
        this.a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.b.reset();
        this.b.setFillType(Path.FillType.EVEN_ODD);
        this.b.addRoundRect(this.c, ((float)Math.min(this.i, this.g / 2)), ((float)Math.min(this.i, this.g / 2)), Path.Direction.CW);
        canvas0.drawPath(this.b, this.a);
    }

    private final void b(Canvas canvas0, int v, int v1) {
        Rect rect0 = this.getBounds();
        L.o(rect0, "getBounds(...)");
        int v2 = rect0.width();
        int v3 = rect0.left + this.f;
        int v4 = rect0.bottom - this.f - this.g;
        this.c.set(((float)v3), ((float)v4), ((float)(v3 + (v2 - this.f * 2) * v / 10000)), ((float)(v4 + this.g)));
        this.a(canvas0, v1);
    }

    private final void c(Canvas canvas0, int v, int v1) {
        Rect rect0 = this.getBounds();
        L.o(rect0, "getBounds(...)");
        int v2 = rect0.height();
        int v3 = rect0.left + this.f;
        int v4 = rect0.top + this.f;
        this.c.set(((float)v3), ((float)v4), ((float)(v3 + this.g)), ((float)(v4 + (v2 - this.f * 2) * v / 10000)));
        this.a(canvas0, v1);
    }

    public final int d() {
        return this.d;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@y4.l Canvas canvas0) {
        L.p(canvas0, "canvas");
        if(this.j && this.h == 0) {
            return;
        }
        if(this.k) {
            this.c(canvas0, 10000, this.d);
            this.c(canvas0, this.h, this.e);
            return;
        }
        this.b(canvas0, 10000, this.d);
        this.b(canvas0, this.h, this.e);
    }

    public final int e() {
        return this.g;
    }

    public final int f() {
        return this.e;
    }

    public final boolean g() {
        return this.j;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return f.c(this.a.getColor());
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(@y4.l Rect rect0) {
        L.p(rect0, "padding");
        rect0.set(this.f, this.f, this.f, this.f);
        return this.f != 0;
    }

    public final int h() {
        return this.i;
    }

    public final boolean i() {
        return this.k;
    }

    public final void j(int v) {
        if(this.d != v) {
            this.d = v;
            this.invalidateSelf();
        }
    }

    public final void k(int v) {
        if(this.g != v) {
            this.g = v;
            this.invalidateSelf();
        }
    }

    public final void l(int v) {
        if(this.e != v) {
            this.e = v;
            this.invalidateSelf();
        }
    }

    public final void m(boolean z) {
        this.j = z;
    }

    public final void n(boolean z) {
        this.r(z);
    }

    public final void o(int v) {
        if(this.f != v) {
            this.f = v;
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        this.h = v;
        this.invalidateSelf();
        return true;
    }

    @Override  // com.facebook.drawee.drawable.c
    @m
    public Drawable p() {
        Drawable drawable0 = new l();
        drawable0.d = this.d;
        drawable0.e = this.e;
        drawable0.f = this.f;
        drawable0.g = this.g;
        drawable0.h = this.h;
        drawable0.i = this.i;
        drawable0.j = this.j;
        drawable0.k = this.k;
        return drawable0;
    }

    public final void q(int v) {
        if(this.i != v) {
            this.i = v;
            this.invalidateSelf();
        }
    }

    public final void r(boolean z) {
        if(this.k != z) {
            this.k = z;
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
    }
}

