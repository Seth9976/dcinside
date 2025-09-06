package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class zzah implements DialogInterface.OnClickListener {
    public final zzau zza;
    public final String zzb;

    public zzah(zzau zzau0, String s) {
        this.zza = zzau0;
        this.zzb = s;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzi(this.zzb, dialogInterface0, v);
    }
}

