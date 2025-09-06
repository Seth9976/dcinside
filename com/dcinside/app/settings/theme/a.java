package com.dcinside.app.settings.theme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.type.g;
import kotlin.jvm.internal.L;
import y4.l;

public final class a extends Adapter {
    @l
    private final g[] a;

    public a(boolean z) {
        this.a = z ? g.a.a() : g.a.b();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.length;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((c)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    @l
    public final g v(int v) {
        return this.a[v];
    }

    public void w(@l c c0, int v) {
        L.p(c0, "holder");
        g g0 = this.v(v);
        int v1 = g0.f();
        r.d0(c0.a, v1);
        int v2 = g0.g();
        c0.b.setText(v2);
    }

    @l
    public c x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E028C, viewGroup0, false);  // layout:view_theme
        L.m(view0);
        return new c(view0);
    }
}

