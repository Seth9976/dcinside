package com.dcinside.app.history.holder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.codewaves.stickyheadergrid.a.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class f extends a {
    @l
    private final View a;

    public f(@l ViewGroup viewGroup0) {
        L.p(viewGroup0, "parent");
        super(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E022A, viewGroup0, false));  // layout:view_post_history_item_progress
        View view0 = this.itemView.findViewById(0x7F0B0A65);  // id:post_history_item_progress
        L.o(view0, "findViewById(...)");
        this.a = view0;
    }

    @l
    public final View h() {
        return this.a;
    }
}

