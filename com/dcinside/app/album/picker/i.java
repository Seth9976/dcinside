package com.dcinside.app.album.picker;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class i extends OnScrollListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private boolean a;
    private int b;
    @l
    private WeakReference c;
    @l
    public static final a d;
    @l
    private static final FastOutSlowInInterpolator e;

    static {
        i.d = new a(null);
        i.e = new FastOutSlowInInterpolator();
    }

    public i(@l View view0) {
        L.p(view0, "parent");
        super();
        this.a = true;
        this.c = new WeakReference(view0);
    }

    private final void a(View view0) {
        public static final class b implements Animator.AnimatorListener {
            final View a;

            b(View view0) {
                this.a = view0;
                super();
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(@l Animator animator0) {
                L.p(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(@l Animator animator0) {
                L.p(animator0, "animation");
                this.a.setVisibility(8);
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(@l Animator animator0) {
                L.p(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(@l Animator animator0) {
                L.p(animator0, "animation");
            }
        }

        if(this.a && this.b > 0) {
            this.a = false;
            ViewPropertyAnimator viewPropertyAnimator0 = view0.animate();
            viewPropertyAnimator0.cancel();
            viewPropertyAnimator0.translationY(((float)view0.getHeight())).setInterpolator(i.e).setDuration(200L).setListener(new b(view0)).start();
        }
    }

    private final void b(View view0) {
        public static final class c implements Animator.AnimatorListener {
            final View a;

            c(View view0) {
                this.a = view0;
                super();
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationCancel(@l Animator animator0) {
                L.p(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationEnd(@l Animator animator0) {
                L.p(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationRepeat(@l Animator animator0) {
                L.p(animator0, "animation");
            }

            @Override  // android.animation.Animator$AnimatorListener
            public void onAnimationStart(@l Animator animator0) {
                L.p(animator0, "animation");
                this.a.setVisibility(0);
            }
        }

        if(!this.a) {
            this.a = true;
            ViewPropertyAnimator viewPropertyAnimator0 = view0.animate();
            viewPropertyAnimator0.cancel();
            viewPropertyAnimator0.translationY(0.0f).setInterpolator(i.e).setListener(new c(view0)).setDuration(200L).start();
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
    public void onScrolled(@l RecyclerView recyclerView0, int v, int v1) {
        L.p(recyclerView0, "recyclerView");
        View view0 = (View)this.c.get();
        if(view0 == null) {
            return;
        }
        if(v1 > 0) {
            this.b += v1;
            this.a(view0);
            return;
        }
        if(v1 < 0) {
            this.b = 0;
            this.b(view0);
        }
    }
}

