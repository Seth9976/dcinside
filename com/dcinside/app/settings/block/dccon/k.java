package com.dcinside.app.settings.block.dccon;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class k implements CompoundButton.OnCheckedChangeListener {
    public final m a;

    public k(m m0) {
        this.a = m0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        m.v0(this.a, compoundButton0, z);
    }
}

