package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

@RestrictTo({Scope.c})
public class AppCompatImageHelper {
    @NonNull
    private final ImageView a;
    private TintInfo b;
    private TintInfo c;
    private TintInfo d;
    private int e;

    public AppCompatImageHelper(@NonNull ImageView imageView0) {
        this.e = 0;
        this.a = imageView0;
    }

    private boolean a(@NonNull Drawable drawable0) {
        if(this.d == null) {
            this.d = new TintInfo();
        }
        TintInfo tintInfo0 = this.d;
        tintInfo0.a();
        ColorStateList colorStateList0 = ImageViewCompat.a(this.a);
        if(colorStateList0 != null) {
            tintInfo0.d = true;
            tintInfo0.a = colorStateList0;
        }
        PorterDuff.Mode porterDuff$Mode0 = ImageViewCompat.b(this.a);
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
        if(this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    void c() {
        Drawable drawable0 = this.a.getDrawable();
        if(drawable0 != null) {
            DrawableUtils.b(drawable0);
        }
        if(drawable0 == null || this.m() && this.a(drawable0)) {
            return;
        }
        TintInfo tintInfo0 = this.c;
        if(tintInfo0 != null) {
            AppCompatDrawableManager.j(drawable0, tintInfo0, this.a.getDrawableState());
            return;
        }
        TintInfo tintInfo1 = this.b;
        if(tintInfo1 != null) {
            AppCompatDrawableManager.j(drawable0, tintInfo1, this.a.getDrawableState());
        }
    }

    ColorStateList d() {
        return this.c == null ? null : this.c.a;
    }

    PorterDuff.Mode e() {
        return this.c == null ? null : this.c.b;
    }

    boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet0, int v) {
        TintTypedArray tintTypedArray0 = TintTypedArray.G(this.a.getContext(), attributeSet0, styleable.AppCompatImageView, v, 0);
        Context context0 = this.a.getContext();
        ViewCompat.H1(this.a, context0, styleable.AppCompatImageView, attributeSet0, tintTypedArray0.B(), v, 0);
        try {
            Drawable drawable0 = this.a.getDrawable();
            if(drawable0 == null) {
                int v2 = tintTypedArray0.u(styleable.AppCompatImageView_srcCompat, -1);
                if(v2 != -1) {
                    drawable0 = AppCompatResources.b(this.a.getContext(), v2);
                    if(drawable0 != null) {
                        this.a.setImageDrawable(drawable0);
                    }
                }
            }
            if(drawable0 != null) {
                DrawableUtils.b(drawable0);
            }
            if(tintTypedArray0.C(styleable.AppCompatImageView_tint)) {
                ColorStateList colorStateList0 = tintTypedArray0.d(2);
                ImageViewCompat.c(this.a, colorStateList0);
            }
            if(tintTypedArray0.C(styleable.AppCompatImageView_tintMode)) {
                PorterDuff.Mode porterDuff$Mode0 = DrawableUtils.e(tintTypedArray0.o(3, -1), null);
                ImageViewCompat.d(this.a, porterDuff$Mode0);
            }
        }
        finally {
            tintTypedArray0.I();
        }
    }

    void h(@NonNull Drawable drawable0) {
        this.e = drawable0.getLevel();
    }

    public void i(int v) {
        if(v == 0) {
            this.a.setImageDrawable(null);
        }
        else {
            Drawable drawable0 = AppCompatResources.b(this.a.getContext(), v);
            if(drawable0 != null) {
                DrawableUtils.b(drawable0);
            }
            this.a.setImageDrawable(drawable0);
        }
        this.c();
    }

    void j(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            this.b = null;
        }
        else {
            if(this.b == null) {
                this.b = new TintInfo();
            }
            this.b.a = colorStateList0;
            this.b.d = true;
        }
        this.c();
    }

    void k(ColorStateList colorStateList0) {
        if(this.c == null) {
            this.c = new TintInfo();
        }
        this.c.a = colorStateList0;
        this.c.d = true;
        this.c();
    }

    void l(PorterDuff.Mode porterDuff$Mode0) {
        if(this.c == null) {
            this.c = new TintInfo();
        }
        this.c.b = porterDuff$Mode0;
        this.c.c = true;
        this.c();
    }

    private boolean m() {
        return Build.VERSION.SDK_INT <= 21 ? Build.VERSION.SDK_INT == 21 : this.b != null;
    }
}

