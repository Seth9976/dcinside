package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.net.Uri;

final class zzaw implements DialogInterface.OnClickListener {
    final Context zza;

    zzaw(zzax zzax0, Context context0) {
        this.zza = context0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        Uri uri0 = Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push");
        zzs.zzU(this.zza, uri0);
    }
}

