package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcbr {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final long zzm;
    public final long zzn;

    public zzcbr(String s) {
        JSONObject jSONObject0 = null;
        if(s != null) {
            try {
                jSONObject0 = new JSONObject(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        this.zza = zzcbr.zza(jSONObject0, "aggressive_media_codec_release", zzbcl.zzV);
        this.zzb = zzcbr.zzb(jSONObject0, "byte_buffer_precache_limit", zzbcl.zzi);
        this.zzc = zzcbr.zzb(jSONObject0, "exo_cache_buffer_size", zzbcl.zzs);
        this.zzd = zzcbr.zzb(jSONObject0, "exo_connect_timeout_millis", zzbcl.zze);
        zzbcc zzbcc0 = zzbcl.zzd;
        if(jSONObject0 == null) {
        label_12:
            String s1 = (String)zzbe.zzc().zza(zzbcc0);
        }
        else {
            try {
                jSONObject0.getString("exo_player_version");
                goto label_13;
            }
            catch(JSONException unused_ex) {
            }
            goto label_12;
        }
    label_13:
        this.zze = zzcbr.zzb(jSONObject0, "exo_read_timeout_millis", zzbcl.zzf);
        this.zzf = zzcbr.zzb(jSONObject0, "load_check_interval_bytes", zzbcl.zzg);
        this.zzg = zzcbr.zzb(jSONObject0, "player_precache_limit", zzbcl.zzh);
        this.zzh = zzcbr.zzb(jSONObject0, "socket_receive_buffer_size", zzbcl.zzj);
        this.zzi = zzcbr.zza(jSONObject0, "use_cache_data_source", zzbcl.zzep);
        zzcbr.zzb(jSONObject0, "min_retry_count", zzbcl.zzk);
        this.zzj = zzcbr.zza(jSONObject0, "treat_load_exception_as_non_fatal", zzbcl.zzm);
        this.zzk = zzcbr.zza(jSONObject0, "enable_multiple_video_playback", zzbcl.zzbZ);
        this.zzl = zzcbr.zza(jSONObject0, "use_range_http_data_source", zzbcl.zzcb);
        this.zzm = zzcbr.zzc(jSONObject0, "range_http_data_source_high_water_mark", zzbcl.zzcc);
        this.zzn = zzcbr.zzc(jSONObject0, "range_http_data_source_low_water_mark", zzbcl.zzcd);
    }

    private static final boolean zza(JSONObject jSONObject0, String s, zzbcc zzbcc0) {
        boolean z = ((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue();
        if(jSONObject0 != null) {
            try {
                return jSONObject0.getBoolean(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        return z;
    }

    private static final int zzb(JSONObject jSONObject0, String s, zzbcc zzbcc0) {
        if(jSONObject0 != null) {
            try {
                return jSONObject0.getInt(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        return (int)(((Integer)zzbe.zzc().zza(zzbcc0)));
    }

    private static final long zzc(JSONObject jSONObject0, String s, zzbcc zzbcc0) {
        if(jSONObject0 != null) {
            try {
                return jSONObject0.getLong(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        return (long)(((Long)zzbe.zzc().zza(zzbcc0)));
    }
}

