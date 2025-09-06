package com.google.android.gms.internal.ads;

public final class zzbes {
    public static final zzbdv zza;
    public static final zzbdv zzb;

    static {
        zzbes.zza = zzbdv.zzd("gads:separate_url_generation:enabled", true);
        zzbes.zzb = zzbdv.zzb("gads:url_cache:max_size", 200L);
        zzbdv.zzd("gads:use_request_id_as_url_cache_key:enabled", true);
    }
}

