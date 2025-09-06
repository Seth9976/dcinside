package com.dcinside.app.gallery.search;

import Y.r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.base.g;
import com.dcinside.app.realm.w0;
import com.dcinside.app.realm.x0;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.T0;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nGalleryAllActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryAllActivity.kt\ncom/dcinside/app/gallery/search/GalleryAllActivity\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,203:1\n25#2:204\n*S KotlinDebug\n*F\n+ 1 GalleryAllActivity.kt\ncom/dcinside/app/gallery/search/GalleryAllActivity\n*L\n72#1:204\n*E\n"})
public final class GalleryAllActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0, @m Long long0) {
            L.p(context0, "context");
            Intent intent0 = new Intent(context0, GalleryAllActivity.class);
            if(long0 != null) {
                intent0.putExtra("cn", ((long)long0));
            }
            context0.startActivity(intent0);
        }
    }

    static final class b extends Adapter {
        public static final class com.dcinside.app.gallery.search.GalleryAllActivity.b.a {
            private com.dcinside.app.gallery.search.GalleryAllActivity.b.a() {
            }

            public com.dcinside.app.gallery.search.GalleryAllActivity.b.a(w w0) {
            }
        }

        @m
        private T0 a;
        @m
        private List b;
        @m
        private List c;
        @l
        private final LayoutInflater d;
        private final int e;
        @l
        public static final com.dcinside.app.gallery.search.GalleryAllActivity.b.a f = null;
        private static final int g = 0;
        private static final int h = 1;
        private static final int i = 2;

        static {
            b.f = new com.dcinside.app.gallery.search.GalleryAllActivity.b.a(null);
        }

        public b(@m g g0, @m w0 w00) {
            LayoutInflater layoutInflater0 = LayoutInflater.from(g0);
            L.o(layoutInflater0, "from(...)");
            this.d = layoutInflater0;
            if(w00 == null) {
                this.a = null;
                this.b = null;
                this.c = null;
            }
            else {
                T0 t00 = w00.Q5();
                this.a = t00;
                this.b = t00.x4().b0("isUnder", Boolean.FALSE).f2("name").p0();
                this.c = t00.x4().b0("isUnder", Boolean.TRUE).f2("name").p0();
            }
            L.m(g0);
            this.e = vk.b(g0, 0x7F0406F6);  // attr:windowBackgroundInverse
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemCount() {
            return this.b == null || this.c == null ? 0 : this.b.size() + this.c.size() + 1;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public int getItemViewType(int v) {
            List list0 = this.b;
            L.m(list0);
            int v1 = list0.size();
            if(v1 > v) {
                return 0;
            }
            return v1 == v ? 1 : 2;
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
            this.w(((c)recyclerView$ViewHolder0), v);
        }

        @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
            return this.x(viewGroup0, v);
        }

        @m
        public final x0 v(int v) {
            List list0 = this.b;
            L.m(list0);
            int v1 = list0.size();
            if(v1 > v) {
                List list1 = this.b;
                L.m(list1);
                return (x0)list1.get(v);
            }
            if(v1 == v) {
                return null;
            }
            List list2 = this.c;
            L.m(list2);
            return (x0)list2.get(v - 1 - v1);
        }

        public void w(@l c galleryAllActivity$c0, int v) {
            L.p(galleryAllActivity$c0, "holder");
            x0 x00 = this.v(v);
            if(x00 != null) {
                TextView textView0 = galleryAllActivity$c0.e();
                L.m(textView0);
                textView0.setText(x00.S5());
            }
        }

        @l
        public c x(@l ViewGroup viewGroup0, int v) {
            L.p(viewGroup0, "parent");
            View view0 = this.d.inflate(0x7F0E01D8, viewGroup0, false);  // layout:view_gallery_item
            c galleryAllActivity$c0 = new c(view0);
            switch(v) {
                case 1: {
                    TextView textView0 = galleryAllActivity$c0.e();
                    L.m(textView0);
                    textView0.setVisibility(8);
                    Context context0 = view0.getContext();
                    L.o(context0, "getContext(...)");
                    view0.setBackground(vk.e(context0, 0x7F040242));  // attr:divide_n
                    view0.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
                    return galleryAllActivity$c0;
                }
                case 2: {
                    view0.setBackgroundColor(this.e);
                    return galleryAllActivity$c0;
                }
                default: {
                    return galleryAllActivity$c0;
                }
            }
        }
    }

    public static final class c extends ViewHolder {
        @m
        private TextView a;

        public c(@m View view0) {
            L.m(view0);
            super(view0);
            TextView textView0 = (TextView)view0.findViewById(0x7F0B04D5);  // id:gallery_item_name
            this.a = textView0;
            vk.h(0x7F04032A, new View[]{textView0});  // attr:icTintNormal
        }

        @m
        public final TextView e() {
            return this.a;
        }

        public final void f(@m TextView textView0) {
            this.a = textView0;
        }
    }

    private r w;
    @l
    public static final a x = null;
    @l
    private static final String y = "cn";

    static {
        GalleryAllActivity.x = new a(null);
    }

    private final void L1(int v) {
        r r0 = this.w;
        if(r0 == null) {
            L.S("binding");
            r0 = null;
        }
        r0.c.setInfoTitle((v == 0 ? "" : String.valueOf(v)));
    }

    // 检测为 Lambda 实现
    private static final boolean M1(GalleryAllActivity galleryAllActivity0, View view0, int v) [...]

    private final void N1(int v) {
        r r0 = this.w;
        Adapter recyclerView$Adapter0 = null;
        if(r0 == null) {
            L.S("binding");
            r0 = null;
        }
        L.o(r0.b, "galleryAllRecycler");
        Adapter recyclerView$Adapter1 = r0.b.getAdapter();
        if(recyclerView$Adapter1 instanceof b) {
            recyclerView$Adapter0 = recyclerView$Adapter1;
        }
        if(((b)recyclerView$Adapter0) == null) {
            return;
        }
        x0 x00 = ((b)recyclerView$Adapter0).v(v);
        if(x00 == null) {
            return;
        }
        String s = x00.R5();
        if(s != null && s.length() != 0) {
            com.dcinside.app.main.a.j(this, x00.R5());
            return;
        }
        String s1 = x00.Q5();
        if(s1 == null) {
            return;
        }
        new com.dcinside.app.util.Xk.a(s1, 0, 0, null, true, false, false, false, false, false, null, false, null, null, 0x3FE0, null).a(this);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        w0 w00;
        super.onCreate(bundle0);
        r r0 = r.c(this.getLayoutInflater());
        L.o(r0, "inflate(...)");
        this.w = r0;
        r r1 = null;
        if(r0 == null) {
            L.S("binding");
            r0 = null;
        }
        this.setContentView(r0.b());
        r r2 = this.w;
        if(r2 == null) {
            L.S("binding");
            r2 = null;
        }
        this.S0(r2.c);
        kr.bhbfhfb.designcompat.a.d(this);
        long v = this.getIntent().getLongExtra("cn", 0L);
        F0 f00 = this.F1();
        if(f00 == null) {
            w00 = null;
        }
        else {
            RealmQuery realmQuery0 = f00.C4(w0.class);
            if(realmQuery0 == null) {
                w00 = null;
            }
            else {
                RealmQuery realmQuery1 = realmQuery0.g0("id", v);
                w00 = realmQuery1 == null ? null : ((w0)realmQuery1.r0());
            }
        }
        if(w00 == null) {
            this.finish();
            return;
        }
        kr.bhbfhfb.designcompat.a.h(this, w00.T5());
        b galleryAllActivity$b0 = new b(this, w00);
        r r3 = this.w;
        if(r3 == null) {
            L.S("binding");
            r3 = null;
        }
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager();
        r3.b.setLayoutManager(nonPredictiveLayoutManager0);
        r r4 = this.w;
        if(r4 == null) {
            L.S("binding");
            r4 = null;
        }
        r4.b.setAdapter(galleryAllActivity$b0);
        this.L1(galleryAllActivity$b0.getItemCount() - 1);
        r r5 = this.w;
        if(r5 == null) {
            L.S("binding");
        }
        else {
            r1 = r5;
        }
        o o0 = (View view0, int v) -> {
            L.p(this, "this$0");
            this.N1(v);
            return true;
        };
        com.dcinside.app.util.ql.b.e(r1.b, o0);
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
}

