package com.dcinside.app.gallery.history;

import A3.p;
import Y.t;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.post.q.a;
import com.dcinside.app.post.q;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

public final class ManageHistoryActivity extends d implements a, com.dcinside.app.view.ClearableEditText.a {
    public static final class com.dcinside.app.gallery.history.ManageHistoryActivity.a {
        private com.dcinside.app.gallery.history.ManageHistoryActivity.a() {
        }

        public com.dcinside.app.gallery.history.ManageHistoryActivity.a(w w0) {
        }

        public final void a(@l Context context0, @l String s) {
            L.p(context0, "context");
            L.p(s, "galleryId");
            Intent intent0 = new Intent(context0, ManageHistoryActivity.class);
            intent0.putExtra("com.dcinside.app.gallery.history.ManageHistoryActivityGalleryId", s);
            context0.startActivity(intent0);
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[com.dcinside.app.gallery.history.a.values().length];
            try {
                arr_v[com.dcinside.app.gallery.history.a.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[com.dcinside.app.gallery.history.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @m
    private String A;
    private int B;
    @l
    private final q C;
    @l
    private final i D;
    @l
    public static final com.dcinside.app.gallery.history.ManageHistoryActivity.a E = null;
    @l
    public static final String F = "com.dcinside.app.gallery.history.ManageHistoryActivityGalleryId";
    private t u;
    @m
    private o v;
    @m
    private com.dcinside.app.gallery.history.a w;
    private int x;
    @m
    private String y;
    private boolean z;

    static {
        ManageHistoryActivity.E = new com.dcinside.app.gallery.history.ManageHistoryActivity.a(null);
    }

    public ManageHistoryActivity() {
        this.x = 1;
        this.C = new q(this);
        this.D = new i();
    }

    @Override  // com.dcinside.app.post.q$a
    public void E() {
        ++this.x;
        this.a2();
    }

    private final void U1() {
        @f(c = "com.dcinside.app.gallery.history.ManageHistoryActivity$initListeners$1", f = "ManageHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ManageHistoryActivity l;

            c(ManageHistoryActivity manageHistoryActivity0, kotlin.coroutines.d d0) {
                this.l = manageHistoryActivity0;
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
                f0.n(object0);
                this.l.Z1(com.dcinside.app.gallery.history.a.b);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.history.ManageHistoryActivity$initListeners$2", f = "ManageHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.history.ManageHistoryActivity.d extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ManageHistoryActivity l;

            com.dcinside.app.gallery.history.ManageHistoryActivity.d(ManageHistoryActivity manageHistoryActivity0, kotlin.coroutines.d d0) {
                this.l = manageHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.gallery.history.ManageHistoryActivity.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.Z1(com.dcinside.app.gallery.history.a.c);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.history.ManageHistoryActivity$initListeners$3", f = "ManageHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ManageHistoryActivity l;

            e(ManageHistoryActivity manageHistoryActivity0, kotlin.coroutines.d d0) {
                this.l = manageHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.Z1(com.dcinside.app.gallery.history.a.d);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.history.ManageHistoryActivity$initListeners$5", f = "ManageHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.history.ManageHistoryActivity.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ManageHistoryActivity l;

            com.dcinside.app.gallery.history.ManageHistoryActivity.f(ManageHistoryActivity manageHistoryActivity0, kotlin.coroutines.d d0) {
                this.l = manageHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.gallery.history.ManageHistoryActivity.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.X1(3);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.history.ManageHistoryActivity$initListeners$6", f = "ManageHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final ManageHistoryActivity l;

            g(ManageHistoryActivity manageHistoryActivity0, kotlin.coroutines.d d0) {
                this.l = manageHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.z = true;
                this.l.Y1();
                this.l.D.x();
                this.l.a2();
                return S0.a;
            }
        }

        t t0 = this.u;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        L.o(t0.d, "galleryManageHistoryBlock");
        c manageHistoryActivity$c0 = new c(this, null);
        r.M(t0.d, null, manageHistoryActivity$c0, 1, null);
        t t1 = this.u;
        if(t1 == null) {
            L.S("binding");
            t1 = null;
        }
        L.o(t1.f, "galleryManageHistoryDelete");
        com.dcinside.app.gallery.history.ManageHistoryActivity.d manageHistoryActivity$d0 = new com.dcinside.app.gallery.history.ManageHistoryActivity.d(this, null);
        r.M(t1.f, null, manageHistoryActivity$d0, 1, null);
        t t2 = this.u;
        if(t2 == null) {
            L.S("binding");
            t2 = null;
        }
        L.o(t2.q, "galleryManageHistorySetting");
        e manageHistoryActivity$e0 = new e(this, null);
        r.M(t2.q, null, manageHistoryActivity$e0, 1, null);
        t t3 = this.u;
        if(t3 == null) {
            L.S("binding");
            t3 = null;
        }
        com.dcinside.app.gallery.history.f f0 = (TextView textView0, int v, KeyEvent keyEvent0) -> {
            L.p(this, "this$0");
            return this.X1(v);
        };
        t3.o.setOnEditorActionListener(f0);
        t3.o.setOnClearListener(this);
        t t4 = this.u;
        if(t4 == null) {
            L.S("binding");
            t4 = null;
        }
        L.o(t4.n, "galleryManageHistorySearchConfirm");
        com.dcinside.app.gallery.history.ManageHistoryActivity.f manageHistoryActivity$f0 = new com.dcinside.app.gallery.history.ManageHistoryActivity.f(this, null);
        r.M(t4.n, null, manageHistoryActivity$f0, 1, null);
        t t5 = this.u;
        if(t5 == null) {
            L.S("binding");
            t5 = null;
        }
        L.o(t5.b, "galleryManageFilterMyContents");
        g manageHistoryActivity$g0 = new g(this, null);
        r.M(t5.b, null, manageHistoryActivity$g0, 1, null);
    }

    // 检测为 Lambda 实现
    private static final boolean V1(ManageHistoryActivity manageHistoryActivity0, TextView textView0, int v, KeyEvent keyEvent0) [...]

    @Override  // com.dcinside.app.post.q$a
    public boolean W() {
        if(this.B <= this.x) {
            return false;
        }
        if(kl.a(new o[]{this.v})) {
            t t0 = this.u;
            LinearLayoutManager linearLayoutManager0 = null;
            if(t0 == null) {
                L.S("binding");
                t0 = null;
            }
            LayoutManager recyclerView$LayoutManager0 = t0.m.getLayoutManager();
            if(recyclerView$LayoutManager0 instanceof LinearLayoutManager) {
                linearLayoutManager0 = (LinearLayoutManager)recyclerView$LayoutManager0;
            }
            return (linearLayoutManager0 == null ? -1 : linearLayoutManager0.i()) < this.D.getItemCount() - 6;
        }
        return false;
    }

    private final void W1(com.dcinside.app.gallery.history.c c0) {
        boolean z = c0.a();
        boolean z1 = c0.e();
        boolean z2 = c0.j();
        t t0 = this.u;
        t t1 = null;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        t0.d.setVisibility((z ? 0 : 8));
        t t2 = this.u;
        if(t2 == null) {
            L.S("binding");
            t2 = null;
        }
        t2.f.setVisibility((z1 ? 0 : 8));
        t t3 = this.u;
        if(t3 == null) {
            L.S("binding");
            t3 = null;
        }
        t3.q.setVisibility((z2 ? 0 : 8));
        t t4 = this.u;
        if(t4 == null) {
            L.S("binding");
            t4 = null;
        }
        t4.e.setVisibility((!z || !z1 && !z2 ? 8 : 0));
        t t5 = this.u;
        if(t5 == null) {
            L.S("binding");
            t5 = null;
        }
        t5.g.setVisibility((!z1 || !z2 ? 8 : 0));
        this.d2(c0.c());
        this.B = c0.g();
        this.D.v(c0.f(), c0.i(), (this.w == null ? com.dcinside.app.gallery.history.a.b : this.w));
        t t6 = this.u;
        if(t6 == null) {
            L.S("binding");
            t6 = null;
        }
        String s = this.getString(0x7F1503C7, new Object[]{c0.i()});  // string:gallery_manage_history_content "최근 %d일 내역만 공개됩니다."
        t6.j.setText(s);
        if(this.D.y()) {
            t t7 = this.u;
            if(t7 == null) {
                L.S("binding");
                t7 = null;
            }
            t7.m.setVisibility(4);
            t t8 = this.u;
            if(t8 == null) {
                L.S("binding");
            }
            else {
                t1 = t8;
            }
            t1.i.setVisibility(0);
            return;
        }
        t t9 = this.u;
        if(t9 == null) {
            L.S("binding");
            t9 = null;
        }
        t9.m.setVisibility(0);
        t t10 = this.u;
        if(t10 == null) {
            L.S("binding");
        }
        else {
            t1 = t10;
        }
        t1.i.setVisibility(8);
    }

    private final boolean X1(int v) {
        if(v == 3) {
            Nk.a.a(this);
            this.z = false;
            t t0 = this.u;
            String s = null;
            if(t0 == null) {
                L.S("binding");
                t0 = null;
            }
            Editable editable0 = t0.o.getText();
            if(editable0 != null) {
                s = editable0.toString();
            }
            this.A = s;
            this.x = 1;
            this.B = 0;
            this.D.x();
            this.a2();
            return true;
        }
        return false;
    }

    private final void Y1() {
        t t0 = this.u;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        t0.d.setSelected(this.w == com.dcinside.app.gallery.history.a.b);
        t t1 = this.u;
        if(t1 == null) {
            L.S("binding");
            t1 = null;
        }
        t1.f.setSelected(this.w == com.dcinside.app.gallery.history.a.c);
        t t2 = this.u;
        if(t2 == null) {
            L.S("binding");
            t2 = null;
        }
        t2.q.setSelected(this.w == com.dcinside.app.gallery.history.a.d);
        switch((this.w == null ? -1 : b.a[this.w.ordinal()])) {
            case 1: {
                t t5 = this.u;
                if(t5 == null) {
                    L.S("binding");
                    t5 = null;
                }
                t5.p.setVisibility(8);
                t t6 = this.u;
                if(t6 == null) {
                    L.S("binding");
                    t6 = null;
                }
                t6.c.setVisibility(0);
                t t7 = this.u;
                if(t7 == null) {
                    L.S("binding");
                    t7 = null;
                }
                t7.b.setText("내 차단 내역");
                break;
            }
            case 2: {
                t t8 = this.u;
                if(t8 == null) {
                    L.S("binding");
                    t8 = null;
                }
                t8.p.setVisibility(0);
                t t9 = this.u;
                if(t9 == null) {
                    L.S("binding");
                    t9 = null;
                }
                t9.c.setVisibility(0);
                t t10 = this.u;
                if(t10 == null) {
                    L.S("binding");
                    t10 = null;
                }
                t10.b.setText("내 삭제 내역");
                break;
            }
            default: {
                t t3 = this.u;
                if(t3 == null) {
                    L.S("binding");
                    t3 = null;
                }
                t3.p.setVisibility(8);
                t t4 = this.u;
                if(t4 == null) {
                    L.S("binding");
                    t4 = null;
                }
                t4.c.setVisibility(8);
            }
        }
        this.x = 1;
        this.A = null;
        t t11 = this.u;
        if(t11 == null) {
            L.S("binding");
            t11 = null;
        }
        t11.o.setText(null);
        this.B = 0;
    }

    private final void Z1(com.dcinside.app.gallery.history.a a0) {
        this.d2(a0);
        t t0 = this.u;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        t0.o.setText(null);
        this.A = null;
        this.D.x();
        this.z = false;
        this.a2();
    }

    private final void a2() {
        static final class h extends N implements Function1 {
            final ManageHistoryActivity e;

            h(ManageHistoryActivity manageHistoryActivity0) {
                this.e = manageHistoryActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.gallery.history.c c0) {
                if(!c0.k()) {
                    this.e.e2((c0.d() == null ? "" : c0.d()));
                }
                else if(this.e.B == 0) {
                    L.m(c0);
                    this.e.W1(c0);
                }
                else {
                    L.m(c0);
                    this.e.h2(c0);
                }
                i i0 = this.e.D;
                t t0 = this.e.u;
                if(t0 == null) {
                    L.S("binding");
                    t0 = null;
                }
                i0.z(false, t0.m);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.gallery.history.c)object0));
                return S0.a;
            }
        }

        o o0 = this.v;
        if(o0 != null) {
            o0.l();
        }
        i i0 = this.D;
        t t0 = this.u;
        t t1 = null;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        i0.z(true, t0.m);
        t t2 = this.u;
        if(t2 == null) {
            L.S("binding");
        }
        else {
            t1 = t2;
        }
        t1.m.setVisibility(0);
        this.v = uk.Ck(this.y, this.w, this.x, this.z, this.A).y5((Object object0) -> {
            L.p(new h(this), "$tmp0");
            new h(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            String s = throwable0.getMessage();
            if(s == null) {
                s = "";
            }
            this.e2(s);
            i i0 = this.D;
            t t0 = this.u;
            if(t0 == null) {
                L.S("binding");
                t0 = null;
            }
            i0.z(false, t0.m);
        });
    }

    // 检测为 Lambda 实现
    private static final void b2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void c2(ManageHistoryActivity manageHistoryActivity0, Throwable throwable0) [...]

    private final void d2(com.dcinside.app.gallery.history.a a0) {
        if(this.w == a0) {
            return;
        }
        this.w = a0;
        this.Y1();
    }

    private final void e2(String s) {
        static final class com.dcinside.app.gallery.history.ManageHistoryActivity.i extends N implements Function1 {
            final String e;

            com.dcinside.app.gallery.history.ManageHistoryActivity.i(String s) {
                this.e = s;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.n(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class j extends N implements Function1 {
            final ManageHistoryActivity e;

            j(ManageHistoryActivity manageHistoryActivity0) {
                this.e = manageHistoryActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    this.e.a2();
                    return;
                }
                this.e.onBackPressed();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(new com.dcinside.app.gallery.history.ManageHistoryActivity.i(s)).z(0x7F1508D7).x(0x1040000).b().y5((Object object0) -> {
            L.p(new j(this), "$tmp0");
            new j(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.onBackPressed();
        });
    }

    // 检测为 Lambda 实现
    private static final void f2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void g2(ManageHistoryActivity manageHistoryActivity0, Throwable throwable0) [...]

    private final void h2(com.dcinside.app.gallery.history.c c0) {
        this.D.v(c0.f(), c0.i(), (this.w == null ? com.dcinside.app.gallery.history.a.b : this.w));
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        t t0 = t.c(this.getLayoutInflater());
        L.o(t0, "inflate(...)");
        this.u = t0;
        t t1 = null;
        if(t0 == null) {
            L.S("binding");
            t0 = null;
        }
        this.setContentView(t0.b());
        t t2 = this.u;
        if(t2 == null) {
            L.S("binding");
            t2 = null;
        }
        this.S0(t2.s);
        kr.bhbfhfb.designcompat.a.d(this);
        this.y = this.getIntent().getStringExtra("com.dcinside.app.gallery.history.ManageHistoryActivityGalleryId");
        t t3 = this.u;
        if(t3 == null) {
            L.S("binding");
        }
        else {
            t1 = t3;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        t1.m.setLayoutManager(nonPredictiveLayoutManager0);
        t1.m.setAdapter(this.D);
        t1.m.addOnScrollListener(this.C);
        this.U1();
        this.a2();
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.v;
        if(o0 != null) {
            o0.l();
        }
        t t0 = null;
        this.v = null;
        t t1 = this.u;
        if(t1 == null) {
            L.S("binding");
        }
        else {
            t0 = t1;
        }
        t0.m.removeOnScrollListener(this.C);
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

    @Override  // com.dcinside.app.view.ClearableEditText$a
    public void z() {
        this.z = false;
        this.A = null;
        this.x = 1;
        this.B = 0;
        this.D.x();
        this.a2();
    }
}

