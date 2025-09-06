package com.dcinside.app.gallery.search;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class q extends ViewHolder {
    @l
    private final TextView a;
    @l
    private final TextView b;
    @l
    private final TextView c;
    @l
    private final View d;
    @l
    private final TextView e;

    public q(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B057D);  // id:hot_item_rank
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B057C);  // id:hot_item_name
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B057B);  // id:hot_item_desc
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B057A);  // id:hot_item_block
        L.o(view4, "findViewById(...)");
        this.d = view4;
        View view5 = view0.findViewById(0x7F0B057E);  // id:hot_item_rank_changed
        L.o(view5, "findViewById(...)");
        this.e = (TextView)view5;
    }

    @l
    public final View e() {
        return this.d;
    }

    @l
    public final TextView f() {
        return this.b;
    }

    @l
    public final TextView h() {
        return this.c;
    }

    @l
    public final TextView i() {
        return this.e;
    }

    @l
    public final TextView j() {
        return this.a;
    }
}

