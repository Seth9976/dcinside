package com.google.android.gms.internal.ads;

public final class zzbed {
    public static final zzbdv zza;
    public static final zzbdv zzb;
    public static final zzbdv zzc;
    public static final zzbdv zzd;
    public static final zzbdv zze;
    public static final zzbdv zzf;
    public static final zzbdv zzg;
    public static final zzbdv zzh;
    public static final zzbdv zzi;
    public static final zzbdv zzj;

    static {
        zzbed.zza = zzbdv.zzd("gads:always_enable_crash_loop_counter:enabled", false);
        zzbed.zzb = zzbdv.zzd("gads:crash_loop_stats_signal:enabled", false);
        zzbed.zzc = zzbdv.zzd("gads:crash_without_flag_write_count:enabled", false);
        zzbed.zzd = zzbdv.zzb("gads:crash_without_write_reset:count", -1L);
        zzbed.zze = zzbdv.zzd("gads:init_without_flag_write_count:enabled", false);
        zzbed.zzf = zzbdv.zzb("gads:init_without_write_reset:count", -1L);
        zzbed.zzg = zzbdv.zzd("gads:reset_app_settings:enabled", false);
        zzbed.zzh = zzbdv.zzd("gads:reset_counts_on_failure_service:enabled", false);
        zzbed.zzi = zzbdv.zzd("gads:reset_counts_on_local_flag_save:enabled", false);
        zzbed.zzj = zzbdv.zzd("gads:reset_counts_on_successful_service:enabled", false);
    }
}

