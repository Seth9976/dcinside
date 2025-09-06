package com.dcinside.app.post;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import y4.l;

public final class f1 extends ViewHolder {
    @l
    private final TextView a;
    @l
    private final View b;
    @l
    private final ImageView c;

    public f1(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B03C3);  // id:deletable_subject
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B03C2);  // id:deletable_ic_wrap
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B03C1);  // id:deletable_ic
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        vk.h(0x7F04032A, new View[]{((ImageView)view3)});  // attr:icTintNormal
    }

    @l
    public final View e() {
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

