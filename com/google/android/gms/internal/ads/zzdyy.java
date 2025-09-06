package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdyy implements Callable {
    public final t0 zza;
    public final zzbvk zzb;
    public final t0 zzc;

    public zzdyy(t0 t00, zzbvk zzbvk0, t0 t01) {
        this.zza = t00;
        this.zzb = zzbvk0;
        this.zzc = t01;
    }

    @Override
    public final Object call() {
        zzbvm zzbvm0 = (zzbvm)this.zza.get();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            zzbvk zzbvk0 = this.zzb;
            Bundle bundle0 = zzbvk0.zzm;
            if(bundle0 != null) {
                bundle0.putLong("get-ad-dictionary-sdkcore-start", zzbvm0.zzc());
                zzbvk0.zzm.putLong("get-ad-dictionary-sdkcore-end", zzbvm0.zzb());
            }
        }
        return new zzdzr(((JSONObject)this.zzc.get()), zzbvm0);
    }
}

