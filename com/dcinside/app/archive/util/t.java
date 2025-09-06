package com.dcinside.app.archive.util;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import com.dcinside.app.view.q0;
import rx.n;

public final class t implements DialogInterface.OnDismissListener {
    public final n a;
    public final q0 b;

    public t(n n0, q0 q00) {
        this.a = n0;
        this.b = q00;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        u.G(this.a, this.b, dialogInterface0);
    }
}

