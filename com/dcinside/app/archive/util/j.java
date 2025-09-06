package com.dcinside.app.archive.util;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import com.dcinside.app.view.k;
import rx.n;

public final class j implements DialogInterface.OnDismissListener {
    public final k a;
    public final n b;

    public j(k k0, n n0) {
        this.a = k0;
        this.b = n0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        u.w(this.a, this.b, dialogInterface0);
    }
}

