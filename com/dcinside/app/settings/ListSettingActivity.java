package com.dcinside.app.settings;

import A3.p;
import Y.w0;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.type.E;
import com.dcinside.app.util.dl;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nListSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListSettingActivity.kt\ncom/dcinside/app/settings/ListSettingActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,93:1\n37#2,2:94\n*S KotlinDebug\n*F\n+ 1 ListSettingActivity.kt\ncom/dcinside/app/settings/ListSettingActivity\n*L\n60#1:94,2\n*E\n"})
public final class ListSettingActivity extends d {
    private w0 u;
    @l
    private final a v;

    public ListSettingActivity() {
        public static final class a extends OnBackPressedCallback {
            final ListSettingActivity d;

            a(ListSettingActivity listSettingActivity0) {
                this.d = listSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.finish();
            }
        }

        this.v = new a(this);
    }

    private final String I1(int v) {
        switch(v) {
            case 0: {
                L.o("보라색", "getString(...)");
                return "보라색";
            }
            case 1: {
                L.o("회색", "getString(...)");
                return "회색";
            }
            case 2: {
                L.o("표시 안 함", "getString(...)");
                return "표시 안 함";
            }
            default: {
                L.o("옅은 회색", "getString(...)");
                return "옅은 회색";
            }
        }
    }

    private final void J1() {
        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.J(0x7F15085B);  // string:read_log_option_title "읽은 글 표시"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.settings.ListSettingActivity.d extends N implements Function1 {
            public static final com.dcinside.app.settings.ListSettingActivity.d e;

            static {
                com.dcinside.app.settings.ListSettingActivity.d.e = new com.dcinside.app.settings.ListSettingActivity.d();
            }

            com.dcinside.app.settings.ListSettingActivity.d() {
                super(1);
            }

            public final Boolean a(Integer integer0) {
                L.m(integer0);
                return ((int)integer0) < 0 ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class e extends N implements Function1 {
            final ListSettingActivity e;

            e(ListSettingActivity listSettingActivity0) {
                this.e = listSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.M1(((int)integer0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        ArrayList arrayList0 = new ArrayList();
        E[] arr_e = E.values();
        for(int v = 0; v < arr_e.length; ++v) {
            arrayList0.add(this.I1(arr_e[v].c()));
        }
        String[] arr_s = (String[])arrayList0.toArray(new String[0]);
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).n(c.e), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(com.dcinside.app.settings.ListSettingActivity.d.e, "$tmp0");
            return (Boolean)com.dcinside.app.settings.ListSettingActivity.d.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new e(this), "$tmp0");
            new e(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean K1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void L1(Function1 function10, Object object0) [...]

    private final void M1(int v) {
        E[] arr_e = E.values();
        if(v >= 0 && v < arr_e.length) {
            int v1 = arr_e[v].c();
            dl.a.w5(v1);
            w0 w00 = this.u;
            if(w00 == null) {
                L.S("binding");
                w00 = null;
            }
            String s = this.I1(v1);
            w00.e.setText(s);
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.settings.ListSettingActivity$onCreate$1", f = "ListSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final ListSettingActivity l;

            b(ListSettingActivity listSettingActivity0, kotlin.coroutines.d d0) {
                this.l = listSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
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
                this.l.J1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        this.getOnBackPressedDispatcher().h(this.v);
        w0 w00 = w0.c(this.getLayoutInflater());
        L.o(w00, "inflate(...)");
        this.u = w00;
        if(w00 == null) {
            L.S("binding");
            w00 = null;
        }
        this.setContentView(w00.b());
        w0 w01 = this.u;
        if(w01 == null) {
            L.S("binding");
            w01 = null;
        }
        this.S0(w01.f);
        kr.bhbfhfb.designcompat.a.d(this);
        w0 w02 = this.u;
        if(w02 == null) {
            L.S("binding");
            w02 = null;
        }
        String s = this.I1(dl.a.H1());
        w02.e.setText(s);
        w0 w03 = this.u;
        if(w03 == null) {
            L.S("binding");
            w03 = null;
        }
        L.o(w03.b, "settingListLogOption");
        b listSettingActivity$b0 = new b(this, null);
        r.M(w03.b, null, listSettingActivity$b0, 1, null);
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

