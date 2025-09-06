package com.dcinside.app.push;

import Y.z0;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.backup.BackupActivity;
import com.dcinside.app.base.d;
import com.dcinside.app.model.f0;
import com.dcinside.app.push.adapter.b;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nSettingPushGalleryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingPushGalleryActivity.kt\ncom/dcinside/app/push/SettingPushGalleryActivity\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,292:1\n25#2:293\n*S KotlinDebug\n*F\n+ 1 SettingPushGalleryActivity.kt\ncom/dcinside/app/push/SettingPushGalleryActivity\n*L\n237#1:293\n*E\n"})
public final class SettingPushGalleryActivity extends d implements i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, SettingPushGalleryActivity.class);
            intent0.setAction("SettingPushListActionTypeNotice");
            appCompatActivity0.startActivityForResult(intent0, 1047);
        }

        public final void b(@l AppCompatActivity appCompatActivity0) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, SettingPushGalleryActivity.class);
            intent0.setAction("SettingPushListActionTypeRecommend");
            appCompatActivity0.startActivityForResult(intent0, 1047);
        }

        public final void c(@l AppCompatActivity appCompatActivity0, @l String s, @l String s1) {
            L.p(appCompatActivity0, "activity");
            L.p(s, "gallId");
            L.p(s1, "gallName");
            Intent intent0 = new Intent(appCompatActivity0, SettingPushGalleryActivity.class);
            intent0.setAction("SettingPushListActionTypeUser");
            intent0.putExtra("com.dcinside.app.SettingPushGalleryActivity.EXTRA_GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.SettingPushGalleryActivity.EXTRA_GALLERY_NAME", s1);
            appCompatActivity0.startActivityForResult(intent0, 1047);
        }
    }

    @l
    private static final String A = "com.dcinside.app.SettingPushGalleryActivity.EXTRA_GALLERY_NAME";
    public static final int B = 100;
    public static final int C = 100;
    private static final int D = 50;
    private static final int E = 30;
    public static final int F = 100;
    @l
    private static final String G = "SettingPushListActionTypeRecommend";
    @l
    private static final String H = "SettingPushListActionTypeNotice";
    @l
    private static final String I = "SettingPushListActionTypeUser";
    private z0 u;
    @m
    private o v;
    @m
    private String w;
    @m
    private String x;
    @l
    public static final a y = null;
    @l
    private static final String z = "com.dcinside.app.SettingPushGalleryActivity.EXTRA_GALLERY_ID";

    static {
        SettingPushGalleryActivity.y = new a(null);
    }

    @Override  // com.dcinside.app.push.i
    public void F(@l String s, @m String s1) {
        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150281);  // string:delete_user_push_gallery "등록한 이용자를 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class f extends N implements Function1 {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
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


        static final class g extends N implements Function1 {
            final SettingPushGalleryActivity e;
            final String f;
            final String g;

            g(SettingPushGalleryActivity settingPushGalleryActivity0, String s, String s1) {
                this.e = settingPushGalleryActivity0;
                this.f = s;
                this.g = s1;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.k2(this.f, (this.g == null ? this.e.x : this.g));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(s, "userId");
        com.dcinside.app.perform.e.e.a(this).n(e.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(f.e, "$tmp0");
            return (Boolean)f.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new g(this, s, s1), "$tmp0");
            new g(this, s, s1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    private final void a2() {
        z0 z00 = this.u;
        z0 z01 = null;
        if(z00 == null) {
            L.S("binding");
            z00 = null;
        }
        L.o(z00.h, "settingPushList");
        Adapter recyclerView$Adapter0 = z00.h.getAdapter();
        if(!(recyclerView$Adapter0 instanceof b)) {
            recyclerView$Adapter0 = null;
        }
        if((((b)recyclerView$Adapter0) == null ? 0 : ((b)recyclerView$Adapter0).getItemCount()) > 0) {
            z0 z02 = this.u;
            if(z02 == null) {
                L.S("binding");
                z02 = null;
            }
            z02.g.setVisibility(8);
            z0 z03 = this.u;
            if(z03 == null) {
                L.S("binding");
            }
            else {
                z01 = z03;
            }
            z01.h.setVisibility(0);
            return;
        }
        z0 z04 = this.u;
        if(z04 == null) {
            L.S("binding");
            z04 = null;
        }
        z04.g.setVisibility(0);
        z0 z05 = this.u;
        if(z05 == null) {
            L.S("binding");
        }
        else {
            z01 = z05;
        }
        z01.h.setVisibility(8);
    }

    // 检测为 Lambda 实现
    private static final Boolean b2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void c2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void d2(SettingPushGalleryActivity settingPushGalleryActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void e2(SettingPushGalleryActivity settingPushGalleryActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final Boolean f2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void g2(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.push.i
    public void h(@l String s, @m String s1) {
        static final class com.dcinside.app.push.SettingPushGalleryActivity.b extends N implements Function1 {
            public static final com.dcinside.app.push.SettingPushGalleryActivity.b e;

            static {
                com.dcinside.app.push.SettingPushGalleryActivity.b.e = new com.dcinside.app.push.SettingPushGalleryActivity.b();
            }

            com.dcinside.app.push.SettingPushGalleryActivity.b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F15027E);  // string:delete_recommend_push_gallery "등록한 갤러리를 삭제하시겠습니까?"
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


        static final class com.dcinside.app.push.SettingPushGalleryActivity.d extends N implements Function1 {
            final SettingPushGalleryActivity e;
            final String f;

            com.dcinside.app.push.SettingPushGalleryActivity.d(SettingPushGalleryActivity settingPushGalleryActivity0, String s) {
                this.e = settingPushGalleryActivity0;
                this.f = s;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.h2(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(s, "dataValue");
        com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.push.SettingPushGalleryActivity.b.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(c.e, "$tmp0");
            return (Boolean)c.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.SettingPushGalleryActivity.d(this, s1), "$tmp0");
            new com.dcinside.app.push.SettingPushGalleryActivity.d(this, s1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    private final void h2(String s) {
        @s0({"SMAP\nSettingPushGalleryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingPushGalleryActivity.kt\ncom/dcinside/app/push/SettingPushGalleryActivity$deleteRecommendPush$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,292:1\n25#2:293\n*S KotlinDebug\n*F\n+ 1 SettingPushGalleryActivity.kt\ncom/dcinside/app/push/SettingPushGalleryActivity$deleteRecommendPush$1\n*L\n199#1:293\n*E\n"})
        static final class h extends N implements Function1 {
            final SettingPushGalleryActivity e;
            final String f;

            h(SettingPushGalleryActivity settingPushGalleryActivity0, String s) {
                this.e = settingPushGalleryActivity0;
                this.f = s;
                super(1);
            }

            public final void a(f0 f00) {
                z0 z00 = this.e.u;
                z0 z01 = null;
                if(z00 == null) {
                    L.S("binding");
                    z00 = null;
                }
                L.o(z00.h, "settingPushList");
                Adapter recyclerView$Adapter0 = z00.h.getAdapter();
                if(!(recyclerView$Adapter0 instanceof b)) {
                    recyclerView$Adapter0 = null;
                }
                if(((b)recyclerView$Adapter0) != null) {
                    ((b)recyclerView$Adapter0).A(this.f, false);
                }
                int v = ((b)recyclerView$Adapter0) == null ? 0 : ((b)recyclerView$Adapter0).getItemCount();
                int v1 = L.g(this.e.getIntent().getAction(), "SettingPushListActionTypeNotice") ? 30 : 50;
                z0 z02 = this.e.u;
                if(z02 == null) {
                    L.S("binding");
                    z02 = null;
                }
                String s = this.e.getString(0x7F150752, new Object[]{v, v1});  // string:pages "%1$d / %2$d"
                z02.f.setText(s);
                this.e.a2();
                z0 z03 = this.e.u;
                if(z03 == null) {
                    L.S("binding");
                }
                else {
                    z01 = z03;
                }
                z01.e.setVisibility(8);
                this.e.setResult(-1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        rx.g g0;
        z0 z00 = this.u;
        if(z00 == null) {
            L.S("binding");
            z00 = null;
        }
        z00.e.setVisibility(0);
        String s1 = this.getIntent().getAction();
        if(s1 == null) {
            g0 = uk.NG(false, s, null);
        }
        else {
            switch(s1) {
                case "SettingPushListActionTypeNotice": {
                    g0 = uk.LG(false, s, null);
                    break;
                }
                case "SettingPushListActionTypeRecommend": {
                    g0 = uk.NG(false, s, null);
                    break;
                }
                default: {
                    g0 = uk.NG(false, s, null);
                }
            }
        }
        this.v = g0.y5((Object object0) -> {
            L.p(new h(this, s), "$tmp0");
            new h(this, s).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F15030E);  // string:failed_apply_notice "저장에 실패했습니다. 잠시 후 다시 시도해주세요."
            z0 z00 = this.u;
            if(z00 == null) {
                L.S("binding");
                z00 = null;
            }
            z00.e.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void i2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void j2(SettingPushGalleryActivity settingPushGalleryActivity0, Throwable throwable0) [...]

    private final void k2(String s, String s1) {
        @s0({"SMAP\nSettingPushGalleryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingPushGalleryActivity.kt\ncom/dcinside/app/push/SettingPushGalleryActivity$deleteUserPush$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,292:1\n25#2:293\n*S KotlinDebug\n*F\n+ 1 SettingPushGalleryActivity.kt\ncom/dcinside/app/push/SettingPushGalleryActivity$deleteUserPush$1\n*L\n219#1:293\n*E\n"})
        static final class com.dcinside.app.push.SettingPushGalleryActivity.i extends N implements Function1 {
            final SettingPushGalleryActivity e;
            final String f;
            final String g;

            com.dcinside.app.push.SettingPushGalleryActivity.i(SettingPushGalleryActivity settingPushGalleryActivity0, String s, String s1) {
                this.e = settingPushGalleryActivity0;
                this.f = s;
                this.g = s1;
                super(1);
            }

            public final void a(f0 f00) {
                z0 z00 = this.e.u;
                z0 z01 = null;
                if(z00 == null) {
                    L.S("binding");
                    z00 = null;
                }
                L.o(z00.h, "settingPushList");
                Adapter recyclerView$Adapter0 = z00.h.getAdapter();
                if(!(recyclerView$Adapter0 instanceof b)) {
                    recyclerView$Adapter0 = null;
                }
                if(((b)recyclerView$Adapter0) != null) {
                    ((b)recyclerView$Adapter0).B(this.f);
                }
                int v = ((b)recyclerView$Adapter0) == null ? 0 : ((b)recyclerView$Adapter0).getItemCount();
                z0 z02 = this.e.u;
                if(z02 == null) {
                    L.S("binding");
                    z02 = null;
                }
                String s = this.e.getString(0x7F150752, new Object[]{v, 100});  // string:pages "%1$d / %2$d"
                z02.f.setText(s);
                this.e.a2();
                com.dcinside.app.realm.z0.a z0$a0 = com.dcinside.app.realm.z0.i;
                String s1 = this.g;
                String s2 = "";
                if(s1 == null) {
                    s1 = "";
                }
                String s3 = this.f;
                if(s3 != null) {
                    s2 = s3;
                }
                z0$a0.f(s1, s2);
                z0 z03 = this.e.u;
                if(z03 == null) {
                    L.S("binding");
                }
                else {
                    z01 = z03;
                }
                z01.e.setVisibility(8);
                this.e.setResult(-1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        z0 z00 = this.u;
        if(z00 == null) {
            L.S("binding");
            z00 = null;
        }
        z00.e.setVisibility(0);
        this.v = uk.OG(false, s1, null, null, s).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.SettingPushGalleryActivity.i(this, s, s1), "$tmp0");
            new com.dcinside.app.push.SettingPushGalleryActivity.i(this, s, s1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F15030E);  // string:failed_apply_notice "저장에 실패했습니다. 잠시 후 다시 시도해주세요."
            z0 z00 = this.u;
            if(z00 == null) {
                L.S("binding");
                z00 = null;
            }
            z00.e.setVisibility(8);
        });
    }

    // 检测为 Lambda 实现
    private static final void l2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void m2(SettingPushGalleryActivity settingPushGalleryActivity0, Throwable throwable0) [...]

    private final void n2(g0.f.c f$c0) {
        z0 z00 = this.u;
        z0 z01 = null;
        if(z00 == null) {
            L.S("binding");
            z00 = null;
        }
        z00.i.setText("알림 설정된 이용자");
        z0 z02 = this.u;
        if(z02 == null) {
            L.S("binding");
            z02 = null;
        }
        String s = this.getString(0x7F150752, new Object[]{f$c0.b(), 100});  // string:pages "%1$d / %2$d"
        z02.f.setText(s);
        z0 z03 = this.u;
        if(z03 == null) {
            L.S("binding");
        }
        else {
            z01 = z03;
        }
        b b0 = new b();
        z01.h.setAdapter(b0);
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(z01.h.getContext(), 1, false);
        z01.h.setLayoutManager(linearLayoutManager0);
        b0.H(f$c0.a());
        this.a2();
    }

    private final void o2(g0.f.c f$c0) {
        int v = L.g(this.getIntent().getAction(), "SettingPushListActionTypeNotice") ? 30 : 50;
        z0 z00 = this.u;
        z0 z01 = null;
        if(z00 == null) {
            L.S("binding");
            z00 = null;
        }
        String s = this.getString(0x7F150752, new Object[]{f$c0.b(), v});  // string:pages "%1$d / %2$d"
        z00.f.setText(s);
        z0 z02 = this.u;
        if(z02 == null) {
            L.S("binding");
        }
        else {
            z01 = z02;
        }
        b b0 = new b();
        z01.h.setAdapter(b0);
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(z01.h.getContext(), 1, false);
        z01.h.setLayoutManager(linearLayoutManager0);
        b0.G(f$c0.a());
        this.a2();
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        String s1;
        super.onCreate(bundle0);
        z0 z00 = z0.c(this.getLayoutInflater());
        L.o(z00, "inflate(...)");
        this.u = z00;
        z0 z01 = null;
        if(z00 == null) {
            L.S("binding");
            z00 = null;
        }
        this.setContentView(z00.b());
        z0 z02 = this.u;
        if(z02 == null) {
            L.S("binding");
            z02 = null;
        }
        this.S0(z02.j);
        kr.bhbfhfb.designcompat.a.d(this);
        String s = this.getIntent().getAction();
        this.w = s;
        if(s == null) {
            s1 = "개념글 알림 설정";
        }
        else {
            switch(s) {
                case "SettingPushListActionTypeNotice": {
                    s1 = "공지 알림 설정";
                    break;
                }
                case "SettingPushListActionTypeRecommend": {
                    s1 = "개념글 알림 설정";
                    break;
                }
                case "SettingPushListActionTypeUser": {
                    s1 = this.getString(0x7F150998, new Object[]{this.getIntent().getStringExtra("com.dcinside.app.SettingPushGalleryActivity.EXTRA_GALLERY_NAME")});  // string:setting_push_user_gallery_title "이용자 - %s"
                    break;
                }
                default: {
                    s1 = "개념글 알림 설정";
                }
            }
        }
        this.setTitle(s1);
        if(L.g(this.w, "SettingPushListActionTypeUser")) {
            this.x = this.getIntent().getStringExtra("com.dcinside.app.SettingPushGalleryActivity.EXTRA_GALLERY_ID");
            z0 z03 = this.u;
            if(z03 == null) {
                L.S("binding");
                z03 = null;
            }
            z03.d.setText("설정된 이용자가 없습니다.");
            z0 z04 = this.u;
            if(z04 == null) {
                L.S("binding");
            }
            else {
                z01 = z04;
            }
            z01.b.setText("글 본문 > 우측 상단 알림 버튼에서 설정할 수 있습니다.");
            this.t2();
            return;
        }
        this.q2();
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100001, menu0);  // mipmap:gall_base_icon2
        MenuItem menuItem0 = menu0.findItem(0x7F0B004B);  // id:action_backup
        if(menuItem0 != null) {
            View view0 = menuItem0.getActionView();
            Button button0 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B082E));  // id:menu_save
            if(button0 != null) {
                button0.setOnClickListener((View view0) -> {
                    L.p(this, "this$0");
                    L.m(menuItem0);
                    this.onOptionsItemSelected(menuItem0);
                });
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        kl.b(new o[]{this.v});
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.getOnBackPressedDispatcher().p();
                return true;
            }
            case 0x7F0B004B: {  // id:action_backup
                BackupActivity.C.a(this);
                return super.onOptionsItemSelected(menuItem0);
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void p2(SettingPushGalleryActivity settingPushGalleryActivity0, MenuItem menuItem0, View view0) [...]

    private final void q2() {
        static final class j extends N implements Function1 {
            final SettingPushGalleryActivity e;

            j(SettingPushGalleryActivity settingPushGalleryActivity0) {
                this.e = settingPushGalleryActivity0;
                super(1);
            }

            public final void a(g0.f.c f$c0) {
                L.m(f$c0);
                this.e.o2(f$c0);
                z0 z00 = this.e.u;
                if(z00 == null) {
                    L.S("binding");
                    z00 = null;
                }
                z00.e.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((g0.f.c)object0));
                return S0.a;
            }
        }

        rx.g g0;
        z0 z00 = this.u;
        if(z00 == null) {
            L.S("binding");
            z00 = null;
        }
        z00.e.setVisibility(0);
        String s = this.getIntent().getAction();
        if(s == null) {
            g0 = uk.Kk();
        }
        else {
            switch(s) {
                case "SettingPushListActionTypeNotice": {
                    g0 = uk.Jk();
                    break;
                }
                case "SettingPushListActionTypeRecommend": {
                    g0 = uk.Kk();
                    break;
                }
                default: {
                    g0 = uk.Kk();
                }
            }
        }
        this.v = g0.y5((Object object0) -> {
            L.p(new j(this), "$tmp0");
            new j(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F150326);  // string:failed_notice_data "정보를 가져올 수 없습니다. 잠시 후 다시 시도해주세요."
            this.finish();
        });
    }

    // 检测为 Lambda 实现
    private static final void r2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s2(SettingPushGalleryActivity settingPushGalleryActivity0, Throwable throwable0) [...]

    private final void t2() {
        static final class k extends N implements Function1 {
            final SettingPushGalleryActivity e;

            k(SettingPushGalleryActivity settingPushGalleryActivity0) {
                this.e = settingPushGalleryActivity0;
                super(1);
            }

            public final void a(g0.f.c f$c0) {
                L.m(f$c0);
                this.e.n2(f$c0);
                z0 z00 = this.e.u;
                if(z00 == null) {
                    L.S("binding");
                    z00 = null;
                }
                z00.e.setVisibility(8);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((g0.f.c)object0));
                return S0.a;
            }
        }

        z0 z00 = this.u;
        if(z00 == null) {
            L.S("binding");
            z00 = null;
        }
        z00.e.setVisibility(0);
        this.v = uk.Mk(this.x).y5((Object object0) -> {
            L.p(new k(this), "$tmp0");
            new k(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F150326);  // string:failed_notice_data "정보를 가져올 수 없습니다. 잠시 후 다시 시도해주세요."
            this.finish();
        });
    }

    // 检测为 Lambda 实现
    private static final void u2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void v2(SettingPushGalleryActivity settingPushGalleryActivity0, Throwable throwable0) [...]
}

