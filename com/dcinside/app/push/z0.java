package com.dcinside.app.push;

import A3.p;
import Y.p2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.model.f0;
import com.dcinside.app.post.q.a;
import com.dcinside.app.post.q;
import com.dcinside.app.push.adapter.c;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nNewPostNoticeListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewPostNoticeListFragment.kt\ncom/dcinside/app/push/NewPostNoticeListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1557#2:299\n1628#2,3:300\n774#2:303\n865#2,2:304\n*S KotlinDebug\n*F\n+ 1 NewPostNoticeListFragment.kt\ncom/dcinside/app/push/NewPostNoticeListFragment\n*L\n139#1:299\n139#1:300,3\n145#1:303\n145#1:304,2\n*E\n"})
public final class z0 extends Fragment implements a, i, j, k {
    @m
    private p2 a;
    private int b;
    @l
    private q c;
    private boolean d;
    @l
    private final c e;
    @m
    private o f;
    @m
    private o g;
    @l
    private r h;

    public z0() {
        public static final class r extends OnScrollListener {
            final z0 a;

            r(z0 z00) {
                this.a = z00;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrollStateChanged(@l RecyclerView recyclerView0, int v) {
                L.p(recyclerView0, "recyclerView");
                this.a.u1(v == 0);
            }
        }

        this.b = 1;
        this.c = new q(this);
        this.e = new c(false, this);
        this.h = new r(this);
    }

    @Override  // com.dcinside.app.post.q$a
    public void E() {
        this.q1();
    }

    @Override  // com.dcinside.app.push.i
    public void F(@l String s, @m String s1) {
        com.dcinside.app.push.i.a.a(this, s, s1);
    }

    @Override  // com.dcinside.app.push.k
    public void H(boolean z) {
        this.e.R(z);
        this.e.notifyDataSetChanged();
        this.j1().d.setVisibility((z ? 0 : 8));
        this.e.D();
    }

    @Override  // com.dcinside.app.push.j
    public void Q(boolean z, boolean z1) {
        if(z) {
            this.j1().b.setEnabled(true);
            this.j1().b.setAlpha(1.0f);
        }
        else {
            this.j1().b.setEnabled(false);
            this.j1().b.setAlpha(0.7f);
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        PushNoticeListActivity pushNoticeListActivity0 = fragmentActivity0 instanceof PushNoticeListActivity ? ((PushNoticeListActivity)fragmentActivity0) : null;
        if(pushNoticeListActivity0 != null) {
            pushNoticeListActivity0.c2(z1);
        }
    }

    private final void Q0() {
        int v = 0;
        boolean z = this.e.getItemCount() <= 1;
        this.e.D();
        TextView textView0 = this.j1().e;
        if(!z) {
            v = 8;
        }
        textView0.setVisibility(v);
        FragmentActivity fragmentActivity0 = this.getActivity();
        PushNoticeListActivity pushNoticeListActivity0 = fragmentActivity0 instanceof PushNoticeListActivity ? ((PushNoticeListActivity)fragmentActivity0) : null;
        if(pushNoticeListActivity0 != null) {
            pushNoticeListActivity0.h2(z);
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean R0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void S0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void T0(AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

    private final void U0() {
        static final class d extends N implements Function1 {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150277);  // string:delete_all_push_notice "전체 알림을 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
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


        static final class f extends N implements Function1 {
            final z0 e;

            f(z0 z00) {
                this.e = z00;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.Y0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(d.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(e.e, "$tmp0");
            return (Boolean)e.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new f(this), "$tmp0");
            new f(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(appCompatActivity0, "$activity");
            Dl.D(appCompatActivity0, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean V0(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.post.q$a
    public boolean W() {
        if(this.d) {
            return false;
        }
        if(kl.a(new o[]{this.f})) {
            LayoutManager recyclerView$LayoutManager0 = this.j1().f.getLayoutManager();
            LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
            return (linearLayoutManager0 == null ? -1 : linearLayoutManager0.i()) >= this.e.getItemCount() - 6;
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static final void W0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void X0(AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

    private final void Y0() {
        static final class g extends N implements Function1 {
            final z0 e;

            g(z0 z00) {
                this.e = z00;
                super(1);
            }

            public final void a(f0 f00) {
                this.e.j1().h.setVisibility(8);
                this.e.l1(false);
                FragmentActivity fragmentActivity0 = this.e.getActivity();
                PushNoticeListActivity pushNoticeListActivity0 = fragmentActivity0 instanceof PushNoticeListActivity ? ((PushNoticeListActivity)fragmentActivity0) : null;
                if(pushNoticeListActivity0 == null) {
                    return;
                }
                pushNoticeListActivity0.f2(false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        this.j1().h.setVisibility(0);
        o o0 = this.g;
        if(o0 != null) {
            o0.l();
        }
        this.g = uk.hk().y5((Object object0) -> {
            L.p(new g(this), "$tmp0");
            new g(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.j1().h.setVisibility(8);
            Dl.D(this.getActivity(), 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final void Z0(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.push.k
    public void a() {
        this.l1(false);
    }

    // 检测为 Lambda 实现
    private static final void a1(z0 z00, Throwable throwable0) [...]

    private final void b1(String[] arr_s) {
        static final class h extends N implements Function1 {
            final z0 e;
            final String[] f;

            h(z0 z00, String[] arr_s) {
                this.e = z00;
                this.f = arr_s;
                super(1);
            }

            public final void a(f0 f00) {
                this.e.j1().h.setVisibility(8);
                this.e.e.E(((String[])Arrays.copyOf(this.f, this.f.length)));
                this.e.Q0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        this.j1().h.setVisibility(0);
        o o0 = this.g;
        if(o0 != null) {
            o0.l();
        }
        this.g = uk.kk(((String[])Arrays.copyOf(arr_s, arr_s.length))).y5((Object object0) -> {
            L.p(new h(this, arr_s), "$tmp0");
            new h(this, arr_s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.j1().h.setVisibility(8);
            Dl.D(this.getActivity(), 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    @Override  // com.dcinside.app.push.k
    public void c() {
        this.e.Q();
    }

    // 检测为 Lambda 实现
    private static final void c1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void d1(z0 z00, Throwable throwable0) [...]

    private final void e1() {
        static final class com.dcinside.app.push.z0.i extends N implements Function1 {
            public static final com.dcinside.app.push.z0.i e;

            static {
                com.dcinside.app.push.z0.i.e = new com.dcinside.app.push.z0.i();
            }

            com.dcinside.app.push.z0.i() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F15027D);  // string:delete_push_notice "선택한 알림을 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.push.z0.j extends N implements Function1 {
            public static final com.dcinside.app.push.z0.j e;

            static {
                com.dcinside.app.push.z0.j.e = new com.dcinside.app.push.z0.j();
            }

            com.dcinside.app.push.z0.j() {
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


        @s0({"SMAP\nNewPostNoticeListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewPostNoticeListFragment.kt\ncom/dcinside/app/push/NewPostNoticeListFragment$deleteSelectedItems$3\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,298:1\n37#2,2:299\n*S KotlinDebug\n*F\n+ 1 NewPostNoticeListFragment.kt\ncom/dcinside/app/push/NewPostNoticeListFragment$deleteSelectedItems$3\n*L\n216#1:299,2\n*E\n"})
        static final class com.dcinside.app.push.z0.k extends N implements Function1 {
            final z0 e;

            com.dcinside.app.push.z0.k(z0 z00) {
                this.e = z00;
                super(1);
            }

            public final void a(Boolean boolean0) {
                String[] arr_s = (String[])this.e.e.I().toArray(new String[0]);
                String[] arr_s1 = (String[])Arrays.copyOf(arr_s, arr_s.length);
                this.e.b1(arr_s1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(com.dcinside.app.push.z0.i.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.push.z0.j.e, "$tmp0");
            return (Boolean)com.dcinside.app.push.z0.j.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.z0.k(this), "$tmp0");
            new com.dcinside.app.push.z0.k(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(appCompatActivity0, "$activity");
            Dl.D(appCompatActivity0, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean f1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void g1(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.push.i
    public void h(@l String s, @m String s1) {
        static final class com.dcinside.app.push.z0.a extends N implements Function1 {
            public static final com.dcinside.app.push.z0.a e;

            static {
                com.dcinside.app.push.z0.a.e = new com.dcinside.app.push.z0.a();
            }

            com.dcinside.app.push.z0.a() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F15027D);  // string:delete_push_notice "선택한 알림을 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
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


        static final class com.dcinside.app.push.z0.c extends N implements Function1 {
            final z0 e;
            final String f;

            com.dcinside.app.push.z0.c(z0 z00, String s) {
                this.e = z00;
                this.f = s;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.b1(new String[]{this.f});
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(s, "dataValue");
        FragmentActivity fragmentActivity0 = this.getActivity();
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(com.dcinside.app.push.z0.a.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(b.e, "$tmp0");
            return (Boolean)b.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.z0.c(this, s), "$tmp0");
            new com.dcinside.app.push.z0.c(this, s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(appCompatActivity0, "$activity");
            Dl.D(appCompatActivity0, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final void h1(AppCompatActivity appCompatActivity0, Throwable throwable0) [...]

    private final rx.g i1(g0.d d0) {
        List list0 = u.H();
        FragmentActivity fragmentActivity0 = this.getActivity();
        com.dcinside.app.base.g g0 = fragmentActivity0 instanceof com.dcinside.app.base.g ? ((com.dcinside.app.base.g)fragmentActivity0) : null;
        if(g0 == null) {
            rx.g g1 = rx.g.Q2(r0.a(list0, Boolean.FALSE));
            L.o(g1, "just(...)");
            return g1;
        }
        F0 f00 = g0.F1();
        if(f00 == null) {
            rx.g g2 = rx.g.Q2(r0.a(list0, Boolean.FALSE));
            L.o(g2, "just(...)");
            return g2;
        }
        List list1 = d0.a();
        if(list1 == null) {
            list1 = u.H();
        }
        ArrayList arrayList0 = new ArrayList(u.b0(list1, 10));
        for(Object object0: list1) {
            g0.d.a d$a0 = (g0.d.a)object0;
            com.dcinside.app.realm.e.a e$a0 = com.dcinside.app.realm.e.k;
            com.dcinside.app.realm.e e0 = e$a0.c(f00, d$a0.f());
            if(e0 != null) {
                com.dcinside.app.realm.e e1 = e$a0.c(f00, "");
                if(e1 != null) {
                    d$a0.u(e$a0.b(e0, null, d$a0.b(), d$a0.p(), d$a0.i()));
                    if(!d$a0.r()) {
                        e$a0.b(e1, null, d$a0.b(), d$a0.p(), d$a0.i());
                    }
                }
            }
            arrayList0.add(d$a0);
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            g0.c c0 = g0.c.d.a(((g0.d.a)object1).a());
            if(!((g0.d.a)object1).r() || !g0.c.d.b(c0)) {
                arrayList1.add(object1);
            }
        }
        rx.g g3 = rx.g.Q2(r0.a(arrayList1, Boolean.valueOf(list1.size() < 20)));
        L.o(g3, "just(...)");
        return g3;
    }

    private final p2 j1() {
        p2 p20 = this.a;
        L.m(p20);
        return p20;
    }

    // 检测为 Lambda 实现
    private static final void k1(z0 z00) [...]

    private final void l1(boolean z) {
        this.e.C();
        this.b = 1;
        this.d = false;
        this.m1(z);
    }

    private final void m1(boolean z) {
        static final class n extends N implements Function1 {
            final z0 e;

            n(z0 z00) {
                this.e = z00;
                super(1);
            }

            public final rx.g a(g0.d d0) {
                L.m(d0);
                return this.e.i1(d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((g0.d)object0));
            }
        }


        static final class com.dcinside.app.push.z0.o extends N implements Function1 {
            final z0 e;
            final boolean f;

            com.dcinside.app.push.z0.o(z0 z00, boolean z) {
                this.e = z00;
                this.f = z;
                super(1);
            }

            public final void a(V v0) {
                this.e.e.S(((List)v0.e()));
                ++this.e.b;
                this.e.v1(false, this.f);
                this.e.d = ((Boolean)v0.f()).booleanValue();
                this.e.Q0();
                this.e.j1().i.setRefreshing(false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V)object0));
                return S0.a;
            }
        }

        this.v1(true, z);
        o o0 = this.f;
        if(o0 != null) {
            o0.l();
        }
        this.f = uk.Gk(g0.b.c, this.b).f2((Object object0) -> {
            L.p(new n(this), "$tmp0");
            return (rx.g)new n(this).invoke(object0);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.z0.o(this, z), "$tmp0");
            new com.dcinside.app.push.z0.o(this, z).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.v1(false, z);
            this.j1().i.setRefreshing(false);
        });
    }

    // 检测为 Lambda 实现
    private static final rx.g n1(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.push.k
    public void o() {
        this.e.D();
    }

    // 检测为 Lambda 实现
    private static final void o1(Function1 function10, Object object0) [...]

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = p2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.j1().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        kl.b(new o[]{this.f, this.g});
        p2 p20 = this.j1();
        p20.f.removeOnScrollListener(this.c);
        p20.f.removeOnScrollListener(this.h);
        this.f = null;
        this.g = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity fragmentActivity0 = this.getActivity();
        PushNoticeListActivity pushNoticeListActivity0 = fragmentActivity0 instanceof PushNoticeListActivity ? ((PushNoticeListActivity)fragmentActivity0) : null;
        if(pushNoticeListActivity0 == null) {
            return;
        }
        this.H(pushNoticeListActivity0.W1());
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.NewPostNoticeListFragment$onViewCreated$1", f = "NewPostNoticeListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.z0.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final z0 l;

            com.dcinside.app.push.z0.l(z0 z00, kotlin.coroutines.d d0) {
                this.l = z00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.push.z0.l(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.l.U0();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.push.NewPostNoticeListFragment$onViewCreated$2", f = "NewPostNoticeListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.z0.m extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final z0 m;

            com.dcinside.app.push.z0.m(z0 z00, kotlin.coroutines.d d0) {
                this.m = z00;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.push.z0.m z0$m0 = new com.dcinside.app.push.z0.m(this.m, d0);
                z0$m0.l = view0;
                return z0$m0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                if(((View)this.l).isEnabled()) {
                    this.m.e1();
                }
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        p2 p20 = this.j1();
        L.o(p20.c, "newPostDeleteAll");
        com.dcinside.app.push.z0.l z0$l0 = new com.dcinside.app.push.z0.l(this, null);
        com.dcinside.app.internal.r.M(p20.c, null, z0$l0, 1, null);
        p2 p21 = this.j1();
        L.o(p21.b, "newPostDelete");
        com.dcinside.app.push.z0.m z0$m0 = new com.dcinside.app.push.z0.m(this, null);
        com.dcinside.app.internal.r.M(p21.b, null, z0$m0, 1, null);
        p2 p22 = this.j1();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(p22.f.getContext(), 1, false);
        p22.f.setLayoutManager(nonPredictiveLayoutManager0);
        p22.f.setAdapter(this.e);
        p22.f.addOnScrollListener(this.c);
        p22.f.addOnScrollListener(this.h);
        Context context0 = p22.f.getContext();
        L.o(context0, "getContext(...)");
        A0 a00 = new A0(context0);
        p22.f.addItemDecoration(a00);
        p2 p23 = this.j1();
        com.dcinside.app.push.f0 f00 = () -> {
            L.p(this, "this$0");
            this.l1(true);
        };
        p23.i.setOnRefreshListener(f00);
        this.m1(false);
    }

    // 检测为 Lambda 实现
    private static final void p1(z0 z00, boolean z, Throwable throwable0) [...]

    private final void q1() {
        static final class com.dcinside.app.push.z0.p extends N implements Function1 {
            final z0 e;

            com.dcinside.app.push.z0.p(z0 z00) {
                this.e = z00;
                super(1);
            }

            public final rx.g a(g0.d d0) {
                L.m(d0);
                return this.e.i1(d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((g0.d)object0));
            }
        }


        static final class com.dcinside.app.push.z0.q extends N implements Function1 {
            final z0 e;

            com.dcinside.app.push.z0.q(z0 z00) {
                this.e = z00;
                super(1);
            }

            public final void a(V v0) {
                this.e.e.w(((List)v0.e()));
                ++this.e.b;
                this.e.d = ((Boolean)v0.f()).booleanValue();
                this.e.v1(false, false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((V)object0));
                return S0.a;
            }
        }

        if(this.f != null && !this.f.j()) {
            return;
        }
        this.v1(true, false);
        o o0 = this.f;
        if(o0 != null) {
            o0.l();
        }
        this.f = uk.Gk(g0.b.c, this.b).f2((Object object0) -> {
            L.p(new com.dcinside.app.push.z0.p(this), "$tmp0");
            return (rx.g)new com.dcinside.app.push.z0.p(this).invoke(object0);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.z0.q(this), "$tmp0");
            new com.dcinside.app.push.z0.q(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.v1(false, false);
        });
    }

    // 检测为 Lambda 实现
    private static final rx.g r1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void t1(z0 z00, Throwable throwable0) [...]

    private final void u1(boolean z) {
        FragmentActivity fragmentActivity0 = this.getActivity();
        PushNoticeListActivity pushNoticeListActivity0 = fragmentActivity0 instanceof PushNoticeListActivity ? ((PushNoticeListActivity)fragmentActivity0) : null;
        if(pushNoticeListActivity0 != null) {
            pushNoticeListActivity0.g2(z);
        }
    }

    private final void v1(boolean z, boolean z1) {
        if(this.a == null) {
            return;
        }
        p2 p20 = this.j1();
        this.e.U(z, p20.f, z1);
    }
}

