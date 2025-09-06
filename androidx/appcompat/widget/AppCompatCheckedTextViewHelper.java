package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CheckedTextViewCompat;

@RestrictTo({Scope.a})
class AppCompatCheckedTextViewHelper {
    @NonNull
    private final CheckedTextView a;
    private ColorStateList b;
    private PorterDuff.Mode c;
    private boolean d;
    private boolean e;
    private boolean f;

    AppCompatCheckedTextViewHelper(@NonNull CheckedTextView checkedTextView0) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.a = checkedTextView0;
    }

    void a() {
        Drawable drawable0 = CheckedTextViewCompat.a(this.a);
        if(drawable0 != null && (this.d || this.e)) {
            Drawable drawable1 = DrawableCompat.r(drawable0).mutate();
            if(this.d) {
                DrawableCompat.o(drawable1, this.b);
            }
            if(this.e) {
                DrawableCompat.p(drawable1, this.c);
            }
            if(drawable1.isStateful()) {
                drawable1.setState(this.a.getDrawableState());
            }
            this.a.setCheckMarkDrawable(drawable1);
        }
    }

    ColorStateList b() {
        return this.b;
    }

    PorterDuff.Mode c() {
        return this.c;
    }

    void d(@Nullable AttributeSet attributeSet0, int v) {
        TintTypedArray tintTypedArray0 = TintTypedArray.G(this.a.getContext(), attributeSet0, styleable.CheckedTextView, v, 0);
        Context context0 = this.a.getContext();
        ViewCompat.H1(this.a, context0, styleable.CheckedTextView, attributeSet0, tintTypedArray0.B(), v, 0);
        try {
            if(tintTypedArray0.C(styleable.CheckedTextView_checkMarkCompat)) {
                int v2 = tintTypedArray0.u(1, 0);
                if(v2 != 0) {
                    try {
                        Drawable drawable0 = AppCompatResources.b(this.a.getContext(), v2);
                        this.a.setCheckMarkDrawable(drawable0);
                        goto label_15;
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
                goto label_10;
            }
            else {
            label_10:
                if(tintTypedArray0.C(styleable.CheckedTextView_android_checkMark)) {
                    int v3 = tintTypedArray0.u(0, 0);
                    if(v3 != 0) {
                        Drawable drawable1 = AppCompatResources.b(this.a.getContext(), v3);
                        this.a.setCheckMarkDrawable(drawable1);
                    }
                }
            }
        label_15:
            if(tintTypedArray0.C(styleable.CheckedTextView_checkMarkTint)) {
                ColorStateList colorStateList0 = tintTypedArray0.d(2);
                CheckedTextViewCompat.d(this.a, colorStateList0);
            }
            if(tintTypedArray0.C(styleable.CheckedTextView_checkMarkTintMode)) {
                PorterDuff.Mode porterDuff$Mode0 = DrawableUtils.e(tintTypedArray0.o(3, -1), null);
                CheckedTextViewCompat.e(this.a, porterDuff$Mode0);
            }
        }
        finally {
            tintTypedArray0.I();
        }
    }

    void e() {
        if(this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        this.a();
    }

    void f(ColorStateList colorStateList0) {
        this.b = colorStateList0;
        this.d = true;
        this.a();
    }

    void g(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.c = porterDuff$Mode0;
        this.e = true;
        this.a();
    }
}

