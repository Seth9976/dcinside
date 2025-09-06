package com.dcinside.app.push;

import Y.j0;
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
import com.dcinside.app.realm.e0;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import g0.b;
import g0.f.c;
import java.util.List;
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

@s0({"SMAP\nArticlePostListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticlePostListActivity.kt\ncom/dcinside/app/push/ArticlePostListActivity\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,175:1\n25#2:176\n*S KotlinDebug\n*F\n+ 1 ArticlePostListActivity.kt\ncom/dcinside/app/push/ArticlePostListActivity\n*L\n143#1:176\n*E\n"})
public final class ArticlePostListActivity extends d implements i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @l String s, @l String s1) {
            L.p(appCompatActivity0, "activity");
            L.p(s, "galleryId");
            L.p(s1, "galleryName");
            Intent intent0 = new Intent(appCompatActivity0, ArticlePostListActivity.class);
            intent0.putExtra("galleryId", s);
            intent0.putExtra("galleryName", s1);
            appCompatActivity0.startActivityForResult(intent0, 1047);
        }
    }

    @l
    public static final String A = "galleryName";
    private j0 u;
    @l
    private String v;
    @l
    private String w;
    @m
    private o x;
    @l
    public static final a y = null;
    @l
    public static final String z = "galleryId";

    static {
        ArticlePostListActivity.y = new a(null);
    }

    public ArticlePostListActivity() {
        this.v = "";
        this.w = "";
    }

    @Override  // com.dcinside.app.push.i
    public void F(@l String s, @m String s1) {
        com.dcinside.app.push.i.a.a(this, s, s1);
    }

    private final void R1() {
        j0 j00 = this.u;
        j0 j01 = null;
        if(j00 == null) {
            L.S("binding");
            j00 = null;
        }
        L.o(j00.f, "articlePostList");
        Adapter recyclerView$Adapter0 = j00.f.getAdapter();
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.push.adapter.a)) {
            recyclerView$Adapter0 = null;
        }
        int v = ((com.dcinside.app.push.adapter.a)recyclerView$Adapter0) == null ? 0 : ((com.dcinside.app.push.adapter.a)recyclerView$Adapter0).getItemCount();
        if(v > 0) {
            j0 j02 = this.u;
            if(j02 == null) {
                L.S("binding");
                j02 = null;
            }
            j02.c.setVisibility(8);
            j0 j03 = this.u;
            if(j03 == null) {
                L.S("binding");
                j03 = null;
            }
            j03.f.setVisibility(0);
        }
        else {
            j0 j04 = this.u;
            if(j04 == null) {
                L.S("binding");
                j04 = null;
            }
            j04.c.setVisibility(0);
            j0 j05 = this.u;
            if(j05 == null) {
                L.S("binding");
                j05 = null;
            }
            j05.f.setVisibility(8);
        }
        j0 j06 = this.u;
        if(j06 == null) {
            L.S("binding");
        }
        else {
            j01 = j06;
        }
        String s = this.w.length() == 0 ? this.getString(0x7F150752, new Object[]{v, 100}) : this.getString(0x7F1503C1, new Object[]{v});  // string:pages "%1$d / %2$d"
        j01.b.setText(s);
    }

    // 检测为 Lambda 实现
    private static final Boolean S1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void T1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void U1(ArticlePostListActivity articlePostListActivity0, Throwable throwable0) [...]

    private final void V1(String s, String s1) {
        @s0({"SMAP\nArticlePostListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticlePostListActivity.kt\ncom/dcinside/app/push/ArticlePostListActivity$deleteArticle$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,175:1\n25#2:176\n*S KotlinDebug\n*F\n+ 1 ArticlePostListActivity.kt\ncom/dcinside/app/push/ArticlePostListActivity$deleteArticle$1\n*L\n130#1:176\n*E\n"})
        static final class e extends N implements Function1 {
            final ArticlePostListActivity e;
            final String f;
            final String g;

            e(ArticlePostListActivity articlePostListActivity0, String s, String s1) {
                this.e = articlePostListActivity0;
                this.f = s;
                this.g = s1;
                super(1);
            }

            public final void a(f0 f00) {
                j0 j00 = this.e.u;
                Adapter recyclerView$Adapter0 = null;
                if(j00 == null) {
                    L.S("binding");
                    j00 = null;
                }
                L.o(j00.f, "articlePostList");
                Adapter recyclerView$Adapter1 = j00.f.getAdapter();
                if(recyclerView$Adapter1 instanceof com.dcinside.app.push.adapter.a) {
                    recyclerView$Adapter0 = recyclerView$Adapter1;
                }
                if(((com.dcinside.app.push.adapter.a)recyclerView$Adapter0) != null) {
                    ((com.dcinside.app.push.adapter.a)recyclerView$Adapter0).w(this.f);
                }
                e0.i.g(this.g, this.f);
                this.e.R1();
                this.e.setResult(-1);
                this.e.d2(false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        if(s1 == null) {
            s1 = this.v;
        }
        this.d2(true);
        this.x = uk.HG(false, s1, null, s, null, null, null).y5((Object object0) -> {
            L.p(new e(this, s, s1), "$tmp0");
            new e(this, s, s1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F15030E);  // string:failed_apply_notice "저장에 실패했습니다. 잠시 후 다시 시도해주세요."
            this.d2(false);
        });
    }

    // 检测为 Lambda 实现
    private static final void W1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void X1(ArticlePostListActivity articlePostListActivity0, Throwable throwable0) [...]

    private final void Y1(c f$c0) {
        List list0 = f$c0.a();
        if(list0 == null) {
            list0 = u.H();
        }
        e0.i.h(list0);
        j0 j00 = this.u;
        if(j00 == null) {
            L.S("binding");
            j00 = null;
        }
        com.dcinside.app.push.adapter.a a0 = new com.dcinside.app.push.adapter.a();
        j00.f.setAdapter(a0);
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(j00.f.getContext(), 1, false);
        j00.f.setLayoutManager(linearLayoutManager0);
        a0.A(list0);
        this.R1();
        this.d2(false);
    }

    // 检测为 Lambda 实现
    private static final void Z1(ArticlePostListActivity articlePostListActivity0, MenuItem menuItem0, View view0) [...]

    private final void a2() {
        static final class f extends N implements Function1 {
            final ArticlePostListActivity e;

            f(ArticlePostListActivity articlePostListActivity0) {
                this.e = articlePostListActivity0;
                super(1);
            }

            public final void a(c f$c0) {
                L.m(f$c0);
                this.e.Y1(f$c0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((c)object0));
                return S0.a;
            }
        }

        this.d2(true);
        this.x = uk.xk(this.v, b.c).y5((Object object0) -> {
            L.p(new f(this), "$tmp0");
            new f(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F150326);  // string:failed_notice_data "정보를 가져올 수 없습니다. 잠시 후 다시 시도해주세요."
            this.finish();
        });
    }

    // 检测为 Lambda 实现
    private static final void b2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void c2(ArticlePostListActivity articlePostListActivity0, Throwable throwable0) [...]

    private final void d2(boolean z) {
        j0 j00 = this.u;
        if(j00 == null) {
            L.S("binding");
            j00 = null;
        }
        j00.g.setVisibility((z ? 0 : 8));
    }

    @Override  // com.dcinside.app.push.i
    public void h(@l String s, @m String s1) {
        static final class com.dcinside.app.push.ArticlePostListActivity.b extends N implements Function1 {
            public static final com.dcinside.app.push.ArticlePostListActivity.b e;

            static {
                com.dcinside.app.push.ArticlePostListActivity.b.e = new com.dcinside.app.push.ArticlePostListActivity.b();
            }

            com.dcinside.app.push.ArticlePostListActivity.b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F150279);  // string:delete_article_post "등록한 관심글을 삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.push.ArticlePostListActivity.c extends N implements Function1 {
            public static final com.dcinside.app.push.ArticlePostListActivity.c e;

            static {
                com.dcinside.app.push.ArticlePostListActivity.c.e = new com.dcinside.app.push.ArticlePostListActivity.c();
            }

            com.dcinside.app.push.ArticlePostListActivity.c() {
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


        static final class com.dcinside.app.push.ArticlePostListActivity.d extends N implements Function1 {
            final ArticlePostListActivity e;
            final String f;
            final String g;

            com.dcinside.app.push.ArticlePostListActivity.d(ArticlePostListActivity articlePostListActivity0, String s, String s1) {
                this.e = articlePostListActivity0;
                this.f = s;
                this.g = s1;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.V1(this.f, this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        L.p(s, "dataValue");
        com.dcinside.app.perform.e.e.a(this).n(com.dcinside.app.push.ArticlePostListActivity.b.e).z(0x104000A).x(0x1040000).b().Z1((Object object0) -> {
            L.p(com.dcinside.app.push.ArticlePostListActivity.c.e, "$tmp0");
            return (Boolean)com.dcinside.app.push.ArticlePostListActivity.c.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.push.ArticlePostListActivity.d(this, s, s1), "$tmp0");
            new com.dcinside.app.push.ArticlePostListActivity.d(this, s, s1).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        j0 j00 = j0.c(this.getLayoutInflater());
        L.o(j00, "inflate(...)");
        this.u = j00;
        j0 j01 = null;
        if(j00 == null) {
            L.S("binding");
            j00 = null;
        }
        this.setContentView(j00.b());
        j0 j02 = this.u;
        if(j02 == null) {
            L.S("binding");
        }
        else {
            j01 = j02;
        }
        this.S0(j01.i);
        kr.bhbfhfb.designcompat.a.d(this);
        String s = this.getIntent().getStringExtra("galleryId");
        String s1 = "";
        if(s == null) {
            s = "";
        }
        this.v = s;
        String s2 = this.getIntent().getStringExtra("galleryName");
        if(s2 != null) {
            s1 = s2;
        }
        this.w = s1;
        this.setTitle((s1.length() == 0 ? "관심글 알림 설정" : this.getString(0x7F150106, new Object[]{this.w})));  // string:article_post_list_title "관심글 - %s"
        this.a2();
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        if(this.w.length() > 0) {
            return super.onCreateOptionsMenu(menu0);
        }
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
        kl.b(new o[]{this.x});
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
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

