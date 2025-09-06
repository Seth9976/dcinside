package com.dcinside.app.main.adapter;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.base.e;
import com.dcinside.app.internal.r;
import com.dcinside.app.type.q;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.dl;
import com.google.android.material.tabs.TabLayout.i;
import com.google.android.material.tabs.TabLayout;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.m;

@s0({"SMAP\nMainFilterHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainFilterHolder.kt\ncom/dcinside/app/main/adapter/MainFilterHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 IdViewHolder.kt\ncom/dcinside/app/base/IdViewHolder\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n257#2,2:99\n20#3:101\n25#4:102\n1#5:103\n*S KotlinDebug\n*F\n+ 1 MainFilterHolder.kt\ncom/dcinside/app/main/adapter/MainFilterHolder\n*L\n65#1:99,2\n81#1:101\n81#1:102\n*E\n"})
public final class l extends e {
    @y4.l
    private final TextView a;
    @y4.l
    private final TabLayout b;
    @y4.l
    private final View c;
    @y4.l
    private final View d;
    @y4.l
    private final View e;
    @y4.l
    private final View f;
    @y4.l
    private final com.dcinside.app.main.adapter.l.e g;

    public l(@y4.l ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.main.adapter.MainFilterHolder$1", f = "MainFilterHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            Object l;
            final l m;

            a(l l0, d d0) {
                this.m = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                a l$a0 = new a(this.m, d0);
                l$a0.l = view0;
                return l$a0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.m(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.adapter.MainFilterHolder$2", f = "MainFilterHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            Object l;
            final l m;

            b(l l0, d d0) {
                this.m = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                b l$b0 = new b(this.m, d0);
                l$b0.l = view0;
                return l$b0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.m(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.adapter.MainFilterHolder$3", f = "MainFilterHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            Object l;
            final l m;

            c(l l0, d d0) {
                this.m = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                c l$c0 = new c(this.m, d0);
                l$c0.l = view0;
                return l$c0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.m(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.main.adapter.MainFilterHolder$4$1", f = "MainFilterHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.main.adapter.l.d extends o implements p {
            int k;
            final l l;

            com.dcinside.app.main.adapter.l.d(l l0, d d0) {
                this.l = l0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                return new com.dcinside.app.main.adapter.l.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.n();
                return S0.a;
            }
        }


        public static final class com.dcinside.app.main.adapter.l.e implements com.google.android.material.tabs.TabLayout.f {
            final l a;

            com.dcinside.app.main.adapter.l.e(l l0) {
                this.a = l0;
                super();
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void N(@y4.l i tabLayout$i0) {
                L.p(tabLayout$i0, "tab");
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void R(@y4.l i tabLayout$i0) {
                L.p(tabLayout$i0, "tab");
            }

            @Override  // com.google.android.material.tabs.TabLayout$c
            public void j(@y4.l i tabLayout$i0) {
                L.p(tabLayout$i0, "tab");
                com.dcinside.app.type.p p0 = com.dcinside.app.type.p.c.a(tabLayout$i0.k());
                this.a.l(p0);
            }
        }

        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E0208);  // layout:view_main_best_filter
        View view0 = this.itemView.findViewById(0x7F0B01B4);  // id:best_title
        L.o(view0, "findViewById(...)");
        this.a = (TextView)view0;
        View view1 = this.itemView.findViewById(0x7F0B01B3);  // id:best_tab
        L.o(view1, "findViewById(...)");
        this.b = (TabLayout)view1;
        View view2 = this.itemView.findViewById(0x7F0B01B0);  // id:best_sort_ranking_wrap
        L.o(view2, "findViewById(...)");
        this.c = view2;
        View view3 = this.itemView.findViewById(0x7F0B01AF);  // id:best_sort_count
        L.o(view3, "findViewById(...)");
        this.d = view3;
        View view4 = this.itemView.findViewById(0x7F0B01B1);  // id:best_sort_recommend
        L.o(view4, "findViewById(...)");
        this.e = view4;
        View view5 = this.itemView.findViewById(0x7F0B01B2);  // id:best_sort_reply
        L.o(view5, "findViewById(...)");
        this.f = view5;
        this.g = new com.dcinside.app.main.adapter.l.e(this);
        r.M(view3, null, new a(this, null), 1, null);
        r.M(view4, null, new b(this, null), 1, null);
        r.M(view5, null, new c(this, null), 1, null);
        view3.setActivated(true);
        Context context0 = ((TextView)view0).getContext();
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
        com.dcinside.app.span.i i0 = new com.dcinside.app.span.i(0x7F080284, null, Dk.b(0x7F07007B), 0, true, 10, null);  // drawable:ic_list_head_live_blue_tinted
        L.m(context0);
        com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new com.dcinside.app.span.b(context0, i0));
        spannableStringBuilder0.append(' ');
        spannableStringBuilder0.append(((TextView)view0).getText());
        ((TextView)view0).setText(spannableStringBuilder0);
        r.M(((TextView)view0), null, new com.dcinside.app.main.adapter.l.d(this, null), 1, null);
    }

    public final void k(@y4.l com.dcinside.app.type.p p0, @y4.l q q0) {
        L.p(p0, "tab");
        L.p(q0, "sort");
        this.b.t();
        i tabLayout$i0 = this.b.D(p0.d());
        this.b.R(tabLayout$i0);
        boolean z = true;
        this.c.setVisibility((p0 == com.dcinside.app.type.p.g ? 8 : 0));
        this.d.setActivated(q0 == q.e);
        this.e.setActivated(q0 == q.f);
        View view0 = this.f;
        if(q0 != q.g) {
            z = false;
        }
        view0.setActivated(z);
        this.b.h(this.g);
    }

    private final void l(com.dcinside.app.type.p p0) {
        dl.a.B4(p0);
    }

    private final void m(View view0) {
        q q0;
        boolean z = L.g(view0, this.d);
        this.d.setActivated(z);
        boolean z1 = L.g(view0, this.e);
        this.e.setActivated(z1);
        boolean z2 = L.g(view0, this.f);
        this.f.setActivated(z2);
        if(this.d.isActivated()) {
            q0 = q.e;
        }
        else if(this.e.isActivated()) {
            q0 = q.f;
        }
        else {
            q0 = this.f.isActivated() ? q.g : q.e;
        }
        dl.a.C4(q0);
    }

    private final void n() {
        RecyclerView recyclerView0 = this.e();
        Adapter recyclerView$Adapter0 = null;
        if(recyclerView0 != null) {
            Adapter recyclerView$Adapter1 = recyclerView0.getAdapter();
            if(recyclerView$Adapter1 instanceof com.dcinside.app.main.adapter.f) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            recyclerView$Adapter0 = (com.dcinside.app.main.adapter.f)recyclerView$Adapter0;
        }
        if(recyclerView$Adapter0 == null) {
            return;
        }
        ((com.dcinside.app.main.adapter.f)recyclerView$Adapter0).P("dcbest");
    }

    public final void o() {
        this.b.t();
    }
}

