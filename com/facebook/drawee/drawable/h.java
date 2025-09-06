package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import k1.n.a;
import k1.n;

@n(a.a)
public class h extends Drawable implements Drawable.Callback, d, u, v {
    @o3.h
    private Drawable a;
    private final e b;
    @o3.h
    protected v c;
    private static final Matrix d;

    static {
        h.d = new Matrix();
    }

    public h(@o3.h Drawable drawable0) {
        this.b = new e();
        this.a = drawable0;
        f.e(drawable0, this, this);
    }

    @Override  // com.facebook.drawee.drawable.d
    @o3.h
    public Drawable a(@o3.h Drawable drawable0) {
        return this.y(drawable0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.draw(canvas0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @o3.h
    public Drawable.ConstantState getConstantState() {
        return this.a == null ? super.getConstantState() : this.a.getConstantState();
    }

    @Override  // android.graphics.drawable.Drawable
    @o3.h
    public Drawable getCurrent() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a == null ? super.getIntrinsicHeight() : this.a.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a == null ? super.getIntrinsicWidth() : this.a.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a == null ? 0 : this.a.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect0) {
        return this.a == null ? super.getPadding(rect0) : this.a.getPadding(rect0);
    }

    @Override  // com.facebook.drawee.drawable.u
    public void h(@o3.h v v0) {
        this.c = v0;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(Drawable drawable0) {
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.a == null ? false : this.a.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.mutate();
        }
        return this;
    }

    @Override  // com.facebook.drawee.drawable.v
    public void n(RectF rectF0) {
        v v0 = this.c;
        if(v0 != null) {
            v0.n(rectF0);
            return;
        }
        rectF0.set(this.getBounds());
    }

    @Override  // com.facebook.drawee.drawable.d
    @o3.h
    public Drawable o() {
        return this.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        return this.a == null ? super.onLevelChange(v) : this.a.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        return this.a == null ? super.onStateChange(arr_v) : this.a.setState(arr_v);
    }

    @Override  // com.facebook.drawee.drawable.v
    public void q(Matrix matrix0) {
        this.w(matrix0);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        this.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.b.b(v);
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setAlpha(v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@o3.h ColorFilter colorFilter0) {
        this.b.c(colorFilter0);
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setColorFilter(colorFilter0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.b.d(z);
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setDither(z);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.b.e(z);
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setFilterBitmap(z);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f1) {
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.setHotspot(f, f1);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        return this.a == null ? z2 : this.a.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        this.unscheduleSelf(runnable0);
    }

    protected void w(Matrix matrix0) {
        v v0 = this.c;
        if(v0 != null) {
            v0.q(matrix0);
            return;
        }
        matrix0.reset();
    }

    public void x(RectF rectF0) {
        this.w(h.d);
        rectF0.set(this.getBounds());
        h.d.mapRect(rectF0);
    }

    @o3.h
    public Drawable y(@o3.h Drawable drawable0) {
        Drawable drawable1 = this.z(drawable0);
        this.invalidateSelf();
        return drawable1;
    }

    @o3.h
    protected Drawable z(@o3.h Drawable drawable0) {
        Drawable drawable1 = this.a;
        f.e(drawable1, null, null);
        f.e(drawable0, null, null);
        f.f(drawable0, this.b);
        f.b(drawable0, this);
        f.e(drawable0, this, this);
        this.a = drawable0;
        return drawable1;
    }
}

