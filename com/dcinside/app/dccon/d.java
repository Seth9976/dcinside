package com.dcinside.app.dccon;

import Y.d5;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class d extends ViewHolder {
    @l
    private final d5 a;

    public d(@l d5 d50) {
        L.p(d50, "binding");
        super(d50.b());
        this.a = d50;
    }

    public final void e(@l String s) {
        L.p(s, "tag");
        String s1 = this.itemView.getContext().getString(0x7F15024E, new Object[]{s});  // string:dccon_tag_with_hashtag "#%1$s"
        this.a.b.setText(s1);
    }
}

