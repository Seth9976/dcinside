package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

public final class zzbyk {
    @VisibleForTesting
    static Uri zza(String s, String s1, String s2) {
        int v = s.indexOf("&adurl");
        if(v == -1) {
            v = s.indexOf("?adurl");
        }
        return v == -1 ? Uri.parse(s).buildUpon().appendQueryParameter(s1, s2).build() : Uri.parse((s.substring(0, v + 1) + s1 + "=" + s2 + "&" + s.substring(v + 1)));
    }

    public static String zzb(Uri uri0, Context context0, Map map0) {
        if(!zzv.zzo().zzp(context0)) {
            return uri0.toString();
        }
        String s = zzv.zzo().zza(context0);
        if(s == null) {
            return uri0.toString();
        }
        String s1 = (String)zzbe.zzc().zza(zzbcl.zzas);
        String s2 = uri0.toString();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzar)).booleanValue() && s2.contains(s1)) {
            zzv.zzo().zzj(context0, s, ((Map)map0.get("_ac")));
            return zzbyk.zzd(s2, context0).replace(s1, s);
        }
        if(TextUtils.isEmpty(uri0.getQueryParameter("fbs_aeid")) && !((Boolean)zzbe.zzc().zza(zzbcl.zzaq)).booleanValue()) {
            String s3 = zzbyk.zza(zzbyk.zzd(s2, context0), "fbs_aeid", s).toString();
            zzv.zzo().zzj(context0, s, ((Map)map0.get("_ac")));
            return s3;
        }
        return s2;
    }

    public static String zzc(String s, Context context0, boolean z, Map map0) {
        if((!((Boolean)zzbe.zzc().zza(zzbcl.zzaz)).booleanValue() || z) && zzv.zzo().zzp(context0) && !TextUtils.isEmpty(s)) {
            String s1 = zzv.zzo().zza(context0);
            if(s1 != null) {
                String s2 = (String)zzbe.zzc().zza(zzbcl.zzas);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzar)).booleanValue() && s.contains(s2)) {
                    if(zzv.zzq().zzj(s)) {
                        zzv.zzo().zzj(context0, s1, ((Map)map0.get("_ac")));
                        return zzbyk.zzd(s, context0).replace(s2, s1);
                    }
                    if(zzv.zzq().zzk(s)) {
                        zzv.zzo().zzk(context0, s1, ((Map)map0.get("_ai")));
                        return zzbyk.zzd(s, context0).replace(s2, s1);
                    }
                }
                else if(!s.contains("fbs_aeid") && !((Boolean)zzbe.zzc().zza(zzbcl.zzaq)).booleanValue()) {
                    if(zzv.zzq().zzj(s)) {
                        zzv.zzo().zzj(context0, s1, ((Map)map0.get("_ac")));
                        return zzbyk.zza(zzbyk.zzd(s, context0), "fbs_aeid", s1).toString();
                    }
                    if(zzv.zzq().zzk(s)) {
                        zzv.zzo().zzk(context0, s1, ((Map)map0.get("_ai")));
                        return zzbyk.zza(zzbyk.zzd(s, context0), "fbs_aeid", s1).toString();
                    }
                }
            }
        }
        return s;
    }

    private static String zzd(String s, Context context0) {
        String s1 = zzv.zzo().zzd(context0);
        String s2 = zzv.zzo().zzb(context0);
        if(!s.contains("gmp_app_id") && !TextUtils.isEmpty(s1)) {
            s = zzbyk.zza(s, "gmp_app_id", s1).toString();
        }
        return s.contains("fbs_aiid") || TextUtils.isEmpty(s2) ? s : zzbyk.zza(s, "fbs_aiid", s2).toString();
    }
}

