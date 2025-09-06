package com.dcinside.app.manager;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsResult;

public final class d implements DialogInterface.OnClickListener {
    public final JsResult a;

    public d(JsResult jsResult0) {
        this.a = jsResult0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        f.c(this.a, dialogInterface0, v);
    }
}

