package com.google.android.material.navigation;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;

@RestrictTo({Scope.b})
public class b {
    private static final int a = 0x99000000;
    private static final int b;

    static {
        b.b = Color.alpha(0x99000000);
    }

    @NonNull
    public static Animator.AnimatorListener b(@NonNull DrawerLayout drawerLayout0, @NonNull View view0) {
        class a extends AnimatorListenerAdapter {
            final DrawerLayout a;
            final View b;

            a(DrawerLayout drawerLayout0, View view0) {
                this.b = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.g(this.b, false);
                this.a.setScrimColor(0x99000000);
            }
        }

        return new a(drawerLayout0, view0);
    }

    @NonNull
    public static ValueAnimator.AnimatorUpdateListener c(@NonNull DrawerLayout drawerLayout0) {
        return (ValueAnimator valueAnimator0) -> {
            float f = valueAnimator0.getAnimatedFraction();
            drawerLayout0.setScrimColor(ColorUtils.D(0x99000000, com.google.android.material.animation.b.c(b.b, 0, f)));
        };
    }

    // 检测为 Lambda 实现
    private static void d(DrawerLayout drawerLayout0, ValueAnimator valueAnimator0) [...]
}

