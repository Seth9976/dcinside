package com.google.android.gms.internal.measurement;

public final class zznz implements zznw {
    private static final zzhj zza;
    private static final zzhj zzb;
    private static final zzhj zzc;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhr0.zza("measurement.dma_consent.client", true);
        zzhr0.zza("measurement.dma_consent.client_bow_check2", true);
        zzhr0.zza("measurement.dma_consent.separate_service_calls_fix", true);
        zzhr0.zza("measurement.dma_consent.service", true);
        zznz.zza = zzhr0.zza("measurement.dma_consent.service_database_update_fix", true);
        zzhr0.zza("measurement.dma_consent.service_dcu_event", true);
        zznz.zzb = zzhr0.zza("measurement.dma_consent.service_dcu_event2", true);
        zzhr0.zza("measurement.dma_consent.service_npa_remote_default", true);
        zzhr0.zza("measurement.dma_consent.service_split_batch_on_consent", true);
        zzhr0.zza("measurement.dma_consent.set_consent_inline_on_worker", true);
        zznz.zzc = zzhr0.zza("measurement.dma_consent.setting_npa_inline_fix", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznw
    public final boolean zza() {
        return ((Boolean)zznz.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznw
    public final boolean zzb() {
        return ((Boolean)zznz.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznw
    public final boolean zzc() {
        return ((Boolean)zznz.zzc.zza()).booleanValue();
    }
}

