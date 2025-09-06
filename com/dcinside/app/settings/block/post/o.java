package com.dcinside.app.settings.block.post;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import io.realm.F0;

public final class o implements CompoundButton.OnCheckedChangeListener {
    public final F0 a;
    public final D b;

    public o(F0 f00, D d0) {
        this.a = f00;
        this.b = d0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        D.N0(this.a, this.b, compoundButton0, z);
    }
}

