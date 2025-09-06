package com.google.android.gms.internal.measurement;

public final class zzol implements zzoi {
    private static final zzhj zza;

    static {
        zzol.zza = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza().zza("measurement.fix_engagement_on_reset_analytics_data", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoi
    public final boolean zza() {
        return ((Boolean)zzol.zza.zza()).booleanValue();
    }
}

