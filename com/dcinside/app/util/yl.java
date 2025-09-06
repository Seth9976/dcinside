package com.dcinside.app.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class yl implements DialogInterface.OnClickListener {
    public final a a;

    public yl(a al$a0) {
        this.a = al$a0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        a.D(this.a, dialogInterface0, v);
    }
}

