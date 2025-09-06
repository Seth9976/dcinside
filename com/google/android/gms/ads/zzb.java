package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.internal.ads.zzbpa;

public final class zzb {
    private static volatile zzci zza;

    public static zzci zza(Context context0) {
        if(zzb.zza == null) {
            Class class0 = zzb.class;
            synchronized(class0) {
                if(zzb.zza == null) {
                    zzb.zza = zzbc.zza().zzg(context0.getApplicationContext(), new zzbpa());
                }
            }
        }
        return zzb.zza;
    }
}

