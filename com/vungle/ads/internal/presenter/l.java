package com.vungle.ads.internal.presenter;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class l implements DialogInterface.OnClickListener {
    public final n a;

    public l(n n0) {
        this.a = n0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        n.showGdpr$lambda-8(this.a, dialogInterface0, v);
    }
}

