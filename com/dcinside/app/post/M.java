package com.dcinside.app.post;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class m extends ViewHolder {
    @l
    private final TextView a;
    @l
    private final TextView b;
    @l
    private final ImageView c;

    public m(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B04C9);  // id:full_profile_title
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B04C3);  // id:full_profile_content
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B04C7);  // id:full_profile_img
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
    }

    @l
    public final TextView e() {
        return this.b;
    }

    @l
    public final ImageView f() {
        return this.c;
    }

    @l
    public final TextView h() {
        return this.a;
    }
}

