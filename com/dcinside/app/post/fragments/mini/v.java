package com.dcinside.app.post.fragments.mini;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public class v extends ViewHolder {
    @l
    private final TextView a;

    public v(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0839);  // id:mini_notice_text
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
    }

    @l
    public final TextView e() {
        return this.a;
    }
}

