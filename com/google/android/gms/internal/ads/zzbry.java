package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

final class zzbry implements DialogInterface.OnClickListener {
    final zzbrz zza;

    zzbry(zzbrz zzbrz0) {
        this.zza = zzbrz0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzh("Operation denied by user.");
    }
}

