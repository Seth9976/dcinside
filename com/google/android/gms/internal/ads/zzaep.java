package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzaep implements zzabx {
    private final zzacy zza;
    private final int zzb;
    private final zzact zzc;

    zzaep(zzacy zzacy0, int v, zzaeq zzaeq0) {
        this.zza = zzacy0;
        this.zzb = v;
        this.zzc = new zzact();
    }

    @Override  // com.google.android.gms.internal.ads.zzabx
    public final zzabw zza(zzaco zzaco0, long v) throws IOException {
        long v1 = zzaco0.zzf();
        long v2 = this.zzc(zzaco0);
        long v3 = zzaco0.zze();
        zzaco0.zzg(Math.max(6, this.zza.zzc));
        long v4 = this.zzc(zzaco0);
        long v5 = zzaco0.zze();
        if(Long.compare(v2, v) <= 0 && v4 > v) {
            return zzabw.zze(v3);
        }
        return v4 > v ? zzabw.zzd(v2, v1) : zzabw.zzf(v4, v5);
    }

    @Override  // com.google.android.gms.internal.ads.zzabx
    public final void zzb() {
    }

    private final long zzc(zzaco zzaco0) throws IOException {
        while(zzaco0.zze() < zzaco0.zzd() - 6L) {
            zzacy zzacy0 = this.zza;
            int v = this.zzb;
            zzact zzact0 = this.zzc;
            long v1 = zzaco0.zze();
            byte[] arr_b = new byte[2];
            zzaco0.zzh(arr_b, 0, 2);
            if(((arr_b[0] & 0xFF) << 8 | arr_b[1] & 0xFF) == v) {
                zzdy zzdy0 = new zzdy(16);
                System.arraycopy(arr_b, 0, zzdy0.zzN(), 0, 2);
                zzdy0.zzK(zzacr.zza(zzaco0, zzdy0.zzN(), 2, 14));
                zzaco0.zzj();
                zzaco0.zzg(((int)(v1 - zzaco0.zzf())));
                if(!zzacu.zzc(zzdy0, zzacy0, v, zzact0)) {
                    goto label_17;
                }
                break;
            }
            else {
                zzaco0.zzj();
                zzaco0.zzg(((int)(v1 - zzaco0.zzf())));
            }
        label_17:
            zzaco0.zzg(1);
        }
        if(zzaco0.zze() >= zzaco0.zzd() - 6L) {
            zzaco0.zzg(((int)(zzaco0.zzd() - zzaco0.zze())));
            return this.zza.zzj;
        }
        return this.zzc.zza;
    }
}

