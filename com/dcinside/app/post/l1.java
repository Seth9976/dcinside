package com.dcinside.app.post;

import A3.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.ad.naver.e;
import com.dcinside.app.base.i;
import com.dcinside.app.image.s;
import com.dcinside.app.internal.r;
import com.dcinside.app.post.fragments.E4;
import com.dcinside.app.post.fragments.F4;
import com.dcinside.app.post.fragments.X0;
import com.dcinside.app.post.fragments.Z0;
import com.dcinside.app.post.fragments.j;
import com.dcinside.app.realm.f0;
import com.dcinside.app.realm.v0;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.response.PostHead;
import com.dcinside.app.response.PostItem;
import com.dcinside.app.rx.bus.c0;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.span.h;
import com.dcinside.app.type.I;
import com.dcinside.app.type.t;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.zk;
import com.dcinside.app.view.ResizeTextView;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import rx.o;
import rx.subjects.b;
import y4.l;
import y4.m;

@SuppressLint({"NotifyDataSetChanged"})
@s0({"SMAP\nSearchResultAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchResultAdapter.kt\ncom/dcinside/app/post/SearchResultAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealmExtensions.kt\nio/realm/kotlin/RealmExtensionsKt\n+ 4 Runnable.kt\nkotlinx/coroutines/RunnableKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,826:1\n1#2:827\n37#3:828\n37#3:831\n13#4:829\n13#4:830\n1557#5:832\n1628#5,3:833\n257#6,2:836\n177#7,9:838\n*S KotlinDebug\n*F\n+ 1 SearchResultAdapter.kt\ncom/dcinside/app/post/SearchResultAdapter\n*L\n120#1:828\n131#1:831\n767#1:829\n794#1:830\n212#1:832\n212#1:833,3\n476#1:836,2\n742#1:838,9\n*E\n"})
public final class l1 extends a implements i, P0 {
    private final boolean f;
    private final boolean g;
    @m
    private I0 h;
    @l
    private final WeakReference i;
    @m
    private g1 j;
    @m
    private g1 k;
    @l
    private final SearchResultArchive l;
    @m
    private PostHead m;
    @l
    private final b n;
    @m
    private o o;
    @m
    private o p;
    @m
    private o q;
    @m
    private h r;
    @m
    private h s;
    @l
    private Integer[] t;
    private boolean u;
    private int v;
    @l
    private final Runnable w;
    @l
    private final Runnable x;

