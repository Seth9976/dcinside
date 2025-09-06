package com.dcinside.app.dccon.setting.list;

import Y.k0;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.f0;
import com.dcinside.app.model.p;
import com.dcinside.app.perform.e;
import com.dcinside.app.perform.p.a;
import com.dcinside.app.read.G;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nDcconListSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconListSettingActivity.kt\ncom/dcinside/app/dccon/setting/list/DcconListSettingActivity\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,172:1\n25#2:173\n*S KotlinDebug\n*F\n+ 1 DcconListSettingActivity.kt\ncom/dcinside/app/dccon/setting/list/DcconListSettingActivity\n*L\n100#1:173\n*E\n"})
public final class DcconListSettingActivity extends d {
    private k0 u;
    @m
    private o v;
    @m
    private o w;
    @m
    private o x;

    private final List Q1(i i0) {
        List list0 = new ArrayList();
        List list1 = i0.w();
        SparseBooleanArray sparseBooleanArray0 = i0.v();
        if(!list1.isEmpty() && sparseBooleanArray0.size() != 0) {
            int v = list1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = ((p)list1.get(v1)).s();
                if(sparseBooleanArray0.get(v2)) {
                    list0.add(String.valueOf(v2));
                }
            }
        }
        return list0;
    }

    // 检测为 Lambda 实现
    private static final void R1(DcconListSettingActivity dcconListSettingActivity0) [...]

    private final void S1(Throwable throwable0) {
        static final class b extends N implements Function1 {
            final Throwable e;

            b(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @m
            public final Object a(@l a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e.getMessage());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((a)object0));
            }
        }


        static final class c extends N implements Function1 {
            final DcconListSettingActivity e;

            c(DcconListSettingActivity dcconListSettingActivity0) {
                this.e = dcconListSettingActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    this.e.Z1();
                    return;
                }
                this.e.finish();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        if(this.s1()) {
            return;
        }
        k0 k00 = this.u;
        if(k00 == null) {
            L.S("binding");
            k00 = null;
        }
        k0.d d0 = k0.d.a();
        k00.e.e(d0);
        this.x = e.e.a(this).n(new b(throwable0)).z(0x7F1508D7).x(0x7F1501F2).b().x5((Object object0) -> {
            L.p(new c(this), "$tmp0");
            new c(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void T1(Function1 function10, Object object0) [...]

    private final void U1() {
        if(this.s1()) {
            return;
        }
        Dl.D(this, 0x7F150968);  // string:setting_dccon_list_save_success "목록을 변경했습니다."
        this.setResult(-1);
        this.finish();
    }

    private final void V1() {
        G.b();
        Al.B(this);
    }

    private final void W1() {
        @s0({"SMAP\nDcconListSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconListSettingActivity.kt\ncom/dcinside/app/dccon/setting/list/DcconListSettingActivity$requestList$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,172:1\n25#2:173\n*S KotlinDebug\n*F\n+ 1 DcconListSettingActivity.kt\ncom/dcinside/app/dccon/setting/list/DcconListSettingActivity$requestList$1\n*L\n89#1:173\n*E\n"})
        static final class com.dcinside.app.dccon.setting.list.DcconListSettingActivity.d extends N implements Function1 {
            final DcconListSettingActivity e;

            com.dcinside.app.dccon.setting.list.DcconListSettingActivity.d(DcconListSettingActivity dcconListSettingActivity0) {
                this.e = dcconListSettingActivity0;
                super(1);
            }

            public final void a(@m com.dcinside.app.response.b b0) {
                if(this.e.s1()) {
                    return;
                }
                k0 k00 = this.e.u;
                Adapter recyclerView$Adapter0 = null;
                if(k00 == null) {
                    L.S("binding");
                    k00 = null;
                }
                k0.d d0 = k0.d.a();
                k00.e.e(d0);
                k0 k01 = this.e.u;
                if(k01 == null) {
                    L.S("binding");
                    k01 = null;
                }
                L.o(k01.d, "settingDcconListRecycler");
                Adapter recyclerView$Adapter1 = k01.d.getAdapter();
                if(recyclerView$Adapter1 instanceof i) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                if(((i)recyclerView$Adapter0) == null) {
                    return;
                }
                L.m(b0);
                ((i)recyclerView$Adapter0).D(b0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.response.b)object0));
                return S0.a;
            }
        }

        if(!this.s1() && kl.a(new o[]{this.v})) {
            k0 k00 = this.u;
            if(k00 == null) {
                L.S("binding");
                k00 = null;
            }
            k0.d d0 = k0.d.e();
            k00.e.e(d0);
            this.v = uk.ek().y5((Object object0) -> {
                L.p(new com.dcinside.app.dccon.setting.list.DcconListSettingActivity.d(this), "$tmp0");
                new com.dcinside.app.dccon.setting.list.DcconListSettingActivity.d(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                if(this.s1()) {
                    return;
                }
                k0 k00 = this.u;
                if(k00 == null) {
                    L.S("binding");
                    k00 = null;
                }
                k0.d d0 = k0.d.g(throwable0);
                k00.e.e(d0);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void X1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void Y1(DcconListSettingActivity dcconListSettingActivity0, Throwable throwable0) [...]

    private final void Z1() {
        @s0({"SMAP\nDcconListSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconListSettingActivity.kt\ncom/dcinside/app/dccon/setting/list/DcconListSettingActivity$requestSave$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,172:1\n37#2,2:173\n*S KotlinDebug\n*F\n+ 1 DcconListSettingActivity.kt\ncom/dcinside/app/dccon/setting/list/DcconListSettingActivity$requestSave$1\n*L\n117#1:173,2\n*E\n"})
        static final class com.dcinside.app.dccon.setting.list.DcconListSettingActivity.e extends N implements Function1 {
            public static final com.dcinside.app.dccon.setting.list.DcconListSettingActivity.e e;

            static {
                com.dcinside.app.dccon.setting.list.DcconListSettingActivity.e.e = new com.dcinside.app.dccon.setting.list.DcconListSettingActivity.e();
            }

            com.dcinside.app.dccon.setting.list.DcconListSettingActivity.e() {
                super(1);
            }

            public final g a(List list0) {
                L.m(list0);
                String[] arr_s = (String[])list0.toArray(new String[0]);
                return uk.fk(((String[])Arrays.copyOf(arr_s, arr_s.length)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        static final class f extends N implements Function1 {
            final DcconListSettingActivity e;

            f(DcconListSettingActivity dcconListSettingActivity0) {
                this.e = dcconListSettingActivity0;
                super(1);
            }

            public final Boolean a(f0 f00) {
                return Boolean.valueOf(this.e.q1());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((f0)object0));
            }
        }


        static final class com.dcinside.app.dccon.setting.list.DcconListSettingActivity.g extends N implements Function1 {
            final DcconListSettingActivity e;

            com.dcinside.app.dccon.setting.list.DcconListSettingActivity.g(DcconListSettingActivity dcconListSettingActivity0) {
                this.e = dcconListSettingActivity0;
                super(1);
            }

            public final void a(f0 f00) {
                this.e.U1();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        if(!this.s1() && kl.a(new o[]{this.w})) {
            k0 k00 = this.u;
            k0 k01 = null;
            if(k00 == null) {
                L.S("binding");
                k00 = null;
            }
            L.o(k00.d, "settingDcconListRecycler");
            Adapter recyclerView$Adapter0 = k00.d.getAdapter();
            if(!(recyclerView$Adapter0 instanceof i)) {
                recyclerView$Adapter0 = null;
            }
            if(((i)recyclerView$Adapter0) == null) {
                return;
            }
            List list0 = this.Q1(((i)recyclerView$Adapter0));
            int v = list0.size();
            if(v <= 0) {
                Dl.D(this, 0x7F150966);  // string:setting_dccon_list_failed_min "사용 디시콘이 없습니다. 1개 이상 체크해주세요."
                return;
            }
            long v1 = jl.a.Z();
            if(((long)v) > v1) {
                Dl.G(this, this.getString(0x7F150965, new Object[]{v1}));  // string:setting_dccon_list_failed_max "사용 디시콘은 %1$d개까지만 선택 가능합니다.\n사용 해제 후 변경해주세요."
                return;
            }
            k0 k02 = this.u;
            if(k02 == null) {
                L.S("binding");
            }
            else {
                k01 = k02;
            }
            k0.d d0 = k0.d.e();
            k01.e.e(d0);
            this.w = g.Q2(list0).f2((Object object0) -> {
                L.p(com.dcinside.app.dccon.setting.list.DcconListSettingActivity.e.e, "$tmp0");
                return (g)com.dcinside.app.dccon.setting.list.DcconListSettingActivity.e.e.invoke(object0);
            }).M3(rx.android.schedulers.a.c()).Z1((Object object0) -> {
                L.p(new f(this), "$tmp0");
                return (Boolean)new f(this).invoke(object0);
            }).y5((Object object0) -> {
                L.p(new com.dcinside.app.dccon.setting.list.DcconListSettingActivity.g(this), "$tmp0");
                new com.dcinside.app.dccon.setting.list.DcconListSettingActivity.g(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                L.m(throwable0);
                this.S1(throwable0);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final g a2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final Boolean b2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void c2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void d2(DcconListSettingActivity dcconListSettingActivity0, Throwable throwable0) [...]

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        if(kl.a(new o[]{this.v})) {
            k0 k00 = this.u;
            if(k00 == null) {
                L.S("binding");
                k00 = null;
            }
            Adapter recyclerView$Adapter0 = k00.d.getAdapter();
            if(recyclerView$Adapter0 instanceof i && ((i)recyclerView$Adapter0).y()) {
                this.Z1();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.dccon.setting.list.DcconListSettingActivity$onCreate$3", f = "DcconListSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.dccon.setting.list.DcconListSettingActivity.a extends kotlin.coroutines.jvm.internal.o implements A3.p {
            int k;
            final DcconListSettingActivity l;

            com.dcinside.app.dccon.setting.list.DcconListSettingActivity.a(DcconListSettingActivity dcconListSettingActivity0, kotlin.coroutines.d d0) {
                this.l = dcconListSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.dccon.setting.list.DcconListSettingActivity.a(this.l, d0).invokeSuspend(S0.a);
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
                this.l.V1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        k0 k00 = k0.c(this.getLayoutInflater());
        L.o(k00, "inflate(...)");
        this.u = k00;
        if(k00 == null) {
            L.S("binding");
            k00 = null;
        }
        this.setContentView(k00.b());
        k0 k01 = this.u;
        if(k01 == null) {
            L.S("binding");
            k01 = null;
        }
        this.S0(k01.f);
        kr.bhbfhfb.designcompat.a.d(this);
        long v = jl.a.Z();
        ((TextView)this.findViewById(0x7F0B0E4C)).setText(this.getString(0x7F150967, new Object[]{v}));  // id:setting_dccon_list_guide
        k0 k02 = this.u;
        if(k02 == null) {
            L.S("binding");
            k02 = null;
        }
        com.dcinside.app.dccon.setting.list.d d0 = () -> {
            L.p(this, "this$0");
            this.W1();
        };
        k02.e.setOnRetryListener(d0);
        k0 k03 = this.u;
        if(k03 == null) {
            L.S("binding");
            k03 = null;
        }
        i i0 = new i();
        k03.d.setAdapter(i0);
        com.dcinside.app.util.ql.b.d(k03.d);
        k0 k04 = this.u;
        if(k04 == null) {
            L.S("binding");
            k04 = null;
        }
        L.o(k04.g, "settingDcconShop");
        com.dcinside.app.dccon.setting.list.DcconListSettingActivity.a dcconListSettingActivity$a0 = new com.dcinside.app.dccon.setting.list.DcconListSettingActivity.a(this, null);
        r.M(k04.g, null, dcconListSettingActivity$a0, 1, null);
        this.W1();
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        kl.b(new o[]{this.v, this.w, this.x});
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

