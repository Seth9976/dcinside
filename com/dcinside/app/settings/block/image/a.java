package com.dcinside.app.settings.block.image;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class a extends ViewHolder {
    @l
    private final ImageView a;
    @l
    private final View b;

    public a(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0219);  // id:block_image_image
        L.o(view1, "findViewById(...)");
        this.a = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B0212);  // id:block_image_delete
        L.o(view2, "findViewById(...)");
        this.b = view2;
    }

    @l
    public final View e() {
        return this.b;
    }

    @l
    public final ImageView f() {
        return this.a;
    }
}

