package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzbc implements zzdn {
    private final zzds zza;
    private final zzds zzb;
    private final zzds zzc;
    private final zzds zzd;
    private final zzds zze;
    private final zzds zzf;

    public zzbc(zzds zzds0, zzds zzds1, zzds zzds2, zzds zzds3, zzds zzds4, zzds zzds5) {
        this.zza = zzds0;
        this.zzb = zzds1;
        this.zzc = zzds2;
        this.zzd = zzds3;
        this.zze = zzds4;
        this.zzf = zzds5;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return new zzbb(((Application)this.zza.zza()), ((zzab)this.zzb.zza()), ((zzbw)this.zzc.zza()), ((zzap)this.zzd.zza()), ((zzbp)this.zze.zza()), this.zzf);
    }
}

