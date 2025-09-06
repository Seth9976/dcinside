package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzett implements Callable {
    public final List zza;
    public final Object zzb;
    public final boolean zzc;
    public final Bundle zzd;
    public final Bundle zze;

    public zzett(List list0, Object object0, boolean z, Bundle bundle0, Bundle bundle1) {
        this.zza = list0;
        this.zzb = object0;
        this.zzc = z;
        this.zzd = bundle0;
        this.zze = bundle1;
    }

    @Override
    public final Object call() {
        Object object0;
        Iterator iterator0 = this.zza.iterator();
        while(true) {
            object0 = this.zzb;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            zzetq zzetq0 = (zzetq)((t0)object1).get();
            if(zzetq0 != null) {
                zzetq0.zzb(object0);
                if(this.zzc) {
                    zzetq0.zza(object0);
                }
            }
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            Bundle bundle0 = this.zzd;
            if(bundle0 != null) {
                Bundle bundle1 = this.zze;
                long v = zzv.zzC().currentTimeMillis();
                if(object0 instanceof zzcuv) {
                    bundle0.putLong("client-signals-end", v);
                    bundle0.putBundle("client_sig_latency_key", bundle1);
                    return object0;
                }
                bundle0.putLong("gms-signals-end", v);
                bundle0.putBundle("gms_sig_latency_key", bundle1);
            }
        }
        return object0;
    }
}

