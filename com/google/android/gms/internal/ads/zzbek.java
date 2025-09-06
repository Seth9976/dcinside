package com.google.android.gms.internal.ads;

public final class zzbek {
    public static final zzbdv zza;
    public static final zzbdv zzb;
    public static final zzbdv zzc;
    public static final zzbdv zzd;
    public static final zzbdv zze;
    public static final zzbdv zzf;
    public static final zzbdv zzg;
    public static final zzbdv zzh;
    public static final zzbdv zzi;

    static {
        zzbek.zza = new zzbdv("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
        zzbek.zzb = new zzbdv("gads:gma_attestation:click:query_param", "attok", 4);
        zzbek.zzc = zzbdv.zzb("gads:gma_attestation:click:timeout", 2000L);
        zzbek.zzd = zzbdv.zzd("gads:gma_attestation:click:enable", false);
        zzbek.zze = zzbdv.zzb("gads:gma_attestation:click:enable_dynamite_version", 213806100L);
        zzbek.zzf = zzbdv.zzd("gads:gma_attestation:click:qualification:enable", true);
        zzbek.zzg = zzbdv.zzd("gads:gma_attestation:image_hash", false);
        zzbek.zzh = zzbdv.zzd("gads:gma_attestation:impression:enable", true);
        zzbdv.zzd("gads:gma_attestation:request:enable_javascript", false);
        zzbdv.zzd("gads:gma_attestation:request:enable", true);
        zzbek.zzi = zzbdv.zzd("gads:gma_attestation:click:report_error", true);
    }
}

