package com.dcinside.app.history;

import A3.p;
import Y.Y;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.post.q.a;
import com.dcinside.app.post.q;
import com.dcinside.app.read.ArchiveQuickManager;
import com.dcinside.app.rx.bus.P;
import com.dcinside.app.rx.bus.w0;
import com.dcinside.app.rx.h;
import com.dcinside.app.settings.PostHistorySettingActivity;
import com.dcinside.app.util.Ok;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import io.realm.F0;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.k;
import kr.better.widget.BetterTextView;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nPostHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHistoryActivity.kt\ncom/dcinside/app/history/PostHistoryActivity\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,422:1\n177#2,9:423\n177#2,9:459\n257#3,2:432\n257#3,2:434\n257#3,2:436\n257#3,2:438\n257#3,2:440\n257#3,2:442\n257#3,2:447\n257#3,2:449\n257#3,2:451\n257#3,2:453\n257#3,2:455\n257#3,2:457\n257#3,2:470\n257#3,2:472\n257#3,2:474\n257#3,2:476\n257#3,2:478\n257#3,2:480\n60#4:444\n60#4:446\n1#5:445\n25#6:468\n25#6:469\n25#6:482\n*S KotlinDebug\n*F\n+ 1 PostHistoryActivity.kt\ncom/dcinside/app/history/PostHistoryActivity\n*L\n100#1:423,9\n292#1:459,9\n118#1:432,2\n119#1:434,2\n124#1:436,2\n125#1:438,2\n130#1:440,2\n131#1:442,2\n266#1:447,2\n267#1:449,2\n274#1:451,2\n275#1:453,2\n282#1:455,2\n283#1:457,2\n373#1:470,2\n376#1:472,2\n379#1:474,2\n384#1:476,2\n389#1:478,2\n390#1:480,2\n160#1:444\n163#1:446\n299#1:468\n369#1:469\n404#1:482\n*E\n"})
public final class PostHistoryActivity extends g implements a, com.dcinside.app.rx.a {
    public static final class com.dcinside.app.history.PostHistoryActivity.a {
        private com.dcinside.app.history.PostHistoryActivity.a() {
        }

        public com.dcinside.app.history.PostHistoryActivity.a(w w0) {
        }
    }

    @m
    private b A;
    private final long B;
    private long C;
    @l
    private q D;
    @l
    public static final com.dcinside.app.history.PostHistoryActivity.a E = null;
    @l
    public static final String F = "com.dcinside.app.extra.POST_HISTORY_EDIT";
    @l
    public static final String G = "com.dcinside.app.extra.POST_INPUT_SERIES";
    @l
    public static final String H = "com.dcinside.app.extra.POST_INPUT_MAXIMUM_COUNT";
    private final com.dcinside.app.rx.a w;
    private Y x;
    private com.dcinside.app.history.l y;
    @m
    private I0 z;

    static {
        PostHistoryActivity.E = new com.dcinside.app.history.PostHistoryActivity.a(null);
    }

    public PostHistoryActivity() {
        this(null, 1, null);
    }

    public PostHistoryActivity(@l com.dcinside.app.rx.a a0) {
        L.p(a0, "scope");
        super();
        this.w = a0;
        long v = System.currentTimeMillis();
        this.B = v;
        this.C = v;
        this.D = new q(this);
    }

