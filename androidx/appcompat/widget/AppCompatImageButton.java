package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

public class AppCompatImageButton extends ImageButton implements TintableBackgroundView, TintableImageSourceView {
    private final AppCompatBackgroundHelper a;
    private final AppCompatImageHelper b;
    private boolean c;

    public AppCompatImageButton(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatImageButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.imageButtonStyle);
    }

    public AppCompatImageButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.b(context0), attributeSet0, v);
        this.c = false;
        ThemeUtils.a(this, this.getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = new AppCompatBackgroundHelper(this);
        this.a = appCompatBackgroundHelper0;
        appCompatBackgroundHelper0.e(attributeSet0, v);
        AppCompatImageHelper appCompatImageHelper0 = new AppCompatImageHelper(this);
        this.b = appCompatImageHelper0;
        appCompatImageHelper0.g(attributeSet0, v);
    }

    @Override  // android.widget.ImageView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.b();
        }
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.c();
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.c})
    public ColorStateList getSupportBackgroundTintList() {
        return this.a == null ? null : this.a.c();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.a == null ? null : this.a.d();
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({Scope.c})
    public ColorStateList getSupportImageTintList() {
        return this.b == null ? null : this.b.d();
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({Scope.c})
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.b == null ? null : this.b.e();
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.ImageView
    public boolean hasOverlappingRendering() {
        return this.b.f() && super.hasOverlappingRendering();
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.f(drawable0);
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.g(v);
        }
    }

    @Override  // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap0) {
        super.setImageBitmap(bitmap0);
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.c();
        }
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable0) {
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null && drawable0 != null && !this.c) {
            appCompatImageHelper0.h(drawable0);
        }
        super.setImageDrawable(drawable0);
        AppCompatImageHelper appCompatImageHelper1 = this.b;
        if(appCompatImageHelper1 != null) {
            appCompatImageHelper1.c();
            if(!this.c) {
                this.b.b();
            }
        }
    }

    @Override  // android.widget.ImageView
    public void setImageLevel(int v) {
        super.setImageLevel(v);
        this.c = true;
    }

    @Override  // android.widget.ImageView
    public void setImageResource(@DrawableRes int v) {
        this.b.i(v);
    }

    @Override  // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri0) {
        super.setImageURI(uri0);
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.c();
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.c})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.i(colorStateList0);
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.j(porterDuff$Mode0);
        }
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @RestrictTo({Scope.c})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList0) {
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.k(colorStateList0);
        }
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @RestrictTo({Scope.c})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        AppCompatImageHelper appCompatImageHelper0 = this.b;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.l(porterDuff$Mode0);
        }
    }
}

