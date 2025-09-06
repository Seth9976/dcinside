package com.google.android.gms.internal.ads;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

public final class zzvp extends zztf implements zzvg {
    private final zzfx zza;
    private final zzrf zzb;
    private final int zzc;
    private boolean zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    @Nullable
    private zzgy zzh;
    @GuardedBy("this")
    private zzar zzi;
    private final zzvm zzj;
    private final zzyo zzk;

    zzvp(zzar zzar0, zzfx zzfx0, zzvm zzvm0, zzrf zzrf0, zzyo zzyo0, int v, boolean z, zzfvf zzfvf0, zzvo zzvo0) {
        this.zzi = zzar0;
        this.zza = zzfx0;
        this.zzj = zzvm0;
        this.zzb = zzrf0;
        this.zzk = zzyo0;
        this.zzc = v;
        this.zzd = true;
        this.zze = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzG(zzue zzue0) {
        ((zzvk)zzue0).zzN();
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final zzue zzI(zzug zzug0, zzyk zzyk0, long v) {
        zzfy zzfy0 = this.zza.zza();
        zzgy zzgy0 = this.zzh;
        if(zzgy0 != null) {
            zzfy0.zzf(zzgy0);
        }
        zzar zzar0 = this.zzJ();
        zzar0.zzb.getClass();
        this.zzb();
        zzti zzti0 = new zzti(this.zzj.zza);
        zzra zzra0 = this.zzc(zzug0);
        zzuq zzuq0 = this.zze(zzug0);
        return new zzvk(zzar0.zzb.zza, zzfy0, zzti0, this.zzb, zzra0, this.zzk, zzuq0, this, zzyk0, null, this.zzc, false, zzei.zzs(0x8000000000000001L), null);
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final zzar zzJ() {
        synchronized(this) {
        }
        return this.zzi;
    }

    @Override  // com.google.android.gms.internal.ads.zzvg
    public final void zza(long v, boolean z, boolean z1) {
        if(v == 0x8000000000000001L) {
            v = this.zze;
        }
        if(!this.zzd && this.zze == v && this.zzf == z && this.zzg == z1) {
            return;
        }
        this.zze = v;
        this.zzf = z;
        this.zzg = z1;
        this.zzd = false;
        this.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zztf
    protected final void zzn(@Nullable zzgy zzgy0) {
        this.zzh = zzgy0;
        Looper.myLooper().getClass();
        this.zzb();
        this.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zztf
    protected final void zzq() {
    }

    @Override  // com.google.android.gms.internal.ads.zztf
    public final void zzt(zzar zzar0) {
        synchronized(this) {
            this.zzi = zzar0;
        }
    }

    private final void zzw() {
        long v = this.zze;
        boolean z = this.zzf;
        boolean z1 = this.zzg;
        zzar zzar0 = this.zzJ();
        zzwc zzwc0 = new zzwc(0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, v, v, 0L, 0L, z, false, false, null, zzar0, (z1 ? zzar0.zzc : null));
        zzvl zzvl0 = this.zzd ? new zzvl(this, zzwc0) : zzwc0;
        this.zzo(zzvl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzui
    public final void zzz() {
    }
}

