package com.dcinside.app.recent;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class e extends ViewHolder {
    @l
    private TextView a;

    public e(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        this.a = (TextView)view0;
    }

    @l
    public final TextView e() {
        return this.a;
    }

    public final void f(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.a = textView0;
    }
}

