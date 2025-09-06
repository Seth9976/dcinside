package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R.attr;
import com.google.android.material.motion.j;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior extends Behavior {
    public interface b {
        void a(@NonNull View arg1, @c int arg2);
    }

    @RestrictTo({Scope.b})
    public @interface c {
    }

    @NonNull
    private final LinkedHashSet a;
    private int b;
    private int c;
    private TimeInterpolator d;
    private TimeInterpolator e;
    private int f;
    @c
    private int g;
    private int h;
    @Nullable
    private ViewPropertyAnimator i;
    private static final int j = 0xE1;
    private static final int k = 0xAF;
    private static final int l = 0;
    private static final int m = 0;
    private static final int n = 0;
    public static final int o = 1;
    public static final int p = 2;

    static {
        HideBottomViewOnScrollBehavior.l = attr.motionDurationLong2;
        HideBottomViewOnScrollBehavior.m = attr.motionDurationMedium4;
        HideBottomViewOnScrollBehavior.n = attr.motionEasingEmphasizedInterpolator;
    }

    public HideBottomViewOnScrollBehavior() {
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
        this.h = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = new LinkedHashSet();
        this.f = 0;
        this.g = 2;
        this.h = 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void B(CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
        if(v1 > 0) {
            this.V(view0);
            return;
        }
        if(v1 < 0) {
            this.X(view0);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean I(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
        return v == 2;
    }

    public void O(@NonNull b hideBottomViewOnScrollBehavior$b0) {
        this.a.add(hideBottomViewOnScrollBehavior$b0);
    }

    private void P(@NonNull View view0, int v, long v1, TimeInterpolator timeInterpolator0) {
        class a extends AnimatorListenerAdapter {
            final HideBottomViewOnScrollBehavior a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                HideBottomViewOnScrollBehavior.this.i = null;
            }
        }

        this.i = view0.animate().translationY(((float)v)).setInterpolator(timeInterpolator0).setDuration(v1).setListener(new a(this));
    }

    public void Q() {
        this.a.clear();
    }

    public boolean R() {
        return this.g == 1;
    }

    public boolean S() {
        return this.g == 2;
    }

    public void T(@NonNull b hideBottomViewOnScrollBehavior$b0) {
        this.a.remove(hideBottomViewOnScrollBehavior$b0);
    }

    public void U(@NonNull View view0, @Dimension int v) {
        this.h = v;
        if(this.g == 1) {
            view0.setTranslationY(((float)(this.f + v)));
        }
    }

    public void V(@NonNull View view0) {
        this.W(view0, true);
    }

    public void W(@NonNull View view0, boolean z) {
        if(this.R()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator0 = this.i;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
            view0.clearAnimation();
        }
        this.Z(view0, 1);
        int v = this.f + this.h;
        if(z) {
            this.P(view0, v, ((long)this.c), this.e);
            return;
        }
        view0.setTranslationY(((float)v));
    }

    public void X(@NonNull View view0) {
        this.Y(view0, true);
    }

    public void Y(@NonNull View view0, boolean z) {
        if(this.S()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator0 = this.i;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
            view0.clearAnimation();
        }
        this.Z(view0, 2);
        if(z) {
            this.P(view0, 0, ((long)this.b), this.d);
            return;
        }
        view0.setTranslationY(0.0f);
    }

    private void Z(@NonNull View view0, @c int v) {
        this.g = v;
        for(Object object0: this.a) {
            ((b)object0).a(view0, this.g);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        this.f = view0.getMeasuredHeight() + viewGroup$MarginLayoutParams0.bottomMargin;
        this.b = j.f(view0.getContext(), HideBottomViewOnScrollBehavior.l, 0xE1);
        this.c = j.f(view0.getContext(), HideBottomViewOnScrollBehavior.m, 0xAF);
        this.d = j.g(view0.getContext(), HideBottomViewOnScrollBehavior.n, com.google.android.material.animation.b.d);
        this.e = j.g(view0.getContext(), HideBottomViewOnScrollBehavior.n, com.google.android.material.animation.b.c);
        return super.t(coordinatorLayout0, view0, v);
    }
}

