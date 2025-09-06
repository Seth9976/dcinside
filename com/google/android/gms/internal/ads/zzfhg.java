package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.t0;
import java.util.regex.Pattern;

public final class zzfhg {
    public static void zza(t0 t00, zzfhh zzfhh0, zzfgw zzfgw0) {
        zzfhg.zzg(t00, zzfhh0, zzfgw0, false);
    }

    public static void zzb(t0 t00, zzfhh zzfhh0, zzfgw zzfgw0) {
        zzfhg.zzg(t00, zzfhh0, zzfgw0, true);
    }

    public static void zzc(t0 t00, zzfhh zzfhh0, zzfgw zzfgw0) {
        if(!((Boolean)zzbee.zzc.zze()).booleanValue()) {
            return;
        }
        zzgch.zzr(zzgby.zzu(t00), new zzfhf(zzfhh0, zzfgw0), zzbzw.zzg);
    }

    public static void zzd(t0 t00, zzfgw zzfgw0) {
        if(!((Boolean)zzbee.zzc.zze()).booleanValue()) {
            return;
        }
        zzgch.zzr(zzgby.zzu(t00), new zzfhd(zzfgw0), zzbzw.zzg);
    }

    // 去混淆评级： 低(20)
    public static boolean zze(String s) {
        return TextUtils.isEmpty(s) ? false : Pattern.matches(((String)zzbe.zzc().zza(zzbcl.zziH)), s);
    }

    public static int zzf(zzfcj zzfcj0) {
        switch(zzaa.zzf(zzfcj0) - 1) {
            case 0: 
            case 1: {
                return 7;
            }
            default: {
                return 23;
            }
        }
    }

    private static void zzg(t0 t00, zzfhh zzfhh0, zzfgw zzfgw0, boolean z) {
        if(!((Boolean)zzbee.zzc.zze()).booleanValue()) {
            return;
        }
        zzgch.zzr(zzgby.zzu(t00), new zzfhe(zzfhh0, zzfgw0, z), zzbzw.zzg);
    }
}

