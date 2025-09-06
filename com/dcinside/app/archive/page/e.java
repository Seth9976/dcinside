package com.dcinside.app.archive.page;

import A3.p;
import Y.J1;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.archive.edit.ArchiveEditActivity;
import com.dcinside.app.archive.folder.ArchiveFolderActivity;
import com.dcinside.app.base.h;
import com.dcinside.app.internal.r;
import com.dcinside.app.realm.c;
import com.dcinside.app.realm.d;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Ok;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import io.realm.F0;
import io.realm.RealmQuery;
import io.realm.T0;
import io.realm.g1;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kr.better.widget.BetterTextView;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveFragment.kt\ncom/dcinside/app/archive/page/ArchiveFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,386:1\n1#2:387\n177#3,9:388\n257#4,2:397\n257#4,2:399\n257#4,2:401\n257#4,2:403\n257#4,2:405\n257#4,2:407\n257#4,2:409\n257#4,2:411\n257#4,2:413\n257#4,2:415\n257#4,2:417\n257#4,2:419\n257#4,2:421\n257#4,2:423\n257#4,2:425\n255#4:427\n*S KotlinDebug\n*F\n+ 1 ArchiveFragment.kt\ncom/dcinside/app/archive/page/ArchiveFragment\n*L\n165#1:388,9\n184#1:397,2\n185#1:399,2\n186#1:401,2\n187#1:403,2\n188#1:405,2\n195#1:407,2\n196#1:409,2\n197#1:411,2\n198#1:413,2\n199#1:415,2\n206#1:417,2\n207#1:419,2\n208#1:421,2\n209#1:423,2\n210#1:425,2\n225#1:427\n*E\n"})
public abstract class e extends h {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private J1 b;
    private long c;
    @m
    private String d;
    @m
    private d e;
    @m
    private g1 f;
    @m
    private g1 g;
    @m
    private o h;
    private boolean i;
    private boolean j;
    private int k;
    @m
    private com.dcinside.app.span.h l;
    @m
    private String m;
    private int n;
    @l
    public static final a o = null;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;

    static {
        e.o = new a(null);
    }

    public e() {
        super(0, 1, null);
        this.c = -1L;
    }

    public final int A0() {
        return this.k;
    }

    public abstract int B0();

    @l
    public final RecyclerView C0() {
        J1 j10 = this.s0();
        L.o(j10.i, "archiveRecycler");
        return j10.i;
    }

    protected final boolean D0() {
        return this.j;
    }

    public final boolean E0() {
        Bundle bundle0 = this.getArguments();
        return bundle0 != null && bundle0.getBoolean("PostArchiveSeriesActivity.EXTRA_SERIES_INPUT_MODE");
    }

    private final void F0() {
        long v = this.k == 2 ? this.c : -1L;
        Intent intent0 = new Intent(this.requireActivity(), ArchiveEditActivity.class);
        intent0.putExtra("com.dcinside.app.extra.ARCHIVE_TYPE", this.B0());
        intent0.putExtra("com.dcinside.app.extra.ARCHIVE_FOLDER", v);
        this.startActivity(intent0);
    }

    public final void G0() {
        if(this.f != null && this.f.s()) {
            Adapter recyclerView$Adapter0 = this.s0().i.getAdapter();
            com.dcinside.app.archive.page.a a0 = recyclerView$Adapter0 instanceof com.dcinside.app.archive.page.a ? ((com.dcinside.app.archive.page.a)recyclerView$Adapter0) : null;
            if(a0 != null) {
                this.c = -1L;
                a0.G(this.m);
                this.k = 0;
                this.g = this.Q0();
                a0.E(false);
                this.a();
            }
        }
    }

    private final void H0(d d0) {
        Adapter recyclerView$Adapter0 = this.s0().i.getAdapter();
        List list0 = null;
        com.dcinside.app.archive.page.a a0 = recyclerView$Adapter0 instanceof com.dcinside.app.archive.page.a ? ((com.dcinside.app.archive.page.a)recyclerView$Adapter0) : null;
        if(a0 == null) {
            return;
        }
        try {
            list0 = this.i0().g2(d0.S5());
        }
        catch(Exception unused_ex) {
        }
        if(list0 == null) {
            list0 = u.H();
        }
        a0.D(list0);
    }

