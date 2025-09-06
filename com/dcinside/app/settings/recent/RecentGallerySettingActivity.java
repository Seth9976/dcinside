package com.dcinside.app.settings.recent;

import A3.p;
import A3.q;
import Y.C0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.app.ActivityCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.P0;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nRecentGallerySettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentGallerySettingActivity.kt\ncom/dcinside/app/settings/recent/RecentGallerySettingActivity\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n177#2,9:186\n177#2,9:195\n192#2,7:204\n257#3,2:211\n257#3,2:213\n257#3,2:215\n257#3,2:217\n257#3,2:219\n257#3,2:221\n257#3,2:223\n257#3,2:225\n774#4:227\n865#4,2:228\n1872#4,3:230\n*S KotlinDebug\n*F\n+ 1 RecentGallerySettingActivity.kt\ncom/dcinside/app/settings/recent/RecentGallerySettingActivity\n*L\n72#1:186,9\n117#1:195,9\n118#1:204,7\n130#1:211,2\n131#1:213,2\n132#1:215,2\n133#1:217,2\n135#1:219,2\n136#1:221,2\n137#1:223,2\n138#1:225,2\n149#1:227\n149#1:228,2\n152#1:230,3\n*E\n"})
public final class RecentGallerySettingActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0) {
            L.p(context0, "context");
            context0.startActivity(new Intent(context0, RecentGallerySettingActivity.class));
        }
    }

    @m
    private g1 A;
    @l
    private final P0 B;
    @l
    public static final a C;
    private C0 w;
    @m
    private ItemTouchHelper x;
    @m
    private b y;
    @l
    private final com.dcinside.app.settings.recent.g z;

    static {
        RecentGallerySettingActivity.C = new a(null);
    }

    public RecentGallerySettingActivity() {
        this.z = new com.dcinside.app.settings.recent.g();
        this.B = (g1 g10) -> {
            L.p(this, "this$0");
            L.m(g10);
            this.b2(g10);
        };
    }

    // 检测为 Lambda 实现
    private static final void T1(RecentGallerySettingActivity recentGallerySettingActivity0, g1 g10) [...]

    private final void U1() {
        static final class com.dcinside.app.settings.recent.RecentGallerySettingActivity.b extends N implements Function1 {
            public static final com.dcinside.app.settings.recent.RecentGallerySettingActivity.b e;

            static {
                com.dcinside.app.settings.recent.RecentGallerySettingActivity.b.e = new com.dcinside.app.settings.recent.RecentGallerySettingActivity.b();
            }

            com.dcinside.app.settings.recent.RecentGallerySettingActivity.b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15095B);  // string:setting_apply_warn "변경 사항 중 재시작이 필요한 설정이 있습니다. 저장을 누르면 자동으로 앱이 재시작됩니다. 재시작하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
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


        static final class d extends N implements Function1 {
            final RecentGallerySettingActivity e;

            d(RecentGallerySettingActivity recentGallerySettingActivity0) {
                this.e = recentGallerySettingActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.c2(true);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        e.e.a(this).n(com.dcinside.app.settings.recent.RecentGallerySettingActivity.b.e).z(0x7F1508E1).x(0x1040000).b().Z1((Object object0) -> {
            L.p(c.e, "$tmp0");
            return (Boolean)c.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new d(this), "$tmp0");
            new d(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void V1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final Boolean W1(Function1 function10, Object object0) [...]

    private final void X1() {
        b b0 = this.y;
        if(b0 != null) {
            try {
                b0.dismissAllowingStateLoss();
            }
            catch(Exception unused_ex) {
            }
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        FragmentFactory fragmentFactory0 = fragmentManager0.G0();
        ClassLoader classLoader0 = b.class.getClassLoader();
        L.m(classLoader0);
        Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.settings.recent.b");
        if(fragment0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.settings.recent.DeleteAllGalleryDialog");
        }
        ((b)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
        ((b)fragment0).show(fragmentManager0, "com.dcinside.app.settings.recent.b");
        this.y = (b)fragment0;
    }

    @m
    public final ItemTouchHelper Y1() {
        return this.x;
    }

    private final void Z1() {
        F0 f00 = this.F1();
        if(f00 == null) {
            return;
        }
        g1 g10 = com.dcinside.app.realm.s0.j.n(f00);
        this.A = g10;
        if(g10 != null) {
            g10.l(this.B);
        }
    }

    private final void a2() {
        @f(c = "com.dcinside.app.settings.recent.RecentGallerySettingActivity$initView$2", f = "RecentGallerySettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.recent.RecentGallerySettingActivity.e extends o implements p {
            int k;
            final RecentGallerySettingActivity l;

            com.dcinside.app.settings.recent.RecentGallerySettingActivity.e(RecentGallerySettingActivity recentGallerySettingActivity0, kotlin.coroutines.d d0) {
                this.l = recentGallerySettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.recent.RecentGallerySettingActivity.e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.f2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.recent.RecentGallerySettingActivity$initView$3$1", f = "RecentGallerySettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.recent.RecentGallerySettingActivity.f extends o implements q {
            int k;
            final SwitchCompat l;

            com.dcinside.app.settings.recent.RecentGallerySettingActivity.f(SwitchCompat switchCompat0, kotlin.coroutines.d d0) {
                this.l = switchCompat0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.recent.RecentGallerySettingActivity.f(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                boolean z = this.l.isChecked();
                dl.a.C5(z);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.recent.RecentGallerySettingActivity$initView$5", f = "RecentGallerySettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.recent.RecentGallerySettingActivity.g extends o implements p {
            int k;
            final RecentGallerySettingActivity l;

            com.dcinside.app.settings.recent.RecentGallerySettingActivity.g(RecentGallerySettingActivity recentGallerySettingActivity0, kotlin.coroutines.d d0) {
                this.l = recentGallerySettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.recent.RecentGallerySettingActivity.g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.X1();
                return S0.a;
            }
        }

        ArrayList arrayList0 = new ArrayList();
        for(int v = 5; v < 16; ++v) {
            arrayList0.add(String.valueOf(v));
        }
        C0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this, 0x7F0E0285, arrayList0);  // layout:view_spinner_item
        c00.c.setAdapter(arrayAdapter0);
        dl dl0 = dl.a;
        int v1 = arrayList0.indexOf(String.valueOf(dl0.N1()));
        c00.c.setSelection(v1);
        C0 c01 = this.w;
        if(c01 == null) {
            L.S("binding");
            c01 = null;
        }
        L.o(c01.j, "recentSettingSearch");
        com.dcinside.app.settings.recent.RecentGallerySettingActivity.e recentGallerySettingActivity$e0 = new com.dcinside.app.settings.recent.RecentGallerySettingActivity.e(this, null);
        r.M(c01.j, null, recentGallerySettingActivity$e0, 1, null);
        C0 c02 = this.w;
        if(c02 == null) {
            L.S("binding");
            c02 = null;
        }
        boolean z = dl0.P1();
        c02.k.setChecked(z);
        L.m(c02.k);
        com.dcinside.app.settings.recent.RecentGallerySettingActivity.f recentGallerySettingActivity$f0 = new com.dcinside.app.settings.recent.RecentGallerySettingActivity.f(c02.k, null);
        r.J(c02.k, null, recentGallerySettingActivity$f0, 1, null);
        C0 c03 = this.w;
        if(c03 == null) {
            L.S("binding");
            c03 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        c03.i.setLayoutManager(nonPredictiveLayoutManager0);
        com.dcinside.app.util.ql.b.d(c03.i);
        c03.i.setAdapter(this.z);
        ItemTouchHelper itemTouchHelper0 = new ItemTouchHelper(new Z.c(this.z, false));
        this.x = itemTouchHelper0;
        C0 c04 = this.w;
        if(c04 == null) {
            L.S("binding");
            c04 = null;
        }
        itemTouchHelper0.m(c04.i);
        C0 c05 = this.w;
        if(c05 == null) {
            L.S("binding");
            c05 = null;
        }
        L.o(c05.b, "blockItemAddRemoveAll");
        com.dcinside.app.settings.recent.RecentGallerySettingActivity.g recentGallerySettingActivity$g0 = new com.dcinside.app.settings.recent.RecentGallerySettingActivity.g(this, null);
        r.M(c05.b, null, recentGallerySettingActivity$g0, 1, null);
    }

    private final void b2(g1 g10) {
        this.z.x(g10);
        C0 c00 = null;
        if(g10.isEmpty()) {
            C0 c01 = this.w;
            if(c01 == null) {
                L.S("binding");
                c01 = null;
            }
            L.o(c01.b, "blockItemAddRemoveAll");
            c01.b.setVisibility(8);
            C0 c02 = this.w;
            if(c02 == null) {
                L.S("binding");
                c02 = null;
            }
            L.o(c02.i, "recentSettingOrderRecycler");
            c02.i.setVisibility(8);
            C0 c03 = this.w;
            if(c03 == null) {
                L.S("binding");
                c03 = null;
            }
            L.o(c03.f, "recentSettingDesc");
            c03.f.setVisibility(8);
            C0 c04 = this.w;
            if(c04 == null) {
                L.S("binding");
            }
            else {
                c00 = c04;
            }
            L.o(c00.g, "recentSettingEmpty");
            c00.g.setVisibility(0);
            return;
        }
        C0 c05 = this.w;
        if(c05 == null) {
            L.S("binding");
            c05 = null;
        }
        L.o(c05.b, "blockItemAddRemoveAll");
        c05.b.setVisibility(0);
        C0 c06 = this.w;
        if(c06 == null) {
            L.S("binding");
            c06 = null;
        }
        L.o(c06.i, "recentSettingOrderRecycler");
        c06.i.setVisibility(0);
        C0 c07 = this.w;
        if(c07 == null) {
            L.S("binding");
            c07 = null;
        }
        L.o(c07.f, "recentSettingDesc");
        c07.f.setVisibility(0);
        C0 c08 = this.w;
        if(c08 == null) {
            L.S("binding");
        }
        else {
            c00 = c08;
        }
        L.o(c00.g, "recentSettingEmpty");
        c00.g.setVisibility(8);
    }

    private final void c2(boolean z) {
        g1 g10 = this.A;
        if(g10 != null) {
            g10.D();
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.z.v()) {
            com.dcinside.app.realm.s0 s00 = (com.dcinside.app.realm.s0)object0;
            if((s00 == null ? 0 : s00.U5()) > 0) {
                arrayList0.add(object0);
            }
        }
        int v = arrayList0.size();
        F0 f00 = this.F1();
        if(f00 != null) {
            f00.Y3((F0 f00) -> {
                L.p(arrayList0, "$pinList");
                int v1 = 0;
                for(Object object0: arrayList0) {
                    if(v1 < 0) {
                        u.Z();
                    }
                    if(((com.dcinside.app.realm.s0)object0) != null) {
                        ((com.dcinside.app.realm.s0)object0).b6(v - v1);
                    }
                    ++v1;
                }
            });
        }
        if(z) {
            C0 c00 = this.w;
            if(c00 == null) {
                L.S("binding");
                c00 = null;
            }
            int v1 = Integer.parseInt(c00.c.getSelectedItem().toString());
            dl.a.A5(v1);
            ActivityCompat.c(this);
            Xk.h(this, null, null, 6, null);
            return;
        }
        this.finish();
    }

    // 检测为 Lambda 实现
    private static final void d2(List list0, int v, F0 f00) [...]

    public final void e2(@m ItemTouchHelper itemTouchHelper0) {
        this.x = itemTouchHelper0;
    }

    private final void f2() {
        C0 c00 = this.w;
        C0 c01 = null;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        boolean z = c00.k.isChecked();
        C0 c02 = this.w;
        if(c02 == null) {
            L.S("binding");
        }
        else {
            c01 = c02;
        }
        c01.k.setChecked(!z);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        public static final class h extends OnBackPressedCallback {
            final RecentGallerySettingActivity d;

            h(RecentGallerySettingActivity recentGallerySettingActivity0) {
                this.d = recentGallerySettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                C0 c00 = this.d.w;
                if(c00 == null) {
                    L.S("binding");
                    c00 = null;
                }
                int v = Integer.parseInt(c00.c.getSelectedItem().toString());
                if(dl.a.N1() == v) {
                    this.d.c2(false);
                    return;
                }
                this.d.U1();
            }
        }

        super.onCreate(bundle0);
        C0 c00 = C0.c(this.getLayoutInflater());
        L.o(c00, "inflate(...)");
        this.w = c00;
        C0 c01 = null;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        this.setContentView(c00.b());
        C0 c02 = this.w;
        if(c02 == null) {
            L.S("binding");
        }
        else {
            c01 = c02;
        }
        this.S0(c01.m);
        kr.bhbfhfb.designcompat.a.d(this);
        this.setTitle(0x7F1509A9);  // string:setting_recent_gallery_title "최근 방문 설정"
        this.a2();
        this.Z1();
        this.getOnBackPressedDispatcher().h(new h(this));
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        g1 g10 = this.A;
        if(g10 != null) {
            g10.D();
        }
        try {
            this.A = null;
            b b0 = this.y;
            if(b0 != null) {
                b0.dismissAllowingStateLoss();
            }
            this.y = null;
        }
        catch(Exception unused_ex) {
        }
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

