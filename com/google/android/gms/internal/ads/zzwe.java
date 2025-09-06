package com.google.android.gms.internal.ads;

import android.util.SparseArray;

final class zzwe {
    private int zza;
    private final SparseArray zzb;
    private final zzdb zzc;

    public zzwe() {
        this(new zzwd());
    }

    public zzwe(zzdb zzdb0) {
        this.zzb = new SparseArray();
        this.zzc = zzdb0;
        this.zza = -1;
    }

    public final Object zza(int v) {
        int v1;
        if(this.zza == -1) {
            v1 = 0;
            this.zza = v1;
        }
        while(this.zza > 0 && v < this.zzb.keyAt(this.zza)) {
            v1 = this.zza - 1;
            this.zza = v1;
        }
        while(this.zza < this.zzb.size() - 1 && v >= this.zzb.keyAt(this.zza + 1)) {
            ++this.zza;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int v, Object object0) {
        boolean z = true;
        if(this.zza == -1) {
            zzcw.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if(this.zzb.size() > 0) {
            int v1 = this.zzb.keyAt(this.zzb.size() - 1);
            if(v < v1) {
                z = false;
            }
            zzcw.zzd(z);
            if(v1 == v) {
                Object object1 = this.zzb.valueAt(this.zzb.size() - 1);
                this.zzc.zza(object1);
            }
        }
        this.zzb.append(v, object0);
    }

    public final void zzd() {
        for(int v = 0; v < this.zzb.size(); ++v) {
            Object object0 = this.zzb.valueAt(v);
            this.zzc.zza(object0);
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int v) {
        for(int v1 = 0; v1 < this.zzb.size() - 1 && v >= this.zzb.keyAt(v1 + 1); ++v1) {
            Object object0 = this.zzb.valueAt(v1);
            this.zzc.zza(object0);
            this.zzb.removeAt(v1);
            int v2 = this.zza;
            if(v2 > 0) {
                this.zza = v2 - 1;
            }
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }
}

