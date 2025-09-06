package com.dcinside.app.image.edit.filter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.image.edit.filter.custom.m;
import com.dcinside.app.internal.t;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageEditFilterAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditFilterAdapter.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,46:1\n147#2:47\n*S KotlinDebug\n*F\n+ 1 ImageEditFilterAdapter.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterAdapter\n*L\n17#1:47\n*E\n"})
public final class a extends Adapter {
    public interface com.dcinside.app.image.edit.filter.a.a {
        void L(@l Y2.a arg1);
    }

    @l
    private final V[] a;
    @l
    private final String b;
    @l
    private final t c;

    public a(@l com.dcinside.app.image.edit.filter.a.a a$a0, @l V[] arr_v, @l String s) {
        L.p(a$a0, "callback");
        L.p(arr_v, "filters");
        L.p(s, "path");
        super();
        this.a = arr_v;
        this.b = s;
        this.c = new t(a$a0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.a.length;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.w(((c)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.x(viewGroup0, v);
    }

    @l
    public final String v() {
        return this.b;
    }

    public void w(@l c c0, int v) {
        L.p(c0, "holder");
        V v1 = this.a[v];
        c0.j().setText(((String)v1.a()));
        com.dcinside.app.glide.a.l(c0.i()).g0().V2(new m(((Y2.a)v1.b()))).v2(this.b).q1(c0.i());
    }

    @l
    public c x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new c(viewGroup0);
    }

    public final void y(int v) {
        com.dcinside.app.image.edit.filter.a.a a$a0 = (com.dcinside.app.image.edit.filter.a.a)this.c.a();
        if(a$a0 != null) {
            a$a0.L(((Y2.a)this.a[v].f()));
        }
    }
}

