package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzcwl extends zzdbj {
    private boolean zzb;

    public zzcwl(Set set0) {
        super(set0);
        this.zzb = false;
    }

    public final void zza() {
        synchronized(this) {
            if(!this.zzb) {
                this.zzq(new zzcwk());
                this.zzb = true;
            }
        }
    }
}

