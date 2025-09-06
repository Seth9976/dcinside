package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzeob implements zzetq {
    private final double zza;
    private final boolean zzb;

    public zzeob(double f, boolean z) {
        this.zza = f;
        this.zzb = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = zzfcx.zza(((zzcuv)object0).zza, "device");
        ((zzcuv)object0).zza.putBundle("device", bundle0);
        Bundle bundle1 = zzfcx.zza(bundle0, "battery");
        bundle0.putBundle("battery", bundle1);
        bundle1.putBoolean("is_charging", this.zzb);
        bundle1.putDouble("battery_level", this.zza);
    }
}

