package com.dcinside.app.archive.util;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import rx.n;

public final class d implements DialogInterface.OnCancelListener {
    public final n a;

    public d(n n0) {
        this.a = n0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        u.H(this.a, dialogInterface0);
    }
}

