package com.dcinside.app.dccon;

import Y.d5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class c extends Adapter {
    @l
    private final List a;

    public c() {
        this.a = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        if(recyclerView$ViewHolder0 instanceof d) {
            ((d)recyclerView$ViewHolder0).e(((String)this.a.get(v)));
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        d5 d50 = d5.d(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        L.o(d50, "inflate(...)");
        return new d(d50);
    }

    @l
    public final String v(int v) {
        return (String)this.a.get(v);
    }

    public final void w(@l List list0) {
        L.p(list0, "tags");
        this.a.clear();
        this.a.addAll(list0);
        this.notifyDataSetChanged();
    }
}

