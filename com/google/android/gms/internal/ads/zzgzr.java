package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

final class zzgzr {
    private final ArrayDeque zza;

    private zzgzr() {
        this.zza = new ArrayDeque();
    }

    zzgzr(zzgzt zzgzt0) {
        this.zza = new ArrayDeque();
    }

    static zzgwj zza(zzgzr zzgzr0, zzgwj zzgwj0, zzgwj zzgwj1) {
        zzgzr0.zzb(zzgwj0);
        zzgzr0.zzb(zzgwj1);
        zzgwj zzgwj2;
        for(zzgwj2 = (zzgwj)zzgzr0.zza.pop(); !zzgzr0.zza.isEmpty(); zzgwj2 = new zzgzu(((zzgwj)zzgzr0.zza.pop()), zzgwj2, null)) {
        }
        return zzgwj2;
    }

    private final void zzb(zzgwj zzgwj0) {
        if(zzgwj0.zzh()) {
            int v = zzgzr.zzc(zzgwj0.zzd());
            int v1 = zzgzu.zzc(v + 1);
            if(!this.zza.isEmpty() && ((zzgwj)this.zza.peek()).zzd() < v1) {
                int v2 = zzgzu.zzc(v);
                zzgwj zzgwj1;
                for(zzgwj1 = (zzgwj)this.zza.pop(); !this.zza.isEmpty() && ((zzgwj)this.zza.peek()).zzd() < v2; zzgwj1 = new zzgzu(((zzgwj)this.zza.pop()), zzgwj1, null)) {
                }
                zzgzu zzgzu0;
                for(zzgzu0 = new zzgzu(zzgwj1, zzgwj0, null); !this.zza.isEmpty(); zzgzu0 = new zzgzu(((zzgwj)this.zza.pop()), zzgzu0, null)) {
                    int v3 = zzgzu.zzc(zzgzr.zzc(zzgzu0.zzd()) + 1);
                    if(((zzgwj)this.zza.peek()).zzd() >= v3) {
                        break;
                    }
                }
                this.zza.push(zzgzu0);
                return;
            }
            this.zza.push(zzgwj0);
            return;
        }
        if(!(zzgwj0 instanceof zzgzu)) {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + zzgwj0.getClass());
        }
        this.zzb(((zzgzu)zzgwj0).zzd);
        this.zzb(((zzgzu)zzgwj0).zze);
    }

    private static final int zzc(int v) {
        int v1 = Arrays.binarySearch(zzgzu.zza, v);
        return v1 >= 0 ? v1 : -(v1 + 1) - 1;
    }
}

