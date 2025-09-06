package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final class zzhk implements Callable {
    private zzhl zza;
    private String zzb;

    public zzhk(zzhl zzhl0, String s) {
        this.zza = zzhl0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        String s = this.zzb;
        zzg zzg0 = this.zza.zzh().zze(s);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("platform", "android");
        hashMap0.put("package_name", s);
        hashMap0.put("gmp_version", 106000L);
        if(zzg0 != null) {
            String s1 = zzg0.zzaf();
            if(s1 != null) {
                hashMap0.put("app_version", s1);
            }
            hashMap0.put("app_version_int", zzg0.zze());
            hashMap0.put("dynamite_version", zzg0.zzo());
        }
        return hashMap0;
    }
}

