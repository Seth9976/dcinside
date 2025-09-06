package com.dcinside.app.settings.block.report;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class a extends ViewHolder {
    @l
    private final TextView a;

    public a(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0A5F);  // id:post_history_item_msg
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        ((TextView)view1).setText("현재 기기에서 차단한 신고글이 14일 동안 저장됩니다.");
    }

    @l
    public final TextView e() {
        return this.a;
    }
}

