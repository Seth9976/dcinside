package com.dcinside.app.write;

import android.view.View.OnClickListener;
import android.view.View;

public final class x1 implements View.OnClickListener {
    public final A1 a;

    public x1(A1 a10) {
        this.a = a10;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        A1.G(this.a, view0);
    }
}

