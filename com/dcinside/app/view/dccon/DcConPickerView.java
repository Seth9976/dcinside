package com.dcinside.app.view.dccon;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import androidx.viewpager2.widget.ViewPager2;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.dccon.setting.list.DcconListSettingActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.p;
import com.dcinside.app.model.s;
import com.dcinside.app.perform.e;
import com.dcinside.app.read.E;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.StateAnnounceView;
import com.dcinside.app.view.SwipeHandleTabLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import k0.c;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import rx.g;
import rx.o;
import rx.subscriptions.b;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nDcConPickerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcConPickerView.kt\ncom/dcinside/app/view/dccon/DcConPickerView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n*L\n1#1,318:1\n1#2:319\n60#3:320\n60#3:321\n*S KotlinDebug\n*F\n+ 1 DcConPickerView.kt\ncom/dcinside/app/view/dccon/DcConPickerView\n*L\n85#1:320\n88#1:321\n*E\n"})
public final class DcConPickerView extends ConstraintLayout {
    static final class d extends FragmentStateAdapter {
        @l
        private final List m;
        private final int n;
        @l
        private final DcConPickerView o;

        public d(@l FragmentActivity fragmentActivity0, @l E e0, @l DcConPickerView dcConPickerView0) {
            L.p(fragmentActivity0, "fa");
            L.p(e0, "data");
            L.p(dcConPickerView0, "view");
            super(fragmentActivity0);
            List list0 = e0.d();
            this.m = list0;
            this.n = list0.size();
            this.o = dcConPickerView0;
        }

        @l
        public final List S() {
            return this.m;
        }

        @l
        public final DcConPickerView T() {
            return this.o;
        }

        public final int U() {
            return this.n;
        }

        private final int V() {
            L.n(this.o, "null cannot be cast to non-null type android.view.View");
            return Math.max(4, this.o.getWidth() / 0);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.n + 1;
        }

        @Override  // androidx.viewpager2.adapter.FragmentStateAdapter
        @l
        public Fragment x(int v) {
            int v1 = this.V();
            if(v == 0) {
                Fragment fragment0 = new G();
                fragment0.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.view.dccon.DcconPickerRecentFragment.EXTRA_SPAN_COUNT", v1)}));
                return fragment0;
            }
            z z0 = new z();
            z0.setArguments(BundleKt.b(new V[]{r0.a("com.dcinside.app.view.dccon.DcconPickerItemFragment.EXTRA_SPAN_COUNT", v1), r0.a("com.dcinside.app.view.dccon.DcconPickerItemFragment.EXTRA_CURRENT_ITEM", ((int)(v - 1)))}));
            return z0;
        }
    }

    @m
    private o a;
    @m
    private o b;
    @l
    private final c c;
    @m
    private Function1 d;
    @m
    private Function1 e;
    @m
    private b f;
    @l
    private final View g;
    @l
    private final StateAnnounceView h;
    @l
    private final ViewPager2 i;
    @l
    private final SwipeHandleTabLayout j;
    @m
    private p k;

    @j
    public DcConPickerView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public DcConPickerView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public DcConPickerView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        @f(c = "com.dcinside.app.view.dccon.DcConPickerView$1", f = "DcConPickerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final DcConPickerView l;

            a(DcConPickerView dcConPickerView0, kotlin.coroutines.d d0) {
                this.l = dcConPickerView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.i0();
                return S0.a;
            }
        }


        static final class com.dcinside.app.view.dccon.DcConPickerView.b extends N implements Function1 {
            final DcConPickerView e;

