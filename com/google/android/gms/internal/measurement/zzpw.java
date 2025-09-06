package com.google.android.gms.internal.measurement;

public final class zzpw implements zzpx {
    private static final zzhj zza;
    private static final zzhj zzb;
    private static final zzhj zzc;
    private static final zzhj zzd;
    private static final zzhj zze;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpw.zza = zzhr0.zza("measurement.sgtm.google_signal.enable", false);
        zzpw.zzb = zzhr0.zza("measurement.sgtm.preview_mode_enabled", true);
        zzpw.zzc = zzhr0.zza("measurement.sgtm.rollout_percentage_fix", false);
        zzpw.zzd = zzhr0.zza("measurement.sgtm.service", true);
        zzpw.zze = zzhr0.zza("measurement.sgtm.upload_queue", false);
        zzhr0.zza("measurement.id.sgtm", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpx
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpx
    public final boolean zzb() {
        return ((Boolean)zzpw.zza.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpx
    public final boolean zzc() {
        return ((Boolean)zzpw.zzb.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpx
    public final boolean zzd() {
        return ((Boolean)zzpw.zzc.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpx
    public final boolean zze() {
        return ((Boolean)zzpw.zzd.zza()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpx
    public final boolean zzf() {
        return ((Boolean)zzpw.zze.zza()).booleanValue();
    }
}

