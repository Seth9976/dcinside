package com.dcinside.app.post.fragments;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class m implements CompoundButton.OnCheckedChangeListener {
    public final u a;

    public m(u u0) {
        this.a = u0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        u.C0(this.a, compoundButton0, z);
    }
}

