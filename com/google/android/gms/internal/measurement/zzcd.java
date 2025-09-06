package com.google.android.gms.internal.measurement;

final class zzcd extends zzcl {
    private String zza;
    private zzco zzb;
    private zzcn zzc;
    private byte zzd;

    @Override  // com.google.android.gms.internal.measurement.zzcl
    public final zzcl zza(zzcn zzcn0) {
        if(zzcn0 == null) {
            throw new NullPointerException("Null filePurpose");
        }
        this.zzc = zzcn0;
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcl
    final zzcl zza(zzco zzco0) {
        if(zzco0 == null) {
            throw new NullPointerException("Null fileChecks");
        }
        this.zzb = zzco0;
        return this;
    }

    public final zzcl zza(String s) {
        this.zza = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcl
    public final zzcl zza(boolean z) {
        this.zzd = (byte)(this.zzd | 1);
        return this;
    }

    @Override  // com.google.android.gms.internal.measurement.zzcl
    public final zzcm zza() {
        if(this.zzd == 1 && this.zza != null && this.zzb != null && this.zzc != null) {
            return new zzce(this.zza, false, this.zzb, null, null, this.zzc, null);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.zza == null) {
            stringBuilder0.append(" fileOwner");
        }
        if((1 & this.zzd) == 0) {
            stringBuilder0.append(" hasDifferentDmaOwner");
        }
        if(this.zzb == null) {
            stringBuilder0.append(" fileChecks");
        }
        if(this.zzc == null) {
            stringBuilder0.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0);
    }
}

