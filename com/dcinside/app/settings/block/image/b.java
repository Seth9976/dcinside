package com.dcinside.app.settings.block.image;

import android.view.View.OnClickListener;
import android.view.View;
import com.dcinside.app.realm.h;

public final class b implements View.OnClickListener {
    public final e a;
    public final h b;

    public b(e e0, h h0) {
        this.a = e0;
        this.b = h0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        e.C(this.a, this.b, view0);
    }
}

