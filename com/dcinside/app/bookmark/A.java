package com.dcinside.app.bookmark;

import Z.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.realm.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class a extends Adapter implements b {
    @l
    private List a;
    private int b;

    public a() {
        this.a = new ArrayList();
    }

    @Override  // Z.b
    public void e(int v) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter, Z.b
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // Z.b
    public boolean l(int v, int v1) {
        int v2 = this.a.size();
        if(v >= 0 && v2 > v && v1 >= 0 && v2 > v1) {
            m m0 = (m)this.a.remove(v);
            this.a.add(v1, m0);
            this.notifyItemMoved(v, v1);
            return true;
        }
        this.notifyDataSetChanged();
        return false;
    }

    @Override  // Z.b
    public void m(int v) {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((c)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
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

    public void w(@l c c0, int v) {
        L.p(c0, "holder");
        c0.h().setText(((m)this.a.get(v)).S5());
    }

    @l
    public c x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01D3, viewGroup0, false);  // layout:view_favorite_setting_item
        L.m(view0);
        return new c(view0);
    }

    public final void y(@l List list0) {
        L.p(list0, "items");
        int v = list0.hashCode();
        if(this.b != v) {
            this.b = v;
            this.a.clear();
            this.a.addAll(list0);
            this.notifyDataSetChanged();
        }
    }
}

