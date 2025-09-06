package com.dcinside.app.totalsearch.post;

import Y.x2;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager;
import com.dcinside.app.Application;
import com.dcinside.app.ad.naver.a;
import com.dcinside.app.post.q;
import com.dcinside.app.realm.B;
import com.dcinside.app.rx.bus.p0;
import com.dcinside.app.totalsearch.TotalSearchActivity;
import com.dcinside.app.totalsearch.a.b;
import com.dcinside.app.totalsearch.a.d;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.uk;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.ranges.s;
import l0.c;
import rx.g;
import rx.o;
import rx.subscriptions.f;
import y4.l;
import y4.m;

@s0({"SMAP\nTotalPostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalPostFragment.kt\ncom/dcinside/app/totalsearch/post/TotalPostFragment\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,339:1\n25#2:340\n25#2:341\n25#2:342\n25#2:343\n25#2:344\n*S KotlinDebug\n*F\n+ 1 TotalPostFragment.kt\ncom/dcinside/app/totalsearch/post/TotalPostFragment\n*L\n211#1:340\n253#1:341\n273#1:342\n291#1:343\n308#1:344\n*E\n"})
public final class u extends Fragment implements a, com.dcinside.app.post.q.a, c {
    @m
    private x2 a;
    @l
    private final e b;
    private int c;
    private int d;
    @m
    private o e;
    private boolean f;
    @m
    private String g;
    private o h;
    private rx.subjects.c i;
    private int j;
    @l
    private final SharedPreferences.OnSharedPreferenceChangeListener k;
    private boolean l;

    public u() {
        this.b = new e(this);
        this.d = 1;
        this.f = true;
        this.h = f.e();
        this.i = rx.subjects.c.C7();
        this.k = (SharedPreferences sharedPreferences0, String s) -> {
            L.p(this, "this$0");
            this.N0(s);
        };
    }

