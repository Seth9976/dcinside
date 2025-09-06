package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class zzces implements DialogInterface.OnCancelListener {
    final JsPromptResult zza;

    zzces(JsPromptResult jsPromptResult0) {
        this.zza = jsPromptResult0;
        super();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.zza.cancel();
    }
}