    private final boolean I0(int v) {
        Adapter recyclerView$Adapter0 = this.s0().i.getAdapter();
        com.dcinside.app.archive.page.a a0 = recyclerView$Adapter0 instanceof com.dcinside.app.archive.page.a ? ((com.dcinside.app.archive.page.a)recyclerView$Adapter0) : null;
        if(a0 != null && a0.B()) {
            this.k = 2;
            c c0 = a0.y(v);
            if(c0 != null) {
                long v1 = c0.Q5();
                String s = c0.R5();
                if(s != null) {
                    this.d = s;
                    this.c = v1;
                    this.g = this.Q0();
                    a0.E(false);
                    this.a();
                    return true;
                }
            }
        }
        return false;
    }

    private final void J0() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        L.n(fragmentActivity0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        int v = this.B0();
        ArchiveFolderActivity.D.a(((AppCompatActivity)fragmentActivity0), "folderManage", v);
    }

    public final void K0() {
        if(this.e != null && this.e.s()) {
            Adapter recyclerView$Adapter0 = this.s0().i.getAdapter();
            T0 t00 = null;
            com.dcinside.app.archive.page.a a0 = recyclerView$Adapter0 instanceof com.dcinside.app.archive.page.a ? ((com.dcinside.app.archive.page.a)recyclerView$Adapter0) : null;
            if(a0 != null) {
                this.c = -1L;
                this.k = 1;
                d d0 = this.e;
                if(d0 != null) {
                    t00 = d0.S5();
                }
                a0.D(t00);
                a0.E(true);
                this.a();
            }
        }
    }

    private final void L0(int v) {
        Bundle bundle0 = this.getArguments();
        if(bundle0 != null) {
            int v1 = bundle0.getInt("com.dcinside.app.extra.POST_INPUT_MAXIMUM_COUNT");
            J1 j10 = this.s0();
            String s = this.getString(0x7F150952, new Object[]{v, v1});  // string:series_remain_count "시리즈에 추가할 글 (%1$d/%2$d)"
            j10.l.setText(s);
        }
    }

    // 检测为 Lambda 实现
    private static final void M0(e e0, g1 g10) [...]

    // 检测为 Lambda 实现
    private static final void N0(e e0, d d0) [...]

    // 检测为 Lambda 实现
    private static final boolean O0(e e0, View view0, int v) [...]

    public final int P0(@l String s, int v) {
        com.dcinside.app.span.h h0;
        L.p(s, "search");
        Context context0 = this.getContext();
        if(context0 == null) {
            return 0;
        }
        this.n = v;
        this.m = s;
        if(TextUtils.isEmpty(s)) {
            h0 = null;
        }
        else {
            String s1 = Dl.t(this.m);
            L.o(s1, "nbsp(...)");
            h0 = new com.dcinside.app.span.h(vk.b(context0, 0x7F040514), vk.c(context0, 0x1010036), s1);  // attr:replyNameHighlight
        }
        this.l = h0;
        this.G0();
        return this.g == null ? 0 : this.g.size();
    }

    private final g1 Q0() {
        RealmQuery realmQuery0 = (RealmQuery)this.t0().invoke(this.i0());
        long v = this.c;
        if(v != -1L) {
            realmQuery0 = realmQuery0.g0("folder.key", v);
            L.o(realmQuery0, "equalTo(...)");
        }
        if(this.i) {
            if(TextUtils.isEmpty(this.m)) {
                realmQuery0 = realmQuery0.i0("galleryId", "");
                L.m(realmQuery0);
                return realmQuery0.p0();
            }
            realmQuery0 = (RealmQuery)this.w0().invoke(realmQuery0);
        }
        return realmQuery0.p0();
    }

