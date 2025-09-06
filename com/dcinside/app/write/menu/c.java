package com.dcinside.app.write.menu;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dcinside.app.util.Dk;
import kotlin.jvm.internal.L;
import y4.l;

public final class c extends FrameLayout {
    @l
    private final ImageView a;

    public c(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        View.inflate(context0, 0x7F0E02C2, this);  // layout:view_write_menu_icon
        View view0 = this.findViewById(0x7F0B1102);  // id:write_menu_icon
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
    }

    public final void setIcon(int v) {
        this.a.setImageResource(v);
    }

    public final void setPadding(int v) {
        int v1 = Dk.d(v);
        this.a.setPadding(v1, v1, v1, v1);
    }
}

