package com.dcinside.app.post;

import A3.p;
import Y.q;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.y;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.hjq.toast.s;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

public final class FullProfileActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "gallId");
            Intent intent0 = new Intent(context0, FullProfileActivity.class).putExtra("FullProfileActivity.EXTRA_GALL_ID", s);
            L.o(intent0, "putExtra(...)");
            context0.startActivity(intent0);
        }
    }

    private q u;
    @m
    private o v;
    @l
    public static final a w = null;
    @l
    private static final String x = "FullProfileActivity.EXTRA_GALL_ID";

    static {
        FullProfileActivity.w = new a(null);
    }

    private final void I1() {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15077E);  // string:person_profile_go_edit_profile "편집은 모바일 웹에서 가능합니다. 이동하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class c extends N implements Function1 {
            final FullProfileActivity e;
            final String f;

            c(FullProfileActivity fullProfileActivity0, String s) {
                this.e = fullProfileActivity0;
                this.f = s;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    com.dcinside.app.main.a.i(this.e, this.f);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        String s = this.getIntent().getStringExtra("FullProfileActivity.EXTRA_GALL_ID");
        if(s == null) {
            return;
        }
        String s1 = this.getString(0x7F150B3A, new Object[]{v.l2(s, "pr$", "", false, 4, null)});  // string:url_edit_profile "https://m.dcinside.com/pr_profile/%1$s/edit"
        L.o(s1, "getString(...)");
        dl dl0 = dl.a;
        if(dl0.T()) {
            com.dcinside.app.main.a.i(this, s1);
            return;
        }
        e.e.a(this).n(b.e).z(0x7F1501D4).x(0x7F1501D3).b().y5((Object object0) -> {
            L.p(new c(this, s1), "$tmp0");
            new c(this, s1).invoke(object0);
        }, (Throwable throwable0) -> s.C(throwable0.getMessage()));
        dl0.L3(true);
    }

    // 检测为 Lambda 实现
    private static final void J1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void K1(Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void L1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void M1(Throwable throwable0) [...]

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        static final class com.dcinside.app.post.FullProfileActivity.d extends N implements Function1 {
            final k e;

            com.dcinside.app.post.FullProfileActivity.d(k k0) {
                this.e = k0;
                super(1);
            }

            public final void a(y y0) {
                k k0 = this.e;
                List list0 = y0.m();
                if(list0 == null) {
                    list0 = u.H();
                }
                k0.v(list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((y)object0));
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        q q0 = q.c(this.getLayoutInflater());
        L.o(q0, "inflate(...)");
        this.u = q0;
        q q1 = null;
        if(q0 == null) {
            L.S("binding");
            q0 = null;
        }
        this.setContentView(q0.b());
        q q2 = this.u;
        if(q2 == null) {
            L.S("binding");
            q2 = null;
        }
        this.S0(q2.b);
        kr.bhbfhfb.designcompat.a.d(this);
        String s = this.getIntent().getStringExtra("FullProfileActivity.EXTRA_GALL_ID");
        k k0 = new k();
        q q3 = this.u;
        if(q3 == null) {
            L.S("binding");
            q3 = null;
        }
        q3.c.setAdapter(k0);
        q q4 = this.u;
        if(q4 == null) {
            L.S("binding");
        }
        else {
            q1 = q4;
        }
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this, 1, false);
        q1.c.setLayoutManager(linearLayoutManager0);
        this.v = uk.Ak(s).y5((Object object0) -> {
            L.p(new com.dcinside.app.post.FullProfileActivity.d(k0), "$tmp0");
            new com.dcinside.app.post.FullProfileActivity.d(k0).invoke(object0);
        }, (Throwable throwable0) -> s.C(throwable0.getMessage()));
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        @f(c = "com.dcinside.app.post.FullProfileActivity$onCreateOptionsMenu$1", f = "FullProfileActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.FullProfileActivity.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final FullProfileActivity l;
            final MenuItem m;

            com.dcinside.app.post.FullProfileActivity.e(FullProfileActivity fullProfileActivity0, MenuItem menuItem0, kotlin.coroutines.d d0) {
                this.l = fullProfileActivity0;
                this.m = menuItem0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.FullProfileActivity.e(this.l, this.m, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$item");
                this.l.onOptionsItemSelected(this.m);
                return S0.a;
            }
        }

        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100011, menu0);  // mipmap:ic_launcher20
        MenuItem menuItem0 = menu0.findItem(0x7F0B0447);  // id:edit_profile
        if(menuItem0 != null) {
            View view0 = menuItem0.getActionView();
            Button button0 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B082E));  // id:menu_save
            if(button0 != null) {
                r.M(button0, null, new com.dcinside.app.post.FullProfileActivity.e(this, menuItem0, null), 1, null);
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.getOnBackPressedDispatcher().p();
                return true;
            }
            case 0x7F0B0447: {  // id:edit_profile
                this.I1();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }
}

