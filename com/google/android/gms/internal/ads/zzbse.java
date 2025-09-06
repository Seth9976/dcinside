package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

final class zzbse implements DialogInterface.OnClickListener {
    final zzbsf zza;

    zzbse(zzbsf zzbsf0) {
        this.zza = zzbsf0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzh("User canceled the download.");
    }
}

