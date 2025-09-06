package com.dcinside.app.image.edit.menu;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageEditMenuAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditMenuAdapter.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,49:1\n147#2:50\n*S KotlinDebug\n*F\n+ 1 ImageEditMenuAdapter.kt\ncom/dcinside/app/image/edit/menu/ImageEditMenuAdapter\n*L\n14#1:50\n*E\n"})
public final class b extends Adapter {
    public interface a {
        void T(int arg1);
    }

    @l
    private final t a;
    @l
    private final com.dcinside.app.image.edit.menu.a[] b;

    public b(@l a b$a0) {
        L.p(b$a0, "callback");
        super();
        this.a = new t(b$a0);
        this.b = com.dcinside.app.image.edit.menu.a.values();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.length;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.b[v].c() == 0 ? 1 : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((d)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    @l
    public final com.dcinside.app.image.edit.menu.a v(int v) {
        return this.b[v];
    }

    public void w(@l d d0, int v) {
        L.p(d0, "holder");
        com.dcinside.app.image.edit.menu.a a0 = this.b[v];
        r.d0(d0.i(), a0.c());
        r.o0(d0.j(), a0.d());
    }

    @l
    public d x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new d(viewGroup0);
    }

    public final void y(int v) {
        a b$a0 = (a)this.a.a();
        if(b$a0 != null) {
            b$a0.T(v);
        }
    }
}

