package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzv;
import com.google.common.util.concurrent.t0;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdxl {
    private static final Pattern zza;
    private final zzcgx zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzfcj zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfhh zzi;
    private final zzdrq zzj;
    private final Object zzk;
    private final zzbvs zzl;

    static {
        zzdxl.zza = Pattern.compile("\\?");
    }

    zzdxl(zzcgx zzcgx0, Context context0, VersionInfoParcel versionInfoParcel0, zzfcj zzfcj0, Executor executor0, String s, zzfhh zzfhh0, zzdrq zzdrq0, zzbvs zzbvs0, zzdzq zzdzq0, ScheduledExecutorService scheduledExecutorService0) {
        this.zzk = new Object();
        this.zzb = zzcgx0;
        this.zzc = context0;
        this.zzd = versionInfoParcel0;
        this.zze = zzfcj0;
        this.zzf = executor0;
        this.zzh = s;
        this.zzi = zzfhh0;
        zzcgx0.zzx();
        this.zzj = zzdrq0;
        this.zzl = zzbvs0;
        this.zzg = scheduledExecutorService0;
    }

    public final t0 zza() {
        String s2;
        int v3;
        String s7;
        JSONObject jSONObject0;
        String s6;
        String s5;
        String s = this.zze.zzd.zzx;
        if(!TextUtils.isEmpty(s)) {
            String s1 = zzdxl.zzg(s);
            zzbcc zzbcc0 = zzbcl.zzgR;
            if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue() && s1.isEmpty()) {
                int v = s.lastIndexOf("&request_id=");
                s1 = v == -1 ? "" : s.substring(v + 12);
            }
            if(TextUtils.isEmpty(s1)) {
                return zzgch.zzg(new zzegu(15, "Invalid ad string."));
            }
            synchronized(this.zzk) {
                zzv zzv0 = this.zzb.zzo();
                s2 = zzv0.zzb(s1, this.zzj);
                String s3 = null;
                if(((Boolean)zzbe.zzc().zza(zzbcc0)).booleanValue()) {
                    zzdrq zzdrq0 = this.zzj;
                    if(!TextUtils.isEmpty(s2)) {
                        try {
                            if(new JSONObject(s2).optString("is_gbid").equals("true")) {
                                goto label_20;
                            }
                        }
                        catch(JSONException unused_ex) {
                        }
                        goto label_37;
                    label_20:
                        int v2 = s.lastIndexOf("&");
                        String s4 = v2 == -1 ? null : s.substring(0, v2);
                        if(!TextUtils.isEmpty(s4)) {
                            try {
                                byte[] arr_b = Base64.decode(s4, 11);
                                byte[] arr_b1 = s1.getBytes("UTF-8");
                                if(TextUtils.isEmpty(s2)) {
                                label_31:
                                    s5 = null;
                                }
                                else {
                                    try {
                                        s5 = new JSONObject(s2).getString("arek");
                                    }
                                    catch(JSONException jSONException0) {
                                        zze.zza(("Failed to get key from QueryJSONMap" + jSONException0.toString()));
                                        com.google.android.gms.ads.internal.zzv.zzp().zzw(jSONException0, "CryptoUtils.getKeyFromQueryJsonMap");
                                        goto label_31;
                                    }
                                }
                                s = zzfcy.zzb(arr_b, arr_b1, s5, zzdrq0);
                            }
                            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                                zze.zza(("Failed to decode the adResponse. " + unsupportedEncodingException0.toString()));
                                com.google.android.gms.ads.internal.zzv.zzp().zzw(unsupportedEncodingException0, "PreloadedLoader.decryptAdResponseIfNecessary");
                            }
                        }
                    }
                }
            label_37:
                if(TextUtils.isEmpty(s)) {
                    s6 = "";
                }
                else {
                    try {
                        jSONObject0 = new JSONObject(s);
                    }
                    catch(JSONException unused_ex) {
                        s6 = "";
                        goto label_45;
                    }
                    s6 = jSONObject0.optString("render_id", "");
                }
            label_45:
                if(TextUtils.isEmpty(s6)) {
                    v3 = 0;
                }
                else {
                    try {
                        s7 = new String(Base64.decode(s6, 0), StandardCharsets.UTF_8);
                    }
                    catch(IllegalArgumentException illegalArgumentException0) {
                        s7 = "";
                        zze.zza(("Ad grouping: Has render_id, but not base64 encoded: " + s6));
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(illegalArgumentException0, "PreloadedLoader.decodeRenderId");
                    }
                    List list0 = zzfvc.zzb(zzfty.zzc(':')).zzf(s7);
                    if(list0.size() == 2) {
                        s3 = (String)list0.get(0);
                        v3 = Integer.parseInt(((String)list0.get(1)));
                    }
                    else {
                        zze.zza(("Ad grouping: Has render_id, but invalid format: " + s6));
                        v3 = 0;
                    }
                }
                Pair pair0 = s3 == null ? new Pair("", 0) : new Pair(s3, v3);
                String s8 = (String)pair0.first;
                int v4 = (int)(((Integer)pair0.second));
                if(TextUtils.isEmpty(s8) || v4 <= 0) {
                    zzv0.zzf(s1);
                }
                else {
                    if(zzv0.zzh(s1, s8)) {
                        return zzgch.zzg(new zzegu(10, "The ad has already been shown."));
                    }
                    if(!zzv0.zzg(s1, s8, v4)) {
                        zzv0.zzf(s1);
                    }
                }
            }
            if(!TextUtils.isEmpty(s2)) {
                return this.zzd(s, this.zze(s2));
            }
        }
        zzc zzc0 = this.zze.zzd.zzs;
        if(zzc0 != null) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzgJ)).booleanValue()) {
                String s9 = zzdxl.zzg(zzc0.zza);
                String s10 = zzdxl.zzg(zzc0.zzb);
                if(!TextUtils.isEmpty(s10) && s9.equals(s10)) {
                    this.zzb.zzo().zzf(s9);
                    this.zzj.zzb().put("request_id", s9);
                    goto label_88;
                }
                this.zzj.zzb().put("ridmm", "true");
                return zzgch.zzg(new zzegu(14, "Mismatch request IDs."));
            }
        label_88:
            String s11 = this.zze(zzc0.zzb);
            return this.zzd(zzc0.zza, s11);
        }
        return zzgch.zzg(new zzegu(14, "Mismatch request IDs."));
    }

    // 检测为 Lambda 实现
    final t0 zzb(JSONObject jSONObject0) throws Exception [...]

    // 检测为 Lambda 实现
    final String zzc(zzdzn zzdzn0) throws Exception [...]

    private final t0 zzd(@Nullable String s, String s1) {
        t0 t00;
        String s3;
        JSONObject jSONObject0;
        String s2 = "";
        if(TextUtils.isEmpty(s)) {
            return zzgch.zzg(new zzegu(15, "Invalid ad string."));
        }
        zzfgw zzfgw0 = zzfgv.zza(this.zzc, 11);
        zzfgw0.zzi();
        zzfhk zzfhk0 = this.zzb.zzz();
        zzbnw zzbnw0 = com.google.android.gms.ads.internal.zzv.zzg().zza(this.zzc, this.zzd, zzfhk0).zza("google.afma.response.normalize", zzbod.zza, zzbod.zza);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgS)).booleanValue()) {
            try {
                jSONObject0 = new JSONObject(s);
            }
            catch(JSONException unused_ex) {
                s3 = "";
                goto label_13;
            }
            s3 = jSONObject0.optString("fetch_url", "");
        label_13:
            if(TextUtils.isEmpty(s3)) {
                t00 = zzgch.zzh(s);
                this.zzj.zzc("sst", "1");
            }
            else {
                this.zzj.zzc("sst", "2");
                Object object0 = zzbe.zzc().zza(zzbcl.zzgU);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzgT)).booleanValue()) {
                    List list0 = zzfvc.zzc(zzdxl.zza).zzf(s3);
                    if(list0.size() < 2) {
                        t00 = zzgch.zzg(new zzegu(1, "Invalid fetch URL."));
                    }
                    else {
                        s2 = (String)list0.get(1);
                        s3 = Uri.parse(s3).buildUpon().query(null).build().toString();
                        goto label_23;
                    }
                }
                else {
                label_23:
                    zzdxj zzdxj0 = () -> {
                        this.zzf(zzdre.zzB);
                        int v = 0;
                        int v1 = -1;
                        try {
                            while(v < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgW))))) {
                                String s = this.zzd.afmaVersion;
                                int v2 = Binder.getCallingUid();
                                zzdzo zzdzo0 = new zzdzp(this.zzc, s, this.zzl, v2).zzb(new zzdzn(s3, 60000, new HashMap(), s2.getBytes(StandardCharsets.UTF_8), ((String)object0), false));
                                int v3 = zzdzo0.zza;
                                if(((Boolean)zzbe.zzc().zza(zzbcl.zzgX)).booleanValue()) {
                                    this.zzj.zzc("fr", String.valueOf(v));
                                }
                                if(v3 == 200) {
                                    this.zzf(zzdre.zzC);
                                    return zzdzo0.zzc;
                                }
                                ++v;
                                v1 = v3;
                            }
                            throw new zzegu(1, "Received HTTP error code from ad server: " + v1);
                        }
                        catch(Exception exception0) {
                        }
                        throw new zzegu(1, (exception0.getMessage() == null ? "Fetch failed." : exception0.getMessage()), exception0);
                    };
                    zzgby zzgby0 = (zzgby)zzgch.zzo(zzgby.zzu(zzbzw.zza.zzb(zzdxj0)), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzgV)))))), TimeUnit.MILLISECONDS, this.zzg);
                    zzdxk zzdxk0 = new zzdxk();
                    t00 = (zzgby)zzgch.zzf(zzgby0, Exception.class, zzdxk0, this.zzf);
                }
            }
        }
        else {
            t00 = zzgch.zzh(s);
            this.zzj.zzc("sst", "1");
        }
        t0 t01 = zzgch.zzn(zzgch.zzn(zzgch.zzn(t00, new zzdxg(this, s1), this.zzf), new zzdxh(zzbnw0), this.zzf), (JSONObject jSONObject0) -> zzgch.zzh(new zzfca(new zzfbx(this.zze), zzfbz.zza(new StringReader(jSONObject0.toString()), null))), this.zzf);
        zzfhg.zza(t01, this.zzi, zzfgw0);
        return t01;
    }

    private final String zze(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            JSONArray jSONArray0 = jSONObject0.getJSONArray("ad_types");
            if(jSONArray0 != null && "unknown".equals(jSONArray0.getString(0))) {
                jSONObject0.put("ad_types", new JSONArray().put(this.zzh));
                return jSONObject0.toString();
            }
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
        }
        zzo.zzj(("Failed to update the ad types for rendering. " + jSONException0.toString()));
        return s;
    }

    private final void zzf(zzdre zzdre0) {
        Bundle bundle0 = this.zzj.zza();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgX)).booleanValue()) {
            bundle0.putLong(zzdre0.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        }
    }

    private static final String zzg(String s) {
        try {
            return new JSONObject(s).optString("request_id", "");
        }
        catch(JSONException unused_ex) {
            return "";
        }
    }
}

