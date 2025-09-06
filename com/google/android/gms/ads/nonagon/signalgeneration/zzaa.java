package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzfcj;
import com.google.android.gms.internal.ads.zzfhm;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;

public final class zzaa {
    public static zzfhm zza(Bundle bundle0) {
        Bundle bundle1 = bundle0.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if(bundle1 != null) {
            bundle0 = bundle1;
        }
        String s = bundle0.getString("query_info_type");
        if(TextUtils.isEmpty(s)) {
            return zzfhm.zzb;
        }
        switch(s) {
            case "requester_type_0": {
                return zzfhm.zza;
            }
            case "requester_type_1": {
                return zzfhm.zzc;
            }
            case "requester_type_2": {
                return zzfhm.zzd;
            }
            case "requester_type_3": {
                return zzfhm.zze;
            }
            case "requester_type_4": {
                return zzfhm.zzf;
            }
            case "requester_type_5": {
                return zzfhm.zzg;
            }
            case "requester_type_6": {
                return zzfhm.zzh;
            }
            case "requester_type_7": {
                return zzfhm.zzi;
            }
            case "requester_type_8": {
                return zzfhm.zzj;
            }
            default: {
                return zzfhm.zzb;
            }
        }
    }

    public static String zzb(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            return "unspecified";
        }
        switch(s) {
            case "requester_type_0": {
                return "0";
            }
            case "requester_type_1": {
                return "1";
            }
            case "requester_type_2": {
                return "2";
            }
            case "requester_type_3": {
                return "3";
            }
            case "requester_type_4": {
                return "4";
            }
            case "requester_type_5": {
                return "5";
            }
            case "requester_type_6": {
                return "6";
            }
            case "requester_type_7": {
                return "7";
            }
            case "requester_type_8": {
                return "8";
            }
            default: {
                return s;
            }
        }
    }

    @Nullable
    public static String zzc(zzm zzm0) {
        if(zzm0 != null) {
            return zzm0.zzc == null ? "unspecified" : zzm0.zzc.getString("query_info_type");
        }
        return "unspecified";
    }

    public static void zzd(zzdsb zzdsb0, @Nullable zzdrq zzdrq0, String s, Pair[] arr_pair) {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            return;
        }
        zzz zzz0 = () -> {
            ConcurrentHashMap concurrentHashMap0 = zzdsb0.zzc();
            zzaa.zzg(concurrentHashMap0, "action", s);
            for(int v = 0; v < arr_pair.length; ++v) {
                Pair pair0 = arr_pair[v];
                zzaa.zzg(concurrentHashMap0, ((String)pair0.first), ((String)pair0.second));
            }
            zzdsb0.zzg(concurrentHashMap0);
        };
        zzbzw.zza.execute(zzz0);
    }

    // 检测为 Lambda 实现
    @VisibleForTesting
    static void zze(zzdsb zzdsb0, @Nullable zzdrq zzdrq0, String s, Pair[] arr_pair) [...]

    public static int zzf(zzfcj zzfcj0) {
        if(zzfcj0.zzr) {
            return 2;
        }
        zzm zzm0 = zzfcj0.zzd;
        zzc zzc0 = zzm0.zzs;
        if(zzc0 == null && zzm0.zzx == null) {
            return 1;
        }
        if(zzc0 != null && zzm0.zzx != null) {
            return 5;
        }
        return zzc0 == null ? 4 : 3;
    }

    private static void zzg(Map map0, String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            map0.put(s, s1);
        }
    }
}

