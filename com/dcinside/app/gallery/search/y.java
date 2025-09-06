package com.dcinside.app.gallery.search;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class y extends ViewHolder {
    @l
    private final TextView a;
    @l
    private final View b;
    @l
    private final View c;

    public y(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0298);  // id:category_hot_section_title
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B029A);  // id:category_hot_section_title_divider_top
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B0297);  // id:category_hot_section_minor_divider_top
        L.o(view3, "findViewById(...)");
        this.c = view3;
    }

    @l
    public final View e() {
        return this.b;
    }

    @l
    public final View f() {
        return this.c;
    }

    @l
    public final TextView h() {
        return this.a;
    }
}

