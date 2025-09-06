package com.dcinside.app.internal;

import A3.p;
import android.view.View.OnLongClickListener;
import android.view.View;
import kotlin.coroutines.g;

public final class o implements View.OnLongClickListener {
    public final g a;
    public final boolean b;
    public final p c;

    public o(g g0, boolean z, p p0) {
        this.a = g0;
        this.b = z;
        this.c = p0;
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        return r.T(this.a, this.b, this.c, view0);
    }
}

