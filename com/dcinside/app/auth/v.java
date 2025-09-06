package com.dcinside.app.auth;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.t;
import com.dcinside.app.util.otp.b.d;
import com.dcinside.app.util.otp.e;
import com.dcinside.app.util.otp.h;
import com.dcinside.app.util.otp.i;
import com.dcinside.app.util.otp.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nOtpCodeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtpCodeAdapter.kt\ncom/dcinside/app/auth/OtpCodeAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n142#2:101\n147#2:103\n1#3:102\n1557#4:104\n1628#4,3:105\n*S KotlinDebug\n*F\n+ 1 OtpCodeAdapter.kt\ncom/dcinside/app/auth/OtpCodeAdapter\n*L\n18#1:101\n53#1:103\n83#1:104\n83#1:105,3\n*E\n"})
public final class v extends Adapter {
    public static final class b {
        private b() {
        }

        public b(w w0) {
        }
    }

    public static final class c {
        private final int a;
        @m
        private final d b;

        public c(int v, @m d b$d0) {
            this.a = v;
            this.b = b$d0;
        }

        @m
        public final d a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }
    }

    @l
    private final Function1 a;
    @l
    private final Function1 b;
    @l
    private t c;
    @l
    private final com.dcinside.app.util.otp.b d;
    @l
    private final e e;
    @l
    private final j f;
    @m
    private List g;
    @l
    public static final b h = null;
    private static final int i = 0;
    private static final int j = 1;

    static {
        v.h = new b(null);
    }

    public v(@l Context context0, @l Function1 function10, @l Function1 function11) {
        public static final class a implements com.dcinside.app.util.otp.j.a {
            final v a;

            a(v v0) {
                this.a = v0;
                super();
            }

            @Override  // com.dcinside.app.util.otp.j$a
            public void a(long v) {
                RecyclerView recyclerView0 = (RecyclerView)this.a.c.a();
                if(recyclerView0 == null) {
                    return;
                }
                int v1 = recyclerView0.getChildCount();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForAdapterPosition(v2);
                    x x0 = recyclerView$ViewHolder0 instanceof x ? ((x)recyclerView$ViewHolder0) : null;
                    if(x0 != null) {
                        x0.h(v, this.a.e.b().b());
                    }
                }
            }

            @Override  // com.dcinside.app.util.otp.j$a
            public void b() {
                this.a.notifyDataSetChanged();
            }
        }

        L.p(context0, "context");
        L.p(function10, "deletable");
        L.p(function11, "callback");
        super();
        this.a = function10;
        this.b = function11;
        this.c = new t(null);
        com.dcinside.app.util.otp.b b0 = new com.dcinside.app.util.otp.b(context0);
        this.d = b0;
        e e0 = new e(b0, new i(context0, new h()));
        this.e = e0;
        j j0 = new j(e0.b(), e0.a(), 100L);
        j0.g(new a(this));
        j0.h();
        this.f = j0;
        this.x();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.g == null ? 0 : this.g.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        List list0 = this.g;
        if(list0 != null) {
            c v$c0 = (c)list0.get(v);
            return v$c0 == null ? 0 : v$c0.b();
        }
        return 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.c = new t(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        x x0 = null;
        c v$c0 = this.g == null ? null : ((c)this.g.get(v));
        if(v$c0 != null && v$c0.b() == 1) {
            if(recyclerView$ViewHolder0 instanceof x) {
                x0 = (x)recyclerView$ViewHolder0;
            }
            if(x0 != null) {
                x0.f(v$c0.a(), this.e);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return v == 0 ? com.dcinside.app.auth.w.b.a(viewGroup0, this.b) : x.e.a(viewGroup0, this.a);
    }

    public final void release() {
        this.f.i();
    }

    public final void x() {
        List list1;
        List list0 = this.d.n();
        if(list0 == null || list0.isEmpty()) {
            list1 = u.k(new c(0, null));
        }
        else {
            L.m(list0);
            list1 = new ArrayList(u.b0(list0, 10));
            for(Object object0: list0) {
                list1.add(new c(1, ((d)object0)));
            }
        }
        this.g = list1;
        this.notifyDataSetChanged();
    }
}

