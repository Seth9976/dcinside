package com.dcinside.app.settings.recent;

import Z.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import io.realm.F0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nRecentOrderAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentOrderAdapter.kt\ncom/dcinside/app/settings/recent/RecentOrderAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,101:1\n1782#2,4:102\n774#2:106\n865#2,2:107\n774#2:109\n865#2,2:110\n257#3,2:112\n*S KotlinDebug\n*F\n+ 1 RecentOrderAdapter.kt\ncom/dcinside/app/settings/recent/RecentOrderAdapter\n*L\n22#1:102,4\n26#1:106\n26#1:107,2\n28#1:109\n28#1:110,2\n51#1:112,2\n*E\n"})
public final class g extends Adapter implements b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class com.dcinside.app.settings.recent.g.b extends ViewHolder {
        public com.dcinside.app.settings.recent.g.b(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
        }
    }

    @l
    private final ArrayList a;
    private int b;
    private int c;
    @l
    public static final a d = null;
    private static final int e = 0;
    private static final int f = 1;

    static {
        g.d = new a(null);
    }

    public g() {
        this.a = new ArrayList();
    }

    @Override  // Z.b
    public void e(int v) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter, Z.b
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.a.get(v) == null ? 1 : 0;
    }

    @Override  // Z.b
    public boolean l(int v, int v1) {
        int v2 = this.a.size();
        if(v >= 0 && v2 > v && v1 >= 0 && v2 > v1 && v1 < this.c) {
            com.dcinside.app.realm.s0 s00 = (com.dcinside.app.realm.s0)this.a.remove(v);
            this.a.add(v1, s00);
            this.notifyItemMoved(v, v1);
            return true;
        }
        return false;
    }

    @Override  // Z.b
    public void m(int v) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        int v1 = 0;
        L.p(recyclerView$ViewHolder0, "holder");
        com.dcinside.app.realm.s0 s00 = (com.dcinside.app.realm.s0)this.a.get(v);
        if(s00 == null) {
            return;
        }
        if(recyclerView$ViewHolder0 instanceof j) {
            boolean z = s00.U5() > 0;
            ((j)recyclerView$ViewHolder0).l().setText(s00.S5());
            ((j)recyclerView$ViewHolder0).j().setSelected(z);
            View view0 = ((j)recyclerView$ViewHolder0).k();
            if(!z) {
                v1 = 8;
            }
            view0.setVisibility(v1);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        if(v == 0) {
            View view0 = layoutInflater0.inflate(0x7F0E025C, viewGroup0, false);  // layout:view_recent_setting_item
            L.m(view0);
            return new j(view0);
        }
        View view1 = layoutInflater0.inflate(0x7F0E01FA, viewGroup0, false);  // layout:view_item_recent_gallery_divider
        L.m(view1);
        return new com.dcinside.app.settings.recent.g.b(view1);
    }

    @Override  // Z.b
    public void q(int v) {
        if(v >= 0 && v < this.a.size()) {
            this.a.remove(v);
            this.notifyItemRemoved(v);
        }
    }

    @l
    public final List v() {
        return this.a;
    }

    public final void w(@l Context context0, int v) {
        L.p(context0, "context");
        com.dcinside.app.base.g g0 = context0 instanceof com.dcinside.app.base.g ? ((com.dcinside.app.base.g)context0) : null;
        if(g0 != null) {
            F0 f00 = g0.F1();
            if(f00 != null) {
                com.dcinside.app.realm.s0 s00 = (com.dcinside.app.realm.s0)this.a.get(v);
                if(s00 == null) {
                    return;
                }
                int v1 = s00.U5() <= 0 ? 0 : 1;
                com.dcinside.app.realm.s0.j.o(f00, s00, ((boolean)(v1 ^ 1)));
            }
        }
    }

    public final void x(@l List list0) {
        int v1;
        L.p(list0, "items");
        int v = list0.hashCode();
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            v1 = 0;
            for(Object object0: list0) {
                com.dcinside.app.realm.s0 s00 = (com.dcinside.app.realm.s0)object0;
                if((s00 == null ? 0 : s00.U5()) > 0) {
                    ++v1;
                    if(v1 < 0) {
                        u.Y();
                    }
                }
            }
        }
        else {
            v1 = 0;
        }
        if(this.b != v || this.c != v1) {
            this.b = v;
            this.a.clear();
            ArrayList arrayList0 = this.a;
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: list0) {
                com.dcinside.app.realm.s0 s01 = (com.dcinside.app.realm.s0)object1;
                if((s01 == null ? 0 : s01.U5()) > 0) {
                    arrayList1.add(object1);
                }
            }
            arrayList0.addAll(arrayList1);
            this.a.add(null);
            ArrayList arrayList2 = this.a;
            ArrayList arrayList3 = new ArrayList();
            for(Object object2: list0) {
                if(((com.dcinside.app.realm.s0)object2) != null && ((com.dcinside.app.realm.s0)object2).U5() == 0) {
                    arrayList3.add(object2);
                }
            }
            arrayList2.addAll(arrayList3);
            this.c = v1;
            this.notifyDataSetChanged();
        }
    }
}

