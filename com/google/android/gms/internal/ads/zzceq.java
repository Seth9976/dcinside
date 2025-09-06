package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsResult;

final class zzceq implements DialogInterface.OnClickListener {
    final JsResult zza;

    zzceq(JsResult jsResult0) {
        this.zza = jsResult0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.cancel();
    }
}

