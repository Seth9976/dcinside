package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;

@RestrictTo({Scope.b})
public class a extends Drawable implements TintAwareDrawable, t {
    static class com.google.android.material.ripple.a.a {
    }

    static final class b extends Drawable.ConstantState {
        @NonNull
        k a;
        boolean b;

        public b(@NonNull b a$b0) {
            this.a = (k)a$b0.a.getConstantState().newDrawable();
            this.b = a$b0.b;
        }

        public b(k k0) {
            this.a = k0;
            this.b = false;
        }

        @NonNull
        public a a() {
            return new a(new b(this), null);
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override  // android.graphics.drawable.Drawable$ConstantState
        @NonNull
        public Drawable newDrawable() {
            return this.a();
        }
    }

    private b a;

    private a(b a$b0) {
        this.a = a$b0;
    }

    a(b a$b0, com.google.android.material.ripple.a.a a$a0) {
        this(a$b0);
    }

    public a(p p0) {
        this(new b(new k(p0)));
    }

    @NonNull
    public a a() {
        this.a = new b(this.a);
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        b a$b0 = this.a;
        if(a$b0.b) {
            a$b0.a.draw(canvas0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.a.getOpacity();
    }

    @Override  // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.a.a.getShapeAppearanceModel();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        return this.a();
    }

    @Override  // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NonNull Rect rect0) {
        super.onBoundsChange(rect0);
        this.a.a.setBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    protected boolean onStateChange(@NonNull int[] arr_v) {
        boolean z = super.onStateChange(arr_v);
        if(this.a.a.setState(arr_v)) {
            z = true;
        }
        boolean z1 = com.google.android.material.ripple.b.f(arr_v);
        b a$b0 = this.a;
        if(a$b0.b != z1) {
            a$b0.b = z1;
            return true;
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.a.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.a.a.setColorFilter(colorFilter0);
    }

    @Override  // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p p0) {
        this.a.a.setShapeAppearanceModel(p0);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int v) {
        this.a.a.setTint(v);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList0) {
        this.a.a.setTintList(colorStateList0);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.a.a.setTintMode(porterDuff$Mode0);
    }
}

