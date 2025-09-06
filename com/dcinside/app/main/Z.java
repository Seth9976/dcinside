package com.dcinside.app.main;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class z implements DialogInterface.OnClickListener {
    public final long a;
    public final Q b;

    public z(long v, Q q0) {
        this.a = v;
        this.b = q0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Q.e2(this.a, this.b, dialogInterface0, v);
    }
}

