package com.dcinside.app.bookmark;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dcinside.app.realm.m;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.dl;

public final class x extends N {
    public x() {
        super(dl.a.b0());
    }

    @Override  // com.dcinside.app.bookmark.N
    protected void C(int v) {
    }

    @Override  // com.dcinside.app.bookmark.N
    protected void w(int v, int v1, int v2, TextView textView0, ImageView imageView0, View view0, View view1) {
        m m0 = (m)this.x(v2);
        textView0.setText(m0.S5());
        boolean z = true;
        boolean z1 = m0.Q5() == com.dcinside.app.type.m.i.c();
        if(m0.Q5() != com.dcinside.app.type.m.j.c()) {
            z = false;
        }
        imageView0.setVisibility((z1 || z ? 0 : 4));
        if(z1) {
            imageView0.setImageResource(0x7F080415);  // drawable:mini_gall_ic
            imageView0.setPadding(0, 0, 0, 0);
        }
        else {
            int v3 = Dk.b(0x7F0703C6);  // dimen:person_icon_padding
            imageView0.setPadding(0, v3, v3, 0);
            imageView0.setImageResource(0x7F0804A8);  // drawable:person_gall_ic
        }
        view1.setVisibility(8);
    }
}

