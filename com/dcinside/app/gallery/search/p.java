package com.dcinside.app.gallery.search;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class p extends ViewHolder {
    @l
    private final TextView a;

    public p(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0579);  // id:hot_empty_text
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
    }

    @l
    public final TextView e() {
        return this.a;
    }
}

