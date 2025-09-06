package com.dcinside.app.write.temp;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;

public final class l extends ViewHolder {
    @y4.l
    private final ImageView a;
    @y4.l
    private final TextView b;
    @y4.l
    private final TextView c;
    @y4.l
    private final TextView d;
    @y4.l
    private final CheckBox e;
    @y4.l
    private final View f;

    public l(@y4.l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B0B21);  // id:post_temp_delete
        L.o(view1, "findViewById(...)");
        this.a = (ImageView)view1;
        View view2 = view0.findViewById(0x7F0B0B30);  // id:post_temp_time
        L.o(view2, "findViewById(...)");
        this.b = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0B2F);  // id:post_temp_subject
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B0B1D);  // id:post_temp_auto_save_type
        L.o(view4, "findViewById(...)");
        this.d = (TextView)view4;
        View view5 = view0.findViewById(0x7F0B0B1E);  // id:post_temp_check
        L.o(view5, "findViewById(...)");
        this.e = (CheckBox)view5;
        View view6 = view0.findViewById(0x7F0B0B2E);  // id:post_temp_start_dummy
        L.o(view6, "findViewById(...)");
        this.f = view6;
        vk.h(0x7F04032A, new View[]{((ImageView)view1)});  // attr:icTintNormal
    }

    @y4.l
    public final TextView e() {
        return this.d;
    }

    @y4.l
    public final CheckBox f() {
        return this.e;
    }

    @y4.l
    public final ImageView h() {
        return this.a;
    }

    @y4.l
    public final View i() {
        return this.f;
    }

    @y4.l
    public final TextView j() {
        return this.c;
    }

    @y4.l
    public final TextView k() {
        return this.b;
    }
}

