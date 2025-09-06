package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatToggleButton extends ToggleButton implements EmojiCompatConfigurationView, TintableBackgroundView, TintableCompoundDrawablesView {
    private final AppCompatBackgroundHelper a;
    private final AppCompatTextHelper b;
    private AppCompatEmojiTextHelper c;

    public AppCompatToggleButton(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatToggleButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x101004B);
    }

    public AppCompatToggleButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        ThemeUtils.a(this, this.getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = new AppCompatBackgroundHelper(this);
        this.a = appCompatBackgroundHelper0;
        appCompatBackgroundHelper0.e(attributeSet0, v);
        AppCompatTextHelper appCompatTextHelper0 = new AppCompatTextHelper(this);
        this.b = appCompatTextHelper0;
        appCompatTextHelper0.m(attributeSet0, v);
        this.getEmojiTextViewHelper().c(attributeSet0, v);
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean a() {
        return this.getEmojiTextViewHelper().b();
    }

    @Override  // android.widget.ToggleButton
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.b();
        }
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.b();
        }
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if(this.c == null) {
            this.c = new AppCompatEmojiTextHelper(this);
        }
        return this.c;
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

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().d(z);
    }

    @Override  // android.widget.ToggleButton
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

    @Override  // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.p();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.p();
        }
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().e(z);
    }

    @Override  // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().a(arr_inputFilter));
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

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.c})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList0) {
        this.b.w(colorStateList0);
        this.b.b();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.c})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.b.x(porterDuff$Mode0);
        this.b.b();
    }
}

