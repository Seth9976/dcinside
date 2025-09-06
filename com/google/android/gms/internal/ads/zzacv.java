package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

public final class zzacv {
    @Nullable
    public static zzay zza(zzaco zzaco0, boolean z) throws IOException {
        zzay zzay0 = new zzadd().zza(zzaco0, (z ? null : zzagg.zza));
        return zzay0 == null || zzay0.zza() == 0 ? null : zzay0;
    }

    public static zzacx zzb(zzdy zzdy0) {
        zzdy0.zzM(1);
        int v = zzdy0.zzo();
        long v1 = (long)zzdy0.zzd();
        long[] arr_v = new long[v / 18];
        long[] arr_v1 = new long[v / 18];
        for(int v2 = 0; v2 < v / 18; ++v2) {
            long v3 = zzdy0.zzt();
            if(v3 == -1L) {
                arr_v = Arrays.copyOf(arr_v, v2);
                arr_v1 = Arrays.copyOf(arr_v1, v2);
                break;
            }
            arr_v[v2] = v3;
            arr_v1[v2] = zzdy0.zzt();
            zzdy0.zzM(2);
        }
        zzdy0.zzM(((int)(v1 + ((long)v) - ((long)zzdy0.zzd()))));
        return new zzacx(arr_v, arr_v1);
    }
}

