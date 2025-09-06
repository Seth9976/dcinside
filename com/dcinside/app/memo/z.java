package com.dcinside.app.memo;

import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface;
import com.dcinside.app.view.C0;
import rx.n;

public final class z implements DialogInterface.OnDismissListener {
    public final C0 a;
    public final n b;

    public z(C0 c00, n n0) {
        this.a = c00;
        this.b = n0;
    }

    @Override  // android.content.DialogInterface$OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface0) {
        F.u(this.a, this.b, dialogInterface0);
    }
}

