package com.google.android.gms.internal.ads;

public final class zzbeq {
    public static final zzbdv zza;
    public static final zzbdv zzb;
    public static final zzbdv zzc;
    public static final zzbdv zzd;
    public static final zzbdv zze;
    public static final zzbdv zzf;

    static {
        zzbeq.zza = zzbdv.zzd("gads:paw_app_signals:enabled", false);
        zzbeq.zzb = zzbdv.zzd("gads:paw_delegate_web_view_client:enabled", false);
        zzbeq.zzc = zzbdv.zzd("gads:paw_cache:enabled", false);
        zzbeq.zzd = zzbdv.zzb("gads:paw_cache:refresh_interval_seconds", 30L);
        zzbeq.zze = zzbdv.zzb("gads:paw_cache:retry_delay_seconds", 10L);
        zzbeq.zzf = zzbdv.zzb("gads:paw_cache:ttl_ms", 60000L);
    }
}

