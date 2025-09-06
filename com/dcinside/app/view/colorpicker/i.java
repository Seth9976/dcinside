package com.dcinside.app.view.colorpicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nRecentColorListPageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentColorListPageAdapter.kt\ncom/dcinside/app/view/colorpicker/RecentColorListPageAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1557#2:56\n1628#2,3:57\n*S KotlinDebug\n*F\n+ 1 RecentColorListPageAdapter.kt\ncom/dcinside/app/view/colorpicker/RecentColorListPageAdapter\n*L\n36#1:56\n36#1:57,3\n*E\n"})
public final class i extends Adapter {
    @s0({"SMAP\nRecentColorListPageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentColorListPageAdapter.kt\ncom/dcinside/app/view/colorpicker/RecentColorListPageAdapter$PageHolder\n+ 2 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,55:1\n25#2:56\n*S KotlinDebug\n*F\n+ 1 RecentColorListPageAdapter.kt\ncom/dcinside/app/view/colorpicker/RecentColorListPageAdapter$PageHolder\n*L\n49#1:56\n*E\n"})
    public static final class a extends ViewHolder {
        private final RecyclerView a;

        public a(@l View view0) {
            L.p(view0, "itemView");
            super(view0);
            RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B02D3);  // id:color_picker_recent_list
            this.a = recyclerView0;
            f f0 = new f();
            recyclerView0.setLayoutManager(new GridLayoutManager(view0.getContext(), 5, 1, false));
            recyclerView0.setAdapter(f0);
        }

        public final void e(int v, @l List list0) {
            L.p(list0, "colorList");
            L.o(this.a, "list");
            Adapter recyclerView$Adapter0 = this.a.getAdapter();
            if(!(recyclerView$Adapter0 instanceof f)) {
                recyclerView$Adapter0 = null;
            }
            if(((f)recyclerView$Adapter0) != null) {
                ((f)recyclerView$Adapter0).x(v, list0);
            }
        }
    }

    @l
    private List a;

    public i() {
        this.a = u.H();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return (int)(((float)Math.ceil(((float)this.a.size()) / 10.0f)));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((a)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    @l
    public final List v() {
        Iterable iterable0 = this.a;
        List list0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(((Number)object0).intValue());
        }
        return list0;
    }

    public void w(@l a i$a0, int v) {
        L.p(i$a0, "holder");
        i$a0.e(v, this.a);
    }

    @l
    public a x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01B0, viewGroup0, false);  // layout:view_color_picker_recent_list
        L.m(view0);
        return new a(view0);
    }

    public final void y(@l List list0) {
        L.p(list0, "colors");
        this.a = list0;
        this.notifyDataSetChanged();
    }
}

