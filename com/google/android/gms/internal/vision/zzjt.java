package com.google.android.gms.internal.vision;

public class zzjt {
    private static final zzio zza;
    private zzht zzb;
    private volatile zzkk zzc;
    private volatile zzht zzd;

    static {
        zzjt.zza = zzio.zzb();
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzjt)) {
            return false;
        }
        zzkk zzkk0 = this.zzc;
        zzkk zzkk1 = ((zzjt)object0).zzc;
        if(zzkk0 == null && zzkk1 == null) {
            return this.zzc().equals(((zzjt)object0).zzc());
        }
        if(zzkk0 != null && zzkk1 != null) {
            return zzkk0.equals(zzkk1);
        }
        return zzkk0 == null ? this.zzb(zzkk1.zzr()).equals(zzkk1) : zzkk0.equals(((zzjt)object0).zzb(zzkk0.zzr()));
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final zzkk zza(zzkk zzkk0) {
        zzkk zzkk1 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzkk0;
        return zzkk1;
    }

    private final zzkk zzb(zzkk zzkk0) {
        if(this.zzc == null) {
            synchronized(this) {
                if(this.zzc != null) {
                    return this.zzc;
                }
                this.zzc = zzkk0;
                this.zzd = zzht.zza;
            }
        }
        return this.zzc;
    }

    public final int zzb() {
        if(this.zzd != null) {
            return this.zzd.zza();
        }
        return this.zzc == null ? 0 : this.zzc.zzm();
    }

    public final zzht zzc() {
        if(this.zzd != null) {
            return this.zzd;
        }
        synchronized(this) {
            if(this.zzd != null) {
                return this.zzd;
            }
            this.zzd = this.zzc == null ? zzht.zza : this.zzc.zzg();
            return this.zzd;
        }
    }
}

