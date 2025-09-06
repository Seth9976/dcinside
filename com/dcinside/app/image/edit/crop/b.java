package com.dcinside.app.image.edit.crop;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageEditCropAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditCropAdapter.kt\ncom/dcinside/app/image/edit/crop/ImageEditCropAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,44:1\n147#2:45\n*S KotlinDebug\n*F\n+ 1 ImageEditCropAdapter.kt\ncom/dcinside/app/image/edit/crop/ImageEditCropAdapter\n*L\n14#1:45\n*E\n"})
public final class b extends Adapter {
    public interface a {
        void G(int arg1);
    }

    @l
    private final String a;
    @l
    private final t b;
    @l
    private final com.dcinside.app.image.edit.crop.a[] c;

    public b(@l a b$a0, @l String s) {
        L.p(b$a0, "callback");
        L.p(s, "path");
        super();
        this.a = s;
        this.b = new t(b$a0);
        this.c = com.dcinside.app.image.edit.crop.a.values();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c.length;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemViewType(int v) {
        return this.c[v].c() == 0 ? 1 : 0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((e)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    @l
    public final String v() {
        return this.a;
    }

    public void w(@l e e0, int v) {
        L.p(e0, "holder");
        r.o0(e0.i(), this.c[v].d());
    }

    @l
    public e x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new e(viewGroup0);
    }

    public final void y(int v) {
        a b$a0 = (a)this.b.a();
        if(b$a0 != null) {
            b$a0.G(v);
        }
    }
}

