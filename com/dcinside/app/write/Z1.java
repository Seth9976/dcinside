package com.dcinside.app.write;

import android.view.View.OnLongClickListener;
import android.view.View;

public final class z1 implements View.OnLongClickListener {
    public final A1 a;

    public z1(A1 a10) {
        this.a = a10;
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        return A1.I(this.a, view0);
    }
}

