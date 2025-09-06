package com.dcinside.app.memo;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class t implements CompoundButton.OnCheckedChangeListener {
    public final w a;

    public t(w w0) {
        this.a = w0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        w.J0(this.a, compoundButton0, z);
    }
}

