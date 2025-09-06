package com.google.android.gms.internal.measurement;

public final class zzog implements zzoh {
    private static final zzhj zza;
    private static final zzhj zzb;
    private static final zzhj zzc;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhr0.zza("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        zzog.zza = zzhr0.zza("measurement.audience.refresh_event_count_filters_timestamp", false);
        zzog.zzb = zzhr0.zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        zzog.zzc = zzhr0.zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoh
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzoh
    public final boolean zzb() {
        return ((Boolean)zzog.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzoh
    public final boolean zzc() {
        return ((Boolean)zzog.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzoh
    public final boolean zzd() {
        return ((Boolean)zzog.zzc.zza()).booleanValue();
    }
}

