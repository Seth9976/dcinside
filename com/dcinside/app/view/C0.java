package com.dcinside.app.view;

import A3.p;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.e0;
import com.dcinside.app.model.z;
import com.dcinside.app.read.Z;
import com.dcinside.app.rx.bus.I;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.lsjwzh.widget.recyclerviewpager.LoopRecyclerViewPager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.g;
import y4.l;
import y4.m;

@s0({"SMAP\nPostReadLikePostsTitleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadLikePostsTitleView.kt\ncom/dcinside/app/view/PostReadLikePostsTitleView\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n25#2:345\n1#3:346\n*S KotlinDebug\n*F\n+ 1 PostReadLikePostsTitleView.kt\ncom/dcinside/app/view/PostReadLikePostsTitleView\n*L\n227#1:345\n*E\n"})
public final class c0 extends ConstraintLayout implements OnItemTouchListener {
    @s0({"SMAP\nPostReadLikePostsTitleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadLikePostsTitleView.kt\ncom/dcinside/app/view/PostReadLikePostsTitleView$PostTitleAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
    static final class a extends Adapter {
        @m
        private List a;
        private int b;

        public final void A(@m List list0) {
            this.a = list0;
            int v = list0 == null ? 0 : list0.size();
            this.b = v < 5 ? 1 : 1 + (v - 1) / 4;
            this.notifyDataSetChanged();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return Math.min(this.b, 5);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.x(((b)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.y(viewGroup0, v);
        }

        @l
        public final z w(int v) {
            List list0 = this.a;
            L.m(list0);
            return (z)list0.get(v);
        }

        public void x(@l b c0$b0, int v) {
            @f(c = "com.dcinside.app.view.PostReadLikePostsTitleView$PostTitleAdapter$onBindViewHolder$1", f = "PostReadLikePostsTitleView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class com.dcinside.app.view.c0.a.a extends o implements p {
                int k;
                Object l;
                final a m;
                final int n;

                com.dcinside.app.view.c0.a.a(a c0$a0, int v, d d0) {
                    this.m = c0$a0;
                    this.n = v;
                    super(3, d0);
                }

                @m
                public final Object a(@l O o0, @l View view0, @m d d0) {
                    com.dcinside.app.view.c0.a.a c0$a$a0 = new com.dcinside.app.view.c0.a.a(this.m, this.n, d0);
                    c0$a$a0.l = view0;
                    return c0$a$a0.invokeSuspend(S0.a);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    return this.a(((O)object0), ((View)object1), ((d)object2));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    this.m.z(((View)this.l), this.n);
                    return S0.a;
                }
            }

            L.p(c0$b0, "holder");
            int v1 = this.getItemCount();
            for(int v2 = 0; v2 < 4; ++v2) {
                int v3 = v % v1 * 4 + v2;
                String s = v3 < (this.a == null ? 0 : this.a.size()) ? this.w(v3).e() : null;
                c0$b0.e()[v2].setText(Dl.M(s));
                r.M(c0$b0.e()[v2], null, new com.dcinside.app.view.c0.a.a(this, v3, null), 1, null);
            }
        }

        @l
        public b y(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0201, viewGroup0, false);  // layout:view_like_post_title_item
            L.m(view0);
            return new b(view0);
        }

        private final void z(View view0, int v) {
            public static final class com.dcinside.app.view.c0.a.b extends com.dcinside.app.rx.bus.I.a {
                @Override  // com.dcinside.app.rx.bus.I$a
                public boolean a(@l com.dcinside.app.type.o o0) {
                    L.p(o0, "galleryMode");
                    return false;
                }

                @Override  // com.dcinside.app.rx.bus.I$a
                public boolean b() {
                    return true;
                }

                @Override  // com.dcinside.app.rx.bus.I$a
                public boolean c(@l com.dcinside.app.type.o o0) {
                    L.p(o0, "galleryMode");
                    return true;
                }

                @Override  // com.dcinside.app.rx.bus.I$a
                public boolean d(@l com.dcinside.app.type.o o0) {
                    L.p(o0, "galleryMode");
                    return true;
                }
            }

            if((this.a == null ? 0 : this.a.size()) <= v) {
                return;
            }
            z z0 = this.w(v);
            String s = z0.b();
            if(s == null) {
                return;
            }
            Integer integer0 = z0.d();
            if(integer0.intValue() <= 0) {
                integer0 = null;
            }
            if(integer0 != null) {
                int v1 = (int)integer0;
                com.dcinside.app.view.c0.a.b c0$a$b0 = new com.dcinside.app.view.c0.a.b();
                Context context0 = Al.h(view0.getContext());
                if(context0 != null) {
                    c.a(context0, new I(s, v1, c0$a$b0));
                }
            }
        }
    }

    static final class b extends ViewHolder {
        @l
        private final AppCompatTextView a;
        @l
        private final AppCompatTextView b;
        @l
        private final AppCompatTextView c;
        @l
        private final AppCompatTextView d;
        @l
        private final AppCompatTextView[] e;

        public b(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B0C65);  // id:read_like_posts_title_post_item0
            L.o(view1, "findViewById(...)");
            this.a = (AppCompatTextView)view1;
            View view2 = view0.findViewById(0x7F0B0C66);  // id:read_like_posts_title_post_item1
            L.o(view2, "findViewById(...)");
            this.b = (AppCompatTextView)view2;
            View view3 = view0.findViewById(0x7F0B0C67);  // id:read_like_posts_title_post_item2
            L.o(view3, "findViewById(...)");
            this.c = (AppCompatTextView)view3;
            View view4 = view0.findViewById(0x7F0B0C68);  // id:read_like_posts_title_post_item3
            L.o(view4, "findViewById(...)");
            this.d = (AppCompatTextView)view4;
            this.e = new AppCompatTextView[]{((AppCompatTextView)view1), ((AppCompatTextView)view2), ((AppCompatTextView)view3), ((AppCompatTextView)view4)};
        }

        @l
        public final AppCompatTextView[] e() {
            return this.e;
        }

        @l
        public final AppCompatTextView f() {
            return this.a;
        }

        @l
        public final AppCompatTextView h() {
            return this.b;
        }

        @l
        public final AppCompatTextView i() {
            return this.c;
        }

        @l
        public final AppCompatTextView j() {
            return this.d;
        }
    }

    private LoopRecyclerViewPager a;
    private AppCompatTextView b;
    private View c;
    private View d;
    @m
    private rx.o e;
    private int f;
    @m
    private String g;
    @m
    private String h;
    @m
    private e0 i;
    @l
    private final List j;

    public c0(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.f = -1;
        this.j = new ArrayList();
        this.Q();
        this.P();
    }

    public final void N(@m String s, @m String s1, int v) {
        if(dl.a.D1() == com.dcinside.app.type.z.e.d()) {
            kl.b(new rx.o[]{this.e});
            this.a0(null);
            return;
        }
        if(s == null) {
            return;
        }
        if(s1 == null) {
            return;
        }
        m0.a.a a$a0 = m0.a.a;
        if(a$a0.g(new CharSequence[]{s, s1})) {
            this.i = null;
            this.g = null;
            this.h = null;
            this.f = -1;
            kl.b(new rx.o[]{this.e});
            this.a0(null);
            return;
        }
        if(!a$a0.d(this.g, s) || this.f != v) {
            kl.b(new rx.o[]{this.e});
            this.g = s;
            this.h = s1;
            this.f = v;
            this.i = null;
        }
        if(!kl.a(new rx.o[]{this.e})) {
            return;
        }
        this.b0();
    }

    private final void O() {
        LoopRecyclerViewPager loopRecyclerViewPager0 = this.a;
        View view0 = null;
        if(loopRecyclerViewPager0 == null) {
            L.S("vwRecycler");
            loopRecyclerViewPager0 = null;
        }
        loopRecyclerViewPager0.setVisibility(8);
        AppCompatTextView appCompatTextView0 = this.b;
        if(appCompatTextView0 == null) {
            L.S("vwTitle");
            appCompatTextView0 = null;
        }
        appCompatTextView0.setVisibility(8);
        View view1 = this.c;
        if(view1 == null) {
            L.S("vwNextPage");
            view1 = null;
        }
        view1.setVisibility(8);
        View view2 = this.d;
        if(view2 == null) {
            L.S("vwPrevPage");
        }
        else {
            view0 = view2;
        }
        view0.setVisibility(8);
    }

    private final void P() {
        LoopRecyclerViewPager loopRecyclerViewPager0 = this.a;
        LoopRecyclerViewPager loopRecyclerViewPager1 = null;
        if(loopRecyclerViewPager0 == null) {
            L.S("vwRecycler");
            loopRecyclerViewPager0 = null;
        }
        loopRecyclerViewPager0.setLayoutManager(new NonPredictiveLayoutManager(0, false));
        LoopRecyclerViewPager loopRecyclerViewPager2 = this.a;
        if(loopRecyclerViewPager2 == null) {
            L.S("vwRecycler");
        }
        else {
            loopRecyclerViewPager1 = loopRecyclerViewPager2;
        }
        loopRecyclerViewPager1.addOnItemTouchListener(this);
    }

    private final void Q() {
        @f(c = "com.dcinside.app.view.PostReadLikePostsTitleView$initViews$1", f = "PostReadLikePostsTitleView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.c0.c extends o implements p {
            int k;
            final c0 l;

            com.dcinside.app.view.c0.c(c0 c00, d d0) {
                this.l = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.c0.c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.R();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.PostReadLikePostsTitleView$initViews$2", f = "PostReadLikePostsTitleView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.c0.d extends o implements p {
            int k;
            final c0 l;

            com.dcinside.app.view.c0.d(c0 c00, d d0) {
                this.l = c00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.view.c0.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.S();
                return S0.a;
            }
        }

        this.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View.inflate(this.getContext(), 0x7F0E024E, this);  // layout:view_read_like_posts_title
        View view0 = this.findViewById(0x7F0B0C69);  // id:read_like_posts_title_post_recycler
        L.o(view0, "findViewById(...)");
        this.a = (LoopRecyclerViewPager)view0;
        View view1 = this.findViewById(0x7F0B0C63);  // id:read_like_posts_title_gall_name
        L.o(view1, "findViewById(...)");
        this.b = (AppCompatTextView)view1;
        View view2 = this.findViewById(0x7F0B0C64);  // id:read_like_posts_title_next
        L.o(view2, "findViewById(...)");
        this.c = view2;
        View view3 = this.findViewById(0x7F0B0C6A);  // id:read_like_posts_title_prev
        L.o(view3, "findViewById(...)");
        this.d = view3;
        View view4 = this.c;
        if(view4 == null) {
            L.S("vwNextPage");
            view4 = null;
        }
        r.M(view4, null, new com.dcinside.app.view.c0.c(this, null), 1, null);
        View view5 = this.d;
        if(view5 == null) {
            L.S("vwPrevPage");
            view5 = null;
        }
        r.M(view5, null, new com.dcinside.app.view.c0.d(this, null), 1, null);
    }

    private final void R() {
        LoopRecyclerViewPager loopRecyclerViewPager0 = this.a;
        LoopRecyclerViewPager loopRecyclerViewPager1 = null;
        if(loopRecyclerViewPager0 == null) {
            L.S("vwRecycler");
            loopRecyclerViewPager0 = null;
        }
        int v = loopRecyclerViewPager0.getCurrentPosition();
        LoopRecyclerViewPager loopRecyclerViewPager2 = this.a;
        if(loopRecyclerViewPager2 == null) {
            L.S("vwRecycler");
        }
        else {
            loopRecyclerViewPager1 = loopRecyclerViewPager2;
        }
        loopRecyclerViewPager1.smoothScrollToPosition(v + 1);
    }

    private final void S() {
        LoopRecyclerViewPager loopRecyclerViewPager0 = this.a;
        LoopRecyclerViewPager loopRecyclerViewPager1 = null;
        if(loopRecyclerViewPager0 == null) {
            L.S("vwRecycler");
            loopRecyclerViewPager0 = null;
        }
        int v = loopRecyclerViewPager0.getCurrentPosition();
        LoopRecyclerViewPager loopRecyclerViewPager2 = this.a;
        if(loopRecyclerViewPager2 == null) {
            L.S("vwRecycler");
        }
        else {
            loopRecyclerViewPager1 = loopRecyclerViewPager2;
        }
        loopRecyclerViewPager1.smoothScrollToPosition(v - 1);
    }

    private final g T() {
        static final class e extends N implements Function1 {
            final String e;
            final String f;

            e(String s, String s1) {
                this.e = s;
                this.f = s1;
                super(1);
            }

            public final List a(List list0) {
                List list1 = new ArrayList();
                int v = kotlin.random.f.a.m(10);
                if(v < 2) {
                    String s = this.e;
                    if(s != null) {
                        list1.add(new com.dcinside.app.read.Z.a(0, s, this.f));
                        list1.add(new com.dcinside.app.read.Z.a(2, "dcbest", 0x7F150532));  // string:live_best "실시간 베스트"
                        return list1;
                    }
                    goto label_7;
                }
                else {
                label_7:
                    if(v < 8) {
                        L.m(list0);
                        if(list0.isEmpty()) {
                            list1.add(new com.dcinside.app.read.Z.a(2, "dcbest", 0x7F150532));  // string:live_best "실시간 베스트"
                        }
                        else {
                            list1.addAll(list0);
                        }
                    }
                    else {
                        list1.add(new com.dcinside.app.read.Z.a(2, "dcbest", 0x7F150532));  // string:live_best "실시간 베스트"
                    }
                }
                list1.add(new com.dcinside.app.read.Z.a(2, "dcbest", 0x7F150532));  // string:live_best "실시간 베스트"
                return list1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        static final class com.dcinside.app.view.c0.f extends N implements Function1 {
            final c0 e;

            com.dcinside.app.view.c0.f(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final g a(List list0) {
                this.e.j.clear();
                L.m(list0);
                return this.e.W(list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }

        String s = this.g;
        String s1 = this.h == null ? "" : this.h;
        g g0 = Z.a.i(s).g3((Object object0) -> {
            L.p(new e(s, s1), "$tmp0");
            return (List)new e(s, s1).invoke(object0);
        }).f2((Object object0) -> {
            L.p(new com.dcinside.app.view.c0.f(this), "$tmp0");
            return (g)new com.dcinside.app.view.c0.f(this).invoke(object0);
        });
        L.o(g0, "flatMap(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final List U(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g V(Function1 function10, Object object0) [...]

    private final g W(List list0) {
        static final class com.dcinside.app.view.c0.g extends N implements Function1 {
            final c0 e;
            final List f;

            com.dcinside.app.view.c0.g(c0 c00, List list0) {
                this.e = c00;
                this.f = list0;
                super(1);
            }

            public final g a(Throwable throwable0) {
                if(throwable0 instanceof com.dcinside.app.http.g) {
                    return this.e.W(this.f);
                }
                return !(throwable0 instanceof IOException) || !L.g("404, Not Found", throwable0.getMessage()) ? g.X1(throwable0) : this.e.W(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        com.dcinside.app.read.Z.a z$a0 = (com.dcinside.app.read.Z.a)u.G2(list0);
        if(z$a0 == null) {
            g g0 = g.X1(new NullPointerException("request list is empty"));
            L.o(g0, "error(...)");
            return g0;
        }
        this.j.add(z$a0);
        list0.remove(z$a0);
        g g1 = this.f0(z$a0.a(), z$a0.b(), z$a0.c()).Z3((Object object0) -> {
            L.p(new com.dcinside.app.view.c0.g(this, list0), "$tmp0");
            return (g)new com.dcinside.app.view.c0.g(this, list0).invoke(object0);
        });
        L.o(g1, "onErrorResumeNext(...)");
        return g1;
    }

    // 检测为 Lambda 实现
    private static final g X(Function1 function10, Object object0) [...]

    private final void Z(Throwable throwable0) {
        timber.log.b.a.y(throwable0);
        this.a0(null);
    }

    private final void a0(e0 e00) {
        CharSequence charSequence0;
        List list0;
        this.i = e00;
        LoopRecyclerViewPager loopRecyclerViewPager0 = null;
        if(e00 == null) {
            list0 = u.H();
            charSequence0 = null;
        }
        else {
            if(e00 == null) {
                list0 = u.H();
            }
            else {
                List list1 = e00.a();
                if(list1 == null) {
                    list0 = u.H();
                }
                else {
                    list0 = u.l(list1);
                    if(list0 == null) {
                        list0 = u.H();
                    }
                }
            }
            charSequence0 = (String)e00.b().f();
        }
        AppCompatTextView appCompatTextView0 = this.b;
        if(appCompatTextView0 == null) {
            L.S("vwTitle");
            appCompatTextView0 = null;
        }
        appCompatTextView0.setText(charSequence0);
        AppCompatTextView appCompatTextView1 = this.b;
        if(appCompatTextView1 == null) {
            L.S("vwTitle");
            appCompatTextView1 = null;
        }
        int v = 0;
        appCompatTextView1.setVisibility(0);
        LoopRecyclerViewPager loopRecyclerViewPager1 = this.a;
        if(loopRecyclerViewPager1 == null) {
            L.S("vwRecycler");
            loopRecyclerViewPager1 = null;
        }
        if(list0.isEmpty()) {
            v = 8;
        }
        loopRecyclerViewPager1.setVisibility(v);
        LoopRecyclerViewPager loopRecyclerViewPager2 = this.a;
        if(loopRecyclerViewPager2 == null) {
            L.S("vwRecycler");
            loopRecyclerViewPager2 = null;
        }
        Adapter recyclerView$Adapter0 = loopRecyclerViewPager2.getAdapter();
        if(!(recyclerView$Adapter0 instanceof a)) {
            recyclerView$Adapter0 = null;
        }
        a c0$a0 = (a)recyclerView$Adapter0;
        if(c0$a0 == null) {
            c0$a0 = new a();
        }
        c0$a0.A(list0);
        LoopRecyclerViewPager loopRecyclerViewPager3 = this.a;
        if(loopRecyclerViewPager3 == null) {
            L.S("vwRecycler");
            loopRecyclerViewPager3 = null;
        }
        if(loopRecyclerViewPager3.getAdapter() == null) {
            LoopRecyclerViewPager loopRecyclerViewPager4 = this.a;
            if(loopRecyclerViewPager4 == null) {
                L.S("vwRecycler");
            }
            else {
                loopRecyclerViewPager0 = loopRecyclerViewPager4;
            }
            loopRecyclerViewPager0.setAdapter(c0$a0);
        }
        c0$a0.notifyDataSetChanged();
        if(list0.isEmpty()) {
            this.O();
            return;
        }
        this.i0();
    }

    private final void b0() {
        static final class h extends N implements Function1 {
            final c0 e;

            h(c0 c00) {
                this.e = c00;
                super(1);
            }

            public final void a(e0 e00) {
                this.e.a0(e00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((e0)object0));
                return S0.a;
            }
        }

        if(!kl.a(new rx.o[]{this.e})) {
            return;
        }
        this.e = g.v1(new com.dcinside.app.view.Z(this)).y5((Object object0) -> {
            L.p(new h(this), "$tmp0");
            new h(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.m(throwable0);
            this.Z(throwable0);
        });
    }

    private static final g c0(c0 c00) {
        L.p(c00, "this$0");
        e0 e00 = c00.i;
        if(e00 != null) {
            g g0 = g.Q2(e00);
            return g0 == null ? c00.T() : g0;
        }
        return c00.T();
    }

    // 检测为 Lambda 实现
    private static final void d0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void e0(c0 c00, Throwable throwable0) [...]

    private final g f0(int v, String s, String s1) {
        static final class i extends N implements Function1 {
            final String e;
            final String f;
            final int g;

            i(String s, String s1, int v) {
                this.e = s;
                this.f = s1;
                this.g = v;
                super(1);
            }

            public final e0 a(List list0) {
                V v0 = r0.a(this.e, this.f);
                L.m(list0);
                return new e0(this.g, v0, list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }

        return g.v1(new W(s, v, s1));
    }

    private static final g g0(String s, int v, String s1) {
        L.p(s, "$galleryId");
        L.p(s1, "$galleryName");
        return L.g(s, "dcbest") ? Z.h().g3((Object object0) -> {
            L.p(new i(s, s1, v), "$tmp0");
            return (e0)new i(s, s1, v).invoke(object0);
        }) : uk.EF(v, s, s1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public void h(@l RecyclerView recyclerView0, @l MotionEvent motionEvent0) {
        L.p(recyclerView0, "rv");
        L.p(motionEvent0, "e");
    }

    // 检测为 Lambda 实现
    private static final e0 h0(Function1 function10, Object object0) [...]

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public boolean i(@l RecyclerView recyclerView0, @l MotionEvent motionEvent0) {
        L.p(recyclerView0, "rv");
        L.p(motionEvent0, "e");
        Context context0 = recyclerView0.getContext();
        com.dcinside.app.post.c0 c00 = context0 instanceof com.dcinside.app.post.c0 ? ((com.dcinside.app.post.c0)context0) : null;
        if(c00 == null) {
            return false;
        }
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                c00.u5(false);
                return false;
            }
            case 1: 
            case 3: {
                c00.u5(true);
                return false;
            }
            default: {
                return false;
            }
        }
    }

    private final void i0() {
        LoopRecyclerViewPager loopRecyclerViewPager0 = this.a;
        View view0 = null;
        if(loopRecyclerViewPager0 == null) {
            L.S("vwRecycler");
            loopRecyclerViewPager0 = null;
        }
        loopRecyclerViewPager0.setVisibility(0);
        AppCompatTextView appCompatTextView0 = this.b;
        if(appCompatTextView0 == null) {
            L.S("vwTitle");
            appCompatTextView0 = null;
        }
        appCompatTextView0.setVisibility(0);
        View view1 = this.c;
        if(view1 == null) {
            L.S("vwNextPage");
            view1 = null;
        }
        view1.setVisibility(0);
        View view2 = this.d;
        if(view2 == null) {
            L.S("vwPrevPage");
        }
        else {
            view0 = view2;
        }
        view0.setVisibility(0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public void j(boolean z) {
    }
}

