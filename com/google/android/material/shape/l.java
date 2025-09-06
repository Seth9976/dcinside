package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.internal.M;

public class l {
    @NonNull
    static f a(int v) {
        switch(v) {
            case 0: {
                return new o();
            }
            case 1: {
                return new g();
            }
            default: {
                return l.b();
            }
        }
    }

    @NonNull
    static f b() {
        return new o();
    }

    @NonNull
    static h c() {
        return new h();
    }

    public static void d(@NonNull View view0, float f) {
        Drawable drawable0 = view0.getBackground();
        if(drawable0 instanceof k) {
            ((k)drawable0).o0(f);
        }
    }

    public static void e(@NonNull View view0) {
        Drawable drawable0 = view0.getBackground();
        if(drawable0 instanceof k) {
            l.f(view0, ((k)drawable0));
        }
    }

    public static void f(@NonNull View view0, @NonNull k k0) {
        if(k0.c0()) {
            k0.t0(M.p(view0));
        }
    }
}

