package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzcb implements zzdn {
    private final zzds zza;
    private final zzds zzb;
    private final zzds zzc;
    private final zzds zzd;
    private final zzds zze;
    private final zzds zzf;

    public zzcb(zzds zzds0, zzds zzds1, zzds zzds2, zzds zzds3, zzds zzds4, zzds zzds5, zzds zzds6, zzds zzds7) {
        this.zza = zzds0;
        this.zzb = zzds1;
        this.zzc = zzds4;
        this.zzd = zzds5;
        this.zze = zzds6;
        this.zzf = zzds7;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return this.zzb();
    }

    public final zzca zzb() {
        return new zzca(((Application)this.zza.zza()), ((zzbw)this.zzb.zza()), zzas.zzb(), zzau.zzb(), ((zze)this.zzc.zza()), ((zzao)this.zzd).zzb(), ((zzbb)this.zze.zza()), ((zzap)this.zzf.zza()));
    }
}

