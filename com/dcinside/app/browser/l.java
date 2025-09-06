package com.dcinside.app.browser;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class l implements DialogInterface.OnClickListener {
    public final Context a;

    public l(Context context0) {
        this.a = context0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        n.j(this.a, dialogInterface0, v);
    }
}

