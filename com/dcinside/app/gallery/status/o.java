package com.dcinside.app.gallery.status;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class o extends ViewHolder {
    @l
    private final TextView a;
    @l
    private final TextView b;
    @l
    private final ImageView c;
    @l
    private final ImageView d;
    @l
    private final View e;
    @l
    private final TextView f;
    @l
    private final ImageView g;

    public o(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B07D2);  // id:managed_status
        L.o(view1, "findViewById(...)");
        this.a = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B07CE);  // id:managed_name
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B07CC);  // id:managed_icon
        L.o(view3, "findViewById(...)");
        this.c = (ImageView)view3;
        View view4 = view0.findViewById(0x7F0B07CD);  // id:managed_mini_private
        L.o(view4, "findViewById(...)");
        this.d = (ImageView)view4;
        View view5 = view0.findViewById(0x7F0B07D1);  // id:managed_rank_status_wrap
        L.o(view5, "findViewById(...)");
        this.e = view5;
        View view6 = view0.findViewById(0x7F0B07CF);  // id:managed_rank_status_text
        L.o(view6, "findViewById(...)");
        this.f = (TextView)view6;
        View view7 = view0.findViewById(0x7F0B07D0);  // id:managed_rank_status_transfer_icon
        L.o(view7, "findViewById(...)");
        this.g = (ImageView)view7;
    }

    @l
    public final ImageView e() {
        return this.c;
    }

    @l
    public final TextView f() {
        return this.f;
    }

    @l
    public final ImageView h() {
        return this.g;
    }

    @l
    public final View i() {
        return this.e;
    }

    @l
    public final TextView j() {
        return this.b;
    }

    @l
    public final ImageView k() {
        return this.d;
    }

    @l
    public final TextView l() {
        return this.a;
    }
}

