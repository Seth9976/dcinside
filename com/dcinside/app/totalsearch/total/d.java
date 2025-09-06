package com.dcinside.app.totalsearch.total;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.ad.naver.c;
import com.dcinside.app.totalsearch.a.f;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nTotalMainAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalMainAdapter.kt\ncom/dcinside/app/totalsearch/total/TotalMainAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,337:1\n774#2:338\n865#2,2:339\n774#2:341\n865#2,2:342\n257#3,2:344\n*S KotlinDebug\n*F\n+ 1 TotalMainAdapter.kt\ncom/dcinside/app/totalsearch/total/TotalMainAdapter\n*L\n68#1:338\n68#1:339,2\n69#1:341\n69#1:342,2\n188#1:344,2\n*E\n"})
public final class d extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b {
        private final int a;
        private final int b;
        @m
        private final f c;
        @m
        private final List d;

        public b(int v, int v1, @m f a$f0, @m List list0) {
            this.a = v;
            this.b = v1;
            this.c = a$f0;
            this.d = list0;
        }

        public final int a() {
            return this.b;
        }

        @m
        public final List b() {
            return this.d;
        }

        @m
        public final f c() {
            return this.c;
        }

        public final int d() {
            return this.a;
        }
    }

    @l
    private final List a;
    @m
    private String b;
    @m
    private WeakReference c;
    @l
    public static final a d = null;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 6;
    public static final int l = 7;
    public static final int m = 8;
    public static final int n = 10;
    public static final int o = 11;
    public static final int p = 12;
    public static final int q = 13;
    public static final int r = 14;
    private static final int s = 5;
    private static final int t = 3;
    private static final int u = 6;
    private static final int v = 10;

    static {
        d.d = new a(null);
    }

    public d(@l Fragment fragment0) {
        L.p(fragment0, "fragment");
        super();
        this.a = new ArrayList();
        this.c = new WeakReference(fragment0);
    }

    public final boolean A(int v) {
        return this.a.size() > v + 1 && 4 == ((b)this.a.get(v + 1)).d();
    }

    public final boolean B(int v) {
        return this.a.size() > v + 1 && 8 == ((b)this.a.get(v + 1)).d();
    }

    public final void C(@l com.dcinside.app.totalsearch.a a0, @m String s) {
        L.p(a0, "totalSearch");
        this.a.clear();
        if(a0.f()) {
            b d$b0 = new b(14, 0, null, null);
            this.a.add(d$b0);
            this.b = s;
            this.notifyDataSetChanged();
            return;
        }
        this.v(a0.e(), a0.d());
        this.x(a0.h());
        this.w(a0.a());
        this.y();
        this.b = s;
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((b)this.a.get(v)).d();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "h");
        Context context0 = recyclerView$ViewHolder0.itemView.getContext();
        int v1 = ((b)this.a.get(v)).d();
    alab1:
        switch(v1) {
            case 1: {
                int v2 = ((b)this.a.get(v)).a();
                ((com.dcinside.app.totalsearch.total.b)recyclerView$ViewHolder0).f().setText(0x7F150A88);  // string:total_search_section_gallery "갤러리"
                ((com.dcinside.app.totalsearch.total.b)recyclerView$ViewHolder0).e().setText(context0.getString(0x7F150A6B, new Object[]{v2}));  // string:total_search_gallery_count "%d건"
                if(v2 > 0) {
                    ((com.dcinside.app.totalsearch.total.b)recyclerView$ViewHolder0).e().setVisibility(0);
                    return;
                }
                ((com.dcinside.app.totalsearch.total.b)recyclerView$ViewHolder0).e().setVisibility(8);
                return;
            }
            case 2: {
                f a$f1 = ((b)this.a.get(v)).c();
                b d$b0 = (b)this.a.get(v);
                if(a$f1 != null) {
                    com.dcinside.app.totalsearch.gallery.b.j(((com.dcinside.app.totalsearch.gallery.b)recyclerView$ViewHolder0), a$f1, this.b, false, false, 8, null);
                    return;
                }
                break;
            }
            case 6: {
                ((com.dcinside.app.totalsearch.total.b)recyclerView$ViewHolder0).f().setText(0x7F150A8A);  // string:total_search_section_post "게시물"
                return;
            }
            case 7: {
                f a$f0 = ((b)this.a.get(v)).c();
                L.m(a$f0);
                Dl.z(((com.dcinside.app.totalsearch.holders.a)recyclerView$ViewHolder0).a, a$f0.p(), this.b);
                Dl.y(((com.dcinside.app.totalsearch.holders.a)recyclerView$ViewHolder0).b, Dl.c(a$f0.a()), this.b);
                ((com.dcinside.app.totalsearch.holders.a)recyclerView$ViewHolder0).c.setText(a$f0.b());
                if(m0.a.a.i(a$f0.d())) {
                    ((com.dcinside.app.totalsearch.holders.a)recyclerView$ViewHolder0).e.setVisibility(8);
                    ((com.dcinside.app.totalsearch.holders.a)recyclerView$ViewHolder0).d.setVisibility(8);
                    return;
                }
                ((com.dcinside.app.totalsearch.holders.a)recyclerView$ViewHolder0).e.setVisibility(0);
                ((com.dcinside.app.totalsearch.holders.a)recyclerView$ViewHolder0).d.setVisibility(0);
                ((com.dcinside.app.totalsearch.holders.a)recyclerView$ViewHolder0).d.setText(a$f0.d());
                return;
            label_28:
                String s = "";
                switch(v1) {
                    case 10: {
                        WeakReference weakReference0 = this.c;
                        if(weakReference0 != null) {
                            Fragment fragment0 = (Fragment)weakReference0.get();
                            if(fragment0 != null) {
                                LifecycleOwner lifecycleOwner0 = fragment0.getViewLifecycleOwner();
                                L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
                                c.l(((c)recyclerView$ViewHolder0), lifecycleOwner0, (this.b == null ? "" : this.b), null, (fragment0 instanceof com.dcinside.app.ad.naver.a ? ((com.dcinside.app.ad.naver.a)fragment0) : null), 4, null);
                                return;
                            }
                        }
                        return;
                    }
                    case 11: {
                        ((com.dcinside.app.totalsearch.total.b)recyclerView$ViewHolder0).f().setText(0x7F150A8C);  // string:total_search_section_video "동영상"
                        return;
                    }
                    case 12: {
                        List list0 = ((b)this.a.get(v)).b();
                        L.m(list0);
                        ((n)recyclerView$ViewHolder0).e(list0);
                        return;
                    }
                    case 13: {
                        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.totalsearch.gallery.d) {
                            L.m(context0);
                            String s1 = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(context0, 0x7F04012E) & 0xFFFFFF))}, 1));  // attr:colorAccent
                            L.o(s1, "format(...)");
                            String s2 = context0.getString(0x7F150370, new Object[]{s1, this.b});  // string:format_search_gallery_empty "\"<font color=%1$s>%2$s</font>\"에 대한 검색 결과가 
                                                                                                   // 없습니다."
                            L.o(s2, "getString(...)");
                            ((com.dcinside.app.totalsearch.gallery.d)recyclerView$ViewHolder0).h().setText(Dl.c(s2));
                            return;
                        }
                        break alab1;
                    }
                    case 14: {
                        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.totalsearch.holders.c) {
                            String s3 = this.b;
                            if(s3 != null) {
                                s = s3;
                            }
                            ((com.dcinside.app.totalsearch.holders.c)recyclerView$ViewHolder0).j(s);
                            return;
                        }
                        break alab1;
                    }
                    default: {
                        return;
                    }
                }
            }
            default: {
                goto label_28;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: {
                View view1 = layoutInflater0.inflate(0x7F0E02A1, viewGroup0, false);  // layout:view_total_search_empty
                L.m(view1);
                return new com.dcinside.app.totalsearch.holders.b(view1);
            }
            case 2: {
                View view3 = layoutInflater0.inflate(0x7F0E02A2, viewGroup0, false);  // layout:view_total_search_gallery_content
                L.m(view3);
                return new com.dcinside.app.totalsearch.gallery.b(view3, true);
            }
            case 3: {
                return new com.dcinside.app.totalsearch.total.c(layoutInflater0.inflate(0x7F0E0189, viewGroup0, false));  // layout:total_search_gallery_divider
            }
            case 7: {
                View view4 = layoutInflater0.inflate(0x7F0E02A8, viewGroup0, false);  // layout:view_total_search_post_item
                L.m(view4);
                return new com.dcinside.app.totalsearch.holders.a(view4);
            }
            case 8: {
                return new com.dcinside.app.totalsearch.total.a(layoutInflater0.inflate(0x7F0E02A6, viewGroup0, false));  // layout:view_total_search_more_post
            }
            case 10: {
                LinearLayout linearLayout0 = new LinearLayout(viewGroup0.getContext());
                linearLayout0.setOrientation(1);
                linearLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new c(linearLayout0);
            }
            case 1: 
            case 4: 
            case 6: 
            case 11: {
                View view2 = layoutInflater0.inflate(0x7F0E02A9, viewGroup0, false);  // layout:view_total_search_section
                view2.setTag(0x7F0B0FCD, Boolean.TRUE);  // id:total_search_section_view
                L.m(view2);
                return new com.dcinside.app.totalsearch.total.b(view2);
            }
            case 12: {
                View view5 = layoutInflater0.inflate(0x7F0E02AA, viewGroup0, false);  // layout:view_total_search_total_video
                L.m(view5);
                return new n(view5);
            }
            case 13: {
                View view6 = layoutInflater0.inflate(0x7F0E02A3, viewGroup0, false);  // layout:view_total_search_gallery_empty
                L.m(view6);
                return new com.dcinside.app.totalsearch.gallery.d(view6);
            }
            case 14: {
                View view7 = layoutInflater0.inflate(0x7F0E02A0, viewGroup0, false);  // layout:view_total_search_campaign_word
                L.m(view7);
                return new com.dcinside.app.totalsearch.holders.c(view7);
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E02A8, viewGroup0, false);  // layout:view_total_search_post_item
                L.m(view0);
                ViewHolder recyclerView$ViewHolder0 = new com.dcinside.app.totalsearch.holders.a(view0);
                L.o(recyclerView$ViewHolder0.itemView, "itemView");
                recyclerView$ViewHolder0.itemView.setVisibility(8);
                return recyclerView$ViewHolder0;
            }
        }
    }

    private final void v(List list0, int v) {
        if(list0 != null && !list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(L.g(((f)object0).e(), "P")) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: list0) {
                if(!L.g(((f)object1).e(), "P")) {
                    arrayList1.add(object1);
                }
            }
            int v1 = Math.min(arrayList1.size(), 5);
            b d$b0 = new b(1, v, null, null);
            this.a.add(d$b0);
            if(v1 > 0) {
                for(int v2 = 0; v2 < v1; ++v2) {
                    b d$b1 = new b(2, 0, ((f)arrayList1.get(v2)), null);
                    this.a.add(d$b1);
                }
            }
            if(!arrayList0.isEmpty()) {
                int v3 = Math.min(arrayList0.size(), 3);
                if(v3 > 0) {
                    for(int v4 = 0; v4 < v3; ++v4) {
                        b d$b2 = new b(2, 0, ((f)arrayList0.get(v4)), null);
                        this.a.add(d$b2);
                    }
                }
            }
        }
    }

    private final void w(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            b d$b0 = new b(6, 0, null, null);
            this.a.add(d$b0);
            int v = Math.min(list0.size(), 10);
            for(int v1 = 0; v1 < v; ++v1) {
                b d$b1 = new b(7, 0, ((f)list0.get(v1)), null);
                this.a.add(d$b1);
            }
            b d$b2 = new b(8, 0, null, null);
            this.a.add(d$b2);
        }
    }

    private final void x(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            b d$b0 = new b(11, 0, null, null);
            this.a.add(d$b0);
            b d$b1 = new b(12, 0, null, list0);
            this.a.add(d$b1);
        }
    }

    private final void y() {
        if(this.a.size() <= 1) {
            b d$b0 = new b(0, 0, null, null);
            this.a.add(d$b0);
            return;
        }
        b d$b1 = new b(10, 0, null, null);
        this.a.add(0, d$b1);
    }

    @m
    public final f z(int v) {
        return ((b)this.a.get(v)).c();
    }
}

