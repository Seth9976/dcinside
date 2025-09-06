package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzebz implements Runnable {
    public final zzfkp zza;
    public final View zzb;

    public zzebz(zzfkp zzfkp0, View view0) {
        this.zza = zzfkp0;
        this.zzb = view0;
    }

    @Override
    public final void run() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && false) {
            this.zza.zzb(this.zzb, zzfkw.zzc, "Ad overlay");
        }
    }
}

