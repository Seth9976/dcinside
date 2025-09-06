package com.dcinside.app.view.tool;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.dcinside.app.rx.bus.B;
import com.dcinside.app.rx.bus.c;

public class QuickReturnFooterBehavior extends Behavior {
    private int a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final int e;
    private static final Interpolator f;

    static {
        QuickReturnFooterBehavior.f = new FastOutSlowInInterpolator();
    }

    public QuickReturnFooterBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.e = 0;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean I(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
        return v == 2;
    }

    private void U(View view0) {
        class a implements Animator.AnimatorListener {
            final View a;
            final QuickReturnFooterBehavior b;

            a(View view0) {
                this.a = view0;
                super();
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
                QuickReturnFooterBehavior.this.c = false;
                if(!QuickReturnFooterBehavior.this.b) {
                    QuickReturnFooterBehavior.this.W(this.a);
                }
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
                QuickReturnFooterBehavior.this.c = false;
                QuickReturnFooterBehavior.this.d = true;
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
            }
        }

        this.c = true;
        ViewPropertyAnimator viewPropertyAnimator0 = view0.animate().translationY(((float)view0.getHeight())).setInterpolator(QuickReturnFooterBehavior.f).setDuration(700L);
        viewPropertyAnimator0.setListener(new a(this, view0));
        viewPropertyAnimator0.start();
        c.a(view0.getContext(), new B(false));
    }

    public boolean V() {
        return this.d;
    }

    private void W(View view0) {
        class b implements Animator.AnimatorListener {
            final View a;
            final QuickReturnFooterBehavior b;

            b(View view0) {
                this.a = view0;
                super();
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(Animator animator0) {
                QuickReturnFooterBehavior.this.b = false;
                if(!QuickReturnFooterBehavior.this.c) {
                    QuickReturnFooterBehavior.this.U(this.a);
                }
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(Animator animator0) {
                QuickReturnFooterBehavior.this.b = false;
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(Animator animator0) {
                QuickReturnFooterBehavior.this.d = false;
            }
        }

        this.b = true;
        ViewPropertyAnimator viewPropertyAnimator0 = view0.animate().translationY(0.0f).setInterpolator(QuickReturnFooterBehavior.f).setDuration(700L);
        viewPropertyAnimator0.setListener(new b(this, view0));
        viewPropertyAnimator0.start();
        c.a(view0.getContext(), new B(true));
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void y(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, @NonNull int[] arr_v, int v2) {
        if(v1 > 0 && this.a < 0 || v1 < 0 && this.a > 0) {
            view0.animate().cancel();
            this.a = 0;
        }
        int v3 = this.a + v1;
        this.a = v3;
        if(v3 >= this.e && !this.d && !this.c) {
            this.U(view0);
            return;
        }
        if(v3 < 0 && this.d && !this.b) {
            this.W(view0);
        }
    }
}

