package com.google.android.gms.internal.measurement;

public final class zzno implements zznp {
    private static final zzhj zza;
    private static final zzhj zzb;
    private static final zzhj zzc;
    private static final zzhj zzd;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzno.zza = zzhr0.zza("measurement.consent.stop_reset_on_storage_denied.client", true);
        zzno.zzb = zzhr0.zza("measurement.consent.stop_reset_on_storage_denied.service", true);
        zzno.zzc = zzhr0.zza("measurement.consent.scrub_audience_data_analytics_consent", true);
        zzno.zzd = zzhr0.zza("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznp
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zznp
    public final boolean zzb() {
        return ((Boolean)zzno.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznp
    public final boolean zzc() {
        return ((Boolean)zzno.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznp
    public final boolean zzd() {
        return ((Boolean)zzno.zzc.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznp
    public final boolean zze() {
        return ((Boolean)zzno.zzd.zza()).booleanValue();
    }
}

