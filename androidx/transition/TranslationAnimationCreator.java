package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

class TranslationAnimationCreator {
    static class TransitionPositionListener extends AnimatorListenerAdapter implements TransitionListener {
        private final View a;
        private final View b;
        private int[] c;
        private float d;
        private float e;
        private final float f;
        private final float g;
        private boolean h;

        TransitionPositionListener(View view0, View view1, float f, float f1) {
            this.b = view0;
            this.a = view1;
            this.f = f;
            this.g = f1;
            int[] arr_v = (int[])view1.getTag(id.transition_position);
            this.c = arr_v;
            if(arr_v != null) {
                view1.setTag(0x7F0B0FE7, null);  // id:transition_position
            }
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void a(@NonNull Transition transition0) {
            this.b.setTranslationX(this.d);
            this.b.setTranslationY(this.e);
        }

        private void b() {
            if(this.c == null) {
                this.c = new int[2];
            }
            this.b.getLocationOnScreen(this.c);
            this.a.setTag(id.transition_position, this.c);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void k(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void l(@NonNull Transition transition0) {
            this.b();
            this.d = this.b.getTranslationX();
            this.e = this.b.getTranslationY();
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void n(@NonNull Transition transition0, boolean z) {
            if(!this.h) {
                this.a.setTag(id.transition_position, null);
            }
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            this.h = true;
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(@NonNull Animator animator0) {
            this.onAnimationEnd(animator0, false);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator0, boolean z) {
            if(!z) {
                this.b.setTranslationX(this.f);
                this.b.setTranslationY(this.g);
            }
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void p(@NonNull Transition transition0) {
            this.n(transition0, false);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void r(@NonNull Transition transition0) {
            this.h = true;
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void s(Transition transition0, boolean z) {
            e.b(this, transition0, z);
        }
    }

    @Nullable
    static Animator a(@NonNull View view0, @NonNull TransitionValues transitionValues0, int v, int v1, float f, float f1, float f2, float f3, @Nullable TimeInterpolator timeInterpolator0, @NonNull Transition transition0) {
        float f7;
        float f6;
        float f4 = view0.getTranslationX();
        float f5 = view0.getTranslationY();
        int[] arr_v = (int[])transitionValues0.b.getTag(id.transition_position);
        if(arr_v == null) {
            f6 = f;
            f7 = f1;
        }
        else {
            f6 = ((float)(arr_v[0] - v)) + f4;
            f7 = ((float)(arr_v[1] - v1)) + f5;
        }
        view0.setTranslationX(f6);
        view0.setTranslationY(f7);
        if(f6 == f2 && f7 == f3) {
            return null;
        }
        Animator animator0 = ObjectAnimator.ofPropertyValuesHolder(view0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f6, f2}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f7, f3})});
        TransitionPositionListener translationAnimationCreator$TransitionPositionListener0 = new TransitionPositionListener(view0, transitionValues0.b, f4, f5);
        transition0.c(translationAnimationCreator$TransitionPositionListener0);
        animator0.addListener(translationAnimationCreator$TransitionPositionListener0);
        animator0.setInterpolator(timeInterpolator0);
        return animator0;
    }
}

