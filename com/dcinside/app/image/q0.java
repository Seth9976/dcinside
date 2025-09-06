package com.dcinside.app.image;

import android.view.View.OnClickListener;
import android.view.View;

public final class q0 implements View.OnClickListener {
    public final r0 a;
    public final u0 b;

    public q0(r0 r00, u0 u00) {
        this.a = r00;
        this.b = u00;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        r0.E(this.a, this.b, view0);
    }
}

