package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

public final class zzecj implements Runnable {
    public final zzfkp zza;

    public zzecj(zzfkp zzfkp0) {
        this.zza = zzfkp0;
    }

    @Override
    public final void run() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && false) {
            this.zza.zzc();
        }
    }
}

