package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;

public class Fade extends Visibility {
    static class FadeAnimatorListener extends AnimatorListenerAdapter implements TransitionListener {
        private final View a;
        private boolean b;

        FadeAnimatorListener(View view0) {
            this.b = false;
            this.a = view0;
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void a(@NonNull Transition transition0) {
            this.a.setTag(id.transition_pause_alpha, null);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void k(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void l(@NonNull Transition transition0) {
            float f = this.a.getVisibility() == 0 ? ViewUtils.b(this.a) : 0.0f;
            this.a.setTag(id.transition_pause_alpha, f);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void n(Transition transition0, boolean z) {
            e.a(this, transition0, z);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            ViewUtils.f(this.a, 1.0f);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            this.onAnimationEnd(animator0, false);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator0, boolean z) {
            if(this.b) {
                this.a.setLayerType(0, null);
            }
            if(!z) {
                ViewUtils.f(this.a, 1.0f);
            }
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationStart(Animator animator0) {
            if(this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void p(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void r(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void s(@NonNull Transition transition0, boolean z) {
        }
    }

    private static final String b9 = "android:fade:transitionAlpha";
    private static final String c9 = "Fade";
    public static final int d9 = 1;
    public static final int e9 = 2;

    public Fade() {
    }

    public Fade(int v) {
        this.T0(v);
    }

    public Fade(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, Styleable.f);
        this.T0(TypedArrayUtils.k(typedArray0, ((XmlResourceParser)attributeSet0), "fadingMode", 0, this.M0()));
        typedArray0.recycle();
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator P0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        return this.U0(view0, Fade.V0(transitionValues0, 0.0f), 1.0f);
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator R0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        Animator animator0 = this.U0(view0, Fade.V0(transitionValues0, 1.0f), 0.0f);
        if(animator0 == null) {
            ViewUtils.f(view0, Fade.V0(transitionValues1, 1.0f));
        }
        return animator0;
    }

    private Animator U0(View view0, float f, float f1) {
        if(f == f1) {
            return null;
        }
        ViewUtils.f(view0, f);
        Animator animator0 = ObjectAnimator.ofFloat(view0, ViewUtils.c, new float[]{f1});
        FadeAnimatorListener fade$FadeAnimatorListener0 = new FadeAnimatorListener(view0);
        animator0.addListener(fade$FadeAnimatorListener0);
        this.R().c(fade$FadeAnimatorListener0);
        return animator0;
    }

    private static float V0(TransitionValues transitionValues0, float f) {
        if(transitionValues0 != null) {
            Float float0 = (Float)transitionValues0.a.get("android:fade:transitionAlpha");
            return float0 == null ? f : ((float)float0);
        }
        return f;
    }

    @Override  // androidx.transition.Transition
    public boolean c0() {
        return true;
    }

    @Override  // androidx.transition.Visibility
    public void p(@NonNull TransitionValues transitionValues0) {
        super.p(transitionValues0);
        Float float0 = (Float)transitionValues0.b.getTag(id.transition_pause_alpha);
        if(float0 == null) {
            float0 = transitionValues0.b.getVisibility() == 0 ? ViewUtils.b(transitionValues0.b) : 0.0f;
        }
        transitionValues0.a.put("android:fade:transitionAlpha", float0);
    }
}

