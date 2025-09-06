package com.dcinside.app.recent;

import A3.p;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.bookmark.K;
import com.dcinside.app.bookmark.v;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.l0;
import com.dcinside.app.type.F;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.zk;
import com.dcinside.app.view.MenuPageIndicator;
import com.dcinside.app.view.StateAnnounceView;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.dcinside.app.wv.f;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;
import io.realm.F0;
import io.realm.P0;
import io.realm.g1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nRecentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentView.kt\ncom/dcinside/app/recent/RecentView\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,438:1\n35#2:439\n1#3:440\n*S KotlinDebug\n*F\n+ 1 RecentView.kt\ncom/dcinside/app/recent/RecentView\n*L\n143#1:439\n*E\n"})
public final class RecentView extends FrameLayout implements K, f, P0 {
    static final class e implements Runnable {
        @l
        private final WeakReference a;

        public e(@l RecentView recentView0) {
            L.p(recentView0, "view");
            super();
            this.a = new WeakReference(recentView0);
        }

        @Override
        public void run() {
            RecentView recentView0 = (RecentView)this.a.get();
            if(recentView0 == null) {
                return;
            }
            try {
                i i0 = recentView0.c;
                F f0 = recentView0.q.getCurrentPosition() >= (i0 == null ? 0 : i0.x()) ? F.c : F.b;
                if(recentView0.i != f0) {
                    recentView0.e0(f0);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    public final class com.dcinside.app.recent.RecentView.f {
        public static final int[] a;

        static {
            int[] arr_v = new int[F.values().length];
            try {
                arr_v[F.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[F.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            com.dcinside.app.recent.RecentView.f.a = arr_v;
        }
    }

    private final boolean a;
    @m
    private d b;
    @m
    private i c;
    @m
    private AnimatorSet d;
    @m
    private g1 e;
    @m
    private List f;
    @m
    private v g;
    @m
    private o h;
    @l
    private F i;
    private boolean j;
    @m
    private Function1 k;
    @m
    private Function1 l;
    @m
    private Function1 m;
    @l
    private final e n;
    @l
    private final StateAnnounceView o;
    @l
    private final RecyclerView p;
    @l
    private final RecyclerViewPager q;
    @l
    private final MenuPageIndicator r;
    @l
    private final View s;
    @l
    private final View t;
    @l
    private final View u;
    @l
    private final View v;
    @l
    private final TextView w;
    @l
    private final View x;

    @j
    public RecentView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, false, 14, null);
    }

    @j
    public RecentView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, false, 12, null);
    }

    @j
    public RecentView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        this(context0, attributeSet0, v, false, 8, null);
    }

    @j
    public RecentView(@l Context context0, @m AttributeSet attributeSet0, int v, boolean z) {
        static final class a extends N implements A3.a {
            final RecentView e;

            a(RecentView recentView0) {
                this.e = recentView0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.R();
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.recent.RecentView$3", f = "RecentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final RecentView l;

            b(RecentView recentView0, kotlin.coroutines.d d0) {
                this.l = recentView0;
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
                this.l.N();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.recent.RecentView$4", f = "RecentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final RecentView m;

            c(RecentView recentView0, kotlin.coroutines.d d0) {
                this.m = recentView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                c recentView$c0 = new c(this.m, d0);
                recentView$c0.l = view0;
                return recentView$c0.invokeSuspend(S0.a);
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
                this.m.f0(((View)this.l));
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.recent.RecentView$5", f = "RecentView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.recent.RecentView.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final RecentView m;

            com.dcinside.app.recent.RecentView.d(RecentView recentView0, kotlin.coroutines.d d0) {
                this.m = recentView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.recent.RecentView.d recentView$d0 = new com.dcinside.app.recent.RecentView.d(this.m, d0);
                recentView$d0.l = view0;
                return recentView$d0.invokeSuspend(S0.a);
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
                this.m.f0(((View)this.l));
                return S0.a;
            }
        }


        static final class g extends N implements Function1 {
            final RecentView e;

            g(RecentView recentView0) {
                this.e = recentView0;
                super(1);
            }

            public final void a(@l h h0) {
                L.p(h0, "it");
                this.e.P(h0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((h)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.recent.RecentView.h extends N implements Function1 {
            final RecentView e;

            com.dcinside.app.recent.RecentView.h(RecentView recentView0) {
                this.e = recentView0;
                super(1);
            }

            public final void a(@l F f0) {
                L.p(f0, "it");
                this.e.Q(f0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((F)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.recent.RecentView.m extends N implements Function1 {
            final RecentView e;

            com.dcinside.app.recent.RecentView.m(RecentView recentView0) {
                this.e = recentView0;
                super(1);
            }

            public final void a(@l h h0) {
                L.p(h0, "it");
                this.e.Z(h0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((h)object0));
                return S0.a;
            }
        }

        L.p(context0, "context");
        int v2;
        int v1;
        super(context0, attributeSet0, v);
        this.a = z;
        this.i = dl.a.O1();
        this.j = true;
        this.k = new com.dcinside.app.recent.RecentView.h(this);
        this.l = new g(this);
        this.m = new com.dcinside.app.recent.RecentView.m(this);
        this.n = new e(this);
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if(z) {
            v1 = 0x7F0E025D;  // layout:view_recent_split
            v2 = 0x7F0E025A;  // layout:view_recent_item_split
        }
        else {
            v1 = 0x7F0E0258;  // layout:view_recent_basic
            v2 = 0x7F0E0259;  // layout:view_recent_item_basic
        }
        View.inflate(context0, v1, this);
        View view0 = this.findViewById(0x7F0B0CB5);  // id:recent_state
        L.o(view0, "findViewById(...)");
        this.o = (StateAnnounceView)view0;
        View view1 = this.findViewById(0x7F0B0CA0);  // id:recent_recycler
        L.o(view1, "findViewById(...)");
        this.p = (RecyclerView)view1;
        View view2 = this.findViewById(0x7F0B0C9E);  // id:recent_pager
        L.o(view2, "findViewById(...)");
        this.q = (RecyclerViewPager)view2;
        View view3 = this.findViewById(0x7F0B0C9C);  // id:recent_indicator
        L.o(view3, "findViewById(...)");
        this.r = (MenuPageIndicator)view3;
        View view4 = this.findViewById(0x7F0B0C9A);  // id:recent_arrow
        L.o(view4, "findViewById(...)");
        this.s = view4;
        View view5 = this.findViewById(0x7F0B0CA4);  // id:recent_selector_basic
        L.o(view5, "findViewById(...)");
        this.t = view5;
        View view6 = this.findViewById(0x7F0B0CA6);  // id:recent_selector_favorite
        L.o(view6, "findViewById(...)");
        this.u = view6;
        View view7 = this.findViewById(0x7F0B0CA5);  // id:recent_selector_container
        L.o(view7, "findViewById(...)");
        this.v = view7;
        View view8 = this.findViewById(0x7F0B0C9D);  // id:recent_last_mode
        L.o(view8, "findViewById(...)");
        this.w = (TextView)view8;
        View view9 = this.findViewById(0x7F0B0C9F);  // id:recent_panel
        L.o(view9, "findViewById(...)");
        this.x = view9;
        this.setBackgroundColor(vk.b(context0, 0x1010054));
        ((StateAnnounceView)view0).setOnRetryListener(() -> {
            L.p(this, "this$0");
            v v0 = this.g;
            if(v0 != null) {
                v0.E(null);
            }
        });
        this.b = new d(v2, this.l, this.m);
        boolean z1 = false;
        ((RecyclerView)view1).setLayoutManager(new NonPredictiveLayoutManager(0, false));
        ((RecyclerView)view1).setAdapter(this.b);
        com.dcinside.app.util.ql.b.l(((RecyclerView)view1), Dk.b(0x7F0703EC));  // dimen:space_recent_item
        this.c = new i(this.k, this.l, this.m);
        ((RecyclerViewPager)view2).setLayoutManager(new NonPredictiveLayoutManager(0, false));
        ((RecyclerViewPager)view2).setAdapter(this.c);
        ((RecyclerViewPager)view2).U((int v, int v1) -> {
            L.p(this, "this$0");
            this.d0(v, v1);
        });
        Configuration configuration0 = context0.getResources().getConfiguration();
        L.o(configuration0, "getConfiguration(...)");
        int v3 = configuration0.screenWidthDp - 35 <= 330 ? 4 : 5;
        ((MenuPageIndicator)view3).setMainPage(true);
        ((MenuPageIndicator)view3).N(((RecyclerViewPager)view2), v3, false, null, new a(this));
        r.M(view4, null, new b(this, null), 1, null);
        r.M(view5, null, new c(this, null), 1, null);
        r.M(view6, null, new com.dcinside.app.recent.RecentView.d(this, null), 1, null);
        this.e0(this.i);
        boolean z2 = this.getResources().getBoolean(0x7F050006);  // bool:isTablet
        boolean z3 = context0.getResources().getConfiguration().orientation == 1;
        if(ll.v() || z2 && z3) {
            z1 = true;
        }
        this.H(z1, true);
    }

    public RecentView(Context context0, AttributeSet attributeSet0, int v, boolean z, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            z = false;
        }
        this(context0, attributeSet0, v, z);
    }

    private final void H(boolean z, boolean z1) {
        boolean z2 = true;
        int v = 0;
        if(this.getParent() instanceof RecyclerView) {
            this.requestFocus();
        }
        if(this.d != null && this.d.isRunning()) {
            AnimatorSet animatorSet0 = this.d;
            if(animatorSet0 != null) {
                animatorSet0.cancel();
            }
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{this.x.getHeight(), 0});
        valueAnimator0.addUpdateListener((ValueAnimator valueAnimator0) -> {
            L.p(this, "this$0");
            L.p(valueAnimator0, "it");
            Object object0 = valueAnimator0.getAnimatedValue();
            L.n(object0, "null cannot be cast to non-null type kotlin.Int");
            com.dcinside.app.view.tool.j.h(this.x, ((int)(((Integer)object0))));
        });
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.s, "rotation", new float[]{(z ? 270.0f : 90.0f)});
        AnimatorSet animatorSet1 = new AnimatorSet();
        animatorSet1.play(valueAnimator0).with(objectAnimator0);
        if(z1) {
            animatorSet1.start();
            animatorSet1.end();
        }
        else {
            animatorSet1.start();
        }
        this.d = animatorSet1;
        this.v.setVisibility((z ? 0 : 8));
        this.p.setVisibility((z ? 8 : 0));
        if(z || this.b != null && this.b.getItemCount() != 0) {
            z2 = false;
        }
        TextView textView0 = this.w;
        if(!z2) {
            v = 8;
        }
        textView0.setVisibility(v);
        if(!z) {
            this.w.setText((this.i == F.b ? 0x7F150872 : 0x7F150873));  // string:recent_missing_basic "최근 방문 갤러리"
        }
    }

    // 检测为 Lambda 实现
    private static final void I(RecentView recentView0, ValueAnimator valueAnimator0) [...]

    public final void J(@m F0 f00) {
        g1 g10 = this.e;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        v v0 = this.g;
        if(v0 != null) {
            v0.release();
        }
        if(f00 != null && !f00.isClosed()) {
            g1 g11 = com.dcinside.app.realm.s0.j.n(f00);
            this.e = g11;
            if(g11 != null) {
                g11.l(this);
            }
            this.g = new v(f00, this);
            g1 g12 = this.e;
            L.m(g12);
            this.O(g12);
            return;
        }
        this.e = null;
        this.g = null;
    }

    public final boolean K() {
        return this.a;
    }

    // 检测为 Lambda 实现
    private static final void L(RecentView recentView0, int v, int v1) [...]

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.O(((g1)object0));
    }

    private final void N() {
        boolean z = this.x.getHeight() == 0;
        this.H(z, false);
        ll.u0(z);
    }

    public void O(@l g1 g10) {
        L.p(g10, "results");
        List list0 = this.g == null ? null : this.g.y();
        List list1 = g10.h().g2(g10);
        this.f = list1;
        this.S(list1, list0);
    }

    private final void P(h h0) {
        Object object0 = h0.getItem();
        if(object0 instanceof com.dcinside.app.realm.s0) {
            com.dcinside.app.realm.s0.a s0$a0 = com.dcinside.app.realm.s0.j;
            Context context0 = this.getContext();
            L.o(context0, "getContext(...)");
            String s = ((com.dcinside.app.realm.s0)object0).R5();
            if(s == null) {
                return;
            }
            s0$a0.h(context0, s);
            return;
        }
        if(object0 instanceof com.dcinside.app.realm.m) {
            Context context1 = this.getContext();
            L.n(context1, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            Xk.i(((AppCompatActivity)context1), ((com.dcinside.app.realm.m)object0).R5());
        }
    }

    private final void Q(F f0) {
        if(com.dcinside.app.recent.RecentView.f.a[f0.ordinal()] == 2) {
            v v0 = this.g;
            if(v0 != null) {
                v0.E(null);
            }
        }
    }

    private final void R() {
        Context context0 = this.getContext();
        if(context0 != null) {
            com.dcinside.app.rx.bus.c.a(context0, new l0(this.i));
        }
    }

    private final void S(List list0, List list1) {
        @s0({"SMAP\nRecentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentView.kt\ncom/dcinside/app/recent/RecentView$onItemsChanged$2\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,438:1\n177#2,9:439\n*S KotlinDebug\n*F\n+ 1 RecentView.kt\ncom/dcinside/app/recent/RecentView$onItemsChanged$2\n*L\n262#1:439,9\n*E\n"})
        static final class com.dcinside.app.recent.RecentView.i extends N implements Function1 {
            final RecentView e;

            com.dcinside.app.recent.RecentView.i(RecentView recentView0) {
                this.e = recentView0;
                super(1);
            }

            public final void a(com.dcinside.app.recent.c c0) {
                List list0 = c0.a();
                List list1 = c0.b();
                this.e.o.e(k0.d.a());
                d d0 = this.e.b;
                if(d0 == null) {
                    return;
                }
                i i0 = this.e.c;
                if(i0 == null) {
                    return;
                }
                d0.G(list0);
                d0.F(list1);
                int v = i0.getItemCount();
                Throwable throwable0 = null;
                i0.G(list0, null);
                v v1 = this.e.g;
                if(v1 != null) {
                    throwable0 = v1.x();
                }
                i0.F(list1, throwable0);
                int v2 = i0.getItemCount();
                boolean z = true;
                if(this.e.i != F.b || 1 > v2 || v2 >= v) {
                    F f0 = F.c;
                    if(this.e.i == f0 && v2 > v) {
                        int v4 = this.e.q.getCurrentPosition();
                        this.e.q.scrollToPosition(v4 + 1);
                    }
                    else if(this.e.i == f0 && list1.isEmpty()) {
                        try {
                            this.e.q.scrollToPosition(Math.min(v2, v) - 1);
                        }
                        catch(Exception unused_ex) {
                        }
                    }
                }
                else {
                    int v3 = this.e.q.getCurrentPosition();
                    if(i0.x() <= v3) {
                        this.e.q.scrollToPosition(v3 - 1);
                    }
                }
                int v5 = 0;
                if(this.e.v.getHeight() != 0 || d0.getItemCount() != 0) {
                    z = false;
                }
                this.e.w.setVisibility((z ? 0 : 8));
                if(this.e.j) {
                    this.e.j = false;
                    if(!this.e.t.isSelected()) {
                        v5 = i0.x();
                    }
                    this.e.q.scrollToPosition(v5);
                    this.e.q.smoothScrollToPosition(v5);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.recent.c)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.recent.RecentView.j extends N implements Function1 {
            public static final com.dcinside.app.recent.RecentView.j e;

            static {
                com.dcinside.app.recent.RecentView.j.e = new com.dcinside.app.recent.RecentView.j();
            }

            com.dcinside.app.recent.RecentView.j() {
                super(1);
            }

            public final com.dcinside.app.recent.g a(com.dcinside.app.realm.m m0) {
                return new com.dcinside.app.recent.g(m0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.realm.m)object0));
            }
        }


        static final class k extends N implements Function1 {
            public static final k e;

            static {
                k.e = new k();
            }

            k() {
                super(1);
            }

            public final com.dcinside.app.recent.f a(com.dcinside.app.realm.s0 s00) {
                return new com.dcinside.app.recent.f(s00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.realm.s0)object0));
            }
        }


        static final class com.dcinside.app.recent.RecentView.l extends N implements A3.o {
            public static final com.dcinside.app.recent.RecentView.l e;

            static {
                com.dcinside.app.recent.RecentView.l.e = new com.dcinside.app.recent.RecentView.l();
            }

            com.dcinside.app.recent.RecentView.l() {
                super(2);
            }

            public final com.dcinside.app.recent.c a(List list0, List list1) {
                L.m(list0);
                L.m(list1);
                return new com.dcinside.app.recent.c(list0, list1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((List)object0), ((List)object1));
            }
        }

        kl.b(new o[]{this.h});
        Iterable iterable0 = list0 == null ? new ArrayList() : list0;
        rx.g g0 = rx.g.y2(iterable0).g3((Object object0) -> {
            L.p(k.e, "$tmp0");
            return (com.dcinside.app.recent.f)k.e.invoke(object0);
        }).z6();
        Iterable iterable1 = list1 == null ? new ArrayList() : list1;
        rx.g g1 = rx.g.u0(g0, rx.g.y2(iterable1).g3((Object object0) -> {
            L.p(com.dcinside.app.recent.RecentView.j.e, "$tmp0");
            return (com.dcinside.app.recent.g)com.dcinside.app.recent.RecentView.j.e.invoke(object0);
        }).z6(), (Object object0, Object object1) -> {
            L.p(com.dcinside.app.recent.RecentView.l.e, "$tmp0");
            return (com.dcinside.app.recent.c)com.dcinside.app.recent.RecentView.l.e.invoke(object0, object1);
        });
        if(this.i != F.b) {
            g1.w1(100L, TimeUnit.MILLISECONDS).R1(() -> {
                L.p(this, "this$0");
                k0.d d0 = k0.d.e();
                this.o.e(d0);
            });
        }
        this.h = g1.M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.recent.RecentView.i(this), "$tmp0");
            new com.dcinside.app.recent.RecentView.i(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            k0.d d0 = k0.d.g(throwable0);
            this.o.e(d0);
            timber.log.b.a.y(throwable0);
            L.m(throwable0);
            zk.a(throwable0);
        });
    }

    // 检测为 Lambda 实现
    private static final void T(RecentView recentView0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final com.dcinside.app.recent.f U(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final com.dcinside.app.recent.g V(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final com.dcinside.app.recent.c W(A3.o o0, Object object0, Object object1) [...]

    // 检测为 Lambda 实现
    private static final void X(RecentView recentView0) [...]

    // 检测为 Lambda 实现
    private static final void Y(Function1 function10, Object object0) [...]

    private final boolean Z(h h0) {
        static final class n extends N implements Function1 {
            public static final n e;

            static {
                n.e = new n();
            }

            n() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F15086D);  // string:recent_delete_favorite "즐겨찾기 해제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.recent.RecentView.o extends N implements Function1 {
            public static final com.dcinside.app.recent.RecentView.o e;

            static {
                com.dcinside.app.recent.RecentView.o.e = new com.dcinside.app.recent.RecentView.o();
            }

            com.dcinside.app.recent.RecentView.o() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.recent.RecentView.p extends N implements Function1 {
            final com.dcinside.app.base.g e;
            final RecentView f;
            final Object g;

            com.dcinside.app.recent.RecentView.p(com.dcinside.app.base.g g0, RecentView recentView0, Object object0) {
                this.e = g0;
                this.f = recentView0;
                this.g = object0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                if(this.e.F1() == null) {
                    return;
                }
                v v0 = this.f.g;
                if(v0 != null) {
                    v0.u(this.f.getContext(), ((com.dcinside.app.realm.m)this.g).S5(), ((com.dcinside.app.realm.m)this.g).R5());
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Object object0 = h0.getItem();
        if(object0 instanceof com.dcinside.app.realm.s0) {
            Context context0 = this.getContext();
            com.dcinside.app.base.g g0 = context0 instanceof com.dcinside.app.base.g ? ((com.dcinside.app.base.g)context0) : null;
            if(g0 == null) {
                return true;
            }
            com.dcinside.app.realm.s0.j.q(g0, ((com.dcinside.app.realm.s0)object0));
            return true;
        }
        if(object0 instanceof com.dcinside.app.realm.m) {
            Context context1 = this.getContext();
            L.n(context1, "null cannot be cast to non-null type com.dcinside.app.base.RealmBaseActivity");
            com.dcinside.app.perform.e.e.a(((com.dcinside.app.base.g)context1)).n(n.e).z(0x7F150270).x(0x1040000).b().Z1((Object object0) -> {
                L.p(com.dcinside.app.recent.RecentView.o.e, "$tmp0");
                return (Boolean)com.dcinside.app.recent.RecentView.o.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.recent.RecentView.p(((com.dcinside.app.base.g)context1), this, object0), "$tmp0");
                new com.dcinside.app.recent.RecentView.p(((com.dcinside.app.base.g)context1), this, object0).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(((com.dcinside.app.base.g)context1), "$activity");
                Dl.G(((com.dcinside.app.base.g)context1), throwable0.getMessage());
            });
            return true;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static final Boolean a0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void b0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void c0(com.dcinside.app.base.g g0, Throwable throwable0) [...]

    private final void d0(int v, int v1) {
        this.removeCallbacks(this.n);
        this.post(this.n);
    }

    private final void e0(F f0) {
        if(this.i != f0) {
            this.i = f0;
            dl.a.B5(f0);
        }
        boolean z = false;
        this.t.setSelected(f0 == F.b);
        F f1 = F.c;
        this.u.setSelected(f0 == f1);
        d d0 = this.b;
        if(d0 != null) {
            if(f0 == f1) {
                z = true;
            }
            d0.E(z);
        }
    }

    private final void f0(View view0) {
        int v = this.t.getId();
        F f0 = view0.getId() == v ? F.b : F.c;
        F f1 = F.b;
        int v1 = 0;
        if(f0 != f1) {
            i i0 = this.c;
            if(i0 != null) {
                v1 = i0.x();
            }
        }
        if(this.a) {
            F f2 = F.c;
            if(f0 == f2) {
                this.e0(f2);
                this.q.smoothScrollToPosition(v1);
                return;
            }
        }
        this.e0(f1);
        this.q.scrollToPosition(v1);
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    @Override  // com.dcinside.app.bookmark.K
    public void n(@l v v0, int v1, @m List list0) {
        L.p(v0, "favoriteBasket");
        switch(v1) {
            case 0: {
                this.S(this.f, null);
                break;
            }
            case 1: {
                kl.b(new o[]{this.h});
                k0.d d0 = k0.d.e();
                this.o.e(d0);
                return;
            label_7:
                if(v1 == 2) {
                    this.S(this.f, list0);
                    return;
                }
                break;
            }
            default: {
                goto label_7;
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void o(RecentView recentView0) [...]

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.removeCallbacks(this.n);
        kl.b(new o[]{this.h});
        g1 g10 = this.e;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.e = null;
        this.f = null;
        v v0 = this.g;
        if(v0 != null) {
            v0.release();
        }
        this.g = null;
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
    }
}

