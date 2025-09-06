package com.dcinside.app.memo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.dcinside.app.base.e;
import kotlin.jvm.internal.L;

public final class l extends e {
    @y4.l
    private final CheckBox a;
    @y4.l
    private final View b;
    @y4.l
    private final View c;
    @y4.l
    private final TextView d;
    @y4.l
    private final ImageView e;

    public l(@y4.l ViewGroup viewGroup0) {
        L.p(viewGroup0, "parent");
        super(viewGroup0, 0x7F0E02AE);  // layout:view_user_memo_item
        View view0 = this.itemView.findViewById(0x7F0B0801);  // id:memo_editable_check
        L.o(view0, "findViewById(...)");
        this.a = (CheckBox)view0;
        View view1 = this.itemView.findViewById(0x7F0B0803);  // id:memo_editable_user_type_id
        L.o(view1, "findViewById(...)");
        this.b = view1;
        View view2 = this.itemView.findViewById(0x7F0B0804);  // id:memo_editable_user_type_ip
        L.o(view2, "findViewById(...)");
        this.c = view2;
        View view3 = this.itemView.findViewById(0x7F0B0805);  // id:memo_editable_values
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        View view4 = this.itemView.findViewById(0x7F0B0802);  // id:memo_editable_go_edit
        L.o(view4, "findViewById(...)");
        this.e = (ImageView)view4;
    }

    @y4.l
    public final CheckBox h() {
        return this.a;
    }

    @y4.l
    public final ImageView i() {
        return this.e;
    }

    @y4.l
    public final View j() {
        return this.b;
    }

    @y4.l
    public final View k() {
        return this.c;
    }

    @y4.l
    public final TextView l() {
        return this.d;
    }
}

