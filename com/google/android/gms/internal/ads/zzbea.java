package com.google.android.gms.internal.ads;

public final class zzbea {
    public static final zzbdv zza;
    public static final zzbdv zzb;
    public static final zzbdv zzc;
    public static final zzbdv zzd;
    public static final zzbdv zze;
    public static final zzbdv zzf;
    public static final zzbdv zzg;
    public static final zzbdv zzh;

    static {
        zzbea.zza = zzbdv.zzb("gads:app_permissions_caching_expiry_ms:expiry", 60000L);
        zzbea.zzb = zzbdv.zzb("gads:audio_caching_expiry_ms:expiry", 5000L);
        zzbea.zzc = zzbdv.zzb("gads:battery_caching_expiry_ms:expiry", 10000L);
        zzbea.zzd = zzbdv.zzb("gads:device_info_caching_expiry_ms:expiry", 300000L);
        zzbea.zze = zzbdv.zzb("gads:hsdp_caching_expiry_ms:expiry", 600000L);
        zzbea.zzf = zzbdv.zzb("gads:memory_caching_expiry_ms:expiry", 5000L);
        zzbea.zzg = zzbdv.zzb("gads:sdk_environment_caching_expiry_ms:expiry", 600000L);
        zzbea.zzh = zzbdv.zzb("gads:telephony_caching_expiry_ms:expiry", 5000L);
    }
}

