package com.dcinside.app.post;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class m1 extends ViewHolder {
    @l
    private final View a;
    @l
    private final View b;
    @l
    private final ImageView c;

    public m1(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0DEB);  // id:search_serpos_view
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0DE9);  // id:search_serpos_progress
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B0DE8);  // id:search_serpos_arrow
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
    }

    @l
    public final ImageView e() {
        return this.c;
    }

    @l
    public final View f() {
        return this.b;
    }

    @l
    public final View h() {
        return this.a;
    }
}

