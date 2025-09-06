package com.google.android.gms.internal.ads;

public final class zzafg implements zzacq {
    private final long zzb;
    private final zzacq zzc;

    public zzafg(long v, zzacq zzacq0) {
        this.zzb = v;
        this.zzc = zzacq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacq
    public final void zzD() {
        this.zzc.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzacq
    public final void zzO(zzadm zzadm0) {
        zzaff zzaff0 = new zzaff(this, zzadm0, zzadm0);
        this.zzc.zzO(zzaff0);
    }

    @Override  // com.google.android.gms.internal.ads.zzacq
    public final zzadt zzw(int v, int v1) {
        return this.zzc.zzw(v, v1);
    }
}

