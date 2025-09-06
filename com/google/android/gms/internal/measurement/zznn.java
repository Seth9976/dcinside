package com.google.android.gms.internal.measurement;

public final class zznn implements zznk {
    private static final zzhj zza;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhr0.zza("measurement.client.consent_state_v1", true);
        zzhr0.zza("measurement.client.3p_consent_state_v1", true);
        zzhr0.zza("measurement.service.consent_state_v1_W36", true);
        zznn.zza = zzhr0.zza("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override  // com.google.android.gms.internal.measurement.zznk
    public final long zza() {
        return (long)(((Long)zznn.zza.zza()));
    }
}

