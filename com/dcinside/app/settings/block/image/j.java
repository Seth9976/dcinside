package com.dcinside.app.settings.block.image;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class j implements CompoundButton.OnCheckedChangeListener {
    public final l a;

    public j(l l0) {
        this.a = l0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        l.w0(this.a, compoundButton0, z);
    }
}

