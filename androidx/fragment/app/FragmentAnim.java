package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.R.animator;
import androidx.fragment.R.id;

class FragmentAnim {
    static class AnimationOrAnimator {
        public final Animation a;
        public final Animator b;

        AnimationOrAnimator(Animator animator0) {
            this.a = null;
            this.b = animator0;
            if(animator0 == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        AnimationOrAnimator(Animation animation0) {
            this.a = animation0;
            this.b = null;
            if(animation0 == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class EndViewTransitionAnimation extends AnimationSet implements Runnable {
        private final ViewGroup a;
        private final View b;
        private boolean c;
        private boolean d;
        private boolean e;

        EndViewTransitionAnimation(@NonNull Animation animation0, @NonNull ViewGroup viewGroup0, @NonNull View view0) {
            super(false);
            this.e = true;
            this.a = viewGroup0;
            this.b = view0;
            this.addAnimation(animation0);
            viewGroup0.post(this);
        }

        @Override  // android.view.animation.AnimationSet
        public boolean getTransformation(long v, @NonNull Transformation transformation0) {
            this.e = true;
            if(this.c) {
                return !this.d;
            }
            if(!super.getTransformation(v, transformation0)) {
                this.c = true;
                OneShotPreDrawListener.a(this.a, this);
            }
            return true;
        }

        @Override  // android.view.animation.Animation
        public boolean getTransformation(long v, @NonNull Transformation transformation0, float f) {
            this.e = true;
            if(this.c) {
                return !this.d;
            }
            if(!super.getTransformation(v, transformation0, f)) {
                this.c = true;
                OneShotPreDrawListener.a(this.a, this);
            }
            return true;
        }

        @Override
        public void run() {
            if(!this.c && this.e) {
                this.e = false;
                this.a.post(this);
                return;
            }
            this.a.endViewTransition(this.b);
            this.d = true;
        }
    }

    @AnimRes
    private static int a(Fragment fragment0, boolean z, boolean z1) {
        if(z1) {
            return z ? fragment0.getPopEnterAnim() : fragment0.getPopExitAnim();
        }
        return z ? fragment0.getEnterAnim() : fragment0.getExitAnim();
    }

    static AnimationOrAnimator b(@NonNull Context context0, @NonNull Fragment fragment0, boolean z, boolean z1) {
        int v = fragment0.getNextTransition();
        int v1 = FragmentAnim.a(fragment0, z, z1);
        fragment0.setAnimations(0, 0, 0, 0);
        if(fragment0.mContainer != null && fragment0.mContainer.getTag(id.visible_removing_fragment_view_tag) != null) {
            fragment0.mContainer.setTag(0x7F0B108E, null);  // id:visible_removing_fragment_view_tag
        }
        if(fragment0.mContainer != null && fragment0.mContainer.getLayoutTransition() != null) {
            return null;
        }
        if(v1 == 0 && v != 0) {
            v1 = FragmentAnim.d(context0, v, z);
        }
        if(v1 == 0) {
            return null;
        }
        else {
            boolean z2 = "anim".equals(context0.getResources().getResourceTypeName(v1));
            if(!z2) {
                goto label_17;
            }
            try {
                Animation animation0 = AnimationUtils.loadAnimation(context0, v1);
                return animation0 != null ? new AnimationOrAnimator(animation0) : null;
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                throw resources$NotFoundException0;
            }
            catch(RuntimeException unused_ex) {
            }
            try {
            label_17:
                Animator animator0 = AnimatorInflater.loadAnimator(context0, v1);
                return animator0 == null ? null : new AnimationOrAnimator(animator0);
            }
            catch(RuntimeException runtimeException0) {
            }
        }
        if(z2) {
            throw runtimeException0;
        }
        Animation animation1 = AnimationUtils.loadAnimation(context0, v1);
        return animation1 == null ? null : new AnimationOrAnimator(animation1);
    }

    @AnimRes
    private static int c(@NonNull Context context0, int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(0x1030001, new int[]{v});
        int v1 = typedArray0.getResourceId(0, -1);
        typedArray0.recycle();
        return v1;
    }

    @AnimRes
    private static int d(@NonNull Context context0, int v, boolean z) {
        switch(v) {
            case 0x1001: {
                return z ? animator.fragment_open_enter : animator.fragment_open_exit;
            }
            case 0x1003: {
                return z ? animator.fragment_fade_enter : animator.fragment_fade_exit;
            }
            case 4100: {
                return z ? FragmentAnim.c(context0, 0x10100B8) : FragmentAnim.c(context0, 0x10100B9);
            }
            case 0x2002: {
                return z ? animator.fragment_close_enter : animator.fragment_close_exit;
            }
            case 0x2005: {
                return z ? FragmentAnim.c(context0, 0x10100BA) : FragmentAnim.c(context0, 0x10100BB);
            }
            default: {
                return -1;
            }
        }
    }
}

