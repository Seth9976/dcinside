package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class zzbco {
    private final String zza;
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbco(Context context0, String s) {
        this.zzc = context0;
        this.zzd = s;
        this.zza = "https://csi.gstatic.com/csi";
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.zzb = linkedHashMap0;
        linkedHashMap0.put("s", "gmob_sdk");
        linkedHashMap0.put("v", "3");
        linkedHashMap0.put("os", Build.VERSION.RELEASE);
        linkedHashMap0.put("api_v", Build.VERSION.SDK);
        linkedHashMap0.put("device", zzs.zzs());
        boolean z = context0.getApplicationContext() == null;
        linkedHashMap0.put("app", "com.dcinside.app.android");
        String s1 = "1";
        linkedHashMap0.put("is_lite_sdk", (zzs.zzF(context0) ? "1" : "0"));
        Future future0 = zzv.zzn().zzb(context0);
        try {
            linkedHashMap0.put("network_coarse", Integer.toString(((zzbvo)future0.get()).zzj));
            linkedHashMap0.put("network_fine", Integer.toString(((zzbvo)future0.get()).zzk));
        }
        catch(Exception exception0) {
            zzv.zzp().zzw(exception0, "CsiConfiguration.CsiConfiguration");
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzli)).booleanValue()) {
            Map map0 = this.zzb;
            if(!zzs.zzC(context0)) {
                s1 = "0";
            }
            map0.put("is_bstar", s1);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjn)).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzct)).booleanValue() && !zzfve.zzd(zzv.zzp().zzn())) {
            this.zzb.put("plugin", zzv.zzp().zzn());
        }
    }

    final Context zza() {
        return this.zzc;
    }

    final String zzb() {
        return this.zzd;
    }

    final String zzc() {
        return this.zza;
    }

    final Map zzd() {
        return this.zzb;
    }
}

