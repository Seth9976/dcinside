package com.dcinside.app.perform;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import rx.n;

public final class h implements DialogInterface.OnClickListener {
    public final n a;

    public h(n n0) {
        this.a = n0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        com.dcinside.app.perform.e.h.k(this.a, dialogInterface0, v);
    }
}

