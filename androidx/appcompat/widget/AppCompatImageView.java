package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

public class AppCompatImageView extends ImageView implements TintableBackgroundView, TintableImageSourceView {
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private boolean mHasLevel;
    private final AppCompatImageHelper mImageHelper;

    public AppCompatImageView(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatImageView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public AppCompatImageView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.b(context0), attributeSet0, v);
        this.mHasLevel = false;
        ThemeUtils.a(this, this.getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper0;
        appCompatBackgroundHelper0.e(attributeSet0, v);
        AppCompatImageHelper appCompatImageHelper0 = new AppCompatImageHelper(this);
        this.mImageHelper = appCompatImageHelper0;
        appCompatImageHelper0.g(attributeSet0, v);
    }

    @Override  // android.widget.ImageView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.mBackgroundTintHelper;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.b();
        }
        AppCompatImageHelper appCompatImageHelper0 = this.mImageHelper;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.c();
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.c})
    public ColorStateList getSupportBackgroundTintList() {
        return this.mBackgroundTintHelper == null ? null : this.mBackgroundTintHelper.c();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.mBackgroundTintHelper == null ? null : this.mBackgroundTintHelper.d();
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({Scope.c})
    public ColorStateList getSupportImageTintList() {
        return this.mImageHelper == null ? null : this.mImageHelper.d();
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @Nullable
    @RestrictTo({Scope.c})
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.mImageHelper == null ? null : this.mImageHelper.e();
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.ImageView
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.f() && super.hasOverlappingRendering();
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.mBackgroundTintHelper;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.f(drawable0);
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.mBackgroundTintHelper;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.g(v);
        }
    }

    @Override  // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap0) {
        super.setImageBitmap(bitmap0);
        AppCompatImageHelper appCompatImageHelper0 = this.mImageHelper;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.c();
        }
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable0) {
        AppCompatImageHelper appCompatImageHelper0 = this.mImageHelper;
        if(appCompatImageHelper0 != null && drawable0 != null && !this.mHasLevel) {
            appCompatImageHelper0.h(drawable0);
        }
        super.setImageDrawable(drawable0);
        AppCompatImageHelper appCompatImageHelper1 = this.mImageHelper;
        if(appCompatImageHelper1 != null) {
            appCompatImageHelper1.c();
            if(!this.mHasLevel) {
                this.mImageHelper.b();
            }
        }
    }

    @Override  // android.widget.ImageView
    public void setImageLevel(int v) {
        super.setImageLevel(v);
        this.mHasLevel = true;
    }

    @Override  // android.widget.ImageView
    public void setImageResource(@DrawableRes int v) {
        AppCompatImageHelper appCompatImageHelper0 = this.mImageHelper;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.i(v);
        }
    }

    @Override  // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri0) {
        super.setImageURI(uri0);
        AppCompatImageHelper appCompatImageHelper0 = this.mImageHelper;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.c();
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.c})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.mBackgroundTintHelper;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.i(colorStateList0);
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.mBackgroundTintHelper;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.j(porterDuff$Mode0);
        }
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @RestrictTo({Scope.c})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList0) {
        AppCompatImageHelper appCompatImageHelper0 = this.mImageHelper;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.k(colorStateList0);
        }
    }

    @Override  // androidx.core.widget.TintableImageSourceView
    @RestrictTo({Scope.c})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        AppCompatImageHelper appCompatImageHelper0 = this.mImageHelper;
        if(appCompatImageHelper0 != null) {
            appCompatImageHelper0.l(porterDuff$Mode0);
        }
    }
}

