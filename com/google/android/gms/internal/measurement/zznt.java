package com.google.android.gms.internal.measurement;

public final class zznt implements zznq {
    private static final zzhj zza;
    private static final zzhj zzb;
    private static final zzhj zzc;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zznt.zza = zzhr0.zza("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        zznt.zzb = zzhr0.zza("measurement.defensively_copy_bundles_validate_default_params", true);
        zznt.zzc = zzhr0.zza("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final boolean zzb() {
        return ((Boolean)zznt.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final boolean zzc() {
        return ((Boolean)zznt.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznq
    public final boolean zzd() {
        return ((Boolean)zznt.zzc.zza()).booleanValue();
    }
}

