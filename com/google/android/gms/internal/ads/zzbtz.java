package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;

final class zzbtz extends zzbts {
    final List zza;

    zzbtz(zzbub zzbub0, List list0) {
        this.zza = list0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbtt
    public final void zze(String s) {
        zzo.zzg(("Error recording click: " + s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(List list0) {
        zzo.zzi(("Recorded click: " + this.zza.toString()));
    }
}

