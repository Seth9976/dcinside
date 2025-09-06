package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, TintAwareDrawable, WrappedDrawable {
    private int a;
    private PorterDuff.Mode b;
    private boolean c;
    WrappedDrawableState d;
    private boolean e;
    Drawable f;
    static final PorterDuff.Mode g;

    static {
        WrappedDrawableApi14.g = PorterDuff.Mode.SRC_IN;
    }

    WrappedDrawableApi14(Drawable drawable0) {
        this.d = this.d();
        this.a(drawable0);
    }

    WrappedDrawableApi14(WrappedDrawableState wrappedDrawableState0, Resources resources0) {
        this.d = wrappedDrawableState0;
        this.e(resources0);
    }

    @Override  // androidx.core.graphics.drawable.WrappedDrawable
    public final void a(Drawable drawable0) {
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        this.f = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
            this.setVisible(drawable0.isVisible(), true);
            this.setState(drawable0.getState());
            this.setLevel(drawable0.getLevel());
            this.setBounds(drawable0.getBounds());
            WrappedDrawableState wrappedDrawableState0 = this.d;
            if(wrappedDrawableState0 != null) {
                wrappedDrawableState0.b = drawable0.getConstantState();
            }
        }
        this.invalidateSelf();
    }

    @Override  // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable b() {
        return this.f;
    }

    protected boolean c() {
        return true;
    }

    private WrappedDrawableState d() {
        return new WrappedDrawableState(this.d);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        this.f.draw(canvas0);
    }

    private void e(Resources resources0) {
        WrappedDrawableState wrappedDrawableState0 = this.d;
        if(wrappedDrawableState0 != null) {
            Drawable.ConstantState drawable$ConstantState0 = wrappedDrawableState0.b;
            if(drawable$ConstantState0 != null) {
                this.a(drawable$ConstantState0.newDrawable(resources0));
            }
        }
    }

    private boolean f(int[] arr_v) {
        if(!this.c()) {
            return false;
        }
        ColorStateList colorStateList0 = this.d.c;
        PorterDuff.Mode porterDuff$Mode0 = this.d.d;
        if(colorStateList0 == null || porterDuff$Mode0 == null) {
            this.c = false;
            this.clearColorFilter();
        }
        else {
            int v = colorStateList0.getColorForState(arr_v, colorStateList0.getDefaultColor());
            if(!this.c || v != this.a || porterDuff$Mode0 != this.b) {
                this.setColorFilter(v, porterDuff$Mode0);
                this.a = v;
                this.b = porterDuff$Mode0;
                this.c = true;
                return true;
            }
        }
        return false;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int v = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState0 = this.d;
        return wrappedDrawableState0 == null ? v | this.f.getChangingConfigurations() : v | wrappedDrawableState0.getChangingConfigurations() | this.f.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if(this.d != null && this.d.a()) {
            WrappedDrawableState wrappedDrawableState0 = this.d;
            wrappedDrawableState0.a = this.getChangingConfigurations();
            return this.d;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(23)
    public int getLayoutDirection() {
        return DrawableCompat.f(this.f);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect0) {
        return this.f.getPadding(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f.getState();
    }

    @Override  // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f.getTransparentRegion();
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void invalidateDrawable(Drawable drawable0) {
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return DrawableCompat.h(this.f);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if(this.c()) {
            WrappedDrawableState wrappedDrawableState0 = this.d;
            if(wrappedDrawableState0 != null) {
                return wrappedDrawableState0.c != null && wrappedDrawableState0.c.isStateful() || this.f.isStateful();
            }
        }
        throw new NullPointerException();
    }

    @Override  // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f.jumpToCurrentState();
    }

    @Override  // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if(!this.e && super.mutate() == this) {
            this.d = this.d();
            Drawable drawable0 = this.f;
            if(drawable0 != null) {
                drawable0.mutate();
            }
            WrappedDrawableState wrappedDrawableState0 = this.d;
            if(wrappedDrawableState0 != null) {
                wrappedDrawableState0.b = this.f == null ? null : this.f.getConstantState();
            }
            this.e = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @RequiresApi(23)
    public boolean onLayoutDirectionChanged(int v) {
        return DrawableCompat.m(this.f, v);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int v) {
        return this.f.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        this.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.f.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        DrawableCompat.j(this.f, z);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int v) {
        this.f.setChangingConfigurations(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.f.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f.setDither(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f.setFilterBitmap(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setState(int[] arr_v) {
        boolean z = this.f.setState(arr_v);
        return this.f(arr_v) || z;
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList0) {
        this.d.c = colorStateList0;
        this.f(this.getState());
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.d.d = porterDuff$Mode0;
        this.f(this.getState());
    }

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        return super.setVisible(z, z1) || this.f.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        this.unscheduleSelf(runnable0);
    }
}

