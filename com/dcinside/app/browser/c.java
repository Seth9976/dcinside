package com.dcinside.app.browser;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class c implements DialogInterface.OnClickListener {
    public final AwesomeWebViewActivity a;
    public final String b;

    public c(AwesomeWebViewActivity awesomeWebViewActivity0, String s) {
        this.a = awesomeWebViewActivity0;
        this.b = s;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        AwesomeWebViewActivity.p5(this.a, this.b, dialogInterface0, v);
    }
}

