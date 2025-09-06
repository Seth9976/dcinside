package com.dcinside.app.image;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;
import z3.f;

public final class t0 extends ViewHolder {
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
    public View d;
    @l
    @f
    public View e;

    public t0(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0437);  // id:down_title
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0436);  // id:down_subject
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0431);  // id:down_path
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B0432);  // id:down_progress
        L.o(view4, "findViewById(...)");
        this.d = view4;
        View view5 = view0.findViewById(0x7F0B0433);  // id:down_retry
        L.o(view5, "findViewById(...)");
        this.e = view5;
    }
}

