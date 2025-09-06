package com.dcinside.app.perform;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import rx.n;

public final class g implements DialogInterface.OnClickListener {
    public final n a;

    public g(n n0) {
        this.a = n0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        h.j(this.a, dialogInterface0, v);
    }
}

