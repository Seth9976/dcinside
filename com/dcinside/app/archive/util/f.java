package com.dcinside.app.archive.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class f implements DialogInterface.OnClickListener {
    public final v a;

    public f(v v0) {
        this.a = v0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        u.L(this.a, dialogInterface0, v);
    }
}

