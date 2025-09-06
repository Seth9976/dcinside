package com.google.android.gms.internal.ads;

public final class zzere implements zzetq {
    private final Boolean zza;

    public zzere(Boolean boolean0) {
        this.zza = boolean0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Boolean boolean0 = this.zza;
        if(boolean0 != null) {
            ((zzcuv)object0).zza.putBoolean("hw_accel", boolean0.booleanValue());
        }
    }
}

