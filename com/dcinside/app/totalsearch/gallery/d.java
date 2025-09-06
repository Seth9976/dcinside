package com.dcinside.app.totalsearch.gallery;

import android.view.View;
import android.widget.TextView;
import com.codewaves.stickyheadergrid.a.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class d extends a {
    @l
    private final TextView a;

    public d(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0F9E);  // id:total_gallery_section_empty_message
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
    }

    @l
    public final TextView h() {
        return this.a;
    }
}

