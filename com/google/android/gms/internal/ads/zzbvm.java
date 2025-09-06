package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class zzbvm {
    private final List zza;
    private final String zzb;
    private final String zzc;
    private final boolean zzd;
    private final boolean zze;
    private final String zzf;
    private final int zzg;
    private final JSONObject zzh;
    private final String zzi;
    private final long zzj;
    private final long zzk;

    public zzbvm(JSONObject jSONObject0) {
        this.zzf = jSONObject0.optString("url");
        this.zzb = jSONObject0.optString("base_uri");
        this.zzc = jSONObject0.optString("post_parameters");
        this.zzd = zzbvm.zzm(jSONObject0.optString("drt_include"));
        this.zze = zzbvm.zzm(jSONObject0.optString("cookies_include", "true"));
        jSONObject0.optString("request_id");
        jSONObject0.optString("type");
        String s = jSONObject0.optString("errors");
        this.zza = s == null ? null : Arrays.asList(s.split(","));
        this.zzg = jSONObject0.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject0.optString("fetched_ad");
        jSONObject0.optBoolean("render_test_ad_label");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("preprocessor_flags");
        if(jSONObject1 == null) {
            jSONObject1 = new JSONObject();
        }
        this.zzh = jSONObject1;
        jSONObject0.optString("analytics_query_ad_event_id");
        jSONObject0.optBoolean("is_analytics_logging_enabled");
        this.zzi = jSONObject0.optString("pool_key");
        this.zzj = (long)zzbvm.zzl(jSONObject0.optString("start_time"));
        this.zzk = (long)zzbvm.zzl(jSONObject0.optString("end_time"));
    }

    public final int zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzk;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzi;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zza;
    }

    public final JSONObject zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return this.zze;
    }

    public final boolean zzk() {
        return this.zzd;
    }

    private static Long zzl(String s) {
        if(TextUtils.isEmpty(s)) {
            return -1L;
        }
        try {
            return Long.valueOf(s);
        }
        catch(NumberFormatException unused_ex) {
            return -1L;
        }
    }

    // 去混淆评级： 低(20)
    private static boolean zzm(String s) {
        return s != null && (s.equals("1") || s.equals("true"));
    }
}

