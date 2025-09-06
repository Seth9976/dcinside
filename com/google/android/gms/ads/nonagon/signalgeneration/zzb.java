package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzdre;
import com.google.android.gms.internal.ads.zzfra;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrf;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzb {
    private final Context zza;
    private final zzd zzb;
    private final long zzc;
    private final ScheduledExecutorService zzd;
    @Nullable
    private final PackageInfo zze;

    zzb(Context context0, long v, @Nullable PackageInfo packageInfo0, zzd zzd0, ScheduledExecutorService scheduledExecutorService0) {
        this.zza = context0;
        this.zzc = v;
        this.zze = packageInfo0;
        this.zzb = zzd0;
        this.zzd = scheduledExecutorService0;
    }

    @Nullable
    public final zzbk zza(zzbyy zzbyy0, zzau zzau0, Bundle bundle0) {
        String s7;
        String s5;
        zzb.zzf(bundle0, zzdre.zzD);
        if(zzv.zzp().zzi().zzN()) {
            this.zzb.zzg();
            zzb.zzg(bundle0, 7);
            return null;
        }
        if(this.zze == null) {
            this.zzb.zzg();
            zzb.zzg(bundle0, 10);
            return null;
        }
        String s = this.zzb.zze();
        int v = this.zzb.zzb();
        String s1 = this.zzb.zzd();
        int v1 = this.zzb.zza();
        if(!TextUtils.equals(this.zza.getApplicationInfo().packageName, s) || v != this.zze.versionCode || !TextUtils.equals(Build.MODEL, s1) || v1 != Build.VERSION.SDK_INT) {
            this.zzb.zzg();
            ApplicationInfo applicationInfo0 = this.zza.getApplicationInfo();
            this.zzb.zzi(applicationInfo0.packageName, this.zze.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
        }
        else {
            for(Object object0: this.zzb.zzf().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                try {
                    long v2 = new JSONObject(((String)map$Entry0.getValue())).getLong("ts_ms");
                    if(zzv.zzC().currentTimeMillis() - v2 <= ((long)(((Long)zzbe.zzc().zza(zzbcl.zzhu))))) {
                        zzfra zzfra0 = zzfre.zzj(this.zza).zzh(((long)(((Long)zzbe.zzc().zza(zzbcl.zzdp)))), zzv.zzp().zzi().zzN());
                        zzfra zzfra1 = zzfrf.zzi(this.zza).zzh(((long)(((Long)zzbe.zzc().zza(zzbcl.zzdq)))), zzv.zzp().zzi().zzN());
                        if(zzfra0.zza() != -1L && zzfra0.zza() > v2 || zzfra1.zza() != -1L && zzfra1.zza() > v2) {
                            goto label_23;
                        }
                        continue;
                    }
                label_23:
                    String s2 = (String)map$Entry0.getKey();
                    this.zzb.zzc(s2);
                }
                catch(IOException | JSONException unused_ex) {
                }
            }
        }
        zzb.zzf(bundle0, zzdre.zzE);
        long v3 = zzv.zzC().currentTimeMillis();
        long v4 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzhr)));
        if(v3 - this.zzc > v4) {
            zzb.zzg(bundle0, 2);
            return null;
        }
        zzb.zzf(bundle0, zzdre.zzF);
        String s3 = zzf.zzg((zzbyy0.zza + zzbyy0.zzb + zzbyy0.zzd.zzn.toString() + zzbyy0.zzd.zzc.toString() + zzbyy0.zzd.zzi + zzbyy0.zzd.zzp + zzbyy0.zzd.zzo));
        if(TextUtils.isEmpty(s3)) {
            zzb.zzg(bundle0, 3);
            return null;
        }
        zzb.zzf(bundle0, zzdre.zzG);
        zzb.zzf(bundle0, zzdre.zzH);
        String s4 = this.zzb.zzc(s3);
        zzb.zzf(bundle0, zzdre.zzI);
        if(!this.zze()) {
            zza zza0 = () -> if(!this.zzb.zzj(s3) && !this.zze()) {
                zzau0.zzf(ObjectWrapper.wrap(this.zza), new zzbyy(zzbyy0.zza, zzbyy0.zzb, zzbyy0.zzc, zzbyy0.zzd, 2, s3), null);
            };
            long v5 = (long)(((Long)zzbe.zzc().zza(zzbcl.zzht)));
            this.zzd.schedule(zza0, v5, TimeUnit.MILLISECONDS);
        }
        if(TextUtils.isEmpty(s4)) {
            zzb.zzg(bundle0, 4);
            return null;
        }
        zzb.zzf(bundle0, zzdre.zzJ);
        try {
            JSONObject jSONObject0 = new JSONObject(s4);
            s5 = jSONObject0.getString("sr");
            if(TextUtils.isEmpty(s5)) {
                zzb.zzg(bundle0, 8);
                return null;
            }
            String s6 = jSONObject0.getString("rs");
            if(TextUtils.isEmpty(s6)) {
                zzb.zzg(bundle0, 9);
                return null;
            }
            s7 = zzb.zzb(new String(Base64.decode(s6, 10), StandardCharsets.UTF_8));
            zzb.zzf(bundle0, zzdre.zzK);
            goto label_70;
        }
        catch(JSONException jSONException0) {
        }
        zzb.zzg(bundle0, 5);
        zzv.zzp().zzw(jSONException0, "DiskCachingManager.getSignalResponse");
        return null;
        try {
        label_70:
            zzbk zzbk0 = new zzbk(new JsonReader(new StringReader(s5)), null);
            zzbk0.zzc = s7;
            zzbk0.zze = bundle0;
            bundle0.putBoolean("sod_h", true);
            return zzbk0;
        }
        catch(IOException iOException0) {
            zzb.zzg(bundle0, 6);
            zzv.zzp().zzw(iOException0, "DiskCachingManager.getSignalResponse");
            return null;
        }
    }

    public static String zzb(@Nullable String s) {
        if(s == null) {
            return "";
        }
        char[] arr_c = s.toCharArray();
        for(int v = 0; v < arr_c.length; ++v) {
            arr_c[v] = (char)(arr_c[v] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(v % 555));
        }
        return new String(arr_c);
    }

    // 检测为 Lambda 实现
    final void zzc(String s, zzau zzau0, zzbyy zzbyy0) [...]

    public final void zzd(@Nullable String s, @Nullable zzbk zzbk0) {
        String s2;
        if(!TextUtils.isEmpty(s) && !this.zze()) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("params", zzbk0.zza);
                jSONObject1.put("signal_dictionary", zzbc.zzb().zzi(zzbk0.zzf));
                jSONObject0.put("sr", jSONObject1);
                String s1 = zzbk0.zzc;
                if(TextUtils.isEmpty(s1)) {
                    s2 = "";
                }
                else {
                    jSONObject0.put("rs", Base64.encodeToString(zzb.zzb(s1).getBytes(StandardCharsets.UTF_8), 10));
                    jSONObject0.put("ts_ms", zzv.zzC().currentTimeMillis());
                    goto label_15;
                }
                goto label_16;
            }
            catch(JSONException jSONException0) {
            }
            zzv.zzp().zzw(jSONException0, "DiskCachingManager.createStringToWrite");
        label_15:
            s2 = jSONObject0.toString();
        label_16:
            if(!TextUtils.isEmpty(s2)) {
                this.zzb.zzh(s, s2);
            }
        }
    }

    private final boolean zze() {
        return this.zzb.zzf().size() >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzhv))));
    }

    private static final void zzf(Bundle bundle0, zzdre zzdre0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzhw)).booleanValue()) {
            return;
        }
        bundle0.putLong(zzdre0.zza(), zzv.zzC().currentTimeMillis());
    }

    private static final void zzg(Bundle bundle0, int v) {
        bundle0.putBoolean("sod_h", false);
        bundle0.putInt("cmr", v - 1);
    }
}

