package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzv implements zzdn {
    private final zzds zza;
    private final zzds zzb;
    private final zzds zzc;
    private final zzds zzd;
    private final zzds zze;
    private final zzds zzf;
    private final zzds zzg;

    public zzv(zzds zzds0, zzds zzds1, zzds zzds2, zzds zzds3, zzds zzds4, zzds zzds5, zzds zzds6, zzds zzds7, zzds zzds8) {
        this.zza = zzds0;
        this.zzb = zzds1;
        this.zzc = zzds4;
        this.zzd = zzds5;
        this.zze = zzds6;
        this.zzf = zzds7;
        this.zzg = zzds8;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return this.zzb();
    }

    public final zzu zzb() {
        return new zzu(((Application)this.zza.zza()), ((zzab)this.zzb.zza()), zzas.zzb(), zzau.zzb(), ((zzap)this.zzc.zza()), ((zzbn)this.zzd.zza()), ((zzo)this.zze).zzb(), ((zzaa)this.zzf).zzb(), ((zze)this.zzg.zza()));
    }
}

