package com.dcinside.app.settings.text;

import Y.n0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.base.g;
import com.dcinside.app.realm.o;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nGalleryTextOptionListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryTextOptionListActivity.kt\ncom/dcinside/app/settings/text/GalleryTextOptionListActivity\n+ 2 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,223:1\n37#2:224\n177#3,9:225\n177#3,9:234\n25#4:243\n*S KotlinDebug\n*F\n+ 1 GalleryTextOptionListActivity.kt\ncom/dcinside/app/settings/text/GalleryTextOptionListActivity\n*L\n71#1:224\n80#1:225,9\n104#1:234,9\n60#1:243\n*E\n"})
public final class GalleryTextOptionListActivity extends g implements P0 {
    static final class a extends Adapter {
        public static final class com.dcinside.app.settings.text.GalleryTextOptionListActivity.a.a {
            private com.dcinside.app.settings.text.GalleryTextOptionListActivity.a.a() {
            }

            public com.dcinside.app.settings.text.GalleryTextOptionListActivity.a.a(w w0) {
            }
        }

        @l
        private final ArrayList a;
        @l
        public static final com.dcinside.app.settings.text.GalleryTextOptionListActivity.a.a b = null;
        public static final int c = 0;
        public static final int d = 1;

        static {
            a.b = new com.dcinside.app.settings.text.GalleryTextOptionListActivity.a.a(null);
        }

        public a() {
            this.a = new ArrayList();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.a.size();
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemViewType(int v) {
            Object object0 = this.a.get(v);
            L.o(object0, "get(...)");
            return object0 instanceof Integer ? ((Number)object0).intValue() : 1;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
            L.p(recyclerView$ViewHolder0, "h");
            if(recyclerView$ViewHolder0 instanceof d) {
                Object object0 = this.v(v);
                L.n(object0, "null cannot be cast to non-null type com.dcinside.app.realm.GalleryOptions");
                ((d)recyclerView$ViewHolder0).f().setText(((o)object0).R5());
                ((d)recyclerView$ViewHolder0).e().setVisibility((L.g(((o)object0).Q5(), "__DC_GLOBAL_DEF_IMAGE_ID") ? 0 : 8));
            }
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        @l
        public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            if(v == 0) {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01DA, viewGroup0, false);  // layout:view_gallery_text_option_guide
                L.o(view0, "inflate(...)");
                return new c(view0);
            }
            View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01DB, viewGroup0, false);  // layout:view_gallery_text_option_item
            L.o(view1, "inflate(...)");
            return new d(view1);
        }

        @l
        public final Object v(int v) {
            Object object0 = this.a.get(v);
            L.o(object0, "get(...)");
            return object0;
        }

        public final void w(@l List list0) {
            L.p(list0, "list");
            this.a.clear();
            this.a.add(0);
            this.a.addAll(list0);
            this.notifyDataSetChanged();
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        public final void a(@l Context context0) {
            L.p(context0, "context");
            context0.startActivity(new Intent(context0, GalleryTextOptionListActivity.class));
        }
    }

    public static final class c extends ViewHolder {
        public c(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
        }
    }

    public static final class d extends ViewHolder {
        @l
        private final TextView a;
        @l
        private final View b;

        public d(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            View view1 = view0.findViewById(0x7F0B0505);  // id:gallery_text_option_item_text
            L.o(view1, "findViewById(...)");
            this.a = (TextView)view1;
            View view2 = view0.findViewById(0x7F0B0504);  // id:gallery_text_option_item_first_flag
            L.o(view2, "findViewById(...)");
            this.b = view2;
        }

        @l
        public final View e() {
            return this.b;
        }

        @l
        public final TextView f() {
            return this.a;
        }
    }

