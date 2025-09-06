package com.dcinside.app.view.tool;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class HideBottomViewOnScrollBehavior extends Behavior implements Animator.AnimatorListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@m View view0, boolean z) {
            HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior0 = null;
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0 == null ? null : view0.getLayoutParams();
            LayoutParams coordinatorLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0) : null;
            Behavior coordinatorLayout$Behavior0 = coordinatorLayout$LayoutParams0 == null ? null : coordinatorLayout$LayoutParams0.f();
            if(coordinatorLayout$Behavior0 instanceof HideBottomViewOnScrollBehavior) {
                hideBottomViewOnScrollBehavior0 = (HideBottomViewOnScrollBehavior)coordinatorLayout$Behavior0;
            }
            if(hideBottomViewOnScrollBehavior0 != null) {
                hideBottomViewOnScrollBehavior0.d = z;
                hideBottomViewOnScrollBehavior0.Q(view0);
            }
        }
    }

    private int a;
    private int b;
    @m
    private ViewPropertyAnimator c;
    private boolean d;
    @l
    public static final a e = null;
    @l
    private static final LinearOutSlowInInterpolator f = null;
    @l
    private static final FastOutLinearInInterpolator g = null;
    private static final int h = 1;
    private static final int i = 2;

    static {
        HideBottomViewOnScrollBehavior.e = new a(null);
        HideBottomViewOnScrollBehavior.f = new LinearOutSlowInInterpolator();
        HideBottomViewOnScrollBehavior.g = new FastOutLinearInInterpolator();
    }

    public HideBottomViewOnScrollBehavior() {
        this.b = 2;
    }

    public HideBottomViewOnScrollBehavior(@l Context context0, @l AttributeSet attributeSet0) {
        L.p(context0, "context");
        L.p(attributeSet0, "attrs");
        super(context0, attributeSet0);
        this.b = 2;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void A(@l CoordinatorLayout coordinatorLayout0, @l View view0, @l View view1, int v, int v1, int v2, int v3, int v4) {
        L.p(coordinatorLayout0, "coordinatorLayout");
        L.p(view0, "child");
        L.p(view1, "target");
        if(this.d) {
            this.Q(view0);
            return;
        }
        if(v1 > 0) {
            this.P(view0);
            return;
        }
        this.Q(view0);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean I(@l CoordinatorLayout coordinatorLayout0, @l View view0, @l View view1, @l View view2, int v, int v1) {
        L.p(coordinatorLayout0, "coordinatorLayout");
        L.p(view0, "child");
        L.p(view1, "directTargetChild");
        L.p(view2, "target");
        return v == 2;
    }

    private final void O(View view0, int v, long v1, TimeInterpolator timeInterpolator0) {
        this.c = view0.animate().translationY(((float)v)).setInterpolator(timeInterpolator0).setDuration(v1).setListener(this);
    }

    private final void P(View view0) {
        if(this.b != 1) {
            ViewPropertyAnimator viewPropertyAnimator0 = this.c;
            if(viewPropertyAnimator0 != null) {
                L.m(viewPropertyAnimator0);
                viewPropertyAnimator0.cancel();
                view0.clearAnimation();
            }
            this.b = 1;
            this.O(view0, this.a, 150L, HideBottomViewOnScrollBehavior.g);
        }
    }

    public final void Q(@l View view0) {
        L.p(view0, "child");
        if(this.b != 2) {
            ViewPropertyAnimator viewPropertyAnimator0 = this.c;
            if(viewPropertyAnimator0 != null) {
                L.m(viewPropertyAnimator0);
                viewPropertyAnimator0.cancel();
                view0.clearAnimation();
            }
            this.b = 2;
            this.O(view0, 0, 200L, HideBottomViewOnScrollBehavior.f);
        }
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationCancel(@l Animator animator0) {
        L.p(animator0, "animation");
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationEnd(@l Animator animator0) {
        L.p(animator0, "animation");
        this.c = null;
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationRepeat(@l Animator animator0) {
        L.p(animator0, "animation");
    }

    @Override  // android.animation.Animator$AnimatorListener
    public void onAnimationStart(@l Animator animator0) {
        L.p(animator0, "animation");
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean t(@l CoordinatorLayout coordinatorLayout0, @l View view0, int v) {
        L.p(coordinatorLayout0, "parent");
        L.p(view0, "child");
        this.a = view0.getMeasuredHeight() * 2;
        return super.t(coordinatorLayout0, view0, v);
    }
}

