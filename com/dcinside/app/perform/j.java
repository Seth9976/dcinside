package com.dcinside.app.perform;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import rx.n;

public final class j implements DialogInterface.OnClickListener {
    public final n a;

    public j(n n0) {
        this.a = n0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        h.m(this.a, dialogInterface0, v);
    }
}