    public l1(@l S0 s00, boolean z, @l com.dcinside.app.type.o o0) {
        @s0({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 SearchResultAdapter.kt\ncom/dcinside/app/post/SearchResultAdapter\n*L\n1#1,14:1\n768#2,8:15\n*E\n"})
        public static final class g implements Runnable {
            final l1 a;

            public g(l1 l10) {
                this.a = l10;
                super();
            }

            @Override
            public final void run() {
                if(this.a.w() != null) {
                    try {
                        this.a.notifyDataSetChanged();
                    }
                    catch(Exception exception0) {
                        timber.log.b.a.y(exception0);
                        zk.a(exception0);
                    }
                }
            }
        }


        @s0({"SMAP\nRunnable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Runnable.kt\nkotlinx/coroutines/RunnableKt$Runnable$1\n+ 2 SearchResultAdapter.kt\ncom/dcinside/app/post/SearchResultAdapter\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n795#2,4:15\n799#2,26:20\n1#3:19\n*E\n"})
        public static final class com.dcinside.app.post.l1.h implements Runnable {
            final l1 a;

            public com.dcinside.app.post.l1.h(l1 l10) {
                this.a = l10;
                super();
            }

            @Override
            public final void run() {
                int v4;
                try {
                    WeakReference weakReference0 = this.a.w();
                    if(weakReference0 != null) {
                        RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
                        if(recyclerView0 != null) {
                            L.m(recyclerView0);
                            LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                            Integer integer0 = null;
                            LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
                            if(linearLayoutManager0 != null) {
                                Integer integer1 = linearLayoutManager0.s();
                                if(integer1.intValue() >= 0) {
                                    integer0 = integer1;
                                }
                                if(integer0 != null) {
                                    int v = (int)integer0;
                                    int v1 = Math.min(linearLayoutManager0.i(), this.a.getItemCount() - 1);
                                    int v2 = -1;
                                    if(v <= v1) {
                                        int v3 = -1;
                                        v4 = -1;
                                        while(true) {
                                            switch(this.a.getItemViewType(v)) {
                                                case 6: 
                                                case 14: {
                                                    if(v3 == -1) {
                                                        v3 = v;
                                                        v4 = v3;
                                                    }
                                                    else {
                                                        v4 = v;
                                                    }
                                                    break;
                                                label_27:
                                                    if(v3 >= 0) {
                                                        this.a.notifyItemRangeChanged(v3, v4 - v3 + 1);
                                                        v3 = -1;
                                                        v4 = -1;
                                                    }
                                                    break;
                                                }
                                                default: {
                                                    goto label_27;
                                                }
                                            }
                                            if(v == v1) {
                                                break;
                                            }
                                            ++v;
                                        }
                                        v2 = v3;
                                    }
                                    else {
                                        v4 = -1;
                                    }
                                    if(v2 >= 0) {
                                        this.a.notifyItemRangeChanged(v2, v4 - v2 + 1);
                                    }
                                }
                            }
                        }
                    }
                }
                catch(Exception exception0) {
                    timber.log.b.a.y(exception0);
                    zk.a(exception0);
                }
            }
        }

        L.p(s00, "fragment");
        L.p(o0, "galleryMode");
        super();
        this.f = z;
        this.g = o0 == com.dcinside.app.type.o.c;
        WeakReference weakReference0 = new WeakReference(s00);
        this.i = weakReference0;
        g1 g10 = null;
        SearchResultArchive searchResultArchive0 = new SearchResultArchive(null, null, null, null, false, null, null, null, 0, null, 0, 0, 0xFFF, null);
        this.l = searchResultArchive0;
        b b0 = b.C7();
        L.o(b0, "create(...)");
        this.n = b0;
        Context context0 = s00.getContext();
        Integer integer0 = context0 == null ? null : vk.b(context0, 0x7F040500);  // attr:readSubjectColor0
        Context context1 = s00.getContext();
        Integer integer1 = context1 == null ? null : vk.b(context1, 0x7F040501);  // attr:readSubjectColor1
        Context context2 = s00.getContext();
        this.t = new Integer[]{integer0, integer1, null, (context2 == null ? null : vk.b(context2, 0x7F040502))};  // attr:readSubjectColor3
        b0.onNext(Boolean.FALSE);
        String s = searchResultArchive0.d();
        if(s != null && s.length() > 0) {
            this.a0(s);
        }
        S0 s01 = (S0)weakReference0.get();
        if(s01 != null) {
            F0 f00 = s01.x1();
            if(f00 != null) {
                RealmQuery realmQuery0 = f00.C4(v0.class);
                L.o(realmQuery0, "this.where(T::class.java)");
                if(realmQuery0 != null) {
                    g10 = realmQuery0.p0();
                }
            }
        }
        this.k = g10;
        if(g10 != null) {
            g10.l((g1 g10) -> {
                L.p(this, "this$0");
                this.c0();
            });
        }
        this.w = new g(this);
        this.x = new com.dcinside.app.post.l1.h(this);
    }

    // 检测为 Lambda 实现
    private static final void I(l1 l10, g1 g10) [...]

    @Override  // io.realm.P0
    public void M(Object object0) {
        this.f0(((g1)object0));
    }

    public final void N(@l Context context0, @l com.dcinside.app.response.i i0, @m String s, @l I i1, boolean z) {
        L.p(context0, "context");
        L.p(i0, "response");
        L.p(i1, "searchType");
        if(i0.c().u()) {
            this.l.w(s);
            this.l.f().clear();
            SearchItem searchItem0 = new SearchItem(16);
            this.l.f().add(searchItem0);
            this.b0();
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: i0.f()) {
            arrayList0.add(new SearchItem(((PostItem)object0), (i1 == I.g ? 14 : 6)));
            linkedHashSet0.add(((PostItem)object0).C());
        }
        this.l.l().addAll(linkedHashSet0);
        if(!this.l.q() || this.l.o() != null) {
            this.O(context0, arrayList0, s, i1, z);
        }
        else {
            Dl.D(context0, 0x7F1500A8);  // string:alert_last_page "마지막 페이지입니다."
            this.O(context0, null, null, I.c, z);
        }
        this.n0(false);
    }

    private final void O(Context context0, List list0, String s, I i0, boolean z) {
        ArrayList arrayList0 = new ArrayList(this.l.f());
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                recyclerView0.removeCallbacks(this.x);
            }
        }
        String s1 = Dl.t(s);
        L.o(s1, "nbsp(...)");
        int v = vk.b(context0, 0x7F040514);  // attr:replyNameHighlight
        ColorStateList colorStateList0 = vk.c(context0, 0x1010036);
        if(i0 == I.d || i0 == I.c) {
            this.r = new h(v, colorStateList0, s1);
            this.s = null;
        }
        else if(i0 == I.f) {
            this.r = null;
            this.s = new h(v, null, s1);
        }
        else {
            this.r = i0 == I.g ? new h(v, colorStateList0, s1) : null;
            this.s = null;
        }
        ArrayList arrayList1 = new ArrayList();
        arrayList1.addAll(this.l.f());
        int v1 = arrayList1.size();
        if(v1 > 0) {
            int v2 = ((SearchItem)arrayList1.get(v1 - 1)).d();
            if(7 == v2) {
                arrayList1.remove(v1 - 1);
            }
            else if(9 == v2) {
                arrayList1.remove(v1 - 1);
            }
        }
        this.v = 0;
        if(list0 != null && !list0.isEmpty() == 1) {
            int v3 = 0;
            for(Object object0: list0) {
                int v4 = arrayList1.size();
                if(v4 % 0x1F == 0) {
                    int v5 = v4 / 0x1F + 1;
                    arrayList1.add(new SearchItem((v5 % 2 == 0 ? 1 : 0), v5));
                    if(z && !this.u) {
                        arrayList1.add(new SearchItem(30));
                        this.v = list0.size() - v3;
                    }
                    this.u = false;
                }
                arrayList1.add(((SearchItem)object0));
                ++v3;
            }
        }
        if(!this.l.q()) {
            arrayList1.add(new SearchItem(7));
        }
        else if(list0 != null) {
            arrayList1.add(new SearchItem(9));
        }
        try {
            DiffResult diffUtil$DiffResult0 = DiffUtil.b(new F4(arrayList0, arrayList1));
            L.o(diffUtil$DiffResult0, "calculateDiff(...)");
            this.l.f().clear();
            this.l.f().addAll(arrayList1);
            diffUtil$DiffResult0.e(this);
        }
        catch(Exception unused_ex) {
            this.b0();
        }
    }

