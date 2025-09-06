package com.dcinside.app.archive.quick;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.t;
import com.dcinside.app.realm.c;
import com.dcinside.app.realm.d;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Dl;
import com.dcinside.app.wv.f;
import io.realm.F0;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveChangeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveChangeAdapter.kt\ncom/dcinside/app/archive/quick/ArchiveChangeAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,171:1\n142#2:172\n147#2:173\n360#3,7:174\n1628#3,3:190\n177#4,9:181\n177#4,9:193\n177#4,9:202\n177#4,9:211\n*S KotlinDebug\n*F\n+ 1 ArchiveChangeAdapter.kt\ncom/dcinside/app/archive/quick/ArchiveChangeAdapter\n*L\n25#1:172\n33#1:173\n40#1:174,7\n60#1:190,3\n54#1:181,9\n67#1:193,9\n120#1:202,9\n154#1:211,9\n*E\n"})
public final class b extends Adapter implements f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class com.dcinside.app.archive.quick.b.b {
        private final int a;
        @m
        private final c b;

        public com.dcinside.app.archive.quick.b.b(int v, @m c c0) {
            this.a = v;
            this.b = c0;
        }

        public com.dcinside.app.archive.quick.b.b(int v, c c0, int v1, w w0) {
            if((v1 & 2) != 0) {
                c0 = null;
            }
            this(v, c0);
        }

        @m
        public final c a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    private final int a;
    @m
    private o b;
    @l
    private t c;
    @m
    private I0 d;
    @l
    private List e;
    private long f;
    @l
    public static final a g = null;
    private static final int h = 0;
    private static final int i = 1;

    static {
        b.g = new a(null);
    }

    public b(int v, long v1) {
        this.a = v;
        this.c = new t(null);
        this.e = u.H();
        this.f = v1;
    }

    public b(int v, long v1, int v2, w w0) {
        if((v2 & 2) != 0) {
            v1 = -1L;
        }
        this(v, v1);
    }

    private final int B(long v) {
        if(v != -1L) {
            int v1 = 0;
            for(Object object0: this.e) {
                c c0 = ((com.dcinside.app.archive.quick.b.b)object0).a();
                if(c0 != null && c0.Q5() == v) {
                    return v1;
                }
                ++v1;
            }
        }
        return -1;
    }

    public final long C() {
        return this.f;
    }

