package com.google.android.gms.internal.ads;

public class zzgyn {
    protected volatile zzgzc zza;
    private volatile zzgwj zzb;

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzgyn)) {
            return false;
        }
        zzgzc zzgzc0 = this.zza;
        zzgzc zzgzc1 = ((zzgyn)object0).zza;
        if(zzgzc0 == null && zzgzc1 == null) {
            return this.zzb().equals(((zzgyn)object0).zzb());
        }
        if(zzgzc0 != null && zzgzc1 != null) {
            return zzgzc0.equals(zzgzc1);
        }
        if(zzgzc0 != null) {
            ((zzgyn)object0).zzd(zzgzc0.zzbt());
            return zzgzc0.equals(((zzgyn)object0).zza);
        }
        this.zzd(zzgzc1.zzbt());
        return this.zza.equals(zzgzc1);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if(this.zzb != null) {
            return ((zzgwg)this.zzb).zza.length;
        }
        return this.zza == null ? 0 : this.zza.zzaY();
    }

    public final zzgwj zzb() {
        if(this.zzb != null) {
            return this.zzb;
        }
        synchronized(this) {
            if(this.zzb != null) {
                return this.zzb;
            }
            this.zzb = this.zza == null ? zzgwj.zzb : this.zza.zzaN();
            return this.zzb;
        }
    }

    public final zzgzc zzc(zzgzc zzgzc0) {
        zzgzc zzgzc1 = this.zza;
        this.zzb = null;
        this.zza = zzgzc0;
        return zzgzc1;
    }

    protected final void zzd(zzgzc zzgzc0) {
        if(this.zza != null) {
            return;
        }
        synchronized(this) {
            if(this.zza != null) {
                return;
            }
            this.zza = zzgzc0;
            this.zzb = zzgwj.zzb;
        }
    }
}

