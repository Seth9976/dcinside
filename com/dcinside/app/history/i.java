package com.dcinside.app.history;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.codewaves.stickyheadergrid.StickyHeaderGridLayoutManager;
import com.codewaves.stickyheadergrid.a.b;
import com.codewaves.stickyheadergrid.a;
import com.dcinside.app.history.holder.c;
import com.dcinside.app.history.holder.d;
import com.dcinside.app.history.holder.e;
import com.dcinside.app.history.holder.f;
import com.dcinside.app.internal.t;
import com.dcinside.app.realm.f0;
import com.dcinside.app.rx.bus.P;
import com.dcinside.app.rx.bus.w0;
import com.dcinside.app.span.g;
import com.dcinside.app.util.Al;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.kl;
import io.realm.F0;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nPostHistoryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostHistoryAdapter.kt\ncom/dcinside/app/history/PostHistoryAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n+ 6 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,243:1\n142#2:244\n147#2:245\n60#3:246\n1#4:247\n1#4:262\n257#5,2:248\n177#6,9:250\n120#6,3:259\n124#6:263\n*S KotlinDebug\n*F\n+ 1 PostHistoryAdapter.kt\ncom/dcinside/app/history/PostHistoryAdapter\n*L\n23#1:244\n29#1:245\n31#1:246\n124#1:262\n94#1:248,2\n115#1:250,9\n124#1:259,3\n124#1:263\n*E\n"})
public final class i extends a {
    @l
    private final com.dcinside.app.history.l g;
    @l
    private t h;
    @m
    private o i;

