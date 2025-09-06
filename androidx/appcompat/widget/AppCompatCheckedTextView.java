package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatCheckedTextView extends CheckedTextView implements EmojiCompatConfigurationView, TintableBackgroundView, TintableCheckedTextView, TintableCompoundDrawablesView {
    private final AppCompatCheckedTextViewHelper a;
    private final AppCompatBackgroundHelper b;
    private final AppCompatTextHelper c;
    @NonNull
    private AppCompatEmojiTextHelper d;

    public AppCompatCheckedTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatCheckedTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.b(context0), attributeSet0, v);
        ThemeUtils.a(this, this.getContext());
        AppCompatTextHelper appCompatTextHelper0 = new AppCompatTextHelper(this);
        this.c = appCompatTextHelper0;
        appCompatTextHelper0.m(attributeSet0, v);
        appCompatTextHelper0.b();
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = new AppCompatBackgroundHelper(this);
        this.b = appCompatBackgroundHelper0;
        appCompatBackgroundHelper0.e(attributeSet0, v);
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper0 = new AppCompatCheckedTextViewHelper(this);
        this.a = appCompatCheckedTextViewHelper0;
        appCompatCheckedTextViewHelper0.d(attributeSet0, v);
        this.getEmojiTextViewHelper().c(attributeSet0, v);
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean a() {
        return this.getEmojiTextViewHelper().b();
    }

    @Override  // android.widget.CheckedTextView
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper0 = this.c;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.b();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.b;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.b();
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper0 = this.a;
        if(appCompatCheckedTextViewHelper0 != null) {
            appCompatCheckedTextViewHelper0.a();
        }
    }

    @Override  // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.F(super.getCustomSelectionActionModeCallback());
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if(this.d == null) {
            this.d = new AppCompatEmojiTextHelper(this);
        }
        return this.d;
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.c})
    public ColorStateList getSupportBackgroundTintList() {
        return this.b == null ? null : this.b.c();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.b == null ? null : this.b.d();
    }

    @Override  // androidx.core.widget.TintableCheckedTextView
    @Nullable
    @RestrictTo({Scope.c})
    public ColorStateList getSupportCheckMarkTintList() {
        return this.a == null ? null : this.a.b();
    }

    @Override  // androidx.core.widget.TintableCheckedTextView
    @Nullable
    @RestrictTo({Scope.c})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.a == null ? null : this.a.c();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.j();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({Scope.c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.k();
    }

    @Override  // android.widget.TextView
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo0) {
        return AppCompatHintHelper.a(super.onCreateInputConnection(editorInfo0), editorInfo0, this);
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().d(z);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.b;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.f(drawable0);
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.b;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.g(v);
        }
    }

    @Override  // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int v) {
        this.setCheckMarkDrawable(AppCompatResources.b(this.getContext(), v));
    }

    @Override  // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable0) {
        super.setCheckMarkDrawable(drawable0);
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper0 = this.a;
        if(appCompatCheckedTextViewHelper0 != null) {
            appCompatCheckedTextViewHelper0.e();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        AppCompatTextHelper appCompatTextHelper0 = this.c;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.p();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        AppCompatTextHelper appCompatTextHelper0 = this.c;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.p();
        }
    }

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.G(this, actionMode$Callback0));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().e(z);
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.c})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.b;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.i(colorStateList0);
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.b;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.j(porterDuff$Mode0);
        }
    }

    @Override  // androidx.core.widget.TintableCheckedTextView
    @RestrictTo({Scope.c})
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList0) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper0 = this.a;
        if(appCompatCheckedTextViewHelper0 != null) {
            appCompatCheckedTextViewHelper0.f(colorStateList0);
        }
    }

    @Override  // androidx.core.widget.TintableCheckedTextView
    @RestrictTo({Scope.c})
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper0 = this.a;
        if(appCompatCheckedTextViewHelper0 != null) {
            appCompatCheckedTextViewHelper0.g(porterDuff$Mode0);
        }
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.c})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList0) {
        this.c.w(colorStateList0);
        this.c.b();
    }

    @Override  // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({Scope.c})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.c.x(porterDuff$Mode0);
        this.c.b();
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(@NonNull Context context0, int v) {
        super.setTextAppearance(context0, v);
        AppCompatTextHelper appCompatTextHelper0 = this.c;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.q(context0, v);
        }
    }
}

