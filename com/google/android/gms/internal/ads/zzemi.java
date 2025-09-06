package com.google.android.gms.internal.ads;

import java.util.ArrayList;

final class zzemi implements zzetq {
    private final ArrayList zza;

    zzemi(ArrayList arrayList0, zzemj zzemj0) {
        this.zza = arrayList0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        ((zzcuv)object0).zzb.putStringArrayList("ad_types", this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        ((zzcuv)object0).zza.putStringArrayList("ad_types", this.zza);
    }
}

