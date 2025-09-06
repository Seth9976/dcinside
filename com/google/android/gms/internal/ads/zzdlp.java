package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdlp {
    private final Context zza;
    private final zzdkt zzb;
    private final zzava zzc;
    private final VersionInfoParcel zzd;
    private final zza zze;
    private final zzbbj zzf;
    private final Executor zzg;
    private final zzbfl zzh;
    private final zzdmh zzi;
    private final zzdow zzj;
    private final ScheduledExecutorService zzk;
    private final zzdnr zzl;
    private final zzdrw zzm;
    private final zzfja zzn;
    private final zzebk zzo;
    private final zzebv zzp;
    private final zzfcn zzq;

    public zzdlp(Context context0, zzdkt zzdkt0, zzava zzava0, VersionInfoParcel versionInfoParcel0, zza zza0, zzbbj zzbbj0, Executor executor0, zzfcj zzfcj0, zzdmh zzdmh0, zzdow zzdow0, ScheduledExecutorService scheduledExecutorService0, zzdrw zzdrw0, zzfja zzfja0, zzebk zzebk0, zzdnr zzdnr0, zzebv zzebv0, zzfcn zzfcn0) {
        this.zza = context0;
        this.zzb = zzdkt0;
        this.zzc = zzava0;
        this.zzd = versionInfoParcel0;
        this.zze = zza0;
        this.zzf = zzbbj0;
        this.zzg = executor0;
        this.zzh = zzfcj0.zzi;
        this.zzi = zzdmh0;
        this.zzj = zzdow0;
        this.zzk = scheduledExecutorService0;
        this.zzm = zzdrw0;
        this.zzn = zzfja0;
        this.zzo = zzebk0;
        this.zzl = zzdnr0;
        this.zzp = zzebv0;
        this.zzq = zzfcn0;
    }

    // 检测为 Lambda 实现
    final zzbfg zza(JSONObject jSONObject0, List list0) [...]

    // 检测为 Lambda 实现
    final t0 zzb(zzs zzs0, zzfbo zzfbo0, zzfbr zzfbr0, String s, String s1, Object object0) throws Exception [...]

    final t0 zzc(String s, Object object0) throws Exception {
        zzcgr zzcgr0 = zzcgr.zza();
        zzcex zzcex0 = zzcfk.zza(this.zza, zzcgr0, "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        t0 t00 = zzcaa.zza(zzcex0);
        zzcex0.zzN().zzC(new zzdlc(((zzcaa)t00)));
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfi)).booleanValue()) {
            zzcex0.loadData(Base64.encodeToString(s.getBytes(), 1), "text/html", "base64");
            return t00;
        }
        zzcex0.loadData(s, "text/html", "UTF-8");
        return t00;
    }

    public final t0 zzd(JSONObject jSONObject0, String s) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("attribution");
        if(jSONObject1 == null) {
            return zzgch.zzh(null);
        }
        JSONArray jSONArray0 = jSONObject1.optJSONArray("images");
        JSONObject jSONObject2 = jSONObject1.optJSONObject("image");
        if(jSONArray0 == null && jSONObject2 != null) {
            jSONArray0 = new JSONArray();
            jSONArray0.put(jSONObject2);
        }
        t0 t00 = zzgch.zzm(this.zzo(jSONArray0, false, true), (List list0) -> {
            zzbfg zzbfg0 = null;
            if(list0 != null && !list0.isEmpty()) {
                String s = jSONObject1.optString("text");
                Integer integer0 = zzdlp.zzq(jSONObject1, "bg_color");
                Integer integer1 = zzdlp.zzq(jSONObject1, "text_color");
                int v = jSONObject1.optInt("text_size", -1);
                boolean z = jSONObject1.optBoolean("allow_pub_rendering");
                int v1 = jSONObject1.optInt("animation_ms", 1000);
                int v2 = jSONObject1.optInt("presentation_ms", 4000);
                if(v > 0) {
                    zzbfg0 = v;
                }
                return new zzbfg(s, list0, integer0, integer1, ((Integer)zzbfg0), v2 + v1, this.zzh.zze, z);
            }
            return null;
        }, this.zzg);
        return zzdlp.zzm(jSONObject1.optBoolean("require"), t00, null);
    }

    public final t0 zze(JSONObject jSONObject0, String s) {
        return this.zzn(jSONObject0.optJSONObject(s), this.zzh.zzb);
    }

    public final t0 zzf(JSONObject jSONObject0, String s) {
        return this.zzo(jSONObject0.optJSONArray("images"), this.zzh.zzb, this.zzh.zzd);
    }

    public final t0 zzg(JSONObject jSONObject0, String s, zzfbo zzfbo0, zzfbr zzfbr0) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzjS)).booleanValue()) {
            return zzgch.zzh(null);
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("images");
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(0);
            if(jSONObject1 == null) {
                return zzgch.zzh(null);
            }
            String s1 = jSONObject1.optString("base_url");
            String s2 = jSONObject1.optString("html");
            zzs zzs0 = this.zzk(jSONObject1.optInt("width", 0), jSONObject1.optInt("height", 0));
            if(TextUtils.isEmpty(s2)) {
                return zzgch.zzh(null);
            }
            t0 t00 = zzgch.zzn(zzgch.zzh(null), (Object object0) -> {
                zzcex zzcex0 = this.zzj.zza(zzs0, zzfbo0, zzfbr0);
                t0 t00 = zzcaa.zza(zzcex0);
                zzdno zzdno0 = this.zzl.zzb();
                zzcex0.zzN().zzV(zzdno0, zzdno0, zzdno0, zzdno0, zzdno0, false, null, new zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzdno0, null, null, null, null);
                zzcex0.zzag("/getNativeAdViewSignals", zzbjo.zzs);
                zzcex0.zzag("/getNativeClickMeta", zzbjo.zzt);
                zzcex0.zzN().zzF(true);
                zzcex0.zzN().zzC(new zzdlm(((zzcaa)t00)));
                zzcex0.zzae(s1, s2, null);
                return t00;
            }, zzbzw.zzf);
            return zzgch.zzn(t00, new zzdlh(t00), zzbzw.zzg);
        }
        return zzgch.zzh(null);
    }

    public final t0 zzh(JSONObject jSONObject0, zzfbo zzfbo0, zzfbr zzfbr0) {
        JSONObject jSONObject1 = zzbs.zzh(jSONObject0, new String[]{"html_containers", "instream"});
        if(jSONObject1 == null) {
            JSONObject jSONObject2 = jSONObject0.optJSONObject("video");
            if(jSONObject2 == null) {
                return zzgch.zzh(null);
            }
            String s = jSONObject2.optString("vast_xml");
            boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzjR)).booleanValue() && jSONObject2.has("html");
            if(TextUtils.isEmpty(s)) {
                if(!z) {
                    zzo.zzj("Required field \'vast_xml\' or \'html\' is missing");
                    return zzgch.zzh(null);
                }
                return zzdlp.zzl(zzgch.zzo(this.zzp(jSONObject2, zzfbo0, zzfbr0), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzdS)))))), TimeUnit.SECONDS, this.zzk), null);
            }
            return z ? zzdlp.zzl(zzgch.zzo(this.zzp(jSONObject2, zzfbo0, zzfbr0), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzdS)))))), TimeUnit.SECONDS, this.zzk), null) : zzdlp.zzl(zzgch.zzo(this.zzi.zza(jSONObject2), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzdS)))))), TimeUnit.SECONDS, this.zzk), null);
        }
        return this.zzp(jSONObject1, zzfbo0, zzfbr0);
    }

    @Nullable
    public static final zzez zzi(JSONObject jSONObject0) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("mute");
        if(jSONObject1 != null) {
            JSONObject jSONObject2 = jSONObject1.optJSONObject("default_reason");
            return jSONObject2 == null ? null : zzdlp.zzr(jSONObject2);
        }
        return null;
    }

    public static final List zzj(JSONObject jSONObject0) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("mute");
        if(jSONObject1 == null) {
            return zzfxn.zzn();
        }
        JSONArray jSONArray0 = jSONObject1.optJSONArray("reasons");
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                zzez zzez0 = zzdlp.zzr(jSONArray0.optJSONObject(v));
                if(zzez0 != null) {
                    arrayList0.add(zzez0);
                }
            }
            return zzfxn.zzl(arrayList0);
        }
        return zzfxn.zzn();
    }

    private final zzs zzk(int v, int v1) {
        if(v == 0) {
            if(v1 != 0) {
                v = 0;
                goto label_5;
            }
            return zzs.zzc();
        }
    label_5:
        AdSize adSize0 = new AdSize(v, v1);
        return new zzs(this.zza, adSize0);
    }

    private static t0 zzl(t0 t00, Object object0) {
        zzdlk zzdlk0 = new zzdlk(null);
        return zzgch.zzf(t00, Exception.class, zzdlk0, zzbzw.zzg);
    }

    // 去混淆评级： 低(20)
    private static t0 zzm(boolean z, t0 t00, Object object0) {
        return z ? zzgch.zzn(t00, new zzdll(t00), zzbzw.zzg) : zzdlp.zzl(t00, null);
    }

    private final t0 zzn(@Nullable JSONObject jSONObject0, boolean z) {
        if(jSONObject0 == null) {
            return zzgch.zzh(null);
        }
        String s = jSONObject0.optString("url");
        if(TextUtils.isEmpty(s)) {
            return zzgch.zzh(null);
        }
        double f = jSONObject0.optDouble("scale", 1.0);
        boolean z1 = jSONObject0.optBoolean("is_transparent", true);
        int v = jSONObject0.optInt("width", -1);
        int v1 = jSONObject0.optInt("height", -1);
        if(z) {
            return zzgch.zzh(new zzbfj(null, Uri.parse(s), f, v, v1));
        }
        t0 t00 = zzgch.zzm(this.zzb.zzb(s, f, z1), new zzdld(s, f, v, v1), this.zzg);
        return zzdlp.zzm(jSONObject0.optBoolean("require"), t00, null);
    }

    private final t0 zzo(@Nullable JSONArray jSONArray0, boolean z, boolean z1) {
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            int v = z1 ? jSONArray0.length() : 1;
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add(this.zzn(jSONArray0.optJSONObject(v1), z));
            }
            return zzgch.zzm(zzgch.zzd(arrayList0), new zzdli(), this.zzg);
        }
        return zzgch.zzh(Collections.emptyList());
    }

    private final t0 zzp(JSONObject jSONObject0, zzfbo zzfbo0, zzfbr zzfbr0) {
        String s = jSONObject0.optString("base_url");
        String s1 = jSONObject0.optString("html");
        zzs zzs0 = this.zzk(jSONObject0.optInt("width", 0), jSONObject0.optInt("height", 0));
        t0 t00 = this.zzi.zzb(s, s1, zzfbo0, zzfbr0, zzs0);
        return zzgch.zzn(t00, new zzdlf(t00), zzbzw.zzg);
    }

    @Nullable
    private static Integer zzq(JSONObject jSONObject0, String s) {
        try {
            JSONObject jSONObject1 = jSONObject0.getJSONObject(s);
            return Color.rgb(jSONObject1.getInt("r"), jSONObject1.getInt("g"), jSONObject1.getInt("b"));
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    @Nullable
    private static final zzez zzr(@Nullable JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            String s = jSONObject0.optString("reason");
            String s1 = jSONObject0.optString("ping_url");
            return TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) ? null : new zzez(s, s1);
        }
        return null;
    }
}

