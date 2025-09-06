package com.dcinside.app.write.menu.ai.sampling;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.write.menu.ai.type.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;
import y4.m;

@s0({"SMAP\nAiSamplingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiSamplingAdapter.kt\ncom/dcinside/app/write/menu/ai/sampling/AiSamplingAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1557#2:79\n1628#2,3:80\n1557#2:83\n1628#2,3:84\n1611#2,9:89\n1863#2:98\n1864#2:100\n1620#2:101\n1557#2:102\n1628#2,3:103\n1557#2:106\n1628#2,3:107\n257#3,2:87\n1#4:99\n*S KotlinDebug\n*F\n+ 1 AiSamplingAdapter.kt\ncom/dcinside/app/write/menu/ai/sampling/AiSamplingAdapter\n*L\n26#1:79\n26#1:80,3\n27#1:83\n27#1:84,3\n63#1:89,9\n63#1:98\n63#1:100\n63#1:101\n68#1:102\n68#1:103,3\n69#1:106\n69#1:107,3\n53#1:87,2\n63#1:99\n*E\n"})
public final class a extends Adapter {
    @l
    private final d a;
    @l
    private final List b;
    @m
    private e c;

    public a(@l d d0) {
        L.p(d0, "listener");
        super();
        this.a = d0;
        this.b = new ArrayList();
    }

    public final void A(@l List list0) {
        L.p(list0, "list");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            e e0 = e.d.a(((String)object0));
            if(e0 != null) {
                arrayList0.add(e0);
            }
        }
        e e1 = this.x();
        e e2 = this.c == null ? ((e)u.G2(arrayList0)) : this.c;
        ArrayList arrayList1 = new ArrayList(u.b0(arrayList0, 10));
        Iterator iterator1 = arrayList0.iterator();
        while(true) {
            boolean z = false;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            if(((e)object1) == e2) {
                z = true;
            }
            arrayList1.add(r0.a(((e)object1), Boolean.valueOf(z)));
        }
        ArrayList arrayList2 = new ArrayList(u.b0(this.b, 10));
        for(Object object2: this.b) {
            arrayList2.add(r0.a(((e)object2), Boolean.valueOf(((e)object2) == e1)));
        }
        DiffResult diffUtil$DiffResult0 = DiffUtil.b(new c(arrayList1, arrayList2));
        L.o(diffUtil$DiffResult0, "calculateDiff(...)");
        this.b.clear();
        this.b.addAll(arrayList0);
        diffUtil$DiffResult0.e(this);
    }

    public final void B(@m e e0) {
        e e1 = this.c;
        if(e0 != e1) {
            if(e1 == null) {
                e1 = (e)u.G2(this.b);
            }
            if(!u.W1(this.b, e0)) {
                e0 = (e)u.G2(this.b);
            }
            ArrayList arrayList0 = new ArrayList(u.b0(this.b, 10));
            Iterator iterator0 = this.b.iterator();
            while(true) {
                boolean z = false;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                if(((e)object0) == e0) {
                    z = true;
                }
                arrayList0.add(r0.a(((e)object0), Boolean.valueOf(z)));
            }
            ArrayList arrayList1 = new ArrayList(u.b0(this.b, 10));
            for(Object object1: this.b) {
                arrayList1.add(r0.a(((e)object1), Boolean.valueOf(((e)object1) == e1)));
            }
            DiffResult diffUtil$DiffResult0 = DiffUtil.b(new c(arrayList0, arrayList1));
            L.o(diffUtil$DiffResult0, "calculateDiff(...)");
            this.c = e0;
            diffUtil$DiffResult0.e(this);
        }
    }

    public final void e(int v) {
        this.B(((e)this.b.get(v)));
        e e0 = this.x();
        this.a.K(e0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.y(((b)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.z(viewGroup0, v);
    }

    @l
    public final d v() {
        return this.a;
    }

    public final int w(@l e e0) {
        L.p(e0, "item");
        return this.b.indexOf(e0);
    }

    @m
    public final e x() {
        return this.c == null ? ((e)u.G2(this.b)) : this.c;
    }

    public void y(@l b b0, int v) {
        L.p(b0, "holder");
        e e0 = (e)this.b.get(v);
        b0.f().setImageResource(e0.c());
        b0.h().setVisibility((e0 == this.x() ? 0 : 8));
    }

    @l
    public b z(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E01FC, viewGroup0, false);  // layout:view_item_sampling_ai
        L.m(view0);
        return new b(view0);
    }
}

