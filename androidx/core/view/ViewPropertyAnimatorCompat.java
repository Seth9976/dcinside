package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

public final class ViewPropertyAnimatorCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator0, float f) {
            return viewPropertyAnimator0.translationZ(f);
        }

        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator0, float f) {
            return viewPropertyAnimator0.translationZBy(f);
        }

        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator0, float f) {
            return viewPropertyAnimator0.z(f);
        }

        static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator0, float f) {
            return viewPropertyAnimator0.zBy(f);
        }
    }

    private final WeakReference a;

    ViewPropertyAnimatorCompat(View view0) {
        this.a = new WeakReference(view0);
    }

    public ViewPropertyAnimatorCompat A(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationXBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat B(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationY(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat C(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationYBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat D(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            Api21Impl.a(view0.animate(), f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat E(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            Api21Impl.b(view0.animate(), f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat F(Runnable runnable0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().withEndAction(runnable0);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    public ViewPropertyAnimatorCompat G() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().withLayer();
        }
        return this;
    }

    public ViewPropertyAnimatorCompat H(Runnable runnable0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().withStartAction(runnable0);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat I(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().x(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat J(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().xBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat K(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().y(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat L(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().yBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat M(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            Api21Impl.c(view0.animate(), f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat N(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            Api21Impl.d(view0.animate(), f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat b(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().alpha(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat c(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().alphaBy(f);
        }
        return this;
    }

    public void d() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().cancel();
        }
    }

    public long e() {
        View view0 = (View)this.a.get();
        return view0 == null ? 0L : view0.animate().getDuration();
    }

    public Interpolator f() {
        View view0 = (View)this.a.get();
        return view0 == null ? null : ((Interpolator)view0.animate().getInterpolator());
    }

    public long g() {
        View view0 = (View)this.a.get();
        return view0 == null ? 0L : view0.animate().getStartDelay();
    }

    // 检测为 Lambda 实现
    private static void h(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener0, View view0, ValueAnimator valueAnimator0) [...]

    public ViewPropertyAnimatorCompat i(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotation(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat j(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat k(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationX(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat l(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationXBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat m(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationY(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat n(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().rotationYBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat o(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleX(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat p(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleXBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat q(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleY(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat r(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().scaleYBy(f);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat s(long v) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setDuration(v);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat t(Interpolator interpolator0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setInterpolator(interpolator0);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat u(ViewPropertyAnimatorListener viewPropertyAnimatorListener0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            this.v(view0, viewPropertyAnimatorListener0);
        }
        return this;
    }

    private void v(View view0, ViewPropertyAnimatorListener viewPropertyAnimatorListener0) {
        if(viewPropertyAnimatorListener0 != null) {
            view0.animate().setListener(new AnimatorListenerAdapter() {
                final ViewPropertyAnimatorCompat c;

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationCancel(Animator animator0) {
                    viewPropertyAnimatorListener0.a(view0);
                }

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationEnd(Animator animator0) {
                    viewPropertyAnimatorListener0.b(view0);
                }

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationStart(Animator animator0) {
                    viewPropertyAnimatorListener0.c(view0);
                }
            });
            return;
        }
        view0.animate().setListener(null);
    }

    public ViewPropertyAnimatorCompat w(long v) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().setStartDelay(v);
        }
        return this;
    }

    public ViewPropertyAnimatorCompat x(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener0) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            N n0 = viewPropertyAnimatorUpdateListener0 == null ? null : (ValueAnimator valueAnimator0) -> viewPropertyAnimatorUpdateListener0.a(view0);
            view0.animate().setUpdateListener(n0);
        }
        return this;
    }

    public void y() {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().start();
        }
    }

    public ViewPropertyAnimatorCompat z(float f) {
        View view0 = (View)this.a.get();
        if(view0 != null) {
            view0.animate().translationX(f);
        }
        return this;
    }
}

