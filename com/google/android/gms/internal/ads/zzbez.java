package com.google.android.gms.internal.ads;

public final class zzbez {
    public static final zzbdv zza;
    public static final zzbdv zzb;

    static {
        zzbez.zza = zzbdv.zzd("gads:trustless_token_for_decagon:enabled", true);
        zzbdv.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbdv.zzd("gms:expose_token_for_gma:enabled", true);
        zzbdv.zzd("gads:referesh_rate_limit", false);
        zzbez.zzb = zzbdv.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbdv.zzd("gads:token_anonymization:enabled", true);
        zzbdv.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}

