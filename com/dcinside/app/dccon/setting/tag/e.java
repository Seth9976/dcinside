package com.dcinside.app.dccon.setting.tag;

import Y.h4;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.model.p;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class e extends Adapter {
    @l
    private List a;

    public e() {
        this.a = u.H();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.v(((i)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.w(viewGroup0, v);
    }

    public void v(@l i i0, int v) {
        L.p(i0, "holder");
        i0.m(((p)this.a.get(v)));
    }

    @l
    public i w(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        h4 h40 = h4.d(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        L.o(h40, "inflate(...)");
        return new i(h40);
    }

    public final void x(@l List list0) {
        L.p(list0, "items");
        this.a = list0;
        this.notifyItemRangeChanged(0, this.getItemCount());
    }
}

