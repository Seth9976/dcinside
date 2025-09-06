package com.dcinside.app.main;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

public final class x implements DialogInterface.OnCancelListener {
    public final Q a;

    public x(Q q0) {
        this.a = q0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        Q.u1(this.a, dialogInterface0);
    }
}

