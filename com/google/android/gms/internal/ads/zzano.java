package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzano implements zzabx {
    private final zzef zza;
    private final zzdy zzb;
    private final int zzc;

    public zzano(int v, zzef zzef0, int v1) {
        this.zzc = v;
        this.zza = zzef0;
        this.zzb = new zzdy();
    }

    @Override  // com.google.android.gms.internal.ads.zzabx
    public final zzabw zza(zzaco zzaco0, long v) throws IOException {
        long v1 = zzaco0.zzf();
        int v2 = (int)Math.min(112800L, zzaco0.zzd() - v1);
        this.zzb.zzI(v2);
        zzaco0.zzh(this.zzb.zzN(), 0, v2);
        zzdy zzdy0 = this.zzb;
        int v3 = zzdy0.zze();
        long v4 = -1L;
        long v5 = 0x8000000000000001L;
        long v6 = -1L;
        while(zzdy0.zzb() >= 0xBC) {
            int v7 = zzanz.zza(zzdy0.zzN(), zzdy0.zzd(), v3);
            if(v7 + 0xBC > v3) {
                break;
            }
            long v8 = zzanz.zzb(zzdy0, v7, this.zzc);
            if(v8 != 0x8000000000000001L) {
                long v9 = this.zza.zzb(v8);
                if(v9 > v) {
                    return v5 == 0x8000000000000001L ? zzabw.zzd(v9, v1) : zzabw.zze(v1 + v6);
                }
                v6 = (long)v7;
                if(v9 + 100000L <= v) {
                    v5 = v9;
                    goto label_22;
                }
                return zzabw.zze(v1 + v6);
            }
        label_22:
            zzdy0.zzL(v7 + 0xBC);
            v4 = (long)(v7 + 0xBC);
        }
        return v5 == 0x8000000000000001L ? zzabw.zza : zzabw.zzf(v5, v1 + v4);
    }

    @Override  // com.google.android.gms.internal.ads.zzabx
    public final void zzb() {
        this.zzb.zzJ(zzei.zzf, 0);
    }
}

