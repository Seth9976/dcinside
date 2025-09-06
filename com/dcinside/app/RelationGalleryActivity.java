package com.dcinside.app;

import A3.p;
import Y.d0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.RelationData.Follow;
import com.dcinside.app.model.RelationData;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

public final class RelationGalleryActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @m String s, @m String s1, @m List list0, @m List list1) {
            L.p(context0, "context");
            Intent intent0 = new Intent(context0, RelationGalleryActivity.class);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_NAME", s1);
            if(list0 != null) {
                intent0.putParcelableArrayListExtra("com.dcinside.app.extra.FOLLOWING", new ArrayList(list0));
            }
            if(list1 != null) {
                intent0.putParcelableArrayListExtra("com.dcinside.app.extra.FOLLOW", new ArrayList(list1));
            }
            context0.startActivity(intent0);
        }
    }

    static final class b {
        @m
        private final String a;
        @m
        private final List b;
        @m
        private final List c;

        public b(@m String s, @m List list0, @m List list1) {
            this.a = s;
            this.b = list0;
            this.c = list1;
        }

        @m
        public final List a() {
            return this.b;
        }

        @m
        public final List b() {
            return this.c;
        }

        @m
        public final String c() {
            return this.a;
        }
    }

    static final class c extends Adapter {
        @l
        private final List a;
        private int b;

        public c() {
            this.a = new ArrayList();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.b;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.v(((d)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.w(viewGroup0, v);
        }

        public void v(@l d relationGalleryActivity$d0, int v) {
            L.p(relationGalleryActivity$d0, "holder");
            TextView[] arr_textView = relationGalleryActivity$d0.j();
            int v1 = v * arr_textView.length;
            int v2 = this.a.size();
            for(int v3 = 0; v3 < arr_textView.length; ++v3) {
                int v4 = v1 + v3;
                if(v2 > v4) {
                    Follow relationData$Follow0 = (Follow)this.a.get(v4);
                    String s = relationData$Follow0.f();
                    String s1 = relationData$Follow0.g();
                    View view0 = relationGalleryActivity$d0.i()[v3];
                    L.m(view0);
                    view0.setVisibility(0);
                    view0.setTag(0x7F0B099B, relationData$Follow0.c());  // id:params_arg0
                    TextView textView0 = relationGalleryActivity$d0.j()[v3];
                    L.m(textView0);
                    textView0.setText(relationData$Follow0.a());
                    if(relationData$Follow0.e()) {
                        textView0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0x7F080415, 0);  // drawable:mini_gall_ic
                    }
                    else {
                        textView0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    }
                    if(L.g("N", s)) {
                        TextView textView1 = relationGalleryActivity$d0.j()[v3];
                        L.m(textView1);
                        textView1.setEnabled(false);
                        View view1 = relationGalleryActivity$d0.h()[v3];
                        L.m(view1);
                        view1.setVisibility(0);
                        vk.h(0x7F04032A, new View[]{textView0});  // attr:icTintNormal
                    }
                    else {
                        TextView textView2 = relationGalleryActivity$d0.j()[v3];
                        L.m(textView2);
                        textView2.setEnabled(true);
                        View view2 = relationGalleryActivity$d0.h()[v3];
                        L.m(view2);
                        view2.setVisibility(8);
                        vk.h(0x1010036, new View[]{textView0});
                        Context context0 = textView0.getContext();
                        if(Follow.g.a(s1)) {
                            textView0.setTextColor(ContextCompat.getColor(context0, 0x7F0603FE));  // color:primary0
                        }
                        else {
                            L.m(context0);
                            textView0.setTextColor(vk.c(context0, 0x7F04066C));  // attr:textTypeSelector
                        }
                    }
                }
                else {
                    View view3 = relationGalleryActivity$d0.i()[v3];
                    L.m(view3);
                    view3.setVisibility(8);
                }
            }
        }

        @l
        public d w(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0260, viewGroup0, false);  // layout:view_relation_gall_page_item
            L.m(view0);
            return new d(view0);
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public final void x(@m List list0) {
            this.a.clear();
            if(list0 != null) {
                this.a.addAll(list0);
            }
            this.b = (int)Math.ceil(((float)this.a.size()) / 10.0f);
            this.notifyDataSetChanged();
        }
    }

    static final class d extends ViewHolder {
        @l
        private final View[] a;
        @l
        private final TextView[] b;
        @l
        private final View[] c;

        public d(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            this.a = new View[10];
            for(int v1 = 0; v1 < 10; ++v1) {
                this.a[v1] = view0.findViewById(new int[]{0x7F0B0D03, 0x7F0B0D04, 0x7F0B0D05, 0x7F0B0D06, 0x7F0B0D07, 0x7F0B0D08, 0x7F0B0D09, 0x7F0B0D0A, 0x7F0B0D0B, 0x7F0B0D0C}[v1]);  // id:relation_gallery_page_frame0
                View view1 = this.a[v1];
                if(view1 != null) {
                    view1.setOnClickListener((View view0) -> {
                        L.p(this, "this$0");
                        L.p(view0, "v");
                        this.k(view0);
                    });
                }
            }
            this.b = new TextView[10];
            for(int v2 = 0; v2 < 10; ++v2) {
                this.b[v2] = view0.findViewById(new int[]{0x7F0B0D0D, 0x7F0B0D0E, 0x7F0B0D0F, 0x7F0B0D10, 0x7F0B0D11, 0x7F0B0D12, 0x7F0B0D13, 0x7F0B0D14, 0x7F0B0D15, 0x7F0B0D16}[v2]);  // id:relation_gallery_page_txt0
            }
            this.c = new View[10];
            for(int v = 0; v < 10; ++v) {
                this.c[v] = view0.findViewById(new int[]{0x7F0B0CF9, 0x7F0B0CFA, 0x7F0B0CFB, 0x7F0B0CFC, 0x7F0B0CFD, 0x7F0B0CFE, 0x7F0B0CFF, 0x7F0B0D00, 0x7F0B0D01, 0x7F0B0D02}[v]);  // id:relation_gallery_page_block0
            }
        }

        // 检测为 Lambda 实现
        private static final void f(d relationGalleryActivity$d0, View view0) [...]

        @l
        public final View[] h() {
            return this.c;
        }

        @l
        public final View[] i() {
            return this.a;
        }

        @l
        public final TextView[] j() {
            return this.b;
        }

        private final void k(View view0) {
            try {
                Context context0 = Dl.b(view0);
                Object object0 = view0.getTag(0x7F0B099B);  // id:params_arg0
                L.n(object0, "null cannot be cast to non-null type kotlin.String");
                if(context0 instanceof AppCompatActivity) {
                    new com.dcinside.app.util.Xk.a(((String)object0), 0, 0, null, true, false, false, false, false, false, null, false, null, null, 0x3FE0, null).a(((AppCompatActivity)context0));
                }
            }
            catch(Exception exception0) {
                timber.log.b.a.y(exception0);
            }
        }
    }

    @m
    private String A;
    @m
    private b B;
    private d0 C;
    @l
    public static final a D;
    @m
    private c w;
    @m
    private c x;
    @m
    private o y;
    @m
    private String z;

    static {
        RelationGalleryActivity.D = new a(null);
    }

    private final void a2(b relationGalleryActivity$b0) {
        int v = 0;
        c relationGalleryActivity$c0 = new c();
        this.w = relationGalleryActivity$c0;
        relationGalleryActivity$c0.x(relationGalleryActivity$b0.a());
        d0 d00 = this.C;
        d0 d01 = null;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        h h0 = (int v, int v1) -> {
            L.p(this, "this$0");
            this.q2(v1);
        };
        d00.o.U(h0);
        d0 d02 = this.C;
        if(d02 == null) {
            L.S("binding");
            d02 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        d02.o.setLayoutManager(nonPredictiveLayoutManager0);
        d0 d03 = this.C;
        if(d03 == null) {
            L.S("binding");
            d03 = null;
        }
        d03.o.setAdapter(this.w);
        d0 d04 = this.C;
        if(d04 == null) {
            L.S("binding");
            d04 = null;
        }
        d04.o.scrollToPosition(0);
        int v1 = relationGalleryActivity$b0.a() == null ? 0 : relationGalleryActivity$b0.a().size();
        String s = this.getString(0x7F150889, new Object[]{relationGalleryActivity$b0.c(), v1});  // string:relation_gallery_following "%1$s 갤러리 → 타 갤러리(%2$d)"
        L.o(s, "getString(...)");
        d0 d05 = this.C;
        if(d05 == null) {
            L.S("binding");
            d05 = null;
        }
        d05.q.setText(s);
        d0 d06 = this.C;
        if(d06 == null) {
            L.S("binding");
            d06 = null;
        }
        d06.l.setVisibility((v1 == 0 ? 0 : 8));
        d0 d07 = this.C;
        if(d07 == null) {
            L.S("binding");
            d07 = null;
        }
        d07.j.setVisibility((v1 == 0 ? 8 : 0));
        c relationGalleryActivity$c1 = new c();
        this.x = relationGalleryActivity$c1;
        relationGalleryActivity$c1.x(relationGalleryActivity$b0.b());
        d0 d08 = this.C;
        if(d08 == null) {
            L.S("binding");
            d08 = null;
        }
        i i0 = (int v, int v1) -> {
            L.p(this, "this$0");
            this.n2(v1);
        };
        d08.g.U(i0);
        d0 d09 = this.C;
        if(d09 == null) {
            L.S("binding");
            d09 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager1 = new NonPredictiveLayoutManager(0, false);
        d09.g.setLayoutManager(nonPredictiveLayoutManager1);
        d0 d010 = this.C;
        if(d010 == null) {
            L.S("binding");
            d010 = null;
        }
        d010.g.setAdapter(this.x);
        d0 d011 = this.C;
        if(d011 == null) {
            L.S("binding");
            d011 = null;
        }
        d011.g.scrollToPosition(0);
        int v2 = relationGalleryActivity$b0.b() == null ? 0 : relationGalleryActivity$b0.b().size();
        String s1 = this.getString(0x7F150887, new Object[]{relationGalleryActivity$b0.c(), v2});  // string:relation_gallery_follow "타 갤러리 → %1$s 갤러리(%2$d)"
        L.o(s1, "getString(...)");
        d0 d012 = this.C;
        if(d012 == null) {
            L.S("binding");
            d012 = null;
        }
        d012.i.setText(s1);
        d0 d013 = this.C;
        if(d013 == null) {
            L.S("binding");
            d013 = null;
        }
        d013.d.setVisibility((v2 == 0 ? 0 : 8));
        d0 d014 = this.C;
        if(d014 == null) {
            L.S("binding");
        }
        else {
            d01 = d014;
        }
        LinearLayout linearLayout0 = d01.b;
        if(v2 == 0) {
            v = 8;
        }
        linearLayout0.setVisibility(v);
    }

    // 检测为 Lambda 实现
    private static final void b2(RelationGalleryActivity relationGalleryActivity0, int v, int v1) [...]

    // 检测为 Lambda 实现
    private static final void c2(RelationGalleryActivity relationGalleryActivity0, int v, int v1) [...]

    private final void d2(Throwable throwable0) {
        static final class e extends N implements Function1 {
            final Throwable e;

            e(Throwable throwable0) {
                this.e = throwable0;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.n(this.e.getMessage());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class f extends N implements Function1 {
            final RelationGalleryActivity e;

            f(RelationGalleryActivity relationGalleryActivity0) {
                this.e = relationGalleryActivity0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                if(z) {
                    this.e.g2();
                    return;
                }
                this.e.finish();
            }
        }

        if(this.isFinishing()) {
            return;
        }
        com.dcinside.app.perform.e.e.a(this).n(new e(throwable0)).z(0x7F1508D7).x(0x7F1501F2).b().y5((Object object0) -> {
            L.p(new f(this), "$tmp0");
            new f(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            this.finish();
        });
    }

    // 检测为 Lambda 实现
    private static final void e2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void f2(RelationGalleryActivity relationGalleryActivity0, Throwable throwable0) [...]

    private final void g2() {
        static final class com.dcinside.app.RelationGalleryActivity.g extends N implements Function1 {
            final RelationGalleryActivity e;

            com.dcinside.app.RelationGalleryActivity.g(RelationGalleryActivity relationGalleryActivity0) {
                this.e = relationGalleryActivity0;
                super(1);
            }

            public final b a(@l RelationData relationData0) {
                L.p(relationData0, "relationData");
                List list0 = relationData0.c();
                L.m(list0);
                com.dcinside.app.model.RelationData.a relationData$a0 = (com.dcinside.app.model.RelationData.a)list0.get(0);
                return new b(this.e.A, relationData$a0.b(), relationData$a0.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((RelationData)object0));
            }
        }


        static final class com.dcinside.app.RelationGalleryActivity.h extends N implements Function1 {
            final RelationGalleryActivity e;

            com.dcinside.app.RelationGalleryActivity.h(RelationGalleryActivity relationGalleryActivity0) {
                this.e = relationGalleryActivity0;
                super(1);
            }

            public final void a(@l b relationGalleryActivity$b0) {
                L.p(relationGalleryActivity$b0, "data");
                this.e.a2(relationGalleryActivity$b0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((b)object0));
                return S0.a;
            }
        }

        d0 d00 = this.C;
        d0 d01 = null;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        d00.s.animate().cancel();
        d0 d02 = this.C;
        if(d02 == null) {
            L.S("binding");
            d02 = null;
        }
        d02.r.animate().cancel();
        d0 d03 = this.C;
        if(d03 == null) {
            L.S("binding");
            d03 = null;
        }
        d03.s.animate().alpha(0.0f).setDuration(500L).start();
        d0 d04 = this.C;
        if(d04 == null) {
            L.S("binding");
        }
        else {
            d01 = d04;
        }
        d01.r.animate().alpha(1.0f).setDuration(500L).start();
        this.y = rx.g.v1(new com.dcinside.app.d(this)).T1(() -> {
            L.p(this, "this$0");
            d0 d00 = this.C;
            d0 d01 = null;
            if(d00 == null) {
                L.S("binding");
                d00 = null;
            }
            d00.s.animate().cancel();
            d0 d02 = this.C;
            if(d02 == null) {
                L.S("binding");
                d02 = null;
            }
            d02.r.animate().cancel();
            d0 d03 = this.C;
            if(d03 == null) {
                L.S("binding");
                d03 = null;
            }
            d03.s.animate().alpha(1.0f).setDuration(500L).start();
            d0 d04 = this.C;
            if(d04 == null) {
                L.S("binding");
            }
            else {
                d01 = d04;
            }
            d01.r.animate().alpha(0.0f).setDuration(500L).start();
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.RelationGalleryActivity.h(this), "$tmp0");
            new com.dcinside.app.RelationGalleryActivity.h(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.p(throwable0, "e");
            this.d2(throwable0);
        });
    }

    private static final rx.g h2(RelationGalleryActivity relationGalleryActivity0) {
        L.p(relationGalleryActivity0, "this$0");
        return relationGalleryActivity0.B == null ? uk.oG(relationGalleryActivity0.z).g3((Object object0) -> {
            L.p(new com.dcinside.app.RelationGalleryActivity.g(relationGalleryActivity0), "$tmp0");
            return (b)new com.dcinside.app.RelationGalleryActivity.g(relationGalleryActivity0).invoke(object0);
        }) : rx.g.Q2(relationGalleryActivity0.B);
    }

    // 检测为 Lambda 实现
    private static final b i2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void j2(RelationGalleryActivity relationGalleryActivity0) [...]

    // 检测为 Lambda 实现
    private static final void k2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void l2(RelationGalleryActivity relationGalleryActivity0, Throwable throwable0) [...]

    private final void m2() {
        d0 d00 = this.C;
        d0 d01 = null;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        int v = d00.g.getCurrentPosition();
        c relationGalleryActivity$c0 = this.x;
        L.m(relationGalleryActivity$c0);
        int v1 = s.B(v + 1, relationGalleryActivity$c0.getItemCount() - 1);
        d0 d02 = this.C;
        if(d02 == null) {
            L.S("binding");
        }
        else {
            d01 = d02;
        }
        d01.g.smoothScrollToPosition(v1);
    }

    private final void n2(int v) {
        int v1 = this.x == null ? 0 : this.x.getItemCount();
        d0 d00 = this.C;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        String s = this.getString(0x7F150752, new Object[]{((int)(v + 1)), v1});  // string:pages "%1$d / %2$d"
        d00.f.setText(s);
    }

    private final void o2() {
        d0 d00 = this.C;
        d0 d01 = null;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        int v = s.u(d00.g.getCurrentPosition() - 1, 0);
        d0 d02 = this.C;
        if(d02 == null) {
            L.S("binding");
        }
        else {
            d01 = d02;
        }
        d01.g.smoothScrollToPosition(v);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.RelationGalleryActivity$onCreate$1", f = "RelationGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.RelationGalleryActivity.i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final RelationGalleryActivity l;

            com.dcinside.app.RelationGalleryActivity.i(RelationGalleryActivity relationGalleryActivity0, kotlin.coroutines.d d0) {
                this.l = relationGalleryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.RelationGalleryActivity.i(this.l, d0).invokeSuspend(S0.a);
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
                this.l.r2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.RelationGalleryActivity$onCreate$2", f = "RelationGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final RelationGalleryActivity l;

            j(RelationGalleryActivity relationGalleryActivity0, kotlin.coroutines.d d0) {
                this.l = relationGalleryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new j(this.l, d0).invokeSuspend(S0.a);
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
                this.l.p2();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.RelationGalleryActivity$onCreate$3", f = "RelationGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final RelationGalleryActivity l;

            k(RelationGalleryActivity relationGalleryActivity0, kotlin.coroutines.d d0) {
                this.l = relationGalleryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new k(this.l, d0).invokeSuspend(S0.a);
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


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.RelationGalleryActivity$onCreate$4", f = "RelationGalleryActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.RelationGalleryActivity.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final RelationGalleryActivity l;

            com.dcinside.app.RelationGalleryActivity.l(RelationGalleryActivity relationGalleryActivity0, kotlin.coroutines.d d0) {
                this.l = relationGalleryActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.RelationGalleryActivity.l(this.l, d0).invokeSuspend(S0.a);
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
                this.l.m2();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        d0 d00 = d0.c(this.getLayoutInflater());
        L.o(d00, "inflate(...)");
        this.C = d00;
        b relationGalleryActivity$b0 = null;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        this.setContentView(d00.b());
        d0 d01 = this.C;
        if(d01 == null) {
            L.S("binding");
            d01 = null;
        }
        this.S0(d01.t);
        kr.bhbfhfb.designcompat.a.d(this);
        d0 d02 = this.C;
        if(d02 == null) {
            L.S("binding");
            d02 = null;
        }
        d02.s.setAlpha(0.0f);
        d0 d03 = this.C;
        if(d03 == null) {
            L.S("binding");
            d03 = null;
        }
        d03.r.setAlpha(1.0f);
        d0 d04 = this.C;
        if(d04 == null) {
            L.S("binding");
            d04 = null;
        }
        L.o(d04.p, "relationGalleryFollowingPrev");
        com.dcinside.app.RelationGalleryActivity.i relationGalleryActivity$i0 = new com.dcinside.app.RelationGalleryActivity.i(this, null);
        r.M(d04.p, null, relationGalleryActivity$i0, 1, null);
        d0 d05 = this.C;
        if(d05 == null) {
            L.S("binding");
            d05 = null;
        }
        L.o(d05.m, "relationGalleryFollowingNext");
        j relationGalleryActivity$j0 = new j(this, null);
        r.M(d05.m, null, relationGalleryActivity$j0, 1, null);
        d0 d06 = this.C;
        if(d06 == null) {
            L.S("binding");
            d06 = null;
        }
        L.o(d06.h, "relationGalleryFollowPrev");
        k relationGalleryActivity$k0 = new k(this, null);
        r.M(d06.h, null, relationGalleryActivity$k0, 1, null);
        d0 d07 = this.C;
        if(d07 == null) {
            L.S("binding");
            d07 = null;
        }
        L.o(d07.e, "relationGalleryFollowNext");
        com.dcinside.app.RelationGalleryActivity.l relationGalleryActivity$l0 = new com.dcinside.app.RelationGalleryActivity.l(this, null);
        r.M(d07.e, null, relationGalleryActivity$l0, 1, null);
        Intent intent0 = this.getIntent();
        this.z = intent0.getStringExtra("com.dcinside.app.extra.GALLERY_ID");
        this.A = intent0.getStringExtra("com.dcinside.app.extra.GALLERY_NAME");
        ArrayList arrayList0 = intent0.getParcelableArrayListExtra("com.dcinside.app.extra.FOLLOWING");
        ArrayList arrayList1 = intent0.getParcelableArrayListExtra("com.dcinside.app.extra.FOLLOW");
        if(arrayList0 != null && arrayList1 != null) {
            relationGalleryActivity$b0 = new b(this.A, arrayList0, arrayList1);
        }
        this.B = relationGalleryActivity$b0;
        this.g2();
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        kl.b(new o[]{this.y});
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

    private final void p2() {
        d0 d00 = this.C;
        d0 d01 = null;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        int v = d00.o.getCurrentPosition();
        c relationGalleryActivity$c0 = this.w;
        L.m(relationGalleryActivity$c0);
        int v1 = s.B(v + 1, relationGalleryActivity$c0.getItemCount() - 1);
        d0 d02 = this.C;
        if(d02 == null) {
            L.S("binding");
        }
        else {
            d01 = d02;
        }
        d01.o.smoothScrollToPosition(v1);
    }

    private final void q2(int v) {
        int v1 = this.w == null ? 0 : this.w.getItemCount();
        d0 d00 = this.C;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        String s = this.getString(0x7F150752, new Object[]{((int)(v + 1)), v1});  // string:pages "%1$d / %2$d"
        d00.n.setText(s);
    }

    private final void r2() {
        d0 d00 = this.C;
        d0 d01 = null;
        if(d00 == null) {
            L.S("binding");
            d00 = null;
        }
        int v = s.u(d00.o.getCurrentPosition() - 1, 0);
        d0 d02 = this.C;
        if(d02 == null) {
            L.S("binding");
        }
        else {
            d01 = d02;
        }
        d01.o.smoothScrollToPosition(v);
    }
}

