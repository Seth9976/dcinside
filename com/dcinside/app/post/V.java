package com.dcinside.app.post;

import A3.a;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class v implements DialogInterface.OnClickListener {
    public final a a;

    public v(a a0) {
        this.a = a0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        c0.D5(this.a, dialogInterface0, v);
    }
}

