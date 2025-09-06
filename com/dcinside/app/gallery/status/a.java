package com.dcinside.app.gallery.status;

import A3.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.bookmark.K;
import com.dcinside.app.bookmark.v;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.D;
import com.dcinside.app.type.n;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.vk;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nGalleryStatusAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryStatusAdapter.kt\ncom/dcinside/app/gallery/status/GalleryStatusAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,342:1\n257#2,2:343\n176#2,2:345\n774#3:347\n865#3,2:348\n1053#3:350\n774#3:351\n865#3,2:352\n1053#3:354\n774#3:355\n865#3,2:356\n1053#3:358\n774#3:359\n865#3,2:360\n1053#3:362\n1863#3,2:363\n1053#3:365\n1863#3,2:366\n1053#3:368\n1863#3,2:369\n1053#3:371\n1863#3,2:372\n*S KotlinDebug\n*F\n+ 1 GalleryStatusAdapter.kt\ncom/dcinside/app/gallery/status/GalleryStatusAdapter\n*L\n146#1:343,2\n156#1:345,2\n207#1:347\n207#1:348,2\n208#1:350\n211#1:351\n211#1:352,2\n212#1:354\n215#1:355\n215#1:356,2\n216#1:358\n219#1:359\n219#1:360,2\n220#1:362\n229#1:363,2\n247#1:365\n247#1:366,2\n253#1:368\n253#1:369,2\n259#1:371\n259#1:372,2\n*E\n"})
public final class a extends Adapter {
    public static final class com.dcinside.app.gallery.status.a.a {
        private com.dcinside.app.gallery.status.a.a() {
        }

        public com.dcinside.app.gallery.status.a.a(w w0) {
        }
    }

    static final class b {
        @m
        private final com.dcinside.app.type.m a;
        @m
        private final n b;

        public b(@m com.dcinside.app.type.m m0, @m n n0) {
            this.a = m0;
            this.b = n0;
        }

        @m
        public final com.dcinside.app.type.m a() {
            return this.a;
        }

        @m
        public final n b() {
            return this.b;
        }

        @l
        public final b c(@m com.dcinside.app.type.m m0, @m n n0) {
            return new b(m0, n0);
        }

        public static b d(b a$b0, com.dcinside.app.type.m m0, n n0, int v, Object object0) {
            if((v & 1) != 0) {
                m0 = a$b0.a;
            }
            if((v & 2) != 0) {
                n0 = a$b0.b;
            }
            return a$b0.c(m0, n0);
        }

        @m
        public final com.dcinside.app.type.m e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            return this.a == ((b)object0).a ? this.b == ((b)object0).b : false;
        }

