package com.dcinside.app.archive.util;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;

public final class g implements DialogInterface.OnDismissListener {
    public final v a;

    public g(v v0) {
        this.a = v0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        u.M(this.a, dialogInterface0);
    }
}

