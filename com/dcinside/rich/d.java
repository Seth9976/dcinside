package com.dcinside.rich;

import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final RichToolbar a;

    public d(RichToolbar richToolbar0) {
        this.a = richToolbar0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        RichToolbar.d(this.a, view0);
    }
}

