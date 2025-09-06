package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@RequiresApi(21)
class WrappedDrawableApi21 extends WrappedDrawableApi14 {
    private static final String h = "WrappedDrawableApi21";
    private static Method i;

    WrappedDrawableApi21(Drawable drawable0) {
        super(drawable0);
        this.g();
    }

    WrappedDrawableApi21(WrappedDrawableState wrappedDrawableState0, Resources resources0) {
        super(wrappedDrawableState0, resources0);
        this.g();
    }

    // 去混淆评级： 低(40)
    @Override  // androidx.core.graphics.drawable.WrappedDrawableApi14
    protected boolean c() [...] // 潜在的解密器

    private void g() {
        if(WrappedDrawableApi21.i == null) {
            try {
                WrappedDrawableApi21.i = Drawable.class.getDeclaredMethod("isProjected", null);
            }
            catch(Exception exception0) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", exception0);
            }
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f.getDirtyBounds();
    }

    @Override  // android.graphics.drawable.Drawable
    public void getOutline(Outline outline0) {
        this.f.getOutline(outline0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            Method method0 = WrappedDrawableApi21.i;
            if(method0 != null) {
                try {
                    return ((Boolean)method0.invoke(drawable0, null)).booleanValue();
                }
                catch(Exception exception0) {
                    Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", exception0);
                }
            }
        }
        return false;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f1) {
        this.f.setHotspot(f, f1);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setHotspotBounds(int v, int v1, int v2, int v3) {
        this.f.setHotspotBounds(v, v1, v2, v3);
    }

    @Override  // androidx.core.graphics.drawable.WrappedDrawableApi14
    public boolean setState(int[] arr_v) {
        if(super.setState(arr_v)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }

    @Override  // androidx.core.graphics.drawable.WrappedDrawableApi14
    public void setTint(int v) {
        this.f.setTint(v);
    }

    @Override  // androidx.core.graphics.drawable.WrappedDrawableApi14
    public void setTintList(ColorStateList colorStateList0) {
        this.f.setTintList(colorStateList0);
    }

    @Override  // androidx.core.graphics.drawable.WrappedDrawableApi14
    public void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.f.setTintMode(porterDuff$Mode0);
    }
}

