package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

public final class r extends g {
    private static final float c = 0.85f;

    @Override  // com.google.android.material.carousel.g
    boolean f() {
        return false;
    }

    @Override  // com.google.android.material.carousel.g
    @NonNull
    k g(@NonNull b b0, @NonNull View view0) {
        float f3;
        int v = b0.r() ? b0.n() : b0.e();
        LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
        float f = (float)(recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin);
        float f1 = (float)view0.getMeasuredHeight();
        if(b0.r()) {
            float f2 = (float)(recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin);
            f1 = (float)view0.getMeasuredWidth();
            f3 = f2;
        }
        else {
            f3 = f;
        }
        float f4 = f1 + f3;
        float f5 = h.f(view0.getContext());
        float f6 = h.f(view0.getContext()) + f3;
        int v1 = Math.max(1, ((int)Math.floor(((float)v) / f4)));
        float f7 = ((float)v) - ((float)v1) * f4;
        if(b0.p() == 1) {
            return this.l(((float)v), f3, f4, v1, Math.max(Math.min(3.0f * (f7 / 2.0f), f4), this.d() + f3), f6, f7 / 2.0f);
        }
        return f7 > 0.0f ? this.m(view0.getContext(), f3, ((float)v), f4, v1, this.k(f5 + f3, f4, f7), 1, f6) : this.m(view0.getContext(), f3, ((float)v), f4, v1, this.k(f5 + f3, f4, f7), 0, f6);
    }

    private float k(float f, float f1, float f2) {
        return Math.min(f1, (Math.max(1.5f * f2, f) > 0.85f * f1 ? Math.max(0.85f * f1, f2 * 1.2f) : Math.max(1.5f * f2, f)));
    }

    private k l(float f, float f1, float f2, int v, float f3, float f4, float f5) {
        float f6 = Math.min(f4, f2);
        float f7 = 1.0f - (f6 - f1) / (f2 - f1);
        float f8 = 1.0f - (f3 - f1) / (f2 - f1);
        float f9 = f5 + 0.0f - f3 / 2.0f;
        float f10 = f9 + f3 / 2.0f;
        float f11 = ((float)v) * f2 + f10;
        com.google.android.material.carousel.k.b k$b0 = new com.google.android.material.carousel.k.b(f2, f).a(f9 - f3 / 2.0f - f6 / 2.0f, f7, f6).c(f9, f8, f3, false).h(f2 / 2.0f + f10, 0.0f, f2, v, true);
        k$b0.c(f3 / 2.0f + f11, f8, f3, false);
        k$b0.a(f11 + f3 + f6 / 2.0f, f7, f6);
        return k$b0.i();
    }

    private k m(Context context0, float f, float f1, float f2, int v, float f3, int v1, float f4) {
        float f5 = Math.min(f4, f2);
        float f6 = Math.max(f5, 0.5f * f3);
        float f7 = ((float)v) * f2 + 0.0f;
        com.google.android.material.carousel.k.b k$b0 = new com.google.android.material.carousel.k.b(f2, f1).a(0.0f - f6 / 2.0f, 1.0f - (f6 - f) / (f2 - f), f6).h(f2 / 2.0f, 0.0f, f2, v, true);
        if(v1 > 0) {
            float f8 = f3 / 2.0f + f7;
            f7 += f3;
            k$b0.c(f8, 1.0f - (f3 - f) / (f2 - f), f3, false);
        }
        k$b0.a(f7 + h.f(context0) / 2.0f, 1.0f - (f5 - f) / (f2 - f), f5);
        return k$b0.i();
    }
}

