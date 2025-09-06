package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdyz implements Callable {
    public final zzbvk zza;
    public final t0 zzb;
    public final t0 zzc;
    public final t0 zzd;

    public zzdyz(zzbvk zzbvk0, t0 t00, t0 t01, t0 t02) {
        this.zza = zzbvk0;
        this.zzb = t00;
        this.zzc = t01;
        this.zzd = t02;
    }

    @Override
    public final Object call() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            Bundle bundle0 = this.zza.zzm;
            if(bundle0 != null) {
                bundle0.putLong("http-response-ready", zzv.zzC().currentTimeMillis());
            }
        }
        return new zzdzk(((zzdzo)this.zzb.get()), ((JSONObject)this.zzc.get()), ((zzbvm)this.zzd.get()));
    }
}

