package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;

final class WrappedDrawableState extends Drawable.ConstantState {
    int a;
    Drawable.ConstantState b;
    ColorStateList c;
    PorterDuff.Mode d;

    WrappedDrawableState(WrappedDrawableState wrappedDrawableState0) {
        this.c = null;
        this.d = WrappedDrawableApi14.g;
        if(wrappedDrawableState0 != null) {
            this.a = wrappedDrawableState0.a;
            this.b = wrappedDrawableState0.b;
            this.c = wrappedDrawableState0.c;
            this.d = wrappedDrawableState0.d;
        }
    }

    boolean a() {
        return this.b != null;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public int getChangingConfigurations() {
        return this.b == null ? this.a : this.a | this.b.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public Drawable newDrawable() {
        return this.newDrawable(null);
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public Drawable newDrawable(Resources resources0) {
        return new WrappedDrawableApi21(this, resources0);
    }
}

