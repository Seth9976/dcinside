package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

public final class zzadd {
    private final zzdy zza;

    public zzadd() {
        this.zza = new zzdy(10);
    }

    @Nullable
    public final zzay zza(zzaco zzaco0, @Nullable zzage zzage0) throws IOException {
        zzay zzay0 = null;
        int v;
        for(v = 0; true; v += v2) {
            try {
                zzaco0.zzh(this.zza.zzN(), 0, 10);
            }
            catch(EOFException unused_ex) {
                break;
            }
            this.zza.zzL(0);
            if(this.zza.zzo() != 4801587) {
                break;
            }
            this.zza.zzM(3);
            int v1 = this.zza.zzl();
            int v2 = v1 + 10;
            if(zzay0 == null) {
                byte[] arr_b = new byte[v2];
                System.arraycopy(this.zza.zzN(), 0, arr_b, 0, 10);
                zzaco0.zzh(arr_b, 10, v1);
                zzay0 = zzagg.zza(arr_b, v2, zzage0, new zzafi());
            }
            else {
                zzaco0.zzg(v1);
            }
        }
        zzaco0.zzj();
        zzaco0.zzg(v);
        return zzay0;
    }
}

