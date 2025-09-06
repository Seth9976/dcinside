package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.dimen;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
public final class t implements x {
    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    private int a;
    @Px
    private int b;
    private static final int c = -1;

    public t(int v) {
        this.b = -1;
        this.a = v;
    }

    @Override  // com.google.android.material.transition.platform.x
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        return t.d(viewGroup0, view0, this.a, this.h(view0.getContext()));
    }

    @Override  // com.google.android.material.transition.platform.x
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        return t.c(viewGroup0, view0, this.a, this.h(view0.getContext()));
    }

    private static Animator c(View view0, View view1, int v, @Px int v1) {
        float f = view1.getTranslationX();
        float f1 = view1.getTranslationY();
        switch(v) {
            case 3: {
                return t.e(view1, ((float)v1) + f, f, f);
            }
            case 5: {
                return t.e(view1, f - ((float)v1), f, f);
            }
            case 0x30: {
                return t.f(view1, f1 - ((float)v1), f1, f1);
            }
            case 80: {
                return t.f(view1, ((float)v1) + f1, f1, f1);
            }
            case 0x800003: {
                return t.j(view0) ? t.e(view1, ((float)v1) + f, f, f) : t.e(view1, f - ((float)v1), f, f);
            }
            case 0x800005: {
                return t.j(view0) ? t.e(view1, f - ((float)v1), f, f) : t.e(view1, ((float)v1) + f, f, f);
            }
            default: {
                throw new IllegalArgumentException("Invalid slide direction: " + v);
            }
        }
    }

    private static Animator d(View view0, View view1, int v, @Px int v1) {
        float f = view1.getTranslationX();
        float f1 = view1.getTranslationY();
        switch(v) {
            case 3: {
                return t.e(view1, f, f - ((float)v1), f);
            }
            case 5: {
                return t.e(view1, f, ((float)v1) + f, f);
            }
            case 0x30: {
                return t.f(view1, f1, ((float)v1) + f1, f1);
            }
            case 80: {
                return t.f(view1, f1, f1 - ((float)v1), f1);
            }
            case 0x800003: {
                return t.j(view0) ? t.e(view1, f, f - ((float)v1), f) : t.e(view1, f, ((float)v1) + f, f);
            }
            case 0x800005: {
                return t.j(view0) ? t.e(view1, f, ((float)v1) + f, f) : t.e(view1, f, f - ((float)v1), f);
            }
            default: {
                throw new IllegalArgumentException("Invalid slide direction: " + v);
            }
        }
    }

    private static Animator e(View view0, float f, float f1, float f2) {
        class a extends AnimatorListenerAdapter {
            final View a;
            final float b;

            a(View view0, float f) {
                this.b = f;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.setTranslationX(this.b);
            }
        }

        Animator animator0 = ObjectAnimator.ofPropertyValuesHolder(view0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f1})});
        animator0.addListener(new a(view0, f2));
        return animator0;
    }

    private static Animator f(View view0, float f, float f1, float f2) {
        class b extends AnimatorListenerAdapter {
            final View a;
            final float b;

            b(View view0, float f) {
                this.b = f;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.setTranslationY(this.b);
            }
        }

        Animator animator0 = ObjectAnimator.ofPropertyValuesHolder(view0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f1})});
        animator0.addListener(new b(view0, f2));
        return animator0;
    }

    @Px
    public int g() {
        return this.b;
    }

    private int h(Context context0) {
        int v = this.b;
        return v == -1 ? context0.getResources().getDimensionPixelSize(dimen.mtrl_transition_shared_axis_slide_distance) : v;
    }

    public int i() {
        return this.a;
    }

    private static boolean j(View view0) {
        return ViewCompat.e0(view0) == 1;
    }

    public void k(@Px int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.b = v;
    }

    public void l(int v) {
        this.a = v;
    }
}

