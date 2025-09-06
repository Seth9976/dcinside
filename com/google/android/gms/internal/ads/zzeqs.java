package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeqs implements zzetq {
    public final String zza;
    public final boolean zzb;

    public zzeqs(String s, boolean z) {
        this.zza = s;
        this.zzb = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        ((zzcuv)object0).zzb.putString("gct", this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        bundle0.putString("gct", this.zza);
        if(this.zzb) {
            bundle0.putString("de", "1");
        }
    }
}

