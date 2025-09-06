package com.dcinside.app.totalsearch.video;

import Y.z2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.Application;
import com.dcinside.app.ad.naver.a;
import com.dcinside.app.realm.B;
import com.dcinside.app.rx.bus.p0;
import com.dcinside.app.totalsearch.TotalSearchActivity;
import com.dcinside.app.totalsearch.a.d;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.c;
import rx.o;
import rx.subscriptions.f;
import y4.l;
import y4.m;

@s0({"SMAP\nTotalVideoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalVideoFragment.kt\ncom/dcinside/app/totalsearch/video/TotalVideoFragment\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 3 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,280:1\n25#2:281\n35#3:282\n257#4,2:283\n257#4,2:285\n*S KotlinDebug\n*F\n+ 1 TotalVideoFragment.kt\ncom/dcinside/app/totalsearch/video/TotalVideoFragment\n*L\n93#1:281\n104#1:282\n158#1:283,2\n163#1:285,2\n*E\n"})
public final class q extends Fragment implements a, com.dcinside.app.post.q.a, c {
    @m
    private z2 a;
    private int b;
    private int c;
    @m
    private o d;
    @m
    private String e;
    @l
    private final e f;
    private o g;
    private rx.subjects.c h;
    private boolean i;

    public q() {
        this.c = 1;
        this.f = new e();
        this.g = f.e();
        this.h = rx.subjects.c.C7();
    }

