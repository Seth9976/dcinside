package com.dcinside.app.write.menu;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dcinside.app.util.Dk;
import kotlin.jvm.internal.L;
import y4.l;

public final class d extends ConstraintLayout {
    @l
    private final ImageView a;
    @l
    private final TextView b;

    public d(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        View.inflate(context0, 0x7F0E02C3, this);  // layout:view_write_menu_more
        View view0 = this.findViewById(0x7F0B1105);  // id:write_more_menu_icon
        L.o(view0, "findViewById(...)");
        this.a = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B1106);  // id:write_more_menu_text
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
    }

    public final void setIcon(int v) {
        this.a.setImageResource(v);
    }

    public final void setPadding(int v) {
        int v1 = Dk.d(v);
        this.a.setPadding(v1, v1, v1, v1);
    }

    public final void setText(int v) {
        if(v > 0) {
            this.b.setText(v);
            return;
        }
        this.b.setText(null);
    }
}

