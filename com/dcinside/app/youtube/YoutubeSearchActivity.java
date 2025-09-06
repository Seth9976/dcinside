package com.dcinside.app.youtube;

import A3.p;
import Y.O0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.post.q.a;
import com.dcinside.app.post.q;
import com.dcinside.app.realm.B0;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.W;
import io.realm.g1;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nYoutubeSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubeSearchActivity.kt\ncom/dcinside/app/youtube/YoutubeSearchActivity\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n*L\n1#1,343:1\n120#2,3:344\n124#2:350\n1#3:347\n37#4:348\n37#4:349\n*S KotlinDebug\n*F\n+ 1 YoutubeSearchActivity.kt\ncom/dcinside/app/youtube/YoutubeSearchActivity\n*L\n221#1:344,3\n221#1:350\n221#1:347\n224#1:348\n230#1:349\n*E\n"})
public final class YoutubeSearchActivity extends g implements a {
    public static final class com.dcinside.app.youtube.YoutubeSearchActivity.a {
        private com.dcinside.app.youtube.YoutubeSearchActivity.a() {
        }

        public com.dcinside.app.youtube.YoutubeSearchActivity.a(w w0) {
        }

        @n
        public final void a(@l Activity activity0, @m String s, int v) {
            L.p(activity0, "activity");
            Intent intent0 = new Intent(activity0, YoutubeSearchActivity.class);
            intent0.putExtra("def", s);
            activity0.startActivityForResult(intent0, v);
        }
    }

    @m
    private o A;
    @m
    private String B;
    @m
    private String C;
    @m
    private rx.o D;
    @m
    private rx.o E;
    @l
    public static final com.dcinside.app.youtube.YoutubeSearchActivity.a F = null;
    @l
    private static final String G = "def";
    @l
    public static final String H = "yid";
    @l
    private static final String I = "lastSearchText";
    @l
    private static final String J = "nextPageToken";
    private O0 w;
    @m
    private String x;
    @l
    private final com.dcinside.app.youtube.n y;
    @l
    private final q z;

    static {
        YoutubeSearchActivity.F = new com.dcinside.app.youtube.YoutubeSearchActivity.a(null);
    }

    public YoutubeSearchActivity() {
        this.y = new com.dcinside.app.youtube.n(this);
        this.z = new q(this);
    }

    @Override  // com.dcinside.app.post.q$a
    public void E() {
        this.l2(this.C);
    }

    // 去混淆评级： 低(40)
    @Override  // com.dcinside.app.post.q$a
    public boolean W() {
        return !m0.a.a.j(this.B) || !m0.a.a.k(this.C) || !kl.a(new rx.o[]{this.D}) || (this.A == null || this.A.isDone()) ? false : (this.A == null ? 0 : this.A.getItemCount()) <= this.c2() + 1;
    }

    private final int c2() {
        O0 o00 = this.w;
        LinearLayoutManager linearLayoutManager0 = null;
        if(o00 == null) {
            L.S("binding");
            o00 = null;
        }
        LayoutManager recyclerView$LayoutManager0 = o00.d.getLayoutManager();
        if(recyclerView$LayoutManager0 instanceof LinearLayoutManager) {
            linearLayoutManager0 = (LinearLayoutManager)recyclerView$LayoutManager0;
        }
        return linearLayoutManager0 == null ? 0 : linearLayoutManager0.i();
    }