    private final void A0() {
        static final class com.dcinside.app.totalsearch.video.q.c extends N implements Function1 {
            final q e;

            com.dcinside.app.totalsearch.video.q.c(q q0) {
                this.e = q0;
                super(1);
            }

            public final void a(@l com.dcinside.app.totalsearch.a a0) {
                L.p(a0, "totalSearch");
                this.e.H0(a0);
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
        if(m0.a.a.i(s)) {
            return;
        }
        this.c = 1;
        this.e = s;
        this.f.A();
        kl.b(new o[]{this.d});
        this.N0(true);
        this.d = uk.EG(this.e, 1, new d[]{com.dcinside.app.totalsearch.a.e.g}).y5((Object object0) -> {
            L.p(new com.dcinside.app.totalsearch.video.q.c(this), "$tmp0");
            new com.dcinside.app.totalsearch.video.q.c(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(throwable0, "error");
            this.I0(throwable0);
        });
    }

    // 检测为 Lambda 实现
    private static final void B0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void C0(q q0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void D0(q q0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.post.q$a
    public void E() {
        static final class com.dcinside.app.totalsearch.video.q.d extends N implements Function1 {
            final q e;

            com.dcinside.app.totalsearch.video.q.d(q q0) {
                this.e = q0;
                super(1);
            }

            public final void a(com.dcinside.app.totalsearch.a a0) {
                int v = this.e.c;
                this.e.c = v + 1;
                e e0 = this.e.f;
                L.m(a0);
                e0.z(a0);
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
        if(m0.a.a.i(totalSearchActivity0.e2())) {
            return;
        }
        if(this.d != null && !this.d.j()) {
            return;
        }
        this.d = uk.EG(this.e, this.c + 1, new d[]{com.dcinside.app.totalsearch.a.e.g}).R1(() -> {
            L.p(this, "this$0");
            this.P0(true);
        }).T1(() -> {
            L.p(this, "this$0");
            this.P0(false);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.totalsearch.video.q.d(this), "$tmp0");
            new com.dcinside.app.totalsearch.video.q.d(this).invoke(object0);
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
    private static final void E0(q q0) [...]

    // 检测为 Lambda 实现
    private static final void F0(q q0) [...]

    // 检测为 Lambda 实现
    private static final void G0(Function1 function10, Object object0) [...]

    private final void H0(com.dcinside.app.totalsearch.a a0) {
        static final class com.dcinside.app.totalsearch.video.q.e extends N implements Function1 {
            final q e;

            com.dcinside.app.totalsearch.video.q.e(q q0) {
                this.e = q0;
                super(1);
            }

            public final void a(com.dcinside.app.totalsearch.a a0) {
                this.e.N0(false);
                this.e.a0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.totalsearch.a)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.totalsearch.video.q.f extends N implements Function1 {
            public static final com.dcinside.app.totalsearch.video.q.f e;

            static {
                com.dcinside.app.totalsearch.video.q.f.e = new com.dcinside.app.totalsearch.video.q.f();
            }

            com.dcinside.app.totalsearch.video.q.f() {
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


        static final class g extends N implements A3.o {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
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

        ArrayList arrayList0 = a0.g();
        this.b = arrayList0 == null || arrayList0.isEmpty() ? 0 : ((com.dcinside.app.totalsearch.a.c)arrayList0.get(0)).a();
        rx.g g0 = this.h.i6(1500L, TimeUnit.MILLISECONDS).a4((Object object0) -> {
            L.p(com.dcinside.app.totalsearch.video.q.f.e, "$tmp0");
            return (Integer)com.dcinside.app.totalsearch.video.q.f.e.invoke(object0);
        });
        rx.g g1 = rx.g.u0(rx.g.Q2(a0), g0, (Object object0, Object object1) -> {
            L.p(g.e, "$tmp0");
            return (com.dcinside.app.totalsearch.a)g.e.invoke(object0, object1);
        });
        kl.b(new o[]{this.g});
        this.g = g1.H5(1).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.totalsearch.video.q.e(this), "$tmp0");
            new com.dcinside.app.totalsearch.video.q.e(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.N0(false);
        });
        this.f.I(a0, this.e);
    }

    private final void I0(Throwable throwable0) {
        this.P0(false);
        if(throwable0 instanceof com.dcinside.app.http.a) {
            int v = B.E.k0() == null ? 5 : 4;
            B.E.s(this, v, "", 0);
            return;
        }
        Dl.G(Application.e.c(), throwable0.getMessage());
    }

    // 检测为 Lambda 实现
    private static final Integer J0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final com.dcinside.app.totalsearch.a K0(A3.o o0, Object object0, Object object1) [...]

    // 检测为 Lambda 实现
    private static final void L0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void M0(q q0, Throwable throwable0) [...]

    private final void N0(boolean z) {
        FrameLayout frameLayout0 = this.y0().b;
        L.o(frameLayout0, "searchVideoFirstProgress");
        frameLayout0.setVisibility((z ? 0 : 8));
    }

    @Override  // com.dcinside.app.ad.naver.a
    public void O(int v) {
        this.h.onNext(v);
    }

    private final void O0(boolean z) {
        if(this.i != z) {
            this.i = z;
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 != null) {
                com.dcinside.app.rx.bus.c.a(fragmentActivity0, new p0(z));
            }
        }
    }

    private final void P0(boolean z) {
        ProgressBar progressBar0 = this.y0().c;
        L.o(progressBar0, "searchVideoProgress");
        progressBar0.setVisibility((z ? 0 : 8));
        this.f.J(z);
    }

    @Override  // l0.c
    public void R() {
        TotalSearchActivity totalSearchActivity0 = (TotalSearchActivity)this.getActivity();
        if(totalSearchActivity0 == null) {
            return;
        }
        LayoutManager recyclerView$LayoutManager0 = this.y0().d.getLayoutManager();
        GridLayoutManager gridLayoutManager0 = recyclerView$LayoutManager0 instanceof GridLayoutManager ? ((GridLayoutManager)recyclerView$LayoutManager0) : null;
        if(gridLayoutManager0 == null) {
            return;
        }
        if(gridLayoutManager0.f() <= 1) {
            totalSearchActivity0.i2();
            return;
        }
        totalSearchActivity0.G2();
    }

    @Override  // com.dcinside.app.post.q$a
    public boolean W() {
        LayoutManager recyclerView$LayoutManager0 = this.y0().d.getLayoutManager();
        if(recyclerView$LayoutManager0 instanceof GridLayoutManager) {
            int v = ((GridLayoutManager)recyclerView$LayoutManager0).i();
            return v >= 0 && v == this.f.getItemCount() - 1 && kl.a(new o[]{this.d}) && this.c < this.b;
        }
        return false;
    }

    @Override  // l0.c
    public void a() {
        TotalSearchActivity totalSearchActivity0 = (TotalSearchActivity)this.getActivity();
        if(totalSearchActivity0 != null && !m0.a.a.d(this.e, totalSearchActivity0.e2())) {
            this.A0();
        }
    }

    @Override  // l0.c
    public void a0() {
        this.y0().d.scrollToPosition(0);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = z2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.y0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.y0().d.clearOnScrollListeners();
        z2 z20 = this.y0();
        L.o(z20.d, "searchVideoRecycler");
        Adapter recyclerView$Adapter0 = z20.d.getAdapter();
        if(!(recyclerView$Adapter0 instanceof e)) {
            recyclerView$Adapter0 = null;
        }
        if(((e)recyclerView$Adapter0) != null) {
            ((e)recyclerView$Adapter0).release();
        }
        this.g.l();
        o o0 = this.d;
        if(o0 != null) {
            o0.l();
        }
        this.d = null;
        this.h.d();
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.f.H(this);
        this.z0();
        this.A0();
    }

    private final z2 y0() {
        z2 z20 = this.a;
        L.m(z20);
        return z20;
    }

    private final void z0() {
        @s0({"SMAP\nTotalVideoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalVideoFragment.kt\ncom/dcinside/app/totalsearch/video/TotalVideoFragment$initViews$1$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,280:1\n25#2:281\n*S KotlinDebug\n*F\n+ 1 TotalVideoFragment.kt\ncom/dcinside/app/totalsearch/video/TotalVideoFragment$initViews$1$1\n*L\n109#1:281\n*E\n"})
        public static final class com.dcinside.app.totalsearch.video.q.a extends SpanSizeLookup {
            final RecyclerView e;
            final int f;

            com.dcinside.app.totalsearch.video.q.a(RecyclerView recyclerView0, int v) {
                this.e = recyclerView0;
                this.f = v;
                super();
            }

            @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
            public int f(int v) {
                L.o(this.e, "$rv");
                Adapter recyclerView$Adapter0 = this.e.getAdapter();
                Integer integer0 = null;
                if(!(recyclerView$Adapter0 instanceof e)) {
                    recyclerView$Adapter0 = null;
                }
                if(((e)recyclerView$Adapter0) != null) {
                    integer0 = ((e)recyclerView$Adapter0).getItemViewType(v);
                }
                return (integer0 == null || ((int)integer0) != 2) && (integer0 == null || ((int)integer0) != 0) && (integer0 == null || ((int)integer0) != 3) && (integer0 == null || ((int)integer0) != 4) ? 1 : this.f;
            }
        }


        public static final class b extends OnScrollListener {
            final q a;

            b(q q0) {
                this.a = q0;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrollStateChanged(@l RecyclerView recyclerView0, int v) {
                L.p(recyclerView0, "recyclerView");
                super.onScrollStateChanged(recyclerView0, v);
                this.a.O0(v != 0);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrolled(@l RecyclerView recyclerView0, int v, int v1) {
                L.p(recyclerView0, "recyclerView");
                this.a.R();
            }
        }

        RecyclerView recyclerView0 = this.y0().d;
        Context context0 = recyclerView0.getContext();
        L.m(context0);
        Configuration configuration0 = context0.getResources().getConfiguration();
        L.o(configuration0, "getConfiguration(...)");
        int v = configuration0.orientation == 2 ? 4 : 2;
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(recyclerView0.getContext(), v);
        gridLayoutManager0.m4(new com.dcinside.app.totalsearch.video.q.a(recyclerView0, v));
        recyclerView0.setLayoutManager(gridLayoutManager0);
        recyclerView0.setAdapter(this.f);
        recyclerView0.addOnScrollListener(new com.dcinside.app.post.q(this));
        recyclerView0.addOnScrollListener(new b(this));
    }
}

