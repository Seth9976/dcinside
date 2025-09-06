package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.common.util.concurrent.t0;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbvg extends zzbve {
    private final Object zza;
    private final Context zzb;
    @Nullable
    private SharedPreferences zzc;
    private final zzbnw zzd;
    private final VersionInfoParcel zze;

    public zzbvg(Context context0, zzbnw zzbnw0, VersionInfoParcel versionInfoParcel0) {
        this.zza = new Object();
        this.zzb = context0.getApplicationContext();
        this.zze = versionInfoParcel0;
        this.zzd = zzbnw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbve
    public final t0 zza() {
        synchronized(this.zza) {
            if(this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        long v1 = this.zzc == null ? 0L : this.zzc.getLong("js_last_update", 0L);
        if(zzv.zzC().currentTimeMillis() - v1 < ((long)(((Long)zzbel.zzd.zze())))) {
            return zzgch.zzh(null);
        }
        JSONObject jSONObject0 = zzbvg.zzc(this.zzb, this.zze);
        return zzgch.zzm(this.zzd.zzb(jSONObject0), new zzbvf(this), zzbzw.zzg);
    }

    final Void zzb(JSONObject jSONObject0) {
        SharedPreferences sharedPreferences0 = zzbce.zza(this.zzb);
        if(sharedPreferences0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            zzbe.zza().zze(sharedPreferences$Editor0, 1, jSONObject0);
            sharedPreferences$Editor0.commit();
            SharedPreferences sharedPreferences1 = this.zzc;
            if(sharedPreferences1 != null) {
                sharedPreferences1.edit().putLong("js_last_update", zzv.zzC().currentTimeMillis()).apply();
            }
        }
        return null;
    }

    public static JSONObject zzc(Context context0, VersionInfoParcel versionInfoParcel0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(((Boolean)zzbel.zzb.zze()).booleanValue()) {
                jSONObject0.put("package_name", "com.dcinside.app.android");
            }
            jSONObject0.put("js", versionInfoParcel0.afmaVersion);
            jSONObject0.put("mf", zzbel.zzc.zze());
            jSONObject0.put("cl", "697668803");
            jSONObject0.put("rapid_rc", "dev");
            jSONObject0.put("rapid_rollup", "HEAD");
            jSONObject0.put("admob_module_version", 12451000);
            jSONObject0.put("dynamite_local_version", 244410203);
            jSONObject0.put("dynamite_version", DynamiteModule.getRemoteVersion(context0, "com.google.android.gms.ads.dynamite"));
            jSONObject0.put("container_version", 12451000);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }
}

