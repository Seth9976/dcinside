package com.google.android.gms.internal.measurement;

public final class zznu implements zznv {
    private static final zzhj zza;
    private static final zzhj zzb;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zznu.zza = zzhr0.zza("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        zznu.zzb = zzhr0.zza("measurement.set_default_event_parameters_propagate_clear.service", false);
        zzhr0.zza("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zznv
    public final boolean zza() {
        return ((Boolean)zznu.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznv
    public final boolean zzb() {
        return ((Boolean)zznu.zzb.zza()).booleanValue();
    }
}

