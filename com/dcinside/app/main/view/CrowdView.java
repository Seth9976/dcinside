package com.dcinside.app.main.view;

import A3.p;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Y;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.StateAnnounceView;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.lsjwzh.widget.recyclerviewpager.LoopRecyclerViewPager;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import y4.l;
import y4.m;

public final class CrowdView extends ConstraintLayout {
    public static final class j {
        private j() {
        }

        public j(w w0) {
        }
    }

    public static enum k {
        MAJOR(0),
        MINOR(1),
        MINI(2),
        PERSON(3);

        private final int a;
        private static final k[] f;
        private static final a g;

        static {
            k.f = arr_crowdView$k;
            L.p(arr_crowdView$k, "entries");
            k.g = new d(arr_crowdView$k);
        }

        private k(int v1) {
            this.a = v1;
        }

        private static final k[] a() [...] // Inlined contents

        @l
        public static a b() {
            return k.g;
        }

        public final int c() {
            return this.a;
        }
    }

    public static final int A = 10;
    @l
    private ViewSwitcher a;
    @l
    private LoopRecyclerViewPager b;
    @l
    private View c;
    @l
    private ImageView d;
    @l
    private ImageView e;
    @l
    private ImageView f;
    @l
    private StateAnnounceView g;
    @l
    private View h;
    @l
    private TextView i;
    @l
    private TextView j;
    @l
    private TextView k;
    @l
    private TextView l;
    @l
    private TextView m;
    @m
    private I0 n;
    private boolean o;
    @l
    private final c p;
    @m
    private AnimatorSet q;
    private boolean r;
    @m
    private Y s;
    private long t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    @l
    private com.dcinside.app.main.view.a y;
    @l
    public static final j z;

    static {
        CrowdView.z = new j(null);
    }

