package com.google.android.gms.internal.ads;

public final class zzbeu {
    public static final zzbdv zza;
    public static final zzbdv zzb;
    public static final zzbdv zzc;
    public static final zzbdv zzd;
    public static final zzbdv zze;
    public static final zzbdv zzf;
    public static final zzbdv zzg;

    static {
        zzbeu.zza = zzbdv.zzb("gads:dynamite_load:fail:sample_rate", 10000L);
        zzbeu.zzb = zzbdv.zzd("gads:report_dynamite_crash_in_background_thread", false);
        zzbeu.zzc = new zzbdv("gads:public_beta:traffic_multiplier", "1.0", 4);
        zzbeu.zzd = new zzbdv("gads:sdk_crash_report_class_prefix", "com.google.", 4);
        zzbeu.zze = zzbdv.zzd("gads:sdk_crash_report_enabled", false);
        zzbeu.zzf = zzbdv.zzd("gads:sdk_crash_report_full_stacktrace", false);
        zzbeu.zzg = zzbdv.zza("gads:trapped_exception_sample_rate", 0.01);
    }
}

