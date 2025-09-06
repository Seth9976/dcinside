package com.dcinside.app.archive.edit;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class p implements CompoundButton.OnCheckedChangeListener {
    public final r a;

    public p(r r0) {
        this.a = r0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        r.m(this.a, compoundButton0, z);
    }
}

