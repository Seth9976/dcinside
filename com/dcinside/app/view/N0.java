package com.dcinside.app.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.OnItemTouchListener;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.image.o;
import com.dcinside.app.model.e0;
import com.dcinside.app.model.z;
import com.dcinside.app.read.Z;
import com.dcinside.app.rx.bus.I;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.uk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import com.dcinside.app.view.tool.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.random.f;
import rx.g;
import y4.l;
import y4.m;

@s0({"SMAP\nPostReadLikePostsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostReadLikePostsView.kt\ncom/dcinside/app/view/PostReadLikePostsView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,362:1\n1872#2,3:363\n25#3:366\n25#3:367\n1#4:368\n*S KotlinDebug\n*F\n+ 1 PostReadLikePostsView.kt\ncom/dcinside/app/view/PostReadLikePostsView\n*L\n223#1:363,3\n265#1:366\n91#1:367\n*E\n"})
public final class n0 extends ConstraintLayout implements OnItemTouchListener {
    static final class a extends Adapter {
        @m
        private List a;
        private final int b;
        private int c;

        public a() {
            this.b = 0;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return Math.min(this.c, 20);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.w(((b)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.x(viewGroup0, v);
        }

        @l
        public final z v(int v) {
            List list0 = this.a;
            L.m(list0);
            return (z)list0.get(v);
        }

        public void w(@l b n0$b0, int v) {
            L.p(n0$b0, "holder");
            z z0 = this.v(v);
            String s = z0.f();
            if(TextUtils.isEmpty(s)) {
                o.a.b(n0$b0.e(), 0x7F0801F7).apply();  // drawable:fly640
            }
            else {
                o.a.e(n0$b0.e(), s).d().apply();
            }
            n0$b0.f().setText(Dl.t(Dl.M(z0.e())));
        }

        @l
        public b x(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0200, viewGroup0, false);  // layout:view_like_post_item
            j.j(view0, this.b);
            L.m(view0);
            return new b(view0);
        }

        public final void y(@m List list0) {
            this.a = list0;
            this.c = list0 == null ? 0 : list0.size();
            this.notifyDataSetChanged();
        }
    }

    static final class b extends ViewHolder {
        @l
        private final ImageView a;
        @l
        private final TextView b;

        public b(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B06EB);  // id:like_post_item_image
            L.o(view1, "findViewById(...)");
            this.a = (ImageView)view1;
            View view2 = view0.findViewById(0x7F0B06EC);  // id:like_post_item_subject
            L.o(view2, "findViewById(...)");
            this.b = (TextView)view2;
        }

        @l
        public final ImageView e() {
            return this.a;
        }

        @l
        public final TextView f() {
            return this.b;
        }
    }

    private RecyclerView a;
    private TextView b;
    @m
    private rx.o c;
    private int d;
    @m
    private String e;
    @m
    private String f;
    @m
    private e0 g;
    private boolean h;
    @l
    private final List i;

    public n0(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        this.d = -1;
        this.i = new ArrayList();
        this.R();
        this.P();
    }

    public final void N(@m String s, @m String s1, int v) {
        if(dl.a.D1() == com.dcinside.app.type.z.e.d()) {
            kl.b(new rx.o[]{this.c});
            this.b0(null);
            return;
        }
        if(s == null) {
            return;
        }
        if(s1 == null) {
            return;
        }
        m0.a.a a$a0 = m0.a.a;
        if(a$a0.g(new CharSequence[]{s, s1})) {
            this.g = null;
            this.e = null;
            this.f = null;
            this.d = -1;
            kl.b(new rx.o[]{this.c});
            this.b0(null);
            return;
        }
        if(!a$a0.d(this.e, s) || this.d != v) {
            kl.b(new rx.o[]{this.c});
            this.e = s;
            this.f = s1;
            this.d = v;
            this.g = null;
        }
        if(!kl.a(new rx.o[]{this.c})) {
            return;
        }
        this.c0();
    }

    private final void O() {
        RecyclerView recyclerView0 = this.a;
        TextView textView0 = null;
        if(recyclerView0 == null) {
            L.S("vwRecycler");
            recyclerView0 = null;
        }
        recyclerView0.setVisibility(8);
        TextView textView1 = this.b;
        if(textView1 == null) {
            L.S("vwTitle");
        }
        else {
            textView0 = textView1;
        }
        textView0.setVisibility(8);
    }

