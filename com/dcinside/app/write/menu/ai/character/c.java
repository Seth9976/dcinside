package com.dcinside.app.write.menu.ai.character;

import android.view.View;
import android.widget.TextView;
import com.codewaves.stickyheadergrid.a.b;
import kotlin.jvm.internal.L;
import y4.l;

public final class c extends b {
    @l
    private final TextView a;

    public c(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B02AE);  // id:chara_prompt_text
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
    }

    @l
    public final TextView h() {
        return this.a;
    }
}