    public i(@l com.dcinside.app.history.l l0) {
        L.p(l0, "itemManager");
        super();
        this.g = l0;
        this.h = new t(null);
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int E() {
        return this.g.o();
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int G(int v) {
        k k0 = this.g.n(v);
        return k0 == null ? 0 : k0.b();
    }

    // 去混淆评级： 低(20)
    @Override  // com.codewaves.stickyheadergrid.a
    public int H(int v) {
        return this.g.u(v) ? 0 : this.g.j(v);
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public int J(int v, int v1) {
        return 1;
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public boolean L(int v) {
        k k0 = this.g.n(v);
        return (k0 == null || k0.b() != 0 ? 0 : 1) ^ 1;
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void X(@m com.codewaves.stickyheadergrid.a.a a$a0, int v) {
        String s;
        int v1 = 0;
        if(a$a0 instanceof c) {
            k k0 = this.g.n(v + 1);
            Integer integer0 = k0 == null ? null : k0.b();
            boolean z = integer0 != null && ((int)integer0) == 2;
            k k1 = this.g.n(v);
            if(k1 == null) {
                s = "";
            }
            else {
                s = k1.a();
                if(s == null) {
                    s = "";
                }
            }
            boolean z1 = this.g.v(s);
            ((c)a$a0).j().setText(s);
            if(z1 && !z) {
                v1 = 1;
            }
            ((c)a$a0).m(z1, ((boolean)v1));
            return;
        }
        if(a$a0 instanceof com.dcinside.app.history.holder.a) {
            if(this.g.y()) {
                ((com.dcinside.app.history.holder.a)a$a0).itemView.setVisibility(8);
                return;
            }
            ((com.dcinside.app.history.holder.a)a$a0).itemView.setVisibility(0);
            ((com.dcinside.app.history.holder.a)a$a0).s(this.g.t());
            return;
        }
        if(a$a0 instanceof f) {
            View view0 = ((f)a$a0).h();
            if(this.g.w()) {
                v1 = 8;
            }
            view0.setVisibility(v1);
            return;
        }
        if(a$a0 instanceof d) {
            k k2 = this.g.n(v - 1);
            if(k2 == null || k2.b() != 0 || !this.g.u(v - 1)) {
                v1 = 1;
            }
            ((d)a$a0).i().setDrawTop(((boolean)v1));
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    public void Y(@m b a$b0, int v, int v1) {
        String s6;
        String s1;
        String s;
        if(a$b0 instanceof e) {
            boolean z = true;
            ((e)a$b0).l(true);
            f0 f00 = this.g.i(v, v1);
            if(f00 != null) {
                if(!f00.s()) {
                    f00 = null;
                }
                if(f00 != null) {
                    try {
                        s = f00.X5();
                    }
                    catch(Exception unused_ex) {
                        s1 = null;
                        goto label_15;
                    }
                    if(s == null) {
                        s = "";
                    }
                    s1 = s;
                label_15:
                    if(s1 == null) {
                        return;
                    }
                    if(this.g.x()) {
                        String s2 = f00.a6();
                        ((e)a$b0).s(this.g.s(s2));
                    }
                    ((e)a$b0).n().setText(f00.g6());
                    Context context0 = ((e)a$b0).itemView.getContext();
                    String s3 = f00.c6();
                    String s4 = f00.T5();
                    if(s4 == null) {
                        s6 = "";
                    }
                    else {
                        String s5 = Bk.l(s4);
                        s6 = s5 == null ? "" : s5;
                    }
                    TextView textView0 = ((e)a$b0).o();
                    L.m(context0);
                    textView0.setText(g.g(context0, -1, s1, (s3 == null ? "" : s3), s6, null));
                    F0 f01 = F0.g4();
                    try {
                        L.m(f01);
                        String s7 = f00.W5();
                        if(s7 == null) {
                            z = false;
                        }
                        else {
                            int v2 = f00.d6();
                            if(com.dcinside.app.realm.helper.a.a.h(f01, s7, v2) == null) {
                                z = false;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        kotlin.io.c.a(f01, throwable0);
                        throw throwable0;
                    }
                    kotlin.io.c.a(f01, null);
                    ((e)a$b0).k(this.g.x(), z);
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
                return new c(viewGroup0);
            }
            case 2: {
                return new d(viewGroup0);
            }
            case 3: {
                return new com.dcinside.app.history.holder.a(viewGroup0);
            }
            case 5: {
                return new com.dcinside.app.history.holder.b(viewGroup0);
            }
            default: {
                return new f(viewGroup0);
            }
        }
    }

    @Override  // com.codewaves.stickyheadergrid.a
    @l
    public b b0(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new e(viewGroup0);
    }

    private final void f0(RecyclerView recyclerView0, int v) {
        LayoutManager recyclerView$LayoutManager0 = recyclerView0 == null ? null : recyclerView0.getLayoutManager();
        StickyHeaderGridLayoutManager stickyHeaderGridLayoutManager0 = recyclerView$LayoutManager0 instanceof StickyHeaderGridLayoutManager ? ((StickyHeaderGridLayoutManager)recyclerView$LayoutManager0) : null;
        int v1 = stickyHeaderGridLayoutManager0 == null ? 0 : stickyHeaderGridLayoutManager0.j0();
        for(int v2 = 0; v2 < v1; ++v2) {
            if(stickyHeaderGridLayoutManager0 != null) {
                View view0 = stickyHeaderGridLayoutManager0.i0(v2);
                if(view0 != null) {
                    ViewHolder recyclerView$ViewHolder0 = recyclerView0.getChildViewHolder(view0);
                    if(recyclerView$ViewHolder0 instanceof e) {
                        Integer integer0 = ((e)recyclerView$ViewHolder0).getBindingAdapterPosition();
                        if(integer0.intValue() < 0) {
                            integer0 = null;
                        }
                        if(integer0 != null && this.z(((int)integer0)) == v) {
                            if(recyclerView$ViewHolder0.itemView.getTop() >= 0) {
                                break;
                            }
                            ((e)recyclerView$ViewHolder0).l(false);
                        }
                    }
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void g0(Function1 function10, Object object0) [...]

    private final void h0() {
        this.N();
    }

    public final void i0(int v, int v1, boolean z) {
        this.g.b(v, v1, z);
        int v2 = this.F(v);
        if(v2 >= 0) {
            RecyclerView recyclerView0 = (RecyclerView)this.h.a();
            com.dcinside.app.history.holder.a a0 = null;
            ViewHolder recyclerView$ViewHolder0 = recyclerView0 == null ? null : recyclerView0.findViewHolderForAdapterPosition(v2);
            if(recyclerView$ViewHolder0 instanceof com.dcinside.app.history.holder.a) {
                a0 = (com.dcinside.app.history.holder.a)recyclerView$ViewHolder0;
            }
            if(a0 != null) {
                a0.s(this.g.t());
            }
        }
        this.R(v, v1);
        if(this.g.y()) {
            this.p0();
        }
    }

    public final void j0(boolean z) {
        this.g.c(z);
        this.N();
    }

    public final void k0(int v, int v1) {
        AppCompatActivity appCompatActivity0 = null;
        f0 f00 = this.g.i(v, v1);
        if(f00 != null) {
            if(!f00.s()) {
                f00 = null;
            }
            if(f00 != null) {
                RecyclerView recyclerView0 = (RecyclerView)this.h.a();
                Context context0 = recyclerView0 == null ? null : recyclerView0.getContext();
                if(context0 instanceof AppCompatActivity) {
                    appCompatActivity0 = (AppCompatActivity)context0;
                }
                if(appCompatActivity0 == null) {
                    return;
                }
                String s = f00.W5();
                if(s == null) {
                    return;
                }
                String s1 = f00.X5();
                if(s1 == null) {
                    return;
                }
                int v2 = f00.d6();
                String s2 = f00.g6();
                if(s2 == null) {
                    return;
                }
                String s3 = f00.c6();
                if(s3 == null) {
                    return;
                }
                String s4 = f00.T5();
                if(s4 == null) {
                    return;
                }
                com.dcinside.app.rx.bus.c.a(appCompatActivity0, new w0(0, s, s1, v2, s2, s3, s4, null, null));
            }
        }
    }

    public final void l0() {
        RecyclerView recyclerView0 = (RecyclerView)this.h.a();
        Context context0 = Al.h((recyclerView0 == null ? null : recyclerView0.getContext()));
        if(context0 != null) {
            com.dcinside.app.rx.bus.c.a(context0, new P(0));
        }
    }

    public final void m0() {
        RecyclerView recyclerView0 = (RecyclerView)this.h.a();
        Context context0 = Al.h((recyclerView0 == null ? null : recyclerView0.getContext()));
        if(context0 != null) {
            com.dcinside.app.rx.bus.c.a(context0, new P(1));
        }
    }

    public final void n0(int v) {
        boolean z = this.g.A(v);
        k k0 = this.g.n(v + 1);
        Context context0 = null;
        Integer integer0 = k0 == null ? null : k0.b();
        boolean z1 = true;
        boolean z2 = integer0 != null && ((int)integer0) == 2;
        int v1 = this.F(v);
        RecyclerView recyclerView0 = (RecyclerView)this.h.a();
        if(v1 >= 0) {
            ViewHolder recyclerView$ViewHolder0 = recyclerView0 == null ? null : recyclerView0.findViewHolderForAdapterPosition(v1);
            c c0 = recyclerView$ViewHolder0 instanceof c ? ((c)recyclerView$ViewHolder0) : null;
            if(c0 != null) {
                if(!z || z2) {
                    z1 = false;
                }
                c0.m(z, z1);
            }
        }
        int v2 = this.g.j(v);
        if(v2 > 0) {
            if(z) {
                this.U(v, 0, v2);
            }
            else {
                this.T(v, 0, v2);
            }
        }
        if(z2) {
            this.P(v + 1);
        }
        RecyclerView recyclerView1 = (RecyclerView)this.h.a();
        if(recyclerView1 != null) {
            context0 = recyclerView1.getContext();
        }
        Context context1 = Al.h(context0);
        if(context1 != null) {
            com.dcinside.app.rx.bus.c.a(context1, new P(2));
        }
    }

    public final void o0(int v, int v1) {
        AppCompatActivity appCompatActivity0 = null;
        f0 f00 = this.g.i(v, v1);
        if(f00 != null) {
            if(!f00.s()) {
                f00 = null;
            }
            if(f00 != null) {
                RecyclerView recyclerView0 = (RecyclerView)this.h.a();
                Context context0 = recyclerView0 == null ? null : recyclerView0.getContext();
                if(context0 instanceof AppCompatActivity) {
                    appCompatActivity0 = (AppCompatActivity)context0;
                }
                if(appCompatActivity0 == null) {
                    return;
                }
                String s = f00.W5();
                if(s == null) {
                    return;
                }
                new com.dcinside.app.util.Xk.a(s, f00.d6(), 0, null, false, false, false, false, false, false, null, false, null, null, 0x3FFC, null).a(appCompatActivity0);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        static final class com.dcinside.app.history.i.a extends N implements Function1 {
            final i e;

            com.dcinside.app.history.i.a(i i0) {
                this.e = i0;
                super(1);
            }

            public final void a(com.dcinside.app.rx.bus.g g0) {
                this.e.h0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.rx.bus.g)object0));
                return S0.a;
            }
        }

        L.p(recyclerView0, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView0);
        this.h = new t(recyclerView0);
        kl.b(new o[]{this.i});
        Context context0 = Al.h(recyclerView0.getContext());
        if(context0 != null) {
            rx.g g0 = com.dcinside.app.rx.bus.c.c(context0, com.dcinside.app.rx.bus.g.class);
            if(g0 != null) {
                o o0 = g0.x5((Object object0) -> {
                    L.p(new com.dcinside.app.history.i.a(this), "$tmp0");
                    new com.dcinside.app.history.i.a(this).invoke(object0);
                });
                if(o0 != null) {
                    this.i = o0;
                }
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView0);
        kl.b(new o[]{this.i});
    }

    private final void p0() {
        RecyclerView recyclerView0 = (RecyclerView)this.h.a();
        PostHistoryActivity postHistoryActivity0 = null;
        Context context0 = recyclerView0 == null ? null : recyclerView0.getContext();
        if(context0 instanceof PostHistoryActivity) {
            postHistoryActivity0 = (PostHistoryActivity)context0;
        }
        if(postHistoryActivity0 == null) {
            return;
        }
        postHistoryActivity0.s2();
    }
}