    private final void a() {
        Adapter recyclerView$Adapter0 = this.s0().i.getAdapter();
        if(recyclerView$Adapter0 == null) {
            return;
        }
        boolean z = recyclerView$Adapter0.getItemCount() == 0;
        String s = Dl.a.format(((int)(this.f == null ? 0 : this.f.size())));
        J1 j10 = this.s0();
        String s1 = this.getString(0x7F150A5E, new Object[]{s});  // string:total_archive "전체(%s)"
        j10.m.setText(s1);
        int v = 8;
        switch(this.k) {
            case 1: {
                this.s0().m.setSelected(false);
                this.s0().f.setSelected(true);
                J1 j14 = this.s0();
                L.o(j14.b, "archiveEdit");
                j14.b.setVisibility(8);
                J1 j15 = this.s0();
                L.o(j15.d, "archiveFolderArrow");
                j15.d.setVisibility(8);
                ImageView imageView0 = this.s0().h;
                L.o(imageView0, "archiveFolderSetting");
                imageView0.setVisibility((this.E0() ? 8 : 0));
                J1 j16 = this.s0();
                L.o(j16.g, "archiveFolderSelected");
                j16.g.setVisibility(8);
                TextView textView2 = this.s0().c;
                L.o(textView2, "archiveEmpty");
                if(z) {
                    v = 0;
                }
                textView2.setVisibility(v);
                break;
            }
            case 2: {
                this.s0().m.setSelected(false);
                this.s0().f.setSelected(true);
                TextView textView3 = this.s0().b;
                L.o(textView3, "archiveEdit");
                textView3.setVisibility((this.E0() ? 8 : 0));
                J1 j17 = this.s0();
                L.o(j17.d, "archiveFolderArrow");
                j17.d.setVisibility(0);
                J1 j18 = this.s0();
                L.o(j18.h, "archiveFolderSetting");
                j18.h.setVisibility(8);
                J1 j19 = this.s0();
                L.o(j19.g, "archiveFolderSelected");
                j19.g.setVisibility(0);
                TextView textView4 = this.s0().c;
                L.o(textView4, "archiveEmpty");
                if(z) {
                    v = 0;
                }
                textView4.setVisibility(v);
                break;
            }
            default: {
                this.s0().m.setSelected(true);
                this.s0().f.setSelected(false);
                TextView textView0 = this.s0().b;
                L.o(textView0, "archiveEdit");
                textView0.setVisibility((this.E0() ? 8 : 0));
                J1 j11 = this.s0();
                L.o(j11.d, "archiveFolderArrow");
                j11.d.setVisibility(8);
                J1 j12 = this.s0();
                L.o(j12.h, "archiveFolderSetting");
                j12.h.setVisibility(8);
                J1 j13 = this.s0();
                L.o(j13.g, "archiveFolderSelected");
                j13.g.setVisibility(8);
                TextView textView1 = this.s0().c;
                L.o(textView1, "archiveEmpty");
                if(z) {
                    v = 0;
                }
                textView1.setVisibility(v);
            }
        }
        TextView textView5 = this.s0().m;
        if(textView5.isSelected()) {
            textView5.setPaintFlags(textView5.getPaintFlags() | 0x20);
        }
        else {
            textView5.setPaintFlags(textView5.getPaintFlags() & -33);
        }
        BetterTextView betterTextView0 = this.s0().f;
        TextView textView6 = this.s0().g;
        L.o(textView6, "archiveFolderSelected");
        if(textView6.getVisibility() == 0) {
            vk.h(0x7F04012E, new View[]{betterTextView0});  // attr:colorAccent
            betterTextView0.setPaintFlags(textView6.getPaintFlags() & -33);
            String s2 = this.getString(0x7F1507D3, new Object[]{Dl.a.format(((int)(this.g == null ? 0 : this.g.size())))});  // string:post_read_ip_wrapper "(%s)"
            L.o(s2, "getString(...)");
            textView6.setCompoundDrawablesWithIntrinsicBounds(null, null, this.r0(s2), null);
            textView6.setPaintFlags(textView6.getPaintFlags() | 0x20);
            textView6.setText(this.d);
        }
        else if(betterTextView0.isSelected()) {
            vk.h(0x7F04012E, new View[]{betterTextView0});  // attr:colorAccent
            betterTextView0.setPaintFlags(textView6.getPaintFlags() | 0x20);
        }
        else {
            vk.h(0x7F04032A, new View[]{betterTextView0});  // attr:icTintNormal
            betterTextView0.setPaintFlags(textView6.getPaintFlags() & -33);
        }
        recyclerView$Adapter0.notifyDataSetChanged();
    }

