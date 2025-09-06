package com.dcinside.app.history.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.codewaves.stickyheadergrid.a.a;
import com.dcinside.app.util.jl;
import com.dcinside.app.view.DividerLinearLayout;
import kotlin.jvm.internal.L;
import y4.l;

public final class d extends a {
    @l
    private final DividerLinearLayout a;
    @l
    private final TextView b;

    public d(@l ViewGroup viewGroup0) {
        L.p(viewGroup0, "parent");
        super(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0228, viewGroup0, false));  // layout:view_post_history_item_msg
        L.n(this.itemView, "null cannot be cast to non-null type com.dcinside.app.view.DividerLinearLayout");
        this.a = (DividerLinearLayout)this.itemView;
        View view0 = this.itemView.findViewById(0x7F0B0A5F);  // id:post_history_item_msg
        L.o(view0, "findViewById(...)");
        this.b = (TextView)view0;
        long v = jl.a.v0();
        ((TextView)view0).setText(((TextView)view0).getContext().getString(0x7F150462, new Object[]{v}));  // string:history_expire_days_msg "현재 기기에서 본 글이 %1$d일 동안 저장됩니다."
    }

    @l
    public final TextView h() {
        return this.b;
    }

    @l
    public final DividerLinearLayout i() {
        return this.a;
    }
}

