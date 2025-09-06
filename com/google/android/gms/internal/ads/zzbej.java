package com.google.android.gms.internal.ads;

public final class zzbej {
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
    public static final zzbdv zzk;

    static {
        zzbej.zza = zzbdv.zzd("gads:init:init_on_bg_thread", true);
        zzbej.zzb = zzbdv.zzd("gads:init:init_on_single_bg_thread", false);
        zzbej.zzc = zzbdv.zzd("gads:adloader_load_bg_thread", true);
        zzbej.zzd = zzbdv.zzd("gads:appopen_load_on_bg_thread", true);
        zzbej.zze = zzbdv.zzd("gads:banner_destroy_bg_thread", false);
        zzbej.zzf = zzbdv.zzd("gads:banner_load_bg_thread", true);
        zzbej.zzg = zzbdv.zzd("gads:banner_pause_bg_thread", false);
        zzbej.zzh = zzbdv.zzd("gads:banner_resume_bg_thread", false);
        zzbej.zzi = zzbdv.zzd("gads:interstitial_load_on_bg_thread", true);
        zzbdv.zzd("gads:persist_flags_on_bg_thread", true);
        zzbej.zzj = zzbdv.zzd("gads:query_info_bg_thread", true);
        zzbej.zzk = zzbdv.zzd("gads:rewarded_load_bg_thread", true);
    }
}

