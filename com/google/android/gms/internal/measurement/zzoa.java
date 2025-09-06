package com.google.android.gms.internal.measurement;

public final class zzoa implements zzob {
    private static final zzhj zza;
    private static final zzhj zzb;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhr0.zza("measurement.collection.event_safelist", true);
        zzoa.zza = zzhr0.zza("measurement.service.store_null_safelist", true);
        zzoa.zzb = zzhr0.zza("measurement.service.store_safelist", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzob
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzob
    public final boolean zzb() {
        return ((Boolean)zzoa.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzob
    public final boolean zzc() {
        return ((Boolean)zzoa.zzb.zza()).booleanValue();
    }
}

