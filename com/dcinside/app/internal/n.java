package com.dcinside.app.internal;

import A3.q;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import kotlin.coroutines.g;

public final class n implements CompoundButton.OnCheckedChangeListener {
    public final g a;
    public final q b;

    public n(g g0, q q0) {
        this.a = g0;
        this.b = q0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        r.K(this.a, this.b, compoundButton0, z);
    }
}

