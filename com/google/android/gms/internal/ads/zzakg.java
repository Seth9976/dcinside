package com.google.android.gms.internal.ads;

import android.util.SparseArray;

public final class zzakg implements zzacq {
    private final zzacq zzb;
    private final zzakd zzc;
    private final SparseArray zzd;

    public zzakg(zzacq zzacq0, zzakd zzakd0) {
        this.zzb = zzacq0;
        this.zzc = zzakd0;
        this.zzd = new SparseArray();
    }

    @Override  // com.google.android.gms.internal.ads.zzacq
    public final void zzD() {
        this.zzb.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzacq
    public final void zzO(zzadm zzadm0) {
        this.zzb.zzO(zzadm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzacq
    public final zzadt zzw(int v, int v1) {
        if(v1 != 3) {
            return this.zzb.zzw(v, v1);
        }
        zzadt zzadt0 = (zzaki)this.zzd.get(v);
        if(zzadt0 != null) {
            return zzadt0;
        }
        zzadt zzadt1 = new zzaki(this.zzb.zzw(v, 3), this.zzc);
        this.zzd.put(v, zzadt1);
        return zzadt1;
    }
}

