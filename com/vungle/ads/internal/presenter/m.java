package com.vungle.ads.internal.presenter;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;

public final class m implements DialogInterface.OnDismissListener {
    public final n a;

    public m(n n0) {
        this.a = n0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        n.showGdpr$lambda-9(this.a, dialogInterface0);
    }
}

