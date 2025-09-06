package com.google.android.gms.internal.ads;

import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

public final class zzdrq {
    private final ConcurrentHashMap zza;
    private final zzbzq zzb;
    private final zzfcj zzc;
    private final String zzd;
    private final String zze;
    private final zzk zzf;
    private final Bundle zzg;
    private final Context zzh;

    public zzdrq(Context context0, zzdsb zzdsb0, zzbzq zzbzq0, zzfcj zzfcj0, String s, String s1, zzk zzk0) {
        String s3;
        this.zzg = new Bundle();
        ConcurrentHashMap concurrentHashMap0 = zzdsb0.zzc();
        this.zza = concurrentHashMap0;
        this.zzb = zzbzq0;
        this.zzc = zzfcj0;
        this.zzd = s;
        this.zze = s1;
        this.zzf = zzk0;
        this.zzh = context0;
        concurrentHashMap0.put("ad_format", s1.toUpperCase(Locale.ROOT));
        String s2 = "1";
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjs)).booleanValue()) {
            int v = zzk0.zzp();
            if(v == 0) {
                throw null;
            }
            switch(v - 1) {
                case 0: {
                    s3 = "1";
                    break;
                }
                case 1: {
                    s3 = "2";
                    break;
                }
                default: {
                    s3 = "na";
                }
            }
            concurrentHashMap0.put("asv", s3);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            Runtime runtime0 = Runtime.getRuntime();
            this.zzc("rt_f", "2484897584");
            this.zzc("rt_m", String.valueOf(runtime0.maxMemory()));
            this.zzc("rt_t", String.valueOf(runtime0.totalMemory()));
            this.zzc("wv_c", String.valueOf(zzv.zzp().zzb()));
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzcp)).booleanValue()) {
                ActivityManager.MemoryInfo activityManager$MemoryInfo0 = zzf.zzc(context0);
                if(activityManager$MemoryInfo0 != null) {
                    this.zzc("mem_avl", String.valueOf(activityManager$MemoryInfo0.availMem));
                    this.zzc("mem_tt", String.valueOf(activityManager$MemoryInfo0.totalMem));
                    if(!activityManager$MemoryInfo0.lowMemory) {
                        s2 = "0";
                    }
                    this.zzc("low_m", s2);
                }
            }
        }
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            return;
        }
        switch(zzaa.zzf(zzfcj0) - 1) {
            case 0: {
                concurrentHashMap0.put("request_id", s);
                concurrentHashMap0.put("scar", "false");
                return;
            }
            case 1: {
                concurrentHashMap0.put("request_id", s);
                concurrentHashMap0.put("se", "query_g");
                break;
            }
            case 2: {
                concurrentHashMap0.put("se", "r_adinfo");
                break;
            }
            case 3: {
                concurrentHashMap0.put("se", "r_adstring");
                break;
            }
            default: {
                concurrentHashMap0.put("se", "r_both");
                break;
            }
        }
        concurrentHashMap0.put("scar", "true");
        this.zzc("ragent", zzfcj0.zzd.zzp);
        this.zzc("rtype", zzaa.zzb(zzaa.zzc(zzfcj0.zzd)));
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc(String s, @Nullable String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            this.zza.put(s, s1);
        }
    }

    public final void zzd(zzfca zzfca0) {
        if(!zzfca0.zzb.zza.isEmpty()) {
            zzfbo zzfbo0 = (zzfbo)zzfca0.zzb.zza.get(0);
            this.zzc("ad_format", zzfbo.zza(zzfbo0.zzb));
            if(zzfbo0.zzb == 6) {
                this.zza.put("as", (this.zzb.zzm() ? "1" : "0"));
            }
        }
        this.zzc("gqi", zzfca0.zzb.zzb.zzb);
    }

    public final void zze(Bundle bundle0) {
        if(bundle0 != null) {
            if(bundle0.containsKey("cnt")) {
                this.zzc("network_coarse", Integer.toString(bundle0.getInt("cnt")));
            }
            if(bundle0.containsKey("gnt")) {
                this.zzc("network_fine", Integer.toString(bundle0.getInt("gnt")));
            }
        }
    }
}

