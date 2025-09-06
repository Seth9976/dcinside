package com.dcinside.app.totalsearch.video;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class s extends ViewHolder {
    @l
    private final View a;
    @l
    private View b;

    public s(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0880);  // id:more_icon
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0882);  // id:more_progress
        L.o(view2, "findViewById(...)");
        this.b = view2;
    }

    @l
    public final View e() {
        return this.a;
    }

    @l
    public final View f() {
        return this.b;
    }

    public final void h(@l View view0) {
        L.p(view0, "<set-?>");
        this.b = view0;
    }
}

