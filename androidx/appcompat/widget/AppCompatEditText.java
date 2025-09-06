package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.R.attr;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;

public class AppCompatEditText extends EditText implements EmojiCompatConfigurationView, OnReceiveContentViewBehavior, TintableBackgroundView, TintableCompoundDrawablesView {
    @RequiresApi(api = 26)
    class SuperCaller {
        final AppCompatEditText a;

        @Nullable
        public TextClassifier a() {
            return AppCompatEditText.this.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier0) {
            AppCompatEditText.this.super.setTextClassifier(textClassifier0);
        }
    }

    private final AppCompatBackgroundHelper a;
    private final AppCompatTextHelper b;
    private final AppCompatTextClassifierHelper c;
    private final TextViewOnReceiveContentListener d;
    @NonNull
    private final AppCompatEmojiEditTextHelper e;
    @Nullable
    private SuperCaller f;

    public AppCompatEditText(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatEditText(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.editTextStyle);
    }

    public AppCompatEditText(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.b(context0), attributeSet0, v);
        ThemeUtils.a(this, this.getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = new AppCompatBackgroundHelper(this);
        this.a = appCompatBackgroundHelper0;
        appCompatBackgroundHelper0.e(attributeSet0, v);
        AppCompatTextHelper appCompatTextHelper0 = new AppCompatTextHelper(this);
        this.b = appCompatTextHelper0;
        appCompatTextHelper0.m(attributeSet0, v);
        appCompatTextHelper0.b();
        this.c = new AppCompatTextClassifierHelper(this);
        this.d = new TextViewOnReceiveContentListener();
        AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper0 = new AppCompatEmojiEditTextHelper(this);
        this.e = appCompatEmojiEditTextHelper0;
        appCompatEmojiEditTextHelper0.d(attributeSet0, v);
        this.e(appCompatEmojiEditTextHelper0);
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean a() {
        return this.e.c();
    }

    @Override  // androidx.core.view.OnReceiveContentViewBehavior
    @Nullable
    public ContentInfoCompat b(@NonNull ContentInfoCompat contentInfoCompat0) {
        return this.d.a(this, contentInfoCompat0);
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

    void e(AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper0) {
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
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.F(super.getCustomSelectionActionModeCallback());
    }

    @NonNull
    @RequiresApi(26)
    @UiThread
    private SuperCaller getSuperCaller() {
        if(this.f == null) {
            this.f = new SuperCaller(this);
        }
        return this.f;
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

    @Override  // android.widget.EditText
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT < 28 ? super.getEditableText() : super.getText();
    }

    @Override  // android.widget.EditText
    @Nullable
    public CharSequence getText() {
        return this.getText();
    }

    @Override  // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        if(Build.VERSION.SDK_INT < 28) {
            return this.c == null ? this.getSuperCaller().a() : this.c.a();
        }
        return this.getSuperCaller().a();
    }

    @Override  // android.widget.TextView
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        this.b.r(this, inputConnection0, editorInfo0);
        InputConnection inputConnection1 = AppCompatHintHelper.a(inputConnection0, editorInfo0, this);
        if(inputConnection1 != null && Build.VERSION.SDK_INT <= 30) {
            String[] arr_s = ViewCompat.m0(this);
            if(arr_s != null) {
                EditorInfoCompat.i(editorInfo0, arr_s);
                inputConnection1 = InputConnectionCompat.d(this, inputConnection1, editorInfo0);
            }
        }
        return this.e.e(inputConnection1, editorInfo0);
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager)this.getContext().getSystemService("input_method")).isActive(this);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.TextView
    public boolean onDragEvent(DragEvent dragEvent0) {
        return AppCompatReceiveContentHelper.a(this, dragEvent0) ? true : super.onDragEvent(dragEvent0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.EditText
    public boolean onTextContextMenuItem(int v) {
        return AppCompatReceiveContentHelper.b(this, v) ? true : super.onTextContextMenuItem(v);
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

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.G(this, actionMode$Callback0));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.e.f(z);
    }

    @Override  // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener0) {
        super.setKeyListener(this.e.a(keyListener0));
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
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier0) {
        if(Build.VERSION.SDK_INT < 28) {
            AppCompatTextClassifierHelper appCompatTextClassifierHelper0 = this.c;
            if(appCompatTextClassifierHelper0 != null) {
                appCompatTextClassifierHelper0.b(textClassifier0);
                return;
            }
        }
        this.getSuperCaller().b(textClassifier0);
    }
}

