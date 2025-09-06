package com.google.android.material.motion;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R.dimen;
import com.google.android.material.animation.b;

@RestrictTo({Scope.b})
public class i extends a {
    private final float k;
    private final float l;
    private final float m;

    public i(@NonNull View view0) {
        super(view0);
        Resources resources0 = view0.getResources();
        this.k = resources0.getDimension(dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.l = resources0.getDimension(dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.m = resources0.getDimension(dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void f() {
        if(super.b() == null) {
            return;
        }
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.b, View.SCALE_Y, new float[]{1.0f})});
        View view0 = this.b;
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(((ViewGroup)view0).getChildAt(v), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        animatorSet0.setDuration(((long)this.e));
        animatorSet0.start();
    }

    private boolean g(@GravityInt int v, @GravityInt int v1) {
        return (GravityCompat.d(v, ViewCompat.e0(this.b)) & v1) == v1;
    }

    public void h(@NonNull BackEventCompat backEventCompat0, @GravityInt int v, @Nullable Animator.AnimatorListener animator$AnimatorListener0, @Nullable ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        class com.google.android.material.motion.i.a extends AnimatorListenerAdapter {
            final boolean a;
            final int b;
            final i c;

            com.google.android.material.motion.i.a(boolean z, int v) {
                this.a = z;
                this.b = v;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                i.this.b.setTranslationX(0.0f);
                i.this.k(0.0f, this.a, this.b);
            }
        }

        boolean z = backEventCompat0.b() == 0;
        boolean z1 = this.g(v, 3);
        float f = ((float)this.b.getWidth()) * this.b.getScaleX() + ((float)this.i(z1));
        View view0 = this.b;
        Property property0 = View.TRANSLATION_X;
        if(z1) {
            f = -f;
        }
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(view0, property0, new float[]{f});
        if(valueAnimator$AnimatorUpdateListener0 != null) {
            objectAnimator0.addUpdateListener(valueAnimator$AnimatorUpdateListener0);
        }
        objectAnimator0.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimator0.setDuration(((long)b.c(this.c, this.d, backEventCompat0.a())));
        objectAnimator0.addListener(new com.google.android.material.motion.i.a(this, z, v));
        if(animator$AnimatorListener0 != null) {
            objectAnimator0.addListener(animator$AnimatorListener0);
        }
        objectAnimator0.start();
    }

    private int i(boolean z) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.b.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            return z ? ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin : ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
        }
        return 0;
    }

    public void j(@NonNull BackEventCompat backEventCompat0) {
        super.d(backEventCompat0);
    }

    @VisibleForTesting
    public void k(float f, boolean z, @GravityInt int v) {
        float f1 = this.a(f);
        boolean z1 = this.g(v, 3);
        boolean z2 = z == z1;
        int v2 = this.b.getWidth();
        int v3 = this.b.getHeight();
        float f2 = (float)v2;
        if(f2 > 0.0f && ((float)v3) > 0.0f) {
            float f3 = this.k / f2;
            float f4 = this.l / f2;
            float f5 = this.m / ((float)v3);
            View view0 = this.b;
            if(z1) {
                f2 = 0.0f;
            }
            view0.setPivotX(f2);
            if(!z2) {
                f4 = -f3;
            }
            float f6 = 0.0f + f1 * (f4 - 0.0f);
            this.b.setScaleX(f6 + 1.0f);
            float f7 = 0.0f + f1 * (f5 - 0.0f);
            this.b.setScaleY(1.0f - f7);
            View view1 = this.b;
            if(view1 instanceof ViewGroup) {
                for(int v1 = 0; v1 < ((ViewGroup)view1).getChildCount(); ++v1) {
                    View view2 = ((ViewGroup)view1).getChildAt(v1);
                    view2.setPivotX(((float)(z1 ? v2 - view2.getRight() + view2.getWidth() : -view2.getLeft())));
                    view2.setPivotY(((float)(-view2.getTop())));
                    float f8 = z2 ? 1.0f - f6 : 1.0f;
                    view2.setScaleX(f8);
                    view2.setScaleY((1.0f - f7 == 0.0f ? 1.0f : (f6 + 1.0f) / (1.0f - f7) * f8));
                }
            }
        }
    }

    public void l(@NonNull BackEventCompat backEventCompat0, @GravityInt int v) {
        if(super.e(backEventCompat0) == null) {
            return;
        }
        this.k(backEventCompat0.a(), backEventCompat0.b() == 0, v);
    }
}

