package com.dcinside.app.write.temp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.t;
import com.dcinside.app.realm.j0;
import com.dcinside.app.util.Bk;
import io.realm.F0;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nPostTempAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTempAdapter.kt\ncom/dcinside/app/write/temp/PostTempAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,76:1\n147#2:77\n257#3,2:78\n257#3,2:80\n255#3,4:82\n*S KotlinDebug\n*F\n+ 1 PostTempAdapter.kt\ncom/dcinside/app/write/temp/PostTempAdapter\n*L\n14#1:77\n36#1:78,2\n37#1:80,2\n38#1:82,4\n*E\n"})
public final class i extends Adapter {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final t a;
    @l
    public static final a b = null;
    public static final int c = 0;
    public static final int d = 1;

    static {
        i.b = new a(null);
    }

    public i(@l k k0) {
        L.p(k0, "itemManager");
        super();
        this.a = new t(k0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        k k0 = (k)this.a.a();
        return k0 == null ? 0 : k0.g();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.v(v) == null ? 1 : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(@l ViewHolder recyclerView$ViewHolder0, int v) {
        L.p(recyclerView$ViewHolder0, "holder");
        j0 j00 = this.v(v);
        if(j00 == null) {
            return;
        }
        if(recyclerView$ViewHolder0 instanceof com.dcinside.app.write.temp.l) {
            ((com.dcinside.app.write.temp.l)recyclerView$ViewHolder0).j().setText(j00.R5());
            ((com.dcinside.app.write.temp.l)recyclerView$ViewHolder0).k().setText(Bk.J(j00.T5()));
            boolean z = true;
            int v1 = 8;
            ((com.dcinside.app.write.temp.l)recyclerView$ViewHolder0).e().setVisibility((j00.S5() == 1L ? 8 : 0));
            CheckBox checkBox0 = ((com.dcinside.app.write.temp.l)recyclerView$ViewHolder0).f();
            k k0 = (k)this.a.a();
            checkBox0.setVisibility((k0 == null || !k0.k() ? 8 : 0));
            View view0 = ((com.dcinside.app.write.temp.l)recyclerView$ViewHolder0).i();
            if(((com.dcinside.app.write.temp.l)recyclerView$ViewHolder0).f().getVisibility() != 0) {
                v1 = 0;
            }
            view0.setVisibility(v1);
            CheckBox checkBox1 = ((com.dcinside.app.write.temp.l)recyclerView$ViewHolder0).f();
            k k1 = (k)this.a.a();
            if(k1 == null || !k1.i(j00)) {
                z = false;
            }
            checkBox1.setChecked(z);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    @l
    public ViewHolder onCreateViewHolder(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        if(v == 0) {
            View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0289, viewGroup0, false);  // layout:view_temp_item
            L.m(view0);
            return new com.dcinside.app.write.temp.l(view0);
        }
        View view1 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E028A, viewGroup0, false);  // layout:view_temp_msg
        L.m(view1);
        return new m(view1);
    }

    @y4.m
    public final j0 v(int v) {
        try {
            k k0 = (k)this.a.a();
            return k0 == null ? null : k0.f(v);
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public final void w(int v) {
        j0 j00 = this.v(v);
        if(j00 != null && j00.s()) {
            F0 f00 = j00.D5();
            L.o(f00, "getRealm(...)");
            List list0 = u.k(j00);
            j0.h.b(f00, list0);
            this.notifyItemRemoved(v);
        }
    }
}

