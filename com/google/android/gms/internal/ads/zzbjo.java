package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbjo {
    public static final zzbjp zzA;
    public static final zzbjp zzB;
    public static final zzbjp zzC;
    public static final zzbjp zza;
    public static final zzbjp zzb;
    public static final zzbjp zzc;
    public static final zzbjp zzd;
    public static final zzbjp zze;
    public static final zzbjp zzf;
    public static final zzbjp zzg;
    public static final zzbjp zzh;
    public static final zzbjp zzi;
    public static final zzbjp zzj;
    public static final zzbjp zzk;
    public static final zzbjp zzl;
    public static final zzbjp zzm;
    public static final zzbjp zzn;
    public static final zzbkf zzo;
    public static final zzbjp zzp;
    public static final zzbjp zzq;
    public static final zzbjp zzr;
    public static final zzbjp zzs;
    public static final zzbjp zzt;
    public static final zzbjp zzu;
    public static final zzbjp zzv;
    public static final zzbjp zzw;
    public static final zzbjp zzx;
    public static final zzbjp zzy;
    public static final zzbjp zzz;

    static {
        zzbjo.zza = new zzbim();
        zzbjo.zzb = new zzbio();
        zzbjo.zzc = (zzcge zzcge0, Map map0) -> {
            Intent intent0;
            JSONObject jSONObject2;
            JSONArray jSONArray0;
            JSONObject jSONObject0;
            PackageManager packageManager0 = zzcge0.getContext().getPackageManager();
            String s = (String)map0.get("data");
            try {
                jSONObject0 = new JSONObject(s);
            }
            catch(JSONException unused_ex) {
                ((zzbmk)zzcge0).zze("openableIntents", new JSONObject());
                return;
            }
            try {
                jSONArray0 = jSONObject0.getJSONArray("intents");
            }
            catch(JSONException unused_ex) {
                ((zzbmk)zzcge0).zze("openableIntents", new JSONObject());
                return;
            }
            JSONObject jSONObject1 = new JSONObject();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                try {
                    jSONObject2 = jSONArray0.getJSONObject(v);
                }
                catch(JSONException jSONException0) {
                    zzo.zzh("Error parsing the intent data.", jSONException0);
                    continue;
                }
                String s1 = jSONObject2.optString("id");
                String s2 = jSONObject2.optString("u");
                String s3 = jSONObject2.optString("i");
                String s4 = jSONObject2.optString("m");
                String s5 = jSONObject2.optString("p");
                String s6 = jSONObject2.optString("c");
                String s7 = jSONObject2.optString("intent_url");
                ResolveInfo resolveInfo0 = null;
                if(TextUtils.isEmpty(s7)) {
                    intent0 = null;
                }
                else {
                    try {
                        intent0 = Intent.parseUri(s7, 0);
                    }
                    catch(URISyntaxException uRISyntaxException0) {
                        zzo.zzh(("Error parsing the url: " + s7), uRISyntaxException0);
                        intent0 = null;
                    }
                }
                boolean z = true;
                if(intent0 == null) {
                    intent0 = new Intent();
                    if(!TextUtils.isEmpty(s2)) {
                        intent0.setData(Uri.parse(s2));
                    }
                    if(!TextUtils.isEmpty(s3)) {
                        intent0.setAction(s3);
                    }
                    if(!TextUtils.isEmpty(s4)) {
                        intent0.setType(s4);
                    }
                    if(!TextUtils.isEmpty(s5)) {
                        intent0.setPackage(s5);
                    }
                    if(!TextUtils.isEmpty(s6)) {
                        String[] arr_s = s6.split("/", 2);
                        if(arr_s.length == 2) {
                            intent0.setComponent(new ComponentName(arr_s[0], arr_s[1]));
                        }
                    }
                }
                try {
                    resolveInfo0 = packageManager0.resolveActivity(intent0, 0x10000);
                }
                catch(NullPointerException nullPointerException0) {
                    zzv.zzp().zzw(nullPointerException0, intent0.toString());
                }
                if(resolveInfo0 == null) {
                    z = false;
                }
                try {
                    jSONObject1.put(s1, z);
                }
                catch(JSONException jSONException1) {
                    zzo.zzh("Error constructing openable urls response.", jSONException1);
                }
            }
            ((zzbmk)zzcge0).zze("openableIntents", jSONObject1);
        };
        zzbjo.zzd = new zzbjg();
        zzbjo.zze = new zzbjh();
        zzbjo.zzf = new zzbis();
        zzbjo.zzg = new zzbji();
        zzbjo.zzh = new zzbjj();
        zzbjo.zzi = new zzbip();
        zzbjo.zzj = new zzbjk();
        zzbjo.zzk = new zzbjl();
        zzbjo.zzl = new zzccs();
        zzbjo.zzm = new zzcct();
        zzbjo.zzn = new zzbii();
        zzbjo.zzo = new zzbkf();
        zzbjo.zzp = new zzbjm();
        zzbjo.zzq = new zzbjn();
        zzbjo.zzr = new zzbit();
        zzbjo.zzs = new zzbiu();
        zzbjo.zzt = new zzbiv();
        zzbjo.zzu = new zzbiw();
        zzbjo.zzv = new zzbix();
        zzbjo.zzw = new zzbiy();
        zzbjo.zzx = new zzbiz();
        zzbjo.zzy = new zzbja();
        zzbjo.zzz = new zzbjb();
        zzbjo.zzA = new zzbjc();
        zzbjo.zzB = new zzbje();
        zzbjo.zzC = new zzbjf();
    }

    public static t0 zza(zzcex zzcex0, String s) {
        Uri uri0 = Uri.parse(s);
        try {
            zzava zzava0 = zzcex0.zzI();
            zzfcn zzfcn0 = zzcex0.zzS();
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || zzfcn0 == null) {
                if(zzava0 != null && zzava0.zzf(uri0)) {
                    uri0 = zzava0.zza(uri0, zzcex0.getContext(), zzcex0.zzF(), zzcex0.zzi());
                }
            }
            else if(zzava0 != null && zzava0.zzf(uri0)) {
                uri0 = zzfcn0.zza(uri0, zzcex0.getContext(), zzcex0.zzF(), zzcex0.zzi());
            }
        }
        catch(zzavb unused_ex) {
            zzo.zzj(("Unable to append parameter to URL: " + s));
        }
        Map map0 = new HashMap();
        if(zzcex0.zzD() != null) {
            map0 = zzcex0.zzD().zzaw;
        }
        String s1 = zzbyk.zzb(uri0, zzcex0.getContext(), map0);
        long v = (long)(((Long)zzbek.zze.zze()));
        if(v > 0L && v <= 244410203L) {
            zzgby zzgby0 = zzgby.zzu(zzcex0.zzT());
            zzbij zzbij0 = new zzbij();
            zzgby zzgby1 = (zzgby)zzgch.zzm(((zzgby)zzgch.zze(zzgby0, Throwable.class, zzbij0, zzbzw.zzg)), new zzbik(s1), zzbzw.zzg);
            zzbil zzbil0 = new zzbil(s1);
            return (zzgby)zzgch.zze(zzgby1, Throwable.class, zzbil0, zzbzw.zzg);
        }
        return zzgch.zzh(s1);
    }

    // 检测为 Lambda 实现
    static void zzb(zzcge zzcge0, Map map0) [...]

    public static void zzc(Map map0, zzdds zzdds0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkD)).booleanValue() && map0.containsKey("sc") && ((String)map0.get("sc")).equals("1") && zzdds0 != null) {
            zzdds0.zzdd();
        }
    }
}

