package com.google.android.gms.internal.ads;

public final class zzbdx {
    public static final zzbdv zza;
    public static final zzbdv zzb;
    public static final zzbdv zzc;
    public static final zzbdv zzd;

    static {
        zzbdx.zza = zzbdv.zzd("gads:afs:csa_send_tcf_data", true);
        zzbdx.zzb = new zzbdv("gads:afs:csa_tcf_data_to_collect", "[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]", 4);
        zzbdx.zzc = new zzbdv("gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain", 4);
        zzbdx.zzd = new zzbdv("gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html", 4);
    }
}

