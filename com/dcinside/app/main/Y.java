package com.dcinside.app.main;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class y implements DialogInterface.OnClickListener {
    public final long a;
    public final String b;
    public final Q c;

    public y(long v, String s, Q q0) {
        this.a = v;
        this.b = s;
        this.c = q0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Q.d2(this.a, this.b, this.c, dialogInterface0, v);
    }
}

