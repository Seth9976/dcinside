package com.dcinside.app.image.edit.emoji;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.Application;
import com.dcinside.app.image.edit.d;
import com.dcinside.app.internal.t;
import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nImageEditEmojiAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditEmojiAdapter.kt\ncom/dcinside/app/image/edit/emoji/ImageEditEmojiAdapter\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,40:1\n147#2:41\n*S KotlinDebug\n*F\n+ 1 ImageEditEmojiAdapter.kt\ncom/dcinside/app/image/edit/emoji/ImageEditEmojiAdapter\n*L\n17#1:41\n*E\n"})
public final class a extends Adapter {
    public interface com.dcinside.app.image.edit.emoji.a.a {
        void v(@l String arg1);
    }

    @l
    private final String a;
    private final ArrayList b;
    @l
    private final t c;

    public a(@l com.dcinside.app.image.edit.emoji.a.a a$a0, @l String s) {
        L.p(a$a0, "callback");
        L.p(s, "path");
        super();
        this.a = s;
        this.b = d.x(Application.e.c());
        this.c = new t(a$a0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public int getItemCount() {
        return this.b.size();
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
        c0.i().setText(((CharSequence)this.b.get(v)));
    }

    @l
    public c x(@l ViewGroup viewGroup0, int v) {
        L.p(viewGroup0, "parent");
        return new c(viewGroup0);
    }

    public final void y(int v) {
        com.dcinside.app.image.edit.emoji.a.a a$a0 = (com.dcinside.app.image.edit.emoji.a.a)this.c.a();
        if(a$a0 != null) {
            Object object0 = this.b.get(v);
            L.o(object0, "get(...)");
            a$a0.v(((String)object0));
        }
    }
}

