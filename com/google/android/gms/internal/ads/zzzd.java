package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class zzzd {
    private static final Comparator zza;
    private static final Comparator zzb;
    private final ArrayList zzc;
    private final zzzb[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzzd.zza = new zzyz();
        zzzd.zzb = new zzza();
    }

    public zzzd(int v) {
        this.zzd = new zzzb[5];
        this.zzc = new ArrayList();
        this.zze = -1;
    }

    public final float zza(float f) {
        if(this.zze != 0) {
            Collections.sort(this.zzc, zzzd.zzb);
            this.zze = 0;
        }
        float f1 = (float)this.zzg;
        int v1 = 0;
        for(int v = 0; v < this.zzc.size(); ++v) {
            zzzb zzzb0 = (zzzb)this.zzc.get(v);
            v1 += zzzb0.zzb;
            if(((float)v1) >= 0.5f * f1) {
                return zzzb0.zzc;
            }
        }
        return this.zzc.isEmpty() ? NaNf : ((zzzb)this.zzc.get(this.zzc.size() - 1)).zzc;
    }

    public final void zzb(int v, float f) {
        zzzb zzzb0;
        if(this.zze != 1) {
            Collections.sort(this.zzc, zzzd.zza);
            this.zze = 1;
        }
        int v1 = this.zzh;
        if(v1 > 0) {
            this.zzh = v1 - 1;
            zzzb0 = this.zzd[v1 - 1];
        }
        else {
            zzzb0 = new zzzb(null);
        }
        int v2 = this.zzf;
        this.zzf = v2 + 1;
        zzzb0.zza = v2;
        zzzb0.zzb = v;
        zzzb0.zzc = f;
        this.zzc.add(zzzb0);
        this.zzg += v;
        int v3;
        while((v3 = this.zzg) > 2000) {
            zzzb zzzb1 = (zzzb)this.zzc.get(0);
            int v4 = zzzb1.zzb;
            if(v4 <= v3 - 2000) {
                this.zzg -= v4;
                this.zzc.remove(0);
                int v5 = this.zzh;
                if(v5 >= 5) {
                    continue;
                }
                this.zzh = v5 + 1;
                this.zzd[v5] = zzzb1;
            }
            else {
                zzzb1.zzb = v4 - (v3 - 2000);
                this.zzg -= v3 - 2000;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}

