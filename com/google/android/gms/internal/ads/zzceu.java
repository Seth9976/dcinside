package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class zzceu implements DialogInterface.OnClickListener {
    final JsPromptResult zza;
    final EditText zzb;

    zzceu(JsPromptResult jsPromptResult0, EditText editText0) {
        this.zza = jsPromptResult0;
        this.zzb = editText0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        String s = this.zzb.getText().toString();
        this.zza.confirm(s);
    }
}

