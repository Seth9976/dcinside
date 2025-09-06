package com.dcinside.app.gallery.search;

import Y.M1;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Y;
import com.dcinside.app.post.c0;
import com.dcinside.app.post.fragments.PostContainerChildInsets;
import com.dcinside.app.post.fragments.V;
import com.dcinside.app.realm.w0;
import com.dcinside.app.totalsearch.TotalSearchActivity;
import com.dcinside.app.type.m;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.view.DcToolbar;
import com.google.android.material.appbar.AppBarLayout;
import io.realm.F0;
import io.realm.g1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.J;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import rx.o;
import rx.schedulers.c;
import y4.l;

@s0({"SMAP\nCategoryHotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryHotFragment.kt\ncom/dcinside/app/gallery/search/CategoryHotFragment\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,227:1\n25#2:228\n*S KotlinDebug\n*F\n+ 1 CategoryHotFragment.kt\ncom/dcinside/app/gallery/search/CategoryHotFragment\n*L\n126#1:228\n*E\n"})
public final class n extends V {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[m.values().length];
            try {
                arr_v[m.g.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.h.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.i.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[m.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @y4.m
    private M1 c;
    @y4.m
    private List d;
    @y4.m
    private o e;
    @y4.m
    private g f;

    private final void F0() {
        static final class b extends N implements Function1 {
            final n e;

            b(n n0) {
                this.e = n0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                dl.a.Z3(System.currentTimeMillis());
                this.e.Q0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        this.I0().c.setVisibility(0);
        if(Math.abs(System.currentTimeMillis() - dl.a.h0()) > TimeUnit.HOURS.toMillis(6L)) {
            this.e = uk.CG().y5((Object object0) -> {
                L.p(new b(this), "$tmp0");
                new b(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                timber.log.b.a.y(throwable0);
                Dl.D(this.getContext(), 0x7F15037E);  // string:gallery_all_failed "갤러리 목록 갱신을 실패했습니다."
                this.Q0();
            });
            return;
        }
        this.Q0();
    }

    // 检测为 Lambda 实现
    private static final void G0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void H0(n n0, Throwable throwable0) [...]

    private final M1 I0() {
        M1 m10 = this.c;
        L.m(m10);
        return m10;
    }

    // 检测为 Lambda 实现
    private static final WindowInsetsCompat J0(View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    // 检测为 Lambda 实现
    private static final boolean K0(RecyclerView recyclerView0, AppCompatActivity appCompatActivity0, View view0, int v) [...]

    private final void L0() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            return;
        }
        TotalSearchActivity.C2(fragmentActivity0, null, false);
    }

    private final void M0(m m0) {
        switch(m0) {
            case 1: {
                this.F0();
                return;
            }
            case 2: {
                this.N0(m0);
                return;
            }
            case 3: {
                this.N0(m0);
                return;
            }
            case 4: {
                this.N0(m0);
            }
        }
    }

    private final void N0(m m0) {
        static final class d extends N implements Function1 {
            final n e;

            d(n n0) {
                this.e = n0;
                super(1);
            }

            public final void a(List list0) {
                g g0 = this.e.f;
                if(g0 != null) {
                    L.m(list0);
                    g0.w(list0);
                }
                this.e.I0().c.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((List)object0));
                return S0.a;
            }
        }

        this.I0().c.setVisibility(0);
        this.e = uk.Ok(m0).A5(c.e()).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new d(this), "$tmp0");
            new d(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.y(throwable0);
            Dl.D(this.getContext(), 0x7F15037E);  // string:gallery_all_failed "갤러리 목록 갱신을 실패했습니다."
            this.I0().c.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void O0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void P0(n n0, Throwable throwable0) [...]

    private final void Q0() {
        @f(c = "com.dcinside.app.gallery.search.CategoryHotFragment$showData$1", f = "CategoryHotFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nCategoryHotFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CategoryHotFragment.kt\ncom/dcinside/app/gallery/search/CategoryHotFragment$showData$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n120#2,3:228\n124#2:233\n1#3:231\n1#3:232\n*S KotlinDebug\n*F\n+ 1 CategoryHotFragment.kt\ncom/dcinside/app/gallery/search/CategoryHotFragment$showData$1\n*L\n201#1:228,3\n201#1:233\n201#1:231\n*E\n"})
        static final class e extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final n l;

            e(n n0, kotlin.coroutines.d d0) {
                this.l = n0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@y4.m Object object0, @l kotlin.coroutines.d d0) {
                return new e(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m kotlin.coroutines.d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                List list0;
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                n n0 = this.l;
                F0 f00 = F0.g4();
                try {
                    L.m(f00);
                    g1 g10 = f00.C4(w0.class).f2("idx").p0();
                    F0 f01 = g10.h();
                    list0 = f01 == null ? null : f01.g2(g10);
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable0;
                }
                kotlin.io.c.a(f00, null);
                n0.d = list0;
                this.l.I0().c.setVisibility(8);
                g g0 = this.l.f;
                if(g0 != null) {
                    g0.x(this.l.d);
                }
                return S0.a;
            }
        }

        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.e(), null, new e(this, null), 2, null);
    }

    @Override  // com.dcinside.app.post.fragments.V
    @l
    public String j0() {
        return "com.dcinside.app.gallery.search.CategoryAllActivity";
    }

    @Override  // com.dcinside.app.post.fragments.V
    @l
    public String k0() {
        return "CategoryAllActivity";
    }

    @Override  // com.dcinside.app.post.fragments.V
    public void o0() {
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @y4.m ViewGroup viewGroup0, @y4.m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = M1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.I0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        o o0 = this.e;
        if(o0 != null) {
            o0.l();
        }
        this.e = null;
        this.c = null;
    }

    @Override  // com.dcinside.app.post.fragments.V
    @SuppressLint({"PrivateResource"})
    public void onViewCreated(@l View view0, @y4.m Bundle bundle0) {
        public static final class com.dcinside.app.gallery.search.n.c implements MenuProvider {
            final n a;

            com.dcinside.app.gallery.search.n.c(n n0) {
                this.a = n0;
                super();
            }

            @Override  // androidx.core.view.MenuProvider
            public void a(@l Menu menu0, @l MenuInflater menuInflater0) {
                L.p(menu0, "menu");
                L.p(menuInflater0, "menuInflater");
                menuInflater0.inflate(0x7F100018, menu0);  // mipmap:ic_launcher27
            }

            @Override  // androidx.core.view.MenuProvider
            public void b(Menu menu0) {
            }

            @Override  // androidx.core.view.MenuProvider
            public void c(Menu menu0) {
            }

            @Override  // androidx.core.view.MenuProvider
            public boolean d(@l MenuItem menuItem0) {
                L.p(menuItem0, "menuItem");
                if(menuItem0.getItemId() == 0x7F0B006C) {  // id:action_open_search
                    this.a.L0();
                    return true;
                }
                return false;
            }
        }

        int v;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        FragmentActivity fragmentActivity0 = this.getActivity();
        Integer integer0 = null;
        AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        appCompatActivity0.S0(this.I0().e);
        kr.bhbfhfb.designcompat.a.d(appCompatActivity0);
        if(appCompatActivity0 instanceof c0) {
            M1 m10 = this.I0();
            j j0 = (View view0, WindowInsetsCompat windowInsetsCompat0) -> WindowInsetsCompat.c;
            ViewCompat.m2(m10.b, j0);
        }
        com.dcinside.app.gallery.search.n.c n$c0 = new com.dcinside.app.gallery.search.n.c(this);
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        appCompatActivity0.addMenuProvider(n$c0, lifecycleOwner0, State.d);
        view0.setClickable(true);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            integer0 = bundle1.getInt("com.dcinside.app.gallery.search.EXTRA_GALLERY_GRADE_TYPE");
        }
        m m0 = m.d.a((integer0 == null ? 0 : ((int)integer0)));
        this.f = new g(m0);
        DcToolbar dcToolbar0 = (DcToolbar)view0.findViewById(0x7F0B029B);  // id:category_hot_toolbar
        if(dcToolbar0 != null) {
            switch(m0) {
                case 1: {
                    v = 0x7F150469;  // string:hot_category_major_title "메인 갤러리"
                    break;
                }
                case 2: {
                    v = 0x7F15046B;  // string:hot_category_minor_title "마이너 갤러리"
                    break;
                }
                case 3: {
                    v = 0x7F15046A;  // string:hot_category_mini_title "미니 갤러리"
                    break;
                }
                case 4: {
                    v = 0x7F15046C;  // string:hot_category_person_title "인물 갤러리"
                    break;
                }
                default: {
                    throw new J();
                }
            }
            dcToolbar0.setTitle(v);
        }
        M1 m11 = this.I0();
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(m11.d.getContext());
        m11.d.setLayoutManager(linearLayoutManager0);
        m11.d.setAdapter(this.f);
        com.dcinside.app.gallery.search.k k0 = (View view0, int v) -> {
            L.p(m11.d, "$it");
            L.p(appCompatActivity0, "$activity");
            Adapter recyclerView$Adapter0 = m11.d.getAdapter();
            String s = null;
            if(!(recyclerView$Adapter0 instanceof g)) {
                recyclerView$Adapter0 = null;
            }
            if(((g)recyclerView$Adapter0) == null) {
                return false;
            }
            com.dcinside.app.gallery.search.g.a g$a0 = ((g)recyclerView$Adapter0).v(v);
            if(g$a0 == null) {
                return false;
            }
            Long long0 = g$a0.i();
            Y y0 = g$a0.k();
            if(y0 != null) {
                s = y0.h();
            }
            if(long0 != null) {
                GalleryAllActivity.x.a(appCompatActivity0, long0);
                return true;
            }
            if(s != null) {
                Xk.i(appCompatActivity0, s);
                return true;
            }
            return false;
        };
        com.dcinside.app.util.ql.b.e(m11.d, k0);
        this.M0(m0);
    }

    @Override  // com.dcinside.app.post.fragments.V
    public void p0() {
    }

    @Override  // com.dcinside.app.post.fragments.V
    public void q0(@y4.m PostContainerChildInsets postContainerChildInsets0) {
        super.q0(postContainerChildInsets0);
        AppBarLayout appBarLayout0 = this.I0().b;
        L.o(appBarLayout0, "categoryHotAppbar");
        r.g0(appBarLayout0, ((int)(postContainerChildInsets0 == null ? 0 : postContainerChildInsets0.q())), null, null, null, 14, null);
    }
}

