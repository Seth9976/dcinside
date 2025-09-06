package com.dcinside.app.gallery.history;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class k extends ViewHolder {
    @l
    private final View a;
    @l
    private final TextView b;
    @l
    private final View c;

    public k(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B06A1);  // id:item_manage_history_divider
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B06A2);  // id:item_manage_history_more_msg
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B06A3);  // id:item_manage_history_more_progress
        L.o(view3, "findViewById(...)");
        this.c = view3;
    }

    @l
    public final View e() {
        return this.a;
    }

    @l
    public final TextView f() {
        return this.b;
    }

    @l
    public final View h() {
        return this.c;
    }
}

