package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.text.PrecomputedTextCompat.Params;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements EmojiCompatConfigurationView, TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView {
    interface SuperCaller {
        TextClassifier a();

        void b(@Px int arg1);

        void c(@Px int arg1);

        void d(int arg1, @FloatRange(from = 0.0) float arg2);

        void e(@Nullable TextClassifier arg1);

        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int arg1, int arg2, int arg3, int arg4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] arg1, int arg2);

        void setAutoSizeTextTypeWithDefaults(int arg1);
    }

    @RequiresApi(api = 26)
    class SuperCallerApi26 implements SuperCaller {
        final AppCompatTextView a;

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public TextClassifier a() {
            return AppCompatTextView.this.super.getTextClassifier();
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public void b(int v) {
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public void c(int v) {
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public void d(int v, float f) {
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public void e(@Nullable TextClassifier textClassifier0) {
            AppCompatTextView.this.super.setTextClassifier(textClassifier0);
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public int getAutoSizeMaxTextSize() {
            return AppCompatTextView.this.super.getAutoSizeMaxTextSize();
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.this.super.getAutoSizeMinTextSize();
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.this.super.getAutoSizeStepGranularity();
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public int[] getAutoSizeTextAvailableSizes() {
            return AppCompatTextView.this.super.getAutoSizeTextAvailableSizes();
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public int getAutoSizeTextType() {
            return AppCompatTextView.this.super.getAutoSizeTextType();
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public void setAutoSizeTextTypeUniformWithConfiguration(int v, int v1, int v2, int v3) {
            AppCompatTextView.this.super.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] arr_v, int v) {
            AppCompatTextView.this.super.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCaller
        public void setAutoSizeTextTypeWithDefaults(int v) {
            AppCompatTextView.this.super.setAutoSizeTextTypeWithDefaults(v);
        }
    }

    @RequiresApi(api = 28)
    class SuperCallerApi28 extends SuperCallerApi26 {
        final AppCompatTextView b;

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCallerApi26
        public void b(@Px int v) {
            AppCompatTextView.this.super.setFirstBaselineToTopHeight(v);
        }

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCallerApi26
        public void c(@Px int v) {
            AppCompatTextView.this.super.setLastBaselineToBottomHeight(v);
        }
    }

    @RequiresApi(api = 34)
    class SuperCallerApi34 extends SuperCallerApi28 {
        final AppCompatTextView c;

        @Override  // androidx.appcompat.widget.AppCompatTextView$SuperCallerApi26
        public void d(int v, float f) {
            AppCompatTextView.this.super.setLineHeight(v, f);
        }
    }

    private final AppCompatBackgroundHelper a;
    private final AppCompatTextHelper b;
    private final AppCompatTextClassifierHelper c;
    @NonNull
    private AppCompatEmojiTextHelper d;
    private boolean e;
    @Nullable
    private SuperCaller f;
    @Nullable
    private Future g;

    public AppCompatTextView(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0x1010084);
    }

    public AppCompatTextView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(TintContextWrapper.b(context0), attributeSet0, v);
        this.e = false;
        this.f = null;
        ThemeUtils.a(this, this.getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = new AppCompatBackgroundHelper(this);
        this.a = appCompatBackgroundHelper0;
        appCompatBackgroundHelper0.e(attributeSet0, v);
        AppCompatTextHelper appCompatTextHelper0 = new AppCompatTextHelper(this);
        this.b = appCompatTextHelper0;
        appCompatTextHelper0.m(attributeSet0, v);
        appCompatTextHelper0.b();
        this.c = new AppCompatTextClassifierHelper(this);
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

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.c})
    public int getAutoSizeMaxTextSize() {
        if(ViewUtils.d) {
            return this.getSuperCaller().getAutoSizeMaxTextSize();
        }
        return this.b == null ? -1 : this.b.e();
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.c})
    public int getAutoSizeMinTextSize() {
        if(ViewUtils.d) {
            return this.getSuperCaller().getAutoSizeMinTextSize();
        }
        return this.b == null ? -1 : this.b.f();
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.c})
    public int getAutoSizeStepGranularity() {
        if(ViewUtils.d) {
            return this.getSuperCaller().getAutoSizeStepGranularity();
        }
        return this.b == null ? -1 : this.b.g();
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.c})
    public int[] getAutoSizeTextAvailableSizes() {
        if(ViewUtils.d) {
            return this.getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        return this.b == null ? new int[0] : this.b.h();
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({Scope.c})
    public int getAutoSizeTextType() {
        if(ViewUtils.d) {
            return this.getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
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
        if(this.d == null) {
            this.d = new AppCompatEmojiTextHelper(this);
        }
        return this.d;
    }

    @Override  // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.i(this);
    }

    @Override  // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.j(this);
    }

    @RequiresApi(api = 26)
    @UiThread
    SuperCaller getSuperCaller() {
        if(this.f == null) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 34) {
                this.f = new SuperCallerApi34(this);
                return this.f;
            }
            if(v >= 28) {
                this.f = new SuperCallerApi28(this);
                return this.f;
            }
            if(v >= 26) {
                this.f = new SuperCallerApi26(this);
            }
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

    @Override  // android.widget.TextView
    public CharSequence getText() {
        this.u();
        return super.getText();
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

    @NonNull
    public Params getTextMetricsParamsCompat() {
        return TextViewCompat.o(this);
    }

    @Override  // android.widget.TextView
    public InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        this.b.r(this, inputConnection0, editorInfo0);
        return AppCompatHintHelper.a(inputConnection0, editorInfo0, this);
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33 && this.onCheckIsTextEditor()) {
            ((InputMethodManager)this.getContext().getSystemService("input_method")).isActive(this);
        }
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
    protected void onMeasure(int v, int v1) {
        this.u();
        super.onMeasure(v, v1);
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

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.c})
    public void setAutoSizeTextTypeUniformWithConfiguration(int v, int v1, int v2, int v3) throws IllegalArgumentException {
        if(ViewUtils.d) {
            this.getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
            return;
        }
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.t(v, v1, v2, v3);
        }
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.c})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] arr_v, int v) throws IllegalArgumentException {
        if(ViewUtils.d) {
            this.getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
            return;
        }
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.u(arr_v, v);
        }
    }

    @Override  // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    @RestrictTo({Scope.c})
    public void setAutoSizeTextTypeWithDefaults(int v) {
        if(ViewUtils.d) {
            this.getSuperCaller().setAutoSizeTextTypeWithDefaults(v);
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
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        Context context0 = this.getContext();
        Drawable drawable0 = null;
        Drawable drawable1 = v == 0 ? null : AppCompatResources.b(context0, v);
        Drawable drawable2 = v1 == 0 ? null : AppCompatResources.b(context0, v1);
        Drawable drawable3 = v2 == 0 ? null : AppCompatResources.b(context0, v2);
        if(v3 != 0) {
            drawable0 = AppCompatResources.b(context0, v3);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable0);
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.p();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.p();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        Context context0 = this.getContext();
        Drawable drawable0 = null;
        Drawable drawable1 = v == 0 ? null : AppCompatResources.b(context0, v);
        Drawable drawable2 = v1 == 0 ? null : AppCompatResources.b(context0, v1);
        Drawable drawable3 = v2 == 0 ? null : AppCompatResources.b(context0, v2);
        if(v3 != 0) {
            drawable0 = AppCompatResources.b(context0, v3);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable0);
        AppCompatTextHelper appCompatTextHelper0 = this.b;
        if(appCompatTextHelper0 != null) {
            appCompatTextHelper0.p();
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
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
        this.getEmojiTextViewHelper().e(z);
    }

    @Override  // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().a(arr_inputFilter));
    }

    @Override  // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange(from = 0L) @Px int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.getSuperCaller().b(v);
            return;
        }
        TextViewCompat.y(this, v);
    }

    @Override  // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange(from = 0L) @Px int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            this.getSuperCaller().c(v);
            return;
        }
        TextViewCompat.z(this, v);
    }

    @Override  // android.widget.TextView
    public void setLineHeight(@IntRange(from = 0L) @Px int v) {
        TextViewCompat.A(this, v);
    }

    @Override  // android.widget.TextView
    public void setLineHeight(int v, @FloatRange(from = 0.0) float f) {
        if(Build.VERSION.SDK_INT >= 34) {
            this.getSuperCaller().d(v, f);
            return;
        }
        TextViewCompat.B(this, v, f);
    }

    public void setPrecomputedText(@NonNull PrecomputedTextCompat precomputedTextCompat0) {
        TextViewCompat.C(this, precomputedTextCompat0);
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
        this.getSuperCaller().e(textClassifier0);
    }

    public void setTextFuture(@Nullable Future future0) {
        this.g = future0;
        if(future0 != null) {
            this.requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull Params precomputedTextCompat$Params0) {
        TextViewCompat.E(this, precomputedTextCompat$Params0);
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

    @Override  // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface0, int v) {
        if(this.e) {
            return;
        }
        Typeface typeface1 = typeface0 == null || v <= 0 ? null : TypefaceCompat.b(this.getContext(), typeface0, v);
        this.e = true;
        if(typeface1 != null) {
            typeface0 = typeface1;
        }
        try {
            super.setTypeface(typeface0, v);
            this.e = false;
        }
        catch(Throwable throwable0) {
            this.e = false;
            throw throwable0;
        }
    }

    private void u() {
        Future future0 = this.g;
        if(future0 != null) {
            try {
                this.g = null;
                TextViewCompat.C(this, ((PrecomputedTextCompat)future0.get()));
            }
            catch(InterruptedException | ExecutionException unused_ex) {
            }
        }
    }
}

