package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzdm {
    public final Object zza;
    private zzv zzb;
    private boolean zzc;
    private boolean zzd;

    public zzdm(Object object0) {
        this.zza = object0;
        this.zzb = new zzv();
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzdm.class == class0 ? this.zza.equals(((zzdm)object0).zza) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int v, zzdk zzdk0) {
        if(!this.zzd) {
            if(v != -1) {
                this.zzb.zza(v);
            }
            this.zzc = true;
            zzdk0.zza(this.zza);
        }
    }

    public final void zzb(zzdl zzdl0) {
        if(!this.zzd && this.zzc) {
            zzx zzx0 = this.zzb.zzb();
            this.zzb = new zzv();
            this.zzc = false;
            zzdl0.zza(this.zza, zzx0);
        }
    }

    public final void zzc(zzdl zzdl0) {
        this.zzd = true;
        if(this.zzc) {
            this.zzc = false;
            zzx zzx0 = this.zzb.zzb();
            zzdl0.zza(this.zza, zzx0);
        }
    }
}

