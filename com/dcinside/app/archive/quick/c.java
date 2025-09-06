package com.dcinside.app.archive.quick;

import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;

public final class c implements DialogInterface.OnShowListener {
    public final d a;
    public final com.google.android.material.bottomsheet.c b;

    public c(d d0, com.google.android.material.bottomsheet.c c0) {
        this.a = d0;
        this.b = c0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        d.x0(this.a, this.b, dialogInterface0);
    }
}

