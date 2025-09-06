package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class com.facebook.drawee.drawable.a extends Drawable implements Drawable.Callback, u, v {
    @h
    private v a;
    private final e b;
    private final Drawable[] c;
    private final d[] d;
    private final Rect e;
    private boolean f;
    private boolean g;
    private boolean h;

    public com.facebook.drawee.drawable.a(Drawable[] arr_drawable) {
        Drawable[] arr_drawable1;
        this.b = new e();
        this.e = new Rect();
        this.f = false;
        this.g = false;
        this.h = false;
        com.facebook.common.internal.n.i(arr_drawable);
        this.c = arr_drawable;
        for(int v = 0; true; ++v) {
            arr_drawable1 = this.c;
            if(v >= arr_drawable1.length) {
                break;
            }
            f.e(arr_drawable1[v], this, this);
        }
        this.d = new d[arr_drawable1.length];
    }

    private d a(int v) {
        class com.facebook.drawee.drawable.a.a implements d {
            final int a;
            final com.facebook.drawee.drawable.a b;

            com.facebook.drawee.drawable.a.a(int v) {
                this.a = v;
                super();
            }

            @Override  // com.facebook.drawee.drawable.d
            @h
            public Drawable a(@h Drawable drawable0) {
                return com.facebook.drawee.drawable.a.this.e(this.a, drawable0);
            }

            @Override  // com.facebook.drawee.drawable.d
            @h
            public Drawable o() {
                return com.facebook.drawee.drawable.a.this.b(this.a);
            }
        }

        return new com.facebook.drawee.drawable.a.a(this, v);
    }

    @h
    public Drawable b(int v) {
        boolean z = false;
        com.facebook.common.internal.n.d(Boolean.valueOf(v >= 0));
        if(v < this.c.length) {
            z = true;
        }
        com.facebook.common.internal.n.d(Boolean.valueOf(z));
        return this.c[v];
    }

    public d c(int v) {
        boolean z = false;
        com.facebook.common.internal.n.d(Boolean.valueOf(v >= 0));
        if(v < this.d.length) {
            z = true;
        }
        com.facebook.common.internal.n.d(Boolean.valueOf(z));
        d[] arr_d = this.d;
        if(arr_d[v] == null) {
            arr_d[v] = this.a(v);
        }
        return this.d[v];
    }

    public int d() {
        return this.c.length;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.draw(canvas0);
            }
        }
    }

    @h
    public Drawable e(int v, @h Drawable drawable0) {
        boolean z = true;
        com.facebook.common.internal.n.d(Boolean.valueOf(v >= 0));
        if(v >= this.c.length) {
            z = false;
        }
        com.facebook.common.internal.n.d(Boolean.valueOf(z));
        Drawable drawable1 = this.c[v];
        if(drawable0 != drawable1) {
            if(drawable0 != null && this.h) {
                drawable0.mutate();
            }
            f.e(this.c[v], null, null);
            f.e(drawable0, null, null);
            f.f(drawable0, this.b);
            f.b(drawable0, this);
            f.e(drawable0, this, this);
            this.g = false;
            this.c[v] = drawable0;
            this.invalidateSelf();
        }
        return drawable1;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int v1 = -1;
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                v1 = Math.max(v1, drawable0.getIntrinsicHeight());
            }
        }
        return v1 <= 0 ? -1 : v1;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int v1 = -1;
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                v1 = Math.max(v1, drawable0.getIntrinsicWidth());
            }
        }
        return v1 <= 0 ? -1 : v1;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        if(this.c.length == 0) {
            return -2;
        }
        int v1 = -1;
        for(int v = 1; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                v1 = Drawable.resolveOpacity(v1, drawable0.getOpacity());
            }
        }
        return v1;
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect0) {
        rect0.left = 0;
        rect0.top = 0;
        rect0.right = 0;
        rect0.bottom = 0;
        Rect rect1 = this.e;
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.getPadding(rect1);
                rect0.left = Math.max(rect0.left, rect1.left);
                rect0.top = Math.max(rect0.top, rect1.top);
                rect0.right = Math.max(rect0.right, rect1.right);
                rect0.bottom = Math.max(rect0.bottom, rect1.bottom);
            }
        }
        return true;
    }

    @Override  // com.facebook.drawee.drawable.u
    public void h(@h v v0) {
        this.a = v0;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(Drawable drawable0) {
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if(!this.g) {
            this.f = false;
            for(int v = 0; true; ++v) {
                Drawable[] arr_drawable = this.c;
                boolean z = true;
                if(v >= arr_drawable.length) {
                    break;
                }
                Drawable drawable0 = arr_drawable[v];
                boolean z1 = this.f;
                if(drawable0 == null || !drawable0.isStateful()) {
                    z = false;
                }
                this.f = z1 | z;
            }
            this.g = true;
        }
        return this.f;
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.mutate();
            }
        }
        this.h = true;
        return this;
    }

    @Override  // com.facebook.drawee.drawable.v
    public void n(RectF rectF0) {
        v v0 = this.a;
        if(v0 != null) {
            v0.n(rectF0);
            return;
        }
        rectF0.set(this.getBounds());
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.setBounds(rect0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        boolean z = false;
        for(int v1 = 0; true; ++v1) {
            Drawable[] arr_drawable = this.c;
            if(v1 >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v1];
            if(drawable0 != null && drawable0.setLevel(v)) {
                z = true;
            }
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        boolean z = false;
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null && drawable0.setState(arr_v)) {
                z = true;
            }
        }
        return z;
    }

    @Override  // com.facebook.drawee.drawable.v
    public void q(Matrix matrix0) {
        v v0 = this.a;
        if(v0 != null) {
            v0.q(matrix0);
            return;
        }
        matrix0.reset();
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        this.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.b.b(v);
        for(int v1 = 0; true; ++v1) {
            Drawable[] arr_drawable = this.c;
            if(v1 >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v1];
            if(drawable0 != null) {
                drawable0.setAlpha(v);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.b.c(colorFilter0);
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.setColorFilter(colorFilter0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.b.d(z);
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.setDither(z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.b.e(z);
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.setFilterBitmap(z);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f1) {
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.setHotspot(f, f1);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        boolean z2 = super.setVisible(z, z1);
        for(int v = 0; true; ++v) {
            Drawable[] arr_drawable = this.c;
            if(v >= arr_drawable.length) {
                break;
            }
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.setVisible(z, z1);
            }
        }
        return z2;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        this.unscheduleSelf(runnable0);
    }
}