    @z3.j
    public CrowdView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @z3.j
    public CrowdView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @z3.j
    public CrowdView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        @f(c = "com.dcinside.app.main.view.CrowdView$1", f = "CrowdView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.view.CrowdView.a extends o implements p {
            int k;
            final CrowdView l;

            com.dcinside.app.main.view.CrowdView.a(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.l = crowdView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.main.view.CrowdView.a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.X();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.view.CrowdView$2", f = "CrowdView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final CrowdView l;

            b(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.l = crowdView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.V();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.view.CrowdView$3", f = "CrowdView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.view.CrowdView.c extends o implements p {
            int k;
            final CrowdView l;

            com.dcinside.app.main.view.CrowdView.c(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.l = crowdView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.main.view.CrowdView.c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.W();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.view.CrowdView$4", f = "CrowdView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.view.CrowdView.d extends o implements p {
            int k;
            final CrowdView l;

            com.dcinside.app.main.view.CrowdView.d(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.l = crowdView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.main.view.CrowdView.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.U();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.view.CrowdView$5", f = "CrowdView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            final CrowdView l;

            e(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.l = crowdView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.T();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.view.CrowdView$6", f = "CrowdView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.view.CrowdView.f extends o implements p {
            int k;
            final CrowdView l;

            com.dcinside.app.main.view.CrowdView.f(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.l = crowdView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.main.view.CrowdView.f(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.S(k.b);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.view.CrowdView$7", f = "CrowdView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements p {
            int k;
            final CrowdView l;

            g(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.l = crowdView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.S(k.c);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.view.CrowdView$8", f = "CrowdView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends o implements p {
            int k;
            final CrowdView l;

            h(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.l = crowdView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.S(k.d);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.view.CrowdView$9", f = "CrowdView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends o implements p {
            int k;
            final CrowdView l;

            i(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.l = crowdView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new i(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.S(k.e);
                return S0.a;
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        int v1 = (int)jl.a.n0();
        this.u = v1;
        int v2 = k.values().length * v1;
        this.v = v2;
        this.w = v1 * 10;
        int v3 = v1 * 10 * k.values().length;
        this.x = v3;
        this.y = new com.dcinside.app.main.view.a(u.H(), u.H(), u.H(), u.H());
        View.inflate(context0, 0x7F0E01B4, this);  // layout:view_crowd
        this.setBackgroundColor(vk.b(context0, 0x1010054));
        View view0 = this.findViewById(0x7F0B031E);  // id:crowd_switcher
        L.o(view0, "findViewById(...)");
        this.a = (ViewSwitcher)view0;
        View view1 = this.findViewById(0x7F0B0319);  // id:crowd_pager
        L.o(view1, "findViewById(...)");
        this.b = (LoopRecyclerViewPager)view1;
        View view2 = this.findViewById(0x7F0B031A);  // id:crowd_panel
        L.o(view2, "findViewById(...)");
        this.c = view2;
        View view3 = this.findViewById(0x7F0B0318);  // id:crowd_opener
        L.o(view3, "findViewById(...)");
        this.d = (ImageView)view3;
        View view4 = this.findViewById(0x7F0B031C);  // id:crowd_prev
        L.o(view4, "findViewById(...)");
        this.e = (ImageView)view4;
        View view5 = this.findViewById(0x7F0B0317);  // id:crowd_next
        L.o(view5, "findViewById(...)");
        this.f = (ImageView)view5;
        View view6 = this.findViewById(0x7F0B031D);  // id:crowd_state_announce
        L.o(view6, "findViewById(...)");
        this.g = (StateAnnounceView)view6;
        View view7 = this.findViewById(0x7F0B030F);  // id:crowd_gall_view
        L.o(view7, "findViewById(...)");
        this.h = view7;
        View view8 = this.findViewById(0x7F0B0314);  // id:crowd_major_gall
        L.o(view8, "findViewById(...)");
        this.i = (TextView)view8;
        View view9 = this.findViewById(0x7F0B0316);  // id:crowd_minor_gall
        L.o(view9, "findViewById(...)");
        this.j = (TextView)view9;
        View view10 = this.findViewById(0x7F0B0315);  // id:crowd_mini_gall
        L.o(view10, "findViewById(...)");
        this.k = (TextView)view10;
        View view11 = this.findViewById(0x7F0B031B);  // id:crowd_person_gall
        L.o(view11, "findViewById(...)");
        this.l = (TextView)view11;
        View view12 = this.findViewById(0x7F0B030E);  // id:crowd_error_text
        L.o(view12, "findViewById(...)");
        this.m = (TextView)view12;
        this.p = new c(v2, v3);
        r.M(this.a, null, new com.dcinside.app.main.view.CrowdView.a(this, null), 1, null);
        r.M(this.d, null, new b(this, null), 1, null);
        r.M(this.e, null, new com.dcinside.app.main.view.CrowdView.c(this, null), 1, null);
        r.M(this.f, null, new com.dcinside.app.main.view.CrowdView.d(this, null), 1, null);
        View view13 = this.findViewById(0x7F0B030D);  // id:crowd_close
        L.o(view13, "findViewById(...)");
        r.M(view13, null, new e(this, null), 1, null);
        r.M(this.i, null, new com.dcinside.app.main.view.CrowdView.f(this, null), 1, null);
        r.M(this.j, null, new g(this, null), 1, null);
        r.M(this.k, null, new h(this, null), 1, null);
        r.M(this.l, null, new i(this, null), 1, null);
        vk.h(0x7F04032A, new View[]{this.d, this.e, this.f});  // attr:icTintNormal
        this.b.setLayoutManager(new NonPredictiveLayoutManager(0, false));
        this.b.U((int v, int v1) -> {
            L.p(this, "this$0");
            k crowdView$k0 = this.P(v1 % this.v);
            boolean z = false;
            this.i.setSelected(crowdView$k0 == k.b);
            this.j.setSelected(crowdView$k0 == k.c);
            this.k.setSelected(crowdView$k0 == k.d);
            TextView textView0 = this.l;
            if(crowdView$k0 == k.e) {
                z = true;
            }
            textView0.setSelected(z);
        });
        com.dcinside.app.main.view.d.b.a(this.a);
        com.dcinside.app.view.tool.j.h(this.c, 0);
        this.d.setRotation(0.0f);
    }

    public CrowdView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    // 检测为 Lambda 实现
    private static final void C(CrowdView crowdView0, int v, int v1) [...]

    private final void L(boolean z, int v, int v1, boolean z1) {
        AnimatorSet animatorSet0 = this.q;
        if(animatorSet0 != null && animatorSet0.isRunning()) {
            animatorSet0.cancel();
        }
        this.r = z;
        dl.a.J3(z);
        kotlin.jvm.internal.l0.h l0$h0 = new kotlin.jvm.internal.l0.h();
        kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
        try {
            if(z) {
                ViewParent viewParent0 = this.getParent();
                L.n(viewParent0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                l0$h0.a = (RecyclerView)viewParent0;
                l0$f0.a = ((RecyclerView)viewParent0).getChildAdapterPosition(this);
            }
            else {
                l0$h0.a = null;
                l0$f0.a = -1;
            }
        }
        catch(Exception unused_ex) {
            l0$h0.a = null;
            l0$f0.a = -1;
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{com.dcinside.app.view.tool.j.c(this.c), v});
        valueAnimator0.setDuration((z1 ? 300L : 0L));
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            L.p(this, "this$0");
            L.p(l0$f0, "$p");
            L.p(l0$h0, "$rv");
            L.p(valueAnimator0, "it");
            Object object0 = valueAnimator0.getAnimatedValue();
            L.n(object0, "null cannot be cast to non-null type kotlin.Int");
            com.dcinside.app.view.tool.j.h(this.c, ((int)(((Integer)object0))));
            int v = l0$f0.a;
            if(v >= 0) {
                RecyclerView recyclerView0 = (RecyclerView)l0$h0.a;
                if(recyclerView0 != null) {
                    recyclerView0.scrollToPosition(v);
                }
            }
        });
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.d, "rotation", new float[]{((float)v1)});
        objectAnimator0.setDuration((z1 ? 300L : 0L));
        AnimatorSet animatorSet1 = new AnimatorSet();
        animatorSet1.play(valueAnimator0).with(objectAnimator0);
        animatorSet1.start();
        this.q = animatorSet1;
    }

    // 检测为 Lambda 实现
    private static final void M(CrowdView crowdView0, kotlin.jvm.internal.l0.f l0$f0, kotlin.jvm.internal.l0.h l0$h0, ValueAnimator valueAnimator0) [...]

    private final void N(boolean z) {
        this.L(false, 0, 0, z);
        this.h.setVisibility(8);
        this.a.setVisibility(0);
    }

    static void O(CrowdView crowdView0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        crowdView0.N(z);
    }

    private final k P(int v) {
        int v1 = this.u;
        if(v < v1 && v >= 0) {
            return k.b;
        }
        if(v < v1 * 2 && v1 <= v) {
            return k.c;
        }
        if(v < v1 * 3 && v1 * 2 <= v) {
            return k.d;
        }
        return v >= v1 * 4 || v1 * 3 > v ? k.b : k.e;
    }

    private final void Q(boolean z) {
        if(this.p.getItemCount() > 0) {
            long v = Math.max(this.t, 0L);
            int v1 = this.b.getCurrentPosition();
            int v2 = this.b.getCurrentPosition();
            this.b.scrollToPosition(v2 - v1 % this.v + ((int)(v % ((long)this.x))) / 10);
        }
        this.h.setVisibility(0);
        this.a.setVisibility(8);
        this.L(true, 0, 180, z);
    }

    static void R(CrowdView crowdView0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        crowdView0.Q(z);
    }

    private final void S(k crowdView$k0) {
        if(this.b.getAdapter() != null) {
            int v = this.b.getCurrentPosition();
            LoopRecyclerViewPager loopRecyclerViewPager0 = this.b;
            int v1 = crowdView$k0.c();
            loopRecyclerViewPager0.scrollToPosition(v - v % this.v + this.u * v1);
        }
    }

    private final void T() {
        CrowdView.O(this, false, 1, null);
    }

    private final void U() {
        if(this.b.getAdapter() != null) {
            this.b.smoothScrollToPosition(this.b.getCurrentPosition() + 1);
        }
    }

    private final void V() {
        if(this.r) {
            CrowdView.O(this, false, 1, null);
            return;
        }
        CrowdView.R(this, false, 1, null);
    }

    private final void W() {
        if(this.b.getAdapter() != null) {
            this.b.smoothScrollToPosition(this.b.getCurrentPosition() - 1);
        }
    }

    private final void X() {
        Y y0 = this.s;
        if(y0 != null) {
            String s = y0.h();
            if(s != null) {
                Context context0 = this.getContext();
                L.n(context0, "null cannot be cast to non-null type com.dcinside.app.base.RealmBaseActivity");
                Xk.i(((com.dcinside.app.base.g)context0), s);
            }
        }
    }

    private final void Z() {
        @f(c = "com.dcinside.app.main.view.CrowdView$play$1", f = "CrowdView.kt", i = {0}, l = {418}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
        static final class com.dcinside.app.main.view.CrowdView.l extends o implements A3.o {
            int k;
            private Object l;
            final CrowdView m;

            com.dcinside.app.main.view.CrowdView.l(CrowdView crowdView0, kotlin.coroutines.d d0) {
                this.m = crowdView0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.main.view.CrowdView.l(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.main.view.CrowdView.l)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                O o0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        o0 = (O)this.l;
                        goto label_8;
                    }
                    case 1: {
                        o0 = (O)this.l;
                        try {
                            f0.n(object0);
                            while(true) {
                            label_8:
                                if(!P.k(o0) || !this.m.hasWindowFocus()) {
                                    return S0.a;
                                }
                                Y y0 = this.m.getItem();
                                this.m.setTitleText(y0);
                                this.l = o0;
                                this.k = 1;
                                if(a0.b(3000L, this) == object1) {
                                    return object1;
                                }
                            }
                        }
                        catch(Exception exception0) {
                            break;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                timber.log.b.a.y(exception0);
                return S0.a;
            }
        }

        if(this.o && this.p.getItemCount() != 0 && (this.n == null || !this.n.isActive())) {
            if(this.hasWindowFocus()) {
                I0 i00 = this.n;
                I0 i01 = null;
                if(i00 != null) {
                    kotlinx.coroutines.I0.a.b(i00, null, 1, null);
                }
                LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(this);
                if(lifecycleOwner0 != null) {
                    LifecycleCoroutineScope lifecycleCoroutineScope0 = LifecycleOwnerKt.a(lifecycleOwner0);
                    if(lifecycleCoroutineScope0 != null) {
                        i01 = kotlinx.coroutines.k.f(lifecycleCoroutineScope0, h0.e(), null, new com.dcinside.app.main.view.CrowdView.l(this, null), 2, null);
                    }
                }
                this.n = i01;
                return;
            }
            try {
                this.setTitleText(this.getItem());
            }
            catch(Exception exception0) {
                timber.log.b.a.y(exception0);
            }
        }
    }

    private final void a0() {
        if(this.b.getAdapter() == null) {
            int v = jl.a.Y();
            if(v < 0 || v >= 4) {
                v = s.g1(new kotlin.ranges.l(0, 3), kotlin.random.f.a);
            }
            this.t = ((long)v) * ((long)this.w);
            List list0 = u.D4(u.D4(u.D4(this.y.a(), this.y.c()), this.y.b()), this.y.d());
            this.p.C(list0);
            if(this.p.y().isEmpty()) {
                this.m.setVisibility(0);
                return;
            }
            this.m.setVisibility(8);
            this.b.setAdapter(this.p);
        }
        this.Z();
        if(jl.a.X()) {
            dl dl0 = dl.a;
            if(!dl0.S()) {
                this.Q(false);
                dl0.K3(true);
            }
        }
        else if(dl.a.P2()) {
            this.Q(false);
        }
        else {
            this.N(false);
        }
        this.d.setEnabled(true);
    }

    private final void b0() {
        I0 i00 = this.n;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.n = null;
    }

    @l
    public final com.dcinside.app.main.view.a getData() {
        return this.y;
    }

    private final Y getItem() {
        long v = this.t;
        this.t = v + 1L;
        return (Y)this.p.y().get(((int)(v % ((long)this.x))));
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = true;
        if(this.b.getAdapter() == null) {
            this.a0();
            return;
        }
        this.Z();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b0();
        this.o = false;
    }

    @Override  // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(z) {
            this.Z();
            return;
        }
        this.b0();
    }

    public final void setData(@l com.dcinside.app.main.view.a a0) {
        L.p(a0, "<set-?>");
        this.y = a0;
    }

    private final void setTitleText(Y y0) {
        this.s = y0;
        View view0 = this.a.getNextView();
        L.m(view0);
        com.dcinside.app.main.view.c.a.b(c.g, view0, y0, 0, 4, null);
        this.a.showNext();
    }
}

