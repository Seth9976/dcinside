package com.dcinside.app.totalsearch.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager;
import com.dcinside.app.Application;
import com.dcinside.app.ad.naver.c;
import com.dcinside.app.totalsearch.a.f;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.J;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nTotalGalleryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TotalGalleryAdapter.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,342:1\n1557#2:343\n1628#2,3:344\n1557#2:347\n1628#2,3:348\n774#2:351\n865#2,2:352\n774#2:354\n865#2,2:355\n774#2:357\n865#2,2:358\n774#2:360\n865#2,2:361\n774#2:363\n865#2,2:364\n1053#2:366\n774#2:367\n865#2,2:368\n1053#2:370\n1053#2:371\n257#3,2:372\n257#3,2:374\n257#3,2:376\n*S KotlinDebug\n*F\n+ 1 TotalGalleryAdapter.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryAdapter\n*L\n66#1:343\n66#1:344,3\n67#1:347\n67#1:348,3\n120#1:351\n120#1:352,2\n121#1:354\n121#1:355,2\n122#1:357\n122#1:358,2\n123#1:360\n123#1:361,2\n127#1:363\n127#1:364,2\n127#1:366\n128#1:367\n128#1:368,2\n128#1:370\n131#1:371\n237#1:372,2\n278#1:374,2\n279#1:376,2\n*E\n"})
public final class a extends com.codewaves.stickyheadergrid.a {
    public static final class com.dcinside.app.totalsearch.gallery.a.a {
        private com.dcinside.app.totalsearch.gallery.a.a() {
        }

