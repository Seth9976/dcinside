package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class RoundRectDrawable extends Drawable {
    private float a;
    private final Paint b;
    private final RectF c;
    private final Rect d;
    private float e;
    private boolean f;
    private boolean g;
    private ColorStateList h;
    private PorterDuffColorFilter i;
    private ColorStateList j;
    private PorterDuff.Mode k;

    RoundRectDrawable(ColorStateList colorStateList0, float f) {
        this.f = false;
        this.g = true;
        this.k = PorterDuff.Mode.SRC_IN;
        this.a = f;
        this.b = new Paint(5);
        this.e(colorStateList0);
        this.c = new RectF();
        this.d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(this.getState(), 0), porterDuff$Mode0);
    }

    public ColorStateList b() {
        return this.h;
    }

    float c() {
        return this.e;
    }

    public float d() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        boolean z;
        Paint paint0 = this.b;
        if(this.i == null || paint0.getColorFilter() != null) {
            z = false;
        }
        else {
            paint0.setColorFilter(this.i);
            z = true;
        }
        canvas0.drawRoundRect(this.c, this.a, this.a, paint0);
        if(z) {
            paint0.setColorFilter(null);
        }
    }

    private void e(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(0);
        }
        this.h = colorStateList0;
        int v = colorStateList0.getColorForState(this.getState(), this.h.getDefaultColor());
        this.b.setColor(v);
    }

    public void f(@Nullable ColorStateList colorStateList0) {
        this.e(colorStateList0);
        this.invalidateSelf();
    }

    void g(float f, boolean z, boolean z1) {
        if(f == this.e && this.f == z && this.g == z1) {
            return;
        }
        this.e = f;
        this.f = z;
        this.g = z1;
        this.i(null);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public void getOutline(Outline outline0) {
        outline0.setRoundRect(this.d, this.a);
    }

    void h(float f) {
        if(f == this.a) {
            return;
        }
        this.a = f;
        this.i(null);
        this.invalidateSelf();
    }

    private void i(Rect rect0) {
        if(rect0 == null) {
            rect0 = this.getBounds();
        }
        this.c.set(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom));
        this.d.set(rect0);
        if(this.f) {
            float f = RoundRectDrawableWithShadow.d(this.e, this.a, this.g);
            int v = (int)Math.ceil(RoundRectDrawableWithShadow.c(this.e, this.a, this.g));
            this.d.inset(v, ((int)Math.ceil(f)));
            this.c.set(this.d);
        }
    }

    // 去混淆评级： 中等(50)
    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.j != null && this.j.isStateful() || (this.h != null && this.h.isStateful() || super.isStateful());
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.i(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] arr_v) {
        int v = this.h.getColorForState(arr_v, this.h.getDefaultColor());
        boolean z = v != this.b.getColor();
        if(z) {
            this.b.setColor(v);
        }
        ColorStateList colorStateList0 = this.j;
        if(colorStateList0 != null) {
            PorterDuff.Mode porterDuff$Mode0 = this.k;
            if(porterDuff$Mode0 != null) {
                this.i = this.a(colorStateList0, porterDuff$Mode0);
                return true;
            }
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.b.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.b.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList0) {
        this.j = colorStateList0;
        this.i = this.a(colorStateList0, this.k);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.k = porterDuff$Mode0;
        this.i = this.a(this.j, porterDuff$Mode0);
        this.invalidateSelf();
    }
}

