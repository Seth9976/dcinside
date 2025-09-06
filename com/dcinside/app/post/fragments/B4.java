package com.dcinside.app.post.fragments;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class b4 implements DialogInterface.OnClickListener {
    public final N3 a;

    public b4(N3 n30) {
        this.a = n30;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        t1.f(this.a, dialogInterface0, v);
    }
}

