package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.f;

public final class s extends h {
    @l
    private d e;
    @m
    @f
    public Object f;
    @m
    @f
    public PointF g;
    @f
    public int h;
    @f
    public int i;
    @m
    @f
    public Matrix j;
    @l
    private final Matrix k;

    public s(@m Drawable drawable0, @l d t$d0) {
        L.p(t$d0, "scaleType");
        super(drawable0);
        this.k = new Matrix();
        this.e = t$d0;
    }

    public s(@m Drawable drawable0, @l d t$d0, @m PointF pointF0) {
        L.p(t$d0, "scaleType");
        super(drawable0);
        this.k = new Matrix();
        this.e = t$d0;
        this.g = pointF0;
    }

    @VisibleForTesting
    public final void A() {
        float f1;
        float f;
        Drawable drawable0 = this.getCurrent();
        if(drawable0 == null) {
            this.i = 0;
            this.h = 0;
            this.j = null;
            return;
        }
        Rect rect0 = this.getBounds();
        L.o(rect0, "getBounds(...)");
        int v = rect0.width();
        int v1 = rect0.height();
        int v2 = drawable0.getIntrinsicWidth();
        this.h = v2;
        int v3 = drawable0.getIntrinsicHeight();
        this.i = v3;
        if(v2 > 0 && v3 > 0) {
            if(v2 == v && v3 == v1) {
                drawable0.setBounds(rect0);
                this.j = null;
                return;
            }
            if(this.e == d.a) {
                drawable0.setBounds(rect0);
                this.j = null;
                return;
            }
            drawable0.setBounds(0, 0, v2, v3);
            this.k.reset();
            d t$d0 = this.e;
            Matrix matrix0 = this.k;
            PointF pointF0 = this.g;
            if(pointF0 == null) {
                f = 0.5f;
            }
            else {
                L.m(pointF0);
                f = pointF0.x;
            }
            PointF pointF1 = this.g;
            if(pointF1 == null) {
                f1 = 0.5f;
            }
            else {
                L.m(pointF1);
                f1 = pointF1.y;
            }
            t$d0.a(matrix0, rect0, v2, v3, f, f1);
            this.j = this.k;
            return;
        }
        drawable0.setBounds(rect0);
        this.j = null;
    }

    private final void B() {
        int v;
        d t$d0 = this.e;
        if(t$d0 instanceof p) {
            L.n(t$d0, "null cannot be cast to non-null type com.facebook.drawee.drawable.ScalingUtils.StatefulScaleType");
            Object object0 = ((p)t$d0).getState();
            L.o(object0, "getState(...)");
            v = !L.g(object0, this.f);
            this.f = object0;
        }
        else {
            v = 0;
        }
        Drawable drawable0 = this.getCurrent();
        if(drawable0 == null) {
            return;
        }
        if(this.h != drawable0.getIntrinsicWidth() || this.i != drawable0.getIntrinsicHeight() || v != 0) {
            this.A();
        }
    }

    @m
    public final PointF C() {
        return this.g;
    }

    @VisibleForTesting
    public static void D() {
    }

    @VisibleForTesting
    public static void E() {
    }

    @l
    public final d F() {
        return this.e;
    }

    @VisibleForTesting
    public static void G() {
    }

    @VisibleForTesting
    public static void H() {
    }

    @VisibleForTesting
    public static void I() {
    }

    @VisibleForTesting
    public static void J() {
    }

    @l
    public final d K() {
        return this.e;
    }

    public final void L(@m PointF pointF0) {
        if(com.facebook.common.internal.l.a(this.g, pointF0)) {
            return;
        }
        if(pointF0 == null) {
            this.g = null;
        }
        else {
            if(this.g == null) {
                this.g = new PointF();
            }
            PointF pointF1 = this.g;
            L.m(pointF1);
            pointF1.set(pointF0);
        }
        this.A();
        this.invalidateSelf();
    }

    public final void M(@l d t$d0) {
        L.p(t$d0, "<set-?>");
        this.e = t$d0;
    }

    public final void N(@l d t$d0) {
        L.p(t$d0, "scaleType");
        if(com.facebook.common.internal.l.a(this.e, t$d0)) {
            return;
        }
        this.e = t$d0;
        this.f = null;
        this.A();
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.h
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        this.B();
        if(this.j != null) {
            int v = canvas0.save();
            canvas0.clipRect(this.getBounds());
            canvas0.concat(this.j);
            super.draw(canvas0);
            canvas0.restoreToCount(v);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // com.facebook.drawee.drawable.h
    protected void onBoundsChange(@l Rect rect0) {
        L.p(rect0, "bounds");
        this.A();
    }

    @Override  // com.facebook.drawee.drawable.h
    public void q(@l Matrix matrix0) {
        L.p(matrix0, "transform");
        this.w(matrix0);
        this.B();
        Matrix matrix1 = this.j;
        if(matrix1 != null) {
            matrix0.preConcat(matrix1);
        }
    }

    @Override  // com.facebook.drawee.drawable.h
    @m
    public Drawable y(@m Drawable drawable0) {
        Drawable drawable1 = super.y(drawable0);
        this.A();
        return drawable1;
    }
}

