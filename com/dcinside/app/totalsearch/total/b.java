package com.dcinside.app.totalsearch.total;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class b extends ViewHolder {
    @l
    private TextView a;
    @l
    private TextView b;

    public b(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0FD4);  // id:total_section_name
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0F9C);  // id:total_gallery_count
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
    }

    @l
    public final TextView e() {
        return this.b;
    }

    @l
    public final TextView f() {
        return this.a;
    }

    public final void h(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.b = textView0;
    }

    public final void i(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.a = textView0;
    }
}

