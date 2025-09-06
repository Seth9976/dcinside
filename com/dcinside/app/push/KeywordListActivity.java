package com.dcinside.app.push;

import Y.u0;
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
import com.dcinside.app.realm.z0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.ql.b;
import com.dcinside.app.util.uk;
import g0.f.c;
import g0.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nKeywordListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeywordListActivity.kt\ncom/dcinside/app/push/KeywordListActivity\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,185:1\n25#2:186\n*S KotlinDebug\n*F\n+ 1 KeywordListActivity.kt\ncom/dcinside/app/push/KeywordListActivity\n*L\n159#1:186\n*E\n"})
public final class KeywordListActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @l String s) {
            L.p(appCompatActivity0, "activity");
            L.p(s, "action");
            Intent intent0 = new Intent(appCompatActivity0, KeywordListActivity.class);
            intent0.setAction(s);
            appCompatActivity0.startActivityForResult(intent0, 1047);
        }
    }

    private u0 u;
    @m
    private o v;
    @l
    public static final a w = null;
    @l
    public static final String x = "com.dcinside.app.ArticlePostListActivity.ACTION_KEYWORD_LIST_TYPE";
    @l
    public static final String y = "com.dcinside.app.ArticlePostListActivity.ACTION_USER_LIST_TYPE";

    static {
        KeywordListActivity.w = new a(null);
    }

    private final void L1() {
        u0 u00 = this.u;
        u0 u01 = null;
        if(u00 == null) {
            L.S("binding");
            u00 = null;
        }
        L.o(u00.g, "keywordList");
        Adapter recyclerView$Adapter0 = u00.g.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.push.adapter.d)) {
            recyclerView$Adapter0 = null;
        }
        if((((com.dcinside.app.push.adapter.d)recyclerView$Adapter0) == null ? 0 : ((com.dcinside.app.push.adapter.d)recyclerView$Adapter0).getItemCount()) > 0) {
            u0 u02 = this.u;
            if(u02 == null) {
                L.S("binding");
                u02 = null;
            }
            u02.c.setVisibility(8);
            u0 u03 = this.u;
            if(u03 == null) {
                L.S("binding");
            }
            else {
                u01 = u03;
            }
            u01.g.setVisibility(0);
            return;
        }
        u0 u04 = this.u;
        if(u04 == null) {
            L.S("binding");
            u04 = null;
        }
        u04.c.setVisibility(0);
        u0 u05 = this.u;
        if(u05 == null) {
            L.S("binding");
        }
        else {
            u01 = u05;
        }
        u01.g.setVisibility(8);
    }

    private final void M1(c f$c0) {
        u0 u00 = this.u;
        u0 u01 = null;
        if(u00 == null) {
            L.S("binding");
            u00 = null;
        }
        String s = this.getString(0x7F150752, new Object[]{f$c0.b(), 100});  // string:pages "%1$d / %2$d"
        u00.b.setText(s);
        u0 u02 = this.u;
        if(u02 == null) {
            L.S("binding");
        }
        else {
            u01 = u02;
        }
        com.dcinside.app.push.adapter.d d0 = new com.dcinside.app.push.adapter.d();
        u01.g.setAdapter(d0);
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(u01.g.getContext(), 1, false);
        u01.g.setLayoutManager(linearLayoutManager0);
        b.d(u01.g);
        List list0 = f$c0.a();
        if(list0 == null) {
            list0 = new ArrayList();
        }
        z0.i.g(list0);
        d0.D(list0);
        this.L1();
        this.V1(false);
    }

    private final void N1(f f0) {
        List list0;
        u0 u00 = this.u;
        u0 u01 = null;
        if(u00 == null) {
            L.S("binding");
            u00 = null;
        }
        String s = this.getString(0x7F150752, new Object[]{f0.b(), 100});  // string:pages "%1$d / %2$d"
        u00.b.setText(s);
        u0 u02 = this.u;
        if(u02 == null) {
            L.S("binding");
        }
        else {
            u01 = u02;
        }
        com.dcinside.app.push.adapter.d d0 = new com.dcinside.app.push.adapter.d();
        u01.g.setAdapter(d0);
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(u01.g.getContext(), 1, false);
        u01.g.setLayoutManager(linearLayoutManager0);
        b.d(u01.g);
        Map map0 = f0.a();
        if(map0 == null) {
            list0 = new ArrayList();
        }
        else {
            Collection collection0 = map0.values();
            if(collection0 == null) {
                list0 = new ArrayList();
            }
            else {
                list0 = u.Y5(collection0);
                if(list0 == null) {
                    list0 = new ArrayList();
                }
            }
        }
        d0.C(list0);
        this.L1();
        this.V1(false);
    }

    // 检测为 Lambda 实现
    private static final void O1(KeywordListActivity keywordListActivity0, MenuItem menuItem0, View view0) [...]

    private final void P1() {
        static final class com.dcinside.app.push.KeywordListActivity.b extends N implements Function1 {
            final KeywordListActivity e;

            com.dcinside.app.push.KeywordListActivity.b(KeywordListActivity keywordListActivity0) {
                this.e = keywordListActivity0;
                super(1);
            }

            public final void a(f f0) {
                L.m(f0);
                this.e.N1(f0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f)object0));
                return S0.a;
            }
        }

        this.V1(true);
        this.v = uk.Ik(null).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.KeywordListActivity.b(this), "$tmp0");
            new com.dcinside.app.push.KeywordListActivity.b(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F150326);  // string:failed_notice_data "정보를 가져올 수 없습니다. 잠시 후 다시 시도해주세요."
            this.finish();
        });
    }

    // 检测为 Lambda 实现
    private static final void Q1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void R1(KeywordListActivity keywordListActivity0, Throwable throwable0) [...]

    private final void S1() {
        static final class com.dcinside.app.push.KeywordListActivity.c extends N implements Function1 {
            final KeywordListActivity e;

            com.dcinside.app.push.KeywordListActivity.c(KeywordListActivity keywordListActivity0) {
                this.e = keywordListActivity0;
                super(1);
            }

            public final void a(c f$c0) {
                L.m(f$c0);
                this.e.M1(f$c0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((c)object0));
                return S0.a;
            }
        }

        this.V1(true);
        this.v = uk.Mk(null).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.KeywordListActivity.c(this), "$tmp0");
            new com.dcinside.app.push.KeywordListActivity.c(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F150326);  // string:failed_notice_data "정보를 가져올 수 없습니다. 잠시 후 다시 시도해주세요."
            this.finish();
        });
    }

    // 检测为 Lambda 实现
    private static final void T1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void U1(KeywordListActivity keywordListActivity0, Throwable throwable0) [...]

    private final void V1(boolean z) {
        u0 u00 = this.u;
        if(u00 == null) {
            L.S("binding");
            u00 = null;
        }
        u00.h.setVisibility((z ? 0 : 8));
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1047 && v1 == -1) {
            if(L.g(this.getIntent().getAction(), "com.dcinside.app.ArticlePostListActivity.ACTION_KEYWORD_LIST_TYPE")) {
                this.P1();
            }
            else {
                this.S1();
            }
            this.setResult(-1);
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        u0 u00 = u0.c(this.getLayoutInflater());
        L.o(u00, "inflate(...)");
        this.u = u00;
        u0 u01 = null;
        if(u00 == null) {
            L.S("binding");
            u00 = null;
        }
        this.setContentView(u00.b());
        u0 u02 = this.u;
        if(u02 == null) {
            L.S("binding");
            u02 = null;
        }
        this.S0(u02.j);
        kr.bhbfhfb.designcompat.a.d(this);
        if(L.g(this.getIntent().getAction(), "com.dcinside.app.ArticlePostListActivity.ACTION_KEYWORD_LIST_TYPE")) {
            this.setTitle("키워드 알림 설정");
            this.P1();
            return;
        }
        this.setTitle("이용자 알림 설정");
        u0 u03 = this.u;
        if(u03 == null) {
            L.S("binding");
            u03 = null;
        }
        u03.i.setText("알림 설정된 이용자");
        u0 u04 = this.u;
        if(u04 == null) {
            L.S("binding");
            u04 = null;
        }
        u04.f.setText("설정된 이용자가 없습니다.");
        u0 u05 = this.u;
        if(u05 == null) {
            L.S("binding");
        }
        else {
            u01 = u05;
        }
        u01.d.setText("글 본문 > 우측 상단 알림 버튼에서 설정할 수 있습니다.");
        this.S1();
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
}