            com.dcinside.app.view.dccon.DcConPickerView.b(DcConPickerView dcConPickerView0) {
                this.e = dcConPickerView0;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.o o0) {
                this.e.c0(o0.a(), o0.b());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.o)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.view.dccon.DcConPickerView.c extends N implements Function1 {
            final DcConPickerView e;

            com.dcinside.app.view.dccon.DcConPickerView.c(DcConPickerView dcConPickerView0) {
                this.e = dcConPickerView0;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.p p0) {
                boolean z = p0.a();
                this.e.b0(z);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.p)object0));
                return S0.a;
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.c = new c(() -> com.dcinside.app.read.G.c());
        View.inflate(context0, 0x7F0E01BD, this);  // layout:view_dccon_picker
        View view0 = this.findViewById(0x7F0B035B);  // id:dccon_picker_new_option_wrap
        L.o(view0, "findViewById(...)");
        this.g = view0;
        View view1 = this.findViewById(0x7F0B035D);  // id:dccon_picker_new_state
        L.o(view1, "findViewById(...)");
        this.h = (StateAnnounceView)view1;
        View view2 = this.findViewById(0x7F0B0359);  // id:dccon_picker_new_list
        L.o(view2, "findViewById(...)");
        this.i = (ViewPager2)view2;
        View view3 = this.findViewById(0x7F0B035E);  // id:dccon_picker_new_tab
        L.o(view3, "findViewById(...)");
        this.j = (SwipeHandleTabLayout)view3;
        r.M(view0, null, new a(this, null), 1, null);
        ((StateAnnounceView)view1).setOnRetryListener(() -> {
            L.p(this, "this$0");
            this.c.h();
        });
        this.setBackground(vk.e(context0, 0x1010054));
        o o0 = com.dcinside.app.rx.bus.c.c(context0, com.dcinside.app.rx.bus.o.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.view.dccon.DcConPickerView.b(this), "$tmp0");
            new com.dcinside.app.view.dccon.DcConPickerView.b(this).invoke(object0);
        });
        b b0 = this.f;
        if(b0 != null) {
            b0.a(o0);
        }
        o o1 = com.dcinside.app.rx.bus.c.c(context0, com.dcinside.app.rx.bus.p.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.view.dccon.DcConPickerView.c(this), "$tmp0");
            new com.dcinside.app.view.dccon.DcConPickerView.c(this).invoke(object0);
        });
        b b1 = this.f;
        if(b1 != null) {
            b1.a(o1);
        }
    }

    public DcConPickerView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    // 检测为 Lambda 实现
    private static final void N(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void O(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g V() [...]

    public final void W() {
        this.j.setEnableHelper(false);
    }

    // 检测为 Lambda 实现
    private static final void X(DcConPickerView dcConPickerView0) [...]

    public final void Z(int v, int v1, @m Intent intent0) {
        if((v == 0x3F7 || v == 0x3F8 || v == 1049) && -1 == v1) {
            this.l0();
        }
    }

    // 检测为 Lambda 实现
    private static final void a0(Function1 function10, Object object0) [...]

    private final void b0(boolean z) {
        this.i.setUserInputEnabled(!z);
    }

    private final void c0(p p0, boolean z) {
        static final class com.dcinside.app.view.dccon.DcConPickerView.f extends N implements Function1 {
            public static final com.dcinside.app.view.dccon.DcConPickerView.f e;

            static {
                com.dcinside.app.view.dccon.DcConPickerView.f.e = new com.dcinside.app.view.dccon.DcConPickerView.f();
            }

            com.dcinside.app.view.dccon.DcConPickerView.f() {
                super(1);
            }

            public final V a(s s0) {
                return r0.a(s0, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((s)object0));
            }
        }


        static final class com.dcinside.app.view.dccon.DcConPickerView.g extends N implements A3.o {
            public static final com.dcinside.app.view.dccon.DcConPickerView.g e;

            static {
                com.dcinside.app.view.dccon.DcConPickerView.g.e = new com.dcinside.app.view.dccon.DcConPickerView.g();
            }

            com.dcinside.app.view.dccon.DcConPickerView.g() {
                super(2);
            }

            public final V a(s s0, s s1) {
                return r0.a(s0, s1);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((s)object0), ((s)object1));
            }
        }

        if(z) {
            Function1 function10 = this.e;
            if(function10 != null) {
                function10.invoke(p0);
            }
        }
        else {
            Function1 function11 = this.d;
            if(function11 != null) {
                p p1 = jl.a.d0() ? this.k : null;
                g g0 = p1 == null ? uk.gk(p0).g3((Object object0) -> {
                    L.p(com.dcinside.app.view.dccon.DcConPickerView.f.e, "$tmp0");
                    return (V)com.dcinside.app.view.dccon.DcConPickerView.f.e.invoke(object0);
                }) : g.u0(uk.gk(p0), uk.gk(p1), (Object object0, Object object1) -> {
                    L.p(com.dcinside.app.view.dccon.DcConPickerView.g.e, "$tmp0");
                    return (V)com.dcinside.app.view.dccon.DcConPickerView.g.e.invoke(object0, object1);
                });
                L.m(g0);
                g g1 = g0.R1(() -> {
                    L.p(this, "this$0");
                    k0.d d0 = k0.d.e();
                    this.h.e(d0);
                }).T1(() -> {
                    L.p(this, "this$0");
                    k0.d d0 = k0.d.a();
                    this.h.e(d0);
                });
                L.m(g1);
                function11.invoke(g1);
            }
        }
    }

    static void d0(DcConPickerView dcConPickerView0, p p0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        dcConPickerView0.c0(p0, z);
    }

    // 检测为 Lambda 实现
    private static final V e0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final V f0(A3.o o0, Object object0, Object object1) [...]

    // 检测为 Lambda 实现
    private static final void g0(DcConPickerView dcConPickerView0) [...]

    // 检测为 Lambda 实现
    private static final void h0(DcConPickerView dcConPickerView0) [...]

    private final void i0() {
        static final class h extends N implements Function1 {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1500A1);  // string:alert_dccon_setting_want_login "디시콘 추가 및 설정은 로그인 후 이용 가능합니다. 로그인하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class i extends N implements Function1 {
            public static final i e;

            static {
                i.e = new i();
            }

            i() {
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


        static final class com.dcinside.app.view.dccon.DcConPickerView.j extends N implements Function1 {
            final com.dcinside.app.base.d e;
            final DcConPickerView f;

            com.dcinside.app.view.dccon.DcConPickerView.j(com.dcinside.app.base.d d0, DcConPickerView dcConPickerView0) {
                this.e = d0;
                this.f = dcConPickerView0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                final class com.dcinside.app.view.dccon.DcConPickerView.j.a extends H implements A3.p {
                    com.dcinside.app.view.dccon.DcConPickerView.j.a(Object object0) {
                        super(3, object0, DcConPickerView.class, "onActivityResult", "onActivityResult(IILandroid/content/Intent;)V", 0);
                    }

                    public final void a(int v, int v1, @m Intent intent0) {
                        ((DcConPickerView)this.receiver).Z(v, v1, intent0);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.a(((Number)object0).intValue(), ((Number)object1).intValue(), ((Intent)object2));
                        return S0.a;
                    }
                }

                if(com.dcinside.app.main.login.g.a.p()) {
                    com.dcinside.app.base.d.y1(this.e, 0, null, null, 0, false, 0x1F, null);
                    return;
                }
                Intent intent0 = LoginActivity.x.b(this.e, false);
                com.dcinside.app.view.dccon.DcConPickerView.j.a dcConPickerView$j$a0 = new com.dcinside.app.view.dccon.DcConPickerView.j.a(this.f);
                com.dcinside.app.base.d.t.a(this.e, intent0, 0x3F8, dcConPickerView$j$a0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }


        final class k extends H implements A3.p {
            k(Object object0) {
                super(3, object0, DcConPickerView.class, "onActivityResult", "onActivityResult(IILandroid/content/Intent;)V", 0);
            }

            public final void a(int v, int v1, @m Intent intent0) {
                ((DcConPickerView)this.receiver).Z(v, v1, intent0);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((Number)object0).intValue(), ((Number)object1).intValue(), ((Intent)object2));
                return S0.a;
            }
        }

        String s = B.E.k0();
        if(m0.a.a.h(s)) {
            Context context0 = Dl.b(this);
            L.n(context0, "null cannot be cast to non-null type com.dcinside.app.base.AppBaseActivity");
            o o0 = this.b;
            if(o0 != null) {
                o0.l();
            }
            this.b = e.e.a(((com.dcinside.app.base.d)context0)).n(h.e).z(0x7F150537).x(0x1040000).b().Z1((Object object0) -> {
                L.p(i.e, "$tmp0");
                return (Boolean)i.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new com.dcinside.app.view.dccon.DcConPickerView.j(((com.dcinside.app.base.d)context0), this), "$tmp0");
                new com.dcinside.app.view.dccon.DcConPickerView.j(((com.dcinside.app.base.d)context0), this).invoke(object0);
            });
            return;
        }
        Intent intent0 = new Intent(this.getContext(), DcconListSettingActivity.class);
        Context context1 = this.getContext();
        L.o(context1, "getContext(...)");
        k dcConPickerView$k0 = new k(this);
        com.dcinside.app.base.d.t.a(context1, intent0, 0x3F7, dcConPickerView$k0);
    }

    // 检测为 Lambda 实现
    private static final Boolean j0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void k0(Function1 function10, Object object0) [...]

    public final void l0() {
        com.dcinside.app.read.G.b();
        this.c.h();
    }

    private final void m0() {
        this.i.s(0, false);
    }

    private final void n0(E e0) {
        public static final class com.dcinside.app.view.dccon.DcConPickerView.l extends OnPageChangeCallback {
            final DcConPickerView a;
            final SwipeHandleTabLayout b;

            com.dcinside.app.view.dccon.DcConPickerView.l(DcConPickerView dcConPickerView0, SwipeHandleTabLayout swipeHandleTabLayout0) {
                this.a = dcConPickerView0;
                this.b = swipeHandleTabLayout0;
                super();
            }

            @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
            public void c(int v) {
                super.c(v);
                int v1 = this.a.i.getCurrentItem();
                if(v1 != this.b.getSelectedTabPosition()) {
                    com.google.android.material.tabs.TabLayout.i tabLayout$i0 = this.b.D(v1);
                    this.b.R(tabLayout$i0);
                }
            }
        }

        SwipeHandleTabLayout swipeHandleTabLayout0 = this.j;
        Context context0 = Dl.b(this);
        L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        com.dcinside.app.util.ql.c.a(swipeHandleTabLayout0);
        swipeHandleTabLayout0.L();
        Context context1 = this.getContext();
        if(e0.c().isEmpty() && e0.d().isEmpty()) {
            k0.d d0 = k0.d.g(new Throwable("사용 가능한 디시콘이 없습니다."));
            this.h.e(d0);
            return;
        }
        LayoutInflater layoutInflater0 = LayoutInflater.from(context1);
        View view0 = layoutInflater0.inflate(0x7F0E01C0, this, false);  // layout:view_dccon_tab_recent
        L.n(view0, "null cannot be cast to non-null type android.widget.ImageView");
        swipeHandleTabLayout0.i(swipeHandleTabLayout0.I().v(((ImageView)view0)));
        List list0 = e0.d();
        kotlin.jvm.internal.l0.f l0$f0 = new kotlin.jvm.internal.l0.f();
        for(Object object0: list0) {
            com.dcinside.app.model.r r0 = (com.dcinside.app.model.r)object0;
            View view1 = layoutInflater0.inflate(0x7F0E01BF, this, false);  // layout:view_dccon_tab_ic
            L.n(view1, "null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
            ((SimpleDraweeView)view1).setController(((com.facebook.drawee.backends.pipeline.f)com.facebook.drawee.backends.pipeline.d.j().j0(r0.f()).U(((SimpleDraweeView)view1).getController())).e());
            swipeHandleTabLayout0.i(swipeHandleTabLayout0.I().v(((SimpleDraweeView)view1)));
            if(r0.g() == dl.a.I0()) {
                l0$f0.a = list0.indexOf(r0) + 1;
            }
        }
        d dcConPickerView$d0 = new d(((AppCompatActivity)context0), e0, this);
        this.i.setAdapter(dcConPickerView$d0);
        this.i.setSaveEnabled(false);
        com.dcinside.app.util.ql.c.c(swipeHandleTabLayout0, (com.google.android.material.tabs.TabLayout.i tabLayout$i0) -> {
            L.p(this, "this$0");
            int v = tabLayout$i0.k();
            if(v == 0) {
                dl.a.A4(0);
                this.m0();
                return;
            }
            this.i.s(v, false);
            E e0 = (E)this.c.c();
            List list0 = null;
            List list1 = e0 == null ? null : e0.c();
            if(list1 != null && list1.size() > v - 1) {
                list0 = (List)list1.get(v - 1);
            }
            if(list0 != null && !list0.isEmpty() == 1) {
                int v1 = ((p)list0.get(0)).s();
                dl.a.A4(v1);
            }
        });
        com.dcinside.app.view.dccon.DcConPickerView.l dcConPickerView$l0 = new com.dcinside.app.view.dccon.DcConPickerView.l(this, swipeHandleTabLayout0);
        this.i.n(dcConPickerView$l0);
        swipeHandleTabLayout0.post(() -> {
            L.p(l0$f0, "$lastSelectedIndex");
            L.p(this, "this$0");
            L.p(swipeHandleTabLayout0, "$tabs");
            try {
                if(l0$f0.a == 0) {
                    String s = B.E.k0();
                    if(m0.a.a.h(s)) {
                        l0$f0.a = 1;
                    }
                    else {
                        this.m0();
                    }
                }
                com.google.android.material.tabs.TabLayout.i tabLayout$i0 = swipeHandleTabLayout0.D(l0$f0.a);
                if(tabLayout$i0 != null) {
                    tabLayout$i0.r();
                }
            }
            catch(Exception unused_ex) {
            }
        });
    }

    // 检测为 Lambda 实现
    private static final void o0(DcConPickerView dcConPickerView0, com.google.android.material.tabs.TabLayout.i tabLayout$i0) [...]

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        static final class com.dcinside.app.view.dccon.DcConPickerView.e extends N implements Function1 {
            final DcConPickerView e;

            com.dcinside.app.view.dccon.DcConPickerView.e(DcConPickerView dcConPickerView0) {
                this.e = dcConPickerView0;
                super(1);
            }

            public final void a(k0.d d0) {
                this.e.h.e(d0);
                if(d0.d() == 8) {
                    Object object0 = d0.b();
                    L.o(object0, "getData(...)");
                    this.e.n0(((E)object0));
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((k0.d)object0));
                return S0.a;
            }
        }

        super.onAttachedToWindow();
        o o0 = this.a;
        if(o0 != null) {
            o0.l();
        }
        this.a = this.c.f().x5((Object object0) -> {
            L.p(new com.dcinside.app.view.dccon.DcConPickerView.e(this), "$tmp0");
            new com.dcinside.app.view.dccon.DcConPickerView.e(this).invoke(object0);
        });
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kl.b(new o[]{this.c, this.b, this.f, this.a});
    }

    // 检测为 Lambda 实现
    private static final void p0(kotlin.jvm.internal.l0.f l0$f0, DcConPickerView dcConPickerView0, SwipeHandleTabLayout swipeHandleTabLayout0) [...]

    public final void setDcconOnDetail(@m p p0) {
        this.k = p0;
    }

    public final void setOnLongSelectedListener(@m Function1 function10) {
        this.e = function10;
    }

    public final void setOnSelectedListener(@m Function1 function10) {
        this.d = function10;
    }
}

