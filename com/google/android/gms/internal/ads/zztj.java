package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zztj implements zzvy {
    public final zzvy zza;
    final zztk zzb;
    private boolean zzc;

    public zztj(zztk zztk0, zzvy zzvy0) {
        this.zzb = zztk0;
        super();
        this.zza = zzvy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final int zza(zzke zzke0, zzhh zzhh0, int v) {
        zztk zztk0 = this.zzb;
        if(zztk0.zzq()) {
            return -3;
        }
        if(this.zzc) {
            zzhh0.zzc(4);
            return -4;
        }
        long v1 = zztk0.zzb();
        int v2 = this.zza.zza(zzke0, zzhh0, v);
        if(v2 == -5) {
            zzab zzab0 = zzke0.zza;
            zzab0.getClass();
            int v3 = zzab0.zzG;
            int v4 = 0;
            if(v3 != 0) {
            label_16:
                if(this.zzb.zzb == 0x8000000000000000L) {
                    v4 = zzab0.zzH;
                }
                zzz zzz0 = zzab0.zzb();
                zzz0.zzG(v3);
                zzz0.zzH(v4);
                zzke0.zza = zzz0.zzag();
            }
            else if(zzab0.zzH != 0) {
                v3 = 0;
                goto label_16;
            }
            return -5;
        }
        long v5 = this.zzb.zzb;
        if(v5 != 0x8000000000000000L && (v2 == -4 && zzhh0.zze >= v5 || v2 == -3 && v1 == 0x8000000000000000L && !zzhh0.zzd)) {
            zzhh0.zzb();
            zzhh0.zzc(4);
            this.zzc = true;
            return -4;
        }
        return v2;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long v) {
        return this.zzb.zzq() ? -3 : this.zza.zzb(v);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}

