package com.dcinside.app.dccon;

import Y.c5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.model.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class e extends Adapter {
    @l
    private final List a;

    public e() {
        this.a = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((f)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    public final void v() {
        this.a.clear();
        this.notifyItemRangeRemoved(0, this.getItemCount());
    }

    public void w(@l f f0, int v) {
        L.p(f0, "holder");
        f0.e(((p)this.a.get(v)));
    }

    @l
    public f x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        c5 c50 = c5.d(LayoutInflater.from(viewGroup0.getContext()), viewGroup0, false);
        L.o(c50, "inflate(...)");
        return new f(c50);
    }

    public final void y(@l List list0) {
        L.p(list0, "iconList");
        this.a.clear();
        this.a.addAll(list0);
        this.notifyDataSetChanged();
    }
}

