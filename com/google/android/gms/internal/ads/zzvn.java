package com.google.android.gms.internal.ads;

public final class zzvn implements zzuf {
    private final zzfx zza;
    private int zzb;
    private final zzvm zzc;
    private final zzyo zzd;

    public zzvn(zzfx zzfx0, zzvm zzvm0) {
        zzyo zzyo0 = new zzyo(-1);
        super();
        this.zza = zzfx0;
        this.zzc = zzvm0;
        this.zzd = zzyo0;
        this.zzb = 0x100000;
    }

    public final zzvn zza(int v) {
        this.zzb = v;
        return this;
    }

    public final zzvp zzb(zzar zzar0) {
        zzar0.zzb.getClass();
        return new zzvp(zzar0, this.zza, this.zzc, zzrf.zza, this.zzd, this.zzb, false, null, null);
    }
}

