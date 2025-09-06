package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;

public final class zzesv implements zzfuc {
    public final String zza;

    public zzesv(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        String s = this.zza;
        zzo.zzg(("Error calling adapter: " + s));
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmR)).booleanValue()) {
            zzv.zzp().zzv(((Throwable)object0), "rtbSignal.fetchRtbJsonInfo-" + s);
            return null;
        }
        zzv.zzp().zzw(((Throwable)object0), "rtbSignal.fetchRtbJsonInfo-" + s);
        return null;
    }
}

