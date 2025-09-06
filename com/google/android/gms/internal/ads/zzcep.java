package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.webkit.JsResult;

final class zzcep implements DialogInterface.OnCancelListener {
    final JsResult zza;

    zzcep(JsResult jsResult0) {
        this.zza = jsResult0;
        super();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.zza.cancel();
    }
}

