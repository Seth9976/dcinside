package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzcdi extends zzcde {
    public zzcdi(zzcbs zzcbs0) {
        super(zzcbs0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(String s) {
        String s1 = zzf.zzf(s);
        zzcbs zzcbs0 = (zzcbs)this.zzc.get();
        if(zzcbs0 != null && s1 != null) {
            zzcbs0.zzt(s1, this);
        }
        zzo.zzj("VideoStreamNoopCache is doing nothing.");
        this.zzg(s, s1, "noop", "Noop cache is a noop.");
        return false;
    }
}

