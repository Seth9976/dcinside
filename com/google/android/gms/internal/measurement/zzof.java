package com.google.android.gms.internal.measurement;

public final class zzof implements zzoc {
    private static final zzhj zza;
    private static final zzhj zzb;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhr0.zza("measurement.client.ad_id_consent_fix", true);
        zzhr0.zza("measurement.service.consent.aiid_reset_fix", false);
        zzhr0.zza("measurement.service.consent.aiid_reset_fix2", true);
        zzhr0.zza("measurement.service.consent.app_start_fix", true);
        zzof.zza = zzhr0.zza("measurement.service.consent.params_on_fx", true);
        zzof.zzb = zzhr0.zza("measurement.service.consent.pfo_on_fx", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoc
    public final boolean zza() {
        return ((Boolean)zzof.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzoc
    public final boolean zzb() {
        return ((Boolean)zzof.zzb.zza()).booleanValue();
    }
}

