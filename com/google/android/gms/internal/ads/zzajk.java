package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import h4.e;
import java.util.Arrays;

final class zzajk extends zzajt {
    @Nullable
    private zzacy zza;
    @Nullable
    private zzajj zzb;

    @Override  // com.google.android.gms.internal.ads.zzajt
    protected final long zza(zzdy zzdy0) {
        if(zzajk.zzd(zzdy0.zzN())) {
            int v = (zzdy0.zzN()[2] & 0xFF) >> 4;
            switch(v) {
                case 6: {
                    zzdy0.zzM(4);
                    zzdy0.zzx();
                    break;
                }
                case 7: {
                    v = 7;
                    zzdy0.zzM(4);
                    zzdy0.zzx();
                }
            }
            int v1 = zzacu.zza(zzdy0, v);
            zzdy0.zzL(0);
            return (long)v1;
        }
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzajt
    protected final void zzb(boolean z) {
        super.zzb(z);
        if(z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzajt
    @e(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzdy zzdy0, long v, zzajq zzajq0) {
        byte[] arr_b = zzdy0.zzN();
        zzacy zzacy0 = this.zza;
        if(zzacy0 == null) {
            zzacy zzacy1 = new zzacy(arr_b, 17);
            this.zza = zzacy1;
            zzajq0.zza = zzacy1.zzc(Arrays.copyOfRange(arr_b, 9, zzdy0.zze()), null);
            return true;
        }
        if((arr_b[0] & 0x7F) == 3) {
            zzacx zzacx0 = zzacv.zzb(zzdy0);
            zzacy zzacy2 = zzacy0.zzf(zzacx0);
            this.zza = zzacy2;
            this.zzb = new zzajj(zzacy2, zzacx0);
            return true;
        }
        if(zzajk.zzd(arr_b)) {
            zzajj zzajj0 = this.zzb;
            if(zzajj0 != null) {
                zzajj0.zza(v);
                zzajq0.zzb = this.zzb;
            }
            zzajq0.zza.getClass();
            return false;
        }
        return true;
    }

    private static boolean zzd(byte[] arr_b) {
        return arr_b[0] == -1;
    }
}