    public PostHistoryActivity(com.dcinside.app.rx.a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    @Override  // com.dcinside.app.post.q$a
    public void E() {
        this.j2();
    }

    @Override  // com.dcinside.app.post.q$a
    public boolean W() {
        Y y0 = this.x;
        if(y0 == null) {
            L.S("binding");
            y0 = null;
        }
        L.o(y0.i, "postHistoryRecycler");
        Adapter recyclerView$Adapter0 = y0.i.getAdapter();
        if(!(recyclerView$Adapter0 instanceof i)) {
            recyclerView$Adapter0 = null;
        }
        int v = ((i)recyclerView$Adapter0) == null ? 0 : ((i)recyclerView$Adapter0).getItemCount();
        if(this.C > 0L) {
            com.dcinside.app.history.l l0 = this.y;
            if(l0 == null) {
                L.S("itemManager");
                throw new NullPointerException();
            }
            return !l0.w() && ((this.z == null || this.z.k()) && v <= this.e2() + 5);
        }
        return false;
    }

    private final void b2(List list0, long v) {
        com.dcinside.app.history.l l0 = this.y;
        Y y0 = null;
        if(l0 == null) {
            L.S("itemManager");
            l0 = null;
        }
        l0.a(list0, this.C < v);
        Y y1 = this.x;
        if(y1 == null) {
            L.S("binding");
            y1 = null;
        }
        L.o(y1.i, "postHistoryRecycler");
        Adapter recyclerView$Adapter0 = y1.i.getAdapter();
        if(!(recyclerView$Adapter0 instanceof i)) {
            recyclerView$Adapter0 = null;
        }
        if(((i)recyclerView$Adapter0) != null) {
            ((i)recyclerView$Adapter0).N();
        }
        com.dcinside.app.history.l l1 = this.y;
        if(l1 == null) {
            L.S("itemManager");
            l1 = null;
        }
        if(l1.o() == 0) {
            if(!dl.a.g1()) {
                Y y2 = this.x;
                if(y2 == null) {
                    L.S("binding");
                    y2 = null;
                }
                L.m(y2.g);
                y2.g.setVisibility(0);
                r.o0(y2.g, 0x7F15045E);  // string:history_disable_msg "최근 본 글 기능을 사용하지 않습니다.\n우측 설정 메뉴에서 변경 가능합니다."
                Y y3 = this.x;
                if(y3 == null) {
                    L.S("binding");
                }
                else {
                    y0 = y3;
                }
                L.o(y0.h, "postHistoryMsg1");
                y0.h.setVisibility(8);
                return;
            }
            Y y4 = this.x;
            if(y4 == null) {
                L.S("binding");
                y4 = null;
            }
            L.m(y4.g);
            y4.g.setVisibility(0);
            r.o0(y4.g, 0x7F150461);  // string:history_empty_msg "내역이 없습니다."
            Y y5 = this.x;
            if(y5 == null) {
                L.S("binding");
            }
            else {
                y0 = y5;
            }
            long v1 = jl.a.v0();
            L.m(y0.h);
            y0.h.setVisibility(0);
            String s = this.getString(0x7F150462, new Object[]{v1});  // string:history_expire_days_msg "현재 기기에서 본 글이 %1$d일 동안 저장됩니다."
            y0.h.setText(s);
            return;
        }
        Y y6 = this.x;
        if(y6 == null) {
            L.S("binding");
            y6 = null;
        }
        L.o(y6.g, "postHistoryMsg0");
        y6.g.setVisibility(8);
        Y y7 = this.x;
        if(y7 == null) {
            L.S("binding");
        }
        else {
            y0 = y7;
        }
        L.o(y0.h, "postHistoryMsg1");
        y0.h.setVisibility(8);
    }

    private final void c2() {
        com.dcinside.app.history.l l0 = this.y;
        if(l0 == null) {
            L.S("itemManager");
            l0 = null;
        }
        ArrayList arrayList0 = l0.g();
        Intent intent0 = new Intent();
        intent0.putStringArrayListExtra("extra_post_append_list", arrayList0);
        intent0.putExtra("extra_post_append_mode_type", "type_post_history");
        this.setResult(-1, intent0);
        this.finish();
    }

    private final Calendar d2(long v) {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(v);
        calendar0.set(11, 0);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        L.o(calendar0, "also(...)");
        return calendar0;
    }

    private final int e2() {
        Y y0 = this.x;
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = null;
        if(y0 == null) {
            L.S("binding");
            y0 = null;
        }
        RecyclerView recyclerView0 = y0.i;
        if(recyclerView0 == null) {
            return -1;
        }
        LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
        if(recyclerView$LayoutManager0 instanceof StickyHeaderGridLayoutManager) {
            stickyHeaderGridLayoutManager0 = (StickyHeaderGridLayoutManager)recyclerView$LayoutManager0;
        }
        return stickyHeaderGridLayoutManager0 == null ? -1 : stickyHeaderGridLayoutManager0.Y2();
    }

    private final void f2() {
        static final class com.dcinside.app.history.PostHistoryActivity.b extends N implements Function1 {
            final PostHistoryActivity e;

            com.dcinside.app.history.PostHistoryActivity.b(PostHistoryActivity postHistoryActivity0) {
                this.e = postHistoryActivity0;
                super(1);
            }

            public final void a(w0 w00) {
                L.m(w00);
                this.e.n2(w00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((w0)object0));
                return S0.a;
            }
        }


        static final class c extends N implements Function1 {
            final PostHistoryActivity e;

            c(PostHistoryActivity postHistoryActivity0) {
                this.e = postHistoryActivity0;
                super(1);
            }

            public final void a(P p0) {
                L.m(p0);
                this.e.k2(p0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((P)object0));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.history.PostHistoryActivity$initCallbacks$5", f = "PostHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class d extends o implements p {
            int k;
            final PostHistoryActivity l;

            d(PostHistoryActivity postHistoryActivity0, kotlin.coroutines.d d0) {
                this.l = postHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.o2();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.history.PostHistoryActivity$initCallbacks$6", f = "PostHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements p {
            int k;
            Object l;
            final PostHistoryActivity m;

            e(PostHistoryActivity postHistoryActivity0, kotlin.coroutines.d d0) {
                this.m = postHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                e postHistoryActivity$e0 = new e(this.m, d0);
                postHistoryActivity$e0.l = view0;
                return postHistoryActivity$e0.invokeSuspend(S0.a);
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
                this.m.p2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.history.PostHistoryActivity$initCallbacks$7", f = "PostHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.history.PostHistoryActivity.f extends o implements p {
            int k;
            Object l;
            final PostHistoryActivity m;

            com.dcinside.app.history.PostHistoryActivity.f(PostHistoryActivity postHistoryActivity0, kotlin.coroutines.d d0) {
                this.m = postHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.history.PostHistoryActivity.f postHistoryActivity$f0 = new com.dcinside.app.history.PostHistoryActivity.f(this.m, d0);
                postHistoryActivity$f0.l = view0;
                return postHistoryActivity$f0.invokeSuspend(S0.a);
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
                this.m.p2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.history.PostHistoryActivity$initCallbacks$8", f = "PostHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.history.PostHistoryActivity.g extends o implements p {
            int k;
            Object l;
            final PostHistoryActivity m;

            com.dcinside.app.history.PostHistoryActivity.g(PostHistoryActivity postHistoryActivity0, kotlin.coroutines.d d0) {
                this.m = postHistoryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.history.PostHistoryActivity.g postHistoryActivity$g0 = new com.dcinside.app.history.PostHistoryActivity.g(this.m, d0);
                postHistoryActivity$g0.l = view0;
                return postHistoryActivity$g0.invokeSuspend(S0.a);
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
                this.m.p2(((View)this.l));
                return S0.a;
            }
        }

        rx.o o0 = com.dcinside.app.rx.bus.c.c(this, w0.class).x5((Object object0) -> {
            L.p(new com.dcinside.app.history.PostHistoryActivity.b(this), "$tmp0");
            new com.dcinside.app.history.PostHistoryActivity.b(this).invoke(object0);
        });
        b b0 = this.A;
        if(b0 != null) {
            b0.a(o0);
        }
        rx.o o1 = com.dcinside.app.rx.bus.c.c(this, P.class).x5((Object object0) -> {
            L.p(new c(this), "$tmp0");
            new c(this).invoke(object0);
        });
        b b1 = this.A;
        if(b1 != null) {
            b1.a(o1);
        }
        Y y0 = this.x;
        Y y1 = null;
        if(y0 == null) {
            L.S("binding");
            y0 = null;
        }
        L.o(y0.c, "postHistoryEdit");
        d postHistoryActivity$d0 = new d(this, null);
        r.M(y0.c, null, postHistoryActivity$d0, 1, null);
        Y y2 = this.x;
        if(y2 == null) {
            L.S("binding");
            y2 = null;
        }
        L.o(y2.q, "postHistoryWriteTitle");
        e postHistoryActivity$e0 = new e(this, null);
        r.M(y2.q, null, postHistoryActivity$e0, 1, null);
        Y y3 = this.x;
        if(y3 == null) {
            L.S("binding");
            y3 = null;
        }
        L.o(y3.l, "postHistoryReplyTitle");
        com.dcinside.app.history.PostHistoryActivity.f postHistoryActivity$f0 = new com.dcinside.app.history.PostHistoryActivity.f(this, null);
        r.M(y3.l, null, postHistoryActivity$f0, 1, null);
        Y y4 = this.x;
        if(y4 == null) {
            L.S("binding");
            y4 = null;
        }
        L.o(y4.f, "postHistoryLikeTitle");
        com.dcinside.app.history.PostHistoryActivity.g postHistoryActivity$g0 = new com.dcinside.app.history.PostHistoryActivity.g(this, null);
        r.M(y4.f, null, postHistoryActivity$g0, 1, null);
        Y y5 = this.x;
        if(y5 == null) {
            L.S("binding");
        }
        else {
            y1 = y5;
        }
        com.dcinside.app.read.ArchiveQuickManager.a archiveQuickManager$a0 = new com.dcinside.app.read.ArchiveQuickManager.a(this);
        y1.i.addOnScrollListener(archiveQuickManager$a0);
    }

    // 检测为 Lambda 实现
    private static final void g2(Function1 function10, Object object0) [...]

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.w.getCoroutineContext();
    }

    // 检测为 Lambda 实现
    private static final void h2(Function1 function10, Object object0) [...]

    private final void i2() {
        ColorStateList colorStateList0 = Ok.e.c(this);
        Y y0 = this.x;
        Y y1 = null;
        if(y0 == null) {
            L.S("binding");
            y0 = null;
        }
        TextView textView0 = y0.q;
        textView0.setTextColor(colorStateList0);
        dl dl0 = dl.a;
        textView0.setSelected(dl0.j1());
        Y y2 = this.x;
        if(y2 == null) {
            L.S("binding");
            y2 = null;
        }
        L.o(y2.p, "postHistoryWriteIconGray");
        int v = 8;
        int v1 = textView0.isSelected() ? 8 : 0;
        y2.p.setVisibility(v1);
        Y y3 = this.x;
        if(y3 == null) {
            L.S("binding");
            y3 = null;
        }
        L.o(y3.o, "postHistoryWriteIconColored");
        int v2 = textView0.isSelected() ? 0 : 8;
        y3.o.setVisibility(v2);
        Y y4 = this.x;
        if(y4 == null) {
            L.S("binding");
            y4 = null;
        }
        BetterTextView betterTextView0 = y4.l;
        betterTextView0.setTextColor(colorStateList0);
        betterTextView0.setSelected(dl0.i1());
        Y y5 = this.x;
        if(y5 == null) {
            L.S("binding");
            y5 = null;
        }
        L.o(y5.k, "postHistoryReplyIconGray");
        int v3 = betterTextView0.isSelected() ? 8 : 0;
        y5.k.setVisibility(v3);
        Y y6 = this.x;
        if(y6 == null) {
            L.S("binding");
            y6 = null;
        }
        L.o(y6.j, "postHistoryReplyIconColored");
        int v4 = betterTextView0.isSelected() ? 0 : 8;
        y6.j.setVisibility(v4);
        Y y7 = this.x;
        if(y7 == null) {
            L.S("binding");
            y7 = null;
        }
        BetterTextView betterTextView1 = y7.f;
        betterTextView1.setTextColor(colorStateList0);
        betterTextView1.setSelected(dl0.h1());
        Y y8 = this.x;
        if(y8 == null) {
            L.S("binding");
            y8 = null;
        }
        L.o(y8.e, "postHistoryLikeIconGray");
        int v5 = betterTextView1.isSelected() ? 8 : 0;
        y8.e.setVisibility(v5);
        Y y9 = this.x;
        if(y9 == null) {
            L.S("binding");
            y9 = null;
        }
        ImageView imageView0 = y9.d;
        L.o(imageView0, "postHistoryLikeIconColored");
        if(betterTextView1.isSelected()) {
            v = 0;
        }
        imageView0.setVisibility(v);
        Y y10 = this.x;
        if(y10 == null) {
            L.S("binding");
            y10 = null;
        }
        RecyclerView recyclerView0 = y10.i;
        L.o(recyclerView0, "postHistoryRecycler");
        recyclerView0.addOnScrollListener(this.D);
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = new StickyHeaderGridLayoutManager(1);
        stickyHeaderGridLayoutManager0.m3(0);
        recyclerView0.setLayoutManager(stickyHeaderGridLayoutManager0);
        com.dcinside.app.history.l l0 = this.y;
        if(l0 == null) {
            L.S("itemManager");
            l0 = null;
        }
        recyclerView0.setAdapter(new i(l0));
        com.dcinside.app.history.l l1 = this.y;
        if(l1 == null) {
            L.S("itemManager");
            l1 = null;
        }
        if(l1.x()) {
            Y y11 = this.x;
            if(y11 == null) {
                L.S("binding");
            }
            else {
                y1 = y11;
            }
            y1.c.setVisibility(4);
            return;
        }
        Y y12 = this.x;
        if(y12 == null) {
            L.S("binding");
        }
        else {
            y1 = y12;
        }
        y1.c.setVisibility(0);
    }

    private final void j2() {
        @f(c = "com.dcinside.app.history.PostHistoryActivity$loadAsync$1", f = "PostHistoryActivity.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {325, 343, 357}, m = "invokeSuspend", n = {"$this$launch", "realm", "dataLimitMs", "$this$launch", "realm", "founds", "dataLimitMs", "foundCount"}, s = {"L$0", "L$2", "J$0", "L$0", "L$2", "L$3", "J$0", "I$0"})
        static final class com.dcinside.app.history.PostHistoryActivity.h extends o implements A3.o {
            Object k;
            Object l;
            Object m;
            long n;
            int o;
            int p;
            private Object q;
            final PostHistoryActivity r;

            com.dcinside.app.history.PostHistoryActivity.h(PostHistoryActivity postHistoryActivity0, kotlin.coroutines.d d0) {
                this.r = postHistoryActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.history.PostHistoryActivity.h(this.r, d0);
                d1.q = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.history.PostHistoryActivity.h)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.history.PostHistoryActivity$loadAsync$1$1", f = "PostHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.history.PostHistoryActivity.h.a extends o implements A3.o {
                    int k;
                    final PostHistoryActivity l;
                    final List m;
                    final long n;

                    com.dcinside.app.history.PostHistoryActivity.h.a(PostHistoryActivity postHistoryActivity0, List list0, long v, kotlin.coroutines.d d0) {
                        this.l = postHistoryActivity0;
                        this.m = list0;
                        this.n = v;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.history.PostHistoryActivity.h.a(this.l, this.m, this.n, d0);
                    }

                    // 检测为 Lambda 实现
                    private static final void f(PostHistoryActivity postHistoryActivity0, List list0, long v) [...]

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.history.PostHistoryActivity.h.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Y y0 = this.l.x;
                        if(y0 == null) {
                            L.S("binding");
                            y0 = null;
                        }
                        y0.i.stopScroll();
                        com.dcinside.app.history.f f0 = () -> this.l.b2(this.m, this.n);
                        y0.i.post(f0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.history.PostHistoryActivity$loadAsync$1$foundList$1$1", f = "PostHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.history.PostHistoryActivity.h.b extends o implements A3.o {
                    int k;
                    final PostHistoryActivity l;
                    final F0 m;
                    final long n;
                    final long o;

                    com.dcinside.app.history.PostHistoryActivity.h.b(PostHistoryActivity postHistoryActivity0, F0 f00, long v, long v1, kotlin.coroutines.d d0) {
                        this.l = postHistoryActivity0;
                        this.m = f00;
                        this.n = v;
                        this.o = v1;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.history.PostHistoryActivity.h.b(this.l, this.m, this.n, this.o, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.history.PostHistoryActivity.h.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        com.dcinside.app.history.l l0 = this.l.y;
                        if(l0 == null) {
                            L.S("itemManager");
                            l0 = null;
                        }
                        List list0 = l0.e(this.m, this.n, this.o);
                        return r0.a(list0, kotlin.coroutines.jvm.internal.b.f(list0.size()));
                    }
                }


                @f(c = "com.dcinside.app.history.PostHistoryActivity$loadAsync$1$foundList$1$isClosed$1", f = "PostHistoryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.history.PostHistoryActivity.h.c extends o implements A3.o {
                    int k;
                    final F0 l;

                    com.dcinside.app.history.PostHistoryActivity.h.c(F0 f00, kotlin.coroutines.d d0) {
                        this.l = f00;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.history.PostHistoryActivity.h.c(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.history.PostHistoryActivity.h.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        return kotlin.coroutines.jvm.internal.b.a(this.l.isClosed());
                    }
                }

                int v3;
                List list2;
                O o1;
                PostHistoryActivity postHistoryActivity1;
                F0 f01;
                long v2;
                List list1;
                Object object3;
                Object object2;
                List list0;
                PostHistoryActivity postHistoryActivity0;
                F0 f00;
                long v1;
                O o0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.p) {
                    case 0: {
                        f0.n(object0);
                        o0 = (O)this.q;
                        long v = TimeUnit.DAYS.toMillis(jl.a.v0());
                        v1 = this.r.d2(this.r.B - v).getTimeInMillis();
                        f00 = this.r.F1();
                        postHistoryActivity0 = this.r;
                        if(f00 == null) {
                            list0 = u.H();
                            goto label_31;
                        }
                        else {
                            com.dcinside.app.history.PostHistoryActivity.h.c postHistoryActivity$h$c0 = new com.dcinside.app.history.PostHistoryActivity.h.c(f00, null);
                            this.q = o0;
                            this.k = postHistoryActivity0;
                            this.l = f00;
                            this.n = v1;
                            this.p = 1;
                            object2 = kotlinx.coroutines.i.h(h0.e(), postHistoryActivity$h$c0, this);
                            if(object2 == object1) {
                                return object1;
                            }
                            goto label_29;
                        }
                        break;
                    }
                    case 1: {
                        v1 = this.n;
                        f00 = (F0)this.l;
                        postHistoryActivity0 = (PostHistoryActivity)this.k;
                        o0 = (O)this.q;
                        f0.n(object0);
                        object2 = object0;
                    label_29:
                        if(((Boolean)object2).booleanValue()) {
                            list0 = u.H();
                        label_31:
                            object3 = object1;
                            list1 = list0;
                            v2 = v1;
                        }
                        else {
                            f01 = f00;
                            postHistoryActivity1 = postHistoryActivity0;
                            o1 = o0;
                            list2 = new ArrayList();
                            v3 = 0;
                            goto label_59;
                        }
                        break;
                    }
                    case 2: {
                        v3 = this.o;
                        v1 = this.n;
                        list2 = (List)this.m;
                        F0 f02 = (F0)this.l;
                        PostHistoryActivity postHistoryActivity2 = (PostHistoryActivity)this.k;
                        O o2 = (O)this.q;
                        f0.n(object0);
                        Object object4 = object0;
                        Object object5 = object1;
                        f01 = f02;
                        postHistoryActivity1 = postHistoryActivity2;
                        o1 = o2;
                        while(true) {
                            List list3 = (List)((V)object4).a();
                            int v4 = ((Number)((V)object4).b()).intValue();
                            if(v4 != 0) {
                                list2.add(list3);
                                v3 += v4;
                            }
                            object1 = object5;
                        label_59:
                            if(((long)v3) >= 30L || postHistoryActivity1.C < v1 || !kotlinx.coroutines.P.k(o1)) {
                                break;
                            }
                            Calendar calendar0 = postHistoryActivity1.d2(postHistoryActivity1.C);
                            long v5 = calendar0.getTimeInMillis();
                            calendar0.add(5, 1);
                            long v6 = calendar0.getTimeInMillis();
                            calendar0.add(5, -2);
                            postHistoryActivity1.C = calendar0.getTimeInMillis();
                            com.dcinside.app.history.PostHistoryActivity.h.b postHistoryActivity$h$b0 = new com.dcinside.app.history.PostHistoryActivity.h.b(postHistoryActivity1, f01, v5, v6, null);
                            this.q = o1;
                            this.k = postHistoryActivity1;
                            this.l = f01;
                            this.m = list2;
                            this.n = v1;
                            this.o = v3;
                            this.p = 2;
                            object4 = kotlinx.coroutines.i.h(h0.e(), postHistoryActivity$h$b0, this);
                            object5 = object1;
                            if(object4 != object5) {
                                continue;
                            }
                            return object5;
                        }
                        object3 = object1;
                        o0 = o1;
                        v2 = v1;
                        list1 = list2;
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(!kotlinx.coroutines.P.k(o0)) {
                    return S0.a;
                }
                com.dcinside.app.history.PostHistoryActivity.h.a postHistoryActivity$h$a0 = new com.dcinside.app.history.PostHistoryActivity.h.a(this.r, list1, v2, null);
                this.q = null;
                this.k = null;
                this.l = null;
                this.m = null;
                this.p = 3;
                return kotlinx.coroutines.i.h(h0.e(), postHistoryActivity$h$a0, this) == object3 ? object3 : S0.a;
            }
        }

        this.z = k.f(LifecycleOwnerKt.a(this), null, null, new com.dcinside.app.history.PostHistoryActivity.h(this, null), 3, null);
    }

    private final void k2(P p0) {
        static final class com.dcinside.app.history.PostHistoryActivity.i extends N implements Function1 {
            final PostHistoryActivity e;

            com.dcinside.app.history.PostHistoryActivity.i(PostHistoryActivity postHistoryActivity0) {
                this.e = postHistoryActivity0;
                super(1);
            }

            @m
            public final g1 a(@l F0 f00) {
                L.p(f00, "realm");
                com.dcinside.app.history.l l0 = this.e.y;
                if(l0 == null) {
                    L.S("itemManager");
                    l0 = null;
                }
                return l0.h(f00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((F0)object0));
            }
        }


        static final class j extends N implements Function1 {
            public static final j e;

            static {
                j.e = new j();
            }

            j() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15045C);  // string:history_delete_msg "삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.history.PostHistoryActivity.k extends N implements Function1 {
            public static final com.dcinside.app.history.PostHistoryActivity.k e;

            static {
                com.dcinside.app.history.PostHistoryActivity.k.e = new com.dcinside.app.history.PostHistoryActivity.k();
            }

            com.dcinside.app.history.PostHistoryActivity.k() {
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


        @s0({"SMAP\nPostHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHistoryActivity.kt\ncom/dcinside/app/history/PostHistoryActivity$onBusPostHistoryAction$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1#2:423\n*E\n"})
        static final class com.dcinside.app.history.PostHistoryActivity.l extends N implements Function1 {
            final PostHistoryActivity e;

            com.dcinside.app.history.PostHistoryActivity.l(PostHistoryActivity postHistoryActivity0) {
                this.e = postHistoryActivity0;
                super(1);
            }

            public final void b(Boolean boolean0) {
                com.dcinside.app.history.l l0 = null;
                F0 f00 = this.e.F1();
                if(f00 != null) {
                    if(f00.isClosed()) {
                        f00 = null;
                    }
                    if(f00 != null) {
                        com.dcinside.app.history.l l1 = this.e.y;
                        if(l1 == null) {
                            L.S("itemManager");
                        }
                        else {
                            l0 = l1;
                        }
                        g1 g10 = l0.h(f00);
                        if(g10 != null) {
                            f00.Y3((F0 f00) -> g10.L0());
                        }
                        this.e.r2();
                    }
                }
            }

            // 检测为 Lambda 实现
            private static final void c(g1 g10, F0 f00) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((Boolean)object0));
                return S0.a;
            }
        }

        switch(p0.a()) {
            case 0: {
                this.k1().N(new com.dcinside.app.history.PostHistoryActivity.i(this));
                return;
            }
            case 1: {
                com.dcinside.app.perform.e.e.a(this).n(j.e).z(0x7F15045B).x(0x1040000).b().Z1((Object object0) -> {
                    L.p(com.dcinside.app.history.PostHistoryActivity.k.e, "$tmp0");
                    return (Boolean)com.dcinside.app.history.PostHistoryActivity.k.e.invoke(object0);
                }).x5((Object object0) -> {
                    L.p(new com.dcinside.app.history.PostHistoryActivity.l(this), "$tmp0");
                    new com.dcinside.app.history.PostHistoryActivity.l(this).invoke(object0);
                });
                return;
            }
            case 2: {
                if(this.W()) {
                    this.E();
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final Boolean l2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void m2(Function1 function10, Object object0) [...]

    private final void n2(w0 w00) {
        this.k1().M(w00);
    }

    private final void o2() {
        Intent intent0 = new Intent(this, PostHistoryActivity.class);
        intent0.putExtra("com.dcinside.app.extra.POST_HISTORY_EDIT", true);
        this.startActivityForResult(intent0, 0x40A);
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 0x409 || v == 0x40A) {
            this.r2();
        }
    }

    @Override  // com.dcinside.app.base.d
    public void onBackPressed() {
        if(this.k1().D()) {
            return;
        }
        super.onBackPressed();
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        Bundle bundle3;
        Bundle bundle2;
        Bundle bundle1;
        super.onCreate(bundle0);
        Y y0 = null;
        if(bundle0 == null) {
            Intent intent0 = this.getIntent();
            bundle1 = intent0 == null ? null : intent0.getExtras();
        }
        else {
            bundle1 = bundle0;
        }
        boolean z = false;
        boolean z1 = bundle1 == null ? false : bundle1.getBoolean("com.dcinside.app.extra.POST_HISTORY_EDIT");
        if(bundle0 == null) {
            Intent intent1 = this.getIntent();
            bundle2 = intent1 == null ? null : intent1.getExtras();
        }
        else {
            bundle2 = bundle0;
        }
        if(bundle2 != null) {
            z = bundle2.getBoolean("com.dcinside.app.extra.POST_INPUT_SERIES");
        }
        if(bundle0 == null) {
            Intent intent2 = this.getIntent();
            bundle3 = intent2 == null ? null : intent2.getExtras();
        }
        else {
            bundle3 = bundle0;
        }
        this.y = new com.dcinside.app.history.l(this, z1, z, (bundle3 == null ? -1 : bundle3.getInt("com.dcinside.app.extra.POST_INPUT_MAXIMUM_COUNT", -1)));
        if(!z1 || !z) {
            if(!z1) {
            }
            this.setTitle(0x7F150466);  // string:history_title "최근 본 글"
        }
        else {
            this.setTitle(0x7F150455);  // string:history_add_series_title "글 추가하기 - 최근 본 글"
        }
        if(bundle0 != null) {
            ArchiveQuickManager.g.a(this);
        }
        Y y1 = Y.c(this.getLayoutInflater());
        L.o(y1, "inflate(...)");
        this.x = y1;
        if(y1 == null) {
            L.S("binding");
            y1 = null;
        }
        this.setContentView(y1.b());
        Y y2 = this.x;
        if(y2 == null) {
            L.S("binding");
        }
        else {
            y0 = y2;
        }
        this.S0(y0.n);
        kr.bhbfhfb.designcompat.a.d(this);
        this.i2();
        this.f2();
        this.r2();
        this.s2();
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@m Menu menu0) {
        com.dcinside.app.history.l l0 = this.y;
        com.dcinside.app.history.l l1 = null;
        if(l0 == null) {
            L.S("itemManager");
            l0 = null;
        }
        if(l0.x()) {
            com.dcinside.app.history.l l2 = this.y;
            if(l2 == null) {
                L.S("itemManager");
            }
            else {
                l1 = l2;
            }
            if(l1.y()) {
                this.getMenuInflater().inflate(0x7F10000B, menu0);  // mipmap:ic_launcher15
            }
        }
        else {
            this.getMenuInflater().inflate(0x7F100002, menu0);  // mipmap:gall_base_icon3
            if(menu0 != null) {
                MenuItem menuItem0 = menu0.findItem(0x7F0B0056);  // id:action_config
                if(menuItem0 != null) {
                    View view0 = menuItem0.getActionView();
                    if(view0 != null) {
                        l1 = view0.findViewById(0x7F0B0814);  // id:menu_config
                    }
                    if(l1 != null) {
                        ((View)l1).setOnClickListener((View view0) -> {
                            L.p(this, "this$0");
                            L.p(menuItem0, "$it");
                            this.onOptionsItemSelected(menuItem0);
                        });
                        return super.onCreateOptionsMenu(menu0);
                    }
                }
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        this.t();
        try {
            I0 i00 = this.z;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.z = null;
        Y y0 = this.x;
        if(y0 == null) {
            L.S("binding");
            y0 = null;
        }
        y0.i.stopScroll();
        b b0 = this.A;
        if(b0 != null) {
            b0.l();
        }
        this.A = null;
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
                return true;
            }
            case 0x7F0B0056: {  // id:action_config
                this.startActivityForResult(new Intent(this, PostHistorySettingActivity.class), 0x409);
                return super.onOptionsItemSelected(menuItem0);
            }
            case 0x7F0B0E37: {  // id:series_menu_post_apply
                this.c2();
                return super.onOptionsItemSelected(menuItem0);
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onSaveInstanceState(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        com.dcinside.app.history.l l0 = this.y;
        if(l0 == null) {
            L.S("itemManager");
            l0 = null;
        }
        bundle0.putBoolean("com.dcinside.app.extra.POST_HISTORY_EDIT", l0.x());
    }

    private final void p2(View view0) {
        int v = 8;
        Y y0 = null;
        switch(view0.getId()) {
            case 0x7F0B0A68: {  // id:post_history_like_title
                Y y1 = this.x;
                if(y1 == null) {
                    L.S("binding");
                    y1 = null;
                }
                BetterTextView betterTextView0 = y1.f;
                betterTextView0.setSelected(!betterTextView0.isSelected());
                Y y2 = this.x;
                if(y2 == null) {
                    L.S("binding");
                    y2 = null;
                }
                L.o(y2.e, "postHistoryLikeIconGray");
                int v1 = betterTextView0.isSelected() ? 8 : 0;
                y2.e.setVisibility(v1);
                Y y3 = this.x;
                if(y3 == null) {
                    L.S("binding");
                }
                else {
                    y0 = y3;
                }
                ImageView imageView0 = y0.d;
                L.o(imageView0, "postHistoryLikeIconColored");
                if(betterTextView0.isSelected()) {
                    v = 0;
                }
                imageView0.setVisibility(v);
                boolean z = betterTextView0.isSelected();
                dl.a.Z4(z);
                break;
            }
            case 0x7F0B0A6E: {  // id:post_history_reply_title
                Y y4 = this.x;
                if(y4 == null) {
                    L.S("binding");
                    y4 = null;
                }
                BetterTextView betterTextView1 = y4.l;
                betterTextView1.setSelected(!betterTextView1.isSelected());
                Y y5 = this.x;
                if(y5 == null) {
                    L.S("binding");
                    y5 = null;
                }
                L.o(y5.k, "postHistoryReplyIconGray");
                int v2 = betterTextView1.isSelected() ? 8 : 0;
                y5.k.setVisibility(v2);
                Y y6 = this.x;
                if(y6 == null) {
                    L.S("binding");
                }
                else {
                    y0 = y6;
                }
                ImageView imageView1 = y0.j;
                L.o(imageView1, "postHistoryReplyIconColored");
                if(betterTextView1.isSelected()) {
                    v = 0;
                }
                imageView1.setVisibility(v);
                boolean z1 = betterTextView1.isSelected();
                dl.a.a5(z1);
                break;
            }
            case 0x7F0B0A73: {  // id:post_history_write_title
                Y y7 = this.x;
                if(y7 == null) {
                    L.S("binding");
                    y7 = null;
                }
                TextView textView0 = y7.q;
                textView0.setSelected(!textView0.isSelected());
                Y y8 = this.x;
                if(y8 == null) {
                    L.S("binding");
                    y8 = null;
                }
                L.o(y8.p, "postHistoryWriteIconGray");
                int v3 = textView0.isSelected() ? 8 : 0;
                y8.p.setVisibility(v3);
                Y y9 = this.x;
                if(y9 == null) {
                    L.S("binding");
                }
                else {
                    y0 = y9;
                }
                ImageView imageView2 = y0.o;
                L.o(imageView2, "postHistoryWriteIconColored");
                if(textView0.isSelected()) {
                    v = 0;
                }
                imageView2.setVisibility(v);
                boolean z2 = textView0.isSelected();
                dl.a.b5(z2);
            }
        }
        this.r2();
    }

    // 检测为 Lambda 实现
    private static final void q2(PostHistoryActivity postHistoryActivity0, MenuItem menuItem0, View view0) [...]

    private final void r2() {
        Y y0 = null;
        try {
            I0 i00 = this.z;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        Y y1 = this.x;
        if(y1 == null) {
            L.S("binding");
            y1 = null;
        }
        y1.i.suppressLayout(true);
        com.dcinside.app.history.l l0 = this.y;
        if(l0 == null) {
            L.S("itemManager");
            l0 = null;
        }
        Y y2 = this.x;
        if(y2 == null) {
            L.S("binding");
            y2 = null;
        }
        boolean z = y2.q.isSelected();
        Y y3 = this.x;
        if(y3 == null) {
            L.S("binding");
            y3 = null;
        }
        boolean z1 = y3.l.isSelected();
        Y y4 = this.x;
        if(y4 == null) {
            L.S("binding");
            y4 = null;
        }
        l0.z(z, z1, y4.f.isSelected());
        Y y5 = this.x;
        if(y5 == null) {
            L.S("binding");
            y5 = null;
        }
        L.o(y5.i, "postHistoryRecycler");
        Adapter recyclerView$Adapter0 = y5.i.getAdapter();
        if(!(recyclerView$Adapter0 instanceof i)) {
            recyclerView$Adapter0 = null;
        }
        this.C = this.B;
        com.dcinside.app.history.l l1 = this.y;
        if(l1 == null) {
            L.S("itemManager");
            l1 = null;
        }
        l1.d();
        com.dcinside.app.history.l l2 = this.y;
        if(l2 == null) {
            L.S("itemManager");
            l2 = null;
        }
        l2.a(u.H(), false);
        Y y6 = this.x;
        if(y6 == null) {
            L.S("binding");
        }
        else {
            y0 = y6;
        }
        y0.i.suppressLayout(false);
        if(((i)recyclerView$Adapter0) != null) {
            ((i)recyclerView$Adapter0).N();
        }
        this.j2();
    }

    public final void s2() {
        com.dcinside.app.history.l l0 = this.y;
        Y y0 = null;
        if(l0 == null) {
            L.S("itemManager");
            l0 = null;
        }
        if(l0.y()) {
            com.dcinside.app.history.l l1 = this.y;
            if(l1 == null) {
                L.S("itemManager");
                l1 = null;
            }
            int v = l1.p();
            com.dcinside.app.history.l l2 = this.y;
            if(l2 == null) {
                L.S("itemManager");
                l2 = null;
            }
            int v1 = l2.f();
            Y y1 = this.x;
            if(y1 == null) {
                L.S("binding");
                y1 = null;
            }
            y1.m.setVisibility(0);
            Y y2 = this.x;
            if(y2 == null) {
                L.S("binding");
            }
            else {
                y0 = y2;
            }
            String s = this.getString(0x7F150952, new Object[]{v1, v});  // string:series_remain_count "시리즈에 추가할 글 (%1$d/%2$d)"
            y0.m.setText(s);
            return;
        }
        Y y3 = this.x;
        if(y3 == null) {
            L.S("binding");
        }
        else {
            y0 = y3;
        }
        y0.m.setVisibility(8);
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.w.t();
    }
}

