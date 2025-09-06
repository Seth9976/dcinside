package com.google.android.gms.internal.ads;

import h4.e;
import java.util.Arrays;
import java.util.List;

final class zzajp extends zzajt {
    private static final byte[] zza;
    private static final byte[] zzb;
    private boolean zzc;

    static {
        zzajp.zza = new byte[]{0x4F, 0x70, 0x75, 0x73, 72, 101, 97, 100};
        zzajp.zzb = new byte[]{0x4F, 0x70, 0x75, 0x73, 84, 97, 103, 0x73};
    }

    @Override  // com.google.android.gms.internal.ads.zzajt
    protected final long zza(zzdy zzdy0) {
        return this.zzg(zzadi.zzd(zzdy0.zzN()));
    }

    @Override  // com.google.android.gms.internal.ads.zzajt
    protected final void zzb(boolean z) {
        super.zzb(z);
        if(z) {
            this.zzc = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzajt
    @e(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzdy zzdy0, long v, zzajq zzajq0) throws zzbc {
        if(zzajp.zzk(zzdy0, zzajp.zza)) {
            byte[] arr_b = Arrays.copyOf(zzdy0.zzN(), zzdy0.zze());
            int v1 = arr_b[9] & 0xFF;
            List list0 = zzadi.zze(arr_b);
            if(zzajq0.zza != null) {
                return true;
            }
            zzz zzz0 = new zzz();
            zzz0.zzaa("audio/opus");
            zzz0.zzz(v1);
            zzz0.zzab(48000);
            zzz0.zzN(list0);
            zzajq0.zza = zzz0.zzag();
            return true;
        }
        if(zzajp.zzk(zzdy0, zzajp.zzb)) {
            zzcw.zzb(zzajq0.zza);
            if(!this.zzc) {
                this.zzc = true;
                zzdy0.zzM(8);
                zzay zzay0 = zzadz.zzb(zzfxn.zzm(zzadz.zzc(zzdy0, false, false).zza));
                if(zzay0 != null) {
                    zzz zzz1 = zzajq0.zza.zzb();
                    zzz1.zzT(zzay0.zzd(zzajq0.zza.zzl));
                    zzajq0.zza = zzz1.zzag();
                }
            }
            return true;
        }
        zzcw.zzb(zzajq0.zza);
        return false;
    }

    public static boolean zzd(zzdy zzdy0) {
        return zzajp.zzk(zzdy0, zzajp.zza);
    }

    private static boolean zzk(zzdy zzdy0, byte[] arr_b) {
        if(zzdy0.zzb() < 8) {
            return false;
        }
        byte[] arr_b1 = new byte[8];
        zzdy0.zzH(arr_b1, 0, 8);
        zzdy0.zzL(zzdy0.zzd());
        return Arrays.equals(arr_b1, arr_b);
    }
}

