package com.dcinside.app.write.menu.ai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class o0 extends Adapter {
    public interface a {
        void m(@l String arg1);
    }

    @l
    private final a a;
    @l
    private final ArrayList b;

    public o0(@l a o0$a0) {
        L.p(o0$a0, "listener");
        super();
        this.a = o0$a0;
        this.b = new ArrayList();
    }

    public final void e(int v) {
        Object object0 = this.b.get(v);
        L.o(object0, "get(...)");
        this.a.m(((String)object0));
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((p0)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    @l
    public final a v() {
        return this.a;
    }

    public void w(@l p0 p00, int v) {
        L.p(p00, "holder");
        p00.f().setText(((CharSequence)this.b.get(v)));
    }

    @l
    public p0 x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01FB, viewGroup0, false);  // layout:view_item_recommend_ai_prompt
        L.m(view0);
        return new p0(view0);
    }

    public final void y(@l List list0) {
        L.p(list0, "list");
        this.b.clear();
        this.b.addAll(list0);
        this.notifyDataSetChanged();
    }
}

