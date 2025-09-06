package com.google.android.gms.internal.measurement;

public final class zzpj implements zzpg {
    private static final zzhj zza;
    private static final zzhj zzb;
    private static final zzhj zzc;
    private static final zzhj zzd;
    private static final zzhj zze;
    private static final zzhj zzf;

    static {
        zzhr zzhr0 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpj.zza = zzhr0.zza("measurement.test.boolean_flag", false);
        zzpj.zzb = zzhr0.zza("measurement.test.cached_long_flag", -1L);
        zzpj.zzc = zzhr0.zza("measurement.test.double_flag", -3.0);
        zzpj.zzd = zzhr0.zza("measurement.test.int_flag", -2L);
        zzpj.zze = zzhr0.zza("measurement.test.long_flag", -1L);
        zzpj.zzf = zzhr0.zza("measurement.test.string_flag", "---");
    }

    @Override  // com.google.android.gms.internal.measurement.zzpg
    public final double zza() {
        return (double)(((Double)zzpj.zzc.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzpg
    public final long zzb() {
        return (long)(((Long)zzpj.zzb.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzpg
    public final long zzc() {
        return (long)(((Long)zzpj.zzd.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzpg
    public final long zzd() {
        return (long)(((Long)zzpj.zze.zza()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzpg
    public final String zze() {
        return (String)zzpj.zzf.zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzf() {
        return ((Boolean)zzpj.zza.zza()).booleanValue();
    }
}

