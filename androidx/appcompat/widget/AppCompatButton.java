package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatButton extends Button implements EmojiCompatConfigurationView, TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView {
    private final AppCompatBackgroundHelper a;
    private final AppCompatTextHelper b;
    @NonNull
    private AppCompatEmojiTextHelper c;

    public AppCompatButton(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.buttonStyle);
    }

    public AppCompatButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.b(context0), attributeSet0, v);
        ThemeUtils.a(this, this.getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = new AppCompatBackgroundHelper(this);
        this.a = appCompatBackgroundHelper0;
        appCompatBackgroundHelper0.e(attributeSet0, v);
        AppCompatTextHelper appCompatTextHelper0 = new AppCompatTextHelper(this);
        this.b = appCompatTextHelper0;
        appCompatTextHelper0.m(attributeSet0, v);
        appCompatTextHelper0.b();
        this.getEmojiTextViewHelper().c(attributeSet0, v);
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean a() {
        return this.getEmojiTextViewHelper().b();
    }

    @Override  // android.widget.TextView
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

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.c})
    public int getAutoSizeMaxTextSize() {
        if(ViewUtils.d) {
            return super.getAutoSizeMaxTextSize();
        }
        return this.b == null ? -1 : this.b.e();
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.c})
    public int getAutoSizeMinTextSize() {
        if(ViewUtils.d) {
            return super.getAutoSizeMinTextSize();
        }
        return this.b == null ? -1 : this.b.f();
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.c})
    public int getAutoSizeStepGranularity() {
        if(ViewUtils.d) {
            return super.getAutoSizeStepGranularity();
        }
        return this.b == null ? -1 : this.b.g();
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.c})
    public int[] getAutoSizeTextAvailableSizes() {
        if(ViewUtils.d) {
            return super.getAutoSizeTextAvailableSizes();
        }
        return this.b == null ? new int[0] : this.b.h();
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({Scope.c})
    public int getAutoSizeTextType() {
        if(ViewUtils.d) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        return this.b == null ? 0 : this.b.i();
    }

    @Override  // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.F(super.getCustomSelectionActionModeCallback());
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

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("android.widget.Button");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.Button");
    }

    @Override  // android.widget.TextView
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.o(z, v, v1, v2, v3);
        }
    }

    @Override  // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        if(this.b != null && !ViewUtils.d && this.b.l()) {
            this.b.c();
        }
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().d(z);
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.c})
    public void setAutoSizeTextTypeUniformWithConfiguration(int v, int v1, int v2, int v3) throws IllegalArgumentException {
        if(ViewUtils.d) {
            super.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
            return;
        }
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.t(v, v1, v2, v3);
        }
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.c})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] arr_v, int v) throws IllegalArgumentException {
        if(ViewUtils.d) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
            return;
        }
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.u(arr_v, v);
        }
    }

    @Override  // androidx.core.widget.AutoSizeableTextView, android.widget.TextView
    @RestrictTo({Scope.c})
    public void setAutoSizeTextTypeWithDefaults(int v) {
        if(ViewUtils.d) {
            super.setAutoSizeTextTypeWithDefaults(v);
            return;
        }
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.v(v);
        }
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

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.G(this, actionMode$Callback0));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().e(z);
    }

    @Override  // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().a(arr_inputFilter));
    }

    public void setSupportAllCaps(boolean z) {
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.s(z);
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

    @Override  // android.widget.TextView
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.q(context0, v);
        }
    }

    @Override  // android.widget.TextView
    public void setTextSize(int v, float f) {
        if(ViewUtils.d) {
            super.setTextSize(v, f);
            return;
        }
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.A(v, f);
        }
    }
}