    @Override  // androidx.fragment.app.Fragment
    @m
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = J1.d(layoutInflater0, viewGroup0, false);
        return this.s0().b();
    }

    @Override  // com.dcinside.app.base.h
    public void onDestroyView() {
        o o0 = this.h;
        if(o0 != null) {
            o0.l();
        }
        d d0 = this.e;
        if(d0 != null) {
            if(!d0.s()) {
                d0 = null;
            }
            if(d0 != null) {
                d0.K5();
            }
        }
        this.e = null;
        g1 g10 = this.f;
        if(g10 != null) {
            if(!g10.s()) {
                g10 = null;
            }
            if(g10 != null) {
                g10.D();
            }
        }
        this.f = null;
        this.s0().i.clearOnScrollListeners();
        this.g = null;
        super.onDestroyView();
        this.b = null;
    }

    @Override  // com.dcinside.app.base.h
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        static final class b extends N implements A3.a {
            final e e;

            b(e e0) {
                this.e = e0;
                super(0);
            }

            @m
            public final g1 b() {
                return this.e.f;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.dcinside.app.archive.page.e.c extends N implements A3.a {
            final e e;

            com.dcinside.app.archive.page.e.c(e e0) {
                this.e = e0;
                super(0);
            }

            @m
            public final g1 b() {
                return this.e.g;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.dcinside.app.archive.page.e.d extends N implements Function1 {
            final e e;

            com.dcinside.app.archive.page.e.d(e e0) {
                this.e = e0;
                super(1);
            }

            public final void a(int v) {
                this.e.L0(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.archive.page.ArchiveFragment$onViewCreated$4$1", f = "ArchiveFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.page.e.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final e l;

            com.dcinside.app.archive.page.e.e(e e0, kotlin.coroutines.d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.archive.page.e.e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.G0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.archive.page.ArchiveFragment$onViewCreated$5$1", f = "ArchiveFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.page.e.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final e l;

            com.dcinside.app.archive.page.e.f(e e0, kotlin.coroutines.d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.archive.page.e.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.K0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.archive.page.ArchiveFragment$onViewCreated$6", f = "ArchiveFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final e l;

            g(e e0, kotlin.coroutines.d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new g(this.l, d0).invokeSuspend(S0.a);
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
                this.l.J0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.archive.page.ArchiveFragment$onViewCreated$7", f = "ArchiveFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.page.e.h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final e l;

            com.dcinside.app.archive.page.e.h(e e0, kotlin.coroutines.d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.archive.page.e.h(this.l, d0).invokeSuspend(S0.a);
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
                this.l.F0();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            return;
        }
        Bundle bundle1 = this.getArguments();
        this.j = bundle1 != null && bundle1.getBoolean("pick_mode");
        Bundle bundle2 = this.getArguments();
        this.i = bundle2 != null && bundle2.getBoolean("search_mode");
        this.s0().e.setVisibility((this.i ? 8 : 0));
        if(this.i) {
            J1 j10 = this.s0();
            int v = vk.b(fragmentActivity0, 0x1010038);
            j10.c.setTextColor(v);
            J1 j11 = this.s0();
            L.o(j11.c, "archiveEmpty");
            r.o0(j11.c, 0x7F1500EC);  // string:archive_search_empty "검색 결과가 없습니다."
        }
        else {
            J1 j12 = this.s0();
            L.o(j12.c, "archiveEmpty");
            r.o0(j12.c, 0x7F1507AB);  // string:post_archive_empty "보관함에 글이 없습니다."
        }
        F0 f00 = this.i0();
        this.f = ((RealmQuery)this.t0().invoke(f00)).p0();
        this.g = this.Q0();
        int v1 = this.B0();
        this.e = d.f.c(f00, v1);
        g1 g10 = this.f;
        if(g10 != null) {
            g10.l((g1 g10) -> {
                L.p(this, "this$0");
                this.a();
            });
        }
        d d0 = this.e;
        if(d0 != null) {
            d0.r5((d d0) -> {
                L.p(this, "this$0");
                L.m(d0);
                this.H0(d0);
            });
        }
        RecyclerView recyclerView0 = this.s0().i;
        recyclerView0.setLayoutManager(new NonPredictiveLayoutManager());
        com.dcinside.app.archive.page.a a0 = new com.dcinside.app.archive.page.a(new b(this), new com.dcinside.app.archive.page.e.c(this), this.v0(), this.u0(), new com.dcinside.app.archive.page.e.d(this));
        Bundle bundle3 = this.getArguments();
        a0.F((bundle3 == null ? -1 : bundle3.getInt("com.dcinside.app.extra.POST_INPUT_MAXIMUM_COUNT")));
        recyclerView0.setAdapter(a0);
        com.dcinside.app.util.ql.b.d(recyclerView0);
        com.dcinside.app.util.ql.b.e(recyclerView0, (View view0, int v) -> {
            L.p(this, "this$0");
            return this.I0(v);
        });
        J1 j13 = this.s0();
        com.dcinside.app.view.f f0 = new com.dcinside.app.view.f();
        j13.j.setViewProvider(f0);
        J1 j14 = this.s0();
        J1 j15 = this.s0();
        j14.j.setRecyclerView(j15.i);
        this.a();
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        ColorStateList colorStateList0 = Ok.d.c(context0);
        J1 j16 = this.s0();
        L.m(j16.m);
        com.dcinside.app.archive.page.e.e e$e0 = new com.dcinside.app.archive.page.e.e(this, null);
        r.M(j16.m, null, e$e0, 1, null);
        j16.m.setTextColor(colorStateList0);
        J1 j17 = this.s0();
        L.m(j17.f);
        com.dcinside.app.archive.page.e.f e$f0 = new com.dcinside.app.archive.page.e.f(this, null);
        r.M(j17.f, null, e$f0, 1, null);
        j17.f.setTextColor(colorStateList0);
        J1 j18 = this.s0();
        L.o(j18.h, "archiveFolderSetting");
        g e$g0 = new g(this, null);
        r.M(j18.h, null, e$g0, 1, null);
        J1 j19 = this.s0();
        L.o(j19.b, "archiveEdit");
        com.dcinside.app.archive.page.e.h e$h0 = new com.dcinside.app.archive.page.e.h(this, null);
        r.M(j19.b, null, e$h0, 1, null);
        if(this.E0()) {
            this.s0().b.setVisibility(8);
            this.s0().h.setVisibility(8);
            this.s0().l.setVisibility(0);
            this.L0(0);
        }
    }

    private final Drawable r0(String s) {
        Rect rect0 = new Rect();
        TextPaint textPaint0 = new TextPaint();
        textPaint0.setTextSize(this.s0().g.getTextSize() - 0.0f);
        textPaint0.getTextBounds(s, 0, s.length(), rect0);
        Drawable drawable0 = com.dcinside.app.span.m.a().o().i(this.s0().g.getTextColors().getDefaultColor()).c().f(((int)(((float)rect0.width()) + 0.5f))).h(rect0.height()).b(textPaint0.getTextSize()).j().p(s, 0);
        L.o(drawable0, "buildRect(...)");
        return drawable0;
    }

    private final J1 s0() {
        J1 j10 = this.b;
        L.m(j10);
        return j10;
    }

    @l
    public abstract Function1 t0();

    @l
    public abstract A3.o u0();

    @l
    public abstract A3.o v0();

    @l
    public abstract Function1 w0();

    @m
    public final com.dcinside.app.span.h x0() {
        return this.l;
    }

    @m
    public final String y0() {
        return this.m;
    }

    public final int z0() {
        return this.n;
    }
}

