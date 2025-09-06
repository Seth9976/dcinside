package com.dcinside.app.settings.spoiler;

import A3.p;
import Y.E0;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.dl;
import kotlin.J;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class SpoilerSettingActivity extends d {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            try {
                arr_v[c.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[c.g.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    private E0 u;
    @l
    private final b v;

    public SpoilerSettingActivity() {
        public static final class b extends OnBackPressedCallback {
            final SpoilerSettingActivity d;

            b(SpoilerSettingActivity spoilerSettingActivity0) {
                this.d = spoilerSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.finish();
            }
        }

        this.v = new b(this);
    }

    private final int I1(c c0) {
        switch(c0) {
            case 1: {
                return 0x7F1509E1;  // string:spoiler_no_warn "경고 안 함"
            }
            case 2: {
                return 0x7F1509E7;  // string:spoiler_warn_in_title_and_read "제목 + 본문"
            }
            case 3: {
                return 0x7F1509E6;  // string:spoiler_warn_in_title "제목"
            }
            case 4: {
                return 0x7F1509E5;  // string:spoiler_warn_in_read "본문"
            }
            default: {
                throw new J();
            }
        }
    }

    private final void J1(c c0) {
        dl.a.a6(c0.c());
        E0 e00 = this.u;
        if(e00 == null) {
            L.S("binding");
            e00 = null;
        }
        L.o(e00.g, "settingSpoilerWarnValue");
        int v = this.I1(c0);
        r.o0(e00.g, v);
    }

    private final void K1() {
        static final class com.dcinside.app.settings.spoiler.SpoilerSettingActivity.c extends N implements Function1 {
            public static final com.dcinside.app.settings.spoiler.SpoilerSettingActivity.c e;

            static {
                com.dcinside.app.settings.spoiler.SpoilerSettingActivity.c.e = new com.dcinside.app.settings.spoiler.SpoilerSettingActivity.c();
            }

            com.dcinside.app.settings.spoiler.SpoilerSettingActivity.c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.J(0x7F1509E3);  // string:spoiler_setting_title "스포일러 경고"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.settings.spoiler.SpoilerSettingActivity.d extends N implements Function1 {
            public static final com.dcinside.app.settings.spoiler.SpoilerSettingActivity.d e;

            static {
                com.dcinside.app.settings.spoiler.SpoilerSettingActivity.d.e = new com.dcinside.app.settings.spoiler.SpoilerSettingActivity.d();
            }

            com.dcinside.app.settings.spoiler.SpoilerSettingActivity.d() {
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
            final SpoilerSettingActivity e;
            final c[] f;

            e(SpoilerSettingActivity spoilerSettingActivity0, c[] arr_c) {
                this.e = spoilerSettingActivity0;
                this.f = arr_c;
                super(1);
            }

            public final void a(Integer integer0) {
                L.m(integer0);
                this.e.J1(this.f[((int)integer0)]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        String[] arr_s = this.getResources().getStringArray(0x7F030033);  // array:spoiler_warn_type
        L.o(arr_s, "getStringArray(...)");
        com.dcinside.app.perform.e.a.w(com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.settings.spoiler.SpoilerSettingActivity.c.e), arr_s, 0, 2, null).d().Z1((Object object0) -> {
            L.p(com.dcinside.app.settings.spoiler.SpoilerSettingActivity.d.e, "$tmp0");
            return (Boolean)com.dcinside.app.settings.spoiler.SpoilerSettingActivity.d.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new e(this, new c[]{c.e, c.f, c.g, c.h}), "$tmp0");
            new e(this, new c[]{c.e, c.f, c.g, c.h}).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean L1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void M1(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        this.v.g();
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @f(c = "com.dcinside.app.settings.spoiler.SpoilerSettingActivity$onCreate$1", f = "SpoilerSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.spoiler.SpoilerSettingActivity.f extends o implements p {
            int k;
            final SpoilerSettingActivity l;

            com.dcinside.app.settings.spoiler.SpoilerSettingActivity.f(SpoilerSettingActivity spoilerSettingActivity0, kotlin.coroutines.d d0) {
                this.l = spoilerSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.spoiler.SpoilerSettingActivity.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.K1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        E0 e00 = E0.c(this.getLayoutInflater());
        L.o(e00, "inflate(...)");
        this.u = e00;
        if(e00 == null) {
            L.S("binding");
            e00 = null;
        }
        this.setContentView(e00.b());
        this.getOnBackPressedDispatcher().h(this.v);
        E0 e01 = this.u;
        if(e01 == null) {
            L.S("binding");
            e01 = null;
        }
        this.S0(e01.b);
        kr.bhbfhfb.designcompat.a.d(this);
        E0 e02 = this.u;
        if(e02 == null) {
            L.S("binding");
            e02 = null;
        }
        int v = dl.a.k2();
        int v1 = this.I1(c.d.a(v));
        e02.g.setText(v1);
        E0 e03 = this.u;
        if(e03 == null) {
            L.S("binding");
            e03 = null;
        }
        L.o(e03.c, "settingSpoilerWarn");
        com.dcinside.app.settings.spoiler.SpoilerSettingActivity.f spoilerSettingActivity$f0 = new com.dcinside.app.settings.spoiler.SpoilerSettingActivity.f(this, null);
        r.M(e03.c, null, spoilerSettingActivity$f0, 1, null);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.v.g();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