    public final void D() {
        @s0({"SMAP\nArchiveChangeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveChangeAdapter.kt\ncom/dcinside/app/archive/quick/ArchiveChangeAdapter$onAddFolder$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n120#2,3:172\n124#2:176\n1#3:175\n*S KotlinDebug\n*F\n+ 1 ArchiveChangeAdapter.kt\ncom/dcinside/app/archive/quick/ArchiveChangeAdapter$onAddFolder$1\n*L\n129#1:172,3\n129#1:176\n129#1:175\n*E\n"})
        static final class com.dcinside.app.archive.quick.b.c extends N implements Function1 {
            final b e;

            com.dcinside.app.archive.quick.b.c(b b0) {
                this.e = b0;
                super(1);
            }

            public final void b(String s) {
                com.dcinside.app.realm.d.a d$a0;
                if(m0.a.a.i(s)) {
                    return;
                }
                b b0 = this.e;
                F0 f00 = F0.g4();
                try {
                    L.m(f00);
                    d$a0 = d.f;
                    L.m(s);
                    if(d$a0.f(f00, b0.a, s)) {
                        RecyclerView recyclerView0 = (RecyclerView)b0.c.a();
                        Context context0 = recyclerView0 == null ? null : recyclerView0.getContext();
                        if(context0 != null) {
                            L.m(context0);
                            Dl.D(context0, 0x7F1502B6);  // string:exist_folder_name "이미 사용중인 폴더명입니다."
                            goto label_21;
                        }
                        goto label_14;
                    }
                    else {
                        goto label_16;
                    }
                    goto label_21;
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable0;
                }
            label_14:
                kotlin.io.c.a(f00, null);
                return;
                try {
                label_16:
                    b0.f = d$a0.a(f00, b0.a, s).Q5();
                }
                catch(Throwable throwable0) {
                    kotlin.io.c.a(f00, throwable0);
                    throw throwable0;
                }
            label_21:
                kotlin.io.c.a(f00, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.b(((String)object0));
                return S0.a;
            }
        }

        RecyclerView recyclerView0 = (RecyclerView)this.c.a();
        AppCompatActivity appCompatActivity0 = null;
        Context context0 = Al.h((recyclerView0 == null ? null : recyclerView0.getContext()));
        if(context0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)context0;
        }
        if(appCompatActivity0 == null) {
            return;
        }
        o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.b = com.dcinside.app.archive.util.u.t(appCompatActivity0, 0x7F150606).x5((Object object0) -> {
            L.p(new com.dcinside.app.archive.quick.b.c(this), "$tmp0");
            new com.dcinside.app.archive.quick.b.c(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void E(Function1 function10, Object object0) [...]

    private final void F(com.dcinside.app.archive.quick.f f0, c c0) {
        f0.i().setVisibility((this.f == c0.Q5() ? 0 : 8));
        f0.j().setText(c0.R5());
    }

    public final void G(int v) {
        com.dcinside.app.archive.quick.b.b b$b0 = null;
        try {
            b$b0 = (com.dcinside.app.archive.quick.b.b)this.e.get(v);
        }
        catch(Exception unused_ex) {
        }
        if(b$b0 != null) {
            c c0 = b$b0.a();
            if(c0 != null) {
                this.J(c0.Q5());
            }
        }
    }

    private final void H(int v) {
        RecyclerView recyclerView0 = (RecyclerView)this.c.a();
        if(recyclerView0 == null) {
            return;
        }
        ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(v);
        com.dcinside.app.archive.quick.f f0 = recyclerView$ViewHolder0 instanceof com.dcinside.app.archive.quick.f ? ((com.dcinside.app.archive.quick.f)recyclerView$ViewHolder0) : null;
        if(f0 == null) {
            return;
        }
        com.dcinside.app.archive.quick.b.b b$b0 = (com.dcinside.app.archive.quick.b.b)u.W2(this.e, v);
        if(b$b0 == null) {
            return;
        }
        c c0 = b$b0.a();
        if(c0 == null) {
            return;
        }
        this.F(f0, c0);
    }

    public final void I(@l List list0) {
        L.p(list0, "items");
        I0 i00 = this.d;
        if(i00 != null) {
            try {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            catch(Exception unused_ex) {
            }
        }
        this.d = null;
        if(this.f < 0L && !list0.isEmpty()) {
            this.f = ((c)u.B2(list0)).Q5();
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(new com.dcinside.app.archive.quick.b.b(0, ((c)object0)));
        }
        arrayList0.add(new com.dcinside.app.archive.quick.b.b(1, null, 2, null));
        this.e = arrayList0;
        this.notifyDataSetChanged();
    }

    private final void J(long v) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.archive.quick.ArchiveChangeAdapter$setSelectionKey$2", f = "ArchiveChangeAdapter.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.archive.quick.b.d extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final b l;
            final long m;

            com.dcinside.app.archive.quick.b.d(b b0, long v, kotlin.coroutines.d d0) {
                this.l = b0;
                this.m = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.archive.quick.b.d(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.archive.quick.b.d)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.archive.quick.ArchiveChangeAdapter$setSelectionKey$2$1", f = "ArchiveChangeAdapter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.archive.quick.b.d.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final int l;
                    final b m;
                    final int n;

                    com.dcinside.app.archive.quick.b.d.a(int v, b b0, int v1, kotlin.coroutines.d d0) {
                        this.l = v;
                        this.m = b0;
                        this.n = v1;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.archive.quick.b.d.a(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.archive.quick.b.d.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        int v = this.l;
                        if(v >= 0) {
                            this.m.H(v);
                        }
                        int v1 = this.n;
                        if(v1 >= 0) {
                            this.m.H(v1);
                        }
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        long v = this.l.C();
                        if(v != this.m) {
                            int v1 = this.l.B(v);
                            int v2 = this.l.B(this.m);
                            this.l.f = this.m;
                            com.dcinside.app.archive.quick.b.d.a b$d$a0 = new com.dcinside.app.archive.quick.b.d.a(v1, this.l, v2, null);
                            this.k = 1;
                            if(i.h(h0.e(), b$d$a0, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
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

        I0 i00 = this.d;
        if(i00 != null) {
            try {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
            catch(Exception unused_ex) {
            }
        }
        com.dcinside.app.archive.quick.b.d b$d0 = new com.dcinside.app.archive.quick.b.d(this, v, null);
        this.d = k.f(() -> kotlin.coroutines.i.a, null, null, b$d0, 3, null);
    }

    @Override  // com.dcinside.app.wv.f
    public boolean g() {
        return false;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.e.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((com.dcinside.app.archive.quick.b.b)this.e.get(v)).b();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.c = new t(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.archive.quick.f) {
            c c0 = ((com.dcinside.app.archive.quick.b.b)this.e.get(v)).a();
            if(c0 == null) {
                return;
            }
            this.F(((com.dcinside.app.archive.quick.f)recyclerView$ViewHolder0), c0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return v == 0 ? new com.dcinside.app.archive.quick.f(viewGroup0) : new e(viewGroup0);
    }

    @Override  // com.dcinside.app.wv.f
    public void onDestroy() {
        try {
            I0 i00 = this.d;
            if(i00 != null) {
                kotlinx.coroutines.I0.a.b(i00, null, 1, null);
            }
        }
        catch(Exception unused_ex) {
        }
        this.d = null;
        o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.b = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
    }

    @Override  // com.dcinside.app.wv.f
    public void onPause() {
    }

    @Override  // com.dcinside.app.wv.f
    public void onResume() {
    }
}

