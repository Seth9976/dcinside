package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

final class PlayerControlViewLayoutManager {
    private boolean A;
    private boolean B;
    private boolean C;
    private static final long D = 2000L;
    private static final long E = 0xFAL;
    private static final long F = 0xFAL;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 3;
    private static final int K = 4;
    private final PlayerControlView a;
    @Nullable
    private final View b;
    @Nullable
    private final ViewGroup c;
    @Nullable
    private final ViewGroup d;
    @Nullable
    private final ViewGroup e;
    @Nullable
    private final ViewGroup f;
    @Nullable
    private final ViewGroup g;
    @Nullable
    private final ViewGroup h;
    @Nullable
    private final ViewGroup i;
    @Nullable
    private final View j;
    @Nullable
    private final View k;
    private final AnimatorSet l;
    private final AnimatorSet m;
    private final AnimatorSet n;
    private final AnimatorSet o;
    private final AnimatorSet p;
    private final ValueAnimator q;
    private final ValueAnimator r;
    private final Runnable s;
    private final Runnable t;
    private final Runnable u;
    private final Runnable v;
    private final Runnable w;
    private final View.OnLayoutChangeListener x;
    private final List y;
    private int z;

    public PlayerControlViewLayoutManager(PlayerControlView playerControlView0) {
        this.a = playerControlView0;
        this.s = () -> {
            if(!this.C) {
                this.a0(0);
                this.X();
                return;
            }
            switch(this.z) {
                case 1: {
                    this.o.start();
                    break;
                }
                case 2: {
                    this.p.start();
                    break;
                }
                case 3: {
                    this.B = true;
                    break;
                }
                case 4: {
                    return;
                }
            }
            this.X();
        };
        this.t = () -> this.n.start();
        this.u = () -> this.m.start();
        this.v = () -> {
            this.l.start();
            this.V(this.u, 2000L);
        };
        this.w = () -> this.a0(2);
        this.x = (View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) -> {
            boolean z = this.f0();
            if(this.A != z) {
                this.A = z;
                view0.post(() -> {
                    ViewGroup viewGroup0 = this.e;
                    if(viewGroup0 != null) {
                        viewGroup0.setVisibility((this.A ? 0 : 4));
                    }
                    if(this.j != null) {
                        int v = this.a.getResources().getDimensionPixelSize(dimen.exo_styled_progress_margin_bottom);
                        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.j.getLayoutParams();
                        if(viewGroup$MarginLayoutParams0 != null) {
                            if(this.A) {
                                v = 0;
                            }
                            viewGroup$MarginLayoutParams0.bottomMargin = v;
                            this.j.setLayoutParams(viewGroup$MarginLayoutParams0);
                        }
                        View view0 = this.j;
                        if(view0 instanceof DefaultTimeBar) {
                            if(this.A) {
                                ((DefaultTimeBar)view0).j(true);
                            }
                            else {
                                int v1 = this.z;
                                if(v1 == 1) {
                                    ((DefaultTimeBar)view0).j(false);
                                }
                                else if(v1 != 3) {
                                    ((DefaultTimeBar)view0).u();
                                }
                            }
                        }
                    }
                    for(Object object0: this.y) {
                        ((View)object0).setVisibility((!this.A || !this.b0(((View)object0)) ? 0 : 4));
                    }
                });
            }
            if(!this.A && v2 - v != v6 - v4) {
                view0.post(() -> if(this.f != null && this.g != null) {
                    int v = this.a.getWidth() - this.a.getPaddingLeft() - this.a.getPaddingRight();
                    while(this.g.getChildCount() > 1) {
                        int v2 = this.g.getChildCount();
                        View view0 = this.g.getChildAt(v2 - 2);
                        this.g.removeViewAt(v2 - 2);
                        this.f.addView(view0, 0);
                    }
                    View view1 = this.k;
                    if(view1 != null) {
                        view1.setVisibility(8);
                    }
                    int v3 = PlayerControlViewLayoutManager.B(this.i);
                    int v4 = this.f.getChildCount();
                    for(int v5 = 0; v5 < v4 - 1; ++v5) {
                        v3 += PlayerControlViewLayoutManager.B(this.f.getChildAt(v5));
                    }
                    if(v3 > v) {
                        View view2 = this.k;
                        if(view2 != null) {
                            view2.setVisibility(0);
                            v3 += PlayerControlViewLayoutManager.B(this.k);
                        }
                        ArrayList arrayList0 = new ArrayList();
                        for(int v6 = 0; v6 < v4 - 1; ++v6) {
                            View view3 = this.f.getChildAt(v6);
                            v3 -= PlayerControlViewLayoutManager.B(view3);
                            arrayList0.add(view3);
                            if(v3 <= v) {
                                break;
                            }
                        }
                        if(!arrayList0.isEmpty()) {
                            this.f.removeViews(0, arrayList0.size());
                            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                                int v7 = this.g.getChildCount();
                                View view4 = (View)arrayList0.get(v1);
                                this.g.addView(view4, v7 - 1);
                            }
                        }
                    }
                    else if(this.h != null && this.h.getVisibility() == 0 && !this.r.isStarted()) {
                        this.q.cancel();
                        this.r.start();
                    }
                });
            }
        };
        this.C = true;
        this.z = 0;
        this.y = new ArrayList();
        this.b = playerControlView0.findViewById(id.exo_controls_background);
        this.c = (ViewGroup)playerControlView0.findViewById(id.exo_center_controls);
        this.e = (ViewGroup)playerControlView0.findViewById(id.exo_minimal_controls);
        ViewGroup viewGroup0 = (ViewGroup)playerControlView0.findViewById(id.exo_bottom_bar);
        this.d = viewGroup0;
        this.i = (ViewGroup)playerControlView0.findViewById(id.exo_time);
        View view0 = playerControlView0.findViewById(id.exo_progress);
        this.j = view0;
        this.f = (ViewGroup)playerControlView0.findViewById(id.exo_basic_controls);
        this.g = (ViewGroup)playerControlView0.findViewById(id.exo_extra_controls);
        this.h = (ViewGroup)playerControlView0.findViewById(id.exo_extra_controls_scroll_view);
        View view1 = playerControlView0.findViewById(id.exo_overflow_show);
        this.k = view1;
        View view2 = playerControlView0.findViewById(id.exo_overflow_hide);
        if(view1 != null && view2 != null) {
            view1.setOnClickListener((View view0) -> {
                this.X();
                if(view0.getId() == id.exo_overflow_show) {
                    this.q.start();
                    return;
                }
                if(view0.getId() == id.exo_overflow_hide) {
                    this.r.start();
                }
            });
            view2.setOnClickListener((View view0) -> {
                this.X();
                if(view0.getId() == id.exo_overflow_show) {
                    this.q.start();
                    return;
                }
                if(view0.getId() == id.exo_overflow_hide) {
                    this.r.start();
                }
            });
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        valueAnimator0.setInterpolator(new LinearInterpolator());
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            View view0 = this.b;
            if(view0 != null) {
                view0.setAlpha(f);
            }
            ViewGroup viewGroup0 = this.c;
            if(viewGroup0 != null) {
                viewGroup0.setAlpha(f);
            }
            ViewGroup viewGroup1 = this.e;
            if(viewGroup1 != null) {
                viewGroup1.setAlpha(f);
            }
        });
        valueAnimator0.addListener(new AnimatorListenerAdapter() {
            final PlayerControlViewLayoutManager a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                if(PlayerControlViewLayoutManager.this.b != null) {
                    PlayerControlViewLayoutManager.this.b.setVisibility(4);
                }
                if(PlayerControlViewLayoutManager.this.c != null) {
                    PlayerControlViewLayoutManager.this.c.setVisibility(4);
                }
                if(PlayerControlViewLayoutManager.this.e != null) {
                    PlayerControlViewLayoutManager.this.e.setVisibility(4);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                if(PlayerControlViewLayoutManager.this.j instanceof DefaultTimeBar && !PlayerControlViewLayoutManager.this.A) {
                    ((DefaultTimeBar)PlayerControlViewLayoutManager.this.j).i(0xFAL);
                }
            }
        });
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator1.setInterpolator(new LinearInterpolator());
        valueAnimator1.addUpdateListener((ValueAnimator valueAnimator0) -> {
            float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
            View view0 = this.b;
            if(view0 != null) {
                view0.setAlpha(f);
            }
            ViewGroup viewGroup0 = this.c;
            if(viewGroup0 != null) {
                viewGroup0.setAlpha(f);
            }
            ViewGroup viewGroup1 = this.e;
            if(viewGroup1 != null) {
                viewGroup1.setAlpha(f);
            }
        });
        valueAnimator1.addListener(new AnimatorListenerAdapter() {
            final PlayerControlViewLayoutManager a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                int v = 0;
                if(PlayerControlViewLayoutManager.this.b != null) {
                    PlayerControlViewLayoutManager.this.b.setVisibility(0);
                }
                if(PlayerControlViewLayoutManager.this.c != null) {
                    PlayerControlViewLayoutManager.this.c.setVisibility(0);
                }
                if(PlayerControlViewLayoutManager.this.e != null) {
                    ViewGroup viewGroup0 = PlayerControlViewLayoutManager.this.e;
                    if(!PlayerControlViewLayoutManager.this.A) {
                        v = 4;
                    }
                    viewGroup0.setVisibility(v);
                }
                if(PlayerControlViewLayoutManager.this.j instanceof DefaultTimeBar && !PlayerControlViewLayoutManager.this.A) {
                    ((DefaultTimeBar)PlayerControlViewLayoutManager.this.j).v(0xFAL);
                }
            }
        });
        Resources resources0 = playerControlView0.getResources();
        float f = resources0.getDimension(dimen.exo_styled_bottom_bar_height) - resources0.getDimension(dimen.exo_styled_progress_bar_height);
        float f1 = resources0.getDimension(dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet0 = new AnimatorSet();
        this.l = animatorSet0;
        animatorSet0.setDuration(0xFAL);
        animatorSet0.addListener(new AnimatorListenerAdapter() {
            final PlayerControlViewLayoutManager b;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(1);
                if(PlayerControlViewLayoutManager.this.B) {
                    playerControlView0.post(PlayerControlViewLayoutManager.this.s);
                    PlayerControlViewLayoutManager.this.B = false;
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(3);
            }
        });
        animatorSet0.play(valueAnimator0).with(PlayerControlViewLayoutManager.O(0.0f, f, view0)).with(PlayerControlViewLayoutManager.O(0.0f, f, viewGroup0));
        AnimatorSet animatorSet1 = new AnimatorSet();
        this.m = animatorSet1;
        animatorSet1.setDuration(0xFAL);
        animatorSet1.addListener(new AnimatorListenerAdapter() {
            final PlayerControlViewLayoutManager b;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(2);
                if(PlayerControlViewLayoutManager.this.B) {
                    playerControlView0.post(PlayerControlViewLayoutManager.this.s);
                    PlayerControlViewLayoutManager.this.B = false;
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(3);
            }
        });
        animatorSet1.play(PlayerControlViewLayoutManager.O(f, f1, view0)).with(PlayerControlViewLayoutManager.O(f, f1, viewGroup0));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        animatorSet2.setDuration(0xFAL);
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            final PlayerControlViewLayoutManager b;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(2);
                if(PlayerControlViewLayoutManager.this.B) {
                    playerControlView0.post(PlayerControlViewLayoutManager.this.s);
                    PlayerControlViewLayoutManager.this.B = false;
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(3);
            }
        });
        animatorSet2.play(valueAnimator0).with(PlayerControlViewLayoutManager.O(0.0f, f1, view0)).with(PlayerControlViewLayoutManager.O(0.0f, f1, viewGroup0));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.o = animatorSet3;
        animatorSet3.setDuration(0xFAL);
        animatorSet3.addListener(new AnimatorListenerAdapter() {
            final PlayerControlViewLayoutManager a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(0);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(4);
            }
        });
        animatorSet3.play(valueAnimator1).with(PlayerControlViewLayoutManager.O(f, 0.0f, view0)).with(PlayerControlViewLayoutManager.O(f, 0.0f, viewGroup0));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.p = animatorSet4;
        animatorSet4.setDuration(0xFAL);
        animatorSet4.addListener(new AnimatorListenerAdapter() {
            final PlayerControlViewLayoutManager a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(0);
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                PlayerControlViewLayoutManager.this.a0(4);
            }
        });
        animatorSet4.play(valueAnimator1).with(PlayerControlViewLayoutManager.O(f1, 0.0f, view0)).with(PlayerControlViewLayoutManager.O(f1, 0.0f, viewGroup0));
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.q = valueAnimator2;
        valueAnimator2.setDuration(0xFAL);
        valueAnimator2.addUpdateListener((ValueAnimator valueAnimator0) -> this.y(((float)(((Float)valueAnimator0.getAnimatedValue())))));
        valueAnimator2.addListener(new AnimatorListenerAdapter() {
            final PlayerControlViewLayoutManager a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                if(PlayerControlViewLayoutManager.this.f != null) {
                    PlayerControlViewLayoutManager.this.f.setVisibility(4);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                if(PlayerControlViewLayoutManager.this.h != null) {
                    PlayerControlViewLayoutManager.this.h.setVisibility(0);
                    PlayerControlViewLayoutManager.this.h.setTranslationX(((float)PlayerControlViewLayoutManager.this.h.getWidth()));
                    PlayerControlViewLayoutManager.this.h.scrollTo(PlayerControlViewLayoutManager.this.h.getWidth(), 0);
                }
            }
        });
        ValueAnimator valueAnimator3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.r = valueAnimator3;
        valueAnimator3.setDuration(0xFAL);
        valueAnimator3.addUpdateListener((ValueAnimator valueAnimator0) -> this.y(((float)(((Float)valueAnimator0.getAnimatedValue())))));
        valueAnimator3.addListener(new AnimatorListenerAdapter() {
            final PlayerControlViewLayoutManager a;

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationEnd(Animator animator0) {
                if(PlayerControlViewLayoutManager.this.h != null) {
                    PlayerControlViewLayoutManager.this.h.setVisibility(4);
                }
            }

            @Override  // android.animation.AnimatorListenerAdapter
            public void onAnimationStart(Animator animator0) {
                if(PlayerControlViewLayoutManager.this.f != null) {
                    PlayerControlViewLayoutManager.this.f.setVisibility(0);
                }
            }
        });
    }

    public boolean A(@Nullable View view0) {
        return view0 != null && this.y.contains(view0);
    }

    private static int B(@Nullable View view0) {
        if(view0 == null) {
            return 0;
        }
        int v = view0.getWidth();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? v + (((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin) : v;
    }

    public void C() {
        if(this.z != 2 && this.z != 3) {
            this.W();
            if(!this.C) {
                this.E();
                return;
            }
            if(this.z == 1) {
                this.H();
                return;
            }
            this.D();
        }
    }

    // 检测为 Lambda 实现
    private void D() [...]

    // 检测为 Lambda 实现
    private void E() [...]

    public void F() {
        if(this.z != 2 && this.z != 3) {
            this.W();
            this.E();
        }
    }

    // 检测为 Lambda 实现
    private void G() [...]

    // 检测为 Lambda 实现
    private void H() [...]

    public boolean I() {
        return this.C;
    }

    public boolean J() {
        return this.z == 0 && this.a.f0();
    }

    // 检测为 Lambda 实现
    private void K(ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void L(ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void M(ValueAnimator valueAnimator0) [...]

    // 检测为 Lambda 实现
    private void N(ValueAnimator valueAnimator0) [...]

    private static ObjectAnimator O(float f, float f1, View view0) {
        return ObjectAnimator.ofFloat(view0, "translationY", new float[]{f, f1});
    }

    public void P() {
        this.a.addOnLayoutChangeListener(this.x);
    }

    public void Q() {
        this.a.removeOnLayoutChangeListener(this.x);
    }

    public void R(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.b;
        if(view0 != null) {
            view0.layout(0, 0, v2 - v, v3 - v1);
        }
    }

    // 检测为 Lambda 实现
    private void S(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) [...]

    // 检测为 Lambda 实现
    private void T() [...]

    // 检测为 Lambda 实现
    private void U(View view0) [...]

    private void V(Runnable runnable0, long v) {
        if(v >= 0L) {
            this.a.postDelayed(runnable0, v);
        }
    }

    public void W() {
        this.a.removeCallbacks(this.w);
        this.a.removeCallbacks(this.t);
        this.a.removeCallbacks(this.v);
        this.a.removeCallbacks(this.u);
    }

    public void X() {
        if(this.z == 3) {
            return;
        }
        this.W();
        int v = this.a.getShowTimeoutMs();
        if(v > 0) {
            if(!this.C) {
                this.V(this.w, ((long)v));
                return;
            }
            if(this.z == 1) {
                this.V(this.u, 2000L);
                return;
            }
            this.V(this.v, ((long)v));
        }
    }

    public void Y(boolean z) {
        this.C = z;
    }

    public void Z(@Nullable View view0, boolean z) {
        if(view0 == null) {
            return;
        }
        if(!z) {
            view0.setVisibility(8);
            this.y.remove(view0);
            return;
        }
        if(!this.A || !this.b0(view0)) {
            view0.setVisibility(0);
        }
        else {
            view0.setVisibility(4);
        }
        this.y.add(view0);
    }

    private void a0(int v) {
        int v1 = this.z;
        this.z = v;
        if(v == 2) {
            this.a.setVisibility(8);
        }
        else if(v1 == 2) {
            this.a.setVisibility(0);
        }
        if(v1 != v) {
            this.a.g0();
        }
    }

    private boolean b0(View view0) {
        int v = view0.getId();
        return v == id.exo_bottom_bar || v == id.exo_prev || v == id.exo_next || v == id.exo_rew || v == id.exo_rew_with_amount || v == id.exo_ffwd || v == id.exo_ffwd_with_amount;
    }

    public void c0() {
        if(!this.a.f0()) {
            this.a.setVisibility(0);
            this.a.q0();
            this.a.l0();
        }
        this.d0();
    }

    // 检测为 Lambda 实现
    private void d0() [...]

    // 检测为 Lambda 实现
    private void e0() [...]

    private boolean f0() {
        int v = this.a.getWidth();
        int v1 = this.a.getPaddingLeft();
        int v2 = this.a.getPaddingRight();
        int v3 = this.a.getHeight();
        int v4 = this.a.getPaddingBottom();
        int v5 = this.a.getPaddingTop();
        int v6 = PlayerControlViewLayoutManager.B(this.c);
        int v7 = this.c == null ? 0 : this.c.getPaddingLeft() + this.c.getPaddingRight();
        int v8 = PlayerControlViewLayoutManager.z(this.c);
        int v9 = this.c == null ? 0 : this.c.getPaddingTop() + this.c.getPaddingBottom();
        return v - v1 - v2 <= Math.max(v6 - v7, PlayerControlViewLayoutManager.B(this.i) + PlayerControlViewLayoutManager.B(this.k)) || v3 - v4 - v5 <= v8 - v9 + PlayerControlViewLayoutManager.z(this.d) * 2;
    }

    private void y(float f) {
        ViewGroup viewGroup0 = this.h;
        if(viewGroup0 != null) {
            int v = (int)(((float)viewGroup0.getWidth()) * (1.0f - f));
            this.h.setTranslationX(((float)v));
        }
        ViewGroup viewGroup1 = this.i;
        if(viewGroup1 != null) {
            viewGroup1.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup2 = this.f;
        if(viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
    }

    private static int z(@Nullable View view0) {
        if(view0 == null) {
            return 0;
        }
        int v = view0.getHeight();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        return viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? v + (((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin + ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin) : v;
    }
}

