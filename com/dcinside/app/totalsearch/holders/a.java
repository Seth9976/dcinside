package com.dcinside.app.totalsearch.holders;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public final class a extends ViewHolder {
    @l
    @f
    public TextView a;
    @l
    @f
    public TextView b;
    @l
    @f
    public TextView c;
    @l
    @f
    public TextView d;
    @l
    @f
    public View e;

    public a(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0FA7);  // id:total_post_subject
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0FA3);  // id:total_post_content
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0FA4);  // id:total_post_date
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B0FA6);  // id:total_post_gallery
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B0FA5);  // id:total_post_divider
        L.o(view5, "findViewById(...)");
        this.e = view5;
    }
}

