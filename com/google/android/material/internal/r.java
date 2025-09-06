package com.google.android.material.internal;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Collection;

@RestrictTo({Scope.b})
public class r implements ValueAnimator.AnimatorUpdateListener {
    interface a {
        void a(@NonNull ValueAnimator arg1, @NonNull View arg2);
    }

    private final a a;
    private final View[] b;

    @SuppressLint({"LambdaLast"})
    public r(@NonNull a r$a0, @NonNull Collection collection0) {
        this.a = r$a0;
        this.b = (View[])collection0.toArray(new View[0]);
    }

    @SuppressLint({"LambdaLast"})
    public r(@NonNull a r$a0, @NonNull View[] arr_view) {
        this.a = r$a0;
        this.b = arr_view;
    }

    @NonNull
    public static r e(@NonNull Collection collection0) {
        return new r((ValueAnimator valueAnimator0, View view0) -> view0.setAlpha(((float)(((Float)valueAnimator0.getAnimatedValue())))), collection0);
    }

    @NonNull
    public static r f(@NonNull View[] arr_view) {
        return new r((ValueAnimator valueAnimator0, View view0) -> view0.setAlpha(((float)(((Float)valueAnimator0.getAnimatedValue())))), arr_view);
    }

    @NonNull
    public static r g(@NonNull Collection collection0) {
        return new r((ValueAnimator valueAnimator0, View view0) -> {
            Float float0 = (Float)valueAnimator0.getAnimatedValue();
            view0.setScaleX(((float)float0));
            view0.setScaleY(((float)float0));
        }, collection0);
    }

    @NonNull
    public static r h(@NonNull View[] arr_view) {
        return new r((ValueAnimator valueAnimator0, View view0) -> {
            Float float0 = (Float)valueAnimator0.getAnimatedValue();
            view0.setScaleX(((float)float0));
            view0.setScaleY(((float)float0));
        }, arr_view);
    }

    // 检测为 Lambda 实现
    private static void i(@NonNull ValueAnimator valueAnimator0, @NonNull View view0) [...]

    // 检测为 Lambda 实现
    private static void j(@NonNull ValueAnimator valueAnimator0, @NonNull View view0) [...]

    // 检测为 Lambda 实现
    private static void k(@NonNull ValueAnimator valueAnimator0, @NonNull View view0) [...]

    // 检测为 Lambda 实现
    private static void l(@NonNull ValueAnimator valueAnimator0, @NonNull View view0) [...]

    @NonNull
    public static r m(@NonNull Collection collection0) {
        return new r((ValueAnimator valueAnimator0, View view0) -> view0.setTranslationX(((float)(((Float)valueAnimator0.getAnimatedValue())))), collection0);
    }

    @NonNull
    public static r n(@NonNull View[] arr_view) {
        return new r((ValueAnimator valueAnimator0, View view0) -> view0.setTranslationX(((float)(((Float)valueAnimator0.getAnimatedValue())))), arr_view);
    }

    @NonNull
    public static r o(@NonNull Collection collection0) {
        return new r((ValueAnimator valueAnimator0, View view0) -> view0.setTranslationY(((float)(((Float)valueAnimator0.getAnimatedValue())))), collection0);
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
        View[] arr_view = this.b;
        for(int v = 0; v < arr_view.length; ++v) {
            this.a.a(valueAnimator0, arr_view[v]);
        }
    }

    @NonNull
    public static r p(@NonNull View[] arr_view) {
        return new r((ValueAnimator valueAnimator0, View view0) -> view0.setTranslationY(((float)(((Float)valueAnimator0.getAnimatedValue())))), arr_view);
    }
}

