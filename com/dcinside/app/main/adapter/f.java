package com.dcinside.app.main.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.t;
import com.dcinside.app.main.J0;
import com.dcinside.app.main.view.CrowdView;
import com.dcinside.app.model.B;
import com.dcinside.app.model.C;
import com.dcinside.app.realm.e;
import com.dcinside.app.realm.f0;
import com.dcinside.app.recent.RecentView;
import com.dcinside.app.totalsearch.TotalSearchActivity;
import com.dcinside.app.type.p;
import com.dcinside.app.type.q;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.NewGalleriesView;
import com.dcinside.app.wv.k;
import io.realm.F0;
import io.realm.P0;
import io.realm.RealmQuery;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.J;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nMainAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAdapter.kt\ncom/dcinside/app/main/adapter/MainAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,704:1\n147#2:705\n1#3:706\n774#4:707\n865#4,2:708\n1062#4:710\n1863#4,2:711\n1863#4,2:713\n774#4:715\n865#4,2:716\n1062#4:718\n1863#4,2:719\n1863#4,2:721\n1863#4,2:723\n774#4:725\n865#4,2:726\n1062#4:728\n1863#4,2:729\n*S KotlinDebug\n*F\n+ 1 MainAdapter.kt\ncom/dcinside/app/main/adapter/MainAdapter\n*L\n135#1:705\n427#1:707\n427#1:708,2\n435#1:710\n453#1:711,2\n490#1:713,2\n510#1:715\n510#1:716,2\n518#1:718\n536#1:719,2\n558#1:721,2\n587#1:723,2\n604#1:725\n604#1:726,2\n612#1:728\n631#1:729,2\n*E\n"})
public final class f extends Adapter implements com.dcinside.app.wv.f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static enum b {
        FULL,
        PRIMARY,
        SECONDARY;

        private static final b[] d;
        private static final kotlin.enums.a e;

        static {
            b.d = arr_f$b;
            L.p(arr_f$b, "entries");
            b.e = new d(arr_f$b);
        }

