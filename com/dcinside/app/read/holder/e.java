package com.dcinside.app.read.holder;

import android.view.View;
import com.dcinside.app.util.ll;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nReadReplyBottomSpaceHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadReplyBottomSpaceHolder.kt\ncom/dcinside/app/read/holder/ReadReplyBottomSpaceHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,26:1\n257#2,2:27\n257#2,2:29\n*S KotlinDebug\n*F\n+ 1 ReadReplyBottomSpaceHolder.kt\ncom/dcinside/app/read/holder/ReadReplyBottomSpaceHolder\n*L\n23#1:27,2\n15#1:29,2\n*E\n"})
public final class e extends b {
    @l
    private final View b;
    @l
    private final View c;

    public e(@l View view0) {
        L.p(view0, "itemView");
        super(view0, null, 2, null);
        View view1 = view0.findViewById(0x7F0B0C72);  // id:read_reply_bottom_space
        L.o(view1, "findViewById(...)");
        this.b = view1;
        View view2 = view0.findViewById(0x7F0B0C73);  // id:read_reply_bottom_status_space
        L.o(view2, "findViewById(...)");
        this.c = view2;
        view2.setVisibility((ll.x() ? 0 : 8));
    }

    public final void h(boolean z) {
        int v = 8;
        if(z) {
            this.b.setVisibility(4);
            View view0 = this.c;
            if(ll.x()) {
                v = 0;
            }
            view0.setVisibility(v);
            return;
        }
        this.b.setVisibility(8);
        this.c.setVisibility(8);
    }
}

