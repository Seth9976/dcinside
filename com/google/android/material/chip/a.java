package com.google.android.material.chip;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class a implements CompoundButton.OnCheckedChangeListener {
    public final Chip a;

    public a(Chip chip0) {
        this.a = chip0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.a.z(compoundButton0, z);
    }
}

