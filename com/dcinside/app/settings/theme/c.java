package com.dcinside.app.settings.theme;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public final class c extends ViewHolder {
    @l
    @f
    public final ImageView a;
    @l
    @f
    public final TextView b;

    public c(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0F88);  // id:theme_color
        L.o(view1, "findViewById(...)");
        this.a = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B0F89);  // id:theme_name
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
    }
}

