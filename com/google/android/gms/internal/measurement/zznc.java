package com.google.android.gms.internal.measurement;

public final class zznc implements zznd {
    private static final zzhj zza;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zznc.zza = zzhr0.zza("measurement.service.ad_impression.convert_value_to_double", true);
        zzhr0.zza("measurement.client.ad_impression", true);
        zzhr0.zza("measurement.service.separate_public_internal_event_blacklisting", true);
        zzhr0.zza("measurement.service.ad_impression", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznd
    public final boolean zza() {
        return ((Boolean)zznc.zza.zza()).booleanValue();
    }
}

