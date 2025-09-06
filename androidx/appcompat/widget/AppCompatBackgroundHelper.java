package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;

class AppCompatBackgroundHelper {
    @NonNull
    private final View a;
    private final AppCompatDrawableManager b;
    private int c;
    private TintInfo d;
    private TintInfo e;
    private TintInfo f;

    AppCompatBackgroundHelper(@NonNull View view0) {
        this.c = -1;
        this.a = view0;
        this.b = AppCompatDrawableManager.b();
    }

    private boolean a(@NonNull Drawable drawable0) {
        if(this.f == null) {
            this.f = new TintInfo();
        }
        TintInfo tintInfo0 = this.f;
        tintInfo0.a();
        ColorStateList colorStateList0 = ViewCompat.Q(this.a);
        if(colorStateList0 != null) {
            tintInfo0.d = true;
            tintInfo0.a = colorStateList0;
        }
        PorterDuff.Mode porterDuff$Mode0 = ViewCompat.R(this.a);
        if(porterDuff$Mode0 != null) {
            tintInfo0.c = true;
            tintInfo0.b = porterDuff$Mode0;
        }
        if(!tintInfo0.d && !tintInfo0.c) {
            return false;
        }
        AppCompatDrawableManager.j(drawable0, tintInfo0, this.a.getDrawableState());
        return true;
    }

    void b() {
        Drawable drawable0 = this.a.getBackground();
        if(drawable0 == null || this.k() && this.a(drawable0)) {
            return;
        }
        TintInfo tintInfo0 = this.e;
        if(tintInfo0 != null) {
            AppCompatDrawableManager.j(drawable0, tintInfo0, this.a.getDrawableState());
            return;
        }
        TintInfo tintInfo1 = this.d;
        if(tintInfo1 != null) {
            AppCompatDrawableManager.j(drawable0, tintInfo1, this.a.getDrawableState());
        }
    }

    ColorStateList c() {
        return this.e == null ? null : this.e.a;
    }

    PorterDuff.Mode d() {
        return this.e == null ? null : this.e.b;
    }

    void e(@Nullable AttributeSet attributeSet0, int v) {
        TintTypedArray tintTypedArray0 = TintTypedArray.G(this.a.getContext(), attributeSet0, styleable.ViewBackgroundHelper, v, 0);
        Context context0 = this.a.getContext();
        ViewCompat.H1(this.a, context0, styleable.ViewBackgroundHelper, attributeSet0, tintTypedArray0.B(), v, 0);
        try {
            if(tintTypedArray0.C(styleable.ViewBackgroundHelper_android_background)) {
                this.c = tintTypedArray0.u(0, -1);
                Context context1 = this.a.getContext();
                ColorStateList colorStateList0 = this.b.f(context1, this.c);
                if(colorStateList0 != null) {
                    this.h(colorStateList0);
                }
            }
            if(tintTypedArray0.C(styleable.ViewBackgroundHelper_backgroundTint)) {
                ColorStateList colorStateList1 = tintTypedArray0.d(1);
                ViewCompat.S1(this.a, colorStateList1);
            }
            if(tintTypedArray0.C(styleable.ViewBackgroundHelper_backgroundTintMode)) {
                PorterDuff.Mode porterDuff$Mode0 = DrawableUtils.e(tintTypedArray0.o(2, -1), null);
                ViewCompat.T1(this.a, porterDuff$Mode0);
            }
        }
        finally {
            tintTypedArray0.I();
        }
    }

    void f(Drawable drawable0) {
        this.c = -1;
        this.h(null);
        this.b();
    }

    void g(int v) {
        this.c = v;
        this.h((this.b == null ? null : this.b.f(this.a.getContext(), v)));
        this.b();
    }

    void h(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            this.d = null;
        }
        else {
            if(this.d == null) {
                this.d = new TintInfo();
            }
            this.d.a = colorStateList0;
            this.d.d = true;
        }
        this.b();
    }

    void i(ColorStateList colorStateList0) {
        if(this.e == null) {
            this.e = new TintInfo();
        }
        this.e.a = colorStateList0;
        this.e.d = true;
        this.b();
    }

    void j(PorterDuff.Mode porterDuff$Mode0) {
        if(this.e == null) {
            this.e = new TintInfo();
        }
        this.e.b = porterDuff$Mode0;
        this.e.c = true;
        this.b();
    }

    private boolean k() {
        return Build.VERSION.SDK_INT <= 21 ? Build.VERSION.SDK_INT == 21 : this.d != null;
    }
}

