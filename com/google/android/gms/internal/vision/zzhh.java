package com.google.android.gms.internal.vision;

public abstract class zzhh implements zzkt {
    private boolean zza;
    private int zzb;

    public zzhh() {
        this.zza = true;
        this.zzb = -1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zza();
    }

    @Override  // com.google.android.gms.internal.vision.zzkt
    public final zzkt zza() {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }
}

