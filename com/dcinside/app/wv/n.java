package com.dcinside.app.wv;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsResult;

public final class n implements DialogInterface.OnClickListener {
    public final JsResult a;

    public n(JsResult jsResult0) {
        this.a = jsResult0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        q.e(this.a, dialogInterface0, v);
    }
}