    private final void d2() {
        @f(c = "com.dcinside.app.youtube.YoutubeSearchActivity$initCallbacks$1", f = "YoutubeSearchActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final YoutubeSearchActivity l;

            b(YoutubeSearchActivity youtubeSearchActivity0, d d0) {
                this.l = youtubeSearchActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.j2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.youtube.YoutubeSearchActivity$initCallbacks$3", f = "YoutubeSearchActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final YoutubeSearchActivity m;

            c(YoutubeSearchActivity youtubeSearchActivity0, d d0) {
                this.m = youtubeSearchActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                c youtubeSearchActivity$c0 = new c(this.m, d0);
                youtubeSearchActivity$c0.l = view0;
                return youtubeSearchActivity$c0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.h2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.youtube.YoutubeSearchActivity$initCallbacks$4", f = "YoutubeSearchActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.youtube.YoutubeSearchActivity.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final YoutubeSearchActivity m;

            com.dcinside.app.youtube.YoutubeSearchActivity.d(YoutubeSearchActivity youtubeSearchActivity0, d d0) {
                this.m = youtubeSearchActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.youtube.YoutubeSearchActivity.d youtubeSearchActivity$d0 = new com.dcinside.app.youtube.YoutubeSearchActivity.d(this.m, d0);
                youtubeSearchActivity$d0.l = view0;
                return youtubeSearchActivity$d0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.h2(((View)this.l));
                return S0.a;
            }
        }

        O0 o00 = this.w;
        if(o00 == null) {
            L.S("binding");
            o00 = null;
        }
        L.o(o00.b, "youtubeSearchConfirm");
        b youtubeSearchActivity$b0 = new b(this, null);
        r.M(o00.b, null, youtubeSearchActivity$b0, 1, null);
        O0 o01 = this.w;
        if(o01 == null) {
            L.S("binding");
            o01 = null;
        }
        com.dcinside.app.youtube.l l0 = (TextView textView0, int v, KeyEvent keyEvent0) -> {
            L.p(this, "this$0");
            return this.i2(v);
        };
        o01.g.setOnEditorActionListener(l0);
        O0 o02 = this.w;
        if(o02 == null) {
            L.S("binding");
            o02 = null;
        }
        L.o(o02.e, "youtubeSearchTerm0");
        c youtubeSearchActivity$c0 = new c(this, null);
        r.M(o02.e, null, youtubeSearchActivity$c0, 1, null);
        O0 o03 = this.w;
        if(o03 == null) {
            L.S("binding");
            o03 = null;
        }
        L.o(o03.f, "youtubeSearchTerm1");
        com.dcinside.app.youtube.YoutubeSearchActivity.d youtubeSearchActivity$d0 = new com.dcinside.app.youtube.YoutubeSearchActivity.d(this, null);
        r.M(o03.f, null, youtubeSearchActivity$d0, 1, null);
    }

    // 检测为 Lambda 实现
    private static final boolean e2(YoutubeSearchActivity youtubeSearchActivity0, TextView textView0, int v, KeyEvent keyEvent0) [...]

    private final void f2(Bundle bundle0) {
        O0 o00 = null;
        if(bundle0 == null) {
            String s = this.getIntent().getStringExtra("def");
            O0 o01 = this.w;
            if(o01 == null) {
                L.S("binding");
                o01 = null;
            }
            o01.g.setText(s);
        }
        else {
            this.B = bundle0.getString("lastSearchText");
            this.C = bundle0.getString("nextPageToken");
            O0 o02 = this.w;
            if(o02 == null) {
                L.S("binding");
                o02 = null;
            }
            o02.g.setText(this.B);
        }
        o o0 = new o(bundle0);
        o0.setHasStableIds(true);
        o0.registerAdapterDataObserver(this.y);
        this.A = o0;
        O0 o03 = this.w;
        if(o03 == null) {
            L.S("binding");
            o03 = null;
        }
        o03.d.setHasFixedSize(true);
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        o03.d.setLayoutManager(nonPredictiveLayoutManager0);
        o03.d.setAdapter(this.A);
        o03.d.addOnScrollListener(this.z);
        com.dcinside.app.util.ql.b.l(o03.d, 0);
        O0 o04 = this.w;
        if(o04 == null) {
            L.S("binding");
            o04 = null;
        }
        Spannable spannable0 = com.dcinside.app.span.g.z("YouTube Terms of Service");
        o04.e.setText(spannable0);
        O0 o05 = this.w;
        if(o05 == null) {
            L.S("binding");
        }
        else {
            o00 = o05;
        }
        Spannable spannable1 = com.dcinside.app.span.g.z("Google Privacy Policy");
        o00.f.setText(spannable1);
    }

    @Override  // android.app.Activity
    public void finish() {
        Nk.a.a(this);
        super.finish();
    }

    public final void g2() {
        int v;
        O0 o00 = this.w;
        if(o00 == null) {
            L.S("binding");
            o00 = null;
        }
        TextView textView0 = o00.c;
        if(this.A == null || this.A.getItemCount() != 0) {
            v = 8;
        }
        else {
            textView0.setText((this.x == null ? "유튜브 동영상을 검색해 등록하세요" : this.x));
            v = 0;
        }
        textView0.setVisibility(v);
    }

    private final void h2(View view0) {
        Object object0 = view0.getTag();
        String s = object0 instanceof String ? ((String)object0) : null;
        if(s == null) {
            return;
        }
        com.dcinside.app.main.a.k(this, s, true);
    }

    private final boolean i2(int v) {
        if(v == 3) {
            this.j2();
            return true;
        }
        return false;
    }

    private final void j2() {
        if(!kl.a(new rx.o[]{this.D})) {
            return;
        }
        O0 o00 = this.w;
        if(o00 == null) {
            L.S("binding");
            o00 = null;
        }
        String s = String.valueOf(o00.g.getText());
        if(m0.a.a.h(s)) {
            return;
        }
        this.B = s;
        this.C = null;
        o o0 = this.A;
        L.m(o0);
        o0.C();
        this.l2(null);
    }

    @n
    public static final void k2(@l Activity activity0, @m String s, int v) {
        YoutubeSearchActivity.F.a(activity0, s, v);
    }

    private final void l2(String s) {
        static final class e extends N implements Function1 {
            final YoutubeSearchActivity e;
            final String f;
            final String g;

            e(YoutubeSearchActivity youtubeSearchActivity0, String s, String s1) {
                this.e = youtubeSearchActivity0;
                this.f = s;
                this.g = s1;
                super(1);
            }

            public final rx.g a(Throwable throwable0) {
                return this.e.u2(this.f, this.g);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }


        static final class com.dcinside.app.youtube.YoutubeSearchActivity.f extends N implements Function1 {
            final YoutubeSearchActivity e;

            com.dcinside.app.youtube.YoutubeSearchActivity.f(YoutubeSearchActivity youtubeSearchActivity0) {
                this.e = youtubeSearchActivity0;
                super(1);
            }

            public final void a(YoutubeSearchResult youtubeSearchResult0) {
                this.e.C = youtubeSearchResult0.f();
                o o0 = this.e.A;
                if(o0 != null) {
                    List list0 = youtubeSearchResult0.e();
                    L.o(list0, "getItems(...)");
                    o0.A(list0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((YoutubeSearchResult)object0));
                return S0.a;
            }
        }


        static final class com.dcinside.app.youtube.YoutubeSearchActivity.g extends N implements Function1 {
            final Throwable e;

            com.dcinside.app.youtube.YoutubeSearchActivity.g(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e.getMessage());
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
            final YoutubeSearchActivity e;
            final String f;

            i(YoutubeSearchActivity youtubeSearchActivity0, String s) {
                this.e = youtubeSearchActivity0;
                this.f = s;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.l2(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        String s1 = this.B;
        if(s1 == null) {
            return;
        }
        this.x = null;
        this.D = this.w2(s1, s).Z3((Object object0) -> {
            L.p(new e(this, s1, s), "$tmp0");
            return (rx.g)new e(this, s1, s).invoke(object0);
        }).R1(() -> {
            L.p(this, "this$0");
            o o0 = this.A;
            if(o0 != null) {
                o0.G(true);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            o o0 = this.A;
            if(o0 != null) {
                o0.G(false);
            }
        }).z5((Object object0) -> {
            L.p(new com.dcinside.app.youtube.YoutubeSearchActivity.f(this), "$tmp0");
            new com.dcinside.app.youtube.YoutubeSearchActivity.f(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.y(throwable0);
            if(this.C == null) {
                this.x = throwable0.getMessage();
                o o0 = this.A;
                if(o0 != null) {
                    o0.A(u.H());
                }
            }
            else {
                o o1 = this.A;
                if(o1 != null) {
                    o1.A(u.H());
                }
                this.E = com.dcinside.app.perform.e.e.a(this).n(new com.dcinside.app.youtube.YoutubeSearchActivity.g(throwable0)).z(0x7F1508D7).x(0x1040000).b().Z1((Object object0) -> {
                    L.p(h.e, "$tmp0");
                    return (Boolean)h.e.invoke(object0);
                }).x5((Object object0) -> {
                    L.p(new i(youtubeSearchActivity0, s), "$tmp0");
                    new i(youtubeSearchActivity0, s).invoke(object0);
                });
            }
        }, () -> {
            L.p(this, "this$0");
            Nk.a.a(this);
        });
    }

    // 检测为 Lambda 实现
    private static final void m2(YoutubeSearchActivity youtubeSearchActivity0) [...]

    // 检测为 Lambda 实现
    private static final void n2(YoutubeSearchActivity youtubeSearchActivity0) [...]

    // 检测为 Lambda 实现
    private static final void o2(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        O0 o00 = O0.c(this.getLayoutInflater());
        L.o(o00, "inflate(...)");
        this.w = o00;
        O0 o01 = null;
        if(o00 == null) {
            L.S("binding");
            o00 = null;
        }
        this.setContentView(o00.b());
        O0 o02 = this.w;
        if(o02 == null) {
            L.S("binding");
        }
        else {
            o01 = o02;
        }
        this.S0(o01.h);
        kr.bhbfhfb.designcompat.a.d(this);
        this.f2(bundle0);
        this.d2();
        this.g2();
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100019, menu0);  // mipmap:ic_launcher28
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.A;
        L.m(o0);
        o0.unregisterAdapterDataObserver(this.y);
        kl.b(new rx.o[]{this.D, this.E});
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
                return true;
            }
            case 0x7F0B0075: {  // id:action_write
                o o0 = this.A;
                L.m(o0);
                int v = o0.E();
                if(v >= 0) {
                    o o1 = this.A;
                    L.m(o1);
                    Object object0 = o1.D().get(v);
                    L.o(object0, "get(...)");
                    String s = ((Item)object0).a().a();
                    Intent intent0 = new Intent();
                    intent0.putExtra("yid", s);
                    this.setResult(-1, intent0);
                    this.finish();
                }
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // com.dcinside.app.base.d
    public boolean onPrepareOptionsMenu(@m Menu menu0) {
        try {
            L.m(menu0);
            MenuItem menuItem0 = menu0.findItem(0x7F0B0075);  // id:action_write
            o o0 = this.A;
            L.m(o0);
            menuItem0.setVisible(o0.E() >= 0);
            return super.onPrepareOptionsMenu(menu0);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return super.onPrepareOptionsMenu(menu0);
        }
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putString("lastSearchText", this.B);
        bundle0.putString("nextPageToken", this.C);
        o o0 = this.A;
        L.m(o0);
        o0.H(bundle0);
    }

    // 检测为 Lambda 实现
    private static final void p2(YoutubeSearchActivity youtubeSearchActivity0, String s, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final Boolean q2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void r2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s2(YoutubeSearchActivity youtubeSearchActivity0) [...]

    // 检测为 Lambda 实现
    private static final rx.g t2(Function1 function10, Object object0) [...]

    private final rx.g u2(String s, String s1) {
        @s0({"SMAP\nYoutubeSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YoutubeSearchActivity.kt\ncom/dcinside/app/youtube/YoutubeSearchActivity$searchFromApi$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,343:1\n112#2,3:344\n129#2,15:348\n116#2:363\n129#2,15:364\n1#3:347\n*S KotlinDebug\n*F\n+ 1 YoutubeSearchActivity.kt\ncom/dcinside/app/youtube/YoutubeSearchActivity$searchFromApi$1\n*L\n259#1:344,3\n259#1:348,15\n259#1:363\n259#1:364,15\n259#1:347\n*E\n"})
        static final class j extends N implements Function1 {
            final String e;
            final String f;

            j(String s, String s1) {
                this.e = s;
                this.f = s1;
                super(1);
            }

            public final void a(YoutubeSearchResult youtubeSearchResult0) {
                String s = uk.a.D(youtubeSearchResult0);
                L.o(s, "toJson(...)");
                byte[] arr_b = com.dcinside.app.internal.l.i(s);
                B0 b00 = new B0(((long)arr_b.hashCode()), this.e, this.f, arr_b, System.currentTimeMillis());
                F0 f00 = F0.g4();
                L.m(f00);
                if(f00.E0()) {
                    f00.t2(b00, new W[0]);
                }
                else {
                    f00.beginTransaction();
                    goto label_10;
                }
                goto label_22;
                try {
                label_10:
                    f00.t2(b00, new W[0]);
                    f00.p();
                    goto label_22;
                }
                catch(Throwable throwable1) {
                    try {
                        if(f00.E0()) {
                            f00.e();
                        }
                        throw throwable1;
                    }
                    catch(Throwable throwable0) {
                    }
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable2) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable2;
                }
            label_22:
                kotlin.io.c.a(f00, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((YoutubeSearchResult)object0));
                return S0.a;
            }
        }

        rx.g g0 = uk.ZG(s, s1).P1((Object object0) -> {
            L.p(new j(s, s1), "$tmp0");
            new j(s, s1).invoke(object0);
        });
        L.o(g0, "doOnNext(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void v2(Function1 function10, Object object0) [...]

    private final rx.g w2(String s, String s1) {
        rx.g g0 = rx.g.M6((rx.n n0) -> {
            String s2;
            Class class0 = B0.class;
            L.p(s, "$keyword");
            n0.onStart();
            F0 f00 = F0.g4();
            try {
                L.m(f00);
                long v = System.currentTimeMillis();
                long v1 = s.v(jl.a.T0(), 0L);
                RealmQuery realmQuery0 = f00.C4(class0);
                L.o(realmQuery0, "this.where(T::class.java)");
                g1 g10 = realmQuery0.m1("time", v - v1).d2().B0("time", v).p0();
                if(g10.size() > 0) {
                    f00.Y3((F0 f00) -> g10.L0());
                }
                RealmQuery realmQuery1 = f00.C4(class0);
                L.o(realmQuery1, "this.where(T::class.java)");
                RealmQuery realmQuery2 = realmQuery1.i0("keyword", s);
                B0 b00 = (B0)(s1 == null ? realmQuery2.g1("token") : realmQuery2.i0("token", s1)).r0();
                if(b00 == null) {
                    s2 = null;
                }
                else {
                    byte[] arr_b = b00.s3();
                    if(arr_b == null) {
                        s2 = null;
                    }
                    else {
                        L.m(arr_b);
                        s2 = com.dcinside.app.internal.l.e(arr_b);
                    }
                }
                if(s2 == null) {
                    n0.onError(new NullPointerException("Data not found."));
                }
                else {
                    n0.onNext(uk.a.r(s2, YoutubeSearchResult.class));
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                kotlin.io.c.a(f00, throwable0);
                throw throwable1;
            }
        label_35:
            kotlin.io.c.a(f00, null);
            n0.d();
        });
        L.o(g0, "unsafeCreate(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void x2(String s, String s1, rx.n n0) [...]

    // 检测为 Lambda 实现
    private static final void y2(g1 g10, F0 f00) [...]
}

