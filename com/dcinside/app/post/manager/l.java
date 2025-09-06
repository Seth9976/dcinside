package com.dcinside.app.post.manager;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;

public final class l implements DialogInterface.OnDismissListener {
    public final r a;

    public l(r r0) {
        this.a = r0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        r.J(this.a, dialogInterface0);
    }
}

