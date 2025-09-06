package com.dcinside.app.totalsearch.total;

import Y.y2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.Application;
import com.dcinside.app.ad.naver.a;
import com.dcinside.app.realm.B;
import com.dcinside.app.rx.bus.p0;
import com.dcinside.app.totalsearch.TotalSearchActivity;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ql.b;
import com.dcinside.app.util.uk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.c;
import rx.g;
import rx.o;
import rx.subscriptions.f;
import y4.m;

@s0({"SMAP\nTotalMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalMainFragment.kt\ncom/dcinside/app/totalsearch/total/TotalMainFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,257:1\n257#2,2:258\n*S KotlinDebug\n*F\n+ 1 TotalMainFragment.kt\ncom/dcinside/app/totalsearch/total/TotalMainFragment\n*L\n192#1:258,2\n*E\n"})
public final class l extends Fragment implements a, c {
    @m
    private y2 a;
    @m
    private d b;
    private o c;
    private o d;
    private rx.subjects.c e;
    private boolean f;
    @m
    private String g;

    public l() {
        this.c = f.e();
        this.d = f.e();
        this.e = rx.subjects.c.C7();
    }

    // 检测为 Lambda 实现
    private static final void A0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void B0(l l0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final boolean C0(l l0, View view0, int v) [...]

    private final void D0(boolean z) {
        FrameLayout frameLayout0 = this.u0().b;
        L.o(frameLayout0, "searchTotalProgress");
        frameLayout0.setVisibility((z ? 0 : 8));
    }

    // 检测为 Lambda 实现
    private static final void E0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void F0(l l0, Throwable throwable0) [...]

    private final void G0(boolean z) {
        if(this.f != z) {
            this.f = z;
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 != null) {
                com.dcinside.app.rx.bus.c.a(fragmentActivity0, new p0(z));
            }
        }
    }

    @Override  // com.dcinside.app.ad.naver.a
    public void O(int v) {
        this.e.onNext(v);
    }

    @Override  // l0.c
    public void R() {
        LayoutManager recyclerView$LayoutManager0 = this.u0().c.getLayoutManager();
        TotalSearchActivity totalSearchActivity0 = null;
        LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
        if(linearLayoutManager0 == null) {
            return;
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 instanceof TotalSearchActivity) {
            totalSearchActivity0 = (TotalSearchActivity)fragmentActivity0;
        }
        if(totalSearchActivity0 == null) {
            return;
        }
        if(linearLayoutManager0.s() <= 0) {
            totalSearchActivity0.i2();
            return;
        }
        totalSearchActivity0.G2();
    }

