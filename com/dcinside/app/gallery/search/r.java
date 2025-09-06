package com.dcinside.app.gallery.search;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class r extends ViewHolder {
    @l
    private final TextView a;
    @l
    private final TextView b;

    public r(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B029E);  // id:category_item_name
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B029C);  // id:category_item_count
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
    }

    @l
    public final TextView e() {
        return this.b;
    }

    @l
    public final TextView f() {
        return this.a;
    }
}

