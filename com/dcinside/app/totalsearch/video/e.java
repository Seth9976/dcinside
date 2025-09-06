package com.dcinside.app.totalsearch.video;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.totalsearch.a.f;
import com.dcinside.app.util.kl;
import com.dcinside.app.util.vk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

@SuppressLint({"NotifyDataSetChanged"})
@s0({"SMAP\nTotalVideoAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalVideoAdapter.kt\ncom/dcinside/app/totalsearch/video/TotalVideoAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n257#2,2:192\n1863#3,2:194\n1863#3,2:196\n*S KotlinDebug\n*F\n+ 1 TotalVideoAdapter.kt\ncom/dcinside/app/totalsearch/video/TotalVideoAdapter\n*L\n76#1:192,2\n134#1:194,2\n146#1:196,2\n*E\n"})
public final class e extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static final class b {
        private final int a;
        @m
        private final f b;

        public b(int v, @m f a$f0) {
            this.a = v;
            this.b = a$f0;
        }

        public final int a() {
            return this.a;
        }

        @m
        public final f b() {
            return this.b;
        }

        @l
        public final b c(int v, @m f a$f0) {
            return new b(v, a$f0);
        }

        public static b d(b e$b0, int v, f a$f0, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = e$b0.a;
            }
            if((v1 & 2) != 0) {
                a$f0 = e$b0.b;
            }
            return e$b0.c(v, a$f0);
        }

        @m
        public final f e() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            return this.a == ((b)object0).a ? L.g(this.b, ((b)object0).b) : false;
        }

        public final int f() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = this.a * 0x1F;
            return this.b == null ? v : v + this.b.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "TotalVideoViewTypeItem(type=" + this.a + ", item=" + this.b + ")";
        }
    }

    @m
    private WeakReference a;
    @l
    private final ArrayList b;
    @l
    private final rx.subjects.b c;
    @m
    private o d;
    @m
    private String e;
    @l
    public static final a f = null;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;

    static {
        e.f = new a(null);
    }

    public e() {
        this.b = new ArrayList();
        rx.subjects.b b0 = rx.subjects.b.C7();
        L.o(b0, "create(...)");
        this.c = b0;
    }

    public final void A() {
        this.b.clear();
        this.notifyDataSetChanged();
    }

    // 检测为 Lambda 实现
    private static final void B(e e0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void C(e e0, s s0, View view0, boolean z) [...]

    private final void D(s s0, boolean z) {
        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            // 去混淆评级： 低(20)
            public final g b(boolean z) {
                return z ? g.s6(0L, TimeUnit.MILLISECONDS) : g.s6(500L, TimeUnit.MILLISECONDS);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((Boolean)object0).booleanValue());
            }
        }


        static final class d extends N implements Function1 {
            final s e;

            d(s s0) {
                this.e = s0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Boolean)object0).booleanValue());
                return S0.a;
            }

            public final void invoke(boolean z) {
                if(z) {
                    this.e.f().setVisibility(0);
                    this.e.e().setVisibility(8);
                    return;
                }
                this.e.f().setVisibility(8);
                this.e.e().setVisibility(0);
            }
        }

        kl.b(new o[]{this.d});
        if(z) {
            com.dcinside.app.totalsearch.video.c c0 = (Object object0) -> {
                L.p(c.e, "$tmp0");
                return (g)c.e.invoke(object0);
            };
            this.d = this.c.t1(c0).M3(rx.android.schedulers.a.c()).x5((Object object0) -> {
                L.p(new d(s0), "$tmp0");
                new d(s0).invoke(object0);
            });
        }
    }

    // 检测为 Lambda 实现
    private static final g E(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void F(Function1 function10, Object object0) [...]

    private final void G() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 != null) {
            try {
                q q0 = (q)weakReference0.get();
                if(q0 != null) {
                    q0.E();
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
    }

    public final void H(@l q q0) {
        L.p(q0, "fragment");
        this.a = new WeakReference(q0);
    }

    public final void I(@l com.dcinside.app.totalsearch.a a0, @m String s) {
        L.p(a0, "result");
        if(a0.f()) {
            this.b.clear();
            this.e = s;
            b e$b0 = new b(4, null);
            this.b.add(e$b0);
            this.notifyDataSetChanged();
            return;
        }
        this.e = s;
        ArrayList arrayList0 = a0.l();
        this.b.clear();
        if(arrayList0 == null || arrayList0.isEmpty()) {
            b e$b4 = new b(3, null);
            this.b.add(e$b4);
        }
        else {
            b e$b1 = new b(0, null);
            this.b.add(e$b1);
            for(Object object0: arrayList0) {
                b e$b2 = new b(1, ((f)object0));
                this.b.add(e$b2);
            }
            if(arrayList0.size() >= 25) {
                b e$b3 = new b(2, null);
                this.b.add(e$b3);
            }
        }
        this.notifyDataSetChanged();
    }

    public final void J(boolean z) {
        this.c.onNext(Boolean.valueOf(z));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((b)this.b.get(v)).f();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        String s = "";
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.ad.naver.c) {
            WeakReference weakReference0 = this.a;
            if(weakReference0 != null) {
                Object object0 = weakReference0.get();
                if(((q)object0) != null) {
                    LifecycleOwner lifecycleOwner0 = ((q)object0).getViewLifecycleOwner();
                    L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
                    com.dcinside.app.ad.naver.c.l(((com.dcinside.app.ad.naver.c)recyclerView$ViewHolder0), lifecycleOwner0, (this.e == null ? "" : this.e), null, ((q)object0), 4, null);
                    return;
                }
            }
            return;
        }
        if(recyclerView$ViewHolder0 instanceof r) {
            ((r)recyclerView$ViewHolder0).e(((b)this.b.get(v)).e());
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.totalsearch.holders.c) {
            String s1 = this.e;
            if(s1 != null) {
                s = s1;
            }
            ((com.dcinside.app.totalsearch.holders.c)recyclerView$ViewHolder0).j(s);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        ViewHolder recyclerView$ViewHolder0;
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: {
                LinearLayout linearLayout0 = new LinearLayout(viewGroup0.getContext());
                linearLayout0.setOrientation(1);
                linearLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new com.dcinside.app.ad.naver.c(linearLayout0);
            }
            case 1: {
                Context context0 = viewGroup0.getContext();
                L.o(context0, "getContext(...)");
                return new r(new VideoItemView(context0, null, 0, 6, null));
            }
            case 2: {
                View view1 = layoutInflater0.inflate(0x7F0E0276, viewGroup0, false);  // layout:view_search_more
                view1.setOnClickListener((View view0) -> {
                    L.p(this, "this$0");
                    this.G();
                });
                L.m(view1);
                recyclerView$ViewHolder0 = new s(view1);
                vk.h(0x7F040158, new View[]{((s)recyclerView$ViewHolder0).e()});  // attr:colorPrimary
                com.dcinside.app.util.ql.a.a(view1, (View view0, boolean z) -> {
                    L.p(this, "this$0");
                    L.p(((s)recyclerView$ViewHolder0), "$holder");
                    this.D(((s)recyclerView$ViewHolder0), z);
                });
                return recyclerView$ViewHolder0;
            }
            case 3: {
                View view2 = layoutInflater0.inflate(0x7F0E02A1, viewGroup0, false);  // layout:view_total_search_empty
                L.m(view2);
                return new com.dcinside.app.totalsearch.video.f(view2);
            }
            case 4: {
                View view3 = layoutInflater0.inflate(0x7F0E02A0, viewGroup0, false);  // layout:view_total_search_campaign_word
                L.m(view3);
                return new com.dcinside.app.totalsearch.holders.c(view3);
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E02A1, viewGroup0, false);  // layout:view_total_search_empty
                L.m(view0);
                recyclerView$ViewHolder0 = new com.dcinside.app.totalsearch.video.f(view0);
                L.o(recyclerView$ViewHolder0.itemView, "itemView");
                recyclerView$ViewHolder0.itemView.setVisibility(8);
                return recyclerView$ViewHolder0;
            }
        }
    }

    public final void release() {
        WeakReference weakReference0 = this.a;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.a = null;
    }

    public final void z(@l com.dcinside.app.totalsearch.a a0) {
        L.p(a0, "result");
        ArrayList arrayList0 = a0.l();
        if(arrayList0 == null) {
            return;
        }
        for(Object object0: arrayList0) {
            b e$b0 = new b(1, ((f)object0));
            this.b.add(e$b0);
        }
        this.notifyDataSetChanged();
    }
}