        @m
        public final n f() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            n n0 = this.b;
            if(n0 != null) {
                v = n0.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "GalleryGradeStatus(grade=" + this.a + ", managerStatus=" + this.b + ")";
        }
    }

    static final class c {
        private final int a;
        @m
        private final String b;
        @m
        private final String c;
        @m
        private final d d;
        @m
        private final b e;
        private final boolean f;
        @l
        private final String g;

        public c(int v, @m String s, @m String s1, @m d a$d0, @m b a$b0, boolean z, @l String s2) {
            L.p(s2, "transferNo");
            super();
            this.a = v;
            this.b = s;
            this.c = s1;
            this.d = a$d0;
            this.e = a$b0;
            this.f = z;
            this.g = s2;
        }

        public c(int v, String s, String s1, d a$d0, b a$b0, boolean z, String s2, int v1, w w0) {
            this(v, s, s1, a$d0, a$b0, ((v1 & 0x20) == 0 ? z : false), ((v1 & 0x40) == 0 ? s2 : ""));
        }

        public final int a() {
            return this.a;
        }

        @m
        public final String b() {
            return this.b;
        }

        @m
        public final String c() {
            return this.c;
        }

        @m
        public final d d() {
            return this.d;
        }

        @m
        public final b e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof c)) {
                return false;
            }
            if(this.a != ((c)object0).a) {
                return false;
            }
            if(!L.g(this.b, ((c)object0).b)) {
                return false;
            }
            if(!L.g(this.c, ((c)object0).c)) {
                return false;
            }
            if(this.d != ((c)object0).d) {
                return false;
            }
            if(!L.g(this.e, ((c)object0).e)) {
                return false;
            }
            return this.f == ((c)object0).f ? L.g(this.g, ((c)object0).g) : false;
        }

        public final boolean f() {
            return this.f;
        }

        @l
        public final String g() {
            return this.g;
        }

        @l
        public final c h(int v, @m String s, @m String s1, @m d a$d0, @m b a$b0, boolean z, @l String s2) {
            L.p(s2, "transferNo");
            return new c(v, s, s1, a$d0, a$b0, z, s2);
        }

        @Override
        public int hashCode() {
            int v = this.a * 0x1F;
            int v1 = 0;
            int v2 = this.b == null ? 0 : this.b.hashCode();
            int v3 = this.c == null ? 0 : this.c.hashCode();
            int v4 = this.d == null ? 0 : this.d.hashCode();
            b a$b0 = this.e;
            if(a$b0 != null) {
                v1 = a$b0.hashCode();
            }
            return (((((v + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1) * 0x1F + androidx.compose.foundation.c.a(this.f)) * 0x1F + this.g.hashCode();
        }

        public static c i(c a$c0, int v, String s, String s1, d a$d0, b a$b0, boolean z, String s2, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = a$c0.a;
            }
            if((v1 & 2) != 0) {
                s = a$c0.b;
            }
            if((v1 & 4) != 0) {
                s1 = a$c0.c;
            }
            if((v1 & 8) != 0) {
                a$d0 = a$c0.d;
            }
            if((v1 & 16) != 0) {
                a$b0 = a$c0.e;
            }
            if((v1 & 0x20) != 0) {
                z = a$c0.f;
            }
            if((v1 & 0x40) != 0) {
                s2 = a$c0.g;
            }
            return a$c0.h(v, s, s1, a$d0, a$b0, z, s2);
        }

        @m
        public final b j() {
            return this.e;
        }

        @m
        public final String k() {
            return this.c;
        }

        @m
        public final String l() {
            return this.b;
        }

        @m
        public final d m() {
            return this.d;
        }

        @l
        public final String n() {
            return this.g;
        }

        public final int o() {
            return this.a;
        }

        public final boolean p() {
            return this.f;
        }

        @Override
        @l
        public String toString() {
            return "GalleryViewData(viewType=" + this.a + ", gallName=" + this.b + ", gallId=" + this.c + ", memberStatus=" + this.d + ", gallGradeStatus=" + this.e + ", isPrivate=" + this.f + ", transferNo=" + this.g + ")";
        }
    }

    public static enum d {
        MEMBER,
        REQUEST_JOINED,
        WITHDRAWAL;

        private static final d[] d;
        private static final kotlin.enums.a e;

        static {
            d.d = arr_a$d;
            L.p(arr_a$d, "entries");
            d.e = new kotlin.enums.d(arr_a$d);
        }

        private static final d[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return d.e;
        }
    }

    public final class e {
        public static final int[] a;
        public static final int[] b;

        static {
            int[] arr_v = new int[d.values().length];
            try {
                arr_v[d.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[d.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            e.a = arr_v;
            int[] arr_v1 = new int[n.values().length];
            try {
                arr_v1[n.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[n.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[n.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[n.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            e.b = arr_v1;
        }
    }

    @l
    private ArrayList a;
    @m
    private v b;
    @l
    private final K c;
    @l
    public static final com.dcinside.app.gallery.status.a.a d = null;
    private static final int e = 1;
    private static final int f = 2;

    static {
        a.d = new com.dcinside.app.gallery.status.a.a(null);
    }

    public a() {
        public static final class j implements K {
            final a a;

            j(a a0) {
                this.a = a0;
                super();
            }

            @Override  // com.dcinside.app.bookmark.K
            public void n(@l v v0, int v1, @m List list0) {
                L.p(v0, "favoriteBasket");
                this.a.F();
            }
        }

        this.a = new ArrayList();
        this.c = new j(this);
    }

    private final void A(u u0, c a$c0) {
        @f(c = "com.dcinside.app.gallery.status.GalleryStatusAdapter$bindMiniViewHolder$3$1", f = "GalleryStatusAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends o implements p {
            int k;
            final a l;
            final Context m;
            final String n;
            final String o;

            h(a a0, Context context0, String s, String s1, kotlin.coroutines.d d0) {
                this.l = a0;
                this.m = context0;
                this.n = s;
                this.o = s1;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new h(this.l, this.m, this.n, this.o, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$context");
                this.l.E(this.m, this.n, this.o);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.status.GalleryStatusAdapter$bindMiniViewHolder$4", f = "GalleryStatusAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends o implements p {
            int k;
            final a l;
            final Context m;
            final String n;

            i(a a0, Context context0, String s, kotlin.coroutines.d d0) {
                this.l = a0;
                this.m = context0;
                this.n = s;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new i(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$context");
                this.l.G(this.m, this.n);
                return S0.a;
            }
        }

        Context context0 = u0.itemView.getContext();
        String s = a$c0.k();
        String s1 = a$c0.l();
        u0.h().setVisibility((a$c0.p() ? 0 : 8));
        TextView textView0 = u0.f();
        textView0.setText(s1);
        if(a$c0.m() == d.c) {
            L.m(context0);
            textView0.setTextColor(vk.b(context0, 0x7F04032A));  // attr:icTintNormal
        }
        else {
            L.m(context0);
            textView0.setTextColor(vk.b(context0, 0x1010036));
        }
        TextView textView1 = u0.i();
        d a$d0 = a$c0.m();
        switch((a$d0 == null ? -1 : e.a[a$d0.ordinal()])) {
            case 1: {
                textView1.setVisibility(0);
                textView1.setText("[승인 대기]");
                textView1.setTextColor(vk.b(context0, 0x7F04015E));  // attr:colorPrimaryLight
                break;
            }
            case 2: {
                textView1.setVisibility(0);
                textView1.setText("[탈퇴]");
                textView1.setTextColor(vk.b(context0, 0x7F04032A));  // attr:icTintNormal
                break;
            }
            default: {
                textView1.setVisibility(8);
            }
        }
        ImageView imageView0 = u0.e();
        if(this.b == null || !this.b.t(s)) {
            imageView0.setImageResource(0x7F08035A);  // drawable:ico_star
            ColorStateList colorStateList0 = ColorStateList.valueOf(ContextCompat.getColor(context0, 0x7F060129));  // color:grey1
            L.o(colorStateList0, "valueOf(...)");
            vk.n(colorStateList0, new View[]{imageView0});
        }
        else {
            imageView0.setImageResource(0x7F08035B);  // drawable:ico_star_filled
            vk.h(0x7F0402BF, new View[]{imageView0});  // attr:favorIconFilledBgColor
        }
        r.M(imageView0, null, new h(this, context0, s1, s, null), 1, null);
        L.o(u0.itemView, "itemView");
        i a$i0 = new i(this, context0, s, null);
        r.M(u0.itemView, null, a$i0, 1, null);
    }

    @m
    public final String B(int v) {
        c a$c0 = (c)kotlin.collections.u.W2(this.a, v);
        if(a$c0 == null) {
            return null;
        }
        b a$b0 = a$c0.j();
        return (a$b0 == null ? null : a$b0.f()) == n.d ? null : a$c0.k();
    }

    private final c C(int v, com.dcinside.app.model.w w0, d a$d0, b a$b0, boolean z, String s) {
        return new c(v, w0.b(), w0.a(), a$d0, a$b0, z, s);
    }

    static c D(a a0, int v, com.dcinside.app.model.w w0, d a$d0, b a$b0, boolean z, String s, int v1, Object object0) {
        if((v1 & 0x20) != 0) {
            s = "";
        }
        return a0.C(v, w0, a$d0, a$b0, z, s);
    }

    private final void E(Context context0, String s, String s1) {
        v v0 = this.b;
        if(v0 != null) {
            v0.u(context0, s, s1);
        }
    }

    private final void F() {
        this.notifyDataSetChanged();
    }

    private final void G(Context context0, String s) {
        Xk.i((context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null), s);
    }

    public final void H(@l com.dcinside.app.response.e e0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 GalleryStatusAdapter.kt\ncom/dcinside/app/gallery/status/GalleryStatusAdapter\n*L\n1#1,102:1\n208#2:103\n*E\n"})
        public static final class k implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((D)object0).b(), ((D)object1).b());
            }
        }


        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 GalleryStatusAdapter.kt\ncom/dcinside/app/gallery/status/GalleryStatusAdapter\n*L\n1#1,102:1\n212#2:103\n*E\n"})
        public static final class com.dcinside.app.gallery.status.a.l implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((D)object0).b(), ((D)object1).b());
            }
        }


        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 GalleryStatusAdapter.kt\ncom/dcinside/app/gallery/status/GalleryStatusAdapter\n*L\n1#1,102:1\n216#2:103\n*E\n"})
        public static final class com.dcinside.app.gallery.status.a.m implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((D)object0).b(), ((D)object1).b());
            }
        }


        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 GalleryStatusAdapter.kt\ncom/dcinside/app/gallery/status/GalleryStatusAdapter\n*L\n1#1,102:1\n220#2:103\n*E\n"})
        public static final class com.dcinside.app.gallery.status.a.n implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((D)object0).b(), ((D)object1).b());
            }
        }

        List list7;
        List list5;
        List list3;
        List list1;
        L.p(e0, "item");
        this.a.clear();
        List list0 = e0.g();
        if(list0 == null) {
            list1 = kotlin.collections.u.H();
        }
        else {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(L.g(((D)object0).d(), "M")) {
                    arrayList0.add(object0);
                }
            }
            list1 = kotlin.collections.u.u5(arrayList0, new k());
            if(list1 == null) {
                list1 = kotlin.collections.u.H();
            }
        }
        List list2 = e0.g();
        if(list2 == null) {
            list3 = kotlin.collections.u.H();
        }
        else {
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: list2) {
                if(L.g(((D)object1).d(), "W")) {
                    arrayList1.add(object1);
                }
            }
            list3 = kotlin.collections.u.u5(arrayList1, new com.dcinside.app.gallery.status.a.l());
            if(list3 == null) {
                list3 = kotlin.collections.u.H();
            }
        }
        List list4 = e0.g();
        if(list4 == null) {
            list5 = kotlin.collections.u.H();
        }
        else {
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: list4) {
                if(L.g(((D)object2).d(), "T")) {
                    arrayList2.add(object2);
                }
            }
            list5 = kotlin.collections.u.u5(arrayList2, new com.dcinside.app.gallery.status.a.m());
            if(list5 == null) {
                list5 = kotlin.collections.u.H();
            }
        }
        List list6 = e0.g();
        if(list6 == null) {
            list7 = kotlin.collections.u.H();
        }
        else {
            ArrayList arrayList3 = new ArrayList();
            for(Object object3: list6) {
                if(L.g(((D)object3).d(), "S")) {
                    arrayList3.add(object3);
                }
            }
            list7 = kotlin.collections.u.u5(arrayList3, new com.dcinside.app.gallery.status.a.n());
            if(list7 == null) {
                list7 = kotlin.collections.u.H();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(list1);
        arrayList4.addAll(list3);
        arrayList4.addAll(list5);
        arrayList4.addAll(list7);
        for(Object object4: arrayList4) {
            V v0 = r0.a(((D)object4).c(), ((D)object4).d());
            b a$b0 = new b(((D)object4).e(((String)v0.a())), ((D)object4).f(((String)v0.b())));
            com.dcinside.app.model.w w0 = new com.dcinside.app.model.w(((D)object4).a(), ((D)object4).b(), null, null, null, 28, null);
            ArrayList arrayList5 = this.a;
            Integer integer0 = ((D)object4).h();
            arrayList5.add(this.C(2, w0, null, a$b0, integer0 != null && ((int)integer0) == 1, "xxxxxx"));
        }
        this.notifyDataSetChanged();
    }

    public final void I(@l com.dcinside.app.response.h h0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 GalleryStatusAdapter.kt\ncom/dcinside/app/gallery/status/GalleryStatusAdapter\n*L\n1#1,102:1\n247#2:103\n*E\n"})
        public static final class com.dcinside.app.gallery.status.a.o implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((com.dcinside.app.model.w)object0).b(), ((com.dcinside.app.model.w)object1).b());
            }
        }


        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 GalleryStatusAdapter.kt\ncom/dcinside/app/gallery/status/GalleryStatusAdapter\n*L\n1#1,102:1\n253#2:103\n*E\n"})
        public static final class com.dcinside.app.gallery.status.a.p implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((com.dcinside.app.model.w)object0).b(), ((com.dcinside.app.model.w)object1).b());
            }
        }


        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 GalleryStatusAdapter.kt\ncom/dcinside/app/gallery/status/GalleryStatusAdapter\n*L\n1#1,102:1\n259#2:103\n*E\n"})
        public static final class q implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((com.dcinside.app.model.w)object0).b(), ((com.dcinside.app.model.w)object1).b());
            }
        }

        L.p(h0, "items");
        this.a.clear();
        List list0 = h0.g();
        if(list0 != null) {
            List list1 = kotlin.collections.u.u5(list0, new com.dcinside.app.gallery.status.a.o());
            if(list1 != null) {
                for(Object object0: list1) {
                    ArrayList arrayList0 = this.a;
                    Integer integer0 = ((com.dcinside.app.model.w)object0).e();
                    arrayList0.add(a.D(this, 1, ((com.dcinside.app.model.w)object0), d.a, null, integer0 != null && ((int)integer0) == 1, null, 0x20, null));
                }
            }
        }
        List list2 = h0.h();
        if(list2 != null) {
            List list3 = kotlin.collections.u.u5(list2, new com.dcinside.app.gallery.status.a.p());
            if(list3 != null) {
                for(Object object1: list3) {
                    ArrayList arrayList1 = this.a;
                    Integer integer1 = ((com.dcinside.app.model.w)object1).e();
                    arrayList1.add(a.D(this, 1, ((com.dcinside.app.model.w)object1), d.b, null, integer1 != null && ((int)integer1) == 1, null, 0x20, null));
                }
            }
        }
        List list4 = h0.i();
        if(list4 != null) {
            List list5 = kotlin.collections.u.u5(list4, new q());
            if(list5 != null) {
                for(Object object2: list5) {
                    ArrayList arrayList2 = this.a;
                    Integer integer2 = ((com.dcinside.app.model.w)object2).e();
                    arrayList2.add(a.D(this, 1, ((com.dcinside.app.model.w)object2), d.c, null, integer2 != null && ((int)integer2) == 1, null, 0x20, null));
                }
            }
        }
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((c)this.a.get(v)).o();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        if(recyclerView$ViewHolder0 instanceof u) {
            this.A(((u)recyclerView$ViewHolder0), ((c)object0));
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.gallery.status.o) {
            this.z(((com.dcinside.app.gallery.status.o)recyclerView$ViewHolder0), ((c)object0));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 1: {
                View view1 = layoutInflater0.inflate(0x7F0E01F9, viewGroup0, false);  // layout:view_item_my_mini
                L.m(view1);
                return new u(view1);
            }
            case 2: {
                View view2 = layoutInflater0.inflate(0x7F0E01F6, viewGroup0, false);  // layout:view_item_managed_gallery
                L.m(view2);
                return new com.dcinside.app.gallery.status.o(view2);
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E01F9, viewGroup0, false);  // layout:view_item_my_mini
                L.m(view0);
                return new u(view0);
            }
        }
    }

    public final void release() {
        v v0 = this.b;
        if(v0 != null) {
            v0.release();
        }
        this.b = null;
    }

    public final void y() {
        v v0 = this.b;
        if(v0 != null) {
            v0.release();
        }
        this.b = new v(null, this.c);
    }

    private final void z(com.dcinside.app.gallery.status.o o0, c a$c0) {
        @f(c = "com.dcinside.app.gallery.status.GalleryStatusAdapter$bindManagedViewHolder$2", f = "GalleryStatusAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.gallery.status.a.f extends o implements p {
            int k;
            final c l;
            final com.dcinside.app.gallery.status.o m;
            final Context n;

            com.dcinside.app.gallery.status.a.f(c a$c0, com.dcinside.app.gallery.status.o o0, Context context0, kotlin.coroutines.d d0) {
                this.l = a$c0;
                this.m = o0;
                this.n = context0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.gallery.status.a.f(this.l, this.m, this.n, d0).invokeSuspend(S0.a);
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
                if(this.l.n().length() > 0) {
                    Context context0 = this.m.itemView.getContext();
                    MyGalleryStatusActivity myGalleryStatusActivity0 = context0 instanceof MyGalleryStatusActivity ? ((MyGalleryStatusActivity)context0) : null;
                    if(myGalleryStatusActivity0 == null) {
                        return S0.a;
                    }
                    L.o(this.n, "$context");
                    GalleryTransferActivity.y.a(this.n, this.l.n(), myGalleryStatusActivity0.M1());
                }
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gallery.status.GalleryStatusAdapter$bindManagedViewHolder$3", f = "GalleryStatusAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends o implements p {
            int k;
            Object l;
            final a m;
            final com.dcinside.app.gallery.status.o n;

            g(a a0, com.dcinside.app.gallery.status.o o0, kotlin.coroutines.d d0) {
                this.m = a0;
                this.n = o0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                g a$g0 = new g(this.m, this.n, d0);
                a$g0.l = view0;
                return a$g0.invokeSuspend(S0.a);
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
                Context context0 = ((View)this.l).getContext();
                AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
                if(appCompatActivity0 == null) {
                    return S0.a;
                }
                int v = this.n.getBindingAdapterPosition();
                Xk.i(appCompatActivity0, this.m.B(v));
                return S0.a;
            }
        }

        V v2;
        Context context0 = o0.itemView.getContext();
        b a$b0 = a$c0.j();
        boolean z = (a$b0 == null ? null : a$b0.e()) == com.dcinside.app.type.m.i;
        b a$b1 = a$c0.j();
        boolean z1 = (a$b1 == null ? null : a$b1.e()) == com.dcinside.app.type.m.j;
        b a$b2 = a$c0.j();
        n n0 = n.e;
        o0.l().setVisibility((!z1 || (a$b2 == null ? null : a$b2.f()) != n0 ? 8 : 0));
        o0.j().setText(a$c0.l());
        o0.k().setVisibility((a$c0.p() ? 0 : 8));
        o0.e().setVisibility((z || z1 ? 0 : 8));
        o0.e().setImageResource((z ? 0x7F080415 : 0x7F0804A8));  // drawable:mini_gall_ic
        if(z1) {
            int v = Dk.b(0x7F0703C5);  // dimen:person_icon_left_padding
            int v1 = Dk.b(0x7F0703C6);  // dimen:person_icon_padding
            o0.e().setPadding(0, v1, v1, v);
        }
        else {
            o0.e().setPadding(0, 0, 0, 0);
        }
        TextView textView0 = o0.f();
        b a$b3 = a$c0.j();
        n n1 = a$b3 == null ? null : a$b3.f();
        switch((n1 == null ? -1 : e.b[n1.ordinal()])) {
            case 1: {
                L.m(context0);
                v2 = r0.a("매니저", vk.b(context0, 0x1010036));
                textView0.setText(((CharSequence)v2.a()));
                textView0.setTextColor(((Number)v2.b()).intValue());
                break;
            }
            case 2: {
                v2 = r0.a("부매니저", ContextCompat.getColor(context0, 0x7F060129));  // color:grey1
                textView0.setText(((CharSequence)v2.a()));
                textView0.setTextColor(((Number)v2.b()).intValue());
                break;
            }
            case 3: {
                v2 = r0.a("심사중", ContextCompat.getColor(context0, 0x7F060019));  // color:accent0
                textView0.setText(((CharSequence)v2.a()));
                textView0.setTextColor(((Number)v2.b()).intValue());
                break;
            }
            case 4: {
                CharSequence charSequence0 = context0.getText(0x7F1509E8);  // string:state_gallery_in_request "요청중"
                L.m(context0);
                v2 = r0.a(charSequence0, vk.b(context0, 0x7F04012E));  // attr:colorAccent
                textView0.setText(((CharSequence)v2.a()));
                textView0.setTextColor(((Number)v2.b()).intValue());
            }
        }
        b a$b4 = a$c0.j();
        if((a$b4 == null ? null : a$b4.f()) == n0) {
            r.M(o0.i(), null, new com.dcinside.app.gallery.status.a.f(a$c0, o0, context0, null), 1, null);
            o0.h().setVisibility(0);
        }
        else {
            o0.h().setVisibility(8);
        }
        L.o(o0.itemView, "itemView");
        g a$g0 = new g(this, o0, null);
        r.M(o0.itemView, null, a$g0, 1, null);
    }
}