        private static final b[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return b.e;
        }
    }

    public final class c {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;

        static {
            int[] arr_v = new int[b.values().length];
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[b.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            c.a = arr_v;
            int[] arr_v1 = new int[p.values().length];
            try {
                arr_v1[p.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[p.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[p.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[p.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            c.b = arr_v1;
            int[] arr_v2 = new int[q.values().length];
            try {
                arr_v2[q.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[q.f.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[q.g.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            c.c = arr_v2;
        }
    }

    public static final int A = 37;
    public static final int B = 38;
    public static final int C = 39;
    public static final int D = 41;
    public static final int E = 42;
    public static final int F = 43;
    public static final int G = 44;
    public static final int H = 45;
    public static final int I = 46;
    public static final int J = 50;
    @m
    private final F0 a;
    @l
    private final b b;
    @l
    private final ArrayList c;
    @l
    private final k d;
    @l
    private t e;
    @m
    private com.dcinside.app.main.v0.b f;
    @l
    private p g;
    @l
    private q h;
    @m
    private o i;
    @l
    private Integer[] j;
    @m
    private g1 k;
    private boolean l;
    @SuppressLint({"NotifyDataSetChanged"})
    @l
    private P0 m;
    @l
    private SharedPreferences.OnSharedPreferenceChangeListener n;
    @l
    public static final a o = null;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 4;
    public static final int t = 5;
    public static final int u = 6;
    public static final int v = 7;
    public static final int w = 8;
    public static final int x = 9;
    public static final int y = 35;
    public static final int z = 36;

    static {
        f.o = new a(null);
    }

    public f(@m F0 f00, @l b f$b0) {
        L.p(f$b0, "group");
        super();
        this.a = f00;
        this.b = f$b0;
        this.c = new ArrayList();
        this.d = new k();
        g1 g10 = null;
        this.e = new t(null, 1, null);
        this.g = dl.a.J0();
        this.h = dl.a.K0();
        this.j = new Integer[]{0x7F040500, 0x7F040501, 0x1010036, 0x7F040502};  // attr:readSubjectColor0
        if(f00 != null) {
            RealmQuery realmQuery0 = f00.C4(f0.class);
            if(realmQuery0 != null) {
                g10 = realmQuery0.p0();
            }
        }
        this.k = g10;
        this.m = (g1 g10) -> {
            L.p(this, "this$0");
            this.notifyDataSetChanged();
        };
        this.n = (SharedPreferences sharedPreferences0, String s) -> {
            L.p(this, "this$0");
            if(s != null) {
                switch(s) {
                    case "lastSelectedMainDcBest": {
                        f.U(this, null, dl.a.J0(), 1, null);
                        return;
                    }
                    case "lastSelectedMainDcBestSort": {
                        f.U(this, dl.a.K0(), null, 2, null);
                        break;
                    }
                }
            }
        };
    }

    private final List A(com.dcinside.app.main.v0.a v0$a0, List list0) {
        com.dcinside.app.settings.block.d.a d$a0 = com.dcinside.app.settings.block.d.i;
        e e0 = null;
        com.dcinside.app.settings.block.d d0 = new com.dcinside.app.settings.block.d((v0$a0 == null ? null : v0$a0.e()));
        if(v0$a0 != null) {
            e0 = v0$a0.f();
        }
        List list1 = d$a0.b(list0, d0, new com.dcinside.app.settings.block.d(e0));
        boolean z = list1.isEmpty();
        this.l = !z;
        if(!z) {
            return list1;
        }
        return list0 == null ? u.H() : list0;
    }

    @l
    public final b B() {
        return this.b;
    }

    @l
    public final J0 C(int v) {
        Object object0 = this.c.get(v);
        L.o(object0, "get(...)");
        return (J0)object0;
    }

    private final int D(Context context0, B b0) {
        if(this.G(b0)) {
            Integer[] arr_integer = this.j;
            return vk.b(context0, ((int)arr_integer[dl.a.H1()]));
        }
        return vk.b(context0, 0x1010036);
    }

    @m
    public final F0 E() {
        return this.a;
    }

    // 检测为 Lambda 实现
    private static final void F(f f0, g1 g10) [...]

    private final boolean G(B b0) {
        f0 f00 = null;
        String s = f0.t.d((b0 == null ? null : b0.h()), (b0 == null ? 0 : b0.i()));
        g1 g10 = this.k;
        if(g10 != null) {
            RealmQuery realmQuery0 = g10.x4();
            if(realmQuery0 != null) {
                RealmQuery realmQuery1 = realmQuery0.i0("key", s);
                if(realmQuery1 != null) {
                    f00 = (f0)realmQuery1.r0();
                }
            }
        }
        return f00 != null;
    }

    private final List H(com.dcinside.app.main.v0.b v0$b0, p p0, q q0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 MainAdapter.kt\ncom/dcinside/app/main/adapter/MainAdapter\n*L\n1#1,121:1\n613#2,9:122\n*E\n"})
        public static final class com.dcinside.app.main.adapter.f.d implements Comparator {
            final q a;

            public com.dcinside.app.main.adapter.f.d(q q0) {
                this.a = q0;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v;
                int[] arr_v = c.c;
                switch(arr_v[this.a.ordinal()]) {
                    case 1: {
                        v = ((B)object1).g();
                        break;
                    }
                    case 2: {
                        v = ((B)object1).j();
                        break;
                    }
                    case 3: {
                        v = ((B)object1).c();
                        break;
                    }
                    default: {
                        throw new J();
                    }
                }
                Integer integer0 = v;
                switch(arr_v[this.a.ordinal()]) {
                    case 1: {
                        return kotlin.comparisons.a.l(integer0, ((B)object0).g());
                    }
                    case 2: {
                        return kotlin.comparisons.a.l(integer0, ((B)object0).j());
                    }
                    case 3: {
                        return kotlin.comparisons.a.l(integer0, ((B)object0).c());
                    }
                    default: {
                        throw new J();
                    }
                }
            }
        }

        C c0 = v0$b0.h();
        List list0 = jl.a.j();
        boolean z = Q.a.d.a(list0).isEmpty();
        List list1 = new ArrayList();
        ((ArrayList)list1).add(new J0(1));
        ((ArrayList)list1).add(new J0(2));
        if(dl.a.q2().n()) {
            ((ArrayList)list1).add(new J0(46));
        }
        int v = 0;
        L.o("추천 게시물", "getString(...)");
        ((ArrayList)list1).add(new J0(9, false));
        ((ArrayList)list1).add(new J0(44));
        ((ArrayList)list1).add(new J0(3, v0$b0.i()));
        ((ArrayList)list1).add(new J0(46));
        ((ArrayList)list1).add(new J0(35, "추천 게시물"));
        ((ArrayList)list1).add(new J0(46));
        List list2 = c0.a();
        if(list2 == null) {
            list2 = new ArrayList();
        }
        for(Object object0: list2) {
            if(v == 5) {
                if(!z) {
                    ((ArrayList)list1).add(new J0(4));
                    ((ArrayList)list1).add(new J0(46));
                }
                ((ArrayList)list1).add(new J0(6, c0.d()));
                ((ArrayList)list1).add(new J0(46));
            }
            ((ArrayList)list1).add(new J0(39, ((B)object0), null, null, 12, null));
            ((ArrayList)list1).add(new J0(46));
            ++v;
        }
        ((ArrayList)list1).add(new J0(7));
        return list1;
    }

    private final List I(com.dcinside.app.main.v0.b v0$b0, p p0, q q0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 MainAdapter.kt\ncom/dcinside/app/main/adapter/MainAdapter\n*L\n1#1,121:1\n436#2,9:122\n*E\n"})
        public static final class com.dcinside.app.main.adapter.f.e implements Comparator {
            final q a;

            public com.dcinside.app.main.adapter.f.e(q q0) {
                this.a = q0;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v;
                int[] arr_v = c.c;
                switch(arr_v[this.a.ordinal()]) {
                    case 1: {
                        v = ((B)object1).g();
                        break;
                    }
                    case 2: {
                        v = ((B)object1).j();
                        break;
                    }
                    case 3: {
                        v = ((B)object1).c();
                        break;
                    }
                    default: {
                        throw new J();
                    }
                }
                Integer integer0 = v;
                switch(arr_v[this.a.ordinal()]) {
                    case 1: {
                        return kotlin.comparisons.a.l(integer0, ((B)object0).g());
                    }
                    case 2: {
                        return kotlin.comparisons.a.l(integer0, ((B)object0).j());
                    }
                    case 3: {
                        return kotlin.comparisons.a.l(integer0, ((B)object0).c());
                    }
                    default: {
                        throw new J();
                    }
                }
            }
        }

        C c0 = v0$b0.h();
        List list0 = new ArrayList();
        List list1 = jl.a.j();
        boolean z = Q.a.d.a(list1).isEmpty();
        L.o("추천 게시물", "getString(...)");
        ((ArrayList)list0).add(new J0(2));
        ((ArrayList)list0).add(new J0(41));
        ((ArrayList)list0).add(new J0(9, false));
        ((ArrayList)list0).add(new J0(44));
        ((ArrayList)list0).add(new J0(3, v0$b0.i()));
        ((ArrayList)list0).add(new J0(46));
        ((ArrayList)list0).add(new J0(35, "추천 게시물"));
        ((ArrayList)list0).add(new J0(46));
        List list2 = c0.a();
        if(list2 == null) {
            list2 = new ArrayList();
        }
        for(Object object0: u.J5(list2, 8)) {
            ((ArrayList)list0).add(new J0(39, ((B)object0), null, null, 12, null));
            ((ArrayList)list0).add(new J0(46));
        }
        if(!z) {
            ((ArrayList)list0).add(new J0(4));
            ((ArrayList)list0).add(new J0(46));
        }
        ((ArrayList)list0).add(new J0(6, c0.d()));
        ((ArrayList)list0).add(new J0(46));
        return list0;
    }

    private final List J(com.dcinside.app.main.v0.b v0$b0, p p0, q q0) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 MainAdapter.kt\ncom/dcinside/app/main/adapter/MainAdapter\n*L\n1#1,121:1\n519#2,9:122\n*E\n"})
        public static final class com.dcinside.app.main.adapter.f.f implements Comparator {
            final q a;

            public com.dcinside.app.main.adapter.f.f(q q0) {
                this.a = q0;
                super();
            }

            @Override
            public final int compare(Object object0, Object object1) {
                int v;
                int[] arr_v = c.c;
                switch(arr_v[this.a.ordinal()]) {
                    case 1: {
                        v = ((B)object1).g();
                        break;
                    }
                    case 2: {
                        v = ((B)object1).j();
                        break;
                    }
                    case 3: {
                        v = ((B)object1).c();
                        break;
                    }
                    default: {
                        throw new J();
                    }
                }
                Integer integer0 = v;
                switch(arr_v[this.a.ordinal()]) {
                    case 1: {
                        return kotlin.comparisons.a.l(integer0, ((B)object0).g());
                    }
                    case 2: {
                        return kotlin.comparisons.a.l(integer0, ((B)object0).j());
                    }
                    case 3: {
                        return kotlin.comparisons.a.l(integer0, ((B)object0).c());
                    }
                    default: {
                        throw new J();
                    }
                }
            }
        }

        List list0 = new ArrayList();
        List list1 = v0$b0.h().a();
        if(list1 == null) {
            list1 = new ArrayList();
        }
        for(Object object0: u.c2(list1, 8)) {
            ((ArrayList)list0).add(new J0(39, ((B)object0), null, null, 12, null));
            ((ArrayList)list0).add(new J0(46));
        }
        return list0;
    }

    private final List K(com.dcinside.app.main.v0.b v0$b0, b f$b0, p p0, q q0) {
        switch(f$b0) {
            case 1: {
                return this.H(v0$b0, p0, q0);
            }
            case 2: {
                return this.I(v0$b0, p0, q0);
            }
            case 3: {
                return this.J(v0$b0, p0, q0);
            }
            default: {
                throw new J();
            }
        }
    }

    static List L(f f0, com.dcinside.app.main.v0.b v0$b0, b f$b0, p p0, q q0, int v, Object object0) {
        if((v & 2) != 0) {
            f$b0 = b.a;
        }
        return f0.K(v0$b0, f$b0, p0, q0);
    }

    // 检测为 Lambda 实现
    private static final void N(Context context0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void O(View view0) [...]

    public final void P(@l String s) {
        L.p(s, "galleryId");
        RecyclerView recyclerView0 = (RecyclerView)this.e.a();
        if(recyclerView0 == null) {
            return;
        }
        Context context0 = Dl.b(recyclerView0);
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        Xk.i(appCompatActivity0, s);
    }

    @m
    public final Object Q(@l com.dcinside.app.main.v0.b v0$b0, @l kotlin.coroutines.d d0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.main.adapter.MainAdapter$setData$2", f = "MainAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class g extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final f l;
            final List m;

            g(f f0, List list0, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = list0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new g(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((g)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                this.l.R(this.m);
                return S0.a;
            }
        }

        this.f = v0$b0;
        Object object0 = i.h(h0.e(), new g(this, this.K(v0$b0, this.b, this.g, this.h), null), d0);
        return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void R(List list0) {
        if(L.g(list0, this.c)) {
            return;
        }
        List list1 = u.V5(this.c);
        this.c.clear();
        this.c.addAll(list0);
        if(this.b == b.c) {
            this.notifyDataSetChanged();
            return;
        }
        DiffResult diffUtil$DiffResult0 = DiffUtil.b(new com.dcinside.app.main.adapter.k(this.c, list1));
        L.o(diffUtil$DiffResult0, "calculateDiff(...)");
        diffUtil$DiffResult0.e(this);
    }

    // 检测为 Lambda 实现
    private static final void S(f f0, SharedPreferences sharedPreferences0, String s) [...]

    private final void T(q q0, p p0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.main.adapter.MainAdapter$updateData$1", f = "MainAdapter.kt", i = {}, l = {0xA1}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final f l;
            final com.dcinside.app.main.v0.b m;

            h(f f0, com.dcinside.app.main.v0.b v0$b0, kotlin.coroutines.d d0) {
                this.l = f0;
                this.m = v0$b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new h(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((h)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        kotlin.f0.n(object0);
                        this.k = 1;
                        return this.l.Q(this.m, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        kotlin.f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        com.dcinside.app.main.v0.b v0$b0 = this.f;
        if(v0$b0 == null) {
            return;
        }
        RecyclerView recyclerView0 = (RecyclerView)this.e.a();
        if(recyclerView0 != null) {
            LifecycleOwner lifecycleOwner0 = ViewTreeLifecycleOwner.a(recyclerView0);
            if(lifecycleOwner0 != null) {
                LifecycleCoroutineScope lifecycleCoroutineScope0 = LifecycleOwnerKt.a(lifecycleOwner0);
                if(lifecycleCoroutineScope0 != null) {
                    if(q0 != null) {
                        this.h = q0;
                    }
                    if(p0 != null) {
                        this.g = p0;
                    }
                    kotlinx.coroutines.k.f(lifecycleCoroutineScope0, h0.c(), null, new h(this, v0$b0, null), 2, null);
                }
            }
        }
    }

    static void U(f f0, q q0, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            q0 = null;
        }
        if((v & 2) != 0) {
            p0 = null;
        }
        f0.T(q0, p0);
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return this.d.g();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((J0)this.c.get(v)).h();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView0);
        this.e = new t(recyclerView0);
        dl.a.i(this.n);
        g1 g10 = this.k;
        if(g10 != null) {
            g10.l(this.m);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        com.dcinside.app.main.adapter.l l0 = null;
        L.p(recyclerView$ViewHolder0, "holder");
        Object object0 = this.c.get(v);
        L.o(object0, "get(...)");
        switch(((J0)object0).h()) {
            case 3: {
                L.n(recyclerView$ViewHolder0.itemView, "null cannot be cast to non-null type com.dcinside.app.main.view.CrowdView");
                CrowdView crowdView0 = (CrowdView)recyclerView$ViewHolder0.itemView;
                if(((J0)object0).a() != null) {
                    crowdView0.setData(((J0)object0).a());
                    return;
                }
                break;
            }
            case 6: {
                L.n(recyclerView$ViewHolder0.itemView, "null cannot be cast to non-null type com.dcinside.app.view.NewGalleriesView");
                List list0 = ((J0)object0).c();
                ((NewGalleriesView)recyclerView$ViewHolder0.itemView).setNewGalleries(list0);
                return;
            }
            case 9: {
                com.dcinside.app.main.adapter.m m0 = recyclerView$ViewHolder0 instanceof com.dcinside.app.main.adapter.m ? ((com.dcinside.app.main.adapter.m)recyclerView$ViewHolder0) : null;
                if(m0 == null) {
                    return;
                }
                com.dcinside.app.main.adapter.m.m(m0, ((J0)object0).j(), false, 2, null);
                return;
            }
            case 35: {
                if(recyclerView$ViewHolder0 instanceof com.dcinside.app.main.adapter.g) {
                    l0 = (com.dcinside.app.main.adapter.g)recyclerView$ViewHolder0;
                }
                if(l0 == null) {
                    return;
                }
                L.o(l0.itemView, "itemView");
                TextView textView0 = (TextView)l0.itemView.findViewById(0x7F0B0759);  // id:main_best_pick_title
                if(textView0 != null) {
                    textView0.setText(((J0)object0).g());
                    return;
                }
                break;
            }
            case 36: {
                if(recyclerView$ViewHolder0 instanceof com.dcinside.app.main.adapter.h) {
                    l0 = (com.dcinside.app.main.adapter.h)recyclerView$ViewHolder0;
                }
                if(l0 == null) {
                    return;
                }
                Context context0 = l0.itemView.getContext();
                ((com.dcinside.app.main.adapter.h)l0).l(((J0)object0).b(), this.l);
                L.m(context0);
                ((com.dcinside.app.main.adapter.h)l0).i(this.D(context0, ((J0)object0).b()));
                return;
            }
            case 38: {
                if(recyclerView$ViewHolder0 instanceof com.dcinside.app.main.adapter.i) {
                    l0 = (com.dcinside.app.main.adapter.i)recyclerView$ViewHolder0;
                }
                if(l0 == null) {
                    return;
                }
                Context context1 = l0.itemView.getContext();
                ((com.dcinside.app.main.adapter.i)l0).l(((J0)object0).b(), this.h, ((J0)object0).f(), this.l);
                L.m(context1);
                ((com.dcinside.app.main.adapter.i)l0).i(this.D(context1, ((J0)object0).b()));
                return;
            }
            case 39: {
                if(recyclerView$ViewHolder0 instanceof j) {
                    l0 = (j)recyclerView$ViewHolder0;
                }
                if(l0 == null) {
                    return;
                }
                Context context2 = l0.itemView.getContext();
                ((j)l0).k(((J0)object0).b());
                L.m(context2);
                ((j)l0).i(this.D(context2, ((J0)object0).b()));
                return;
            }
            case 50: {
                if(recyclerView$ViewHolder0 instanceof com.dcinside.app.main.adapter.l) {
                    l0 = (com.dcinside.app.main.adapter.l)recyclerView$ViewHolder0;
                }
                if(l0 == null) {
                    return;
                }
                p p0 = ((J0)object0).e();
                if(p0 == null) {
                    p0 = p.e;
                }
                q q0 = ((J0)object0).d();
                if(q0 == null) {
                    q0 = q.e;
                }
                l0.k(p0, q0);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        int v2;
        L.p(viewGroup0, "parent");
        Context context0 = viewGroup0.getContext();
        if(v != 50) {
            boolean z = false;
            switch(v) {
                case 1: {
                    switch(this.b) {
                        case 1: {
                            v2 = 0x7F0E020C;  // layout:view_main_search_gallery_basic
                            break;
                        }
                        case 2: 
                        case 3: {
                            v2 = 0x7F0E020D;  // layout:view_main_search_gallery_split
                            break;
                        }
                        default: {
                            throw new J();
                        }
                    }
                    View view1 = LayoutInflater.from(context0).inflate(v2, viewGroup0, false);
                    view1.findViewById(0x7F0B0767).setOnClickListener((View view0) -> TotalSearchActivity.C2(context0, null, false));
                    L.m(view1);
                    return new com.dcinside.app.main.adapter.g(view1);
                }
                case 2: {
                    L.m(context0);
                    if(this.b != b.a) {
                        z = true;
                    }
                    RecentView recentView0 = new RecentView(context0, null, 0, z, 6, null);
                    recentView0.J(this.a);
                    this.d.a(recentView0);
                    return new com.dcinside.app.main.adapter.g(recentView0);
                }
                case 3: {
                    L.m(context0);
                    CrowdView crowdView0 = new CrowdView(context0, null, 0, 6, null);
                    crowdView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    return new com.dcinside.app.main.adapter.g(crowdView0);
                }
                case 4: 
                case 5: {
                    FrameLayout frameLayout0 = new FrameLayout(context0);
                    L.m(context0);
                    frameLayout0.setBackgroundColor(vk.b(context0, 0x1010054));
                    frameLayout0.setMinimumHeight(Dk.b(0x7F070058));  // dimen:ad_minimum_height
                    frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    if(v == 5) {
                        int v3 = context0.getResources().getDimensionPixelSize(0x7F0702A1);  // dimen:main_ad_live_best_spacing
                        frameLayout0.setPadding(v3, 0, v3, 0);
                    }
                    ViewHolder recyclerView$ViewHolder0 = new com.dcinside.app.main.adapter.a(frameLayout0);
                    this.d.a(((com.dcinside.app.wv.f)recyclerView$ViewHolder0));
                    return recyclerView$ViewHolder0;
                }
                case 6: {
                    NewGalleriesView newGalleriesView0 = new NewGalleriesView(context0);
                    newGalleriesView0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                    return new com.dcinside.app.main.adapter.g(newGalleriesView0);
                }
                case 7: {
                    int v4 = Dk.b(0x7F0702A8);  // dimen:main_space_end
                    View view2 = LayoutInflater.from(context0).inflate(0x7F0E020A, viewGroup0, false);  // layout:view_main_bottom
                    view2.setLayoutParams(new ViewGroup.LayoutParams(-1, v4));
                    L.m(view2);
                    return new com.dcinside.app.main.adapter.g(view2);
                }
                case 8: {
                    int v5 = Dk.b(0x7F0702A5);  // dimen:main_space_divide3
                    View view3 = LayoutInflater.from(context0).inflate(0x7F0E020A, viewGroup0, false);  // layout:view_main_bottom
                    view3.setLayoutParams(new ViewGroup.LayoutParams(-1, v5));
                    L.m(view3);
                    return new com.dcinside.app.main.adapter.g(view3);
                }
                case 9: {
                    View view4 = LayoutInflater.from(context0).inflate(0x7F0E025E, viewGroup0, false);  // layout:view_recommend_galleries
                    L.m(view4);
                    return new com.dcinside.app.main.adapter.m(view4);
                }
                case 35: {
                    View view5 = LayoutInflater.from(context0).inflate(0x7F0E0209, viewGroup0, false);  // layout:view_main_best_pick_title
                    L.m(view5);
                    return new com.dcinside.app.main.adapter.g(view5);
                }
                case 36: {
                    return new com.dcinside.app.main.adapter.h(viewGroup0);
                }
                case 37: {
                    View view6 = LayoutInflater.from(context0).inflate(0x7F0E020B, viewGroup0, false);  // layout:view_main_live_best_more
                    view6.setOnClickListener((View view0) -> {
                        Context context0 = Dl.b(view0);
                        L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                        Xk.i(((AppCompatActivity)context0), "dcbest");
                    });
                    L.m(view6);
                    return new com.dcinside.app.main.adapter.g(view6);
                }
                case 38: {
                    return new com.dcinside.app.main.adapter.i(viewGroup0);
                }
                case 39: {
                    return new j(viewGroup0);
                }
                case 41: {
                    int v6 = Dk.b(0x7F0700BC);  // dimen:divider
                    int v7 = Dk.b(0x7F0702AB);  // dimen:main_space_item_padding
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = new ViewGroup.MarginLayoutParams(-1, v6);
                    viewGroup$MarginLayoutParams0.setMargins(v7, 0, v7, 0);
                    View view7 = new View(context0);
                    view7.setLayoutParams(viewGroup$MarginLayoutParams0);
                    if(this.b != b.b) {
                        L.m(context0);
                        view7.setBackground(vk.e(context0, 0x7F040242));  // attr:divide_n
                    }
                    return new com.dcinside.app.main.adapter.g(view7);
                }
                case 42: {
                    int v8 = Dk.b(0x7F0700BC);  // dimen:divider
                    int v9 = Dk.b(0x7F0702A4);  // dimen:main_live_best_div_margin
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams1 = new ViewGroup.MarginLayoutParams(-1, v8);
                    viewGroup$MarginLayoutParams1.setMargins(v9, 0, v9, 0);
                    View view8 = new View(context0);
                    view8.setLayoutParams(viewGroup$MarginLayoutParams1);
                    if(this.b != b.b) {
                        L.m(context0);
                        view8.setBackground(vk.e(context0, 0x7F040242));  // attr:divide_n
                    }
                    return new com.dcinside.app.main.adapter.g(view8);
                }
                case 43: {
                    int v10 = Dk.b(0x7F0702A5);  // dimen:main_space_divide3
                    View view9 = new View(context0);
                    view9.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, v10));
                    if(this.b != b.b) {
                        view9.setBackgroundResource(0x7F060104);  // color:divide0
                    }
                    return new com.dcinside.app.main.adapter.g(view9);
                }
                case 44: {
                    int v11 = Dk.b(0x7F0702A6);  // dimen:main_space_divide4
                    View view10 = new View(context0);
                    view10.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, v11));
                    if(this.b != b.b) {
                        view10.setBackgroundResource(0x7F060104);  // color:divide0
                    }
                    return new com.dcinside.app.main.adapter.g(view10);
                }
                case 45: {
                    int v12 = Dk.b(0x7F0700BD);  // dimen:divider_new
                    int v13 = Dk.b(0x7F0702AB);  // dimen:main_space_item_padding
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, v12 + 1);
                    viewGroup$MarginLayoutParams2.setMargins(v13, 0, v13, 0);
                    View view11 = new View(context0);
                    view11.setLayoutParams(viewGroup$MarginLayoutParams2);
                    L.m(context0);
                    view11.setBackground(vk.e(context0, 0x7F040242));  // attr:divide_n
                    return new com.dcinside.app.main.adapter.g(view11);
                }
                case 46: {
                    int v14 = Dk.b(0x7F0702A7);  // dimen:main_space_divide5
                    View view12 = new View(context0);
                    view12.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, v14));
                    if(this.b != b.b) {
                        view12.setBackgroundResource(0x7F060104);  // color:divide0
                    }
                    return new com.dcinside.app.main.adapter.g(view12);
                }
                default: {
                    int v1 = Dk.b(0x7F0702A8);  // dimen:main_space_end
                    View view0 = LayoutInflater.from(context0).inflate(0x7F0E020A, viewGroup0, false);  // layout:view_main_bottom
                    view0.setLayoutParams(new ViewGroup.LayoutParams(-1, v1));
                    L.m(view0);
                    return new com.dcinside.app.main.adapter.g(view0);
                }
            }
        }
        return new com.dcinside.app.main.adapter.l(viewGroup0);
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        this.d.onDestroy();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView0);
        this.e = new t(null, 1, null);
        dl.a.s(this.n);
        g1 g10 = this.k;
        if(g10 != null) {
            g10.D();
        }
        o o0 = this.i;
        if(o0 != null) {
            o0.l();
        }
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
        this.d.onPause();
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
        this.d.onResume();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onViewRecycled(@l ViewHolder recyclerView$ViewHolder0) {
        L.p(recyclerView$ViewHolder0, "holder");
        super.onViewRecycled(recyclerView$ViewHolder0);
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.main.adapter.l) {
            ((com.dcinside.app.main.adapter.l)recyclerView$ViewHolder0).o();
        }
    }
}

