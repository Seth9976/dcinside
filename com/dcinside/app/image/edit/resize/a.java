package com.dcinside.app.image.edit.resize;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageEditResizeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditResizeAdapter.kt\ncom/dcinside/app/image/edit/resize/ImageEditResizeAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,41:1\n147#2:42\n*S KotlinDebug\n*F\n+ 1 ImageEditResizeAdapter.kt\ncom/dcinside/app/image/edit/resize/ImageEditResizeAdapter\n*L\n13#1:42\n*E\n"})
public final class a extends Adapter {
    public interface com.dcinside.app.image.edit.resize.a.a {
        void y(int arg1);
    }

    @l
    private final String a;
    @l
    private final t b;
    @l
    private final Integer[] c;

    public a(@l com.dcinside.app.image.edit.resize.a.a a$a0, @l String s) {
        L.p(a$a0, "callback");
        L.p(s, "path");
        super();
        this.a = s;
        this.b = new t(a$a0);
        this.c = new Integer[]{0xF0, 320, 480, 640, 800, 960, 0x400, 0x800};
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c.length;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.x(((d)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.y(viewGroup0, v);
    }

    public final int v(int v) {
        return (int)this.c[v];
    }

    @l
    public final String w() {
        return this.a;
    }

    public void x(@l d d0, int v) {
        L.p(d0, "holder");
        d0.i().setText(String.valueOf(((int)this.c[v])));
    }

    @l
    public d y(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new d(viewGroup0);
    }

    public final void z(int v) {
        com.dcinside.app.image.edit.resize.a.a a$a0 = (com.dcinside.app.image.edit.resize.a.a)this.b.a();
        if(a$a0 != null) {
            a$a0.y(v);
        }
    }
}

