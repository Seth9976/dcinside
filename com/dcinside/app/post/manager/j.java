package com.dcinside.app.post.manager;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class j implements DialogInterface.OnClickListener {
    public final r a;
    public final int b;
    public final String c;

    public j(r r0, int v, String s) {
        this.a = r0;
        this.b = v;
        this.c = s;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        r.K(this.a, this.b, this.c, dialogInterface0, v);
    }
}

