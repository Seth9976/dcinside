package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

final class zztw implements zzfy {
    private final zzfy zza;
    private final int zzb;
    private final zztv zzc;
    private final byte[] zzd;
    private int zze;

    public zztw(zzfy zzfy0, int v, zztv zztv0) {
        zzcw.zzd(v > 0);
        this.zza = zzfy0;
        this.zzb = v;
        this.zzc = zztv0;
        this.zzd = new byte[1];
        this.zze = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] arr_b, int v, int v1) throws IOException {
        int v2 = 0;
        int v3 = this.zze;
        if(v3 == 0) {
            if(this.zza.zza(this.zzd, 0, 1) != -1) {
                int v4 = (this.zzd[0] & 0xFF) << 4;
                if(v4 != 0) {
                    byte[] arr_b1 = new byte[v4];
                    for(int v5 = v4; v5 > 0; v5 -= v6) {
                        int v6 = this.zza.zza(arr_b1, v2, v5);
                        if(v6 == -1) {
                            return -1;
                        }
                        v2 += v6;
                    }
                    while(v4 > 0 && arr_b1[v4 - 1] == 0) {
                        --v4;
                    }
                    if(v4 > 0) {
                        zzdy zzdy0 = new zzdy(arr_b1, v4);
                        this.zzc.zza(zzdy0);
                    }
                }
                v3 = this.zzb;
                this.zze = v3;
                goto label_24;
            }
            return -1;
        }
    label_24:
        int v7 = this.zza.zza(arr_b, v, Math.min(v3, v1));
        if(v7 != -1) {
            this.zze -= v7;
        }
        return v7;
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgd0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        return this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgy0) {
        zzgy0.getClass();
        this.zza.zzf(zzgy0);
    }
}

