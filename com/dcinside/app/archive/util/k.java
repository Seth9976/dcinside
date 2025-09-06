package com.dcinside.app.archive.util;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import rx.n;

public final class k implements DialogInterface.OnCancelListener {
    public final n a;

    public k(n n0) {
        this.a = n0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        u.x(this.a, dialogInterface0);
    }
}

