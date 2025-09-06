package com.dcinside.app.archive.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class e implements DialogInterface.OnClickListener {
    public final v a;
    public final String b;

    public e(v v0, String s) {
        this.a = v0;
        this.b = s;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        u.K(this.a, this.b, dialogInterface0, v);
    }
}

