package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzgcs;
import com.google.common.util.concurrent.t0;
import o3.j;
import org.json.JSONObject;

@j
public final class zzf {
    private Context zza;
    private long zzb;

    public zzf() {
        this.zzb = 0L;
    }

    public final void zza(Context context0, VersionInfoParcel versionInfoParcel0, String s, @Nullable Runnable runnable0, zzfhk zzfhk0, @Nullable zzdrw zzdrw0, @Nullable Long long0) {
        this.zzb(context0, versionInfoParcel0, true, null, s, null, runnable0, zzfhk0, zzdrw0, long0);
    }

    @VisibleForTesting
    final void zzb(Context context0, VersionInfoParcel versionInfoParcel0, boolean z, @Nullable zzbzg zzbzg0, String s, @Nullable String s1, @Nullable Runnable runnable0, zzfhk zzfhk0, @Nullable zzdrw zzdrw0, @Nullable Long long0) {
        if(zzv.zzC().elapsedRealtime() - this.zzb < 5000L) {
            zzo.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzv.zzC().elapsedRealtime();
        if(zzbzg0 != null && !TextUtils.isEmpty(zzbzg0.zzc()) && zzv.zzC().currentTimeMillis() - zzbzg0.zza() <= ((long)(((Long)zzbe.zzc().zza(zzbcl.zzej)))) && zzbzg0.zzi()) {
            return;
        }
        if(context0 == null) {
            zzo.zzj("Context not provided to fetch application settings");
            return;
        }
        if(TextUtils.isEmpty(s) && TextUtils.isEmpty(s1)) {
            zzo.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context context1 = context0.getApplicationContext();
        if(context1 == null) {
            context1 = context0;
        }
        this.zza = context1;
        zzfgw zzfgw0 = zzfgv.zza(context0, 4);
        zzfgw0.zzi();
        zzbnw zzbnw0 = zzv.zzg().zza(this.zza, versionInfoParcel0, zzfhk0).zza("google.afma.config.fetchAppSettings", zzbod.zza, zzbod.zza);
        try {
            JSONObject jSONObject0 = new JSONObject();
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("app_id", s);
            }
            else if(!TextUtils.isEmpty(s1)) {
                jSONObject0.put("ad_unit_id", s1);
            }
            jSONObject0.put("is_init", z);
            jSONObject0.put("pn", "com.dcinside.app.android");
            jSONObject0.put("experiment_ids", TextUtils.join(",", zzbe.zza().zza()));
            jSONObject0.put("js", versionInfoParcel0.afmaVersion);
            try {
                ApplicationInfo applicationInfo0 = this.zza.getApplicationInfo();
                if(applicationInfo0 != null) {
                    PackageInfo packageInfo0 = Wrappers.packageManager(context0).getPackageInfo(applicationInfo0.packageName, 0);
                    if(packageInfo0 != null) {
                        jSONObject0.put("version", packageInfo0.versionCode);
                    }
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                zze.zza("Error fetching PackageInfo.");
            }
            t0 t00 = zzbnw0.zzb(jSONObject0);
            zzd zzd0 = (JSONObject jSONObject0) -> {
                boolean z = jSONObject0.optBoolean("isSuccessful", false);
                if(z) {
                    String s = jSONObject0.getString("appSettingsJson");
                    zzv.zzp().zzi().zzs(s);
                    if(long0 != null) {
                        zzf.zzf(zzdrw0, "cld_s", zzv.zzC().elapsedRealtime() - ((long)long0));
                    }
                }
                zzfgw0.zzg(z);
                zzfhk0.zzb(zzfgw0.zzm());
                return zzgch.zzh(null);
            };
            zzgcs zzgcs0 = zzbzw.zzg;
            t0 t01 = zzgch.zzn(t00, zzd0, zzgcs0);
            if(runnable0 != null) {
                t00.addListener(runnable0, zzgcs0);
            }
            if(long0 != null) {
                t00.addListener(() -> zzf.zzf(zzdrw0, "cld_r", zzv.zzC().elapsedRealtime() - ((long)long0)), zzgcs0);
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzhC)).booleanValue()) {
                zzbzz.zzb(t01, "ConfigLoader.maybeFetchNewAppSettings");
                return;
            }
            zzbzz.zza(t01, "ConfigLoader.maybeFetchNewAppSettings");
            return;
        }
        catch(Exception exception0) {
        }
        zzo.zzh("Error requesting application settings", exception0);
        zzfgw0.zzh(exception0);
        zzfgw0.zzg(false);
        zzfhk0.zzb(zzfgw0.zzm());
    }

    public final void zzc(Context context0, VersionInfoParcel versionInfoParcel0, String s, zzbzg zzbzg0, zzfhk zzfhk0) {
        this.zzb(context0, versionInfoParcel0, false, zzbzg0, (zzbzg0 == null ? null : zzbzg0.zzb()), s, null, zzfhk0, null, null);
    }

    // 检测为 Lambda 实现
    static final t0 zzd(Long long0, zzdrw zzdrw0, zzfhk zzfhk0, zzfgw zzfgw0, JSONObject jSONObject0) throws Exception [...]

    // 检测为 Lambda 实现
    static final void zze(zzdrw zzdrw0, Long long0) [...]

    private static final void zzf(zzdrw zzdrw0, String s, long v) {
        if(zzdrw0 != null && ((Boolean)zzbe.zzc().zza(zzbcl.zzmy)).booleanValue()) {
            zzdrv zzdrv0 = zzdrw0.zza();
            zzdrv0.zzb("action", "lat_init");
            zzdrv0.zzb(s, Long.toString(v));
            zzdrv0.zzg();
        }
    }
}

