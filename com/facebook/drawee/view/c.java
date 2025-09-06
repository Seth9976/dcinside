package com.facebook.drawee.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import com.facebook.drawee.drawable.t.d;
import k1.n.a;
import k1.n;
import o3.h;

@TargetApi(19)
@n(a.a)
public class c extends Transition {
    private final d a;
    private final d b;
    @h
    private final PointF c;
    @h
    private final PointF d;
    private static final String e = "draweeTransition:bounds";

    public c(d t$d0, d t$d1) {
        this(t$d0, t$d1, null, null);
    }

    public c(d t$d0, d t$d1, @h PointF pointF0, @h PointF pointF1) {
        this.a = t$d0;
        this.b = t$d1;
        this.c = pointF0;
        this.d = pointF1;
    }

    private void c(TransitionValues transitionValues0) {
        if(transitionValues0.view instanceof GenericDraweeView) {
            transitionValues0.values.put("draweeTransition:bounds", new Rect(0, 0, transitionValues0.view.getWidth(), transitionValues0.view.getHeight()));
        }
    }

    @Override  // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues0) {
        this.c(transitionValues0);
    }

    @Override  // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues0) {
        this.c(transitionValues0);
    }

    @Override  // android.transition.Transition
    @h
    public Animator createAnimator(ViewGroup viewGroup0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        class com.facebook.drawee.view.c.a implements ValueAnimator.AnimatorUpdateListener {
            final com.facebook.drawee.drawable.t.c a;
            final c b;

            com.facebook.drawee.view.c.a(com.facebook.drawee.drawable.t.c t$c0) {
                this.a = t$c0;
                super();
            }

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                this.a.i(f);
            }
        }


        class b extends AnimatorListenerAdapter {
            final GenericDraweeView a;
            final c b;

            b(GenericDraweeView genericDraweeView0) {
                this.a = genericDraweeView0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                ((com.facebook.drawee.generic.a)this.a.getHierarchy()).z(c.this.b);
                if(c.this.d != null) {
                    ((com.facebook.drawee.generic.a)this.a.getHierarchy()).y(c.this.d);
                }
            }
        }

        if(transitionValues0 != null && transitionValues1 != null) {
            Object object0 = transitionValues0.values.get("draweeTransition:bounds");
            Object object1 = transitionValues1.values.get("draweeTransition:bounds");
            if(((Rect)object0) != null && ((Rect)object1) != null) {
                d t$d0 = this.a;
                d t$d1 = this.b;
                if(t$d0 == t$d1 && this.c == this.d) {
                    return null;
                }
                GenericDraweeView genericDraweeView0 = (GenericDraweeView)transitionValues0.view;
                com.facebook.drawee.drawable.t.c t$c0 = new com.facebook.drawee.drawable.t.c(t$d0, t$d1, ((Rect)object0), ((Rect)object1), this.c, this.d);
                ((com.facebook.drawee.generic.a)genericDraweeView0.getHierarchy()).z(t$c0);
                Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ((ValueAnimator)animator0).addUpdateListener(new com.facebook.drawee.view.c.a(this, t$c0));
                animator0.addListener(new b(this, genericDraweeView0));
                return animator0;
            }
        }
        return null;
    }

    public static TransitionSet d(d t$d0, d t$d1) {
        return c.e(t$d0, t$d1, null, null);
    }

    public static TransitionSet e(d t$d0, d t$d1, @h PointF pointF0, @h PointF pointF1) {
        TransitionSet transitionSet0 = new TransitionSet();
        transitionSet0.addTransition(new ChangeBounds());
        transitionSet0.addTransition(new c(t$d0, t$d1, pointF0, pointF1));
        return transitionSet0;
    }
}

