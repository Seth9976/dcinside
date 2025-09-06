package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzden extends zzdbj {
    private boolean zzb;

    protected zzden(Set set0) {
        super(set0);
    }

    public final void zza() {
        this.zzq(new zzdek());
    }

    public final void zzb() {
        this.zzq(new zzdej());
    }

    public final void zzc() {
        synchronized(this) {
            if(!this.zzb) {
                this.zzq(new zzdel());
                this.zzb = true;
            }
            this.zzq(new zzdem());
        }
    }

    public final void zzd() {
        synchronized(this) {
            this.zzq(new zzdel());
            this.zzb = true;
        }
    }
}

