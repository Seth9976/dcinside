package com.google.android.gms.internal.measurement;

public final class zzoy implements zzoz {
    private static final zzhj zza;
    private static final zzhj zzb;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzoy.zza = zzhr0.zza("measurement.gmscore_feature_tracking", true);
        zzoy.zzb = zzhr0.zza("measurement.gmscore_client_telemetry", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoz
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzoz
    public final boolean zzb() {
        return ((Boolean)zzoy.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzoz
    public final boolean zzc() {
        return ((Boolean)zzoy.zzb.zza()).booleanValue();
    }
}

