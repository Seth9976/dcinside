package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.concurrent.atomic.AtomicReference;
import o3.j;

@j
public final class zzekq implements zzcye {
    private final AtomicReference zza;

    public zzekq() {
        this.zza = new AtomicReference();
    }

    public final void zza(zzdr zzdr0) {
        this.zza.set(zzdr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcye
    public final void zzh(zzu zzu0) {
        zzekp zzekp0 = new zzekp(zzu0);
        zzeyt.zza(this.zza, zzekp0);
    }
}

