package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

public final class zzbf {
    private final List zza;
    private final List zzb;
    private final List zzc;

    public zzbf() {
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    public final zzbf zza(String s, double f, double f1) {
        int v;
        for(v = 0; v < this.zza.size(); ++v) {
            double f2 = (double)(((Double)this.zzc.get(v)));
            if(f < f2 || f2 == f && f1 < ((double)(((Double)this.zzb.get(v))))) {
                break;
            }
        }
        this.zza.add(v, s);
        this.zzc.add(v, f);
        this.zzb.add(v, f1);
        return this;
    }

    public final zzbh zzb() {
        return new zzbh(this, null);
    }
}

