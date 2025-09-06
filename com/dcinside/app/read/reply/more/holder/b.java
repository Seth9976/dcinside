package com.dcinside.app.read.reply.more.holder;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.read.reply.more.ReplyMoreItem;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nReplyMoreDeleteHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyMoreDeleteHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreDeleteHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,30:1\n257#2,2:31\n257#2,2:33\n257#2,2:35\n257#2,2:37\n*S KotlinDebug\n*F\n+ 1 ReplyMoreDeleteHolder.kt\ncom/dcinside/app/read/reply/more/holder/ReplyMoreDeleteHolder\n*L\n18#1:31,2\n20#1:33,2\n24#1:35,2\n26#1:37,2\n*E\n"})
public final class b extends ViewHolder {
    @l
    private final View a;
    @l
    private final View b;
    @l
    private final TextView c;

    public b(@l View view0) {
        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0D53);  // id:reply_more_delete_wrap
        L.o(view1, "findViewById(...)");
        this.a = view1;
        View view2 = view0.findViewById(0x7F0B0D4D);  // id:reply_more_block_wrap
        L.o(view2, "findViewById(...)");
        this.b = view2;
        View view3 = view0.findViewById(0x7F0B0D52);  // id:reply_more_delete_text
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
    }

    @l
    public final View e() {
        return this.b;
    }

    @l
    public final View f() {
        return this.a;
    }

    public final void h(@l ReplyMoreItem replyMoreItem0) {
        L.p(replyMoreItem0, "replyItem");
        int v = 8;
        this.a.setVisibility((replyMoreItem0.B() ? 0 : 8));
        if(replyMoreItem0.B()) {
            this.a.setVisibility(0);
            String s = this.itemView.getContext().getString((replyMoreItem0.X() ? 0x7F1508AF : 0x7F1508AE));  // string:reply_more_delete_under "답글 삭제"
            this.c.setText(s);
        }
        else {
            this.a.setVisibility(8);
        }
        View view0 = this.b;
        if(replyMoreItem0.L().m()) {
            v = 0;
        }
        view0.setVisibility(v);
    }
}

