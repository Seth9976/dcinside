package com.dcinside.app.internal;

import A3.q;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import kotlin.coroutines.g;

public final class m implements View.OnFocusChangeListener {
    public final g a;
    public final q b;

    public m(g g0, q q0) {
        this.a = g0;
        this.b = q0;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        r.Q(this.a, this.b, view0, z);
    }
}

