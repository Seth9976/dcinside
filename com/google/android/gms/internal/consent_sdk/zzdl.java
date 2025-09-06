package com.google.android.gms.internal.consent_sdk;

public final class zzdl implements zzdn {
    private zzdq zza;

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        zzdq zzdq0 = this.zza;
        if(zzdq0 == null) {
            throw new IllegalStateException();
        }
        return zzdq0.zza();
    }

    public static void zzb(zzdq zzdq0, zzdq zzdq1) {
        if(((zzdl)zzdq0).zza != null) {
            throw new IllegalStateException();
        }
        ((zzdl)zzdq0).zza = zzdq1;
    }
}

