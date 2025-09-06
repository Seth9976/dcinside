package com.dcinside.app.read.holder;

import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.dcinside.app.util.Dl;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a extends b {
    @l
    private final TextView b;

    public a(@l View view0) {
        L.p(view0, "itemView");
        super(view0, null, 2, null);
        View view1 = view0.findViewById(0x7F0B0089);  // id:additional_message
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
    }

    public final void h(@m String s) {
        Spanned spanned0 = s == null ? null : Dl.c(s);
        this.b.setText(spanned0);
    }

    @l
    public final TextView i() {
        return this.b;
    }
}

