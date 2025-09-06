package com.dcinside.app.read.holder;

import android.view.View;
import android.widget.ImageView;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.dl;
import com.dcinside.app.view.DividerConstraintLayout;
import com.dcinside.app.view.ResizeTextView;
import kotlin.jvm.internal.L;
import y4.l;

public class g extends b {
    @l
    private final DividerConstraintLayout b;
    @l
    private final ImageView c;
    @l
    private final ResizeTextView d;
    @l
    private final View e;

    public g(@l View view0) {
        L.p(view0, "itemView");
        super(view0, null, 2, null);
        this.b = (DividerConstraintLayout)view0;
        View view1 = view0.findViewById(0x7F0B0D73);  // id:reply_under_icon
        L.o(view1, "findViewById(...)");
        this.c = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B0D29);  // id:reply_delete_flag
        L.o(view2, "findViewById(...)");
        this.d = (ResizeTextView)view2;
        View view3 = view0.findViewById(0x7F0B0D2D);  // id:reply_first_icon
        L.o(view3, "findViewById(...)");
        this.e = view3;
        ((ResizeTextView)view2).v(Dk.c(dl.a.V1().b()));
    }

    @l
    public final DividerConstraintLayout h() {
        return this.b;
    }

    @l
    public final ResizeTextView i() {
        return this.d;
    }

    @l
    public final View j() {
        return this.e;
    }

    @l
    public final ImageView k() {
        return this.c;
    }
}

