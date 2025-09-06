package com.google.android.gms.internal.measurement;

public final class zzpp implements zzpm {
    private static final zzhj zza;
    private static final zzhj zzb;
    private static final zzhj zzc;
    private static final zzhj zzd;
    private static final zzhj zze;
    private static final zzhj zzf;
    private static final zzhj zzg;
    private static final zzhj zzh;
    private static final zzhj zzi;
    private static final zzhj zzj;
    private static final zzhj zzk;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpp.zza = zzhr0.zza("measurement.rb.attribution.ad_campaign_info", false);
        zzpp.zzb = zzhr0.zza("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        zzpp.zzc = zzhr0.zza("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        zzpp.zzd = zzhr0.zza("measurement.rb.attribution.client2", true);
        zzhr0.zza("measurement.rb.attribution.dma_fix", true);
        zzpp.zze = zzhr0.zza("measurement.rb.attribution.followup1.service", false);
        zzhr0.zza("measurement.rb.attribution.index_out_of_bounds_fix", true);
        zzpp.zzf = zzhr0.zza("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        zzpp.zzg = zzhr0.zza("measurement.rb.attribution.retry_disposition", false);
        zzpp.zzh = zzhr0.zza("measurement.rb.attribution.service", true);
        zzpp.zzi = zzhr0.zza("measurement.rb.attribution.enable_trigger_redaction", true);
        zzpp.zzj = zzhr0.zza("measurement.rb.attribution.uuid_generation", true);
        zzhr0.zza("measurement.id.rb.attribution.retry_disposition", 0L);
        zzpp.zzk = zzhr0.zza("measurement.rb.attribution.improved_retry", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzb() {
        return ((Boolean)zzpp.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzc() {
        return ((Boolean)zzpp.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzd() {
        return ((Boolean)zzpp.zzc.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zze() {
        return ((Boolean)zzpp.zzd.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzf() {
        return ((Boolean)zzpp.zze.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzg() {
        return ((Boolean)zzpp.zzf.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzh() {
        return ((Boolean)zzpp.zzg.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzi() {
        return ((Boolean)zzpp.zzh.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzj() {
        return ((Boolean)zzpp.zzi.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzk() {
        return ((Boolean)zzpp.zzj.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzl() {
        return ((Boolean)zzpp.zzk.zza()).booleanValue();
    }
}

