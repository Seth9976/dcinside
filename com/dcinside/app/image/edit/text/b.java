package com.dcinside.app.image.edit.text;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageEditTextAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditTextAdapter.kt\ncom/dcinside/app/image/edit/text/ImageEditTextAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,64:1\n147#2:65\n*S KotlinDebug\n*F\n+ 1 ImageEditTextAdapter.kt\ncom/dcinside/app/image/edit/text/ImageEditTextAdapter\n*L\n30#1:65\n*E\n"})
public final class b extends Adapter {
    public interface a {
        void S(int arg1);
    }

    @l
    private final String a;
    private boolean b;
    private int c;
    @l
    private final com.dcinside.app.image.edit.text.a[] d;
    @l
    private final t e;

    public b(@l a b$a0, @l String s) {
        L.p(b$a0, "callback");
        L.p(s, "path");
        super();
        this.a = s;
        this.c = 0xFF000000;
        this.d = com.dcinside.app.image.edit.text.a.values();
        this.e = new t(b$a0);
    }

    public final void A(int v) {
        a b$a0 = (a)this.e.a();
        if(b$a0 != null) {
            b$a0.S(v);
        }
    }

    public final void B(int v) {
        this.c = v;
        this.notifyItemChanged(kotlin.collections.l.If(this.d, com.dcinside.app.image.edit.text.a.e));
    }

    public final void C(boolean z) {
        this.b = z;
        this.notifyDataSetChanged();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.d.length;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.y(((e)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.z(viewGroup0, v);
    }

    public final int v() {
        return this.c;
    }

    @l
    public final String w() {
        return this.a;
    }

    public final boolean x() {
        return this.b;
    }

    public void y(@l e e0, int v) {
        L.p(e0, "holder");
        float f = v == 0 || this.b ? 1.0f : 0.5f;
        com.dcinside.app.image.edit.text.a a0 = this.d[v];
        if(a0 == com.dcinside.app.image.edit.text.a.e) {
            e0.i().setBackgroundColor(this.c);
            e0.i().setImageDrawable(null);
        }
        else {
            e0.i().setBackground(null);
            r.d0(e0.i(), a0.c());
        }
        r.o0(e0.j(), a0.d());
        e0.i().setAlpha(f);
        e0.j().setAlpha(f);
    }

    @l
    public e z(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new e(viewGroup0);
    }
}

