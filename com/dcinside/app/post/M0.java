package com.dcinside.app.post;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.response.PostHead;
import io.realm.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class m0 extends Adapter {
    @l
    private final ArrayList a;
    @l
    private final ArrayList b;

    public m0() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        if(recyclerView$ViewHolder0 instanceof n0) {
            ((n0)recyclerView$ViewHolder0).f().setChecked(!this.b.contains(((PostHead)object0).i()));
            ((n0)recyclerView$ViewHolder0).h().setText(((PostHead)object0).m());
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0224, viewGroup0, false);  // layout:view_post_head_item
        L.m(view0);
        return new n0(view0);
    }

    @l
    public final ArrayList v() {
        return this.b;
    }

    public final void w(int v) {
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        int v1 = ((PostHead)object0).i();
        if(this.b.contains(v1)) {
            this.b.remove(Integer.valueOf(v1));
        }
        else {
            this.b.add(v1);
        }
        this.notifyItemChanged(v);
    }

    public final void x(@l List list0) {
        L.p(list0, "list");
        this.a.clear();
        this.a.addAll(list0);
        this.notifyDataSetChanged();
    }

    public final void y(@l T0 t00) {
        L.p(t00, "list");
        this.b.clear();
        this.b.addAll(t00);
        this.notifyDataSetChanged();
    }
}

