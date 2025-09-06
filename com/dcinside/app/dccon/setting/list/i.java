package com.dcinside.app.dccon.setting.list;

import Z.b;
import Z.c;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.Application;
import com.dcinside.app.model.p;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.jl;
import com.facebook.drawee.backends.pipeline.d;
import com.facebook.drawee.backends.pipeline.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class i extends Adapter implements b {
    @l
    private List a;
    @l
    private SparseBooleanArray b;
    @l
    private final SparseIntArray c;
    @l
    private ItemTouchHelper d;

    public i() {
        this.a = new ArrayList();
        this.b = new SparseBooleanArray();
        this.c = new SparseIntArray();
        this.d = new ItemTouchHelper(new c(this, false));
    }

    @l
    public com.dcinside.app.dccon.setting.list.l A(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new com.dcinside.app.dccon.setting.list.l(viewGroup0);
    }

    public final boolean B(int v, boolean z) {
        if(z) {
            int v1 = this.b.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                if(this.b.valueAt(v2)) {
                    ++v3;
                }
            }
            long v4 = jl.a.Z();
            if(((long)v3) >= v4) {
                Context context0 = Application.e.c();
                String s = context0.getString(0x7F150965, new Object[]{v4});  // string:setting_dccon_list_failed_max "사용 디시콘은 %1$d개까지만 선택 가능합니다.\n사용 해제 후 변경해주세요."
                L.o(s, "getString(...)");
                Dl.G(context0, s);
                return false;
            }
        }
        int v5 = ((p)this.a.get(v)).s();
        this.b.put(v5, z);
        return true;
    }

    public final void C(@l SparseBooleanArray sparseBooleanArray0) {
        L.p(sparseBooleanArray0, "<set-?>");
        this.b = sparseBooleanArray0;
    }

    public final void D(@l com.dcinside.app.response.b b0) {
        L.p(b0, "response");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = b0.h();
        if(arrayList1 != null) {
            arrayList0.addAll(arrayList1);
            int v = arrayList1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arrayList1.get(v1);
                L.o(object0, "get(...)");
                int v2 = ((p)object0).s();
                this.b.put(v2, true);
                this.c.put(v2, v1);
            }
        }
        ArrayList arrayList2 = b0.g();
        if(arrayList2 != null) {
            arrayList0.addAll(arrayList2);
        }
        DiffResult diffUtil$DiffResult0 = DiffUtil.b(new j(arrayList0, this.a));
        L.o(diffUtil$DiffResult0, "calculateDiff(...)");
        this.a.clear();
        this.a.addAll(arrayList0);
        diffUtil$DiffResult0.e(this);
    }

    public final void E(@l List list0) {
        L.p(list0, "<set-?>");
        this.a = list0;
    }

    public final void F(@l ItemTouchHelper itemTouchHelper0) {
        L.p(itemTouchHelper0, "<set-?>");
        this.d = itemTouchHelper0;
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
            p p0 = (p)this.a.remove(v);
            this.a.add(v1, p0);
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
    public void onAttachedToRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView0);
        this.d.m(recyclerView0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.z(((com.dcinside.app.dccon.setting.list.l)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.A(viewGroup0, v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onDetachedFromRecyclerView(@l RecyclerView recyclerView0) {
        L.p(recyclerView0, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView0);
        this.d.m(null);
    }

    @Override  // Z.b
    public void q(int v) {
        if(v >= 0 && v < this.a.size()) {
            this.a.remove(v);
            this.notifyItemRemoved(v);
        }
    }

    @l
    public final SparseBooleanArray v() {
        return this.b;
    }

    @l
    public final List w() {
        return this.a;
    }

    @l
    public final ItemTouchHelper x() {
        return this.d;
    }

    public final boolean y() {
        int v = this.a.size();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = ((p)this.a.get(v1)).s();
            boolean z = this.b.get(v2);
            int v3 = this.c.get(v2, -1);
            if(z) {
                if(v3 < 0) {
                    return true;
                }
                if(v1 != v3) {
                    return true;
                }
            }
            else if(v3 >= 0) {
                return true;
            }
        }
        return false;
    }

    public void z(@l com.dcinside.app.dccon.setting.list.l l0, int v) {
        L.p(l0, "holder");
        p p0 = (p)this.a.get(v);
        l0.c.setText(p0.t());
        l0.a.setChecked(this.b.get(p0.s()));
        l0.b.setController(((f)d.j().j0(p0.r()).U(l0.b.getController())).e());
    }
}

