package com.dcinside.app.wv;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsResult;

public final class o implements DialogInterface.OnClickListener {
    public final JsResult a;

    public o(JsResult jsResult0) {
        this.a = jsResult0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        q.f(this.a, dialogInterface0, v);
    }
}

