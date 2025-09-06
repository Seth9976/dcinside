package com.dcinside.app.post.fragments;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class h extends ViewHolder {
    @l
    private final View a;
    @l
    private final TextView b;
    @l
    private final TextView c;

    public h(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B06F3);  // id:list_block_gallery
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B06F6);  // id:list_block_gallery_reason
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B06F7);  // id:list_block_gallery_report
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        view1.setVisibility(8);
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
    public final TextView h() {
        return this.c;
    }
}

