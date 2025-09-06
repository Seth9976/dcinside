package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import k1.n.a;
import k1.n;

@n(a.a)
public class j extends h {
    private Matrix e;
    @o3.h
    private Matrix f;
    private int g;
    private int h;

    public j(Drawable drawable0, Matrix matrix0) {
        super(((Drawable)com.facebook.common.internal.n.i(drawable0)));
        this.g = 0;
        this.h = 0;
        this.e = matrix0;
    }

    private void A() {
        Drawable drawable0 = this.getCurrent();
        if(drawable0 == null) {
            return;
        }
        Rect rect0 = this.getBounds();
        int v = drawable0.getIntrinsicWidth();
        this.g = v;
        int v1 = drawable0.getIntrinsicHeight();
        this.h = v1;
        if(v > 0 && v1 > 0) {
            drawable0.setBounds(0, 0, v, v1);
            this.f = this.e;
            return;
        }
        drawable0.setBounds(rect0);
        this.f = null;
    }

    private void B() {
        Drawable drawable0 = this.getCurrent();
        if(drawable0 == null) {
            return;
        }
        if(this.g != drawable0.getIntrinsicWidth() || this.h != drawable0.getIntrinsicHeight()) {
            this.A();
        }
    }

    public Matrix C() {
        return this.e;
    }

    public void D(Matrix matrix0) {
        this.e = matrix0;
        this.A();
        this.invalidateSelf();
    }

    @Override  // com.facebook.drawee.drawable.h
    public void draw(Canvas canvas0) {
        this.B();
        if(this.f != null) {
            int v = canvas0.save();
            canvas0.clipRect(this.getBounds());
            canvas0.concat(this.f);
            super.draw(canvas0);
            canvas0.restoreToCount(v);
            return;
        }
        super.draw(canvas0);
    }

    @Override  // com.facebook.drawee.drawable.h
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.A();
    }

    @Override  // com.facebook.drawee.drawable.h
    public void q(Matrix matrix0) {
        super.q(matrix0);
        Matrix matrix1 = this.f;
        if(matrix1 != null) {
            matrix0.preConcat(matrix1);
        }
    }

    @Override  // com.facebook.drawee.drawable.h
    @o3.h
    public Drawable y(@o3.h Drawable drawable0) {
        Drawable drawable1 = super.y(drawable0);
        this.A();
        return drawable1;
    }
}

