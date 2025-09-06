package com.dcinside.app.internal;

import android.view.View.OnClickListener;
import android.view.View;
import kotlin.coroutines.g;

public final class p implements View.OnClickListener {
    public final g a;
    public final A3.p b;

    public p(g g0, A3.p p0) {
        this.a = g0;
        this.b = p0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        r.N(this.a, this.b, view0);
    }
}

