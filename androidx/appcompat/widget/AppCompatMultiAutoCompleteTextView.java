package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements EmojiCompatConfigurationView, TintableBackgroundView, TintableCompoundDrawablesView {
    private final AppCompatBackgroundHelper a;
    private final AppCompatTextHelper b;
    @NonNull
    private final AppCompatEmojiEditTextHelper c;
    private static final int[] d;

    static {
        AppCompatMultiAutoCompleteTextView.d = new int[]{0x1010176};
    }

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.b(context0), attributeSet0, v);
        ThemeUtils.a(this, this.getContext());
        TintTypedArray tintTypedArray0 = TintTypedArray.G(this.getContext(), attributeSet0, AppCompatMultiAutoCompleteTextView.d, v, 0);
        if(tintTypedArray0.C(0)) {
            this.setDropDownBackgroundDrawable(tintTypedArray0.h(0));
        }
        tintTypedArray0.I();
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = new AppCompatBackgroundHelper(this);
        this.a = appCompatBackgroundHelper0;
        appCompatBackgroundHelper0.e(attributeSet0, v);
        AppCompatTextHelper appCompatTextHelper0 = new AppCompatTextHelper(this);
        this.b = appCompatTextHelper0;
        appCompatTextHelper0.m(attributeSet0, v);
        appCompatTextHelper0.b();
        AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper0 = new AppCompatEmojiEditTextHelper(this);
        this.c = appCompatEmojiEditTextHelper0;
        appCompatEmojiEditTextHelper0.d(attributeSet0, v);
        this.b(appCompatEmojiEditTextHelper0);
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean a() {
        return this.c.c();
    }

    void b(AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper0) {
        KeyListener keyListener0 = this.getKeyListener();
        if(appCompatEmojiEditTextHelper0.b(keyListener0)) {
            boolean z = super.isFocusable();
            boolean z1 = super.isClickable();
            boolean z2 = super.isLongClickable();
            int v = super.getInputType();
            KeyListener keyListener1 = appCompatEmojiEditTextHelper0.a(keyListener0);
            if(keyListener1 == keyListener0) {
                return;
            }
            super.setKeyListener(keyListener1);
            super.setRawInputType(v);
            super.setFocusable(z);
            super.setClickable(z1);
            super.setLongClickable(z2);
        }
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
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = AppCompatHintHelper.a(super.onCreateInputConnection(editorInfo0), editorInfo0, this);
        return this.c.e(inputConnection0, editorInfo0);
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

    @Override  // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int v) {
        this.setDropDownBackgroundDrawable(AppCompatResources.b(this.getContext(), v));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.c.f(z);
    }

    @Override  // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener0) {
        super.setKeyListener(this.c.a(keyListener0));
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
}

