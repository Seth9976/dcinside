package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;

public final class zzecb implements Runnable {
    public final zzfkp zza;
    public final View zzb;

    public zzecb(zzfkp zzfkp0, View view0) {
        this.zza = zzfkp0;
        this.zzb = view0;
    }

    @Override
    public final void run() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && false) {
            this.zza.zzd(this.zzb);
        }
    }
}

