package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat;
import androidx.core.view.WindowInsetsAnimationCompat.Callback;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.b;
import java.util.List;

class f extends Callback {
    private final View e;
    private int f;
    private int g;
    private final int[] h;

    public f(View view0) {
        super(0);
        this.h = new int[2];
        this.e = view0;
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public void c(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        this.e.setTranslationY(0.0f);
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public void d(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat0) {
        this.e.getLocationOnScreen(this.h);
        this.f = this.h[1];
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    @NonNull
    public WindowInsetsCompat e(@NonNull WindowInsetsCompat windowInsetsCompat0, @NonNull List list0) {
        for(Object object0: list0) {
            WindowInsetsAnimationCompat windowInsetsAnimationCompat0 = (WindowInsetsAnimationCompat)object0;
            if((windowInsetsAnimationCompat0.f() & 8) != 0) {
                int v = this.g;
                float f = windowInsetsAnimationCompat0.d();
                this.e.setTranslationY(((float)b.c(v, 0, f)));
                return windowInsetsCompat0;
            }
            if(false) {
                break;
            }
        }
        return windowInsetsCompat0;
    }

    @Override  // androidx.core.view.WindowInsetsAnimationCompat$Callback
    @NonNull
    public BoundsCompat f(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat0, @NonNull BoundsCompat windowInsetsAnimationCompat$BoundsCompat0) {
        this.e.getLocationOnScreen(this.h);
        int v = this.f - this.h[1];
        this.g = v;
        this.e.setTranslationY(((float)v));
        return windowInsetsAnimationCompat$BoundsCompat0;
    }
}

