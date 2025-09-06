package com.dcinside.app.write.menu.ai;

import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.realm.b;
import io.realm.g1;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nRecentAiPromptAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentAiPromptAdapter.kt\ncom/dcinside/app/write/menu/ai/RecentAiPromptAdapter\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n177#2,9:121\n257#3,2:130\n257#3,2:133\n257#3,2:135\n257#3,2:137\n50#4:132\n50#4:139\n78#4,4:140\n78#4,4:147\n78#4,4:151\n1872#5,3:144\n*S KotlinDebug\n*F\n+ 1 RecentAiPromptAdapter.kt\ncom/dcinside/app/write/menu/ai/RecentAiPromptAdapter\n*L\n29#1:121,9\n35#1:130,2\n37#1:133,2\n38#1:135,2\n39#1:137,2\n36#1:132\n59#1:139\n75#1:140,4\n99#1:147,4\n107#1:151,4\n84#1:144,3\n*E\n"})
public final class v0 extends Adapter {
    public interface a {
        void O(boolean arg1, boolean arg2);
    }

    @m
    private final a a;
    @l
    private ArrayList b;
    @l
    private SparseBooleanArray c;
    private boolean d;
    private boolean e;

    public v0() {
        this(null, 1, null);
    }

    public v0(@m a v0$a0) {
        this.a = v0$a0;
        this.b = new ArrayList();
        this.c = new SparseBooleanArray();
    }

    public v0(a v0$a0, int v, w w0) {
        if((v & 1) != 0) {
            v0$a0 = null;
        }
        this(v0$a0);
    }

    private final boolean A() {
        if(this.c.size() < this.b.size()) {
            return false;
        }
        SparseBooleanArray sparseBooleanArray0 = this.c;
        int v = sparseBooleanArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseBooleanArray0.keyAt(v1);
            if(!sparseBooleanArray0.valueAt(v1)) {
                return false;
            }
        }
        return true;
    }

    public void B(@l u0 u00, int v) {
        L.p(u00, "holder");
        try {
            b b0 = null;
            b0 = (b)this.b.get(v);
        }
        catch(Exception unused_ex) {
        }
        if(b0 == null) {
            return;
        }
        new String("");
        u00.m().setText("");
        int v1 = 8;
        u00.k().setVisibility((this.d ? 0 : 8));
        u00.k().setChecked(this.c.get(v, false));
        u00.l().setVisibility((this.e ? 8 : 0));
        u00.n().setVisibility((this.e ? 8 : 0));
        View view0 = u00.o();
        if(this.e) {
            v1 = 0;
        }
        view0.setVisibility(v1);
        u00.i(this.e);
    }

    @l
    public u0 C(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0257, viewGroup0, false);  // layout:view_recent_ai_item
        L.m(view0);
        return new u0(view0);
    }

    public final void D(boolean z) {
        if(this.d == z) {
            return;
        }
        this.d = z;
        this.notifyItemRangeChanged(0, this.b.size());
    }

    public final void E(int v) {
        boolean z = this.c.get(v, false);
        this.c.put(v, !z);
        a v0$a0 = this.a;
        if(v0$a0 != null) {
            v0$a0.O(this.z(), this.A());
        }
        this.notifyItemChanged(v);
    }

    public final void F(boolean z) {
        if(z) {
            int v = 0;
            for(Object object0: this.b) {
                if(v < 0) {
                    u.Z();
                }
                b b0 = (b)object0;
                this.c.put(v, true);
                ++v;
            }
        }
        else {
            this.c.clear();
        }
        a v0$a0 = this.a;
        if(v0$a0 != null) {
            v0$a0.O(this.z(), this.A());
        }
        this.notifyItemRangeChanged(0, this.b.size());
    }

    public final void G(@l g1 g10) {
        L.p(g10, "results");
        this.b.clear();
        this.b.addAll(g10);
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.B(((u0)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.C(viewGroup0, v);
    }

    public final void v() {
        this.e = true;
    }

    @l
    public final ArrayList w() {
        ArrayList arrayList0 = new ArrayList();
        SparseBooleanArray sparseBooleanArray0 = this.c;
        int v = sparseBooleanArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = sparseBooleanArray0.keyAt(v1);
            if(sparseBooleanArray0.valueAt(v1)) {
                arrayList0.add(this.b.get(v2));
            }
        }
        return arrayList0;
    }

    @l
    public final b x(int v) {
        Object object0 = this.b.get(v);
        L.o(object0, "get(...)");
        return (b)object0;
    }

    @m
    public final a y() {
        return this.a;
    }

    private final boolean z() {
        SparseBooleanArray sparseBooleanArray0 = this.c;
        int v = sparseBooleanArray0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            sparseBooleanArray0.keyAt(v1);
            if(sparseBooleanArray0.valueAt(v1)) {
                return true;
            }
        }
        return false;
    }
}

