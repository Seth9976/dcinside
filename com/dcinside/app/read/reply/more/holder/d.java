package com.dcinside.app.read.reply.more.holder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nReplyMoreNameSearchHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreNameSearchHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreNameSearchHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,19:1\n257#2,2:20\n257#2,2:22\n*S KotlinDebug\n*F\n+ 1 ReplyMoreNameSearchHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreNameSearchHolder\n*L\n15#1:20,2\n16#1:22,2\n*E\n"})
public final class d extends ViewHolder {
    @l
    private final View a;
    @l
    private final View b;
    @l
    private final View c;

    public d(@l View view0) {
        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0D5A);  // id:reply_more_reply_under
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0D4F);  // id:reply_more_copy_text
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B0D5C);  // id:reply_more_search_name
        L.o(view3, "findViewById(...)");
        this.c = view3;
    }

    @l
    public final View e() {
        return this.b;
    }

    @l
    public final View f() {
        return this.a;
    }

    @l
    public final View h() {
        return this.c;
    }

    public final void i(int v, boolean z) {
        int v1 = 0;
        this.b.setVisibility((v == 10000007 ? 8 : 0));
        View view0 = this.a;
        if(!z) {
            v1 = 8;
        }
        view0.setVisibility(v1);
    }
}

