package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class zzam implements DialogInterface.OnClickListener {
    public final zzau zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    public zzam(zzau zzau0, int v, int v1, int v2, int v3, int v4) {
        this.zza = zzau0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = v4;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, dialogInterface0, v);
    }
}

