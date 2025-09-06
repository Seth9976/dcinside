package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzazv implements Comparator {
    public zzazv(zzazw zzazw0) {
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(((zzazk)object0).zzd() >= ((zzazk)object1).zzd()) {
            if(((zzazk)object0).zzd() > ((zzazk)object1).zzd()) {
                return 1;
            }
            if(((zzazk)object0).zzb() >= ((zzazk)object1).zzb()) {
                if(((zzazk)object0).zzb() > ((zzazk)object1).zzb()) {
                    return 1;
                }
                float f = (((zzazk)object0).zza() - ((zzazk)object0).zzd()) * (((zzazk)object0).zzc() - ((zzazk)object0).zzb());
                float f1 = (((zzazk)object1).zza() - ((zzazk)object1).zzd()) * (((zzazk)object1).zzc() - ((zzazk)object1).zzb());
                if(f <= f1) {
                    return f < f1 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}