    private final void P() {
        public static final class c extends com.dcinside.app.rx.bus.I.a {
            @Override  // com.dcinside.app.rx.bus.I$a
            public boolean a(@l com.dcinside.app.type.o o0) {
                L.p(o0, "galleryMode");
                return false;
            }

            @Override  // com.dcinside.app.rx.bus.I$a
            public boolean b() {
                return true;
            }

            @Override  // com.dcinside.app.rx.bus.I$a
            public boolean c(@l com.dcinside.app.type.o o0) {
                L.p(o0, "galleryMode");
                return true;
            }

            @Override  // com.dcinside.app.rx.bus.I$a
            public boolean d(@l com.dcinside.app.type.o o0) {
                L.p(o0, "galleryMode");
                return true;
            }
        }

        RecyclerView recyclerView0 = this.a;
        RecyclerView recyclerView1 = null;
        if(recyclerView0 == null) {
            L.S("vwRecycler");
            recyclerView0 = null;
        }
        recyclerView0.setLayoutManager(new NonPredictiveLayoutManager(0, false));
        RecyclerView recyclerView2 = this.a;
        if(recyclerView2 == null) {
            L.S("vwRecycler");
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(new a());
        int v = Dk.b(0x7F0703CE);  // dimen:post_read_likes_space_size
        RecyclerView recyclerView3 = this.a;
        if(recyclerView3 == null) {
            L.S("vwRecycler");
            recyclerView3 = null;
        }
        com.dcinside.app.util.ql.b.m(recyclerView3, v, v);
        RecyclerView recyclerView4 = this.a;
        if(recyclerView4 == null) {
            L.S("vwRecycler");
            recyclerView4 = null;
        }
        com.dcinside.app.util.ql.b.e(recyclerView4, (View view0, int v) -> {
            L.p(this, "this$0");
            RecyclerView recyclerView0 = this.a;
            Integer integer0 = null;
            if(recyclerView0 == null) {
                L.S("vwRecycler");
                recyclerView0 = null;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(!(recyclerView$Adapter0 instanceof a)) {
                recyclerView$Adapter0 = null;
            }
            if(((a)recyclerView$Adapter0) == null) {
                return false;
            }
            z z0 = ((a)recyclerView$Adapter0).v(v);
            String s = z0.b();
            if(s == null) {
                return false;
            }
            Integer integer1 = z0.d();
            if(integer1.intValue() > 0) {
                integer0 = integer1;
            }
            if(integer0 != null) {
                int v1 = (int)integer0;
                c n0$c0 = new c();
                Context context0 = Al.h(this.getContext());
                if(context0 != null) {
                    com.dcinside.app.rx.bus.c.a(context0, new I(s, v1, n0$c0));
                }
                return true;
            }
            return false;
        });
        RecyclerView recyclerView5 = this.a;
        if(recyclerView5 == null) {
            L.S("vwRecycler");
        }
        else {
            recyclerView1 = recyclerView5;
        }
        recyclerView1.addOnItemTouchListener(this);
    }

    // 检测为 Lambda 实现
    private static final boolean Q(n0 n00, View view0, int v) [...]

    private final void R() {
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View.inflate(this.getContext(), 0x7F0E024D, this);  // layout:view_read_like_posts
        View view0 = this.findViewById(0x7F0B0C60);  // id:read_like_posts_recycler
        L.o(view0, "findViewById(...)");
        this.a = (RecyclerView)view0;
        View view1 = this.findViewById(0x7F0B0C61);  // id:read_like_posts_title
        L.o(view1, "findViewById(...)");
        TextView textView0 = (TextView)view1;
        this.b = textView0;
        if(textView0 == null) {
            L.S("vwTitle");
            textView0 = null;
        }
        textView0.setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.Z();
        });
    }

    // 检测为 Lambda 实现
    private static final void S(n0 n00, View view0) [...]

