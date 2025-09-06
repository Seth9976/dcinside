package com.dcinside.app.settings.image.list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class h extends ViewHolder {
    @l
    private final View a;
    @l
    private final ImageView b;
    @l
    private final TextView c;

    public h(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0396);  // id:def_img_list_item_wrap
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0394);  // id:def_img_list_item_image
        L.o(view2, "findViewById(...)");
        this.b = (ImageView)view2;
        View view3 = view0.findViewById(0x7F0B0395);  // id:def_img_list_item_text
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
    }

    @l
    public final ImageView e() {
        return this.b;
    }

    @l
    public final TextView f() {
        return this.c;
    }

    @l
    public final View h() {
        return this.a;
    }
}

