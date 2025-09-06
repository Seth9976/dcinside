package com.dcinside.app.write.menu.setting;

import android.content.Context;
import android.text.Editable.Factory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.glide.a;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class k extends Adapter {
    @l
    private ArrayList a;

    public k() {
        this.a = new ArrayList();
    }

    @l
    public e A(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0222, viewGroup0, false);  // layout:view_poll_option_item
        L.m(view0);
        return new e(viewGroup0, view0);
    }

    public final void B(@l ArrayList arrayList0) {
        L.p(arrayList0, "<set-?>");
        this.a = arrayList0;
    }

    public final void C(@m String[] arr_s, @m String[] arr_s1) {
        if(arr_s == null) {
            return;
        }
        if(arr_s1 == null) {
            return;
        }
        this.a.clear();
        if(arr_s.length != arr_s1.length) {
            return;
        }
        if(arr_s.length == 0 || arr_s1.length == 0) {
            return;
        }
        for(int v = 0; v < arr_s.length; ++v) {
            this.a.add(new b(arr_s[v], arr_s1[v]));
        }
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.z(((e)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.A(viewGroup0, v);
    }

    public final void v() {
        int v = this.a.size();
        this.a.add(new b(null, null));
        this.notifyItemInserted(v);
    }

    @l
    public final ArrayList w() {
        return this.a;
    }

    public final void x(int v, @l String s) {
        L.p(s, "path");
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        ((b)object0).g(s);
        this.notifyItemChanged(v);
    }

    public final void y() {
        this.a.clear();
        this.a.add(new b(null, null));
        this.a.add(new b(null, null));
        this.notifyDataSetChanged();
    }

    public void z(@l e e0, int v) {
        L.p(e0, "holder");
        Context context0 = e0.itemView.getContext();
        Object object0 = this.a.get(v);
        L.o(object0, "get(...)");
        String s = ((b)object0).f();
        String s1 = ((b)object0).e();
        e0.o().setText((s == null ? null : Editable.Factory.getInstance().newEditable(s)));
        e0.o().setHint(context0.getString(0x7F15079F, new Object[]{((int)(v + 1))}));  // string:poll_option "보기 %d"
        if(s1 != null && s1.length() != 0) {
            e0.k().setVisibility((v.M1(s1, ".gif", true) ? 0 : 8));
            e0.l().setVisibility(8);
            e0.j().setVisibility(0);
            e0.m().setVisibility(0);
            a.l(e0.m()).t0(s1).I2(0x7F08044F).e2(0x7F08044F).S1().q1(e0.m());  // drawable:not_import_img
            return;
        }
        e0.l().setVisibility(0);
        e0.m().setVisibility(8);
        e0.j().setVisibility(8);
        e0.k().setVisibility(8);
    }
}

