package com.dcinside.app.recent;

import android.view.View;
import android.widget.ImageView;
import com.codewaves.stickyheadergrid.a.a;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import y4.l;

public final class u extends a {
    @l
    private final ImageView a;

    public u(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0FAA);  // id:total_recent_search_clear
        L.o(view1, "findViewById(...)");
        this.a = (ImageView)view1;
        vk.h(0x7F040158, new View[]{((ImageView)view1)});  // attr:colorPrimary
    }

    @l
    public final ImageView h() {
        return this.a;
    }
}

