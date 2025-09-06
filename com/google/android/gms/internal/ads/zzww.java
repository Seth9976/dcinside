package com.google.android.gms.internal.ads;

import android.graphics.Point;
import java.util.List;

public final class zzww implements zzxn {
    public final zzxh zza;
    public final String zzb;
    public final int[] zzc;

    public zzww(zzxh zzxh0, String s, int[] arr_v) {
        this.zza = zzxh0;
        this.zzb = s;
        this.zzc = arr_v;
    }

    @Override  // com.google.android.gms.internal.ads.zzxn
    public final List zza(int v, zzbr zzbr0, int[] arr_v) {
        int v4;
        int v10;
        int v9;
        zzxh zzxh0 = this.zza;
        int v1 = this.zzc[v];
        int v2 = zzxh0.zzi;
        int v3 = zzxh0.zzj;
        boolean z = zzxh0.zzk;
        if(v2 != 0x7FFFFFFF && v3 != 0x7FFFFFFF) {
            int v6 = 0x7FFFFFFF;
            for(int v5 = 0; v5 < zzbr0.zza; ++v5) {
                zzab zzab0 = zzbr0.zzb(v5);
                int v7 = zzab0.zzv;
                if(v7 > 0) {
                    int v8 = zzab0.zzw;
                    if(v8 > 0) {
                        if(!z || (v7 > v8 ? 1 : 0) == (v2 > v3 ? 1 : 0)) {
                            v10 = v2;
                            v9 = v3;
                        }
                        else {
                            v9 = v2;
                            v10 = v3;
                        }
                        int v11 = v7 * v9;
                        int v12 = v8 * v10;
                        Point point0 = v11 < v12 ? new Point((v11 + v8 - 1) / v8, v9) : new Point(v10, (v12 + v7 - 1) / v7);
                        int v13 = zzab0.zzv * zzab0.zzw;
                        if(zzab0.zzv >= ((int)(((float)point0.x) * 0.98f)) && zzab0.zzw >= ((int)(((float)point0.y) * 0.98f)) && v13 < v6) {
                            v6 = v13;
                        }
                    }
                }
            }
            v4 = v6;
        }
        else {
            v4 = 0x7FFFFFFF;
        }
        zzfxk zzfxk0 = new zzfxk();
        for(int v14 = 0; v14 < zzbr0.zza; ++v14) {
            int v15 = zzbr0.zzb(v14).zza();
            zzfxk0.zzf(new zzxr(v, zzbr0, v14, zzxh0, arr_v[v14], this.zzb, v1, v4 == 0x7FFFFFFF || v15 != -1 && v15 <= v4));
        }
        return zzfxk0.zzi();
    }
}

