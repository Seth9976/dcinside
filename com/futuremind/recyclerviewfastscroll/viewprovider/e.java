package com.futuremind.recyclerviewfastscroll.viewprovider;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.annotation.AnimatorRes;
import com.futuremind.recyclerfastscroll.R.animator;

public class e {
    public static abstract class b {
        protected final View a;
        protected int b;
        protected int c;
        protected int d;
        protected float e;
        protected float f;

        public b(View view0) {
            this.b = animator.fastscroll__default_show;
            this.c = animator.fastscroll__default_hide;
            this.d = 1000;
            this.e = 0.5f;
            this.f = 0.5f;
            this.a = view0;
        }

        public abstract e a();

        public b b(@AnimatorRes int v) {
            this.c = v;
            return this;
        }

        public b c(int v) {
            this.d = v;
            return this;
        }

        public b d(float f) {
            this.e = f;
            return this;
        }

        public b e(float f) {
            this.f = f;
            return this;
        }

        public b f(@AnimatorRes int v) {
            this.b = v;
            return this;
        }
    }

    public static class c extends b {
        public c(View view0) {
            super(view0);
        }

        @Override  // com.futuremind.recyclerviewfastscroll.viewprovider.e$b
        public e a() {
            return new e(this.a, this.b, this.c, this.e, this.f, this.d);
        }
    }

    protected final View a;
    protected AnimatorSet b;
    protected AnimatorSet c;
    private float d;
    private float e;

    protected e(View view0, @AnimatorRes int v, @AnimatorRes int v1, float f, float f1, int v2) {
        class a extends AnimatorListenerAdapter {
            boolean a;
            final View b;

            a(View view0) {
                this.b = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationCancel(Animator animator0) {
                super.onAnimationCancel(animator0);
                this.a = true;
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                super.onAnimationEnd(animator0);
                if(!this.a) {
                    this.b.setVisibility(4);
                }
                this.a = false;
            }
        }

        this.a = view0;
        this.d = f;
        this.e = f1;
        AnimatorSet animatorSet0 = (AnimatorSet)AnimatorInflater.loadAnimator(view0.getContext(), v1);
        this.b = animatorSet0;
        animatorSet0.setStartDelay(((long)v2));
        this.b.setTarget(view0);
        AnimatorSet animatorSet1 = (AnimatorSet)AnimatorInflater.loadAnimator(view0.getContext(), v);
        this.c = animatorSet1;
        animatorSet1.setTarget(view0);
        this.b.addListener(new a(this, view0));
        this.c();
    }

    public void a() {
        this.c();
        this.b.start();
    }

    public void b() {
        this.b.cancel();
        if(this.a.getVisibility() == 4) {
            this.a.setVisibility(0);
            this.c();
            this.c.start();
        }
    }

    protected void c() {
        float f = this.d * ((float)this.a.getMeasuredWidth());
        this.a.setPivotX(f);
        float f1 = this.e * ((float)this.a.getMeasuredHeight());
        this.a.setPivotY(f1);
    }
}

