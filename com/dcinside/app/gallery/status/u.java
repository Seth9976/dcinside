package com.dcinside.app.gallery.status;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class u extends ViewHolder {
    @l
    private final TextView a;
    @l
    private final TextView b;
    @l
    private final ImageView c;
    @l
    private final ImageView d;

    public u(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0838);  // id:mini_name
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B083E);  // id:mini_status
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0840);  // id:mini_status_private
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        View view4 = view0.findViewById(0x7F0B083F);  // id:mini_status_favor_icon
        L.o(view4, "findViewById(...)");
        this.d = (ImageView)view4;
    }

    @l
    public final ImageView e() {
        return this.d;
    }

    @l
    public final TextView f() {
        return this.a;
    }

    @l
    public final ImageView h() {
        return this.c;
    }

    @l
    public final TextView i() {
        return this.b;
    }
}

