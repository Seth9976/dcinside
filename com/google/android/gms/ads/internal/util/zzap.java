package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzap implements DialogInterface.OnClickListener {
    public final zzau zza;
    public final AtomicInteger zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzap(zzau zzau0, AtomicInteger atomicInteger0, int v, int v1, int v2) {
        this.zza = zzau0;
        this.zzb = atomicInteger0;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.zza.zzh(this.zzb, this.zzc, this.zzd, this.zze, dialogInterface0, v);
    }
}

