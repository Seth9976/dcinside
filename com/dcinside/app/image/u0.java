package com.dcinside.app.image;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public final class u0 extends ViewHolder {
    @l
    @f
    public TextView a;
    @l
    @f
    public ImageView b;

    public u0(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0435);  // id:down_section_text
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0434);  // id:down_section_delete
        L.o(view2, "findViewById(...)");
        this.b = (ImageView)view2;
    }
}

