package com.google.android.gms.internal.measurement;

public class zzkk {
    private volatile zzlc zza;
    private volatile zzik zzb;

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzkk)) {
            return false;
        }
        zzlc zzlc0 = this.zza;
        zzlc zzlc1 = ((zzkk)object0).zza;
        if(zzlc0 == null && zzlc1 == null) {
            return this.zzb().equals(((zzkk)object0).zzb());
        }
        if(zzlc0 != null && zzlc1 != null) {
            return zzlc0.equals(zzlc1);
        }
        return zzlc0 == null ? this.zzb(zzlc1.zzck()).equals(zzlc1) : zzlc0.equals(((zzkk)object0).zzb(zzlc0.zzck()));
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if(this.zzb != null) {
            return this.zzb.zzb();
        }
        return this.zza == null ? 0 : this.zza.zzcb();
    }

    public final zzlc zza(zzlc zzlc0) {
        zzlc zzlc1 = this.zza;
        this.zzb = null;
        this.zza = zzlc0;
        return zzlc1;
    }

    private final zzlc zzb(zzlc zzlc0) {
        if(this.zza == null) {
            synchronized(this) {
                if(this.zza != null) {
                    return this.zza;
                }
                this.zza = zzlc0;
                this.zzb = zzik.zza;
            }
        }
        return this.zza;
    }

    public final zzik zzb() {
        if(this.zzb != null) {
            return this.zzb;
        }
        synchronized(this) {
            if(this.zzb != null) {
                return this.zzb;
            }
            this.zzb = this.zza == null ? zzik.zza : this.zza.zzbz();
            return this.zzb;
        }
    }
}

