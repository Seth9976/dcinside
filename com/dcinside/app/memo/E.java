package com.dcinside.app.memo;

import android.content.Context;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class e implements CompoundButton.OnCheckedChangeListener {
    public final j a;
    public final Context b;
    public final q c;

    public e(j j0, Context context0, q q0) {
        this.a = j0;
        this.b = context0;
        this.c = q0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        j.K(this.a, this.b, this.c, compoundButton0, z);
    }
}

