package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public abstract class RoundedBitmapDrawable extends Drawable {
    final Bitmap a;
    private int b;
    private int c;
    private final Paint d;
    private final BitmapShader e;
    private final Matrix f;
    private float g;
    final Rect h;
    private final RectF i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private static final int n = 3;

    RoundedBitmapDrawable(Resources resources0, Bitmap bitmap0) {
        this.b = 0xA0;
        this.c = 0x77;
        this.d = new Paint(3);
        this.f = new Matrix();
        this.h = new Rect();
        this.i = new RectF();
        this.j = true;
        if(resources0 != null) {
            this.b = resources0.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap0;
        if(bitmap0 != null) {
            this.a();
            this.e = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            return;
        }
        this.m = -1;
        this.l = -1;
        this.e = null;
    }

    private void a() {
        this.l = this.a.getScaledWidth(this.b);
        this.m = this.a.getScaledHeight(this.b);
    }

    public final Bitmap b() {
        return this.a;
    }

    public float c() {
        return this.g;
    }

    public int d() {
        return this.c;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Bitmap bitmap0 = this.a;
        if(bitmap0 == null) {
            return;
        }
        this.t();
        if(this.d.getShader() == null) {
            canvas0.drawBitmap(bitmap0, null, this.h, this.d);
            return;
        }
        canvas0.drawRoundRect(this.i, this.g, this.g, this.d);
    }

    public final Paint e() {
        return this.d;
    }

    void f(int v, int v1, int v2, Rect rect0, Rect rect1) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.d.isAntiAlias();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.m;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.l;
    }

    // 去混淆评级： 低(30)
    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.c != 0x77 || this.k || (this.a == null || this.a.hasAlpha() || this.d.getAlpha() < 0xFF || RoundedBitmapDrawable.j(this.g)) ? -3 : -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.k;
    }

    private static boolean j(float f) {
        return f > 0.05f;
    }

    public void k(boolean z) {
        this.d.setAntiAlias(z);
        this.invalidateSelf();
    }

    public void l(boolean z) {
        this.k = z;
        this.j = true;
        if(z) {
            this.s();
            this.d.setShader(this.e);
            this.invalidateSelf();
            return;
        }
        this.m(0.0f);
    }

    public void m(float f) {
        if(this.g == f) {
            return;
        }
        this.k = false;
        if(RoundedBitmapDrawable.j(f)) {
            this.d.setShader(this.e);
        }
        else {
            this.d.setShader(null);
        }
        this.g = f;
        this.invalidateSelf();
    }

    public void n(int v) {
        if(this.c != v) {
            this.c = v;
            this.j = true;
            this.invalidateSelf();
        }
    }

    public void o(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        if(this.k) {
            this.s();
        }
        this.j = true;
    }

    public void p(int v) {
        if(this.b != v) {
            if(v == 0) {
                v = 0xA0;
            }
            this.b = v;
            if(this.a != null) {
                this.a();
            }
            this.invalidateSelf();
        }
    }

    public void q(Canvas canvas0) {
        this.p(canvas0.getDensity());
    }

    public void r(DisplayMetrics displayMetrics0) {
        this.p(displayMetrics0.densityDpi);
    }

    private void s() {
        this.g = (float)(Math.min(this.m, this.l) / 2);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        if(v != this.d.getAlpha()) {
            this.d.setAlpha(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.d.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.d.setDither(z);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
        this.invalidateSelf();
    }

    void t() {
        if(this.j) {
            if(this.k) {
                int v = Math.min(this.l, this.m);
                this.f(this.c, v, v, this.getBounds(), this.h);
                int v1 = Math.min(this.h.width(), this.h.height());
                int v2 = Math.max(0, (this.h.width() - v1) / 2);
                int v3 = Math.max(0, (this.h.height() - v1) / 2);
                this.h.inset(v2, v3);
                this.g = ((float)v1) * 0.5f;
            }
            else {
                this.f(this.c, this.l, this.m, this.getBounds(), this.h);
            }
            this.i.set(this.h);
            if(this.e != null) {
                this.f.setTranslate(this.i.left, this.i.top);
                float f = this.i.width() / ((float)this.a.getWidth());
                float f1 = this.i.height() / ((float)this.a.getHeight());
                this.f.preScale(f, f1);
                this.e.setLocalMatrix(this.f);
                this.d.setShader(this.e);
            }
            this.j = false;
        }
    }
}