    private final g T() {
        static final class d extends N implements Function1 {
            final String e;
            final String f;

            d(String s, String s1) {
                this.e = s;
                this.f = s1;
                super(1);
            }

            public final List a(List list0) {
                List list1 = new ArrayList();
                int v = f.a.m(10);
                if(v < 2) {
                    String s = this.e;
                    if(s != null) {
                        list1.add(new com.dcinside.app.read.Z.a(0, s, this.f));
                        list1.add(new com.dcinside.app.read.Z.a(2, "dcbest", 0x7F150532));  // string:live_best "실시간 베스트"
                        return list1;
                    }
                    goto label_7;
                }
                else {
                label_7:
                    if(v < 8) {
                        L.m(list0);
                        if(list0.isEmpty()) {
                            list1.add(new com.dcinside.app.read.Z.a(2, "dcbest", 0x7F150532));  // string:live_best "실시간 베스트"
                        }
                        else {
                            list1.addAll(list0);
                        }
                    }
                    else {
                        list1.add(new com.dcinside.app.read.Z.a(2, "dcbest", 0x7F150532));  // string:live_best "실시간 베스트"
                    }
                }
                list1.add(new com.dcinside.app.read.Z.a(2, "dcbest", 0x7F150532));  // string:live_best "실시간 베스트"
                return list1;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }


        static final class e extends N implements Function1 {
            final n0 e;

            e(n0 n00) {
                this.e = n00;
                super(1);
            }

            public final g a(List list0) {
                this.e.i.clear();
                L.m(list0);
                return this.e.W(list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }

        String s = this.e;
        String s1 = this.f == null ? "" : this.f;
        g g0 = Z.a.i(s).g3((Object object0) -> {
            L.p(new d(s, s1), "$tmp0");
            return (List)new d(s, s1).invoke(object0);
        }).f2((Object object0) -> {
            L.p(new e(this), "$tmp0");
            return (g)new e(this).invoke(object0);
        });
        L.o(g0, "flatMap(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final List U(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final g V(Function1 function10, Object object0) [...]

    private final g W(List list0) {
        static final class com.dcinside.app.view.n0.f extends N implements Function1 {
            final n0 e;
            final List f;

            com.dcinside.app.view.n0.f(n0 n00, List list0) {
                this.e = n00;
                this.f = list0;
                super(1);
            }

            public final g a(Throwable throwable0) {
                if(throwable0 instanceof com.dcinside.app.http.g) {
                    return this.e.W(this.f);
                }
                return !(throwable0 instanceof IOException) || !L.g("404, Not Found", throwable0.getMessage()) ? g.X1(throwable0) : this.e.W(this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Throwable)object0));
            }
        }

        com.dcinside.app.read.Z.a z$a0 = (com.dcinside.app.read.Z.a)u.G2(list0);
        if(z$a0 == null) {
            g g0 = g.X1(new NullPointerException("request list is empty"));
            L.o(g0, "error(...)");
            return g0;
        }
        this.i.add(z$a0);
        list0.remove(z$a0);
        g g1 = this.g0(z$a0.a(), z$a0.b(), z$a0.c()).Z3((Object object0) -> {
            L.p(new com.dcinside.app.view.n0.f(this, list0), "$tmp0");
            return (g)new com.dcinside.app.view.n0.f(this, list0).invoke(object0);
        });
        L.o(g1, "onErrorResumeNext(...)");
        return g1;
    }

    // 检测为 Lambda 实现
    private static final g X(Function1 function10, Object object0) [...]

    private final void Z() {
        e0 e00 = this.g;
        if(e00 == null) {
            return;
        }
        Context context0 = this.getContext();
        L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        Xk.i(((AppCompatActivity)context0), ((String)e00.b().e()));
        ((AppCompatActivity)context0).finish();
    }

    private final void a0(Throwable throwable0) {
        timber.log.b.a.y(throwable0);
        this.b0(null);
    }

    private final void b0(e0 e00) {
        String s;
        CharSequence charSequence0;
        List list0;
        int v = 0;
        this.g = e00;
        Adapter recyclerView$Adapter0 = null;
        if(e00 == null) {
            list0 = u.H();
            charSequence0 = null;
            s = null;
        }
        else {
            if(e00 == null) {
                list0 = u.H();
            }
            else {
                List list1 = e00.a();
                if(list1 == null) {
                    list0 = u.H();
                }
                else {
                    list0 = u.l(list1);
                    if(list0 == null) {
                        list0 = u.H();
                    }
                }
            }
            V v1 = e00.b();
            s = (String)v1.e();
            charSequence0 = (String)v1.f();
        }
        if(m0.a.a.i(charSequence0) || m0.a.a.d(s, this.e)) {
            TextView textView2 = this.b;
            if(textView2 == null) {
                L.S("vwTitle");
                textView2 = null;
            }
            textView2.setText("");
            TextView textView3 = this.b;
            if(textView3 == null) {
                L.S("vwTitle");
                textView3 = null;
            }
            textView3.setVisibility((this.h ? 0 : 4));
        }
        else {
            TextView textView0 = this.b;
            if(textView0 == null) {
                L.S("vwTitle");
                textView0 = null;
            }
            textView0.setText(this.getContext().getString(0x7F1503D5, new Object[]{charSequence0}));  // string:gallery_suffix "%1$s 갤러리"
            TextView textView1 = this.b;
            if(textView1 == null) {
                L.S("vwTitle");
                textView1 = null;
            }
            textView1.setVisibility(0);
        }
        RecyclerView recyclerView0 = this.a;
        if(recyclerView0 == null) {
            L.S("vwRecycler");
            recyclerView0 = null;
        }
        if(list0.isEmpty()) {
            v = 8;
        }
        recyclerView0.setVisibility(v);
        RecyclerView recyclerView1 = this.a;
        if(recyclerView1 == null) {
            L.S("vwRecycler");
            recyclerView1 = null;
        }
        Adapter recyclerView$Adapter1 = recyclerView1.getAdapter();
        if(recyclerView$Adapter1 instanceof a) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((a)recyclerView$Adapter0) != null) {
            ((a)recyclerView$Adapter0).y(list0);
        }
        if(list0.isEmpty()) {
            this.O();
            return;
        }
        this.j0();
    }

    private final void c0() {
        static final class com.dcinside.app.view.n0.g extends N implements Function1 {
            final n0 e;

            com.dcinside.app.view.n0.g(n0 n00) {
                this.e = n00;
                super(1);
            }

            public final void a(e0 e00) {
                this.e.b0(e00);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((e0)object0));
                return S0.a;
            }
        }

        if(!kl.a(new rx.o[]{this.c})) {
            return;
        }
        this.c = g.v1(new k0(this)).y5((Object object0) -> {
            L.p(new com.dcinside.app.view.n0.g(this), "$tmp0");
            new com.dcinside.app.view.n0.g(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            L.m(throwable0);
            this.a0(throwable0);
        });
    }

    // 检测为 Lambda 实现
    private static final void d0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void e0(n0 n00, Throwable throwable0) [...]

    private static final g f0(n0 n00) {
        L.p(n00, "this$0");
        e0 e00 = n00.g;
        if(e00 != null) {
            g g0 = g.Q2(e00);
            return g0 == null ? n00.T() : g0;
        }
        return n00.T();
    }

    private final g g0(int v, String s, String s1) {
        static final class h extends N implements Function1 {
            final String e;
            final String f;
            final int g;

            h(String s, String s1, int v) {
                this.e = s;
                this.f = s1;
                this.g = v;
                super(1);
            }

            public final e0 a(List list0) {
                V v0 = r0.a(this.e, this.f);
                L.m(list0);
                return new e0(this.g, v0, list0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((List)object0));
            }
        }

        return g.v1(new d0(s, v, s1));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public void h(@l RecyclerView recyclerView0, @l MotionEvent motionEvent0) {
        L.p(recyclerView0, "rv");
        L.p(motionEvent0, "e");
    }

    private static final g h0(String s, int v, String s1) {
        L.p(s, "$galleryId");
        L.p(s1, "$galleryName");
        return L.g(s, "dcbest") ? Z.h().g3((Object object0) -> {
            L.p(new h(s, s1, v), "$tmp0");
            return (e0)new h(s, s1, v).invoke(object0);
        }) : uk.EF(v, s, s1);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public boolean i(@l RecyclerView recyclerView0, @l MotionEvent motionEvent0) {
        L.p(recyclerView0, "rv");
        L.p(motionEvent0, "e");
        int v = motionEvent0.getActionMasked();
        switch(v) {
            case 0: {
                recyclerView0.requestDisallowInterceptTouchEvent(true);
                break;
            }
            case 1: {
                recyclerView0.requestDisallowInterceptTouchEvent(false);
                return false;
            }
            default: {
                if(v == 3) {
                    recyclerView0.requestDisallowInterceptTouchEvent(false);
                    return false;
                }
            }
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static final e0 i0(Function1 function10, Object object0) [...]

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public void j(boolean z) {
    }

    private final void j0() {
        RecyclerView recyclerView0 = this.a;
        TextView textView0 = null;
        if(recyclerView0 == null) {
            L.S("vwRecycler");
            recyclerView0 = null;
        }
        recyclerView0.setVisibility(0);
        TextView textView1 = this.b;
        if(textView1 == null) {
            L.S("vwTitle");
        }
        else {
            textView0 = textView1;
        }
        textView0.setVisibility(0);
    }

    private final void k0() {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        for(Object object0: this.i) {
            if(v < 0) {
                u.Z();
            }
            stringBuilder0.append(v + 1 + "차, 타입: " + n0.l0(((com.dcinside.app.read.Z.a)object0).h()) + ", 요청: " + ((com.dcinside.app.read.Z.a)object0).g() + "\n");
            ++v;
        }
        Dl.H(this.getContext(), stringBuilder0.toString(), 1);
    }

    private static final String l0(int v) {
        switch(v) {
            case 1: {
                return "연관";
            }
            case 2: {
                return "이슈줌";
            }
            case 3: {
                return "초개념";
            }
            default: {
                return "현재";
            }
        }
    }
}

