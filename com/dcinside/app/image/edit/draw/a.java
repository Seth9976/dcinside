package com.dcinside.app.image.edit.draw;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageEditDrawAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditDrawAdapter.kt\ncom/dcinside/app/image/edit/draw/ImageEditDrawAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,61:1\n147#2:62\n*S KotlinDebug\n*F\n+ 1 ImageEditDrawAdapter.kt\ncom/dcinside/app/image/edit/draw/ImageEditDrawAdapter\n*L\n15#1:62\n*E\n"})
public final class a extends Adapter {
    public interface com.dcinside.app.image.edit.draw.a.a {
        void l(int arg1);
    }

    @l
    private final String a;
    @l
    private final t b;
    @l
    private final Integer[] c;
    private boolean d;
    private boolean e;

    public a(@l com.dcinside.app.image.edit.draw.a.a a$a0, @l String s) {
        L.p(a$a0, "callback");
        L.p(s, "path");
        super();
        this.a = s;
        this.b = new t(a$a0);
        this.c = new Integer[]{0x7F08037F, 0x7F08037D, 0x7F08037E};  // drawable:image_edit_draw_undo
    }

    public final void A(int v) {
        com.dcinside.app.image.edit.draw.a.a a$a0 = (com.dcinside.app.image.edit.draw.a.a)this.b.a();
        if(a$a0 != null) {
            a$a0.l(v);
        }
    }

    public final void B(boolean z) {
        this.e = z;
        this.notifyItemChanged(1);
    }

    public final void C(boolean z) {
        this.d = z;
        this.notifyItemChanged(0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.c.length;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public void onBindViewHolder(ViewHolder recyclerView$ViewHolder0, int v) {
        this.y(((d)recyclerView$ViewHolder0), v);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.z(viewGroup0, v);
    }

    @l
    public final String v() {
        return this.a;
    }

    public final boolean w() {
        return this.e;
    }

    public final boolean x() {
        return this.d;
    }

    public void y(@l d d0, int v) {
        L.p(d0, "holder");
        r.d0(d0.i(), ((int)this.c[v]));
        float f = 0.2f;
        switch(v) {
            case 0: {
                ImageView imageView0 = d0.i();
                if(this.d) {
                    f = 1.0f;
                }
                imageView0.setAlpha(f);
                return;
            }
            case 1: {
                ImageView imageView1 = d0.i();
                if(this.e) {
                    f = 1.0f;
                }
                imageView1.setAlpha(f);
                return;
            }
            default: {
                d0.i().setAlpha(1.0f);
            }
        }
    }

    @l
    public d z(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new d(viewGroup0);
    }
}