    public final boolean P(@l com.dcinside.app.response.i i0, boolean z) {
        L.p(i0, "response");
        if(i0.c().u()) {
            return false;
        }
        if(this.l.q() && this.l.o() == null) {
            return false;
        }
        Iterable iterable0 = i0.f();
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(((PostItem)object0));
        }
        int v = arrayList0.size();
        if(v > 0 && z) {
            int v1 = this.l.a();
            if(1 <= v1 && v1 < 5 || 1 <= this.v && this.v < 5) {
                this.l.r(this.l.a() + v);
                return false;
            }
            ArrayList arrayList1 = new ArrayList(this.l.f());
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.l.f());
            int v2 = arrayList2.size();
            if(v2 > 0) {
                int v3 = ((SearchItem)arrayList2.get(v2 - 1)).d();
                if(7 == v3) {
                    arrayList2.remove(v2 - 1);
                }
                else if(9 == v3) {
                    arrayList2.remove(v2 - 1);
                }
            }
            arrayList2.add(new SearchItem(this.l.c() + 19));
            if(this.getItemCount() > 1) {
                this.u = true;
            }
            if(this.l.q()) {
                arrayList2.add(new SearchItem(9));
            }
            else {
                arrayList2.add(new SearchItem(7));
            }
            int v4 = this.l.c();
            if(19 > v4 + 19 || v4 + 19 >= 29) {
                this.l.s(0);
            }
            else {
                this.l.s(this.l.c() + 1);
                this.l.s(this.l.c());
            }
            try {
                DiffResult diffUtil$DiffResult0 = DiffUtil.b(new F4(arrayList1, arrayList2));
                L.o(diffUtil$DiffResult0, "calculateDiff(...)");
                this.l.f().clear();
                this.l.f().addAll(arrayList2);
                diffUtil$DiffResult0.e(this);
                this.l.r(v);
            }
            catch(Exception unused_ex) {
                this.b0();
            }
            return true;
        }
        return false;
    }

    public static boolean Q(l1 l10, com.dcinside.app.response.i i0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return l10.P(i0, z);
    }

    public final void R(@l com.dcinside.app.response.i i0, @m String s, @m String s1, @l I i1, int v, @m PostHead postHead0) {
        L.p(i0, "response");
        L.p(i1, "searchType");
        GalleryInfo galleryInfo0 = i0.c();
        this.o(v >= galleryInfo0.S());
        this.m = postHead0;
        this.l.y(v);
        this.l.A(galleryInfo0.P());
        if(!L.g(this.l.d(), s)) {
            this.a0((s == null ? "" : s));
        }
        this.l.u(s);
        this.l.x(i1);
        this.l.w(s1);
        this.l.v(galleryInfo0.s());
    }

    public static void S(l1 l10, com.dcinside.app.response.i i0, String s, String s1, I i1, int v, PostHead postHead0, int v1, Object object0) {
        if((v1 & 0x20) != 0) {
            postHead0 = null;
        }
        l10.R(i0, s, s1, i1, v, postHead0);
    }

    public final void T() {
        this.l.z(this.l.o());
    }

    public final void U() {
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                recyclerView0.removeCallbacks(this.x);
            }
        }
        try {
            this.l.y(0);
            this.l.z(null);
            this.l.A(null);
            this.l.u(null);
            this.l.v(null);
            this.l.f().clear();
            this.l.l().clear();
            SearchItem searchItem0 = new SearchItem(7);
            this.l.f().add(searchItem0);
            this.notifyDataSetChanged();
        }
        catch(Exception unused_ex) {
            this.b0();
        }
    }

    @m
    public final String V() {
        return this.l.e();
    }

    @l
    public final b W() {
        return this.n;
    }

    @l
    public final SearchItem X(int v) {
        return (SearchItem)this.l.f().get(v);
    }

    public final int Y() {
        return this.l.i();
    }

    @m
    public final String Z() {
        return this.l.m();
    }

    private final void a0(String s) {
        S0 s00 = (S0)this.i.get();
        g1 g10 = null;
        F0 f00 = s00 == null ? null : s00.x1();
        g1 g11 = this.j;
        if(g11 != null) {
            if(!g11.s()) {
                g11 = null;
            }
            if(g11 != null) {
                g11.D();
            }
        }
        if(f00 != null) {
            RealmQuery realmQuery0 = f00.C4(f0.class);
            L.o(realmQuery0, "this.where(T::class.java)");
            g10 = realmQuery0.i0("galleryId", s).p0();
        }
        this.j = g10;
        if(g10 != null) {
            g10.l(this);
        }
    }

    private final void b0() {
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                recyclerView0.removeCallbacks(this.w);
                recyclerView0.post(this.w);
            }
        }
    }

    private final void c0() {
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                if(!recyclerView0.isLayoutSuppressed()) {
                    recyclerView0.stopScroll();
                }
                recyclerView0.removeCallbacks(this.x);
                recyclerView0.post(this.x);
            }
        }
    }

    private final void d0(j j0, int v) {
        boolean z1;
        boolean z;
        v0 v00;
        Context context0 = j0.itemView.getContext();
        PostItem postItem0 = ((SearchItem)this.l.f().get(v)).c();
        L.m(postItem0);
        String s = postItem0.K();
        String s1 = postItem0.g();
        String s2 = postItem0.e();
        String s3 = "";
        if(s2 == null) {
            s2 = "";
        }
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s2);
        L.m(context0);
        Integer integer0 = null;
        Spannable spannable0 = com.dcinside.app.span.g.u(context0, null, s1);
        if(postItem0.c()) {
            z = false;
        }
        else {
            g1 g10 = this.k;
            if(g10 == null) {
                v00 = null;
            }
            else {
                if(!g10.s()) {
                    g10 = null;
                }
                if(g10 == null) {
                    v00 = null;
                }
                else {
                    RealmQuery realmQuery0 = g10.x4();
                    if(realmQuery0 == null) {
                        v00 = null;
                    }
                    else {
                        com.dcinside.app.realm.v0.a v0$a0 = v0.h;
                        String s4 = this.l.d();
                        if(s4 != null) {
                            s3 = s4;
                        }
                        RealmQuery realmQuery1 = realmQuery0.i0("key", v0$a0.a(s3, postItem0.C(), postItem0.f()));
                        v00 = realmQuery1 == null ? null : ((v0)realmQuery1.r0());
                    }
                }
            }
            z = v00 == null ? false : true;
        }
        if(!this.g || this.x() != postItem0.f() || !L.g(this.l.d(), this.y())) {
            z1 = false;
        }
        else {
            this.A(v);
            z1 = true;
        }
        j0.o(z1);
        if(z) {
            Integer[] arr_integer = this.t;
            integer0 = arr_integer[dl.a.H1()];
        }
        j0.n(postItem0.c());
        j0.f();
        if(integer0 != null) {
            ColorStateList colorStateList0 = ColorStateList.valueOf(((int)integer0));
            L.o(colorStateList0, "valueOf(...)");
            spannableStringBuilder0.setSpan(new TextAppearanceSpan(null, 0, -1, colorStateList0, null), 0, spannableStringBuilder0.length(), 33);
        }
        spannable0.setSpan(new TextAppearanceSpan(context0, vk.f(context0, 0x7F04066F)), 0, spannable0.length(), 33);  // attr:textTypeSub
        spannable0.setSpan(new RelativeSizeSpan(0.9f), 0, spannable0.length(), 33);
        spannableStringBuilder0.append(' ');
        spannableStringBuilder0.append(spannable0);
        com.dcinside.app.span.g.v(spannableStringBuilder0, this.r);
        j0.j().setText(spannableStringBuilder0);
        j0.i().setText(s);
        int v1 = postItem0.G();
        int v2 = postItem0.H();
        j0.k().setText((v2 <= 0 ? context0.getString(0x7F1507D6, new Object[]{v1}) : context0.getString(0x7F1507D7, new Object[]{v1, v2})));  // string:post_reply_count "[%d]"
    }

    private final void e0(X0 x00, int v) {
        Integer integer0;
        boolean z1;
        boolean z;
        Context context0 = x00.itemView.getContext();
        PostItem postItem0 = ((SearchItem)this.l.f().get(v)).c();
        L.m(postItem0);
        String s = this.l.d();
        if(!this.g || this.z() != postItem0.C() || !L.g(this.l.d(), this.y())) {
            z = false;
        }
        else {
            this.A(v);
            z = true;
        }
        x00.w(z);
        if(postItem0.c()) {
            z1 = false;
        }
        else {
            g1 g10 = this.j;
            if(g10 == null) {
                z1 = false;
            }
            else {
                if(!g10.s()) {
                    g10 = null;
                }
                if(g10 == null) {
                    z1 = false;
                }
                else {
                    RealmQuery realmQuery0 = g10.x4();
                    if(realmQuery0 == null) {
                        z1 = false;
                    }
                    else {
                        com.dcinside.app.realm.f0.a f0$a0 = f0.t;
                        String s1 = this.l.d();
                        if(s1 == null) {
                            s1 = "";
                        }
                        RealmQuery realmQuery1 = realmQuery0.i0("key", f0$a0.d(s1, postItem0.C()));
                        if(realmQuery1 == null) {
                            z1 = false;
                        }
                        else {
                            f0 f00 = (f0)realmQuery1.r0();
                            z1 = f00 == null || !f00.e6() ? false : true;
                        }
                    }
                }
            }
        }
        x00.t(postItem0.c());
        x00.i(postItem0.d0());
        float f = x00.x();
        o0 o00 = o0.a;
        com.dcinside.app.span.i i0 = o00.c(postItem0, f);
        if(z1) {
            Integer[] arr_integer = this.t;
            integer0 = arr_integer[dl.a.H1()];
        }
        else {
            integer0 = null;
        }
        WeakReference weakReference0 = this.w();
        RecyclerView recyclerView0 = weakReference0 == null ? null : ((RecyclerView)weakReference0.get());
        ResizeTextView resizeTextView0 = x00.n();
        L.m(context0);
        com.dcinside.app.span.i[] arr_i = o00.d(postItem0, f, context0);
        String s2 = postItem0.J();
        com.dcinside.app.span.j j0 = s2 == null || postItem0.c() || integer0 != null ? null : new com.dcinside.app.span.j(s2);
        resizeTextView0.setText(com.dcinside.app.span.g.y(resizeTextView0, null, postItem0.K(), postItem0.G(), postItem0.H(), integer0, i0, arr_i, this.r, j0, recyclerView0, postItem0.d0(), false, false, 0x3000, null));
        String s3 = postItem0.u();
        boolean z2 = L.g(s, "dcbest");
        if(z2) {
            x00.m().setText(null);
            ImageView imageView0 = x00.l();
            s.b(imageView0);
            imageView0.setVisibility(8);
        }
        else {
            x00.m().setText(com.dcinside.app.span.g.r(context0, null, postItem0.z(), s3, postItem0.v(), null, null, null, false, 0xE2, null));
            t.c.d(postItem0, x00.l());
        }
        String s4 = postItem0.N();
        x00.k().setText(com.dcinside.app.span.g.s(context0, s3, postItem0.q(), postItem0.F(), (s3 == null || s3.length() == 0) && (s4 == null || s4.length() == 0) && x00.l().getVisibility() != 0 || z2, s, s4, postItem0.i()));
        x00.o().setText(com.dcinside.app.span.g.u(context0, (z2 ? null : postItem0.m()), postItem0.g()));
    }

    public void f0(@l g1 g10) {
        L.p(g10, "postHistories");
        this.c0();
    }

    private final void g0(View view0, boolean z) {
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                S0 s00 = (S0)this.i.get();
                if(s00 == null) {
                    return;
                }
                Context context0 = Al.h(recyclerView0.getContext());
                String s = null;
                AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
                if(appCompatActivity0 == null) {
                    return;
                }
                LayoutManager recyclerView$LayoutManager0 = recyclerView0.getLayoutManager();
                LinearLayoutManager linearLayoutManager0 = recyclerView$LayoutManager0 instanceof LinearLayoutManager ? ((LinearLayoutManager)recyclerView$LayoutManager0) : null;
                if(linearLayoutManager0 == null) {
                    return;
                }
                View view1 = linearLayoutManager0.b0(view0);
                if(view1 == null) {
                    return;
                }
                int v = recyclerView0.getChildAdapterPosition(view1);
                if(v == -1) {
                    return;
                }
                SearchItem searchItem0 = this.X(v);
                PostItem postItem0 = searchItem0.c();
                L.m(postItem0);
                String s1 = this.l.d();
                if(s1 == null) {
                    return;
                }
                String s2 = this.l.g();
                int v1 = postItem0.C();
                if(postItem0.U()) {
                    s00.s2(s1, v1);
                    return;
                }
                int v2 = postItem0.f();
                if(searchItem0.d() == 14) {
                    v0.h.c(s1, v1, v2);
                }
                PostHead postHead0 = this.m;
                if(postHead0 != null) {
                    s = postHead0.i().toString();
                }
                if(this.g) {
                    new com.dcinside.app.util.Xk.a(s1, v1, v2, s2, false, false, false, false, false, z, null, z && v2 > 0, s, postItem0.t(), 0x5F0, null).a(appCompatActivity0);
                    return;
                }
                new com.dcinside.app.util.Xk.a(s1, v1, v2, s2, false, false, true, false, false, z, null, z && v2 > 0, s, postItem0.t(), 0x5B0, null).a(appCompatActivity0);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.l.f().size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((SearchItem)this.l.f().get(v)).d();
    }

    // 检测为 Lambda 实现
    private static final void h0(l1 l10, d1 d10, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void i0(Function1 function10, Object object0) [...]

    public final boolean isDone() {
        return this.l.q();
    }

    public final boolean j(int v) {
        return this.l.l().contains(v);
    }

    // 检测为 Lambda 实现
    private static final void j0(l1 l10, m1 m10, View view0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void k0(Function1 function10, Object object0) [...]

    private final void l0() {
        c0 c00 = new c0(3, null);
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                Context context0 = recyclerView0.getContext();
                if(context0 != null) {
                    c.a(context0, c00);
                }
            }
        }
    }

    private final void m0() {
        c0 c00 = new c0(2, null);
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                Context context0 = recyclerView0.getContext();
                if(context0 != null) {
                    c.a(context0, c00);
                }
            }
        }
    }

    public final void n0(boolean z) {
        this.n.onNext(Boolean.valueOf(z));
    }

    private final void o(boolean z) {
        this.l.t(z);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        String s = "";
        L.p(recyclerView$ViewHolder0, "h");
        int v1 = this.getItemViewType(v);
        switch(v1) {
            case 0: 
            case 1: {
                int v2 = ((SearchItem)this.l.f().get(v)).a();
                if(v2 == 1) {
                    ((Z0)recyclerView$ViewHolder0).k().setVisibility(8);
                    return;
                }
                Context context0 = recyclerView$ViewHolder0.itemView.getContext();
                ((Z0)recyclerView$ViewHolder0).k().setVisibility(0);
                ((Z0)recyclerView$ViewHolder0).k().setText(context0.getString(0x7F1507E2, new Object[]{v2}));  // string:post_section_text "Page %1$d"
                return;
            }
            case 6: {
                this.e0(((X0)recyclerView$ViewHolder0), v);
                return;
            }
            default: {
                if(v1 == 14) {
                    this.d0(((j)recyclerView$ViewHolder0), v);
                    return;
                }
                if(19 <= v1 && v1 < 30) {
                    S0 s00 = (S0)this.i.get();
                    if(s00 == null) {
                        return;
                    }
                    LifecycleOwner lifecycleOwner0 = s00.getViewLifecycleOwner();
                    L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
                    String s1 = this.l.g();
                    if(s1 == null) {
                        s1 = "";
                    }
                    String s2 = this.l.d();
                    if(s2 != null) {
                        s = s2;
                    }
                    ((com.dcinside.app.ad.naver.c)recyclerView$ViewHolder0).k(lifecycleOwner0, s1, s, s00);
                    return;
                }
                if(v1 == 30) {
                    S0 s01 = (S0)this.i.get();
                    if(s01 == null) {
                        return;
                    }
                    LifecycleOwner lifecycleOwner1 = s01.getViewLifecycleOwner();
                    L.o(lifecycleOwner1, "getViewLifecycleOwner(...)");
                    String s3 = this.l.g();
                    if(s3 == null) {
                        s3 = "";
                    }
                    String s4 = this.l.d();
                    if(s4 != null) {
                        s = s4;
                    }
                    ((e)recyclerView$ViewHolder0).j(lifecycleOwner1, s3, s, s01);
                    return;
                }
                if(v1 == 16) {
                    E4 e40 = recyclerView$ViewHolder0 instanceof E4 ? ((E4)recyclerView$ViewHolder0) : null;
                    if(e40 == null) {
                        return;
                    }
                    String s5 = this.l.g();
                    if(s5 != null) {
                        s = s5;
                    }
                    e40.f(s);
                }
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        @f(c = "com.dcinside.app.post.SearchResultAdapter$onCreateViewHolder$1", f = "SearchResultAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.l1.a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final l1 m;

            com.dcinside.app.post.l1.a(l1 l10, d d0) {
                this.m = l10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.post.l1.a l1$a0 = new com.dcinside.app.post.l1.a(this.m, d0);
                l1$a0.l = view0;
                return l1$a0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                this.m.g0(((View)this.l), false);
                return kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.SearchResultAdapter$onCreateViewHolder$2", f = "SearchResultAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.l1.b extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final l1 m;

            com.dcinside.app.post.l1.b(l1 l10, d d0) {
                this.m = l10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.post.l1.b l1$b0 = new com.dcinside.app.post.l1.b(this.m, d0);
                l1$b0.l = view0;
                return l1$b0.invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                this.m.g0(((View)this.l), false);
                return kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.SearchResultAdapter$onCreateViewHolder$3", f = "SearchResultAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.l1.c extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final l1 l;

            com.dcinside.app.post.l1.c(l1 l10, d d0) {
                this.l = l10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.post.l1.c(this.l, d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                this.l.l0();
                return kotlin.S0.a;
            }
        }


        static final class com.dcinside.app.post.l1.d extends N implements Function1 {
            final d1 e;

            com.dcinside.app.post.l1.d(d1 d10) {
                this.e = d10;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    this.e.h().setVisibility(0);
                    this.e.e().setVisibility(8);
                    return;
                }
                this.e.h().setVisibility(8);
                this.e.e().setVisibility(0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return kotlin.S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.SearchResultAdapter$onCreateViewHolder$5", f = "SearchResultAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.l1.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final l1 l;

            com.dcinside.app.post.l1.e(l1 l10, d d0) {
                this.l = l10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.post.l1.e(this.l, d0).invokeSuspend(kotlin.S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                this.l.m0();
                return kotlin.S0.a;
            }
        }


        static final class com.dcinside.app.post.l1.f extends N implements Function1 {
            final m1 e;

            com.dcinside.app.post.l1.f(m1 m10) {
                this.e = m10;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    this.e.f().setVisibility(0);
                    this.e.h().setVisibility(8);
                    return;
                }
                this.e.f().setVisibility(8);
                this.e.h().setVisibility(0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return kotlin.S0.a;
            }
        }

        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: 
            case 1: {
                View view0 = layoutInflater0.inflate(0x7F0E022F, viewGroup0, false);  // layout:view_post_list_item_page
                L.m(view0);
                return new Z0(view0, new Q.c(true));
            }
            case 6: {
                View view1 = layoutInflater0.inflate((this.g ? 0x7F0E0231 : 0x7F0E022E), viewGroup0, false);  // layout:view_post_list_item_split
                L.m(view1);
                ViewHolder recyclerView$ViewHolder1 = new X0(view1);
                r.M(view1, null, new com.dcinside.app.post.l1.a(this, null), 1, null);
                return recyclerView$ViewHolder1;
            }
            case 7: {
                View view3 = layoutInflater0.inflate(0x7F0E0276, viewGroup0, false);  // layout:view_search_more
                L.m(view3);
                r.M(view3, null, new com.dcinside.app.post.l1.c(this, null), 1, null);
                ViewHolder recyclerView$ViewHolder2 = new d1(view3);
                com.dcinside.app.util.ql.a.a(view3, (View view0, boolean z) -> {
                    L.p(this, "this$0");
                    L.p(((d1)recyclerView$ViewHolder2), "$holder");
                    if(z) {
                        o o0 = this.o;
                        if(o0 != null) {
                            o0.l();
                        }
                        k1 k10 = (Object object0) -> {
                            L.p(new com.dcinside.app.post.l1.d(d10), "$tmp0");
                            new com.dcinside.app.post.l1.d(d10).invoke(object0);
                        };
                        this.o = this.n.x5(k10);
                        return;
                    }
                    o o1 = this.o;
                    if(o1 != null) {
                        o1.l();
                    }
                    this.o = null;
                });
                return recyclerView$ViewHolder2;
            }
            case 9: {
                View view4 = layoutInflater0.inflate(0x7F0E027C, viewGroup0, false);  // layout:view_serpos
                L.m(view4);
                r.M(view4, null, new com.dcinside.app.post.l1.e(this, null), 1, null);
                ViewHolder recyclerView$ViewHolder3 = new m1(view4);
                vk.h(0x7F04032A, new View[]{((m1)recyclerView$ViewHolder3).e()});  // attr:icTintNormal
                com.dcinside.app.util.ql.a.a(view4, (View view0, boolean z) -> {
                    L.p(this, "this$0");
                    L.p(((m1)recyclerView$ViewHolder3), "$holder");
                    if(z) {
                        o o0 = this.p;
                        if(o0 != null) {
                            o0.l();
                        }
                        j1 j10 = (Object object0) -> {
                            L.p(new com.dcinside.app.post.l1.f(m10), "$tmp0");
                            new com.dcinside.app.post.l1.f(m10).invoke(object0);
                        };
                        this.p = this.n.x5(j10);
                        return;
                    }
                    o o1 = this.p;
                    if(o1 != null) {
                        o1.l();
                    }
                    this.p = null;
                });
                return recyclerView$ViewHolder3;
            }
            case 14: {
                View view2 = layoutInflater0.inflate(0x7F0E023F, viewGroup0, false);  // layout:view_post_search_item_reply
                L.m(view2);
                r.M(view2, null, new com.dcinside.app.post.l1.b(this, null), 1, null);
                return new j(view2);
            }
            case 16: {
                View view5 = layoutInflater0.inflate(0x7F0E0275, viewGroup0, false);  // layout:view_search_campaign_word
                L.m(view5);
                return new E4(view5);
            }
            default: {
                if(19 <= v && v < 30) {
                    LinearLayout linearLayout0 = new LinearLayout(viewGroup0.getContext());
                    linearLayout0.setOrientation(1);
                    linearLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    linearLayout0.setTag(0);
                    return new com.dcinside.app.ad.naver.c(linearLayout0);
                }
                if(v == 30) {
                    LinearLayout linearLayout1 = new LinearLayout(viewGroup0.getContext());
                    linearLayout1.setOrientation(1);
                    linearLayout1.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    linearLayout1.setTag(0);
                    return new e(linearLayout1);
                }
                ViewHolder recyclerView$ViewHolder0 = new com.dcinside.app.ad.naver.c(new LinearLayout(viewGroup0.getContext()));
                L.o(recyclerView$ViewHolder0.itemView, "itemView");
                recyclerView$ViewHolder0.itemView.setVisibility(8);
                return recyclerView$ViewHolder0;
            }
        }
    }

    @Override  // com.dcinside.app.post.a, com.dcinside.app.base.i
    public void release() {
        WeakReference weakReference0 = this.w();
        if(weakReference0 != null) {
            RecyclerView recyclerView0 = (RecyclerView)weakReference0.get();
            if(recyclerView0 != null) {
                recyclerView0.removeCallbacks(this.x);
            }
        }
        super.release();
        try {
            I0 i00 = this.h;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.h = null;
        if(this.f) {
            g1 g10 = this.j;
            if(g10 != null) {
                if(!g10.s()) {
                    g10 = null;
                }
                if(g10 != null) {
                    g10.D();
                }
            }
            g1 g11 = this.k;
            if(g11 != null) {
                if(!g11.s()) {
                    g11 = null;
                }
                if(g11 != null) {
                    g11.D();
                }
            }
        }
        this.j = null;
        this.k = null;
        this.n.d();
        o o0 = this.o;
        if(o0 != null) {
            o0.l();
        }
        this.o = null;
        o o1 = this.p;
        if(o1 != null) {
            o1.l();
        }
        this.p = null;
        o o2 = this.q;
        if(o2 != null) {
            o2.l();
        }
        this.q = null;
    }

    @Override  // com.dcinside.app.post.a
    @m
    public PostItem v(int v) {
        return ((SearchItem)this.l.f().get(v)).c();
    }
}

