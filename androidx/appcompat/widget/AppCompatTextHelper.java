package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

class AppCompatTextHelper {
    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static Locale a(String s) {
            return Locale.forLanguageTag(s);
        }
    }

    @RequiresApi(24)
    static class Api24Impl {
        @DoNotInline
        static LocaleList a(String s) {
            return LocaleList.forLanguageTags(s);
        }

        @DoNotInline
        static void b(TextView textView0, LocaleList localeList0) {
            textView0.setTextLocales(localeList0);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        @DoNotInline
        static int a(TextView textView0) {
            return textView0.getAutoSizeStepGranularity();
        }

        @DoNotInline
        static void b(TextView textView0, int v, int v1, int v2, int v3) {
            textView0.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
        }

        @DoNotInline
        static void c(TextView textView0, int[] arr_v, int v) {
            textView0.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
        }

        @DoNotInline
        static boolean d(TextView textView0, String s) {
            return textView0.setFontVariationSettings(s);
        }
    }

    @RequiresApi(28)
    static class Api28Impl {
        @DoNotInline
        static Typeface a(Typeface typeface0, int v, boolean z) {
            return Typeface.create(typeface0, v, z);
        }
    }

    @NonNull
    private final TextView a;
    private TintInfo b;
    private TintInfo c;
    private TintInfo d;
    private TintInfo e;
    private TintInfo f;
    private TintInfo g;
    private TintInfo h;
    @NonNull
    private final AppCompatTextViewAutoSizeHelper i;
    private int j;
    private int k;
    private Typeface l;
    private boolean m;
    private static final int n = -1;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;

    AppCompatTextHelper(@NonNull TextView textView0) {
        this.j = 0;
        this.k = -1;
        this.a = textView0;
        this.i = new AppCompatTextViewAutoSizeHelper(textView0);
    }

    @RestrictTo({Scope.c})
    void A(int v, float f) {
        if(!ViewUtils.d && !this.l()) {
            this.B(v, f);
        }
    }

    private void B(int v, float f) {
        this.i.t(v, f);
    }

    private void C(Context context0, TintTypedArray tintTypedArray0) {
        this.j = tintTypedArray0.o(styleable.TextAppearance_android_textStyle, this.j);
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            int v1 = tintTypedArray0.o(styleable.TextAppearance_android_textFontWeight, -1);
            this.k = v1;
            if(v1 != -1) {
                this.j &= 2;
            }
        }
        int v2 = styleable.TextAppearance_android_fontFamily;
        boolean z = true;
        if(!tintTypedArray0.C(v2) && !tintTypedArray0.C(styleable.TextAppearance_fontFamily)) {
            if(tintTypedArray0.C(styleable.TextAppearance_android_typeface)) {
                this.m = false;
                int v3 = tintTypedArray0.o(1, 1);
                switch(v3) {
                    case 1: {
                        this.l = Typeface.SANS_SERIF;
                        break;
                    }
                    case 2: {
                        this.l = Typeface.SERIF;
                        return;
                    label_17:
                        if(v3 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        break;
                    }
                    default: {
                        goto label_17;
                    }
                }
            }
            return;
        }
        this.l = null;
        if(tintTypedArray0.C(styleable.TextAppearance_fontFamily)) {
            v2 = 12;
        }
        int v4 = this.k;
        int v5 = this.j;
        if(!context0.isRestricted()) {
            androidx.appcompat.widget.AppCompatTextHelper.1 appCompatTextHelper$10 = new FontCallback() {
                final AppCompatTextHelper d;

                @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
                public void h(int v) {
                }

                @Override  // androidx.core.content.res.ResourcesCompat$FontCallback
                public void i(@NonNull Typeface typeface0) {
                    if(Build.VERSION.SDK_INT >= 28) {
                        int v = v4;
                        if(v != -1) {
                            typeface0 = Api28Impl.a(typeface0, v, (v5 & 2) != 0);
                        }
                    }
                    AppCompatTextHelper.this.n(new WeakReference(this.a), typeface0);
                }
            };
            try {
                Typeface typeface0 = tintTypedArray0.k(v2, this.j, appCompatTextHelper$10);
                if(typeface0 != null) {
                    this.l = v < 28 || this.k == -1 ? typeface0 : Api28Impl.a(Typeface.create(typeface0, 0), this.k, (this.j & 2) != 0);
                }
                this.m = this.l == null;
            }
            catch(UnsupportedOperationException | Resources.NotFoundException unused_ex) {
            }
        }
        if(this.l == null) {
            String s = tintTypedArray0.w(v2);
            if(s != null) {
                if(Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                    Typeface typeface1 = Typeface.create(s, 0);
                    int v6 = this.k;
                    if((this.j & 2) == 0) {
                        z = false;
                    }
                    this.l = Api28Impl.a(typeface1, v6, z);
                    return;
                }
                this.l = Typeface.create(s, this.j);
            }
        }
    }

    private void a(Drawable drawable0, TintInfo tintInfo0) {
        if(drawable0 != null && tintInfo0 != null) {
            AppCompatDrawableManager.j(drawable0, tintInfo0, this.a.getDrawableState());
        }
    }

    void b() {
        if(this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] arr_drawable = this.a.getCompoundDrawables();
            this.a(arr_drawable[0], this.b);
            this.a(arr_drawable[1], this.c);
            this.a(arr_drawable[2], this.d);
            this.a(arr_drawable[3], this.e);
        }
        if(this.f != null || this.g != null) {
            Drawable[] arr_drawable1 = this.a.getCompoundDrawablesRelative();
            this.a(arr_drawable1[0], this.f);
            this.a(arr_drawable1[2], this.g);
        }
    }

    @RestrictTo({Scope.c})
    void c() {
        this.i.a();
    }

    private static TintInfo d(Context context0, AppCompatDrawableManager appCompatDrawableManager0, int v) {
        ColorStateList colorStateList0 = appCompatDrawableManager0.f(context0, v);
        if(colorStateList0 != null) {
            TintInfo tintInfo0 = new TintInfo();
            tintInfo0.d = true;
            tintInfo0.a = colorStateList0;
            return tintInfo0;
        }
        return null;
    }

    int e() {
        return this.i.f();
    }

    int f() {
        return this.i.g();
    }

    int g() {
        return this.i.h();
    }

    int[] h() {
        return this.i.i();
    }

    int i() {
        return this.i.j();
    }

    @Nullable
    ColorStateList j() {
        return this.h == null ? null : this.h.a;
    }

    @Nullable
    PorterDuff.Mode k() {
        return this.h == null ? null : this.h.b;
    }

    @RestrictTo({Scope.c})
    boolean l() {
        return this.i.n();
    }

    @SuppressLint({"NewApi"})
    void m(@Nullable AttributeSet attributeSet0, int v) {
        int v15;
        float f;
        int v4;
        String s1;
        String s;
        ColorStateList colorStateList2;
        ColorStateList colorStateList1;
        ColorStateList colorStateList0;
        int v2;
        boolean z;
        Context context0 = this.a.getContext();
        AppCompatDrawableManager appCompatDrawableManager0 = AppCompatDrawableManager.b();
        TintTypedArray tintTypedArray0 = TintTypedArray.G(context0, attributeSet0, styleable.AppCompatTextHelper, v, 0);
        Context context1 = this.a.getContext();
        ViewCompat.H1(this.a, context1, styleable.AppCompatTextHelper, attributeSet0, tintTypedArray0.B(), v, 0);
        int v1 = tintTypedArray0.u(styleable.AppCompatTextHelper_android_textAppearance, -1);
        if(tintTypedArray0.C(styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.b = AppCompatTextHelper.d(context0, appCompatDrawableManager0, tintTypedArray0.u(3, 0));
        }
        if(tintTypedArray0.C(styleable.AppCompatTextHelper_android_drawableTop)) {
            this.c = AppCompatTextHelper.d(context0, appCompatDrawableManager0, tintTypedArray0.u(1, 0));
        }
        if(tintTypedArray0.C(styleable.AppCompatTextHelper_android_drawableRight)) {
            this.d = AppCompatTextHelper.d(context0, appCompatDrawableManager0, tintTypedArray0.u(4, 0));
        }
        if(tintTypedArray0.C(styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.e = AppCompatTextHelper.d(context0, appCompatDrawableManager0, tintTypedArray0.u(2, 0));
        }
        if(tintTypedArray0.C(styleable.AppCompatTextHelper_android_drawableStart)) {
            this.f = AppCompatTextHelper.d(context0, appCompatDrawableManager0, tintTypedArray0.u(5, 0));
        }
        if(tintTypedArray0.C(styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.g = AppCompatTextHelper.d(context0, appCompatDrawableManager0, tintTypedArray0.u(6, 0));
        }
        tintTypedArray0.I();
        TransformationMethod transformationMethod0 = this.a.getTransformationMethod();
        if(v1 == -1) {
            s = null;
            colorStateList0 = null;
            z = false;
            v2 = 0;
            colorStateList1 = null;
            colorStateList2 = null;
            s1 = null;
        }
        else {
            TintTypedArray tintTypedArray1 = TintTypedArray.E(context0, v1, styleable.TextAppearance);
            if(transformationMethod0 instanceof PasswordTransformationMethod || !tintTypedArray1.C(styleable.TextAppearance_textAllCaps)) {
                z = false;
                v2 = 0;
            }
            else {
                z = tintTypedArray1.a(14, false);
                v2 = 1;
            }
            this.C(context0, tintTypedArray1);
            int v3 = Build.VERSION.SDK_INT;
            if(v3 < 23) {
                colorStateList0 = tintTypedArray1.C(styleable.TextAppearance_android_textColor) ? tintTypedArray1.d(3) : null;
                colorStateList1 = tintTypedArray1.C(styleable.TextAppearance_android_textColorHint) ? tintTypedArray1.d(4) : null;
                colorStateList2 = tintTypedArray1.C(styleable.TextAppearance_android_textColorLink) ? tintTypedArray1.d(5) : null;
            }
            else {
                colorStateList0 = null;
                colorStateList1 = null;
                colorStateList2 = null;
            }
            s = tintTypedArray1.C(styleable.TextAppearance_textLocale) ? tintTypedArray1.w(15) : null;
            s1 = v3 < 26 || !tintTypedArray1.C(styleable.TextAppearance_fontVariationSettings) ? null : tintTypedArray1.w(13);
            tintTypedArray1.I();
        }
        TintTypedArray tintTypedArray2 = TintTypedArray.G(context0, attributeSet0, styleable.TextAppearance, v, 0);
        if(transformationMethod0 instanceof PasswordTransformationMethod || !tintTypedArray2.C(styleable.TextAppearance_textAllCaps)) {
            v4 = v2;
        }
        else {
            z = tintTypedArray2.a(14, false);
            v4 = 1;
        }
        int v5 = Build.VERSION.SDK_INT;
        if(v5 < 23) {
            if(tintTypedArray2.C(styleable.TextAppearance_android_textColor)) {
                colorStateList0 = tintTypedArray2.d(3);
            }
            if(tintTypedArray2.C(styleable.TextAppearance_android_textColorHint)) {
                colorStateList1 = tintTypedArray2.d(4);
            }
            if(tintTypedArray2.C(styleable.TextAppearance_android_textColorLink)) {
                colorStateList2 = tintTypedArray2.d(5);
            }
        }
        if(tintTypedArray2.C(styleable.TextAppearance_textLocale)) {
            s = tintTypedArray2.w(15);
        }
        if(v5 >= 26 && tintTypedArray2.C(styleable.TextAppearance_fontVariationSettings)) {
            s1 = tintTypedArray2.w(13);
        }
        if(v5 >= 28 && tintTypedArray2.C(styleable.TextAppearance_android_textSize) && tintTypedArray2.g(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.C(context0, tintTypedArray2);
        tintTypedArray2.I();
        if(colorStateList0 != null) {
            this.a.setTextColor(colorStateList0);
        }
        if(colorStateList1 != null) {
            this.a.setHintTextColor(colorStateList1);
        }
        if(colorStateList2 != null) {
            this.a.setLinkTextColor(colorStateList2);
        }
        if(!(transformationMethod0 instanceof PasswordTransformationMethod) && v4 != 0) {
            this.s(z);
        }
        Typeface typeface0 = this.l;
        if(typeface0 != null) {
            if(this.k == -1) {
                this.a.setTypeface(typeface0, this.j);
            }
            else {
                this.a.setTypeface(typeface0);
            }
        }
        if(s1 != null) {
            Api26Impl.d(this.a, s1);
        }
        if(s != null) {
            if(v5 >= 24) {
                LocaleList localeList0 = Api24Impl.a(s);
                Api24Impl.b(this.a, localeList0);
            }
            else {
                Locale locale0 = Api21Impl.a(s.split(",")[0]);
                this.a.setTextLocale(locale0);
            }
        }
        this.i.o(attributeSet0, v);
        if(ViewUtils.d && this.i.j() != 0) {
            int[] arr_v = this.i.i();
            if(arr_v.length > 0) {
                if(((float)Api26Impl.a(this.a)) == -1.0f) {
                    Api26Impl.c(this.a, arr_v, 0);
                }
                else {
                    Api26Impl.b(this.a, this.i.g(), this.i.f(), this.i.h(), 0);
                }
            }
        }
        TintTypedArray tintTypedArray3 = TintTypedArray.F(context0, attributeSet0, styleable.AppCompatTextView);
        int v6 = tintTypedArray3.u(styleable.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawable0 = v6 == -1 ? null : appCompatDrawableManager0.c(context0, v6);
        int v7 = tintTypedArray3.u(styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawable1 = v7 == -1 ? null : appCompatDrawableManager0.c(context0, v7);
        int v8 = tintTypedArray3.u(styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawable2 = v8 == -1 ? null : appCompatDrawableManager0.c(context0, v8);
        int v9 = tintTypedArray3.u(styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawable3 = v9 == -1 ? null : appCompatDrawableManager0.c(context0, v9);
        int v10 = tintTypedArray3.u(styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawable4 = v10 == -1 ? null : appCompatDrawableManager0.c(context0, v10);
        int v11 = tintTypedArray3.u(styleable.AppCompatTextView_drawableEndCompat, -1);
        this.y(drawable0, drawable1, drawable2, drawable3, drawable4, (v11 == -1 ? null : appCompatDrawableManager0.c(context0, v11)));
        if(tintTypedArray3.C(styleable.AppCompatTextView_drawableTint)) {
            ColorStateList colorStateList3 = tintTypedArray3.d(11);
            TextViewCompat.s(this.a, colorStateList3);
        }
        if(tintTypedArray3.C(styleable.AppCompatTextView_drawableTintMode)) {
            PorterDuff.Mode porterDuff$Mode0 = DrawableUtils.e(tintTypedArray3.o(12, -1), null);
            TextViewCompat.t(this.a, porterDuff$Mode0);
        }
        int v12 = tintTypedArray3.g(styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int v13 = tintTypedArray3.g(styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        if(tintTypedArray3.C(styleable.AppCompatTextView_lineHeight)) {
            TypedValue typedValue0 = tintTypedArray3.H(19);
            if(typedValue0 == null || typedValue0.type != 5) {
                f = (float)tintTypedArray3.g(19, -1);
                v15 = -1;
            }
            else {
                int v14 = typedValue0.data & 15;
                f = TypedValue.complexToFloat(typedValue0.data);
                v15 = v14;
            }
        }
        else {
            f = -1.0f;
            v15 = -1;
        }
        tintTypedArray3.I();
        if(v12 != -1) {
            TextViewCompat.y(this.a, v12);
        }
        if(v13 != -1) {
            TextViewCompat.z(this.a, v13);
        }
        if(f != -1.0f) {
            if(v15 == -1) {
                TextViewCompat.A(this.a, ((int)f));
                return;
            }
            TextViewCompat.B(this.a, v15, f);
        }
    }

    void n(WeakReference weakReference0, Typeface typeface0) {
        if(this.m) {
            this.l = typeface0;
            TextView textView0 = (TextView)weakReference0.get();
            if(textView0 != null) {
                if(textView0.isAttachedToWindow()) {
                    textView0.post(new Runnable() {
                        final AppCompatTextHelper d;

                        @Override
                        public void run() {
                            textView0.setTypeface(typeface0, this.j);
                        }
                    });
                    return;
                }
                textView0.setTypeface(typeface0, this.j);
            }
        }
    }

    @RestrictTo({Scope.c})
    void o(boolean z, int v, int v1, int v2, int v3) {
        if(!ViewUtils.d) {
            this.c();
        }
    }

    void p() {
        this.b();
    }

    void q(Context context0, int v) {
        TintTypedArray tintTypedArray0 = TintTypedArray.E(context0, v, styleable.TextAppearance);
        if(tintTypedArray0.C(styleable.TextAppearance_textAllCaps)) {
            this.s(tintTypedArray0.a(14, false));
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 < 23) {
            if(tintTypedArray0.C(styleable.TextAppearance_android_textColor)) {
                ColorStateList colorStateList0 = tintTypedArray0.d(3);
                if(colorStateList0 != null) {
                    this.a.setTextColor(colorStateList0);
                }
            }
            if(tintTypedArray0.C(styleable.TextAppearance_android_textColorLink)) {
                ColorStateList colorStateList1 = tintTypedArray0.d(5);
                if(colorStateList1 != null) {
                    this.a.setLinkTextColor(colorStateList1);
                }
            }
            if(tintTypedArray0.C(styleable.TextAppearance_android_textColorHint)) {
                ColorStateList colorStateList2 = tintTypedArray0.d(4);
                if(colorStateList2 != null) {
                    this.a.setHintTextColor(colorStateList2);
                }
            }
        }
        if(tintTypedArray0.C(styleable.TextAppearance_android_textSize) && tintTypedArray0.g(0, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        this.C(context0, tintTypedArray0);
        if(v1 >= 26 && tintTypedArray0.C(styleable.TextAppearance_fontVariationSettings)) {
            String s = tintTypedArray0.w(13);
            if(s != null) {
                Api26Impl.d(this.a, s);
            }
        }
        tintTypedArray0.I();
        Typeface typeface0 = this.l;
        if(typeface0 != null) {
            this.a.setTypeface(typeface0, this.j);
        }
    }

    void r(@NonNull TextView textView0, @Nullable InputConnection inputConnection0, @NonNull EditorInfo editorInfo0) {
        if(Build.VERSION.SDK_INT < 30 && inputConnection0 != null) {
            EditorInfoCompat.k(editorInfo0, textView0.getText());
        }
    }

    void s(boolean z) {
        this.a.setAllCaps(z);
    }

    void t(int v, int v1, int v2, int v3) throws IllegalArgumentException {
        this.i.p(v, v1, v2, v3);
    }

    void u(@NonNull int[] arr_v, int v) throws IllegalArgumentException {
        this.i.q(arr_v, v);
    }

    void v(int v) {
        this.i.r(v);
    }

    void w(@Nullable ColorStateList colorStateList0) {
        if(this.h == null) {
            this.h = new TintInfo();
        }
        this.h.a = colorStateList0;
        this.h.d = colorStateList0 != null;
        this.z();
    }

    void x(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.h == null) {
            this.h = new TintInfo();
        }
        this.h.b = porterDuff$Mode0;
        this.h.c = porterDuff$Mode0 != null;
        this.z();
    }

    private void y(Drawable drawable0, Drawable drawable1, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5) {
        if(drawable4 != null || drawable5 != null) {
            Drawable[] arr_drawable2 = this.a.getCompoundDrawablesRelative();
            if(drawable4 == null) {
                drawable4 = arr_drawable2[0];
            }
            if(drawable1 == null) {
                drawable1 = arr_drawable2[1];
            }
            if(drawable5 == null) {
                drawable5 = arr_drawable2[2];
            }
            TextView textView1 = this.a;
            if(drawable3 == null) {
                drawable3 = arr_drawable2[3];
            }
            textView1.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable4, drawable1, drawable5, drawable3);
        }
        else if(drawable0 != null || drawable1 != null || drawable2 != null || drawable3 != null) {
            Drawable[] arr_drawable = this.a.getCompoundDrawablesRelative();
            Drawable drawable6 = arr_drawable[0];
            if(drawable6 == null && arr_drawable[2] == null) {
                Drawable[] arr_drawable1 = this.a.getCompoundDrawables();
                TextView textView0 = this.a;
                if(drawable0 == null) {
                    drawable0 = arr_drawable1[0];
                }
                if(drawable1 == null) {
                    drawable1 = arr_drawable1[1];
                }
                if(drawable2 == null) {
                    drawable2 = arr_drawable1[2];
                }
                if(drawable3 == null) {
                    drawable3 = arr_drawable1[3];
                }
                textView0.setCompoundDrawablesWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
                return;
            }
            if(drawable1 == null) {
                drawable1 = arr_drawable[1];
            }
            if(drawable3 == null) {
                drawable3 = arr_drawable[3];
            }
            this.a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable6, drawable1, arr_drawable[2], drawable3);
        }
    }

    private void z() {
        this.b = this.h;
        this.c = this.h;
        this.d = this.h;
        this.e = this.h;
        this.f = this.h;
        this.g = this.h;
    }
}