    private final void D0(boolean z) {
        static final class com.dcinside.app.totalsearch.post.u.a extends N implements Function1 {
            final u e;

            com.dcinside.app.totalsearch.post.u.a(u u0) {
                this.e = u0;
                super(1);
            }

            public final void a(@l com.dcinside.app.totalsearch.a a0) {
                L.p(a0, "totalSearch");
                this.e.O0(a0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.totalsearch.a)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        Adapter recyclerView$Adapter0 = null;
        TotalSearchActivity totalSearchActivity0 = fragmentActivity0 instanceof TotalSearchActivity ? ((TotalSearchActivity)fragmentActivity0) : null;
        String s = totalSearchActivity0 == null ? null : totalSearchActivity0.e2();
        x2 x20 = this.G0();
        L.o(x20.c, "searchPostRecycler");
        Adapter recyclerView$Adapter1 = x20.c.getAdapter();
        if(recyclerView$Adapter1 instanceof e) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(totalSearchActivity0 != null && !m0.a.a.i(s) && ((e)recyclerView$Adapter0) != null) {
            this.d = 1;
            this.g = s;
            ((e)recyclerView$Adapter0).i0();
            this.j = 0;
            kl.b(new o[]{this.e});
            this.W0(true);
            this.e = uk.EG(this.g, 1, new d[]{com.dcinside.app.totalsearch.a.e.f, (z ? b.d : b.c)}).y5((Object object0) -> {
                L.p(new com.dcinside.app.totalsearch.post.u.a(this), "$tmp0");
                new com.dcinside.app.totalsearch.post.u.a(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                L.p(throwable0, "error");
                this.P0(throwable0);
            });
        }
    }

    @Override  // com.dcinside.app.post.q$a
    public void E() {
        if(this.d >= this.c) {
            Dl.D(this.getContext(), 0x7F1500A8);  // string:alert_last_page "마지막 페이지입니다."
            x2 x20 = this.G0();
            L.o(x20.c, "searchPostRecycler");
            Adapter recyclerView$Adapter0 = x20.c.getAdapter();
            if(!(recyclerView$Adapter0 instanceof e)) {
                recyclerView$Adapter0 = null;
            }
            if(((e)recyclerView$Adapter0) != null) {
                ((e)recyclerView$Adapter0).q0();
            }
        }
        else {
            this.H0();
        }
    }

    // 检测为 Lambda 实现
    private static final void E0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void F0(u u0, Throwable throwable0) [...]

    private final x2 G0() {
        x2 x20 = this.a;
        L.m(x20);
        return x20;
    }

    private final void H0() {
        @s0({"SMAP\nTotalPostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalPostFragment.kt\ncom/dcinside/app/totalsearch/post/TotalPostFragment$loadNextPage$3\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,339:1\n25#2:340\n*S KotlinDebug\n*F\n+ 1 TotalPostFragment.kt\ncom/dcinside/app/totalsearch/post/TotalPostFragment$loadNextPage$3\n*L\n189#1:340\n*E\n"})
        static final class com.dcinside.app.totalsearch.post.u.b extends N implements Function1 {
            final u e;

            com.dcinside.app.totalsearch.post.u.b(u u0) {
                this.e = u0;
                super(1);
            }

            public final void a(@m com.dcinside.app.totalsearch.a a0) {
                boolean z = true;
                ++this.e.d;
                x2 x20 = this.e.G0();
                L.o(x20.c, "searchPostRecycler");
                Adapter recyclerView$Adapter0 = x20.c.getAdapter();
                if(!(recyclerView$Adapter0 instanceof e)) {
                    recyclerView$Adapter0 = null;
                }
                if(((e)recyclerView$Adapter0) == null) {
                    return;
                }
                if(this.e.j <= 0 || this.e.d % 2 == 0) {
                    z = false;
                }
                ((e)recyclerView$Adapter0).h0(a0, z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.totalsearch.a)object0));
                return S0.a;
            }
        }

        this.e = uk.EG(this.g, this.d + 1, new d[]{com.dcinside.app.totalsearch.a.e.f, (this.f ? b.d : b.c)}).R1(() -> {
            L.p(this, "this$0");
            this.W0(true);
        }).T1(() -> {
            L.p(this, "this$0");
            this.W0(false);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.totalsearch.post.u.b(this), "$tmp0");
            new com.dcinside.app.totalsearch.post.u.b(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(throwable0, "error");
            if(throwable0 instanceof com.dcinside.app.http.a) {
                int v = B.E.k0() == null ? 5 : 4;
                B.E.s(this, v, "", 0);
                return;
            }
            Dl.G(Application.e.c(), throwable0.getMessage());
        });
    }

    // 检测为 Lambda 实现
    private static final void I0(u u0) [...]

    // 检测为 Lambda 实现
    private static final void J0(u u0) [...]

    // 检测为 Lambda 实现
    private static final void K0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void L0(u u0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void M0(u u0, SharedPreferences sharedPreferences0, String s) [...]

    private final void N0(String s) {
        if(L.g("TotalSearchPostFilter", s)) {
            boolean z = ll.M();
            if(this.f == z) {
                return;
            }
            this.f = z;
            this.D0(z);
        }
    }

    @Override  // com.dcinside.app.ad.naver.a
    public void O(int v) {
        this.i.onNext(v);
    }

    private final void O0(com.dcinside.app.totalsearch.a a0) {
        static final class com.dcinside.app.totalsearch.post.u.c extends N implements Function1 {
            final u e;

            com.dcinside.app.totalsearch.post.u.c(u u0) {
                this.e = u0;
                super(1);
            }

            public final void a(V v0) {
                com.dcinside.app.totalsearch.a a0 = (com.dcinside.app.totalsearch.a)v0.a();
                Integer integer0 = (Integer)v0.b();
                L.m(integer0);
                if(((int)integer0) > 0 && this.e.j == 0) {
                    int v1 = jl.a.w();
                    this.e.j = v1;
                }
                int v2 = 0;
                this.e.W0(false);
                this.e.G0().c.scrollToPosition(0);
                ArrayList arrayList0 = a0 == null ? null : a0.g();
                u u0 = this.e;
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    v2 = ((com.dcinside.app.totalsearch.a.c)arrayList0.get(0)).a();
                }
                u0.c = v2;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.totalsearch.post.u.d extends N implements Function1 {
            public static final com.dcinside.app.totalsearch.post.u.d e;

            static {
                com.dcinside.app.totalsearch.post.u.d.e = new com.dcinside.app.totalsearch.post.u.d();
            }

            com.dcinside.app.totalsearch.post.u.d() {
                super(1);
            }

            public final Integer a(Throwable throwable0) {
                return 0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        static final class com.dcinside.app.totalsearch.post.u.e extends N implements A3.o {
            public static final com.dcinside.app.totalsearch.post.u.e e;

            static {
                com.dcinside.app.totalsearch.post.u.e.e = new com.dcinside.app.totalsearch.post.u.e();
            }

            com.dcinside.app.totalsearch.post.u.e() {
                super(2);
            }

            public final V a(@m com.dcinside.app.totalsearch.a a0, Integer integer0) {
                return r0.a(a0, integer0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((com.dcinside.app.totalsearch.a)object0), ((Integer)object1));
            }
        }

        g g0 = this.i.i6(1500L, TimeUnit.MILLISECONDS).a4((Object object0) -> {
            L.p(com.dcinside.app.totalsearch.post.u.d.e, "$tmp0");
            return (Integer)com.dcinside.app.totalsearch.post.u.d.e.invoke(object0);
        });
        g g1 = g.u0(g.Q2(a0), g0, (Object object0, Object object1) -> {
            L.p(com.dcinside.app.totalsearch.post.u.e.e, "$tmp0");
            return (V)com.dcinside.app.totalsearch.post.u.e.e.invoke(object0, object1);
        });
        kl.b(new o[]{this.h});
        this.h = g1.H5(1).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.totalsearch.post.u.c(this), "$tmp0");
            new com.dcinside.app.totalsearch.post.u.c(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.W0(false);
        });
        x2 x20 = this.G0();
        L.o(x20.c, "searchPostRecycler");
        Adapter recyclerView$Adapter0 = x20.c.getAdapter();
        if(!(recyclerView$Adapter0 instanceof e)) {
            recyclerView$Adapter0 = null;
        }
        if(((e)recyclerView$Adapter0) != null) {
            ((e)recyclerView$Adapter0).r0(a0, this.g);
        }
    }

    private final void P0(Throwable throwable0) {
        this.W0(false);
        if(throwable0 instanceof com.dcinside.app.http.a) {
            int v = B.E.k0() == null ? 5 : 4;
            B.E.s(this, v, "", 0);
            return;
        }
        Dl.G(Application.e.c(), throwable0.getMessage());
        throwable0.printStackTrace();
    }

    // 检测为 Lambda 实现
    private static final void Q0(Function1 function10, Object object0) [...]

    @Override  // l0.c
    public void R() {
        TotalSearchActivity totalSearchActivity0 = (TotalSearchActivity)this.getActivity();
        if(totalSearchActivity0 == null) {
            return;
        }
        LayoutManager recyclerView$LayoutManager0 = this.G0().c.getLayoutManager();
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = recyclerView$LayoutManager0 instanceof StickyHeaderGridLayoutManager ? ((StickyHeaderGridLayoutManager)recyclerView$LayoutManager0) : null;
        if(stickyHeaderGridLayoutManager0 == null) {
            return;
        }
        if(s.u(stickyHeaderGridLayoutManager0.Q2(true), stickyHeaderGridLayoutManager0.R2(true)) <= 1) {
            totalSearchActivity0.i2();
            return;
        }
        totalSearchActivity0.G2();
    }

    // 检测为 Lambda 实现
    private static final void R0(u u0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final Integer S0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final V T0(A3.o o0, Object object0, Object object1) [...]

    // 检测为 Lambda 实现
    private static final void U0(int v, View view0, com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager.e stickyHeaderGridLayoutManager$e0, int v1) [...]

    private final void V0(boolean z) {
        if(this.l != z) {
            this.l = z;
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 != null) {
                com.dcinside.app.rx.bus.c.a(fragmentActivity0, new p0(z));
            }
        }
    }

    @Override  // com.dcinside.app.post.q$a
    public boolean W() {
        x2 x20 = this.G0();
        L.o(x20.c, "searchPostRecycler");
        Adapter recyclerView$Adapter0 = x20.c.getAdapter();
        if(!(recyclerView$Adapter0 instanceof e)) {
            recyclerView$Adapter0 = null;
        }
        if(((e)recyclerView$Adapter0) == null) {
            return false;
        }
        LayoutManager recyclerView$LayoutManager0 = this.G0().c.getLayoutManager();
        if(recyclerView$LayoutManager0 instanceof StickyHeaderGridLayoutManager) {
            int v = s.u(((StickyHeaderGridLayoutManager)recyclerView$LayoutManager0).X2(), ((StickyHeaderGridLayoutManager)recyclerView$LayoutManager0).Y2());
            return v >= 0 && v == ((e)recyclerView$Adapter0).getItemCount() - 1 && kl.a(new o[]{this.e}) && this.d < this.c;
        }
        return false;
    }

    private final void W0(boolean z) {
        x2 x20 = this.G0();
        L.o(x20.c, "searchPostRecycler");
        Adapter recyclerView$Adapter0 = x20.c.getAdapter();
        if(!(recyclerView$Adapter0 instanceof e)) {
            recyclerView$Adapter0 = null;
        }
        if(((e)recyclerView$Adapter0) == null) {
            return;
        }
        if(!z) {
            this.G0().b.setVisibility(8);
        }
        else if(((e)recyclerView$Adapter0).getItemCount() == 0) {
            this.G0().b.setVisibility(0);
        }
        ((e)recyclerView$Adapter0).s0(z);
    }

    @Override  // l0.c
    public void a() {
        TotalSearchActivity totalSearchActivity0 = (TotalSearchActivity)this.getActivity();
        if(totalSearchActivity0 != null && !m0.a.a.d(this.g, totalSearchActivity0.e2())) {
            this.D0(this.f);
        }
    }

    @Override  // l0.c
    public void a0() {
        this.G0().c.scrollToPosition(0);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = x2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.G0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ll.q0(true);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ll.B0(this.k);
        kl.b(new o[]{this.e, this.h});
        this.e = null;
        this.i.d();
        this.G0().c.clearOnScrollListeners();
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        public static final class com.dcinside.app.totalsearch.post.u.f extends OnScrollListener {
            final u a;

            com.dcinside.app.totalsearch.post.u.f(u u0) {
                this.a = u0;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrollStateChanged(@l RecyclerView recyclerView0, int v) {
                L.p(recyclerView0, "recyclerView");
                super.onScrollStateChanged(recyclerView0, v);
                this.a.V0(v != 0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrolled(@l RecyclerView recyclerView0, int v, int v1) {
                L.p(recyclerView0, "recyclerView");
                this.a.R();
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = new StickyHeaderGridLayoutManager(1);
        stickyHeaderGridLayoutManager0.n3((int v, View view0, com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager.e stickyHeaderGridLayoutManager$e0, int v1) -> {
            L.p(view0, "headerView");
            view0.setTag(0x7F0B0F51, Boolean.TRUE);  // id:sticky_header_view
        });
        stickyHeaderGridLayoutManager0.m3(0);
        this.G0().c.setLayoutManager(stickyHeaderGridLayoutManager0);
        this.G0().c.setAdapter(this.b);
        x2 x20 = this.G0();
        l0.b b0 = new l0.b(this.G0().c.getContext());
        x20.c.addItemDecoration(b0);
        x2 x21 = this.G0();
        q q0 = new q(this);
        x21.c.addOnScrollListener(q0);
        x2 x22 = this.G0();
        com.dcinside.app.totalsearch.post.u.f u$f0 = new com.dcinside.app.totalsearch.post.u.f(this);
        x22.c.addOnScrollListener(u$f0);
        ll.Q(this.k);
        this.a();
    }
}

