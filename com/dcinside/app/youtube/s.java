package com.dcinside.app.youtube;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.dcinside.app.base.e;
import kotlin.jvm.internal.L;
import y4.l;

public final class s extends e {
    @l
    private final ImageView a;
    @l
    private final View b;

    public s(@l ViewGroup viewGroup0) {
        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E0276);  // layout:view_search_more
        View view0 = this.itemView.findViewById(0x7F0B0880);  // id:more_icon
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.itemView.findViewById(0x7F0B0882);  // id:more_progress
        L.o(view1, "findViewById(...)");
        this.b = view1;
    }

    @l
    public final ImageView h() {
        return this.a;
    }

    @l
    public final View i() {
        return this.b;
    }
}

