package com.dcinside.app.post.manager;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;

public final class k implements DialogInterface.OnDismissListener {
    public final r a;

    public k(r r0) {
        this.a = r0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        r.L(this.a, dialogInterface0);
    }
}