    public static final class e implements Comparator {
        public int b(@m o o0, @m o o1) {
            if(o0 == null) {
                return o1 == null ? 0 : -1;
            }
            if(o1 != null) {
                if(L.g(o0.Q5(), "__DC_GLOBAL_DEF_IMAGE_ID")) {
                    return -1;
                }
                if(!L.g(o1.Q5(), "__DC_GLOBAL_DEF_IMAGE_ID")) {
                    if(o0.T5() <= o1.T5()) {
                        return o0.T5() < o1.T5() ? 1 : 0;
                    }
                    return -1;
                }
            }
            return 1;
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((o)object0), ((o)object1));
        }
    }

    private n0 w;
    @m
    private I0 x;
    @m
    private g1 y;
    @l
    public static final b z;

    static {
        GalleryTextOptionListActivity.z = new b(null);
    }

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.M1(((g1)object0));
    }

    public void M1(@l g1 g10) {
        @f(c = "com.dcinside.app.settings.text.GalleryTextOptionListActivity$onChange$2", f = "GalleryTextOptionListActivity.kt", i = {}, l = {0x74}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.text.GalleryTextOptionListActivity.f extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final boolean l;
            final List m;
            final GalleryTextOptionListActivity n;

            com.dcinside.app.settings.text.GalleryTextOptionListActivity.f(boolean z, List list0, GalleryTextOptionListActivity galleryTextOptionListActivity0, kotlin.coroutines.d d0) {
                this.l = z;
                this.m = list0;
                this.n = galleryTextOptionListActivity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.text.GalleryTextOptionListActivity.f(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.settings.text.GalleryTextOptionListActivity.f)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.settings.text.GalleryTextOptionListActivity$onChange$2$1", f = "GalleryTextOptionListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nGalleryTextOptionListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryTextOptionListActivity.kt\ncom/dcinside/app/settings/text/GalleryTextOptionListActivity$onChange$2$1\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,223:1\n25#2:224\n*S KotlinDebug\n*F\n+ 1 GalleryTextOptionListActivity.kt\ncom/dcinside/app/settings/text/GalleryTextOptionListActivity$onChange$2$1\n*L\n117#1:224\n*E\n"})
                static final class com.dcinside.app.settings.text.GalleryTextOptionListActivity.f.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final GalleryTextOptionListActivity l;
                    final List m;

                    com.dcinside.app.settings.text.GalleryTextOptionListActivity.f.a(GalleryTextOptionListActivity galleryTextOptionListActivity0, List list0, kotlin.coroutines.d d0) {
                        this.l = galleryTextOptionListActivity0;
                        this.m = list0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.settings.text.GalleryTextOptionListActivity.f.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.settings.text.GalleryTextOptionListActivity.f.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        n0 n00 = this.l.w;
                        Adapter recyclerView$Adapter0 = null;
                        if(n00 == null) {
                            L.S("binding");
                            n00 = null;
                        }
                        L.o(n00.e, "defImgListSettingRecycler");
                        Adapter recyclerView$Adapter1 = n00.e.getAdapter();
                        if(recyclerView$Adapter1 instanceof a) {
                            recyclerView$Adapter0 = recyclerView$Adapter1;
                        }
                        if(((a)recyclerView$Adapter0) != null) {
                            ((a)recyclerView$Adapter0).w(this.m);
                        }
                        return S0.a;
                    }
                }

                List list0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        if(this.l) {
                            list0 = this.m;
                        }
                        else {
                            L.o("기본", "getString(...)");
                            list0 = u.S(new o[]{com.dcinside.app.realm.o.a.g(o.h, "__DC_GLOBAL_DEF_IMAGE_ID", "기본", false, 4, null)});
                            L.m(this.m);
                            list0.addAll(this.m);
                        }
                        L.m(list0);
                        List list1 = u.u5(list0, new e());
                        com.dcinside.app.settings.text.GalleryTextOptionListActivity.f.a galleryTextOptionListActivity$f$a0 = new com.dcinside.app.settings.text.GalleryTextOptionListActivity.f.a(this.n, list1, null);
                        this.k = 1;
                        return i.h(h0.e(), galleryTextOptionListActivity$f$a0, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(g10, "results");
        List list0 = g10.h().g2(g10);
        boolean z = g10.x4().i0("galleryId", "__DC_GLOBAL_DEF_IMAGE_ID").r0() != null;
        I0 i00 = this.x;
        if(i00 != null) {
            try {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            catch(Exception unused_ex) {
            }
        }
        this.x = k.f(LifecycleOwnerKt.a(this), h0.a(), null, new com.dcinside.app.settings.text.GalleryTextOptionListActivity.f(z, list0, this, null), 2, null);
    }

    // 检测为 Lambda 实现
    private static final boolean N1(GalleryTextOptionListActivity galleryTextOptionListActivity0, View view0, int v) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        n0 n00 = n0.c(this.getLayoutInflater());
        L.o(n00, "inflate(...)");
        this.w = n00;
        n0 n01 = null;
        if(n00 == null) {
            L.S("binding");
            n00 = null;
        }
        this.setContentView(n00.b());
        n0 n02 = this.w;
        if(n02 == null) {
            L.S("binding");
            n02 = null;
        }
        this.S0(n02.f);
        kr.bhbfhfb.designcompat.a.d(this);
        F0 f00 = this.F1();
        if(f00 == null) {
            this.finish();
            return;
        }
        n0 n03 = this.w;
        if(n03 == null) {
            L.S("binding");
        }
        else {
            n01 = n03;
        }
        L.o(n01.e, "defImgListSettingRecycler");
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        n01.e.setLayoutManager(nonPredictiveLayoutManager0);
        n0.d d0 = new n0.d(this);
        n01.e.addItemDecoration(d0);
        a galleryTextOptionListActivity$a0 = new a();
        n01.e.setAdapter(galleryTextOptionListActivity$a0);
        com.dcinside.app.settings.text.a a0 = (View view0, int v) -> {
            L.p(this, "this$0");
            n0 n00 = this.w;
            Adapter recyclerView$Adapter0 = null;
            if(n00 == null) {
                L.S("binding");
                n00 = null;
            }
            L.o(n00.e, "defImgListSettingRecycler");
            Adapter recyclerView$Adapter1 = n00.e.getAdapter();
            if(recyclerView$Adapter1 instanceof a) {
                recyclerView$Adapter0 = recyclerView$Adapter1;
            }
            if(((a)recyclerView$Adapter0) == null) {
                return false;
            }
            Object object0 = ((a)recyclerView$Adapter0).v(v);
            if(object0 instanceof o) {
                String s = ((o)object0).Q5();
                String s1 = ((o)object0).R5();
                if(s != null && s1 != null) {
                    GalleryTextOptionSettingActivity.F.a(this, s, s1);
                }
            }
            return true;
        };
        com.dcinside.app.util.ql.b.e(n01.e, a0);
        RealmQuery realmQuery0 = f00.C4(o.class);
        L.o(realmQuery0, "this.where(T::class.java)");
        g1 g10 = realmQuery0.f1("textOption").p0();
        this.y = g10;
        g10.l(this);
        L.o(g10, "also(...)");
        this.M1(g10);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        I0 i00 = this.x;
        if(i00 != null) {
            try {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            catch(Exception unused_ex) {
            }
        }
        this.x = null;
        if(this.y != null && this.y.s()) {
            g1 g10 = this.y;
            if(g10 != null) {
                g10.D();
            }
            this.y = null;
        }
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

