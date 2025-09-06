package com.dcinside.app.album;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class d extends ViewHolder {
    @l
    private ImageView a;
    @l
    private TextView b;
    @l
    private TextView c;

    public d(@l View view0) {
        L.p(view0, "view");
        super(view0);
        View view1 = view0.findViewById(0x7F0B062D);  // id:img_album
        L.o(view1, "findViewById(...)");
        this.a = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B0FEE);  // id:txt_album
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0FEF);  // id:txt_album_count
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
    }

    @l
    public final ImageView e() {
        return this.a;
    }

    @l
    public final TextView f() {
        return this.b;
    }

    @l
    public final TextView h() {
        return this.c;
    }

    public final void i(@l ImageView imageView0) {
        L.p(imageView0, "<set-?>");
        this.a = imageView0;
    }

    public final void j(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.b = textView0;
    }

    public final void k(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.c = textView0;
    }
}

