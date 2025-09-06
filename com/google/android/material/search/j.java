package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.E;
import com.google.android.material.internal.M;
import com.google.android.material.internal.r;
import com.google.android.material.shape.k;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class j {
    interface g {
        void a(b arg1);
    }

    private final Set a;
    private final Set b;
    private final Set c;
    @Nullable
    private Animator d;
    @Nullable
    private Animator e;
    private boolean f;
    private boolean g;
    private boolean h;
    private Animator i;
    private static final long j = 0xFAL;
    private static final long k = 500L;
    private static final long l = 750L;
    private static final long m = 0xFAL;
    private static final long n = 0xFAL;
    private static final long o = 300L;
    private static final long p = 75L;
    private static final long q = 0xFAL;
    private static final long r = 100L;

    j() {
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.h = true;
        this.i = null;
    }

    // 检测为 Lambda 实现
    private static void A(k k0, View view0, ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private static void B(View view0, ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void C(SearchBar searchBar0, View view0, AppBarLayout appBarLayout0, boolean z) [...]

    boolean D(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        return this.c.remove(animatorListenerAdapter0);
    }

    boolean E(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        return this.b.remove(animatorListenerAdapter0);
    }

    boolean F(b searchBar$b0) {
        return this.a.remove(searchBar$b0);
    }

    void G(boolean z) {
        this.h = z;
    }

    void H(SearchBar searchBar0, View view0, @Nullable AppBarLayout appBarLayout0, boolean z) {
        class e extends AnimatorListenerAdapter {
            final j a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                j.this.i = null;
            }
        }

        if(this.y()) {
            Animator animator0 = this.i;
            if(animator0 != null) {
                animator0.cancel();
            }
        }
        this.g = true;
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playSequentially(new Animator[]{this.l(searchBar0, view0, appBarLayout0), this.s(searchBar0)});
        animatorSet0.addListener(new e(this));
        for(Object object0: this.c) {
            animatorSet0.addListener(((AnimatorListenerAdapter)object0));
        }
        if(z) {
            animatorSet0.setDuration(0L);
        }
        animatorSet0.start();
        this.i = animatorSet0;
    }

    void I(SearchBar searchBar0, View view0, @Nullable AppBarLayout appBarLayout0, boolean z) {
        if(this.x()) {
            Animator animator0 = this.i;
            if(animator0 != null) {
                animator0.cancel();
            }
        }
        this.f = true;
        view0.setVisibility(4);
        view0.post(() -> {
            class c extends AnimatorListenerAdapter {
                final j a;

                @Override  // android.animation.AnimatorListenerAdapter
                public void onAnimationEnd(Animator animator0) {
                    j.this.i = null;
                }
            }

            AnimatorSet animatorSet0 = new AnimatorSet();
            animatorSet0.playSequentially(new Animator[]{this.t(searchBar0, view0), this.o(searchBar0, view0, appBarLayout0)});
            animatorSet0.addListener(new c(this));
            for(Object object0: this.b) {
                animatorSet0.addListener(((AnimatorListenerAdapter)object0));
            }
            if(z) {
                animatorSet0.setDuration(0L);
            }
            animatorSet0.start();
            this.i = animatorSet0;
        });
    }

    void J(SearchBar searchBar0) {
        class a extends AnimatorListenerAdapter {
            final j a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                i i0 = new i();
                j.this.k(i0);
            }
        }


        class com.google.android.material.search.j.b extends AnimatorListenerAdapter {
            final View a;
            final Animator b;
            final j c;

            com.google.android.material.search.j.b(View view0, Animator animator0) {
                this.a = view0;
                this.b = animator0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.setVisibility(8);
                this.b.start();
            }
        }

        this.k(new com.google.android.material.search.e());
        TextView textView0 = searchBar0.getTextView();
        View view0 = searchBar0.getCenterView();
        View view1 = E.f(searchBar0);
        Animator animator0 = this.v(textView0, view1);
        animator0.addListener(new a(this));
        this.d = animator0;
        textView0.setAlpha(0.0f);
        if(view1 != null) {
            view1.setAlpha(0.0f);
        }
        if(view0 instanceof com.google.android.material.animation.a) {
            ((com.google.android.material.animation.a)view0).b(new f(animator0));
            return;
        }
        if(view0 != null) {
            view0.setAlpha(0.0f);
            view0.setVisibility(0);
            Animator animator1 = this.m(view0);
            this.e = animator1;
            animator1.addListener(new com.google.android.material.search.j.b(this, view0, animator0));
            animator1.start();
            return;
        }
        animator0.start();
    }

    void K(SearchBar searchBar0) {
        Animator animator0 = this.d;
        if(animator0 != null) {
            animator0.end();
        }
        Animator animator1 = this.e;
        if(animator1 != null) {
            animator1.end();
        }
        View view0 = searchBar0.getCenterView();
        if(view0 instanceof com.google.android.material.animation.a) {
            ((com.google.android.material.animation.a)view0).a();
        }
        if(view0 != null) {
            view0.setAlpha(0.0f);
        }
    }

    void h(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        this.c.add(animatorListenerAdapter0);
    }

    void i(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        this.b.add(animatorListenerAdapter0);
    }

    void j(b searchBar$b0) {
        this.a.add(searchBar$b0);
    }

    private void k(g j$g0) {
        for(Object object0: this.a) {
            j$g0.a(((b)object0));
        }
    }

    private Animator l(SearchBar searchBar0, View view0, AppBarLayout appBarLayout0) {
        class com.google.android.material.search.j.f extends AnimatorListenerAdapter {
            final SearchBar a;
            final j b;

            com.google.android.material.search.j.f(SearchBar searchBar0) {
                this.a = searchBar0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                this.a.setVisibility(0);
                j.this.g = false;
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                this.a.G0();
            }
        }

        return this.p(searchBar0, view0, appBarLayout0).p(0xFAL).e(new com.google.android.material.search.j.f(this, searchBar0)).h();
    }

    private Animator m(@Nullable View view0) {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.addUpdateListener(r.f(new View[]{view0}));
        TimeInterpolator timeInterpolator0 = com.google.android.material.animation.b.a;
        valueAnimator0.setInterpolator(timeInterpolator0);
        long v = 0L;
        valueAnimator0.setDuration((this.h ? 0xFAL : 0L));
        if(this.h) {
            v = 500L;
        }
        valueAnimator0.setStartDelay(v);
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        valueAnimator1.addUpdateListener(r.f(new View[]{view0}));
        valueAnimator1.setInterpolator(timeInterpolator0);
        valueAnimator1.setDuration(0xFAL);
        valueAnimator1.setStartDelay(750L);
        Animator animator0 = new AnimatorSet();
        ((AnimatorSet)animator0).playSequentially(new Animator[]{valueAnimator0, valueAnimator1});
        return animator0;
    }

    private List n(View view0) {
        boolean z = M.s(view0);
        List list0 = new ArrayList();
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                View view1 = ((ViewGroup)view0).getChildAt(v);
                if(!z && view1 instanceof ActionMenuView || z && !(view1 instanceof ActionMenuView)) {
                    list0.add(view1);
                }
            }
        }
        return list0;
    }

    private Animator o(SearchBar searchBar0, View view0, @Nullable AppBarLayout appBarLayout0) {
        class d extends AnimatorListenerAdapter {
            final SearchBar a;
            final j b;

            d(SearchBar searchBar0) {
                this.a = searchBar0;
                super();
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                j.this.f = false;
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                this.a.setVisibility(4);
            }
        }

        return this.p(searchBar0, view0, appBarLayout0).p(300L).e(new d(this, searchBar0)).j();
    }

    private com.google.android.material.internal.g p(SearchBar searchBar0, View view0, @Nullable AppBarLayout appBarLayout0) {
        com.google.android.material.internal.g g0 = new com.google.android.material.internal.g(searchBar0, view0).n(this.q(searchBar0, view0));
        return appBarLayout0 == null ? g0.o(0).c(this.n(view0)) : g0.o(appBarLayout0.getTop()).c(this.n(view0));
    }

    private ValueAnimator.AnimatorUpdateListener q(SearchBar searchBar0, View view0) {
        k k0 = k.m(view0.getContext());
        k0.l0(searchBar0.getCornerSize());
        k0.o0(ViewCompat.V(searchBar0));
        return (ValueAnimator valueAnimator0) -> {
            k0.q0(1.0f - valueAnimator0.getAnimatedFraction());
            ViewCompat.R1(view0, k0);
            view0.setAlpha(1.0f);
        };
    }

    private List r(SearchBar searchBar0) {
        List list0 = M.k(searchBar0);
        if(searchBar0.getCenterView() != null) {
            list0.remove(searchBar0.getCenterView());
        }
        return list0;
    }

    private Animator s(SearchBar searchBar0) {
        List list0 = this.r(searchBar0);
        Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ((ValueAnimator)animator0).addUpdateListener(r.e(list0));
        ((ValueAnimator)animator0).setDuration(100L);
        ((ValueAnimator)animator0).setInterpolator(com.google.android.material.animation.b.a);
        return animator0;
    }

    private Animator t(SearchBar searchBar0, View view0) {
        List list0 = this.r(searchBar0);
        Animator animator0 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ((ValueAnimator)animator0).addUpdateListener(r.e(list0));
        ((ValueAnimator)animator0).addUpdateListener((ValueAnimator valueAnimator0) -> view0.setAlpha(0.0f));
        ((ValueAnimator)animator0).setDuration(75L);
        ((ValueAnimator)animator0).setInterpolator(com.google.android.material.animation.b.a);
        return animator0;
    }

    private Animator u(@Nullable View view0) {
        Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ((ValueAnimator)animator0).addUpdateListener(r.f(new View[]{view0}));
        ((ValueAnimator)animator0).setInterpolator(com.google.android.material.animation.b.a);
        ((ValueAnimator)animator0).setDuration(0xFAL);
        return animator0;
    }

    private Animator v(TextView textView0, @Nullable View view0) {
        Animator animator0 = new AnimatorSet();
        ((AnimatorSet)animator0).setStartDelay(0xFAL);
        ((AnimatorSet)animator0).play(this.w(textView0));
        if(view0 != null) {
            ((AnimatorSet)animator0).play(this.u(view0));
        }
        return animator0;
    }

    private Animator w(TextView textView0) {
        Animator animator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ((ValueAnimator)animator0).addUpdateListener(r.f(new View[]{textView0}));
        ((ValueAnimator)animator0).setInterpolator(com.google.android.material.animation.b.a);
        ((ValueAnimator)animator0).setDuration(0xFAL);
        return animator0;
    }

    boolean x() {
        return this.g;
    }

    boolean y() {
        return this.f;
    }

    boolean z() {
        return this.h;
    }
}

