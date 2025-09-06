package com.dcinside.app.settings.block.dccon;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.view.DividerLinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.jvm.internal.L;
import y4.l;

public final class e extends ViewHolder {
    @l
    private final DividerLinearLayout a;
    @l
    private final SimpleDraweeView b;
    @l
    private final TextView c;

    public e(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        View view1 = view0.findViewById(0x7F0B01E9);  // id:block_dccon_group_wrap
        L.o(view1, "findViewById(...)");
        this.a = (DividerLinearLayout)view1;
        View view2 = view0.findViewById(0x7F0B01E7);  // id:block_dccon_group_image
        L.o(view2, "findViewById(...)");
        this.b = (SimpleDraweeView)view2;
        View view3 = view0.findViewById(0x7F0B01E8);  // id:block_dccon_group_name
        L.o(view3, "findViewById(...)");
        this.c = (TextView)view3;
    }

    @l
    public final SimpleDraweeView e() {
        return this.b;
    }

    @l
    public final TextView f() {
        return this.c;
    }

    @l
    public final DividerLinearLayout h() {
        return this.a;
    }
}

