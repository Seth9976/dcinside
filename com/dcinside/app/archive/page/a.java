package com.dcinside.app.archive.page;

import A3.o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.archive.folder.g;
import com.dcinside.app.archive.util.u;
import com.dcinside.app.internal.t;
import com.dcinside.app.realm.c;
import com.dcinside.app.realm.d0;
import com.dcinside.app.util.Dl;
import com.futuremind.recyclerviewfastscroll.b;
import io.realm.d1;
import io.realm.g1;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nArchiveAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveAdapter.kt\ncom/dcinside/app/archive/page/ArchiveAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n147#2:137\n1#3:138\n*S KotlinDebug\n*F\n+ 1 ArchiveAdapter.kt\ncom/dcinside/app/archive/page/ArchiveAdapter\n*L\n54#1:137\n*E\n"})
public final class a extends Adapter implements b {
    public static final class com.dcinside.app.archive.page.a.a {
        private com.dcinside.app.archive.page.a.a() {
        }

        public com.dcinside.app.archive.page.a.a(w w0) {
        }
    }

    @l
    private final A3.a a;
    @l
    private final A3.a b;
    @l
    private final o c;
    @l
    private final o d;
    @m
    private final Function1 e;
    @m
    private List f;
    @l
    private HashSet g;
    private int h;
    @m
    private t i;
    @m
    private String j;
    private boolean k;
    @l
    public static final com.dcinside.app.archive.page.a.a l = null;
    private static final int m = 0;
    private static final int n = 1;

    static {
        a.l = new com.dcinside.app.archive.page.a.a(null);
    }

    public a(@l A3.a a0, @l A3.a a1, @l o o0, @l o o1, @m Function1 function10) {
        L.p(a0, "funGetArchiveList");
        L.p(a1, "funGetFilteredArchiveList");
        L.p(o0, "funcCreateHolder");
        L.p(o1, "funcBindHolder");
        super();
        this.a = a0;
        this.b = a1;
        this.c = o0;
        this.d = o1;
        this.e = function10;
        this.g = new HashSet();
        this.h = -1;
    }

    public a(A3.a a0, A3.a a1, o o0, o o1, Function1 function10, int v, w w0) {
        if((v & 16) != 0) {
            function10 = null;
        }
        this(a0, a1, o0, o1, function10);
    }

    @m
    public final String A() {
        return this.j;
    }

    public final boolean B() {
        return this.k;
    }

    public final void C(@l HashSet hashSet0) {
        L.p(hashSet0, "<set-?>");
        this.g = hashSet0;
    }

    public final void D(@m List list0) {
        this.f = list0;
        this.notifyDataSetChanged();
    }

    public final void E(boolean z) {
        this.k = z;
    }

    public final void F(int v) {
        this.h = v;
    }

    public final void G(@m String s) {
        this.j = s;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        if(this.k) {
            return this.f == null ? 0 : this.f.size();
        }
        g1 g10 = (g1)this.b.invoke();
        return g10 == null || !g10.s() ? 0 : g10.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.k;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.i = new t(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        Context context0 = recyclerView$ViewHolder0.itemView.getContext();
        if(recyclerView$ViewHolder0 instanceof g) {
            c c0 = this.y(v);
            if(c0 != null) {
                String s = c0.R5();
                ((g)recyclerView$ViewHolder0).a.setText(s);
                g1 g10 = (g1)this.a.invoke();
                int v1 = u.s((g10 == null ? null : g10.x4()), s);
                String s1 = context0.getString(0x7F1507D3, new Object[]{Dl.a.format(((long)v1))});  // string:post_read_ip_wrapper "(%s)"
                L.o(s1, "getString(...)");
                ((g)recyclerView$ViewHolder0).b.setText(s1);
                int v2 = Dl.h(((g)recyclerView$ViewHolder0).b, s1);
                ((g)recyclerView$ViewHolder0).a.setMaxWidth(-v2 - 41);
            }
        }
        else {
            d1 d10 = this.w(v);
            if(d10 != null) {
                this.d.invoke(recyclerView$ViewHolder0, d10);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        Context context0 = viewGroup0.getContext();
        switch(v) {
            case 0: {
                LayoutInflater layoutInflater1 = LayoutInflater.from(context0);
                L.o(layoutInflater1, "from(...)");
                return (ViewHolder)this.c.invoke(layoutInflater1, viewGroup0);
            }
            case 1: {
                View view0 = LayoutInflater.from(context0).inflate(0x7F0E01D4, viewGroup0, false);  // layout:view_folder_archive_item
                L.m(view0);
                return new g(view0);
            }
            default: {
                LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
                L.o(layoutInflater0, "from(...)");
                return (ViewHolder)this.c.invoke(layoutInflater0, viewGroup0);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        this.i = null;
    }

    @Override  // com.futuremind.recyclerviewfastscroll.b
    @l
    public String p(int v) {
        return "";
    }

    public final void v(boolean z, int v) {
        Context context0;
        t t0 = this.i;
        AppCompatActivity appCompatActivity0 = null;
        if(t0 == null) {
            context0 = null;
        }
        else {
            RecyclerView recyclerView0 = (RecyclerView)t0.a();
            context0 = recyclerView0 == null ? null : recyclerView0.getContext();
        }
        if(context0 == null) {
            return;
        }
        d1 d10 = this.w(v);
        d0 d00 = d10 instanceof d0 ? ((d0)d10) : null;
        if(d00 != null) {
            String s = d00.W5();
            if(s != null) {
                if(z) {
                    if(this.g.contains(s)) {
                        return;
                    }
                    if(this.g.size() < this.h) {
                        this.g.add(s);
                    }
                    else {
                        if(context0 instanceof AppCompatActivity) {
                            appCompatActivity0 = (AppCompatActivity)context0;
                        }
                        if(appCompatActivity0 != null) {
                            com.dcinside.app.internal.c.v(appCompatActivity0, 0x7F15094E);  // string:series_post_append_limit "추가할 수 있는 게시물 개수를 초과했습니다."
                        }
                    }
                }
                else {
                    this.g.remove(s);
                }
                Function1 function10 = this.e;
                if(function10 != null) {
                    function10.invoke(this.g.size());
                }
                this.notifyItemChanged(v);
            }
        }
    }

    @m
    public final d1 w(int v) {
        g1 g10 = (g1)this.b.invoke();
        return g10 == null ? null : ((d1)g10.get(v));
    }

    @l
    public final HashSet x() {
        return this.g;
    }

    @m
    public final c y(int v) {
        return this.f == null ? null : ((c)this.f.get(v));
    }

    public final int z() {
        return this.h;
    }
}

