package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

public final class zzadu {
    private final byte[] zza;
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public zzadu() {
        this.zza = new byte[10];
    }

    public final void zza(zzadt zzadt0, @Nullable zzads zzads0) {
        if(this.zzc > 0) {
            zzadt0.zzt(this.zzd, this.zze, this.zzf, this.zzg, zzads0);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzadt zzadt0, long v, int v1, int v2, int v3, @Nullable zzads zzads0) {
        zzcw.zzg(this.zzg <= v2 + v3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if(this.zzb) {
            int v4 = this.zzc;
            this.zzc = v4 + 1;
            if(v4 == 0) {
                this.zzd = v;
                this.zze = v1;
                this.zzf = 0;
            }
            this.zzf += v2;
            this.zzg = v3;
            if(v4 + 1 >= 16) {
                this.zza(zzadt0, zzads0);
            }
        }
    }

    public final void zzd(zzaco zzaco0) throws IOException {
        if(!this.zzb) {
            zzaco0.zzh(this.zza, 0, 10);
            zzaco0.zzj();
            if(this.zza[4] == -8 && this.zza[5] == 0x72 && this.zza[6] == 0x6F && (this.zza[7] & 0xFE) == 0xBA) {
                this.zzb = true;
            }
        }
    }
}

