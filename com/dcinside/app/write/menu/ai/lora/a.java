package com.dcinside.app.write.menu.ai.lora;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.write.menu.ai.type.LoraModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAiLoraAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiLoraAdapter.kt\ncom/dcinside/app/write/menu/ai/lora/AiLoraAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n257#2,2:137\n257#2,2:139\n257#2,2:141\n257#2,2:143\n257#2,2:145\n257#2,2:147\n295#3,2:149\n*S KotlinDebug\n*F\n+ 1 AiLoraAdapter.kt\ncom/dcinside/app/write/menu/ai/lora/AiLoraAdapter\n*L\n45#1:137,2\n46#1:139,2\n47#1:141,2\n49#1:143,2\n50#1:145,2\n51#1:147,2\n75#1:149,2\n*E\n"})
public final class a extends Adapter {
    @l
    private final h a;
    private final boolean b;
    @l
    private final List c;
    @l
    private final List d;

    public a(@l h h0, boolean z) {
        L.p(h0, "listener");
        super();
        this.a = h0;
        this.b = z;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public void A(@l b b0, int v) {
        L.p(b0, "holder");
        LoraModel loraModel0 = (LoraModel)this.c.get(v);
        String s = loraModel0.d();
        if(s == null || s.length() == 0) {
            b0.j().setVisibility(4);
        }
        else {
            b0.j().setVisibility(0);
            com.dcinside.app.glide.a.l(b0.j()).t0(s).q1(b0.j());
        }
        b0.k().setText(loraModel0.f());
        if(this.d.contains(loraModel0)) {
            b0.l().setVisibility(0);
            b0.i().setVisibility(0);
            b0.h().setVisibility(0);
            return;
        }
        b0.l().setVisibility(8);
        b0.i().setVisibility(8);
        b0.h().setVisibility(8);
    }

    @l
    public b B(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        View view0 = this.b ? layoutInflater0.inflate(0x7F0E01F5, viewGroup0, false) : layoutInflater0.inflate(0x7F0E01F4, viewGroup0, false);  // layout:view_item_lora_type_ai_grid
        L.m(view0);
        return new b(view0);
    }

    public final void C(int v) {
        Object object0 = null;
        LoraModel loraModel0 = (LoraModel)this.c.get(v);
        for(Object object1: this.d) {
            if(L.g(((LoraModel)object1), loraModel0)) {
                object0 = object1;
                break;
            }
        }
        if(((LoraModel)object0) == null) {
            return;
        }
        this.a.i(((LoraModel)object0), true);
    }

    public final void D(@l LoraModel loraModel0) {
        L.p(loraModel0, "item");
        this.d.remove(loraModel0);
        this.notifyDataSetChanged();
    }

    public final void E(@l List list0) {
        L.p(list0, "list");
        DiffResult diffUtil$DiffResult0 = DiffUtil.b(new c(list0, this.c));
        L.o(diffUtil$DiffResult0, "calculateDiff(...)");
        this.c.clear();
        this.c.addAll(list0);
        diffUtil$DiffResult0.e(this);
    }

    public final void F(@l List list0) {
        L.p(list0, "list");
        DiffResult diffUtil$DiffResult0 = DiffUtil.b(new c(list0, this.d));
        L.o(diffUtil$DiffResult0, "calculateDiff(...)");
        this.d.clear();
        this.d.addAll(list0);
        diffUtil$DiffResult0.e(this);
    }

    public final void e(int v) {
        LoraModel loraModel0 = (LoraModel)this.c.get(v);
        if(this.d.contains(loraModel0)) {
            this.D(loraModel0);
            this.a.Z(loraModel0);
            return;
        }
        this.a.i(loraModel0, false);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.A(((b)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.B(viewGroup0, v);
    }

    public final void v(@l LoraModel loraModel0) {
        L.p(loraModel0, "item");
        if(this.d.contains(loraModel0)) {
            this.d.remove(loraModel0);
        }
        this.d.add(loraModel0);
        this.notifyDataSetChanged();
    }

    @l
    public final h w() {
        return this.a;
    }

    public final int x() {
        return this.d.size();
    }

    @l
    public final List y() {
        return this.d;
    }

    public final boolean z() {
        return this.b;
    }
}

