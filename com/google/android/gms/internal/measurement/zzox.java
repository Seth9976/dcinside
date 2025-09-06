package com.google.android.gms.internal.measurement;

public final class zzox implements zzou {
    private static final zzhj zza;
    private static final zzhj zzb;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzox.zza = zzhr0.zza("measurement.gbraid_campaign.gbraid.client", true);
        zzox.zzb = zzhr0.zza("measurement.gbraid_campaign.gbraid.service", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzou
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzou
    public final boolean zzb() {
        return ((Boolean)zzox.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzou
    public final boolean zzc() {
        return ((Boolean)zzox.zzb.zza()).booleanValue();
    }
}

