package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzfve;
import java.util.List;
import java.util.Map;

public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(@NonNull Context context0, @NonNull VersionInfoParcel versionInfoParcel0) {
        this.zza = context0;
        this.zzb = "com.dcinside.app.android";
        this.zzc = versionInfoParcel0.afmaVersion;
    }

    public void set(@NonNull Map map0) {
        map0.put("s", "gmob_sdk");
        map0.put("v", "3");
        map0.put("os", Build.VERSION.RELEASE);
        map0.put("api_v", Build.VERSION.SDK);
        map0.put("device", zzs.zzs());
        map0.put("app", this.zzb);
        String s = "1";
        map0.put("is_lite_sdk", (zzs.zzF(this.zza) ? "1" : "0"));
        List list0 = zzbe.zza().zzb();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgI)).booleanValue()) {
            list0.addAll(zzv.zzp().zzi().zzg().zzd());
        }
        map0.put("e", TextUtils.join(",", list0));
        map0.put("sdkVersion", this.zzc);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzli)).booleanValue()) {
            if(!zzs.zzC(this.zza)) {
                s = "0";
            }
            map0.put("is_bstar", s);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjn)).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzct)).booleanValue()) {
            map0.put("plugin", zzfve.zzc(zzv.zzp().zzn()));
        }
    }
}

