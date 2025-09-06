package com.dcinside.app.write.menu.setting;

import A3.p;
import Y.f0;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable.Factory;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Nk;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class SecretPostSettingActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @m String s, boolean z) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, SecretPostSettingActivity.class);
            intent0.putExtra("com.dcinside.app.EXTRA_SECRET_PASSWORD", s);
            intent0.putExtra("com.dcinside.app.EXTRA_HAS_SECRET", z);
            appCompatActivity0.startActivityForResult(intent0, 1041);
        }
    }

    private f0 u;
    @l
    private final b v;
    @l
    public static final a w = null;
    @l
    public static final String x = "com.dcinside.app.EXTRA_SECRET_PASSWORD";
    @l
    public static final String y = "com.dcinside.app.EXTRA_SECRET_CLEAR";
    @l
    private static final String z = "com.dcinside.app.EXTRA_HAS_SECRET";

    static {
        SecretPostSettingActivity.w = new a(null);
    }

    public SecretPostSettingActivity() {
        public static final class b extends OnBackPressedCallback {
            final SecretPostSettingActivity d;

            b(SecretPostSettingActivity secretPostSettingActivity0) {
                this.d = secretPostSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.finish();
            }
        }

        this.v = new b(this);
    }

    private final void K1() {
        f0 f00 = this.u;
        if(f00 == null) {
            L.S("binding");
            f00 = null;
        }
        String s = String.valueOf(f00.d.getText());
        if(s.length() == 0) {
            this.Q1();
            return;
        }
        Intent intent0 = new Intent();
        intent0.putExtra("com.dcinside.app.EXTRA_SECRET_PASSWORD", s);
        this.setResult(-1, intent0);
        Nk.a.a(this);
        this.finish();
    }

    private final void L1() {
        Intent intent0 = new Intent();
        intent0.putExtra("com.dcinside.app.EXTRA_SECRET_CLEAR", true);
        this.setResult(-1, intent0);
        this.finish();
    }

    private final void M1() {
        String s = this.getIntent().getStringExtra("com.dcinside.app.EXTRA_SECRET_PASSWORD");
        if(s == null) {
            s = "";
        }
        int v = 0;
        boolean z = this.getIntent().getBooleanExtra("com.dcinside.app.EXTRA_HAS_SECRET", false);
        f0 f00 = this.u;
        f0 f01 = null;
        if(f00 == null) {
            L.S("binding");
            f00 = null;
        }
        Editable editable0 = Editable.Factory.getInstance().newEditable(s);
        f00.d.setText(editable0);
        f0 f02 = this.u;
        if(f02 == null) {
            L.S("binding");
        }
        else {
            f01 = f02;
        }
        TextView textView0 = f01.b;
        if(s.length() == 0 && !z) {
            v = 8;
        }
        textView0.setVisibility(v);
    }

    private final void N1() {
        static final class com.dcinside.app.write.menu.setting.SecretPostSettingActivity.d extends N implements Function1 {
            public static final com.dcinside.app.write.menu.setting.SecretPostSettingActivity.d e;

            static {
                com.dcinside.app.write.menu.setting.SecretPostSettingActivity.d.e = new com.dcinside.app.write.menu.setting.SecretPostSettingActivity.d();
            }

            com.dcinside.app.write.menu.setting.SecretPostSettingActivity.d() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F15092D);  // string:secret_setting_remove "비밀글 설정을 해제하시겠습니까?"
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
            final SecretPostSettingActivity e;

            f(SecretPostSettingActivity secretPostSettingActivity0) {
                this.e = secretPostSettingActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.L1();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Nk.a.a(this);
        com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.write.menu.setting.SecretPostSettingActivity.d.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(e.e, "$tmp0");
            return (Boolean)e.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new f(this), "$tmp0");
            new f(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean O1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void P1(Function1 function10, Object object0) [...]

    private final void Q1() {
        static final class g extends N implements Function1 {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F15092B);  // string:secret_setting_need_input "비밀번호를 설정해주세요."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class h extends N implements Function1 {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
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


        static final class i extends N implements Function1 {
            public static final i e;

            static {
                i.e = new i();
            }

            i() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        Nk.a.a(this);
        com.dcinside.app.perform.e.e.a(this).n(g.e).z(0x7F15034A).b().Z1((Object object0) -> {
            L.p(h.e, "$tmp0");
            return (Boolean)h.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(i.e, "$tmp0");
            i.e.invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean R1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void S1(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.setting.SecretPostSettingActivity$onCreate$1", f = "SecretPostSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            final SecretPostSettingActivity l;

            c(SecretPostSettingActivity secretPostSettingActivity0, kotlin.coroutines.d d0) {
                this.l = secretPostSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.N1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        f0 f00 = f0.c(this.getLayoutInflater());
        L.o(f00, "inflate(...)");
        this.u = f00;
        if(f00 == null) {
            L.S("binding");
            f00 = null;
        }
        this.setContentView(f00.b());
        f0 f01 = this.u;
        if(f01 == null) {
            L.S("binding");
            f01 = null;
        }
        this.S0(f01.g);
        kr.bhbfhfb.designcompat.a.d(this);
        this.getOnBackPressedDispatcher().h(this.v);
        f0 f02 = this.u;
        if(f02 == null) {
            L.S("binding");
            f02 = null;
        }
        L.o(f02.b, "postSecretClear");
        c secretPostSettingActivity$c0 = new c(this, null);
        r.M(f02.b, null, secretPostSettingActivity$c0, 1, null);
        this.M1();
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100019, menu0);  // mipmap:ic_launcher28
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.v.g();
                return true;
            }
            case 0x7F0B0075: {  // id:action_write
                this.K1();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }
}

