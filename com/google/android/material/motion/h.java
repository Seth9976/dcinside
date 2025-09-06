package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R.dimen;
import com.google.android.material.animation.b;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.M;

@RestrictTo({Scope.b})
public class h extends a {
    private final float k;
    private final float l;
    private float m;
    @Nullable
    private Rect n;
    @Nullable
    private Rect o;
    @Nullable
    private Integer p;
    private static final float q = 0.9f;

    public h(@NonNull View view0) {
        super(view0);
        Resources resources0 = view0.getResources();
        this.k = resources0.getDimension(dimen.m3_back_progress_main_container_min_edge_gap);
        this.l = resources0.getDimension(dimen.m3_back_progress_main_container_max_translation_y);
    }

    public void g(@Nullable View view0) {
        if(super.b() == null) {
            return;
        }
        AnimatorSet animatorSet0 = this.i(view0);
        View view1 = this.b;
        if(view1 instanceof ClippableRoundedCornerLayout) {
            animatorSet0.playTogether(new Animator[]{this.h(((ClippableRoundedCornerLayout)view1))});
        }
        animatorSet0.setDuration(((long)this.e));
        animatorSet0.start();
        this.r();
    }

    @NonNull
    private ValueAnimator h(ClippableRoundedCornerLayout clippableRoundedCornerLayout0) {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{clippableRoundedCornerLayout0.getCornerRadius(), ((float)this.k())});
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> clippableRoundedCornerLayout0.e(((float)(((Float)valueAnimator0.getAnimatedValue())))));
        return valueAnimator0;
    }

    @NonNull
    private AnimatorSet i(@Nullable View view0) {
        class com.google.android.material.motion.h.a extends AnimatorListenerAdapter {
            final View a;
            final h b;

            com.google.android.material.motion.h.a(View view0) {
                this.a = view0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                View view0 = this.a;
                if(view0 != null) {
                    view0.setVisibility(0);
                }
            }
        }

        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.b, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.b, View.SCALE_Y, new float[]{1.0f}), ObjectAnimator.ofFloat(this.b, View.TRANSLATION_X, new float[]{0.0f}), ObjectAnimator.ofFloat(this.b, View.TRANSLATION_Y, new float[]{0.0f})});
        animatorSet0.addListener(new com.google.android.material.motion.h.a(this, view0));
        return animatorSet0;
    }

    public void j(long v, @Nullable View view0) {
        AnimatorSet animatorSet0 = this.i(view0);
        animatorSet0.setDuration(v);
        animatorSet0.start();
        this.r();
    }

    public int k() {
        if(this.p == null) {
            this.p = (int)(this.p() ? this.n() : 0);
        }
        return (int)this.p;
    }

    @Nullable
    public Rect l() {
        return this.o;
    }

    @Nullable
    public Rect m() {
        return this.n;
    }

    private int n() {
        if(Build.VERSION.SDK_INT >= 0x1F) {
            WindowInsets windowInsets0 = this.b.getRootWindowInsets();
            return windowInsets0 == null ? 0 : Math.max(Math.max(this.o(windowInsets0, 0), this.o(windowInsets0, 1)), Math.max(this.o(windowInsets0, 3), this.o(windowInsets0, 2)));
        }
        return 0;
    }

    @RequiresApi(0x1F)
    private int o(WindowInsets windowInsets0, int v) {
        RoundedCorner roundedCorner0 = windowInsets0.getRoundedCorner(v);
        return roundedCorner0 == null ? 0 : roundedCorner0.getRadius();
    }

    private boolean p() {
        int[] arr_v = new int[2];
        this.b.getLocationOnScreen(arr_v);
        return arr_v[1] == 0;
    }

    // 检测为 Lambda 实现
    private static void q(ClippableRoundedCornerLayout clippableRoundedCornerLayout0, ValueAnimator valueAnimator0) [...]

    private void r() {
        this.m = 0.0f;
        this.n = null;
        this.o = null;
    }

    @VisibleForTesting
    public void s(float f, @Nullable View view0) {
        this.n = M.d(this.b);
        if(view0 != null) {
            this.o = M.c(this.b, view0);
        }
        this.m = f;
    }

    public void t(@NonNull BackEventCompat backEventCompat0, @Nullable View view0) {
        super.d(backEventCompat0);
        this.s(backEventCompat0.d(), view0);
    }

    @VisibleForTesting
    public void u(float f, boolean z, float f1, float f2) {
        float f3 = this.a(f);
        float f4 = (float)this.b.getWidth();
        float f5 = (float)this.b.getHeight();
        if(f4 > 0.0f && f5 > 0.0f) {
            float f6 = 1.0f + f3 * -0.1f;
            float f7 = f1 - this.m;
            this.b.setScaleX(f6);
            this.b.setScaleY(f6);
            this.b.setTranslationX((0.0f + f3 * (Math.max(0.0f, (f4 - 0.9f * f4) / 2.0f - this.k) - 0.0f)) * ((float)(z ? 1 : -1)));
            this.b.setTranslationY(b.a(0.0f, Math.min(Math.max(0.0f, (f5 - f6 * f5) / 2.0f - this.k), this.l), Math.abs(f7) / f5) * Math.signum(f7));
            View view0 = this.b;
            if(view0 instanceof ClippableRoundedCornerLayout) {
                ((ClippableRoundedCornerLayout)view0).e(b.a(this.k(), f2, f3));
            }
        }
    }

    public void v(@NonNull BackEventCompat backEventCompat0, @Nullable View view0, float f) {
        if(super.e(backEventCompat0) == null) {
            return;
        }
        if(view0 != null && view0.getVisibility() != 4) {
            view0.setVisibility(4);
        }
        this.u(backEventCompat0.a(), backEventCompat0.b() == 0, backEventCompat0.d(), f);
    }
}

