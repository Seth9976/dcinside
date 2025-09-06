package com.dcinside.app.settings.block.dccon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.realm.g;
import com.facebook.drawee.backends.pipeline.d;
import io.realm.T0;
import io.realm.g1;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nBlockDcconListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockDcconListAdapter.kt\ncom/dcinside/app/settings/block/dccon/BlockDcconListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,121:1\n1019#2,2:122\n*S KotlinDebug\n*F\n+ 1 BlockDcconListAdapter.kt\ncom/dcinside/app/settings/block/dccon/BlockDcconListAdapter\n*L\n101#1:122,2\n*E\n"})
public final class f extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    public static final class b {
        @m
        private final String a;
        @m
        private final String b;
        @m
        private final Long c;
        private final int d;
        private final long e;

        public b(@m String s, @m String s1, @m Long long0, int v, long v1) {
            this.a = s;
            this.b = s1;
            this.c = long0;
            this.d = v;
            this.e = v1;
        }

        @m
        public final String a() {
            return this.a;
        }

        @m
        public final String b() {
            return this.b;
        }

        @m
        public final Long c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public final long e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof b)) {
                return false;
            }
            if(!L.g(this.a, ((b)object0).a)) {
                return false;
            }
            if(!L.g(this.b, ((b)object0).b)) {
                return false;
            }
            if(!L.g(this.c, ((b)object0).c)) {
                return false;
            }
            return this.d == ((b)object0).d ? this.e == ((b)object0).e : false;
        }

        @l
        public final b f(@m String s, @m String s1, @m Long long0, int v, long v1) {
            return new b(s, s1, long0, v, v1);
        }

        public static b g(b f$b0, String s, String s1, Long long0, int v, long v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                s = f$b0.a;
            }
            if((v2 & 2) != 0) {
                s1 = f$b0.b;
            }
            if((v2 & 4) != 0) {
                long0 = f$b0.c;
            }
            if((v2 & 8) != 0) {
                v = f$b0.d;
            }
            if((v2 & 16) != 0) {
                v1 = f$b0.e;
            }
            return f$b0.f(s, s1, long0, v, v1);
        }

        @m
        public final Long h() {
            return this.c;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            Long long0 = this.c;
            if(long0 != null) {
                v = long0.hashCode();
            }
            return (((v1 * 0x1F + v2) * 0x1F + v) * 0x1F + this.d) * 0x1F + ((int)(this.e ^ this.e >>> 0x20));
        }

        @m
        public final String i() {
            return this.b;
        }

        public final long j() {
            return this.e;
        }

        @m
        public final String k() {
            return this.a;
        }

        public final int l() {
            return this.d;
        }

        @Override
        @l
        public String toString() {
            return "ViewItemBlockData(url=" + this.a + ", title=" + this.b + ", index=" + this.c + ", viewType=" + this.d + ", updateTime=" + this.e + ")";
        }
    }

    @l
    private final ArrayList a;
    @l
    public static final a b = null;
    public static final int c = 0;
    public static final int d = 1;

    static {
        f.b = new a(null);
    }

    public f() {
        this.a = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return ((b)this.a.get(v)).l();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "h");
        b f$b0 = this.v(v);
        if(recyclerView$ViewHolder0 instanceof e) {
            ((e)recyclerView$ViewHolder0).h().setDrawBottom(v != this.getItemCount() - 1);
            ((e)recyclerView$ViewHolder0).f().setText(f$b0.i());
            ((e)recyclerView$ViewHolder0).e().setController(((com.facebook.drawee.backends.pipeline.f)((com.facebook.drawee.backends.pipeline.f)d.j().j0(f$b0.k()).U(((e)recyclerView$ViewHolder0).e().getController())).I(true)).e());
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.settings.block.dccon.d) {
            ((com.dcinside.app.settings.block.dccon.d)recyclerView$ViewHolder0).i().setController(((com.facebook.drawee.backends.pipeline.f)((com.facebook.drawee.backends.pipeline.f)d.j().j0(f$b0.k()).U(((com.dcinside.app.settings.block.dccon.d)recyclerView$ViewHolder0).i().getController())).I(true)).e());
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 0: {
                View view1 = layoutInflater0.inflate(0x7F0E01A0, viewGroup0, false);  // layout:view_block_dccon_group_item
                L.m(view1);
                return new e(view1);
            }
            case 1: {
                View view2 = layoutInflater0.inflate(0x7F0E01A1, viewGroup0, false);  // layout:view_block_dccon_item
                L.m(view2);
                return new com.dcinside.app.settings.block.dccon.d(view2);
            }
            default: {
                View view0 = layoutInflater0.inflate(0x7F0E01A1, viewGroup0, false);  // layout:view_block_dccon_item
                L.m(view0);
                return new com.dcinside.app.settings.block.dccon.d(view0);
            }
        }
    }

    @l
    public final b v(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        return (b)object0;
    }

    public final void w(int v) {
        b f$b0 = this.v(v);
        String s = f$b0.k();
        if(s == null) {
            return;
        }
        Long long0 = f$b0.h();
        if(long0 != null) {
            com.dcinside.app.realm.f.i.g(s, ((long)long0));
        }
    }

    public final void x(@l T0 t00, long v) {
        L.p(t00, "results");
        this.a.clear();
        for(Object object0: t00) {
            b f$b0 = new b("", null, v, 1, ((g)object0).Q5());
            this.a.add(f$b0);
        }
        this.z();
        this.notifyDataSetChanged();
    }

    public final void y(@l g1 g10) {
        L.p(g10, "results");
        this.a.clear();
        for(Object object0: g10) {
            Number number0 = ((com.dcinside.app.realm.f)object0).Q5().x4().G1("blockDate");
            Long long0 = number0 == null ? null : number0.longValue();
            Long long1 = ((com.dcinside.app.realm.f)object0).S5();
            this.a.add(new b("", "", long1, 0, (long0 == null ? System.currentTimeMillis() : ((long)long0))));
        }
        this.z();
        this.notifyDataSetChanged();
    }

    private final void z() {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 BlockDcconListAdapter.kt\ncom/dcinside/app/settings/block/dccon/BlockDcconListAdapter\n*L\n1#1,121:1\n101#2:122\n*E\n"})
        public static final class c implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((b)object1).j(), ((b)object0).j());
            }
        }

        ArrayList arrayList0 = this.a;
        if(arrayList0.size() > 1) {
            u.p0(arrayList0, new c());
        }
    }
}