    @Override  // l0.c
    public void a() {
        static final class e extends N implements Function1 {
            final l e;
            final String f;

            e(l l0, String s) {
                this.e = l0;
                this.f = s;
                super(1);
            }

            public final void a(com.dcinside.app.totalsearch.a a0) {
                L.m(a0);
                L.o(this.f, "$searchText");
                this.e.w0(a0, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.totalsearch.a)object0));
                return S0.a;
            }
        }

        TotalSearchActivity totalSearchActivity0 = (TotalSearchActivity)this.getActivity();
        if(totalSearchActivity0 == null) {
            return;
        }
        String s = totalSearchActivity0.e2();
        if(s != null && !m0.a.a.d(this.g, s)) {
            this.g = s;
            kl.b(new o[]{this.c});
            this.D0(true);
            this.c = uk.FG(s, new com.dcinside.app.totalsearch.a.d[]{com.dcinside.app.totalsearch.a.e.c}).y5((Object object0) -> {
                L.p(new e(this, s), "$tmp0");
                new e(this, s).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                L.m(throwable0);
                this.x0(throwable0);
            });
        }
    }

    @Override  // l0.c
    public void a0() {
        this.u0().c.scrollToPosition(0);
    }

    @Override  // androidx.fragment.app.Fragment
    @y4.l
    public View onCreateView(@y4.l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = y2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.u0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.u0().c.clearOnScrollListeners();
        kl.b(new o[]{this.c, this.d});
        this.e.d();
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@y4.l View view0, @m Bundle bundle0) {
        public static final class com.dcinside.app.totalsearch.total.l.d extends OnScrollListener {
            final l a;

            com.dcinside.app.totalsearch.total.l.d(l l0) {
                this.a = l0;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrollStateChanged(@y4.l RecyclerView recyclerView0, int v) {
                L.p(recyclerView0, "recyclerView");
                super.onScrollStateChanged(recyclerView0, v);
                this.a.G0(v != 0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrolled(@y4.l RecyclerView recyclerView0, int v, int v1) {
                L.p(recyclerView0, "recyclerView");
                this.a.R();
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        if(this.getActivity() == null) {
            return;
        }
        if(this.b == null) {
            this.b = new d(this);
        }
        y2 y20 = this.u0();
        L.o(y20.c, "searchTotalRecycler");
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        y20.c.setLayoutManager(nonPredictiveLayoutManager0);
        y20.c.setAdapter(this.b);
        this.t0();
        com.dcinside.app.totalsearch.total.e e0 = (View view0, int v) -> {
            L.p(this, "this$0");
            return this.v0(v);
        };
        b.e(y20.c, e0);
        com.dcinside.app.totalsearch.total.l.d l$d0 = new com.dcinside.app.totalsearch.total.l.d(this);
        y20.c.addOnScrollListener(l$d0);
        this.a();
    }

    private final void t0() {
        y2 y20 = this.u0();
        com.dcinside.app.totalsearch.total.m m0 = new com.dcinside.app.totalsearch.total.m(this.getContext());
        y20.c.addItemDecoration(m0);
    }

    private final y2 u0() {
        y2 y20 = this.a;
        L.m(y20);
        return y20;
    }

    private final boolean v0(int v) {
        TotalSearchActivity totalSearchActivity0 = (TotalSearchActivity)this.getActivity();
        if(totalSearchActivity0 == null) {
            return false;
        }
        d d0 = this.b;
        if(d0 == null) {
            return false;
        }
        switch(d0.getItemViewType(v)) {
            case 1: {
                totalSearchActivity0.f2().setCurrentItem(1);
                totalSearchActivity0.c2();
                return true;
            }
            case 2: {
                com.dcinside.app.totalsearch.a.f a$f1 = d0.z(v);
                if(a$f1 != null) {
                    String s1 = a$f1.f();
                    if(s1 != null) {
                        new com.dcinside.app.util.Xk.a(s1, 0, 0, null, true, false, false, false, false, false, null, false, null, null, 0x3FEE, null).a(totalSearchActivity0);
                        return true;
                    }
                }
                return false;
            }
            case 4: {
                totalSearchActivity0.f2().setCurrentItem(3);
                totalSearchActivity0.c2();
                return true;
            }
            case 7: {
                com.dcinside.app.totalsearch.a.f a$f0 = d0.z(v);
                if(a$f0 == null) {
                    return false;
                }
                String s = a$f0.f();
                if(s == null) {
                    return false;
                }
                new com.dcinside.app.util.Xk.a(s, a$f0.i(), 0, null, false, false, true, false, true, false, null, false, null, null, 16060, null).b(this);
                return true;
            }
            case 6: 
            case 8: {
                totalSearchActivity0.f2().setCurrentItem(4);
                totalSearchActivity0.c2();
                return true;
            }
            case 11: {
                totalSearchActivity0.f2().setCurrentItem(2);
                totalSearchActivity0.c2();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private final void w0(com.dcinside.app.totalsearch.a a0, String s) {
        static final class com.dcinside.app.totalsearch.total.l.a extends N implements A3.o {
            public static final com.dcinside.app.totalsearch.total.l.a e;

            static {
                com.dcinside.app.totalsearch.total.l.a.e = new com.dcinside.app.totalsearch.total.l.a();
            }

            com.dcinside.app.totalsearch.total.l.a() {
                super(2);
            }

            public final com.dcinside.app.totalsearch.a a(com.dcinside.app.totalsearch.a a0, Integer integer0) {
                return a0;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((com.dcinside.app.totalsearch.a)object0), ((Integer)object1));
            }
        }


        static final class com.dcinside.app.totalsearch.total.l.b extends N implements Function1 {
            final l e;

            com.dcinside.app.totalsearch.total.l.b(l l0) {
                this.e = l0;
                super(1);
            }

            public final void a(com.dcinside.app.totalsearch.a a0) {
                this.e.D0(false);
                this.e.u0().c.scrollToPosition(0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.totalsearch.a)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.totalsearch.total.l.c extends N implements Function1 {
            public static final com.dcinside.app.totalsearch.total.l.c e;

            static {
                com.dcinside.app.totalsearch.total.l.c.e = new com.dcinside.app.totalsearch.total.l.c();
            }

            com.dcinside.app.totalsearch.total.l.c() {
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

        g g0 = this.e.i6(1500L, TimeUnit.MILLISECONDS).a4((Object object0) -> {
            L.p(com.dcinside.app.totalsearch.total.l.c.e, "$tmp0");
            return (Integer)com.dcinside.app.totalsearch.total.l.c.e.invoke(object0);
        });
        kl.b(new o[]{this.d});
        this.d = g.u0(g.Q2(a0), g0, (Object object0, Object object1) -> {
            L.p(com.dcinside.app.totalsearch.total.l.a.e, "$tmp0");
            return (com.dcinside.app.totalsearch.a)com.dcinside.app.totalsearch.total.l.a.e.invoke(object0, object1);
        }).H5(1).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.totalsearch.total.l.b(this), "$tmp0");
            new com.dcinside.app.totalsearch.total.l.b(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.D0(false);
        });
        d d0 = this.b;
        if(d0 != null) {
            d0.C(a0, s);
        }
    }

    private final void x0(Throwable throwable0) {
        this.D0(false);
        if(throwable0 instanceof com.dcinside.app.http.a) {
            int v = B.E.k0() == null ? 5 : 4;
            B.E.s(this, v, "", 0);
            return;
        }
        Dl.G(Application.e.c(), throwable0.getMessage());
        throwable0.printStackTrace();
    }

    // 检测为 Lambda 实现
    private static final Integer y0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final com.dcinside.app.totalsearch.a z0(A3.o o0, Object object0, Object object1) [...]
}

