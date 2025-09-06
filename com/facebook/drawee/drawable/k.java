package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.j;

public final class k extends h {
    @l
    @f
    public final Matrix e;
    private final int f;
    private final int g;
    @l
    private final Matrix h;
    @l
    private final RectF i;

    @j
    public k(@m Drawable drawable0, int v) {
        this(drawable0, v, 0, 4, null);
    }

    @j
    public k(@m Drawable drawable0, int v, int v1) {
        super(drawable0);
        this.e = new Matrix();
        this.f = v - v % 90;
        if(v1 < 0 || v1 > 8) {
            v1 = 0;
        }
        this.g = v1;
        this.h = new Matrix();
        this.i = new RectF();
    }

    public k(Drawable drawable0, int v, int v1, int v2, w w0) {
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        this(drawable0, v, v1);
    }

    @VisibleForTesting
    public static void A() {
    }

    @Override  // com.facebook.drawee.drawable.h
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        if(this.f <= 0 && (this.g == 0 || this.g == 1)) {
            super.draw(canvas0);
            return;
        }
        int v = canvas0.save();
        canvas0.concat(this.e);
        super.draw(canvas0);
        canvas0.restoreToCount(v);
    }

    @Override  // com.facebook.drawee.drawable.h
    public int getIntrinsicHeight() {
        return this.g == 5 || this.g == 7 || this.f % 180 != 0 ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override  // com.facebook.drawee.drawable.h
    public int getIntrinsicWidth() {
        return this.g == 5 || this.g == 7 || this.f % 180 != 0 ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override  // com.facebook.drawee.drawable.h
    protected void onBoundsChange(@l Rect rect0) {
        L.p(rect0, "bounds");
        Drawable drawable0 = this.getCurrent();
        if(drawable0 == null) {
            return;
        }
        int v = this.f;
        if(v <= 0 && (this.g == 0 || this.g == 1)) {
            drawable0.setBounds(rect0);
            return;
        }
        switch(this.g) {
            case 2: {
                this.e.setScale(-1.0f, 1.0f);
                break;
            }
            case 4: {
                this.e.setScale(1.0f, -1.0f);
                break;
            }
            case 5: {
                float f2 = (float)rect0.centerX();
                float f3 = (float)rect0.centerY();
                this.e.setRotate(270.0f, f2, f3);
                this.e.postScale(1.0f, -1.0f);
                break;
            }
            case 7: {
                float f4 = (float)rect0.centerX();
                float f5 = (float)rect0.centerY();
                this.e.setRotate(270.0f, f4, f5);
                this.e.postScale(-1.0f, 1.0f);
                break;
            }
            default: {
                float f = (float)rect0.centerX();
                float f1 = (float)rect0.centerY();
                this.e.setRotate(((float)v), f, f1);
            }
        }
        this.h.reset();
        this.e.invert(this.h);
        this.i.set(rect0);
        this.h.mapRect(this.i);
        drawable0.setBounds(((int)this.i.left), ((int)this.i.top), ((int)this.i.right), ((int)this.i.bottom));
    }

    @Override  // com.facebook.drawee.drawable.h
    public void q(@l Matrix matrix0) {
        L.p(matrix0, "transform");
        this.w(matrix0);
        if(!this.e.isIdentity()) {
            matrix0.preConcat(this.e);
        }
    }
}

