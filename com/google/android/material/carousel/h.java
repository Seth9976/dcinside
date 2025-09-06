package com.google.android.material.carousel;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.R.dimen;

final class h {
    static float a(float f, float f1, int v) {
        return f + ((float)Math.max(0, v - 1)) * f1;
    }

    static float b(float f, float f1, int v) {
        return v <= 0 ? f : f + f1 / 2.0f;
    }

    static k c(@NonNull Context context0, float f, float f1, @NonNull a a0) {
        float f2 = Math.min(h.f(context0) + f, a0.f);
        float f3 = h.b(0.0f, a0.b, a0.c);
        float f4 = h.j(0.0f, h.a(f3, a0.b, ((int)Math.floor(((float)a0.c) / 2.0f))), a0.b, a0.c);
        float f5 = h.b(f4, a0.e, a0.d);
        float f6 = h.j(f4, h.a(f5, a0.e, ((int)Math.floor(((float)a0.d) / 2.0f))), a0.e, a0.d);
        float f7 = h.b(f6, a0.f, a0.g);
        float f8 = h.j(f6, h.a(f7, a0.f, a0.g), a0.f, a0.g);
        float f9 = h.b(f8, a0.e, a0.d);
        float f10 = h.b(h.j(f8, h.a(f9, a0.e, ((int)Math.ceil(((float)a0.d) / 2.0f))), a0.e, a0.d), a0.b, a0.c);
        float f11 = 1.0f - (f2 - f) / (a0.f - f);
        float f12 = 1.0f - (a0.b - f) / (a0.f - f);
        float f13 = 1.0f - (a0.e - f) / (a0.f - f);
        b k$b0 = new b(a0.f, f1).a(0.0f - f2 / 2.0f, f11, f2);
        int v = a0.c;
        if(v > 0) {
            k$b0.g(f3, f12, a0.b, ((int)Math.floor(((float)v) / 2.0f)));
        }
        int v1 = a0.d;
        if(v1 > 0) {
            k$b0.g(f5, f13, a0.e, ((int)Math.floor(((float)v1) / 2.0f)));
        }
        k$b0.h(f7, 0.0f, a0.f, a0.g, true);
        int v2 = a0.d;
        if(v2 > 0) {
            k$b0.g(f9, f13, a0.e, ((int)Math.ceil(((float)v2) / 2.0f)));
        }
        int v3 = a0.c;
        if(v3 > 0) {
            k$b0.g(f10, f12, a0.b, ((int)Math.ceil(((float)v3) / 2.0f)));
        }
        k$b0.a(f2 / 2.0f + f1, f11, f2);
        return k$b0.i();
    }

    static k d(@NonNull Context context0, float f, float f1, @NonNull a a0, int v) {
        return v == 1 ? h.c(context0, f, f1, a0) : h.e(context0, f, f1, a0);
    }

    static k e(@NonNull Context context0, float f, float f1, @NonNull a a0) {
        float f2 = Math.min(h.f(context0) + f, a0.f);
        float f3 = h.b(0.0f, a0.f, a0.g);
        float f4 = h.j(0.0f, h.a(f3, a0.f, a0.g), a0.f, a0.g);
        float f5 = h.b(f4, a0.e, a0.d);
        float f6 = h.b(h.j(f4, f5, a0.e, a0.d), a0.b, a0.c);
        float f7 = 1.0f - (f2 - f) / (a0.f - f);
        float f8 = 1.0f - (a0.b - f) / (a0.f - f);
        float f9 = 1.0f - (a0.e - f) / (a0.f - f);
        b k$b0 = new b(a0.f, f1).a(0.0f - f2 / 2.0f, f7, f2).h(f3, 0.0f, a0.f, a0.g, true);
        if(a0.d > 0) {
            k$b0.b(f5, f9, a0.e);
        }
        int v = a0.c;
        if(v > 0) {
            k$b0.g(f6, f8, a0.b, v);
        }
        k$b0.a(f2 / 2.0f + f1, f7, f2);
        return k$b0.i();
    }

    static float f(@NonNull Context context0) {
        return context0.getResources().getDimension(dimen.m3_carousel_gone_size);
    }

    static float g(@NonNull Context context0) {
        return context0.getResources().getDimension(dimen.m3_carousel_small_item_size_max);
    }

    static float h(@NonNull Context context0) {
        return context0.getResources().getDimension(dimen.m3_carousel_small_item_size_min);
    }

    static int i(int[] arr_v) [...] // 潜在的解密器

    static float j(float f, float f1, float f2, int v) {
        return v <= 0 ? f : f1 + f2 / 2.0f;
    }
}

