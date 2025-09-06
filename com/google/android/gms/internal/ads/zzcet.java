package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;

final class zzcet implements DialogInterface.OnClickListener {
    final JsPromptResult zza;

    zzcet(JsPromptResult jsPromptResult0) {
        this.zza = jsPromptResult0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.cancel();
    }
}

