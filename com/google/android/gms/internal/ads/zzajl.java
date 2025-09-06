package com.google.android.gms.internal.ads;

import h4.e;
import java.io.IOException;
import java.util.List;

public final class zzajl implements zzacn {
    private zzacq zza;
    private zzajt zzb;
    private boolean zzc;

    @e(expression = {"streamReader"}, result = true)
    private final boolean zza(zzaco zzaco0) throws IOException {
        zzajn zzajn0 = new zzajn();
        if(zzajn0.zzb(zzaco0, true) && (zzajn0.zza & 2) == 2) {
            int v = Math.min(zzajn0.zze, 8);
            zzdy zzdy0 = new zzdy(v);
            zzaco0.zzh(zzdy0.zzN(), 0, v);
            zzdy0.zzL(0);
            if(zzdy0.zzb() >= 5 && zzdy0.zzm() == 0x7F && zzdy0.zzu() == 1179402563L) {
                this.zzb = new zzajk();
                return true;
            }
            zzdy0.zzL(0);
            try {
                if(zzadz.zzd(1, zzdy0, true)) {
                    this.zzb = new zzajv();
                    return true;
                }
            }
            catch(zzbc unused_ex) {
            }
            zzdy0.zzL(0);
            if(zzajp.zzd(zzdy0)) {
                this.zzb = new zzajp();
                return true;
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        zzcw.zzb(this.zza);
        if(this.zzb == null) {
            if(!this.zza(zzaco0)) {
                throw zzbc.zza("Failed to determine bitstream type", null);
            }
            zzaco0.zzj();
        }
        if(!this.zzc) {
            zzadt zzadt0 = this.zza.zzw(0, 1);
            this.zza.zzD();
            this.zzb.zzh(this.zza, zzadt0);
            this.zzc = true;
        }
        return this.zzb.zze(zzaco0, zzadj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final zzacn zzc() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final List zzd() {
        return zzfxn.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacq0) {
        this.zza = zzacq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        zzajt zzajt0 = this.zzb;
        if(zzajt0 != null) {
            zzajt0.zzj(v, v1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        try {
            return this.zza(zzaco0);
        }
        catch(zzbc unused_ex) {
            return false;
        }
    }
}

