package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

public final class zzbh {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    zzbh(zzbf zzbf0, zzbg zzbg0) {
        int v = zzbf0.zzb.size();
        this.zza = (String[])zzbf0.zza.toArray(new String[v]);
        this.zzb = zzbh.zzc(zzbf0.zzb);
        this.zzc = zzbh.zzc(zzbf0.zzc);
        this.zzd = new int[v];
        this.zze = 0;
    }

    public final List zza() {
        List list0 = new ArrayList(this.zza.length);
        for(int v = 0; true; ++v) {
            String[] arr_s = this.zza;
            if(v >= arr_s.length) {
                break;
            }
            String s = arr_s[v];
            double f = this.zzc[v];
            double f1 = this.zzb[v];
            int v1 = this.zzd[v];
            list0.add(new zzbe(s, f, f1, ((double)v1) / ((double)this.zze), v1));
        }
        return list0;
    }

    public final void zzb(double f) {
        ++this.zze;
        for(int v = 0; true; ++v) {
            double[] arr_f = this.zzc;
            if(v >= arr_f.length) {
                break;
            }
            double f1 = arr_f[v];
            if(f1 <= f && f < this.zzb[v]) {
                ++this.zzd[v];
            }
            if(f < f1) {
                break;
            }
        }
    }

    private static final double[] zzc(List list0) {
        int v = list0.size();
        double[] arr_f = new double[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_f[v1] = (double)(((Double)list0.get(v1)));
        }
        return arr_f;
    }
}

