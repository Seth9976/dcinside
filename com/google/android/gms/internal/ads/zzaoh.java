package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

final class zzaoh {
    public static Pair zza(zzaco zzaco0) throws IOException {
        zzaco0.zzj();
        zzaog zzaog0 = zzaoh.zzd(1684108385, zzaco0, new zzdy(8));
        zzaco0.zzk(8);
        return Pair.create(zzaco0.zzf(), zzaog0.zzb);
    }

    public static zzaof zzb(zzaco zzaco0) throws IOException {
        byte[] arr_b;
        zzdy zzdy0 = new zzdy(16);
        zzaog zzaog0 = zzaoh.zzd(0x666D7420, zzaco0, zzdy0);
        zzcw.zzf(zzaog0.zzb >= 16L);
        zzaco0.zzh(zzdy0.zzN(), 0, 16);
        zzdy0.zzL(0);
        int v = zzdy0.zzk();
        int v1 = zzdy0.zzk();
        int v2 = zzdy0.zzj();
        int v3 = zzdy0.zzj();
        int v4 = zzdy0.zzk();
        int v5 = zzdy0.zzk();
        int v6 = ((int)zzaog0.zzb) - 16;
        if(v6 > 0) {
            arr_b = new byte[v6];
            zzaco0.zzh(arr_b, 0, v6);
        }
        else {
            arr_b = zzei.zzf;
        }
        zzaco0.zzk(((int)(zzaco0.zze() - zzaco0.zzf())));
        return new zzaof(v, v1, v2, v3, v4, v5, arr_b);
    }

    public static boolean zzc(zzaco zzaco0) throws IOException {
        zzdy zzdy0 = new zzdy(8);
        switch(zzaog.zza(zzaco0, zzdy0).zza) {
            case 1380333108: 
            case 1380533830: {
                zzaco0.zzh(zzdy0.zzN(), 0, 4);
                zzdy0.zzL(0);
                int v = zzdy0.zzg();
                if(v != 0x57415645) {
                    zzdo.zzc("WavHeaderReader", "Unsupported form type: " + v);
                    return false;
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private static zzaog zzd(int v, zzaco zzaco0, zzdy zzdy0) throws IOException {
        zzaog zzaog0 = zzaog.zza(zzaco0, zzdy0);
        int v1;
        while((v1 = zzaog0.zza) != v) {
            zzdo.zzf("WavHeaderReader", "Ignoring unknown WAV chunk: " + v1);
            long v2 = Long.compare(1L & zzaog0.zzb, 0L) == 0 ? zzaog0.zzb + 8L : zzaog0.zzb + 9L;
            if(v2 > 0x7FFFFFFFL) {
                throw zzbc.zzc(("Chunk is too large (~2GB+) to skip; id: " + zzaog0.zza));
            }
            zzaco0.zzk(((int)v2));
            zzaog0 = zzaog.zza(zzaco0, zzdy0);
        }
        return zzaog0;
    }
}

