package com.dcinside.app.view.dccon;

import Y.O1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.OnScrollListener;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.model.BigDcconResult;
import com.dcinside.app.model.p;
import com.dcinside.app.model.r;
import com.dcinside.app.read.E;
import com.dcinside.app.read.G;
import com.dcinside.app.realm.B;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.hjq.toast.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nDcconPickerItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconPickerItemFragment.kt\ncom/dcinside/app/view/dccon/DcconPickerItemFragment\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,206:1\n25#2:207\n*S KotlinDebug\n*F\n+ 1 DcconPickerItemFragment.kt\ncom/dcinside/app/view/dccon/DcconPickerItemFragment\n*L\n189#1:207\n*E\n"})
public final class z extends Fragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private O1 a;
    @l
    private final com.dcinside.app.view.dccon.w b;
    @m
    private o c;
    @m
    private o d;
    @m
    private c e;
    @l
    private final g f;
    private boolean g;
    @l
    private e h;
    @m
    private d i;
    @l
    public static final a j = null;
    @l
    public static final String k = "com.dcinside.app.view.dccon.DcconPickerItemFragment.EXTRA_CURRENT_ITEM";
    @l
    public static final String l = "com.dcinside.app.view.dccon.DcconPickerItemFragment.EXTRA_SPAN_COUNT";

    static {
        z.j = new a(null);
    }

    public z() {
        public static final class e extends OnScrollListener {
            final z a;

            e(z z0) {
                this.a = z0;
                super();
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$OnScrollListener
            public void onScrollStateChanged(@l RecyclerView recyclerView0, int v) {
                L.p(recyclerView0, "recyclerView");
                this.a.v0(v != 0);
            }
        }

        this.b = new com.dcinside.app.view.dccon.w(false);
        this.f = G.c();
        this.h = new e(this);
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = O1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.r0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        O1 o10 = this.r0();
        L.o(o10.b, "dcconPickerItemList");
        Adapter recyclerView$Adapter0 = o10.b.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.view.dccon.w)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.view.dccon.w)recyclerView$Adapter0) != null) {
            ((com.dcinside.app.view.dccon.w)recyclerView$Adapter0).D();
        }
        this.r0().b.removeOnScrollListener(this.h);
        this.r0().b.setAdapter(null);
        o o0 = this.c;
        if(o0 != null) {
            o0.l();
        }
        o o1 = this.d;
        if(o1 != null) {
            o1.l();
        }
        this.e = null;
        d d0 = this.i;
        if(d0 != null) {
            d0.b();
        }
        this.i = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        public static final class b extends SpanSizeLookup {
            final int e;

            b(int v) {
                this.e = v;
                super();
            }

            @Override  // androidx.recyclerview.widget.GridLayoutManager$SpanSizeLookup
            public int f(int v) {
                return v == 0 ? this.e : 1;
            }
        }


        static final class com.dcinside.app.view.dccon.z.c extends N implements Function1 {
            final z e;
            final int f;

            com.dcinside.app.view.dccon.z.c(z z0, int v) {
                this.e = z0;
                this.f = v;
                super(1);
            }

            public final void a(E e0) {
                O1 o10 = this.e.r0();
                k0.d d0 = k0.d.a();
                o10.c.e(d0);
                L.m(e0);
                this.e.s0(e0, this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((E)object0));
                return S0.a;
            }
        }


        @s0({"SMAP\nDcconPickerItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconPickerItemFragment.kt\ncom/dcinside/app/view/dccon/DcconPickerItemFragment$onViewCreated$4\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,206:1\n204#2,7:207\n*S KotlinDebug\n*F\n+ 1 DcconPickerItemFragment.kt\ncom/dcinside/app/view/dccon/DcconPickerItemFragment$onViewCreated$4\n*L\n110#1:207,7\n*E\n"})
        static final class com.dcinside.app.view.dccon.z.d extends N implements A3.a {
            final z e;

            com.dcinside.app.view.dccon.z.d(z z0) {
                this.e = z0;
                super(0);
            }

            // 检测为 Lambda 实现
            private static final void c(Function1 function10, Object object0) [...]

            // 检测为 Lambda 实现
            private static final void d(z z0, Throwable throwable0) [...]

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                @s0({"SMAP\nDcconPickerItemFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconPickerItemFragment.kt\ncom/dcinside/app/view/dccon/DcconPickerItemFragment$onViewCreated$4$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,206:1\n204#2,7:207\n204#2,7:214\n*S KotlinDebug\n*F\n+ 1 DcconPickerItemFragment.kt\ncom/dcinside/app/view/dccon/DcconPickerItemFragment$onViewCreated$4$1\n*L\n133#1:207,7\n138#1:214,7\n*E\n"})
                static final class com.dcinside.app.view.dccon.z.d.a extends N implements Function1 {
                    public final class com.dcinside.app.view.dccon.z.d.a.a {
                        public static final int[] a;

                        static {
                            int[] arr_v = new int[com.dcinside.app.view.dccon.e.values().length];
                            try {
                                arr_v[com.dcinside.app.view.dccon.e.b.ordinal()] = 1;
                            }
                            catch(NoSuchFieldError unused_ex) {
                            }
                            try {
                                arr_v[com.dcinside.app.view.dccon.e.c.ordinal()] = 2;
                            }
                            catch(NoSuchFieldError unused_ex) {
                            }
                            try {
                                arr_v[com.dcinside.app.view.dccon.e.d.ordinal()] = 3;
                            }
                            catch(NoSuchFieldError unused_ex) {
                            }
                            com.dcinside.app.view.dccon.z.d.a.a.a = arr_v;
                        }
                    }

                    final z e;
                    final String f;

                    com.dcinside.app.view.dccon.z.d.a(z z0, String s) {
                        this.e = z0;
                        this.f = s;
                        super(1);
                    }

                    public final void a(BigDcconResult bigDcconResult0) {
                        O1 o10 = this.e.r0();
                        k0.d d0 = k0.d.a();
                        o10.c.e(d0);
                        long v = bigDcconResult0.w() <= 0L ? 0L : 1000L * bigDcconResult0.w();
                        dl.a.w3(this.f, v);
                        dl.a.y3(new Integer[]{bigDcconResult0.r(), bigDcconResult0.u(), bigDcconResult0.v()});
                        int v1 = com.dcinside.app.view.dccon.z.d.a.a.a[com.dcinside.app.view.dccon.e.a.a("").ordinal()];
                        if(v1 != 1) {
                            Class class0 = c.class;
                            switch(v1) {
                                case 2: {
                                    this.e.w0();
                                    z z0 = this.e;
                                    V[] arr_v = {r0.a("com.dcinside.app.view.dccon.BigDcconDialogFragment.EXTRA_BIG_DCCON_RESULT", bigDcconResult0)};
                                    String s = class0.getName();
                                    FragmentManager fragmentManager0 = z0.getChildFragmentManager();
                                    L.o(fragmentManager0, "getChildFragmentManager(...)");
                                    FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                                    ClassLoader classLoader0 = class0.getClassLoader();
                                    L.m(classLoader0);
                                    Fragment fragment0 = fragmentFactory0.a(classLoader0, s);
                                    if(fragment0 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.view.dccon.BigDcconDialogFragment");
                                    }
                                    ((c)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
                                    ((c)fragment0).show(fragmentManager0, s);
                                    z0.e = (c)fragment0;
                                    return;
                                }
                                case 3: {
                                    z z1 = this.e;
                                    V[] arr_v1 = {r0.a("com.dcinside.app.view.dccon.BigDcconDialogFragment.EXTRA_BIG_DCCON_RESULT", bigDcconResult0)};
                                    String s1 = class0.getName();
                                    FragmentManager fragmentManager1 = z1.getChildFragmentManager();
                                    L.o(fragmentManager1, "getChildFragmentManager(...)");
                                    FragmentFactory fragmentFactory1 = fragmentManager1.G0();
                                    ClassLoader classLoader1 = class0.getClassLoader();
                                    L.m(classLoader1);
                                    Fragment fragment1 = fragmentFactory1.a(classLoader1, s1);
                                    if(fragment1 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.view.dccon.BigDcconDialogFragment");
                                    }
                                    ((c)fragment1).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v1, 1))));
                                    ((c)fragment1).show(fragmentManager1, s1);
                                    z1.e = (c)fragment1;
                                    return;
                                }
                                default: {
                                    return;
                                }
                            }
                        }
                        this.e.w0();
                        Object[] arr_object = {Bk.H(v)};
                        s.C(this.e.getString(0x7F150162, arr_object));  // string:big_dccon_use_success "대왕콘 사용권 발급 완료 \n (%s까지 사용 가능)"
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((BigDcconResult)object0));
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.view.dccon.z.d.b extends N implements Function1 {
                    final Throwable e;

                    com.dcinside.app.view.dccon.z.d.b(Throwable throwable0) {
                        this.e = throwable0;
                        super(1);
                    }

                    @m
                    public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                        L.p(p$a0, "b");
                        return p$a0.n(this.e.getMessage());
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((com.dcinside.app.perform.p.a)object0));
                    }
                }

                String s = B.E.c0();
                if(s == null) {
                    return;
                }
                long v = dl.a.J(s);
                List list0 = dl.a.K();
                if(!list0.isEmpty() && list0.size() > 2 && v > System.currentTimeMillis()) {
                    this.e.w0();
                    int v1 = ((Number)list0.get(0)).intValue();
                    int v2 = ((Number)list0.get(1)).intValue();
                    int v3 = ((Number)list0.get(2)).intValue();
                    BigDcconResult bigDcconResult0 = new BigDcconResult(Boolean.TRUE, v / 1000L, v1, v2, v3, 0, 0, "already", "");
                    z z0 = this.e;
                    V[] arr_v = {r0.a("com.dcinside.app.view.dccon.BigDcconDialogFragment.EXTRA_BIG_DCCON_RESULT", bigDcconResult0)};
                    FragmentManager fragmentManager0 = z0.getChildFragmentManager();
                    L.o(fragmentManager0, "getChildFragmentManager(...)");
                    FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                    ClassLoader classLoader0 = c.class.getClassLoader();
                    L.m(classLoader0);
                    Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.view.dccon.c");
                    if(fragment0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.view.dccon.BigDcconDialogFragment");
                    }
                    ((c)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(arr_v, 1))));
                    ((c)fragment0).show(fragmentManager0, "com.dcinside.app.view.dccon.c");
                    z0.e = (c)fragment0;
                    return;
                }
                O1 o10 = this.e.r0();
                k0.d d0 = k0.d.e();
                o10.c.e(d0);
                o o0 = this.e.d;
                if(o0 != null) {
                    o0.l();
                }
                o o1 = uk.uG().y5((Object object0) -> {
                    L.p(new com.dcinside.app.view.dccon.z.d.a(this.e, s), "$tmp0");
                    new com.dcinside.app.view.dccon.z.d.a(this.e, s).invoke(object0);
                }, (Throwable throwable0) -> {
                    L.p(this.e, "this$0");
                    O1 o10 = this.e.r0();
                    k0.d d0 = k0.d.a();
                    o10.c.e(d0);
                    Context context0 = this.e.getContext();
                    AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
                    if(appCompatActivity0 == null) {
                        return;
                    }
                    com.dcinside.app.perform.e.e.a(appCompatActivity0).n(new com.dcinside.app.view.dccon.z.d.b(throwable0)).z(0x7F15034A).b().t5();  // string:filter_apply "확인"
                });
                this.e.d = o1;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        int v = bundle1 == null ? 4 : bundle1.getInt("com.dcinside.app.view.dccon.DcconPickerItemFragment.EXTRA_SPAN_COUNT");
        Bundle bundle2 = this.getArguments();
        int v1 = bundle2 == null ? 0 : bundle2.getInt("com.dcinside.app.view.dccon.DcconPickerItemFragment.EXTRA_CURRENT_ITEM");
        this.r0().b.setAdapter(this.b);
        O1 o10 = this.r0();
        o10.b.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(this.getContext(), v);
        gridLayoutManager0.m4(new b(v));
        o10.b.setItemAnimator(null);
        o10.b.setLayoutManager(gridLayoutManager0);
        o10.b.addOnScrollListener(this.h);
        Context context0 = this.getContext();
        this.b.A(context0);
        O1 o11 = this.r0();
        k0.d d0 = k0.d.e();
        o11.c.e(d0);
        o o0 = this.c;
        if(o0 != null) {
            o0.l();
        }
        x x0 = (Object object0) -> {
            L.p(new com.dcinside.app.view.dccon.z.c(this, v1), "$tmp0");
            new com.dcinside.app.view.dccon.z.c(this, v1).invoke(object0);
        };
        y y0 = (Throwable throwable0) -> {
            L.p(this, "this$0");
            O1 o10 = this.r0();
            k0.d d0 = k0.d.g(throwable0);
            o10.c.e(d0);
        };
        this.c = this.f.y5(x0, y0);
        com.dcinside.app.view.dccon.z.d z$d0 = new com.dcinside.app.view.dccon.z.d(this);
        this.b.C(z$d0);
    }

    private final O1 r0() {
        O1 o10 = this.a;
        L.m(o10);
        return o10;
    }

    private final void s0(E e0, int v) {
        r r0 = (r)e0.d().get(v);
        int v1 = r0.g();
        String s = r0.h() == null ? "디시콘" : r0.h();
        for(Object object0: e0.c()) {
            List list0 = (List)object0;
            if(v1 == ((p)list0.get(0)).s()) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.addAll(list0);
                arrayList0.add(0, new p(-999, ((p)list0.get(0)).s(), s, null));
                this.b.B(arrayList0);
                return;
            }
            if(false) {
                break;
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void t0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void u0(z z0, Throwable throwable0) [...]

    private final void v0(boolean z) {
        if(this.g != z) {
            this.g = z;
            FragmentActivity fragmentActivity0 = this.getActivity();
            if(fragmentActivity0 != null) {
                com.dcinside.app.rx.bus.c.a(fragmentActivity0, new com.dcinside.app.rx.bus.p(z));
            }
        }
    }

    private final void w0() {
        dl dl0 = dl.a;
        if(dl0.L2()) {
            return;
        }
        this.i = new d();
        ViewHolder recyclerView$ViewHolder0 = this.r0().b.findViewHolderForAdapterPosition(0);
        J j0 = recyclerView$ViewHolder0 instanceof J ? ((J)recyclerView$ViewHolder0) : null;
        if(j0 == null) {
            return;
        }
        d d0 = this.i;
        if(d0 != null) {
            d0.b();
        }
        d d1 = this.i;
        if(d1 != null) {
            d1.c(j0.j(), this.r0().b);
        }
        dl0.x3(true);
    }
}