        public com.dcinside.app.totalsearch.gallery.a.a(w w0) {
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[e.values().length];
            try {
                arr_v[e.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[e.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    private final boolean g;
    @m
    private List h;
    @m
    private String i;
    @m
    private com.dcinside.app.totalsearch.a j;
    @l
    private e k;
    @l
    private z l;
    @m
    private WeakReference m;
    @m
    private WeakReference n;
    @l
    public static final com.dcinside.app.totalsearch.gallery.a.a o = null;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 3;
    private static final int t = 4;
    private static final int u = 5;
    private static final int v = 6;
    private static final int w = 7;
    private static final int x = 8;

    static {
        a.o = new com.dcinside.app.totalsearch.gallery.a.a(null);
    }

    public a(@m Fragment fragment0, boolean z) {
        this.g = z;
        this.k = e.a;
        this.l = z.b;
        this.n = new WeakReference(fragment0);
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int E() {
        List list0 = this.h;
        if(list0 == null) {
            return 0;
        }
        L.m(list0);
        return list0.size();
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int G(int v) {
        List list0 = this.h;
        L.m(list0);
        return ((y)list0.get(v)).e();
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int H(int v) {
        List list0 = this.h;
        L.m(list0);
        List list1 = ((y)list0.get(v)).a();
        return list1 == null ? 0 : list1.size();
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int J(int v, int v1) {
        f a$f0;
        List list0 = this.h;
        if(list0 == null) {
            a$f0 = null;
        }
        else {
            y y0 = (y)list0.get(v);
            if(y0 == null) {
                a$f0 = null;
            }
            else {
                List list1 = y0.a();
                a$f0 = list1 == null ? null : ((f)list1.get(v1));
            }
        }
        int v2 = this.G(v);
        if(a$f0 == null) {
            return 3;
        }
        return v2 != 4 || !L.g(a$f0.e(), "P") ? 2 : 8;
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public boolean L(int v) {
        List list0 = this.h;
        if(list0 != null) {
            y y0 = (y)list0.get(v);
            if(y0 != null) {
                Integer integer0 = y0.e();
                return integer0 != null && ((int)integer0) == 4;
            }
        }
        throw new NullPointerException();
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void X(@l com.codewaves.stickyheadergrid.a.a a$a0, int v) {
        String s = "";
        int v1 = 0;
        L.p(a$a0, "viewHolder");
        if(a$a0 instanceof o) {
            List list0 = this.h;
            L.m(list0);
            y y0 = (y)list0.get(v);
            Context context0 = a$a0.itemView.getContext();
            int v2 = y0.b();
            ((o)a$a0).k().setText(y0.d());
            ((o)a$a0).i().setText(context0.getString(0x7F150A6B, new Object[]{v2}));  // string:total_search_gallery_count "%d건"
            ((o)a$a0).i().setVisibility((v2 <= 0 ? 8 : 0));
            View view0 = ((o)a$a0).j();
            if(!y0.c()) {
                v1 = 8;
            }
            view0.setVisibility(v1);
            return;
        }
        if(a$a0 instanceof C) {
            ((C)a$a0).m(this.k, this.l);
            return;
        }
        if(a$a0 instanceof d) {
            Context context1 = a$a0.itemView.getContext();
            L.m(context1);
            String s1 = String.format("#%06X", Arrays.copyOf(new Object[]{((int)(vk.b(context1, 0x7F04012E) & 0xFFFFFF))}, 1));  // attr:colorAccent
            L.o(s1, "format(...)");
            String s2 = context1.getString(0x7F150370, new Object[]{s1, this.i});  // string:format_search_gallery_empty "\"<font color=%1$s>%2$s</font>\"에 대한 검색 결과가 
                                                                                   // 없습니다."
            L.o(s2, "getString(...)");
            ((d)a$a0).h().setText(Dl.c(s2));
            return;
        }
        if(a$a0 instanceof c) {
            WeakReference weakReference0 = this.n;
            if(weakReference0 != null) {
                Fragment fragment0 = (Fragment)weakReference0.get();
                if(fragment0 != null) {
                    LifecycleOwner lifecycleOwner0 = fragment0.getViewLifecycleOwner();
                    L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
                    c.l(((c)a$a0), lifecycleOwner0, (this.i == null ? "" : this.i), null, (fragment0 instanceof com.dcinside.app.ad.naver.a ? ((com.dcinside.app.ad.naver.a)fragment0) : null), 4, null);
                    return;
                }
            }
            return;
        }
        if(a$a0 instanceof com.dcinside.app.totalsearch.holders.c) {
            String s3 = this.i;
            if(s3 != null) {
                s = s3;
            }
            ((com.dcinside.app.totalsearch.holders.c)a$a0).j(s);
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void Y(@l com.codewaves.stickyheadergrid.a.b a$b0, int v, int v1) {
        f a$f0;
        L.p(a$b0, "viewHolder");
        List list0 = this.h;
        if(list0 != null) {
            y y0 = (y)list0.get(v);
            if(y0 != null) {
                List list1 = y0.a();
                if(list1 != null) {
                    Object object0 = list1.get(v1);
                    if(((f)object0) != null) {
                        List list2 = this.h;
                        boolean z = false;
                        if(list2 != null) {
                            y y1 = (y)list2.get(v);
                            if(y1 != null && y1.f()) {
                                z = true;
                            }
                        }
                        String s = null;
                        if(a$b0 instanceof com.dcinside.app.totalsearch.gallery.b) {
                            ((com.dcinside.app.totalsearch.gallery.b)a$b0).i(((f)object0), this.i, this.g, z);
                            return;
                        }
                        if(a$b0 instanceof v) {
                            if(v1 == 0) {
                                a$f0 = null;
                            }
                            else {
                                List list3 = this.h;
                                if(list3 == null) {
                                    a$f0 = null;
                                }
                                else {
                                    y y2 = (y)list3.get(v);
                                    if(y2 == null) {
                                        a$f0 = null;
                                    }
                                    else {
                                        List list4 = y2.a();
                                        a$f0 = list4 == null ? null : ((f)list4.get(v1 - 1));
                                    }
                                }
                            }
                            if(a$f0 != null) {
                                s = a$f0.e();
                            }
                            if(!L.g(s, "P") && this.k == e.a) {
                                ((v)a$b0).i(((f)object0), this.i, this.g, true);
                                return;
                            }
                            v.j(((v)a$b0), ((f)object0), this.i, this.g, false, 8, null);
                        }
                    }
                }
            }
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    @l
    public com.codewaves.stickyheadergrid.a.a a0(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        switch(v) {
            case 0: {
                View view5 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A4, viewGroup0, false);  // layout:view_total_search_gallery_section
                L.m(view5);
                return new o(view5);
            }
            case 1: {
                LinearLayout linearLayout0 = new LinearLayout(viewGroup0.getContext());
                linearLayout0.setOrientation(1);
                linearLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return new c(linearLayout0);
            }
            case 4: {
                View view4 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A5, viewGroup0, false);  // layout:view_total_search_gallery_tab_header
                L.m(view4);
                return new C(view4);
            }
            case 5: {
                View view3 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A3, viewGroup0, false);  // layout:view_total_search_gallery_empty
                L.m(view3);
                return new d(view3);
            }
            case 6: {
                View view2 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A1, viewGroup0, false);  // layout:view_total_search_empty
                L.m(view2);
                return new x(view2);
            }
            case 7: {
                View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A0, viewGroup0, false);  // layout:view_total_search_campaign_word
                L.m(view1);
                return new com.dcinside.app.totalsearch.holders.c(view1);
            }
            default: {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A4, viewGroup0, false);  // layout:view_total_search_gallery_section
                L.m(view0);
                com.codewaves.stickyheadergrid.a.a a$a0 = new o(view0);
                L.o(a$a0.itemView, "itemView");
                a$a0.itemView.setVisibility(8);
                return a$a0;
            }
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    @l
    public com.codewaves.stickyheadergrid.a.b b0(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        switch(v) {
            case 2: {
                View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A2, viewGroup0, false);  // layout:view_total_search_gallery_content
                L.m(view1);
                return new com.dcinside.app.totalsearch.gallery.b(view1, false);
            }
            case 3: {
                View view2 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0189, viewGroup0, false);  // layout:total_search_gallery_divider
                L.m(view2);
                return new com.dcinside.app.totalsearch.gallery.c(view2);
            }
            case 8: {
                View view3 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A7, viewGroup0, false);  // layout:view_total_search_person_content
                L.m(view3);
                return new v(view3);
            }
            default: {
                View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E02A2, viewGroup0, false);  // layout:view_total_search_gallery_content
                L.m(view0);
                return new com.dcinside.app.totalsearch.gallery.b(view0, false);
            }
        }
    }

    public final void d0() {
        if(this.g) {
            this.h = new ArrayList();
            this.N();
        }
    }

    @l
    public final e e0() {
        return this.k;
    }

    @l
    public final z f0() {
        return this.l;
    }

    @m
    public final List g0() {
        return this.h;
    }

    private final boolean h0(RecyclerView recyclerView0) {
        LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = recyclerView$LayoutManager0 instanceof StickyHeaderGridLayoutManager ? ((StickyHeaderGridLayoutManager)recyclerView$LayoutManager0) : null;
        return stickyHeaderGridLayoutManager0 != null && stickyHeaderGridLayoutManager0.Q2(false) == 0;
    }

    public final void i0() {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TotalGalleryAdapter.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryAdapter\n*L\n1#1,102:1\n127#2:103\n*E\n"})
        public static final class com.dcinside.app.totalsearch.gallery.a.c implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((f)object0).p(), ((f)object1).p());
            }
        }


        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TotalGalleryAdapter.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryAdapter\n*L\n1#1,102:1\n128#2:103\n*E\n"})
        public static final class com.dcinside.app.totalsearch.gallery.a.d implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((f)object0).p(), ((f)object1).p());
            }
        }


        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 TotalGalleryAdapter.kt\ncom/dcinside/app/totalsearch/gallery/TotalGalleryAdapter\n*L\n1#1,102:1\n131#2:103\n*E\n"})
        public static final class com.dcinside.app.totalsearch.gallery.a.e implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((f)object0).p(), ((f)object1).p());
            }
        }

        List list0;
        WeakReference weakReference0 = this.m;
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                recyclerView0.getContext();
                if(!this.h0(recyclerView0)) {
                    recyclerView0.scrollToPosition(1);
                }
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(new y(1, null, 0, null, false, false, 0x30, null));
                ArrayList arrayList1 = null;
                ArrayList arrayList2 = this.j == null ? null : this.j.e();
                if(arrayList2 != null) {
                    int v = arrayList2.size();
                    L.o("갤러리", "getString(...)");
                    switch(this.k) {
                        case 1: {
                            list0 = arrayList2;
                            break;
                        }
                        case 2: {
                            list0 = new ArrayList();
                            for(Object object3: arrayList2) {
                                if(L.g(((f)object3).e(), "G")) {
                                    list0.add(object3);
                                }
                            }
                            break;
                        }
                        case 3: {
                            list0 = new ArrayList();
                            for(Object object2: arrayList2) {
                                if(L.g(((f)object2).e(), "M")) {
                                    list0.add(object2);
                                }
                            }
                            break;
                        }
                        case 4: {
                            list0 = new ArrayList();
                            for(Object object1: arrayList2) {
                                if(L.g(((f)object1).e(), "N")) {
                                    list0.add(object1);
                                }
                            }
                            break;
                        }
                        case 5: {
                            list0 = new ArrayList();
                            for(Object object0: arrayList2) {
                                if(L.g(((f)object0).e(), "P")) {
                                    list0.add(object0);
                                }
                            }
                            break;
                        }
                        default: {
                            throw new J();
                        }
                    }
                    if(this.l == z.c) {
                        if(this.k == e.a) {
                            ArrayList arrayList3 = new ArrayList();
                            for(Object object4: arrayList2) {
                                if(L.g(((f)object4).e(), "P")) {
                                    arrayList3.add(object4);
                                }
                            }
                            List list1 = u.u5(arrayList3, new com.dcinside.app.totalsearch.gallery.a.c());
                            ArrayList arrayList4 = new ArrayList();
                            for(Object object5: arrayList2) {
                                if(!L.g(((f)object5).e(), "P")) {
                                    arrayList4.add(object5);
                                }
                            }
                            list0 = u.D4(u.u5(arrayList4, new com.dcinside.app.totalsearch.gallery.a.d()), list1);
                        }
                        else {
                            list0 = u.u5(list0, new com.dcinside.app.totalsearch.gallery.a.e());
                        }
                    }
                    arrayList0.add(new y(0, "갤러리", v, null, false, false, 0x20, null));
                    arrayList0.add(new y(4, null, v, list0, false, false, 0x30, null));
                    if(list0.isEmpty()) {
                        arrayList0.add(new y(5, null, v, null, false, false, 0x20, null));
                    }
                }
                com.dcinside.app.totalsearch.a a0 = this.j;
                if(a0 != null) {
                    arrayList1 = a0.j();
                }
                if(arrayList1 != null && !arrayList1.isEmpty()) {
                    L.o("추천", "getString(...)");
                    arrayList0.add(new y(0, "추천", arrayList1.size(), arrayList1, false, true));
                }
                this.h = arrayList0;
                this.N();
            }
        }
    }

    public final void j0(@l e e0) {
        L.p(e0, "<set-?>");
        this.k = e0;
    }

    public final void k0(@l z z0) {
        L.p(z0, "<set-?>");
        this.l = z0;
    }

    public final void l0(@m String s, @l com.dcinside.app.totalsearch.a a0) {
        L.p(a0, "result");
        if(this.g && a0.d() <= 0) {
            return;
        }
        if(a0.f()) {
            this.i = s;
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(new y(7, null, 0, null, false, false, 0x30, null));
            this.h = arrayList0;
            this.N();
            return;
        }
        this.i = s;
        this.j = a0;
        this.k = e.a;
        this.l = z.b;
        Application.e.c();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = a0.e();
        if(arrayList2 != null) {
            if(!arrayList2.isEmpty()) {
                arrayList1.add(new y(1, null, 0, null, false, false, 0x30, null));
            }
            int v = this.g ? a0.d() : arrayList2.size();
            ArrayList arrayList3 = new ArrayList(u.b0(arrayList2, 10));
            for(Object object0: arrayList2) {
                arrayList3.add(Boolean.valueOf(!L.g(((f)object0).e(), "P")));
            }
            int v1 = arrayList3.size();
            ArrayList arrayList4 = new ArrayList(u.b0(arrayList2, 10));
            for(Object object1: arrayList2) {
                arrayList4.add(Boolean.valueOf(L.g(((f)object1).e(), "P")));
            }
            int v2 = arrayList4.size();
            L.o("갤러리", "getString(...)");
            if(!this.g) {
                if(!arrayList2.isEmpty()) {
                    arrayList1.add(new y(0, "갤러리", v, null, false, false, 0x20, null));
                    arrayList1.add(new y(4, null, v, arrayList2, false, false, 0x30, null));
                    if(arrayList2.isEmpty()) {
                        arrayList1.add(new y(5, null, v, null, false, false, 0x20, null));
                    }
                }
            }
            else if(!arrayList2.isEmpty()) {
                arrayList1.add(new y(0, "갤러리", v, arrayList2, v1 > 20 || v2 > 10, false, 0x20, null));
            }
        }
        ArrayList arrayList5 = a0.j();
        if(arrayList5 != null && !arrayList5.isEmpty()) {
            L.o("추천", "getString(...)");
            arrayList1.add(new y(0, "추천", (this.g ? 0 : arrayList5.size()), arrayList5, false, true));
        }
        if(!this.g && arrayList1.isEmpty()) {
            arrayList1.add(new y(6, null, 0, null, false, false, 0x20, null));
        }
        this.h = arrayList1;
        this.N();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.m = new WeakReference(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.m = null;
        WeakReference weakReference0 = this.n;
        if(weakReference0 != null) {
            weakReference0.clear();
        }
        this.n = null;
    }
}

