package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class zzen extends zzeq {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzen(int v, long v1) {
        super(v, null);
        this.zza = v1;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final String toString() {
        String s = Arrays.toString(this.zzb.toArray());
        String s1 = Arrays.toString(this.zzc.toArray());
        return zzeq.zze(this.zzd) + " leaves: " + s + " containers: " + s1;
    }

    @Nullable
    public final zzen zza(int v) {
        int v1 = this.zzc.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            zzen zzen0 = (zzen)this.zzc.get(v2);
            if(zzen0.zzd == v) {
                return zzen0;
            }
        }
        return null;
    }

    @Nullable
    public final zzeo zzb(int v) {
        int v1 = this.zzb.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            zzeo zzeo0 = (zzeo)this.zzb.get(v2);
            if(zzeo0.zzd == v) {
                return zzeo0;
            }
        }
        return null;
    }

    public final void zzc(zzen zzen0) {
        this.zzc.add(zzen0);
    }

    public final void zzd(zzeo zzeo0) {
        this.zzb.add(zzeo0);
    }
}

