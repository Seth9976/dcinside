package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzcm;

public final class zzejy implements zzeys {
    public final Pair zza;

    public zzejy(Pair pair0) {
        this.zza = pair0;
    }

    @Override  // com.google.android.gms.internal.ads.zzeys
    public final void zza(Object object0) {
        ((zzcm)object0).zzc(((String)this.zza.first), ((String)this.zza.second));
    }
}

