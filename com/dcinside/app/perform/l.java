package com.dcinside.app.perform;

import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;

public final class l implements DialogInterface.OnShowListener {
    public final a a;
    public final p b;

    public l(a e$a0, p p0) {
        this.a = e$a0;
        this.b = p0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        h.o(this.a, this.b, dialogInterface0);
    }
}

