package com.dcinside.app.image.edit.stcker;

import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.internal.t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageEditStickerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditStickerAdapter.kt\ncom/dcinside/app/image/edit/stcker/ImageEditStickerAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,54:1\n147#2:55\n*S KotlinDebug\n*F\n+ 1 ImageEditStickerAdapter.kt\ncom/dcinside/app/image/edit/stcker/ImageEditStickerAdapter\n*L\n31#1:55\n*E\n"})
public final class a extends Adapter {
    public interface com.dcinside.app.image.edit.stcker.a.a {
        void g(@DrawableRes int arg1);
    }

    @l
    private final String a;
    @l
    private final Integer[] b;
    @l
    private final t c;

    public a(@l com.dcinside.app.image.edit.stcker.a.a a$a0, @l String s) {
        L.p(a$a0, "callback");
        L.p(s, "path");
        super();
        this.a = s;
        this.b = new Integer[]{0x7F0806CA, 0x7F0806CB, 0x7F0806CC, 0x7F0806CD, 0x7F0806CE, 0x7F0806CF, 0x7F0806D0, 0x7F0806D1, 0x7F0806D2, 0x7F0806D3, 0x7F0806D4, 0x7F0806D5};  // drawable:sticker_001
        this.c = new t(a$a0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.length;
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
        return this.a;
    }

    public void w(@l c c0, int v) {
        L.p(c0, "holder");
        r.d0(c0.i(), ((int)this.b[v]));
    }

    @l
    public c x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new c(viewGroup0);
    }

    public final void y(int v) {
        com.dcinside.app.image.edit.stcker.a.a a$a0 = (com.dcinside.app.image.edit.stcker.a.a)this.c.a();
        if(a$a0 != null) {
            a$a0.g(((int)this.b[v]));
        }
    }
}

