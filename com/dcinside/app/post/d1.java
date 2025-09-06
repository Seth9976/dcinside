package com.dcinside.app.post;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.L;
import y4.l;

public final class d1 extends ViewHolder {
    private ConstraintLayout a;
    @l
    private TextView b;
    @l
    private ImageView c;
    @l
    private View d;

    public d1(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        this.a = (ConstraintLayout)view0.findViewById(0x7F0B0D88);  // id:root
        View view1 = view0.findViewById(0x7F0B0881);  // id:more_msg
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0880);  // id:more_icon
        L.o(view2, "findViewById(...)");
        this.c = (ImageView)view2;
        View view3 = view0.findViewById(0x7F0B0882);  // id:more_progress
        L.o(view3, "findViewById(...)");
        this.d = view3;
    }

    @l
    public final ImageView e() {
        return this.c;
    }

    @l
    public final TextView f() {
        return this.b;
    }

    @l
    public final View h() {
        return this.d;
    }

    public final ConstraintLayout i() {
        return this.a;
    }

    public final void j(@l ImageView imageView0) {
        L.p(imageView0, "<set-?>");
        this.c = imageView0;
    }

    public final void k(@l TextView textView0) {
        L.p(textView0, "<set-?>");
        this.b = textView0;
    }

    public final void l(@l View view0) {
        L.p(view0, "<set-?>");
        this.d = view0;
    }

    public final void m(ConstraintLayout constraintLayout0) {
        this.a = constraintLayout0;
    }
}

